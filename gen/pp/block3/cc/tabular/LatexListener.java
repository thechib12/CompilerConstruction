// Generated from D:/UTwente/Module 8/AntlrTest/src/main/java/pp/block3/cc/tabular\Latex.g4 by ANTLR 4.5.1
package pp.block3.cc.tabular;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LatexParser}.
 */
public interface LatexListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LatexParser#table}.
	 * @param ctx the parse tree
	 */
	void enterTable(LatexParser.TableContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatexParser#table}.
	 * @param ctx the parse tree
	 */
	void exitTable(LatexParser.TableContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatexParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(LatexParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatexParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(LatexParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatexParser#rows}.
	 * @param ctx the parse tree
	 */
	void enterRows(LatexParser.RowsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatexParser#rows}.
	 * @param ctx the parse tree
	 */
	void exitRows(LatexParser.RowsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LatexParser#rowentry}.
	 * @param ctx the parse tree
	 */
	void enterRowentry(LatexParser.RowentryContext ctx);
	/**
	 * Exit a parse tree produced by {@link LatexParser#rowentry}.
	 * @param ctx the parse tree
	 */
	void exitRowentry(LatexParser.RowentryContext ctx);
}