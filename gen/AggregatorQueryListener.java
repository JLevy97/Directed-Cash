// Generated from E:/Directed Cash\AggregatorQuery.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AggregatorQueryParser}.
 */
public interface AggregatorQueryListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AggregatorQueryParser#newq}.
	 * @param ctx the parse tree
	 */
	void enterNewq(AggregatorQueryParser.NewqContext ctx);
	/**
	 * Exit a parse tree produced by {@link AggregatorQueryParser#newq}.
	 * @param ctx the parse tree
	 */
	void exitNewq(AggregatorQueryParser.NewqContext ctx);
	/**
	 * Enter a parse tree produced by {@link AggregatorQueryParser#from}.
	 * @param ctx the parse tree
	 */
	void enterFrom(AggregatorQueryParser.FromContext ctx);
	/**
	 * Exit a parse tree produced by {@link AggregatorQueryParser#from}.
	 * @param ctx the parse tree
	 */
	void exitFrom(AggregatorQueryParser.FromContext ctx);
	/**
	 * Enter a parse tree produced by {@link AggregatorQueryParser#expense}.
	 * @param ctx the parse tree
	 */
	void enterExpense(AggregatorQueryParser.ExpenseContext ctx);
	/**
	 * Exit a parse tree produced by {@link AggregatorQueryParser#expense}.
	 * @param ctx the parse tree
	 */
	void exitExpense(AggregatorQueryParser.ExpenseContext ctx);
	/**
	 * Enter a parse tree produced by {@link AggregatorQueryParser#call}.
	 * @param ctx the parse tree
	 */
	void enterCall(AggregatorQueryParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by {@link AggregatorQueryParser#call}.
	 * @param ctx the parse tree
	 */
	void exitCall(AggregatorQueryParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by {@link AggregatorQueryParser#define}.
	 * @param ctx the parse tree
	 */
	void enterDefine(AggregatorQueryParser.DefineContext ctx);
	/**
	 * Exit a parse tree produced by {@link AggregatorQueryParser#define}.
	 * @param ctx the parse tree
	 */
	void exitDefine(AggregatorQueryParser.DefineContext ctx);
	/**
	 * Enter a parse tree produced by {@link AggregatorQueryParser#where}.
	 * @param ctx the parse tree
	 */
	void enterWhere(AggregatorQueryParser.WhereContext ctx);
	/**
	 * Exit a parse tree produced by {@link AggregatorQueryParser#where}.
	 * @param ctx the parse tree
	 */
	void exitWhere(AggregatorQueryParser.WhereContext ctx);
	/**
	 * Enter a parse tree produced by {@link AggregatorQueryParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(AggregatorQueryParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AggregatorQueryParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(AggregatorQueryParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AggregatorQueryParser#url}.
	 * @param ctx the parse tree
	 */
	void enterUrl(AggregatorQueryParser.UrlContext ctx);
	/**
	 * Exit a parse tree produced by {@link AggregatorQueryParser#url}.
	 * @param ctx the parse tree
	 */
	void exitUrl(AggregatorQueryParser.UrlContext ctx);
}