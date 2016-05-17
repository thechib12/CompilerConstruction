package pp.block3.cc.tabular;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;
import pp.block2.cc.antlr.SentenceParser;
import pp.block3.cc.symbol.DeclUseLexer;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Rogier on 09-05-16 in Enschede.
 */
public class HTMLWriter extends LatexBaseListener {
    private ParseTreeProperty<String> htmlTree;

    public static void main(String[] args) {
        FileReader file = null;
        try {
            file = new FileReader("src/main/java/pp/block3/cc/tabular/tabular-3.tex");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        CharStream chars = null;
        FileWriter writer = null;
        try {
            chars = new ANTLRInputStream(file);
            writer = new FileWriter("index.html");
        } catch (IOException e) {
            e.printStackTrace();
        }
        Lexer lexer = new LatexLexer(chars);
        HTMLWriter htmlwriter = new HTMLWriter();
        String html = htmlwriter.parseHTML(lexer);
        try {
            writer.write(html);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String parseHTML(Lexer lexer) {
        LatexParser parser = new LatexParser(new CommonTokenStream(lexer));
        MyErrorListener errorListener = new MyErrorListener();
        parser.removeErrorListeners();
        parser.addErrorListener(errorListener);
        ParseTree tree = parser.table();
        if (errorListener.getErrors().size() > 0) {
            return errorListener.getErrors().toString();
        }
        htmlTree = new ParseTreeProperty<>();
        new ParseTreeWalker().walk(this, tree);

        return val(tree);
    }

    @Override
    public void enterTable(LatexParser.TableContext ctx) {
        String result = "<html>\n" +
                "<body>\n" +
                "<table border=\"1\">\n";
        set(ctx, result);
    }

    @Override
    public void exitTable(LatexParser.TableContext ctx) {
        String result = val(ctx);
        for (LatexParser.RowsContext row : ctx.rows()) {
            result = result + val(row);
        }
        result = result + "</table>\n" +
                " </body>\n </html>";
        set(ctx, result);
    }

    @Override
    public void enterRows(LatexParser.RowsContext ctx) {
        String result = "<tr>\n";
        set(ctx, result);
    }

    @Override
    public void exitRows(LatexParser.RowsContext ctx) {
        String result = val(ctx);
        for (LatexParser.RowentryContext entry : ctx.rowentry()) {
            result = result + val(entry);
        }
        result = result + "</tr>\n";
        set(ctx, result);
    }

    @Override
    public void exitRowentry(LatexParser.RowentryContext ctx) {
        if (ctx.WORD() != null) {
            String result = "<td>" + ctx.WORD().getText() + "</td>\n";
            set(ctx, result);
        } else {
            String result = "<td>" + "</td>\n";
            set(ctx, result);
        }

    }

    private void set(ParseTree node, String text) {
        htmlTree.put(node, text);
    }

    public String val(ParseTree node) {
        return htmlTree.get(node);
    }
}