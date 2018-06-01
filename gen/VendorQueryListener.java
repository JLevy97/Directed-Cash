// Generated from E:/Directed Cash\VendorQuery.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link VendorQueryParser}.
 */
public interface VendorQueryListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link VendorQueryParser#newq}.
	 * @param ctx the parse tree
	 */
	void enterNewq(VendorQueryParser.NewqContext ctx);
	/**
	 * Exit a parse tree produced by {@link VendorQueryParser#newq}.
	 * @param ctx the parse tree
	 */
	void exitNewq(VendorQueryParser.NewqContext ctx);
	/**
	 * Enter a parse tree produced by {@link VendorQueryParser#from}.
	 * @param ctx the parse tree
	 */
	void enterFrom(VendorQueryParser.FromContext ctx);
	/**
	 * Exit a parse tree produced by {@link VendorQueryParser#from}.
	 * @param ctx the parse tree
	 */
	void exitFrom(VendorQueryParser.FromContext ctx);
	/**
	 * Enter a parse tree produced by {@link VendorQueryParser#bid}.
	 * @param ctx the parse tree
	 */
	void enterBid(VendorQueryParser.BidContext ctx);
	/**
	 * Exit a parse tree produced by {@link VendorQueryParser#bid}.
	 * @param ctx the parse tree
	 */
	void exitBid(VendorQueryParser.BidContext ctx);
	/**
	 * Enter a parse tree produced by {@link VendorQueryParser#where}.
	 * @param ctx the parse tree
	 */
	void enterWhere(VendorQueryParser.WhereContext ctx);
	/**
	 * Exit a parse tree produced by {@link VendorQueryParser#where}.
	 * @param ctx the parse tree
	 */
	void exitWhere(VendorQueryParser.WhereContext ctx);
	/**
	 * Enter a parse tree produced by {@link VendorQueryParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(VendorQueryParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VendorQueryParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(VendorQueryParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VendorQueryParser#url}.
	 * @param ctx the parse tree
	 */
	void enterUrl(VendorQueryParser.UrlContext ctx);
	/**
	 * Exit a parse tree produced by {@link VendorQueryParser#url}.
	 * @param ctx the parse tree
	 */
	void exitUrl(VendorQueryParser.UrlContext ctx);
}