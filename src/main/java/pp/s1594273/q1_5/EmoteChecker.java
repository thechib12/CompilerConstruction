package pp.s1594273.q1_5;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Christiaan on 21-05-16.
 */
public class EmoteChecker extends EmoteBaseListener {


    private MySymbolTable<Integer> symbolTable;
    private List<String> errors;


    public void init() {
        symbolTable = new MySymbolTable<>();
        errors = new ArrayList<>();
    }


    @Override
    public void exitWordItem(EmoteParser.WordItemContext ctx) {
        String word = ctx.WORD().getText();

        if (!symbolTable.contains(word)) {
            symbolTable.setValue(word, 0);
        }

        int length = 0;
        if (ctx.EXCL() != null) {
            length = ctx.EXCL().getText().length();
        }

        int emotion = symbolTable.get(word);
        if (length != emotion) {
            errors.add(String.format("Wrong emotional intensity on line %s, pos %s", ctx.WORD().getSymbol().getLine(), ctx.WORD().getSymbol().getCharPositionInLine()));
        }
    }

    @Override
    public void enterTextItem(EmoteParser.TextItemContext ctx) {
        symbolTable.openScope();
    }

    @Override
    public void exitTextItem(EmoteParser.TextItemContext ctx) {
        symbolTable.closeScope();
    }

    @Override
    public void enterRaiseItem(EmoteParser.RaiseItemContext ctx) {
        super.enterRaiseItem(ctx);
    }


    @Override
    public void exitRaiseItem(EmoteParser.RaiseItemContext ctx) {
        String word = ctx.WORD().getText();
        int emotion;
        if (symbolTable.contains(word)) {
            emotion = symbolTable.get(word);
        } else {
            emotion = 0;
        }

        symbolTable.setValue(word, emotion + 1);
    }

    public MySymbolTable<Integer> getSymbolTable() {
        return symbolTable;
    }

    public void setSymbolTable(MySymbolTable<Integer> symbolTable) {
        this.symbolTable = symbolTable;
    }

    public List<String> getErrors() {
        return errors;
    }

    public void setErrors(List<String> errors) {
        this.errors = errors;
    }
}
