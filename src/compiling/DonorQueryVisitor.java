package compiling;// Generated from E:/Directed Cash\DonorQuery.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DonorQueryParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DonorQueryVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DonorQueryParser#newq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewq(DonorQueryParser.NewqContext ctx);
	/**
	 * Visit a parse tree produced by {@link DonorQueryParser#from}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom(DonorQueryParser.FromContext ctx);
	/**
	 * Visit a parse tree produced by {@link DonorQueryParser#timestamp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimestamp(DonorQueryParser.TimestampContext ctx);
	/**
	 * Visit a parse tree produced by {@link DonorQueryParser#time}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTime(DonorQueryParser.TimeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DonorQueryParser#date}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate(DonorQueryParser.DateContext ctx);
	/**
	 * Visit a parse tree produced by {@link DonorQueryParser#rating}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRating(DonorQueryParser.RatingContext ctx);
	/**
	 * Visit a parse tree produced by {@link DonorQueryParser#find}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFind(DonorQueryParser.FindContext ctx);
	/**
	 * Visit a parse tree produced by {@link DonorQueryParser#donate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDonate(DonorQueryParser.DonateContext ctx);
	/**
	 * Visit a parse tree produced by {@link DonorQueryParser#where}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhere(DonorQueryParser.WhereContext ctx);
	/**
	 * Visit a parse tree produced by {@link DonorQueryParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(DonorQueryParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DonorQueryParser#report}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReport(DonorQueryParser.ReportContext ctx);
}