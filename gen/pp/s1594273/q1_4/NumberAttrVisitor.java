// Generated from D:/UTwente/Module 8/AntlrTest/src/main/java/pp/s1594273/q1_4\NumberAttr.g4 by ANTLR 4.5.1
package pp.s1594273.q1_4;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link NumberAttrParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface NumberAttrVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link NumberAttrParser#num}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum(NumberAttrParser.NumContext ctx);
	/**
	 * Visit a parse tree produced by {@link NumberAttrParser#seq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeq(NumberAttrParser.SeqContext ctx);
	/**
	 * Visit a parse tree produced by {@link NumberAttrParser#prf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrf(NumberAttrParser.PrfContext ctx);
	/**
	 * Visit a parse tree produced by {@link NumberAttrParser#dig}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDig(NumberAttrParser.DigContext ctx);
}