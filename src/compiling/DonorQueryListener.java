package compiling;// Generated from E:/Directed Cash\DonorQuery.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DonorQueryParser}.
 */
public interface DonorQueryListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DonorQueryParser#newq}.
	 * @param ctx the parse tree
	 */
	void enterNewq(DonorQueryParser.NewqContext ctx);
	/**
	 * Exit a parse tree produced by {@link DonorQueryParser#newq}.
	 * @param ctx the parse tree
	 */
	void exitNewq(DonorQueryParser.NewqContext ctx);
	/**
	 * Enter a parse tree produced by {@link DonorQueryParser#from}.
	 * @param ctx the parse tree
	 */
	void enterFrom(DonorQueryParser.FromContext ctx);
	/**
	 * Exit a parse tree produced by {@link DonorQueryParser#from}.
	 * @param ctx the parse tree
	 */
	void exitFrom(DonorQueryParser.FromContext ctx);
	/**
	 * Enter a parse tree produced by {@link DonorQueryParser#timestamp}.
	 * @param ctx the parse tree
	 */
	void enterTimestamp(DonorQueryParser.TimestampContext ctx);
	/**
	 * Exit a parse tree produced by {@link DonorQueryParser#timestamp}.
	 * @param ctx the parse tree
	 */
	void exitTimestamp(DonorQueryParser.TimestampContext ctx);
	/**
	 * Enter a parse tree produced by {@link DonorQueryParser#time}.
	 * @param ctx the parse tree
	 */
	void enterTime(DonorQueryParser.TimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DonorQueryParser#time}.
	 * @param ctx the parse tree
	 */
	void exitTime(DonorQueryParser.TimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DonorQueryParser#date}.
	 * @param ctx the parse tree
	 */
	void enterDate(DonorQueryParser.DateContext ctx);
	/**
	 * Exit a parse tree produced by {@link DonorQueryParser#date}.
	 * @param ctx the parse tree
	 */
	void exitDate(DonorQueryParser.DateContext ctx);
	/**
	 * Enter a parse tree produced by {@link DonorQueryParser#rating}.
	 * @param ctx the parse tree
	 */
	void enterRating(DonorQueryParser.RatingContext ctx);
	/**
	 * Exit a parse tree produced by {@link DonorQueryParser#rating}.
	 * @param ctx the parse tree
	 */
	void exitRating(DonorQueryParser.RatingContext ctx);
	/**
	 * Enter a parse tree produced by {@link DonorQueryParser#find}.
	 * @param ctx the parse tree
	 */
	void enterFind(DonorQueryParser.FindContext ctx);
	/**
	 * Exit a parse tree produced by {@link DonorQueryParser#find}.
	 * @param ctx the parse tree
	 */
	void exitFind(DonorQueryParser.FindContext ctx);
	/**
	 * Enter a parse tree produced by {@link DonorQueryParser#donate}.
	 * @param ctx the parse tree
	 */
	void enterDonate(DonorQueryParser.DonateContext ctx);
	/**
	 * Exit a parse tree produced by {@link DonorQueryParser#donate}.
	 * @param ctx the parse tree
	 */
	void exitDonate(DonorQueryParser.DonateContext ctx);
	/**
	 * Enter a parse tree produced by {@link DonorQueryParser#where}.
	 * @param ctx the parse tree
	 */
	void enterWhere(DonorQueryParser.WhereContext ctx);
	/**
	 * Exit a parse tree produced by {@link DonorQueryParser#where}.
	 * @param ctx the parse tree
	 */
	void exitWhere(DonorQueryParser.WhereContext ctx);
	/**
	 * Enter a parse tree produced by {@link DonorQueryParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(DonorQueryParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DonorQueryParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(DonorQueryParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DonorQueryParser#report}.
	 * @param ctx the parse tree
	 */
	void enterReport(DonorQueryParser.ReportContext ctx);
	/**
	 * Exit a parse tree produced by {@link DonorQueryParser#report}.
	 * @param ctx the parse tree
	 */
	void exitReport(DonorQueryParser.ReportContext ctx);
}