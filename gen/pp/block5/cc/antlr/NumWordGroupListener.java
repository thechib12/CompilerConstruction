// Generated from D:/UTwente/Module 8/AntlrTest/src/main/java/pp/block5/cc/antlr\NumWordGroup.g4 by ANTLR 4.5.1
package pp.block5.cc.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link NumWordGroupParser}.
 */
public interface NumWordGroupListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link NumWordGroupParser#sentence}.
	 * @param ctx the parse tree
	 */
	void enterSentence(NumWordGroupParser.SentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link NumWordGroupParser#sentence}.
	 * @param ctx the parse tree
	 */
	void exitSentence(NumWordGroupParser.SentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link NumWordGroupParser#group}.
	 * @param ctx the parse tree
	 */
	void enterGroup(NumWordGroupParser.GroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link NumWordGroupParser#group}.
	 * @param ctx the parse tree
	 */
	void exitGroup(NumWordGroupParser.GroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link NumWordGroupParser#penultimateGroup}.
	 * @param ctx the parse tree
	 */
	void enterPenultimateGroup(NumWordGroupParser.PenultimateGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link NumWordGroupParser#penultimateGroup}.
	 * @param ctx the parse tree
	 */
	void exitPenultimateGroup(NumWordGroupParser.PenultimateGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link NumWordGroupParser#lastGroup}.
	 * @param ctx the parse tree
	 */
	void enterLastGroup(NumWordGroupParser.LastGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link NumWordGroupParser#lastGroup}.
	 * @param ctx the parse tree
	 */
	void exitLastGroup(NumWordGroupParser.LastGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link NumWordGroupParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(NumWordGroupParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link NumWordGroupParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(NumWordGroupParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link NumWordGroupParser#word}.
	 * @param ctx the parse tree
	 */
	void enterWord(NumWordGroupParser.WordContext ctx);
	/**
	 * Exit a parse tree produced by {@link NumWordGroupParser#word}.
	 * @param ctx the parse tree
	 */
	void exitWord(NumWordGroupParser.WordContext ctx);
}