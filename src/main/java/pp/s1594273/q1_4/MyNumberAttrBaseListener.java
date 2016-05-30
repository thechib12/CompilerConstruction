package pp.s1594273.q1_4;

import org.antlr.v4.runtime.tree.ParseTreeProperty;

/**
 * Created by Christiaan on 20-05-16.
 */
public class MyNumberAttrBaseListener extends NumberAttrBaseListener {
    private ParseTreeProperty<Integer> parseTree;

    public MyNumberAttrBaseListener() {
        this.parseTree = new ParseTreeProperty<>();
    }

    public ParseTreeProperty<Integer> getParseTree() {
        return parseTree;
    }
}
