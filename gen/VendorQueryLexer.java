// Generated from E:/Directed Cash\VendorQuery.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class VendorQueryLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, Name=8, Number=9, 
		Currency=10, Op=11, Category=12, Type=13, WS=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "Name", "Number", 
		"Currency", "Op", "Category", "Type", "WS"
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


	public VendorQueryLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "VendorQuery.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\20\177\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\6\t@\n\t\r\t\16\tA\3\n\6\nE\n\n\r\n\16"+
		"\nF\3\13\3\13\3\f\3\f\3\f\5\fN\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\re\n\r\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5"+
		"\16w\n\16\3\17\6\17z\n\17\r\17\16\17{\3\17\3\17\2\2\20\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\3\2\5\3\2\62;\4"+
		"\2&&TT\5\2\13\f\17\17\"\"\2\u0086\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\3\37\3\2\2\2\5$\3\2\2\2\7(\3\2\2\2\t,\3\2\2\2\13/\3\2\2\2\r\65\3\2"+
		"\2\2\179\3\2\2\2\21?\3\2\2\2\23D\3\2\2\2\25H\3\2\2\2\27M\3\2\2\2\31d\3"+
		"\2\2\2\33v\3\2\2\2\35y\3\2\2\2\37 \7H\2\2 !\7T\2\2!\"\7Q\2\2\"#\7O\2\2"+
		"#\4\3\2\2\2$%\7K\2\2%&\7F\2\2&\'\7?\2\2\'\6\3\2\2\2()\7D\2\2)*\7K\2\2"+
		"*+\7F\2\2+\b\3\2\2\2,-\7V\2\2-.\7Q\2\2.\n\3\2\2\2/\60\7Y\2\2\60\61\7J"+
		"\2\2\61\62\7G\2\2\62\63\7T\2\2\63\64\7G\2\2\64\f\3\2\2\2\65\66\7C\2\2"+
		"\66\67\7P\2\2\678\7F\2\28\16\3\2\2\29:\7W\2\2:;\7T\2\2;<\7N\2\2<=\7?\2"+
		"\2=\20\3\2\2\2>@\4c|\2?>\3\2\2\2@A\3\2\2\2A?\3\2\2\2AB\3\2\2\2B\22\3\2"+
		"\2\2CE\t\2\2\2DC\3\2\2\2EF\3\2\2\2FD\3\2\2\2FG\3\2\2\2G\24\3\2\2\2HI\t"+
		"\3\2\2I\26\3\2\2\2JN\7?\2\2KL\7#\2\2LN\7?\2\2MJ\3\2\2\2MK\3\2\2\2N\30"+
		"\3\2\2\2OP\7E\2\2PQ\7C\2\2QR\7V\2\2RS\7G\2\2ST\7I\2\2TU\7Q\2\2UV\7T\2"+
		"\2Ve\7[\2\2WX\7U\2\2XY\7E\2\2YZ\7J\2\2Z[\7G\2\2[\\\7O\2\2\\e\7C\2\2]^"+
		"\7R\2\2^_\7T\2\2_`\7Q\2\2`a\7L\2\2ab\7G\2\2bc\7E\2\2ce\7V\2\2dO\3\2\2"+
		"\2dW\3\2\2\2d]\3\2\2\2e\32\3\2\2\2fg\7H\2\2gh\7Q\2\2hi\7Q\2\2iw\7F\2\2"+
		"jk\7O\2\2kl\7Q\2\2lm\7P\2\2mn\7G\2\2nw\7[\2\2op\7E\2\2pq\7N\2\2qr\7Q\2"+
		"\2rs\7V\2\2st\7J\2\2tu\7G\2\2uw\7U\2\2vf\3\2\2\2vj\3\2\2\2vo\3\2\2\2w"+
		"\34\3\2\2\2xz\t\4\2\2yx\3\2\2\2z{\3\2\2\2{y\3\2\2\2{|\3\2\2\2|}\3\2\2"+
		"\2}~\b\17\2\2~\36\3\2\2\2\t\2AFMdv{\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}