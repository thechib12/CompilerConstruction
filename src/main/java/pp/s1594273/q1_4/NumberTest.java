package pp.s1594273.q1_4;

import static org.junit.Assert.assertEquals;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.junit.Test;


public class NumberTest {

    private final ParseTreeWalker walker = new ParseTreeWalker();
    private final MyNumberBaseListener myNumberBaseListener = new MyNumberBaseListener();


    @Test
    public void hexTest() {
        test(5, "x5");
        test(256, "x100");
        test(273, "x111");
        test(11259375, "xABCDEF");

    }

    @Test
    public void binaryTest() {
        test(0, "b00000");
        test(1, "b1");
        test(16, "b10000");
        test(11259375, "b101010111100110111101111");

    }

    @Test
    public void decimalTest() {
        test(0, "0");
        test(1, "1");
        test(16, "16");
        test(11259375, "11259375");
    }

    private void test(int expected, String num) {
        assertEquals(expected, parseNumberAttr(num).val);
        ParseTree tree = parseCalc(num);
        this.myNumberBaseListener.init();
        this.walker.walk(this.myNumberBaseListener, tree);
        assertEquals(expected, this.myNumberBaseListener.getValue(tree));
    }

    private ParseTree parseCalc(String text) {
        CharStream chars = new ANTLRInputStream(text);
        Lexer lexer = new NumberLexer(chars);
        TokenStream tokens = new CommonTokenStream(lexer);
        NumberParser parser = new NumberParser(tokens);
        return parser.num();
    }

    private NumberAttrParser.NumContext parseNumberAttr(String text) {
        CharStream chars = new ANTLRInputStream(text);
        Lexer lexer = new NumberAttrLexer(chars);
        TokenStream tokens = new CommonTokenStream(lexer);
        NumberAttrParser parser = new NumberAttrParser(tokens);
        return parser.num();
    }


}
