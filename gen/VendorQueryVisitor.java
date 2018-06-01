// Generated from E:/Directed Cash\VendorQuery.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link VendorQueryParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface VendorQueryVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link VendorQueryParser#newq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewq(VendorQueryParser.NewqContext ctx);
	/**
	 * Visit a parse tree produced by {@link VendorQueryParser#from}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom(VendorQueryParser.FromContext ctx);
	/**
	 * Visit a parse tree produced by {@link VendorQueryParser#bid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBid(VendorQueryParser.BidContext ctx);
	/**
	 * Visit a parse tree produced by {@link VendorQueryParser#where}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhere(VendorQueryParser.WhereContext ctx);
	/**
	 * Visit a parse tree produced by {@link VendorQueryParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(VendorQueryParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VendorQueryParser#url}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUrl(VendorQueryParser.UrlContext ctx);
}