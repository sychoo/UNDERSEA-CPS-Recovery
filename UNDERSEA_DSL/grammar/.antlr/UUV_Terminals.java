// Generated from /Users/rockita/Code/proj/undersea/UNDERSEA/UNDERSEA_DSL/grammar/UUV_Terminals.g4 by ANTLR 4.9.2

  package uuv.dsl.gen;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class UUV_Terminals extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ASSIGN=1, SERVER_HOST=2, SERVER_PORT=3, SIMULATION_TIME=4, TIME_WINDOW=5, 
		SIMULATION_SPEED=6, SPEED=7, NAME=8, RATE=9, CHANGE=10, RELIABILITY=11, 
		SLCOMMENT=12, ID=13, INT=14, DOUBLE=15, IP=16, OCTET=17, STRING=18, WS=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ASSIGN", "SERVER_HOST", "SERVER_PORT", "SIMULATION_TIME", "TIME_WINDOW", 
			"SIMULATION_SPEED", "SPEED", "NAME", "RATE", "CHANGE", "RELIABILITY", 
			"SLCOMMENT", "ID", "INT", "DOUBLE", "IP", "OCTET", "STRING", "WS", "DIGIT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'host'", "'port'", "'simulation time'", "'time window'", 
			"'simulation speed'", "'speed'", "'name'", "'rate'", "'change'", "'reliability'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ASSIGN", "SERVER_HOST", "SERVER_PORT", "SIMULATION_TIME", "TIME_WINDOW", 
			"SIMULATION_SPEED", "SPEED", "NAME", "RATE", "CHANGE", "RELIABILITY", 
			"SLCOMMENT", "ID", "INT", "DOUBLE", "IP", "OCTET", "STRING", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public UUV_Terminals(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "UUV_Terminals.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\25\u00cd\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r"+
		"\3\r\3\r\7\r\u008c\n\r\f\r\16\r\u008f\13\r\3\r\5\r\u0092\n\r\3\r\3\r\3"+
		"\r\3\r\3\16\3\16\7\16\u009a\n\16\f\16\16\16\u009d\13\16\3\17\6\17\u00a0"+
		"\n\17\r\17\16\17\u00a1\3\20\5\20\u00a5\n\20\3\20\3\20\3\20\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5"+
		"\22\u00ba\n\22\3\23\3\23\7\23\u00be\n\23\f\23\16\23\u00c1\13\23\3\23\3"+
		"\23\3\24\6\24\u00c6\n\24\r\24\16\24\u00c7\3\24\3\24\3\25\3\25\3\u008d"+
		"\2\26\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\2\3\2\7\5\2C\\aac|\6\2\62;C\\aac|\3\2\62;"+
		"\4\2$$^^\5\2\13\f\17\17\"\"\2\u00d4\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\3+\3\2"+
		"\2\2\5-\3\2\2\2\7\62\3\2\2\2\t\67\3\2\2\2\13G\3\2\2\2\rS\3\2\2\2\17d\3"+
		"\2\2\2\21j\3\2\2\2\23o\3\2\2\2\25t\3\2\2\2\27{\3\2\2\2\31\u0087\3\2\2"+
		"\2\33\u0097\3\2\2\2\35\u009f\3\2\2\2\37\u00a4\3\2\2\2!\u00a9\3\2\2\2#"+
		"\u00b9\3\2\2\2%\u00bb\3\2\2\2\'\u00c5\3\2\2\2)\u00cb\3\2\2\2+,\7?\2\2"+
		",\4\3\2\2\2-.\7j\2\2./\7q\2\2/\60\7u\2\2\60\61\7v\2\2\61\6\3\2\2\2\62"+
		"\63\7r\2\2\63\64\7q\2\2\64\65\7t\2\2\65\66\7v\2\2\66\b\3\2\2\2\678\7u"+
		"\2\289\7k\2\29:\7o\2\2:;\7w\2\2;<\7n\2\2<=\7c\2\2=>\7v\2\2>?\7k\2\2?@"+
		"\7q\2\2@A\7p\2\2AB\7\"\2\2BC\7v\2\2CD\7k\2\2DE\7o\2\2EF\7g\2\2F\n\3\2"+
		"\2\2GH\7v\2\2HI\7k\2\2IJ\7o\2\2JK\7g\2\2KL\7\"\2\2LM\7y\2\2MN\7k\2\2N"+
		"O\7p\2\2OP\7f\2\2PQ\7q\2\2QR\7y\2\2R\f\3\2\2\2ST\7u\2\2TU\7k\2\2UV\7o"+
		"\2\2VW\7w\2\2WX\7n\2\2XY\7c\2\2YZ\7v\2\2Z[\7k\2\2[\\\7q\2\2\\]\7p\2\2"+
		"]^\7\"\2\2^_\7u\2\2_`\7r\2\2`a\7g\2\2ab\7g\2\2bc\7f\2\2c\16\3\2\2\2de"+
		"\7u\2\2ef\7r\2\2fg\7g\2\2gh\7g\2\2hi\7f\2\2i\20\3\2\2\2jk\7p\2\2kl\7c"+
		"\2\2lm\7o\2\2mn\7g\2\2n\22\3\2\2\2op\7t\2\2pq\7c\2\2qr\7v\2\2rs\7g\2\2"+
		"s\24\3\2\2\2tu\7e\2\2uv\7j\2\2vw\7c\2\2wx\7p\2\2xy\7i\2\2yz\7g\2\2z\26"+
		"\3\2\2\2{|\7t\2\2|}\7g\2\2}~\7n\2\2~\177\7k\2\2\177\u0080\7c\2\2\u0080"+
		"\u0081\7d\2\2\u0081\u0082\7k\2\2\u0082\u0083\7n\2\2\u0083\u0084\7k\2\2"+
		"\u0084\u0085\7v\2\2\u0085\u0086\7{\2\2\u0086\30\3\2\2\2\u0087\u0088\7"+
		"\61\2\2\u0088\u0089\7\61\2\2\u0089\u008d\3\2\2\2\u008a\u008c\13\2\2\2"+
		"\u008b\u008a\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008e\3\2\2\2\u008d\u008b"+
		"\3\2\2\2\u008e\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u0092\7\17\2\2"+
		"\u0091\u0090\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0094"+
		"\7\f\2\2\u0094\u0095\3\2\2\2\u0095\u0096\b\r\2\2\u0096\32\3\2\2\2\u0097"+
		"\u009b\t\2\2\2\u0098\u009a\t\3\2\2\u0099\u0098\3\2\2\2\u009a\u009d\3\2"+
		"\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\34\3\2\2\2\u009d\u009b"+
		"\3\2\2\2\u009e\u00a0\t\4\2\2\u009f\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1"+
		"\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\36\3\2\2\2\u00a3\u00a5\5\35\17"+
		"\2\u00a4\u00a3\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7"+
		"\7\60\2\2\u00a7\u00a8\5\35\17\2\u00a8 \3\2\2\2\u00a9\u00aa\5#\22\2\u00aa"+
		"\u00ab\7\60\2\2\u00ab\u00ac\5#\22\2\u00ac\u00ad\7\60\2\2\u00ad\u00ae\5"+
		"#\22\2\u00ae\u00af\7\60\2\2\u00af\u00b0\5#\22\2\u00b0\"\3\2\2\2\u00b1"+
		"\u00b2\5)\25\2\u00b2\u00b3\5)\25\2\u00b3\u00b4\5)\25\2\u00b4\u00ba\3\2"+
		"\2\2\u00b5\u00b6\5)\25\2\u00b6\u00b7\5)\25\2\u00b7\u00ba\3\2\2\2\u00b8"+
		"\u00ba\5)\25\2\u00b9\u00b1\3\2\2\2\u00b9\u00b5\3\2\2\2\u00b9\u00b8\3\2"+
		"\2\2\u00ba$\3\2\2\2\u00bb\u00bf\7$\2\2\u00bc\u00be\n\5\2\2\u00bd\u00bc"+
		"\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0"+
		"\u00c2\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00c3\7$\2\2\u00c3&\3\2\2\2\u00c4"+
		"\u00c6\t\6\2\2\u00c5\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c5\3\2"+
		"\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00ca\b\24\2\2\u00ca"+
		"(\3\2\2\2\u00cb\u00cc\4\62;\2\u00cc*\3\2\2\2\13\2\u008d\u0091\u009b\u00a1"+
		"\u00a4\u00b9\u00bf\u00c7\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}