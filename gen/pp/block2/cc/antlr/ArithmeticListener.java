// Generated from D:/UTwente/Module 8/AntlrTest/src/main/java/pp/block2/cc/antlr\Arithmetic.g4 by ANTLR 4.5.1
package pp.block2.cc.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ArithmeticParser}.
 */
public interface ArithmeticListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ArithmeticParser#goal}.
	 * @param ctx the parse tree
	 */
	void enterGoal(ArithmeticParser.GoalContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithmeticParser#goal}.
	 * @param ctx the parse tree
	 */
	void exitGoal(ArithmeticParser.GoalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code minusrule}
	 * labeled alternative in {@link ArithmeticParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMinusrule(ArithmeticParser.MinusruleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code minusrule}
	 * labeled alternative in {@link ArithmeticParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMinusrule(ArithmeticParser.MinusruleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code plusrule}
	 * labeled alternative in {@link ArithmeticParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPlusrule(ArithmeticParser.PlusruleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code plusrule}
	 * labeled alternative in {@link ArithmeticParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPlusrule(ArithmeticParser.PlusruleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleruleexpr}
	 * labeled alternative in {@link ArithmeticParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSingleruleexpr(ArithmeticParser.SingleruleexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleruleexpr}
	 * labeled alternative in {@link ArithmeticParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSingleruleexpr(ArithmeticParser.SingleruleexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dividerule}
	 * labeled alternative in {@link ArithmeticParser#term}.
	 * @param ctx the parse tree
	 */
	void enterDividerule(ArithmeticParser.DivideruleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dividerule}
	 * labeled alternative in {@link ArithmeticParser#term}.
	 * @param ctx the parse tree
	 */
	void exitDividerule(ArithmeticParser.DivideruleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleruleterm}
	 * labeled alternative in {@link ArithmeticParser#term}.
	 * @param ctx the parse tree
	 */
	void enterSingleruleterm(ArithmeticParser.SingleruletermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleruleterm}
	 * labeled alternative in {@link ArithmeticParser#term}.
	 * @param ctx the parse tree
	 */
	void exitSingleruleterm(ArithmeticParser.SingleruletermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplyrule}
	 * labeled alternative in {@link ArithmeticParser#term}.
	 * @param ctx the parse tree
	 */
	void enterMultiplyrule(ArithmeticParser.MultiplyruleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplyrule}
	 * labeled alternative in {@link ArithmeticParser#term}.
	 * @param ctx the parse tree
	 */
	void exitMultiplyrule(ArithmeticParser.MultiplyruleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code powerrule}
	 * labeled alternative in {@link ArithmeticParser#exponent}.
	 * @param ctx the parse tree
	 */
	void enterPowerrule(ArithmeticParser.PowerruleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code powerrule}
	 * labeled alternative in {@link ArithmeticParser#exponent}.
	 * @param ctx the parse tree
	 */
	void exitPowerrule(ArithmeticParser.PowerruleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleruleexponent}
	 * labeled alternative in {@link ArithmeticParser#exponent}.
	 * @param ctx the parse tree
	 */
	void enterSingleruleexponent(ArithmeticParser.SingleruleexponentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleruleexponent}
	 * labeled alternative in {@link ArithmeticParser#exponent}.
	 * @param ctx the parse tree
	 */
	void exitSingleruleexponent(ArithmeticParser.SingleruleexponentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArithmeticParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(ArithmeticParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithmeticParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(ArithmeticParser.FactorContext ctx);
}