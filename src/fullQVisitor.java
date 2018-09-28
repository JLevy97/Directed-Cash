// Generated from C:/Users/User/Documents/GitHub/Directed-Cash\fullQ.g4 by ANTLR 4.6
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link fullQParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface fullQVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link fullQParser#newq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewq(fullQParser.NewqContext ctx);
	/**
	 * Visit a parse tree produced by {@link fullQParser#donor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDonor(fullQParser.DonorContext ctx);
	/**
	 * Visit a parse tree produced by {@link fullQParser#aggregator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregator(fullQParser.AggregatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link fullQParser#vendor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVendor(fullQParser.VendorContext ctx);
	/**
	 * Visit a parse tree produced by {@link fullQParser#from}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom(fullQParser.FromContext ctx);
	/**
	 * Visit a parse tree produced by {@link fullQParser#timestamp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimestamp(fullQParser.TimestampContext ctx);
	/**
	 * Visit a parse tree produced by {@link fullQParser#time}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTime(fullQParser.TimeContext ctx);
	/**
	 * Visit a parse tree produced by {@link fullQParser#date}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate(fullQParser.DateContext ctx);
	/**
	 * Visit a parse tree produced by {@link fullQParser#rating}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRating(fullQParser.RatingContext ctx);
	/**
	 * Visit a parse tree produced by {@link fullQParser#find}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFind(fullQParser.FindContext ctx);
	/**
	 * Visit a parse tree produced by {@link fullQParser#donate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDonate(fullQParser.DonateContext ctx);
	/**
	 * Visit a parse tree produced by {@link fullQParser#where}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhere(fullQParser.WhereContext ctx);
	/**
	 * Visit a parse tree produced by {@link fullQParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(fullQParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link fullQParser#report}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReport(fullQParser.ReportContext ctx);
	/**
	 * Visit a parse tree produced by {@link fullQParser#expense}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpense(fullQParser.ExpenseContext ctx);
	/**
	 * Visit a parse tree produced by {@link fullQParser#call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall(fullQParser.CallContext ctx);
	/**
	 * Visit a parse tree produced by {@link fullQParser#define}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefine(fullQParser.DefineContext ctx);
	/**
	 * Visit a parse tree produced by {@link fullQParser#url}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUrl(fullQParser.UrlContext ctx);
	/**
	 * Visit a parse tree produced by {@link fullQParser#bid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBid(fullQParser.BidContext ctx);
}