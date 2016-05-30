// Generated from D:/UTwente/Module 8/AntlrTest/src/main/java/pp/s1594273/q1_4\Number.g4 by ANTLR 4.5.1
package pp.s1594273.q1_4;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link NumberParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface NumberVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code prfnum}
	 * labeled alternative in {@link NumberParser#num}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrfnum(NumberParser.PrfnumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code seqnum}
	 * labeled alternative in {@link NumberParser#num}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeqnum(NumberParser.SeqnumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singledig}
	 * labeled alternative in {@link NumberParser#seq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingledig(NumberParser.SingledigContext ctx);
	/**
	 * Visit a parse tree produced by the {@code seqdig}
	 * labeled alternative in {@link NumberParser#seq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeqdig(NumberParser.SeqdigContext ctx);
	/**
	 * Visit a parse tree produced by the {@code hex}
	 * labeled alternative in {@link NumberParser#prf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHex(NumberParser.HexContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binary}
	 * labeled alternative in {@link NumberParser#prf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary(NumberParser.BinaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link NumberParser#dig}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDig(NumberParser.DigContext ctx);
}