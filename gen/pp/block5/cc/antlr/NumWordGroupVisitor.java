// Generated from D:/UTwente/Module 8/AntlrTest/src/main/java/pp/block5/cc/antlr\NumWordGroup.g4 by ANTLR 4.5.1
package pp.block5.cc.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link NumWordGroupParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface NumWordGroupVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link NumWordGroupParser#sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentence(NumWordGroupParser.SentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link NumWordGroupParser#group}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroup(NumWordGroupParser.GroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link NumWordGroupParser#penultimateGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPenultimateGroup(NumWordGroupParser.PenultimateGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link NumWordGroupParser#lastGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLastGroup(NumWordGroupParser.LastGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link NumWordGroupParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(NumWordGroupParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link NumWordGroupParser#word}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWord(NumWordGroupParser.WordContext ctx);
}