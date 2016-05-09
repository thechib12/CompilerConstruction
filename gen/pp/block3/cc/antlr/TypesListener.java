// Generated from D:/UTwente/Module 8/AntlrTest/src/main/java/pp/block3/cc/antlr\Types.g4 by ANTLR 4.5.1
package pp.block3.cc.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TypesParser}.
 */
public interface TypesListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code par}
	 * labeled alternative in {@link TypesParser#type}.
	 * @param ctx the parse tree
	 */
	void enterPar(TypesParser.ParContext ctx);
	/**
	 * Exit a parse tree produced by the {@code par}
	 * labeled alternative in {@link TypesParser#type}.
	 * @param ctx the parse tree
	 */
	void exitPar(TypesParser.ParContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bool}
	 * labeled alternative in {@link TypesParser#type}.
	 * @param ctx the parse tree
	 */
	void enterBool(TypesParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bool}
	 * labeled alternative in {@link TypesParser#type}.
	 * @param ctx the parse tree
	 */
	void exitBool(TypesParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code string}
	 * labeled alternative in {@link TypesParser#type}.
	 * @param ctx the parse tree
	 */
	void enterString(TypesParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code string}
	 * labeled alternative in {@link TypesParser#type}.
	 * @param ctx the parse tree
	 */
	void exitString(TypesParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code num}
	 * labeled alternative in {@link TypesParser#type}.
	 * @param ctx the parse tree
	 */
	void enterNum(TypesParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code num}
	 * labeled alternative in {@link TypesParser#type}.
	 * @param ctx the parse tree
	 */
	void exitNum(TypesParser.NumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equals}
	 * labeled alternative in {@link TypesParser#type}.
	 * @param ctx the parse tree
	 */
	void enterEquals(TypesParser.EqualsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equals}
	 * labeled alternative in {@link TypesParser#type}.
	 * @param ctx the parse tree
	 */
	void exitEquals(TypesParser.EqualsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code hat}
	 * labeled alternative in {@link TypesParser#type}.
	 * @param ctx the parse tree
	 */
	void enterHat(TypesParser.HatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code hat}
	 * labeled alternative in {@link TypesParser#type}.
	 * @param ctx the parse tree
	 */
	void exitHat(TypesParser.HatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code plus}
	 * labeled alternative in {@link TypesParser#type}.
	 * @param ctx the parse tree
	 */
	void enterPlus(TypesParser.PlusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code plus}
	 * labeled alternative in {@link TypesParser#type}.
	 * @param ctx the parse tree
	 */
	void exitPlus(TypesParser.PlusContext ctx);
}