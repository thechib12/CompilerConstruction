// Generated from D:/UTwente/Module 8/AntlrTest/src/main/java/pp/s1594273/q1_4\NumberAttr.g4 by ANTLR 4.5.1
package pp.s1594273.q1_4;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link NumberAttrParser}.
 */
public interface NumberAttrListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link NumberAttrParser#num}.
	 * @param ctx the parse tree
	 */
	void enterNum(NumberAttrParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by {@link NumberAttrParser#num}.
	 * @param ctx the parse tree
	 */
	void exitNum(NumberAttrParser.NumContext ctx);
	/**
	 * Enter a parse tree produced by {@link NumberAttrParser#seq}.
	 * @param ctx the parse tree
	 */
	void enterSeq(NumberAttrParser.SeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link NumberAttrParser#seq}.
	 * @param ctx the parse tree
	 */
	void exitSeq(NumberAttrParser.SeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link NumberAttrParser#prf}.
	 * @param ctx the parse tree
	 */
	void enterPrf(NumberAttrParser.PrfContext ctx);
	/**
	 * Exit a parse tree produced by {@link NumberAttrParser#prf}.
	 * @param ctx the parse tree
	 */
	void exitPrf(NumberAttrParser.PrfContext ctx);
	/**
	 * Enter a parse tree produced by {@link NumberAttrParser#dig}.
	 * @param ctx the parse tree
	 */
	void enterDig(NumberAttrParser.DigContext ctx);
	/**
	 * Exit a parse tree produced by {@link NumberAttrParser#dig}.
	 * @param ctx the parse tree
	 */
	void exitDig(NumberAttrParser.DigContext ctx);
}