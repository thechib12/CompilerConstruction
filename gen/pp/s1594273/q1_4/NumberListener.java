// Generated from D:/UTwente/Module 8/AntlrTest/src/main/java/pp/s1594273/q1_4\Number.g4 by ANTLR 4.5.1
package pp.s1594273.q1_4;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link NumberParser}.
 */
public interface NumberListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code prfnum}
	 * labeled alternative in {@link NumberParser#num}.
	 * @param ctx the parse tree
	 */
	void enterPrfnum(NumberParser.PrfnumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code prfnum}
	 * labeled alternative in {@link NumberParser#num}.
	 * @param ctx the parse tree
	 */
	void exitPrfnum(NumberParser.PrfnumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code seqnum}
	 * labeled alternative in {@link NumberParser#num}.
	 * @param ctx the parse tree
	 */
	void enterSeqnum(NumberParser.SeqnumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code seqnum}
	 * labeled alternative in {@link NumberParser#num}.
	 * @param ctx the parse tree
	 */
	void exitSeqnum(NumberParser.SeqnumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singledig}
	 * labeled alternative in {@link NumberParser#seq}.
	 * @param ctx the parse tree
	 */
	void enterSingledig(NumberParser.SingledigContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singledig}
	 * labeled alternative in {@link NumberParser#seq}.
	 * @param ctx the parse tree
	 */
	void exitSingledig(NumberParser.SingledigContext ctx);
	/**
	 * Enter a parse tree produced by the {@code seqdig}
	 * labeled alternative in {@link NumberParser#seq}.
	 * @param ctx the parse tree
	 */
	void enterSeqdig(NumberParser.SeqdigContext ctx);
	/**
	 * Exit a parse tree produced by the {@code seqdig}
	 * labeled alternative in {@link NumberParser#seq}.
	 * @param ctx the parse tree
	 */
	void exitSeqdig(NumberParser.SeqdigContext ctx);
	/**
	 * Enter a parse tree produced by the {@code hex}
	 * labeled alternative in {@link NumberParser#prf}.
	 * @param ctx the parse tree
	 */
	void enterHex(NumberParser.HexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code hex}
	 * labeled alternative in {@link NumberParser#prf}.
	 * @param ctx the parse tree
	 */
	void exitHex(NumberParser.HexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binary}
	 * labeled alternative in {@link NumberParser#prf}.
	 * @param ctx the parse tree
	 */
	void enterBinary(NumberParser.BinaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binary}
	 * labeled alternative in {@link NumberParser#prf}.
	 * @param ctx the parse tree
	 */
	void exitBinary(NumberParser.BinaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link NumberParser#dig}.
	 * @param ctx the parse tree
	 */
	void enterDig(NumberParser.DigContext ctx);
	/**
	 * Exit a parse tree produced by {@link NumberParser#dig}.
	 * @param ctx the parse tree
	 */
	void exitDig(NumberParser.DigContext ctx);
}