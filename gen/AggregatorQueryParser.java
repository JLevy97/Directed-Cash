// Generated from E:/Directed Cash\AggregatorQuery.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AggregatorQueryParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, Name=11, Number=12, Currency=13, Op=14, Category=15, Type=16, 
		WS=17;
	public static final int
		RULE_newq = 0, RULE_from = 1, RULE_expense = 2, RULE_call = 3, RULE_define = 4, 
		RULE_where = 5, RULE_condition = 6, RULE_url = 7;
	public static final String[] ruleNames = {
		"newq", "from", "expense", "call", "define", "where", "condition", "url"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'FROM'", "'ID='", "'EXPENSE='", "'TO VENDOR'", "'VENDOR RFP'", 
		"'DEFINE'", "'GOAL'", "'WHERE'", "'AND'", "'URL='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, "Name", 
		"Number", "Currency", "Op", "Category", "Type", "WS"
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
	public String getGrammarFileName() { return "AggregatorQuery.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AggregatorQueryParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class NewqContext extends ParserRuleContext {
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
		public NewqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AggregatorQueryListener ) ((AggregatorQueryListener)listener).enterNewq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AggregatorQueryListener ) ((AggregatorQueryListener)listener).exitNewq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AggregatorQueryVisitor ) return ((AggregatorQueryVisitor<? extends T>)visitor).visitNewq(this);
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
			setState(16);
			from();
			setState(20);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				{
				setState(17);
				expense();
				}
				break;
			case Category:
				{
				setState(18);
				call();
				}
				break;
			case T__5:
				{
				setState(19);
				define();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(23);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(22);
				where();
				}
			}

			setState(26);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(25);
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
		public TerminalNode Name() { return getToken(AggregatorQueryParser.Name, 0); }
		public TerminalNode Number() { return getToken(AggregatorQueryParser.Number, 0); }
		public FromContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AggregatorQueryListener ) ((AggregatorQueryListener)listener).enterFrom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AggregatorQueryListener ) ((AggregatorQueryListener)listener).exitFrom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AggregatorQueryVisitor ) return ((AggregatorQueryVisitor<? extends T>)visitor).visitFrom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromContext from() throws RecognitionException {
		FromContext _localctx = new FromContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_from);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			match(T__0);
			setState(29);
			match(Name);
			setState(30);
			match(T__1);
			setState(31);
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

	public static class ExpenseContext extends ParserRuleContext {
		public TerminalNode Currency() { return getToken(AggregatorQueryParser.Currency, 0); }
		public TerminalNode Number() { return getToken(AggregatorQueryParser.Number, 0); }
		public TerminalNode Name() { return getToken(AggregatorQueryParser.Name, 0); }
		public ExpenseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expense; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AggregatorQueryListener ) ((AggregatorQueryListener)listener).enterExpense(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AggregatorQueryListener ) ((AggregatorQueryListener)listener).exitExpense(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AggregatorQueryVisitor ) return ((AggregatorQueryVisitor<? extends T>)visitor).visitExpense(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpenseContext expense() throws RecognitionException {
		ExpenseContext _localctx = new ExpenseContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expense);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			match(T__2);
			setState(34);
			match(Currency);
			setState(35);
			match(Number);
			setState(36);
			match(T__3);
			setState(37);
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
		public TerminalNode Category() { return getToken(AggregatorQueryParser.Category, 0); }
		public TerminalNode Name() { return getToken(AggregatorQueryParser.Name, 0); }
		public TerminalNode Currency() { return getToken(AggregatorQueryParser.Currency, 0); }
		public TerminalNode Number() { return getToken(AggregatorQueryParser.Number, 0); }
		public CallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AggregatorQueryListener ) ((AggregatorQueryListener)listener).enterCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AggregatorQueryListener ) ((AggregatorQueryListener)listener).exitCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AggregatorQueryVisitor ) return ((AggregatorQueryVisitor<? extends T>)visitor).visitCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallContext call() throws RecognitionException {
		CallContext _localctx = new CallContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(Category);
			setState(40);
			match(Name);
			setState(41);
			match(T__4);
			setState(42);
			match(Currency);
			setState(43);
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
		public TerminalNode Category() { return getToken(AggregatorQueryParser.Category, 0); }
		public TerminalNode Name() { return getToken(AggregatorQueryParser.Name, 0); }
		public TerminalNode Currency() { return getToken(AggregatorQueryParser.Currency, 0); }
		public TerminalNode Number() { return getToken(AggregatorQueryParser.Number, 0); }
		public DefineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AggregatorQueryListener ) ((AggregatorQueryListener)listener).enterDefine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AggregatorQueryListener ) ((AggregatorQueryListener)listener).exitDefine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AggregatorQueryVisitor ) return ((AggregatorQueryVisitor<? extends T>)visitor).visitDefine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefineContext define() throws RecognitionException {
		DefineContext _localctx = new DefineContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_define);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(T__5);
			setState(46);
			match(Category);
			setState(47);
			match(Name);
			setState(48);
			match(T__6);
			setState(49);
			match(Currency);
			setState(50);
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
			if ( listener instanceof AggregatorQueryListener ) ((AggregatorQueryListener)listener).enterWhere(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AggregatorQueryListener ) ((AggregatorQueryListener)listener).exitWhere(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AggregatorQueryVisitor ) return ((AggregatorQueryVisitor<? extends T>)visitor).visitWhere(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereContext where() throws RecognitionException {
		WhereContext _localctx = new WhereContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_where);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(T__7);
			setState(53);
			condition();
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(54);
				match(T__8);
				setState(55);
				condition();
				}
				}
				setState(60);
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
		public TerminalNode Category() { return getToken(AggregatorQueryParser.Category, 0); }
		public TerminalNode Op() { return getToken(AggregatorQueryParser.Op, 0); }
		public TerminalNode Type() { return getToken(AggregatorQueryParser.Type, 0); }
		public TerminalNode Number() { return getToken(AggregatorQueryParser.Number, 0); }
		public TerminalNode Name() { return getToken(AggregatorQueryParser.Name, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AggregatorQueryListener ) ((AggregatorQueryListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AggregatorQueryListener ) ((AggregatorQueryListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AggregatorQueryVisitor ) return ((AggregatorQueryVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(Category);
			setState(62);
			match(Op);
			setState(63);
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

	public static class UrlContext extends ParserRuleContext {
		public TerminalNode Name() { return getToken(AggregatorQueryParser.Name, 0); }
		public UrlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_url; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AggregatorQueryListener ) ((AggregatorQueryListener)listener).enterUrl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AggregatorQueryListener ) ((AggregatorQueryListener)listener).exitUrl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AggregatorQueryVisitor ) return ((AggregatorQueryVisitor<? extends T>)visitor).visitUrl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UrlContext url() throws RecognitionException {
		UrlContext _localctx = new UrlContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_url);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(T__9);
			setState(66);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\23G\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\3\2\5\2"+
		"\27\n\2\3\2\5\2\32\n\2\3\2\5\2\35\n\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\7\7;\n\7\f\7\16\7>\13\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\2\2"+
		"\n\2\4\6\b\n\f\16\20\2\3\4\2\r\16\22\22\2C\2\22\3\2\2\2\4\36\3\2\2\2\6"+
		"#\3\2\2\2\b)\3\2\2\2\n/\3\2\2\2\f\66\3\2\2\2\16?\3\2\2\2\20C\3\2\2\2\22"+
		"\26\5\4\3\2\23\27\5\6\4\2\24\27\5\b\5\2\25\27\5\n\6\2\26\23\3\2\2\2\26"+
		"\24\3\2\2\2\26\25\3\2\2\2\27\31\3\2\2\2\30\32\5\f\7\2\31\30\3\2\2\2\31"+
		"\32\3\2\2\2\32\34\3\2\2\2\33\35\5\20\t\2\34\33\3\2\2\2\34\35\3\2\2\2\35"+
		"\3\3\2\2\2\36\37\7\3\2\2\37 \7\r\2\2 !\7\4\2\2!\"\7\16\2\2\"\5\3\2\2\2"+
		"#$\7\5\2\2$%\7\17\2\2%&\7\16\2\2&\'\7\6\2\2\'(\7\r\2\2(\7\3\2\2\2)*\7"+
		"\21\2\2*+\7\r\2\2+,\7\7\2\2,-\7\17\2\2-.\7\16\2\2.\t\3\2\2\2/\60\7\b\2"+
		"\2\60\61\7\21\2\2\61\62\7\r\2\2\62\63\7\t\2\2\63\64\7\17\2\2\64\65\7\16"+
		"\2\2\65\13\3\2\2\2\66\67\7\n\2\2\67<\5\16\b\289\7\13\2\29;\5\16\b\2:8"+
		"\3\2\2\2;>\3\2\2\2<:\3\2\2\2<=\3\2\2\2=\r\3\2\2\2><\3\2\2\2?@\7\21\2\2"+
		"@A\7\20\2\2AB\t\2\2\2B\17\3\2\2\2CD\7\f\2\2DE\7\r\2\2E\21\3\2\2\2\6\26"+
		"\31\34<";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}