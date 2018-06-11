// Generated from E:/Directed Cash\fullQ.g4 by ANTLR 4.7
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
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, Name=24, Number=25, 
		Currency=26, Op=27, Category=28, Type=29, HowOften=30, WS=31;
	public static final int
		RULE_newq = 0, RULE_donor = 1, RULE_aggregator = 2, RULE_vendor = 3, RULE_from = 4, 
		RULE_timestamp = 5, RULE_time = 6, RULE_date = 7, RULE_rating = 8, RULE_find = 9, 
		RULE_donate = 10, RULE_where = 11, RULE_condition = 12, RULE_report = 13, 
		RULE_expense = 14, RULE_call = 15, RULE_define = 16, RULE_url = 17, RULE_bid = 18;
	public static final String[] ruleNames = {
		"newq", "donor", "aggregator", "vendor", "from", "timestamp", "time", 
		"date", "rating", "find", "donate", "where", "condition", "report", "expense", 
		"call", "define", "url", "bid"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'FROM'", "'ID='", "'TIMESTAMP'", "'T'", "':'", "'-'", "'RATE'", 
		"'AS'", "'/'", "'FIND'", "'DONATE'", "'TO'", "'DECIDE FCFS'", "'WHERE'", 
		"'AND'", "'REPORT'", "'EXPENSE='", "'TO VENDOR'", "'VENDOR RFP'", "'DEFINE'", 
		"'GOAL'", "'URL='", "'BID'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"Name", "Number", "Currency", "Op", "Category", "Type", "HowOften", "WS"
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
	}

	public final NewqContext newq() throws RecognitionException {
		NewqContext _localctx = new NewqContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_newq);
		try {
			setState(41);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				donor();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				aggregator();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(40);
				vendor();
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
	}

	public final DonorContext donor() throws RecognitionException {
		DonorContext _localctx = new DonorContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_donor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			from();
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(44);
				timestamp();
				}
			}

			setState(50);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				{
				setState(47);
				donate();
				}
				break;
			case T__9:
				{
				setState(48);
				find();
				}
				break;
			case T__6:
				{
				setState(49);
				rating();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(52);
				where();
				}
			}

			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(55);
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
	}

	public final AggregatorContext aggregator() throws RecognitionException {
		AggregatorContext _localctx = new AggregatorContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_aggregator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			from();
			setState(62);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
				{
				setState(59);
				expense();
				}
				break;
			case Category:
				{
				setState(60);
				call();
				}
				break;
			case T__19:
				{
				setState(61);
				define();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(64);
				where();
				}
			}

			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__21) {
				{
				setState(67);
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
	}

	public final VendorContext vendor() throws RecognitionException {
		VendorContext _localctx = new VendorContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_vendor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			from();
			setState(71);
			bid();
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(72);
				where();
				}
			}

			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__21) {
				{
				setState(75);
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
	}

	public final FromContext from() throws RecognitionException {
		FromContext _localctx = new FromContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_from);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(T__0);
			setState(79);
			match(Name);
			setState(80);
			match(T__1);
			setState(81);
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
	}

	public final TimestampContext timestamp() throws RecognitionException {
		TimestampContext _localctx = new TimestampContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_timestamp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(T__2);
			setState(84);
			date();
			setState(85);
			match(T__3);
			setState(86);
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
	}

	public final TimeContext time() throws RecognitionException {
		TimeContext _localctx = new TimeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_time);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(Number);
			setState(89);
			match(T__4);
			setState(90);
			match(Number);
			setState(91);
			match(T__4);
			setState(92);
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
	}

	public final DateContext date() throws RecognitionException {
		DateContext _localctx = new DateContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_date);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(Number);
			setState(95);
			match(T__5);
			setState(96);
			match(Number);
			setState(97);
			match(T__5);
			setState(98);
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
	}

	public final RatingContext rating() throws RecognitionException {
		RatingContext _localctx = new RatingContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_rating);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(T__6);
			setState(101);
			match(Name);
			setState(102);
			match(T__7);
			setState(103);
			match(Number);
			setState(104);
			match(T__8);
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
	}

	public final FindContext find() throws RecognitionException {
		FindContext _localctx = new FindContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_find);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(T__9);
			setState(108);
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
	}

	public final DonateContext donate() throws RecognitionException {
		DonateContext _localctx = new DonateContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_donate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(T__10);
			setState(111);
			match(Currency);
			setState(112);
			match(Number);
			setState(113);
			match(HowOften);
			setState(114);
			date();
			setState(115);
			match(T__11);
			setState(116);
			date();
			setState(117);
			match(T__12);
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
	}

	public final WhereContext where() throws RecognitionException {
		WhereContext _localctx = new WhereContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_where);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(T__13);
			setState(120);
			condition();
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(121);
				match(T__14);
				setState(122);
				condition();
				}
				}
				setState(127);
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
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(Category);
			setState(129);
			match(Op);
			setState(130);
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
	}

	public final ReportContext report() throws RecognitionException {
		ReportContext _localctx = new ReportContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_report);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(T__15);
			setState(133);
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
	}

	public final ExpenseContext expense() throws RecognitionException {
		ExpenseContext _localctx = new ExpenseContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_expense);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(T__16);
			setState(136);
			match(Currency);
			setState(137);
			match(Number);
			setState(138);
			match(T__17);
			setState(139);
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
	}

	public final CallContext call() throws RecognitionException {
		CallContext _localctx = new CallContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(Category);
			setState(142);
			match(Name);
			setState(143);
			match(T__18);
			setState(144);
			match(Currency);
			setState(145);
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
	}

	public final DefineContext define() throws RecognitionException {
		DefineContext _localctx = new DefineContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_define);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(T__19);
			setState(148);
			match(Category);
			setState(149);
			match(Name);
			setState(150);
			match(T__20);
			setState(151);
			match(Currency);
			setState(152);
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
	}

	public final UrlContext url() throws RecognitionException {
		UrlContext _localctx = new UrlContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_url);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(T__21);
			setState(155);
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
	}

	public final BidContext bid() throws RecognitionException {
		BidContext _localctx = new BidContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_bid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(T__22);
			setState(158);
			match(Currency);
			setState(159);
			match(Number);
			setState(160);
			match(T__11);
			setState(161);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3!\u00a6\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\5\2,\n\2\3\3\3\3\5\3\60\n\3\3\3\3\3\3"+
		"\3\5\3\65\n\3\3\3\5\38\n\3\3\3\5\3;\n\3\3\4\3\4\3\4\3\4\5\4A\n\4\3\4\5"+
		"\4D\n\4\3\4\5\4G\n\4\3\5\3\5\3\5\5\5L\n\5\3\5\5\5O\n\5\3\6\3\6\3\6\3\6"+
		"\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\r\3\r\3\r\3\r\7\r~\n\r\f\r\16\r\u0081\13\r\3\16\3\16\3"+
		"\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\2\2\25\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&\2\3\4\2\32\33\37\37\2\u00a0\2+\3\2\2\2\4-\3\2\2\2\6<\3\2\2\2"+
		"\bH\3\2\2\2\nP\3\2\2\2\fU\3\2\2\2\16Z\3\2\2\2\20`\3\2\2\2\22f\3\2\2\2"+
		"\24m\3\2\2\2\26p\3\2\2\2\30y\3\2\2\2\32\u0082\3\2\2\2\34\u0086\3\2\2\2"+
		"\36\u0089\3\2\2\2 \u008f\3\2\2\2\"\u0095\3\2\2\2$\u009c\3\2\2\2&\u009f"+
		"\3\2\2\2(,\5\4\3\2),\5\6\4\2*,\5\b\5\2+(\3\2\2\2+)\3\2\2\2+*\3\2\2\2,"+
		"\3\3\2\2\2-/\5\n\6\2.\60\5\f\7\2/.\3\2\2\2/\60\3\2\2\2\60\64\3\2\2\2\61"+
		"\65\5\26\f\2\62\65\5\24\13\2\63\65\5\22\n\2\64\61\3\2\2\2\64\62\3\2\2"+
		"\2\64\63\3\2\2\2\65\67\3\2\2\2\668\5\30\r\2\67\66\3\2\2\2\678\3\2\2\2"+
		"8:\3\2\2\29;\5\34\17\2:9\3\2\2\2:;\3\2\2\2;\5\3\2\2\2<@\5\n\6\2=A\5\36"+
		"\20\2>A\5 \21\2?A\5\"\22\2@=\3\2\2\2@>\3\2\2\2@?\3\2\2\2AC\3\2\2\2BD\5"+
		"\30\r\2CB\3\2\2\2CD\3\2\2\2DF\3\2\2\2EG\5$\23\2FE\3\2\2\2FG\3\2\2\2G\7"+
		"\3\2\2\2HI\5\n\6\2IK\5&\24\2JL\5\30\r\2KJ\3\2\2\2KL\3\2\2\2LN\3\2\2\2"+
		"MO\5$\23\2NM\3\2\2\2NO\3\2\2\2O\t\3\2\2\2PQ\7\3\2\2QR\7\32\2\2RS\7\4\2"+
		"\2ST\7\33\2\2T\13\3\2\2\2UV\7\5\2\2VW\5\20\t\2WX\7\6\2\2XY\5\16\b\2Y\r"+
		"\3\2\2\2Z[\7\33\2\2[\\\7\7\2\2\\]\7\33\2\2]^\7\7\2\2^_\7\33\2\2_\17\3"+
		"\2\2\2`a\7\33\2\2ab\7\b\2\2bc\7\33\2\2cd\7\b\2\2de\7\33\2\2e\21\3\2\2"+
		"\2fg\7\t\2\2gh\7\32\2\2hi\7\n\2\2ij\7\33\2\2jk\7\13\2\2kl\7\33\2\2l\23"+
		"\3\2\2\2mn\7\f\2\2no\7\36\2\2o\25\3\2\2\2pq\7\r\2\2qr\7\34\2\2rs\7\33"+
		"\2\2st\7 \2\2tu\5\20\t\2uv\7\16\2\2vw\5\20\t\2wx\7\17\2\2x\27\3\2\2\2"+
		"yz\7\20\2\2z\177\5\32\16\2{|\7\21\2\2|~\5\32\16\2}{\3\2\2\2~\u0081\3\2"+
		"\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\31\3\2\2\2\u0081\177\3\2\2\2"+
		"\u0082\u0083\7\36\2\2\u0083\u0084\7\35\2\2\u0084\u0085\t\2\2\2\u0085\33"+
		"\3\2\2\2\u0086\u0087\7\22\2\2\u0087\u0088\7 \2\2\u0088\35\3\2\2\2\u0089"+
		"\u008a\7\23\2\2\u008a\u008b\7\34\2\2\u008b\u008c\7\33\2\2\u008c\u008d"+
		"\7\24\2\2\u008d\u008e\7\32\2\2\u008e\37\3\2\2\2\u008f\u0090\7\36\2\2\u0090"+
		"\u0091\7\32\2\2\u0091\u0092\7\25\2\2\u0092\u0093\7\34\2\2\u0093\u0094"+
		"\7\33\2\2\u0094!\3\2\2\2\u0095\u0096\7\26\2\2\u0096\u0097\7\36\2\2\u0097"+
		"\u0098\7\32\2\2\u0098\u0099\7\27\2\2\u0099\u009a\7\34\2\2\u009a\u009b"+
		"\7\33\2\2\u009b#\3\2\2\2\u009c\u009d\7\30\2\2\u009d\u009e\7\32\2\2\u009e"+
		"%\3\2\2\2\u009f\u00a0\7\31\2\2\u00a0\u00a1\7\34\2\2\u00a1\u00a2\7\33\2"+
		"\2\u00a2\u00a3\7\16\2\2\u00a3\u00a4\7\32\2\2\u00a4\'\3\2\2\2\r+/\64\67"+
		":@CFKN\177";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}