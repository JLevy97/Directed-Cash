// Generated from E:/Directed Cash\VendorQuery.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class VendorQueryParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, Name=8, Number=9, 
		Currency=10, Op=11, Category=12, Type=13, WS=14;
	public static final int
		RULE_newq = 0, RULE_from = 1, RULE_bid = 2, RULE_where = 3, RULE_condition = 4, 
		RULE_url = 5;
	public static final String[] ruleNames = {
		"newq", "from", "bid", "where", "condition", "url"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'FROM'", "'ID='", "'BID'", "'TO'", "'WHERE'", "'AND'", "'URL='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, "Name", "Number", "Currency", 
		"Op", "Category", "Type", "WS"
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
	public String getGrammarFileName() { return "VendorQuery.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public VendorQueryParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class NewqContext extends ParserRuleContext {
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
		public NewqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VendorQueryListener ) ((VendorQueryListener)listener).enterNewq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VendorQueryListener ) ((VendorQueryListener)listener).exitNewq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VendorQueryVisitor ) return ((VendorQueryVisitor<? extends T>)visitor).visitNewq(this);
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
			setState(12);
			from();
			setState(13);
			bid();
			setState(15);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(14);
				where();
				}
			}

			setState(18);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(17);
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
		public TerminalNode Name() { return getToken(VendorQueryParser.Name, 0); }
		public TerminalNode Number() { return getToken(VendorQueryParser.Number, 0); }
		public FromContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VendorQueryListener ) ((VendorQueryListener)listener).enterFrom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VendorQueryListener ) ((VendorQueryListener)listener).exitFrom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VendorQueryVisitor ) return ((VendorQueryVisitor<? extends T>)visitor).visitFrom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromContext from() throws RecognitionException {
		FromContext _localctx = new FromContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_from);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			match(T__0);
			setState(21);
			match(Name);
			setState(22);
			match(T__1);
			setState(23);
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

	public static class BidContext extends ParserRuleContext {
		public TerminalNode Currency() { return getToken(VendorQueryParser.Currency, 0); }
		public TerminalNode Number() { return getToken(VendorQueryParser.Number, 0); }
		public TerminalNode Name() { return getToken(VendorQueryParser.Name, 0); }
		public BidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VendorQueryListener ) ((VendorQueryListener)listener).enterBid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VendorQueryListener ) ((VendorQueryListener)listener).exitBid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VendorQueryVisitor ) return ((VendorQueryVisitor<? extends T>)visitor).visitBid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BidContext bid() throws RecognitionException {
		BidContext _localctx = new BidContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_bid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			match(T__2);
			setState(26);
			match(Currency);
			setState(27);
			match(Number);
			setState(28);
			match(T__3);
			setState(29);
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
			if ( listener instanceof VendorQueryListener ) ((VendorQueryListener)listener).enterWhere(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VendorQueryListener ) ((VendorQueryListener)listener).exitWhere(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VendorQueryVisitor ) return ((VendorQueryVisitor<? extends T>)visitor).visitWhere(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereContext where() throws RecognitionException {
		WhereContext _localctx = new WhereContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_where);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			match(T__4);
			setState(32);
			condition();
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(33);
				match(T__5);
				setState(34);
				condition();
				}
				}
				setState(39);
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
		public TerminalNode Category() { return getToken(VendorQueryParser.Category, 0); }
		public TerminalNode Op() { return getToken(VendorQueryParser.Op, 0); }
		public TerminalNode Type() { return getToken(VendorQueryParser.Type, 0); }
		public TerminalNode Number() { return getToken(VendorQueryParser.Number, 0); }
		public TerminalNode Name() { return getToken(VendorQueryParser.Name, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VendorQueryListener ) ((VendorQueryListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VendorQueryListener ) ((VendorQueryListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VendorQueryVisitor ) return ((VendorQueryVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(Category);
			setState(41);
			match(Op);
			setState(42);
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
		public TerminalNode Name() { return getToken(VendorQueryParser.Name, 0); }
		public UrlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_url; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VendorQueryListener ) ((VendorQueryListener)listener).enterUrl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VendorQueryListener ) ((VendorQueryListener)listener).exitUrl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VendorQueryVisitor ) return ((VendorQueryVisitor<? extends T>)visitor).visitUrl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UrlContext url() throws RecognitionException {
		UrlContext _localctx = new UrlContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_url);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(T__6);
			setState(45);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\20\62\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\5\2\22\n\2\3\2\5\2\25"+
		"\n\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\7\5&"+
		"\n\5\f\5\16\5)\13\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\2\2\b\2\4\6\b\n\f"+
		"\2\3\4\2\n\13\17\17\2.\2\16\3\2\2\2\4\26\3\2\2\2\6\33\3\2\2\2\b!\3\2\2"+
		"\2\n*\3\2\2\2\f.\3\2\2\2\16\17\5\4\3\2\17\21\5\6\4\2\20\22\5\b\5\2\21"+
		"\20\3\2\2\2\21\22\3\2\2\2\22\24\3\2\2\2\23\25\5\f\7\2\24\23\3\2\2\2\24"+
		"\25\3\2\2\2\25\3\3\2\2\2\26\27\7\3\2\2\27\30\7\n\2\2\30\31\7\4\2\2\31"+
		"\32\7\13\2\2\32\5\3\2\2\2\33\34\7\5\2\2\34\35\7\f\2\2\35\36\7\13\2\2\36"+
		"\37\7\6\2\2\37 \7\n\2\2 \7\3\2\2\2!\"\7\7\2\2\"\'\5\n\6\2#$\7\b\2\2$&"+
		"\5\n\6\2%#\3\2\2\2&)\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2(\t\3\2\2\2)\'\3\2\2"+
		"\2*+\7\16\2\2+,\7\r\2\2,-\t\2\2\2-\13\3\2\2\2./\7\t\2\2/\60\7\n\2\2\60"+
		"\r\3\2\2\2\5\21\24\'";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}