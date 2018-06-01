// Generated from E:/Directed Cash\AggregatorQuery.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AggregatorQueryParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AggregatorQueryVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AggregatorQueryParser#newq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewq(AggregatorQueryParser.NewqContext ctx);
	/**
	 * Visit a parse tree produced by {@link AggregatorQueryParser#from}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom(AggregatorQueryParser.FromContext ctx);
	/**
	 * Visit a parse tree produced by {@link AggregatorQueryParser#expense}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpense(AggregatorQueryParser.ExpenseContext ctx);
	/**
	 * Visit a parse tree produced by {@link AggregatorQueryParser#call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall(AggregatorQueryParser.CallContext ctx);
	/**
	 * Visit a parse tree produced by {@link AggregatorQueryParser#define}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefine(AggregatorQueryParser.DefineContext ctx);
	/**
	 * Visit a parse tree produced by {@link AggregatorQueryParser#where}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhere(AggregatorQueryParser.WhereContext ctx);
	/**
	 * Visit a parse tree produced by {@link AggregatorQueryParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(AggregatorQueryParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AggregatorQueryParser#url}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUrl(AggregatorQueryParser.UrlContext ctx);
}