package compiling;// Generated from E:/Directed Cash\DonorQuery.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DonorQueryParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, Name=17, 
		Number=18, Currency=19, Op=20, Category=21, Type=22, HowOften=23, WS=24;
	public static final int
		RULE_newq = 0, RULE_from = 1, RULE_timestamp = 2, RULE_time = 3, RULE_date = 4, 
		RULE_rating = 5, RULE_find = 6, RULE_donate = 7, RULE_where = 8, RULE_condition = 9, 
		RULE_report = 10;
	public static final String[] ruleNames = {
		"newq", "from", "timestamp", "time", "date", "rating", "find", "donate", 
		"where", "condition", "report"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'FROM'", "'ID='", "'TIMESTAMP'", "'T'", "':'", "'-'", "'RATE'", 
		"'AS'", "'/'", "'FIND'", "'DONATE'", "'TO'", "'DECIDE FCFS'", "'WHERE'", 
		"'AND'", "'REPORT'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, "Name", "Number", "Currency", "Op", "Category", 
		"Type", "HowOften", "WS"
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
	public String getGrammarFileName() { return "DonorQuery.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DonorQueryParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class NewqContext extends ParserRuleContext {
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
		public NewqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DonorQueryListener ) ((DonorQueryListener)listener).enterNewq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DonorQueryListener ) ((DonorQueryListener)listener).exitNewq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DonorQueryVisitor ) return ((DonorQueryVisitor<? extends T>)visitor).visitNewq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewqContext newq() throws RecognitionException {
		NewqContext _localctx = new NewqContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_newq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			from();
			setState(24);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(23);
				timestamp();
				}
			}

			setState(29);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				{
				setState(26);
				donate();
				}
				break;
			case T__9:
				{
				setState(27);
				find();
				}
				break;
			case T__6:
				{
				setState(28);
				rating();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(32);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(31);
				where();
				}
			}

			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(34);
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

	public static class FromContext extends ParserRuleContext {
		public TerminalNode Name() { return getToken(DonorQueryParser.Name, 0); }
		public TerminalNode Number() { return getToken(DonorQueryParser.Number, 0); }
		public FromContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DonorQueryListener ) ((DonorQueryListener)listener).enterFrom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DonorQueryListener ) ((DonorQueryListener)listener).exitFrom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DonorQueryVisitor ) return ((DonorQueryVisitor<? extends T>)visitor).visitFrom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromContext from() throws RecognitionException {
		FromContext _localctx = new FromContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_from);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(T__0);
			setState(38);
			match(Name);
			setState(39);
			match(T__1);
			setState(40);
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
			if ( listener instanceof DonorQueryListener ) ((DonorQueryListener)listener).enterTimestamp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DonorQueryListener ) ((DonorQueryListener)listener).exitTimestamp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DonorQueryVisitor ) return ((DonorQueryVisitor<? extends T>)visitor).visitTimestamp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimestampContext timestamp() throws RecognitionException {
		TimestampContext _localctx = new TimestampContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_timestamp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(T__2);
			setState(43);
			date();
			setState(44);
			match(T__3);
			setState(45);
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
		public List<TerminalNode> Number() { return getTokens(DonorQueryParser.Number); }
		public TerminalNode Number(int i) {
			return getToken(DonorQueryParser.Number, i);
		}
		public TimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_time; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DonorQueryListener ) ((DonorQueryListener)listener).enterTime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DonorQueryListener ) ((DonorQueryListener)listener).exitTime(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DonorQueryVisitor ) return ((DonorQueryVisitor<? extends T>)visitor).visitTime(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimeContext time() throws RecognitionException {
		TimeContext _localctx = new TimeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_time);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(Number);
			setState(48);
			match(T__4);
			setState(49);
			match(Number);
			setState(50);
			match(T__4);
			setState(51);
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
		public List<TerminalNode> Number() { return getTokens(DonorQueryParser.Number); }
		public TerminalNode Number(int i) {
			return getToken(DonorQueryParser.Number, i);
		}
		public DateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DonorQueryListener ) ((DonorQueryListener)listener).enterDate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DonorQueryListener ) ((DonorQueryListener)listener).exitDate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DonorQueryVisitor ) return ((DonorQueryVisitor<? extends T>)visitor).visitDate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DateContext date() throws RecognitionException {
		DateContext _localctx = new DateContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_date);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(Number);
			setState(54);
			match(T__5);
			setState(55);
			match(Number);
			setState(56);
			match(T__5);
			setState(57);
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
		public TerminalNode Name() { return getToken(DonorQueryParser.Name, 0); }
		public List<TerminalNode> Number() { return getTokens(DonorQueryParser.Number); }
		public TerminalNode Number(int i) {
			return getToken(DonorQueryParser.Number, i);
		}
		public RatingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rating; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DonorQueryListener ) ((DonorQueryListener)listener).enterRating(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DonorQueryListener ) ((DonorQueryListener)listener).exitRating(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DonorQueryVisitor ) return ((DonorQueryVisitor<? extends T>)visitor).visitRating(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RatingContext rating() throws RecognitionException {
		RatingContext _localctx = new RatingContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_rating);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(T__6);
			setState(60);
			match(Name);
			setState(61);
			match(T__7);
			setState(62);
			match(Number);
			setState(63);
			match(T__8);
			setState(64);
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
		public TerminalNode Category() { return getToken(DonorQueryParser.Category, 0); }
		public FindContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_find; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DonorQueryListener ) ((DonorQueryListener)listener).enterFind(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DonorQueryListener ) ((DonorQueryListener)listener).exitFind(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DonorQueryVisitor ) return ((DonorQueryVisitor<? extends T>)visitor).visitFind(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FindContext find() throws RecognitionException {
		FindContext _localctx = new FindContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_find);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(T__9);
			setState(67);
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
		public TerminalNode Currency() { return getToken(DonorQueryParser.Currency, 0); }
		public TerminalNode Number() { return getToken(DonorQueryParser.Number, 0); }
		public TerminalNode HowOften() { return getToken(DonorQueryParser.HowOften, 0); }
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
			if ( listener instanceof DonorQueryListener ) ((DonorQueryListener)listener).enterDonate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DonorQueryListener ) ((DonorQueryListener)listener).exitDonate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DonorQueryVisitor ) return ((DonorQueryVisitor<? extends T>)visitor).visitDonate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DonateContext donate() throws RecognitionException {
		DonateContext _localctx = new DonateContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_donate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(T__10);
			setState(70);
			match(Currency);
			setState(71);
			match(Number);
			setState(72);
			match(HowOften);
			setState(73);
			date();
			setState(74);
			match(T__11);
			setState(75);
			date();
			setState(76);
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
			if ( listener instanceof DonorQueryListener ) ((DonorQueryListener)listener).enterWhere(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DonorQueryListener ) ((DonorQueryListener)listener).exitWhere(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DonorQueryVisitor ) return ((DonorQueryVisitor<? extends T>)visitor).visitWhere(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereContext where() throws RecognitionException {
		WhereContext _localctx = new WhereContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_where);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(T__13);
			setState(79);
			condition();
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(80);
				match(T__14);
				setState(81);
				condition();
				}
				}
				setState(86);
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
		public TerminalNode Category() { return getToken(DonorQueryParser.Category, 0); }
		public TerminalNode Op() { return getToken(DonorQueryParser.Op, 0); }
		public TerminalNode Type() { return getToken(DonorQueryParser.Type, 0); }
		public TerminalNode Number() { return getToken(DonorQueryParser.Number, 0); }
		public TerminalNode Name() { return getToken(DonorQueryParser.Name, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DonorQueryListener ) ((DonorQueryListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DonorQueryListener ) ((DonorQueryListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DonorQueryVisitor ) return ((DonorQueryVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(Category);
			setState(88);
			match(Op);
			setState(89);
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
		public TerminalNode HowOften() { return getToken(DonorQueryParser.HowOften, 0); }
		public ReportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_report; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DonorQueryListener ) ((DonorQueryListener)listener).enterReport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DonorQueryListener ) ((DonorQueryListener)listener).exitReport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DonorQueryVisitor ) return ((DonorQueryVisitor<? extends T>)visitor).visitReport(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReportContext report() throws RecognitionException {
		ReportContext _localctx = new ReportContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_report);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(T__15);
			setState(92);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\32a\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\3\2\3\2\5\2\33\n\2\3\2\3\2\3\2\5\2 \n\2\3\2\5\2#\n\2\3\2\5\2&\n"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\7\nU\n\n\f\n\16\nX\13\n\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\f\2\2\r\2\4\6\b\n\f\16\20\22\24\26\2\3\4"+
		"\2\23\24\30\30\2[\2\30\3\2\2\2\4\'\3\2\2\2\6,\3\2\2\2\b\61\3\2\2\2\n\67"+
		"\3\2\2\2\f=\3\2\2\2\16D\3\2\2\2\20G\3\2\2\2\22P\3\2\2\2\24Y\3\2\2\2\26"+
		"]\3\2\2\2\30\32\5\4\3\2\31\33\5\6\4\2\32\31\3\2\2\2\32\33\3\2\2\2\33\37"+
		"\3\2\2\2\34 \5\20\t\2\35 \5\16\b\2\36 \5\f\7\2\37\34\3\2\2\2\37\35\3\2"+
		"\2\2\37\36\3\2\2\2 \"\3\2\2\2!#\5\22\n\2\"!\3\2\2\2\"#\3\2\2\2#%\3\2\2"+
		"\2$&\5\26\f\2%$\3\2\2\2%&\3\2\2\2&\3\3\2\2\2\'(\7\3\2\2()\7\23\2\2)*\7"+
		"\4\2\2*+\7\24\2\2+\5\3\2\2\2,-\7\5\2\2-.\5\n\6\2./\7\6\2\2/\60\5\b\5\2"+
		"\60\7\3\2\2\2\61\62\7\24\2\2\62\63\7\7\2\2\63\64\7\24\2\2\64\65\7\7\2"+
		"\2\65\66\7\24\2\2\66\t\3\2\2\2\678\7\24\2\289\7\b\2\29:\7\24\2\2:;\7\b"+
		"\2\2;<\7\24\2\2<\13\3\2\2\2=>\7\t\2\2>?\7\23\2\2?@\7\n\2\2@A\7\24\2\2"+
		"AB\7\13\2\2BC\7\24\2\2C\r\3\2\2\2DE\7\f\2\2EF\7\27\2\2F\17\3\2\2\2GH\7"+
		"\r\2\2HI\7\25\2\2IJ\7\24\2\2JK\7\31\2\2KL\5\n\6\2LM\7\16\2\2MN\5\n\6\2"+
		"NO\7\17\2\2O\21\3\2\2\2PQ\7\20\2\2QV\5\24\13\2RS\7\21\2\2SU\5\24\13\2"+
		"TR\3\2\2\2UX\3\2\2\2VT\3\2\2\2VW\3\2\2\2W\23\3\2\2\2XV\3\2\2\2YZ\7\27"+
		"\2\2Z[\7\26\2\2[\\\t\2\2\2\\\25\3\2\2\2]^\7\22\2\2^_\7\31\2\2_\27\3\2"+
		"\2\2\7\32\37\"%V";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}