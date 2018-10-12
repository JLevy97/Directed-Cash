// Generated from C:/Users/User/Documents/GitHub/Directed-Cash\fullQ.g4 by ANTLR 4.6
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class fullQParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		Name=25, Number=26, Currency=27, Op=28, Category=29, Type=30, HowOften=31, 
		WS=32;
	public static final int
		RULE_newq = 0, RULE_donor = 1, RULE_aggregator = 2, RULE_vendor = 3, RULE_search = 4, 
		RULE_locate = 5, RULE_from = 6, RULE_timestamp = 7, RULE_time = 8, RULE_date = 9, 
		RULE_rating = 10, RULE_find = 11, RULE_donate = 12, RULE_where = 13, RULE_condition = 14, 
		RULE_report = 15, RULE_expense = 16, RULE_call = 17, RULE_define = 18, 
		RULE_url = 19, RULE_bid = 20;
	public static final String[] ruleNames = {
		"newq", "donor", "aggregator", "vendor", "search", "locate", "from", "timestamp", 
		"time", "date", "rating", "find", "donate", "where", "condition", "report", 
		"expense", "call", "define", "url", "bid"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'LOCATE'", "'FROM'", "'ID='", "'TIMESTAMP'", "'T'", "':'", "'-'", 
		"'RATE'", "'AS'", "'/'", "'FIND'", "'DONATE'", "'TO'", "'DECIDE FCFS'", 
		"'WHERE'", "'AND'", "'REPORT'", "'EXPENSE='", "'TO VENDOR'", "'VENDOR RFP'", 
		"'DEFINE'", "'GOAL'", "'URL='", "'BID'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "Name", "Number", "Currency", "Op", "Category", "Type", "HowOften", 
		"WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "fullQ.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public fullQParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class NewqContext extends ParserRuleContext {
		public DonorContext donor() {
			return getRuleContext(DonorContext.class,0);
		}
		public AggregatorContext aggregator() {
			return getRuleContext(AggregatorContext.class,0);
		}
		public VendorContext vendor() {
			return getRuleContext(VendorContext.class,0);
		}
		public SearchContext search() {
			return getRuleContext(SearchContext.class,0);
		}
		public NewqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fullQListener ) ((fullQListener)listener).enterNewq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fullQListener ) ((fullQListener)listener).exitNewq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fullQVisitor ) return ((fullQVisitor<? extends T>)visitor).visitNewq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewqContext newq() throws RecognitionException {
		NewqContext _localctx = new NewqContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_newq);
		try {
			setState(46);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				donor();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(43);
				aggregator();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(44);
				vendor();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(45);
				search();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DonorContext extends ParserRuleContext {
		public FromContext from() {
			return getRuleContext(FromContext.class,0);
		}
		public DonateContext donate() {
			return getRuleContext(DonateContext.class,0);
		}
		public FindContext find() {
			return getRuleContext(FindContext.class,0);
		}
		public RatingContext rating() {
			return getRuleContext(RatingContext.class,0);
		}
		public TimestampContext timestamp() {
			return getRuleContext(TimestampContext.class,0);
		}
		public WhereContext where() {
			return getRuleContext(WhereContext.class,0);
		}
		public ReportContext report() {
			return getRuleContext(ReportContext.class,0);
		}
		public DonorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_donor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fullQListener ) ((fullQListener)listener).enterDonor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fullQListener ) ((fullQListener)listener).exitDonor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fullQVisitor ) return ((fullQVisitor<? extends T>)visitor).visitDonor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DonorContext donor() throws RecognitionException {
		DonorContext _localctx = new DonorContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_donor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			from();
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(49);
				timestamp();
				}
			}

			setState(55);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				{
				setState(52);
				donate();
				}
				break;
			case T__10:
				{
				setState(53);
				find();
				}
				break;
			case T__7:
				{
				setState(54);
				rating();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(57);
				where();
				}
			}

			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__16) {
				{
				setState(60);
				report();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AggregatorContext extends ParserRuleContext {
		public FromContext from() {
			return getRuleContext(FromContext.class,0);
		}
		public ExpenseContext expense() {
			return getRuleContext(ExpenseContext.class,0);
		}
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public DefineContext define() {
			return getRuleContext(DefineContext.class,0);
		}
		public WhereContext where() {
			return getRuleContext(WhereContext.class,0);
		}
		public UrlContext url() {
			return getRuleContext(UrlContext.class,0);
		}
		public AggregatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fullQListener ) ((fullQListener)listener).enterAggregator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fullQListener ) ((fullQListener)listener).exitAggregator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fullQVisitor ) return ((fullQVisitor<? extends T>)visitor).visitAggregator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggregatorContext aggregator() throws RecognitionException {
		AggregatorContext _localctx = new AggregatorContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_aggregator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			from();
			setState(67);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__17:
				{
				setState(64);
				expense();
				}
				break;
			case Category:
				{
				setState(65);
				call();
				}
				break;
			case T__20:
				{
				setState(66);
				define();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(69);
				where();
				}
			}

			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__22) {
				{
				setState(72);
				url();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VendorContext extends ParserRuleContext {
		public FromContext from() {
			return getRuleContext(FromContext.class,0);
		}
		public BidContext bid() {
			return getRuleContext(BidContext.class,0);
		}
		public WhereContext where() {
			return getRuleContext(WhereContext.class,0);
		}
		public UrlContext url() {
			return getRuleContext(UrlContext.class,0);
		}
		public VendorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vendor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fullQListener ) ((fullQListener)listener).enterVendor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fullQListener ) ((fullQListener)listener).exitVendor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fullQVisitor ) return ((fullQVisitor<? extends T>)visitor).visitVendor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VendorContext vendor() throws RecognitionException {
		VendorContext _localctx = new VendorContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_vendor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			from();
			setState(76);
			bid();
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(77);
				where();
				}
			}

			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__22) {
				{
				setState(80);
				url();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SearchContext extends ParserRuleContext {
		public LocateContext locate() {
			return getRuleContext(LocateContext.class,0);
		}
		public WhereContext where() {
			return getRuleContext(WhereContext.class,0);
		}
		public SearchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_search; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fullQListener ) ((fullQListener)listener).enterSearch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fullQListener ) ((fullQListener)listener).exitSearch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fullQVisitor ) return ((fullQVisitor<? extends T>)visitor).visitSearch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SearchContext search() throws RecognitionException {
		SearchContext _localctx = new SearchContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_search);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			locate();
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(84);
				where();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocateContext extends ParserRuleContext {
		public TerminalNode Category() { return getToken(fullQParser.Category, 0); }
		public TerminalNode Name() { return getToken(fullQParser.Name, 0); }
		public LocateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_locate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fullQListener ) ((fullQListener)listener).enterLocate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fullQListener ) ((fullQListener)listener).exitLocate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fullQVisitor ) return ((fullQVisitor<? extends T>)visitor).visitLocate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocateContext locate() throws RecognitionException {
		LocateContext _localctx = new LocateContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_locate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(T__0);
			setState(88);
			match(Category);
			setState(89);
			match(Name);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FromContext extends ParserRuleContext {
		public TerminalNode Name() { return getToken(fullQParser.Name, 0); }
		public TerminalNode Number() { return getToken(fullQParser.Number, 0); }
		public FromContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fullQListener ) ((fullQListener)listener).enterFrom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fullQListener ) ((fullQListener)listener).exitFrom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fullQVisitor ) return ((fullQVisitor<? extends T>)visitor).visitFrom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromContext from() throws RecognitionException {
		FromContext _localctx = new FromContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_from);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(T__1);
			setState(92);
			match(Name);
			setState(93);
			match(T__2);
			setState(94);
			match(Number);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TimestampContext extends ParserRuleContext {
		public DateContext date() {
			return getRuleContext(DateContext.class,0);
		}
		public TimeContext time() {
			return getRuleContext(TimeContext.class,0);
		}
		public TimestampContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timestamp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fullQListener ) ((fullQListener)listener).enterTimestamp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fullQListener ) ((fullQListener)listener).exitTimestamp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fullQVisitor ) return ((fullQVisitor<? extends T>)visitor).visitTimestamp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimestampContext timestamp() throws RecognitionException {
		TimestampContext _localctx = new TimestampContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_timestamp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(T__3);
			setState(97);
			date();
			setState(98);
			match(T__4);
			setState(99);
			time();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TimeContext extends ParserRuleContext {
		public List<TerminalNode> Number() { return getTokens(fullQParser.Number); }
		public TerminalNode Number(int i) {
			return getToken(fullQParser.Number, i);
		}
		public TimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_time; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fullQListener ) ((fullQListener)listener).enterTime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fullQListener ) ((fullQListener)listener).exitTime(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fullQVisitor ) return ((fullQVisitor<? extends T>)visitor).visitTime(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimeContext time() throws RecognitionException {
		TimeContext _localctx = new TimeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_time);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(Number);
			setState(102);
			match(T__5);
			setState(103);
			match(Number);
			setState(104);
			match(T__5);
			setState(105);
			match(Number);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DateContext extends ParserRuleContext {
		public List<TerminalNode> Number() { return getTokens(fullQParser.Number); }
		public TerminalNode Number(int i) {
			return getToken(fullQParser.Number, i);
		}
		public DateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fullQListener ) ((fullQListener)listener).enterDate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fullQListener ) ((fullQListener)listener).exitDate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fullQVisitor ) return ((fullQVisitor<? extends T>)visitor).visitDate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DateContext date() throws RecognitionException {
		DateContext _localctx = new DateContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_date);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(Number);
			setState(108);
			match(T__6);
			setState(109);
			match(Number);
			setState(110);
			match(T__6);
			setState(111);
			match(Number);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RatingContext extends ParserRuleContext {
		public TerminalNode Name() { return getToken(fullQParser.Name, 0); }
		public List<TerminalNode> Number() { return getTokens(fullQParser.Number); }
		public TerminalNode Number(int i) {
			return getToken(fullQParser.Number, i);
		}
		public RatingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rating; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fullQListener ) ((fullQListener)listener).enterRating(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fullQListener ) ((fullQListener)listener).exitRating(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fullQVisitor ) return ((fullQVisitor<? extends T>)visitor).visitRating(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RatingContext rating() throws RecognitionException {
		RatingContext _localctx = new RatingContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_rating);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(T__7);
			setState(114);
			match(Name);
			setState(115);
			match(T__8);
			setState(116);
			match(Number);
			setState(117);
			match(T__9);
			setState(118);
			match(Number);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FindContext extends ParserRuleContext {
		public TerminalNode Category() { return getToken(fullQParser.Category, 0); }
		public FindContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_find; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fullQListener ) ((fullQListener)listener).enterFind(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fullQListener ) ((fullQListener)listener).exitFind(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fullQVisitor ) return ((fullQVisitor<? extends T>)visitor).visitFind(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FindContext find() throws RecognitionException {
		FindContext _localctx = new FindContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_find);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(T__10);
			setState(121);
			match(Category);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DonateContext extends ParserRuleContext {
		public TerminalNode Currency() { return getToken(fullQParser.Currency, 0); }
		public TerminalNode Number() { return getToken(fullQParser.Number, 0); }
		public TerminalNode HowOften() { return getToken(fullQParser.HowOften, 0); }
		public List<DateContext> date() {
			return getRuleContexts(DateContext.class);
		}
		public DateContext date(int i) {
			return getRuleContext(DateContext.class,i);
		}
		public DonateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_donate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fullQListener ) ((fullQListener)listener).enterDonate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fullQListener ) ((fullQListener)listener).exitDonate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fullQVisitor ) return ((fullQVisitor<? extends T>)visitor).visitDonate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DonateContext donate() throws RecognitionException {
		DonateContext _localctx = new DonateContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_donate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(T__11);
			setState(124);
			match(Currency);
			setState(125);
			match(Number);
			setState(126);
			match(HowOften);
			setState(127);
			date();
			setState(128);
			match(T__12);
			setState(129);
			date();
			setState(130);
			match(T__13);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhereContext extends ParserRuleContext {
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public WhereContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fullQListener ) ((fullQListener)listener).enterWhere(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fullQListener ) ((fullQListener)listener).exitWhere(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fullQVisitor ) return ((fullQVisitor<? extends T>)visitor).visitWhere(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereContext where() throws RecognitionException {
		WhereContext _localctx = new WhereContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_where);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(T__14);
			setState(133);
			condition();
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(134);
				match(T__15);
				setState(135);
				condition();
				}
				}
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public TerminalNode Category() { return getToken(fullQParser.Category, 0); }
		public TerminalNode Op() { return getToken(fullQParser.Op, 0); }
		public TerminalNode Type() { return getToken(fullQParser.Type, 0); }
		public TerminalNode Number() { return getToken(fullQParser.Number, 0); }
		public TerminalNode Name() { return getToken(fullQParser.Name, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fullQListener ) ((fullQListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fullQListener ) ((fullQListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fullQVisitor ) return ((fullQVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(Category);
			setState(142);
			match(Op);
			setState(143);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Name) | (1L << Number) | (1L << Type))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReportContext extends ParserRuleContext {
		public TerminalNode HowOften() { return getToken(fullQParser.HowOften, 0); }
		public ReportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_report; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fullQListener ) ((fullQListener)listener).enterReport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fullQListener ) ((fullQListener)listener).exitReport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fullQVisitor ) return ((fullQVisitor<? extends T>)visitor).visitReport(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReportContext report() throws RecognitionException {
		ReportContext _localctx = new ReportContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_report);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(T__16);
			setState(146);
			match(HowOften);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpenseContext extends ParserRuleContext {
		public TerminalNode Currency() { return getToken(fullQParser.Currency, 0); }
		public TerminalNode Number() { return getToken(fullQParser.Number, 0); }
		public TerminalNode Name() { return getToken(fullQParser.Name, 0); }
		public ExpenseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expense; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fullQListener ) ((fullQListener)listener).enterExpense(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fullQListener ) ((fullQListener)listener).exitExpense(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fullQVisitor ) return ((fullQVisitor<? extends T>)visitor).visitExpense(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpenseContext expense() throws RecognitionException {
		ExpenseContext _localctx = new ExpenseContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_expense);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(T__17);
			setState(149);
			match(Currency);
			setState(150);
			match(Number);
			setState(151);
			match(T__18);
			setState(152);
			match(Name);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CallContext extends ParserRuleContext {
		public TerminalNode Category() { return getToken(fullQParser.Category, 0); }
		public TerminalNode Name() { return getToken(fullQParser.Name, 0); }
		public TerminalNode Currency() { return getToken(fullQParser.Currency, 0); }
		public TerminalNode Number() { return getToken(fullQParser.Number, 0); }
		public CallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fullQListener ) ((fullQListener)listener).enterCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fullQListener ) ((fullQListener)listener).exitCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fullQVisitor ) return ((fullQVisitor<? extends T>)visitor).visitCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallContext call() throws RecognitionException {
		CallContext _localctx = new CallContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(Category);
			setState(155);
			match(Name);
			setState(156);
			match(T__19);
			setState(157);
			match(Currency);
			setState(158);
			match(Number);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefineContext extends ParserRuleContext {
		public TerminalNode Category() { return getToken(fullQParser.Category, 0); }
		public TerminalNode Name() { return getToken(fullQParser.Name, 0); }
		public TerminalNode Currency() { return getToken(fullQParser.Currency, 0); }
		public TerminalNode Number() { return getToken(fullQParser.Number, 0); }
		public DefineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fullQListener ) ((fullQListener)listener).enterDefine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fullQListener ) ((fullQListener)listener).exitDefine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fullQVisitor ) return ((fullQVisitor<? extends T>)visitor).visitDefine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefineContext define() throws RecognitionException {
		DefineContext _localctx = new DefineContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_define);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(T__20);
			setState(161);
			match(Category);
			setState(162);
			match(Name);
			setState(163);
			match(T__21);
			setState(164);
			match(Currency);
			setState(165);
			match(Number);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UrlContext extends ParserRuleContext {
		public TerminalNode Name() { return getToken(fullQParser.Name, 0); }
		public UrlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_url; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fullQListener ) ((fullQListener)listener).enterUrl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fullQListener ) ((fullQListener)listener).exitUrl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fullQVisitor ) return ((fullQVisitor<? extends T>)visitor).visitUrl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UrlContext url() throws RecognitionException {
		UrlContext _localctx = new UrlContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_url);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(T__22);
			setState(168);
			match(Name);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BidContext extends ParserRuleContext {
		public TerminalNode Currency() { return getToken(fullQParser.Currency, 0); }
		public TerminalNode Number() { return getToken(fullQParser.Number, 0); }
		public TerminalNode Name() { return getToken(fullQParser.Name, 0); }
		public BidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fullQListener ) ((fullQListener)listener).enterBid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fullQListener ) ((fullQListener)listener).exitBid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fullQVisitor ) return ((fullQVisitor<? extends T>)visitor).visitBid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BidContext bid() throws RecognitionException {
		BidContext _localctx = new BidContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_bid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(T__23);
			setState(171);
			match(Currency);
			setState(172);
			match(Number);
			setState(173);
			match(T__12);
			setState(174);
			match(Name);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\"\u00b3\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\2\5\2\61\n\2\3"+
		"\3\3\3\5\3\65\n\3\3\3\3\3\3\3\5\3:\n\3\3\3\5\3=\n\3\3\3\5\3@\n\3\3\4\3"+
		"\4\3\4\3\4\5\4F\n\4\3\4\5\4I\n\4\3\4\5\4L\n\4\3\5\3\5\3\5\5\5Q\n\5\3\5"+
		"\5\5T\n\5\3\6\3\6\5\6X\n\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\7\17\u008b\n\17\f\17\16\17\u008e\13\17"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\2\2\27\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*\2\3\4\2\33\34  \u00ad\2\60\3\2\2\2\4\62\3\2\2\2"+
		"\6A\3\2\2\2\bM\3\2\2\2\nU\3\2\2\2\fY\3\2\2\2\16]\3\2\2\2\20b\3\2\2\2\22"+
		"g\3\2\2\2\24m\3\2\2\2\26s\3\2\2\2\30z\3\2\2\2\32}\3\2\2\2\34\u0086\3\2"+
		"\2\2\36\u008f\3\2\2\2 \u0093\3\2\2\2\"\u0096\3\2\2\2$\u009c\3\2\2\2&\u00a2"+
		"\3\2\2\2(\u00a9\3\2\2\2*\u00ac\3\2\2\2,\61\5\4\3\2-\61\5\6\4\2.\61\5\b"+
		"\5\2/\61\5\n\6\2\60,\3\2\2\2\60-\3\2\2\2\60.\3\2\2\2\60/\3\2\2\2\61\3"+
		"\3\2\2\2\62\64\5\16\b\2\63\65\5\20\t\2\64\63\3\2\2\2\64\65\3\2\2\2\65"+
		"9\3\2\2\2\66:\5\32\16\2\67:\5\30\r\28:\5\26\f\29\66\3\2\2\29\67\3\2\2"+
		"\298\3\2\2\2:<\3\2\2\2;=\5\34\17\2<;\3\2\2\2<=\3\2\2\2=?\3\2\2\2>@\5 "+
		"\21\2?>\3\2\2\2?@\3\2\2\2@\5\3\2\2\2AE\5\16\b\2BF\5\"\22\2CF\5$\23\2D"+
		"F\5&\24\2EB\3\2\2\2EC\3\2\2\2ED\3\2\2\2FH\3\2\2\2GI\5\34\17\2HG\3\2\2"+
		"\2HI\3\2\2\2IK\3\2\2\2JL\5(\25\2KJ\3\2\2\2KL\3\2\2\2L\7\3\2\2\2MN\5\16"+
		"\b\2NP\5*\26\2OQ\5\34\17\2PO\3\2\2\2PQ\3\2\2\2QS\3\2\2\2RT\5(\25\2SR\3"+
		"\2\2\2ST\3\2\2\2T\t\3\2\2\2UW\5\f\7\2VX\5\34\17\2WV\3\2\2\2WX\3\2\2\2"+
		"X\13\3\2\2\2YZ\7\3\2\2Z[\7\37\2\2[\\\7\33\2\2\\\r\3\2\2\2]^\7\4\2\2^_"+
		"\7\33\2\2_`\7\5\2\2`a\7\34\2\2a\17\3\2\2\2bc\7\6\2\2cd\5\24\13\2de\7\7"+
		"\2\2ef\5\22\n\2f\21\3\2\2\2gh\7\34\2\2hi\7\b\2\2ij\7\34\2\2jk\7\b\2\2"+
		"kl\7\34\2\2l\23\3\2\2\2mn\7\34\2\2no\7\t\2\2op\7\34\2\2pq\7\t\2\2qr\7"+
		"\34\2\2r\25\3\2\2\2st\7\n\2\2tu\7\33\2\2uv\7\13\2\2vw\7\34\2\2wx\7\f\2"+
		"\2xy\7\34\2\2y\27\3\2\2\2z{\7\r\2\2{|\7\37\2\2|\31\3\2\2\2}~\7\16\2\2"+
		"~\177\7\35\2\2\177\u0080\7\34\2\2\u0080\u0081\7!\2\2\u0081\u0082\5\24"+
		"\13\2\u0082\u0083\7\17\2\2\u0083\u0084\5\24\13\2\u0084\u0085\7\20\2\2"+
		"\u0085\33\3\2\2\2\u0086\u0087\7\21\2\2\u0087\u008c\5\36\20\2\u0088\u0089"+
		"\7\22\2\2\u0089\u008b\5\36\20\2\u008a\u0088\3\2\2\2\u008b\u008e\3\2\2"+
		"\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\35\3\2\2\2\u008e\u008c"+
		"\3\2\2\2\u008f\u0090\7\37\2\2\u0090\u0091\7\36\2\2\u0091\u0092\t\2\2\2"+
		"\u0092\37\3\2\2\2\u0093\u0094\7\23\2\2\u0094\u0095\7!\2\2\u0095!\3\2\2"+
		"\2\u0096\u0097\7\24\2\2\u0097\u0098\7\35\2\2\u0098\u0099\7\34\2\2\u0099"+
		"\u009a\7\25\2\2\u009a\u009b\7\33\2\2\u009b#\3\2\2\2\u009c\u009d\7\37\2"+
		"\2\u009d\u009e\7\33\2\2\u009e\u009f\7\26\2\2\u009f\u00a0\7\35\2\2\u00a0"+
		"\u00a1\7\34\2\2\u00a1%\3\2\2\2\u00a2\u00a3\7\27\2\2\u00a3\u00a4\7\37\2"+
		"\2\u00a4\u00a5\7\33\2\2\u00a5\u00a6\7\30\2\2\u00a6\u00a7\7\35\2\2\u00a7"+
		"\u00a8\7\34\2\2\u00a8\'\3\2\2\2\u00a9\u00aa\7\31\2\2\u00aa\u00ab\7\33"+
		"\2\2\u00ab)\3\2\2\2\u00ac\u00ad\7\32\2\2\u00ad\u00ae\7\35\2\2\u00ae\u00af"+
		"\7\34\2\2\u00af\u00b0\7\17\2\2\u00b0\u00b1\7\33\2\2\u00b1+\3\2\2\2\16"+
		"\60\649<?EHKPSW\u008c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}