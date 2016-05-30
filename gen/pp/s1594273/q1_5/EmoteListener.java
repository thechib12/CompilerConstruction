// Generated from D:/UTwente/Module 8/AntlrTest/src/main/java/pp/s1594273/q1_5\Emote.g4 by ANTLR 4.5.1
package pp.s1594273.q1_5;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link EmoteParser}.
 */
public interface EmoteListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link EmoteParser#text}.
	 * @param ctx the parse tree
	 */
	void enterText(EmoteParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmoteParser#text}.
	 * @param ctx the parse tree
	 */
	void exitText(EmoteParser.TextContext ctx);
	/**
	 * Enter a parse tree produced by the {@code wordItem}
	 * labeled alternative in {@link EmoteParser#item}.
	 * @param ctx the parse tree
	 */
	void enterWordItem(EmoteParser.WordItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code wordItem}
	 * labeled alternative in {@link EmoteParser#item}.
	 * @param ctx the parse tree
	 */
	void exitWordItem(EmoteParser.WordItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code textItem}
	 * labeled alternative in {@link EmoteParser#item}.
	 * @param ctx the parse tree
	 */
	void enterTextItem(EmoteParser.TextItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code textItem}
	 * labeled alternative in {@link EmoteParser#item}.
	 * @param ctx the parse tree
	 */
	void exitTextItem(EmoteParser.TextItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code raiseItem}
	 * labeled alternative in {@link EmoteParser#item}.
	 * @param ctx the parse tree
	 */
	void enterRaiseItem(EmoteParser.RaiseItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code raiseItem}
	 * labeled alternative in {@link EmoteParser#item}.
	 * @param ctx the parse tree
	 */
	void exitRaiseItem(EmoteParser.RaiseItemContext ctx);
}