// Generated from D:/UTwente/Module 8/AntlrTest/src/main/java/pp/block3/cc/tabular\Latex.g4 by ANTLR 4.5.1
package pp.block3.cc.tabular;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LatexParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LatexVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LatexParser#table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable(LatexParser.TableContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatexParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(LatexParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatexParser#rows}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRows(LatexParser.RowsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LatexParser#rowentry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowentry(LatexParser.RowentryContext ctx);
}