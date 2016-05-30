package pp.s1594273.q1_4;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

/**
 * Created by Christiaan on 20-05-16.
 */
public class MyNumberBaseListener extends NumberBaseListener {

    private int intBase;
    private ParseTreeProperty<Integer> values;
    private ParseTreeProperty<Integer> positions;


    public void init() {
        this.intBase = 10;
        this.values = new ParseTreeProperty<>();
        this.positions = new ParseTreeProperty<>();
    }

    @Override
    public void exitHex(NumberParser.HexContext ctx) {
        intBase = 16;
    }


    @Override
    public void exitBinary(NumberParser.BinaryContext ctx) {
        intBase = 2;
    }

    @Override
    public void exitPrfnum(NumberParser.PrfnumContext ctx) {
        setValue(ctx, getValue(ctx.seq()));
    }


    @Override
    public void exitSeqnum(NumberParser.SeqnumContext ctx) {
        setValue(ctx, getValue(ctx.seq()));
    }

    @Override
    public void exitSeqdig(NumberParser.SeqdigContext ctx) {
        setPosition(ctx, getPosition(ctx.seq()) + 1);
        setValue(ctx, getValue(ctx.dig()) * (int) Math.pow(intBase, getPosition(ctx)) + getValue(ctx.seq()));

    }

    @Override
    public void exitSingledig(NumberParser.SingledigContext ctx) {
        setPosition(ctx, 0);
        setValue(ctx, getValue(ctx.dig()));
    }

    @Override
    public void exitDig(NumberParser.DigContext ctx) {
        int value = Integer.parseInt(ctx.DIGIT().getText(), intBase);
        setValue(ctx, value);
    }

    private void setPosition(ParseTree node, int position) {
        this.positions.put(node, position);
    }

    private void setValue(ParseTree node, int value) {
        this.values.put(node, value);
    }

    private int getPosition(ParseTree node) {
        return this.positions.get(node);
    }

    public int getValue(ParseTree node) {
        return this.values.get(node);
    }
}
