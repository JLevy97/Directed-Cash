// Generated from E:/Directed Cash\AggregatorQuery.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AggregatorQueryLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, Name=11, Number=12, Currency=13, Op=14, Category=15, Type=16, 
		WS=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "Name", "Number", "Currency", "Op", "Category", "Type", "WS"
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


	public AggregatorQueryLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "AggregatorQuery.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\23\u00a8\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f"+
		"\6\fi\n\f\r\f\16\fj\3\r\6\rn\n\r\r\r\16\ro\3\16\3\16\3\17\3\17\3\17\5"+
		"\17w\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u008e\n\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\5\21\u00a0\n\21\3\22\6\22\u00a3\n\22\r\22\16\22\u00a4\3\22\3\22\2\2\23"+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23\3\2\5\3\2\62;\4\2&&TT\5\2\13\f\17\17\"\"\2\u00af\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\3"+
		"%\3\2\2\2\5*\3\2\2\2\7.\3\2\2\2\t\67\3\2\2\2\13A\3\2\2\2\rL\3\2\2\2\17"+
		"S\3\2\2\2\21X\3\2\2\2\23^\3\2\2\2\25b\3\2\2\2\27h\3\2\2\2\31m\3\2\2\2"+
		"\33q\3\2\2\2\35v\3\2\2\2\37\u008d\3\2\2\2!\u009f\3\2\2\2#\u00a2\3\2\2"+
		"\2%&\7H\2\2&\'\7T\2\2\'(\7Q\2\2()\7O\2\2)\4\3\2\2\2*+\7K\2\2+,\7F\2\2"+
		",-\7?\2\2-\6\3\2\2\2./\7G\2\2/\60\7Z\2\2\60\61\7R\2\2\61\62\7G\2\2\62"+
		"\63\7P\2\2\63\64\7U\2\2\64\65\7G\2\2\65\66\7?\2\2\66\b\3\2\2\2\678\7V"+
		"\2\289\7Q\2\29:\7\"\2\2:;\7X\2\2;<\7G\2\2<=\7P\2\2=>\7F\2\2>?\7Q\2\2?"+
		"@\7T\2\2@\n\3\2\2\2AB\7X\2\2BC\7G\2\2CD\7P\2\2DE\7F\2\2EF\7Q\2\2FG\7T"+
		"\2\2GH\7\"\2\2HI\7T\2\2IJ\7H\2\2JK\7R\2\2K\f\3\2\2\2LM\7F\2\2MN\7G\2\2"+
		"NO\7H\2\2OP\7K\2\2PQ\7P\2\2QR\7G\2\2R\16\3\2\2\2ST\7I\2\2TU\7Q\2\2UV\7"+
		"C\2\2VW\7N\2\2W\20\3\2\2\2XY\7Y\2\2YZ\7J\2\2Z[\7G\2\2[\\\7T\2\2\\]\7G"+
		"\2\2]\22\3\2\2\2^_\7C\2\2_`\7P\2\2`a\7F\2\2a\24\3\2\2\2bc\7W\2\2cd\7T"+
		"\2\2de\7N\2\2ef\7?\2\2f\26\3\2\2\2gi\4c|\2hg\3\2\2\2ij\3\2\2\2jh\3\2\2"+
		"\2jk\3\2\2\2k\30\3\2\2\2ln\t\2\2\2ml\3\2\2\2no\3\2\2\2om\3\2\2\2op\3\2"+
		"\2\2p\32\3\2\2\2qr\t\3\2\2r\34\3\2\2\2sw\7?\2\2tu\7#\2\2uw\7?\2\2vs\3"+
		"\2\2\2vt\3\2\2\2w\36\3\2\2\2xy\7E\2\2yz\7C\2\2z{\7V\2\2{|\7G\2\2|}\7I"+
		"\2\2}~\7Q\2\2~\177\7T\2\2\177\u008e\7[\2\2\u0080\u0081\7U\2\2\u0081\u0082"+
		"\7E\2\2\u0082\u0083\7J\2\2\u0083\u0084\7G\2\2\u0084\u0085\7O\2\2\u0085"+
		"\u008e\7C\2\2\u0086\u0087\7R\2\2\u0087\u0088\7T\2\2\u0088\u0089\7Q\2\2"+
		"\u0089\u008a\7L\2\2\u008a\u008b\7G\2\2\u008b\u008c\7E\2\2\u008c\u008e"+
		"\7V\2\2\u008dx\3\2\2\2\u008d\u0080\3\2\2\2\u008d\u0086\3\2\2\2\u008e "+
		"\3\2\2\2\u008f\u0090\7H\2\2\u0090\u0091\7Q\2\2\u0091\u0092\7Q\2\2\u0092"+
		"\u00a0\7F\2\2\u0093\u0094\7O\2\2\u0094\u0095\7Q\2\2\u0095\u0096\7P\2\2"+
		"\u0096\u0097\7G\2\2\u0097\u00a0\7[\2\2\u0098\u0099\7E\2\2\u0099\u009a"+
		"\7N\2\2\u009a\u009b\7Q\2\2\u009b\u009c\7V\2\2\u009c\u009d\7J\2\2\u009d"+
		"\u009e\7G\2\2\u009e\u00a0\7U\2\2\u009f\u008f\3\2\2\2\u009f\u0093\3\2\2"+
		"\2\u009f\u0098\3\2\2\2\u00a0\"\3\2\2\2\u00a1\u00a3\t\4\2\2\u00a2\u00a1"+
		"\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5"+
		"\u00a6\3\2\2\2\u00a6\u00a7\b\22\2\2\u00a7$\3\2\2\2\t\2jov\u008d\u009f"+
		"\u00a4\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}