// Generated from M:/Year_3/CE305/Ass1/src\language.g4 by ANTLR 4.7.2
package grammar;

    import java.util.HashMap;
    import java.util.ArrayList;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class languageLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LineEnd=1, Assign=2, Open_Bracket=3, Close_Bracket=4, Open_Brace=5, Close_Brace=6, 
		IF=7, ELIF=8, ELSE=9, WHILE=10, PRINT=11, Compile=12, Char=13, Int=14, 
		Float=15, Bool=16, DecInt=17, DecFloat=18, DecBool=19, ET=20, NET=21, 
		GT=22, GTET=23, LT=24, LTET=25, AND=26, OR=27, Sum=28, Subtract=29, Multiply=30, 
		Divide=31, Modulo=32, WS=33;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LineEnd", "Assign", "Open_Bracket", "Close_Bracket", "Open_Brace", "Close_Brace", 
			"IF", "ELIF", "ELSE", "WHILE", "PRINT", "Compile", "Char", "Int", "Float", 
			"Bool", "DecInt", "DecFloat", "DecBool", "ET", "NET", "GT", "GTET", "LT", 
			"LTET", "AND", "OR", "Sum", "Subtract", "Multiply", "Divide", "Modulo", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'='", "'('", "')'", "'{'", "'}'", "'IF'", "'ELIF'", "'ELSE'", 
			"'WHILE'", "'PRINT'", "'COMPILE'", null, null, null, null, "'INT'", "'FLOAT'", 
			"'BOOL'", "'=='", "'!='", "'>'", "'>='", "'<'", "'<='", "'&'", "'|'", 
			"'+'", "'-'", "'*'", "'/'", "'%'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LineEnd", "Assign", "Open_Bracket", "Close_Bracket", "Open_Brace", 
			"Close_Brace", "IF", "ELIF", "ELSE", "WHILE", "PRINT", "Compile", "Char", 
			"Int", "Float", "Bool", "DecInt", "DecFloat", "DecBool", "ET", "NET", 
			"GT", "GTET", "LT", "LTET", "AND", "OR", "Sum", "Subtract", "Multiply", 
			"Divide", "Modulo", "WS"
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


	    /*varType stores the variable type, using same key as other map*/
	    private HashMap<String, String> variableType = new HashMap<>();
	    private HashMap<String, String> variableValue = new HashMap<>();
	    public ArrayList<String> errors = new ArrayList<>();
	    private int indentLevel = 0;
	    private String tab = "    ";

	    private String tab() {
	        String toReturn = "";
	        for (int i = 0; i < indentLevel; i++) {
	            toReturn += tab;
	        }
	        return toReturn;
	    };


	public languageLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "language.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2#\u00c6\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3"+
		"\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\6\16"+
		"t\n\16\r\16\16\16u\3\17\6\17y\n\17\r\17\16\17z\3\20\6\20~\n\20\r\20\16"+
		"\20\177\3\20\3\20\6\20\u0084\n\20\r\20\16\20\u0085\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\5\21\u0091\n\21\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\34"+
		"\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\6\"\u00c1\n\"\r\""+
		"\16\"\u00c2\3\"\3\"\2\2#\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63"+
		"\33\65\34\67\359\36;\37= ?!A\"C#\3\2\5\3\2c|\3\2\62;\5\2\13\f\17\17\""+
		"\"\2\u00cb\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\3E\3\2\2\2"+
		"\5G\3\2\2\2\7I\3\2\2\2\tK\3\2\2\2\13M\3\2\2\2\rO\3\2\2\2\17Q\3\2\2\2\21"+
		"T\3\2\2\2\23Y\3\2\2\2\25^\3\2\2\2\27d\3\2\2\2\31j\3\2\2\2\33s\3\2\2\2"+
		"\35x\3\2\2\2\37}\3\2\2\2!\u0090\3\2\2\2#\u0092\3\2\2\2%\u0096\3\2\2\2"+
		"\'\u009c\3\2\2\2)\u00a1\3\2\2\2+\u00a4\3\2\2\2-\u00a7\3\2\2\2/\u00a9\3"+
		"\2\2\2\61\u00ac\3\2\2\2\63\u00ae\3\2\2\2\65\u00b1\3\2\2\2\67\u00b3\3\2"+
		"\2\29\u00b5\3\2\2\2;\u00b7\3\2\2\2=\u00b9\3\2\2\2?\u00bb\3\2\2\2A\u00bd"+
		"\3\2\2\2C\u00c0\3\2\2\2EF\7=\2\2F\4\3\2\2\2GH\7?\2\2H\6\3\2\2\2IJ\7*\2"+
		"\2J\b\3\2\2\2KL\7+\2\2L\n\3\2\2\2MN\7}\2\2N\f\3\2\2\2OP\7\177\2\2P\16"+
		"\3\2\2\2QR\7K\2\2RS\7H\2\2S\20\3\2\2\2TU\7G\2\2UV\7N\2\2VW\7K\2\2WX\7"+
		"H\2\2X\22\3\2\2\2YZ\7G\2\2Z[\7N\2\2[\\\7U\2\2\\]\7G\2\2]\24\3\2\2\2^_"+
		"\7Y\2\2_`\7J\2\2`a\7K\2\2ab\7N\2\2bc\7G\2\2c\26\3\2\2\2de\7R\2\2ef\7T"+
		"\2\2fg\7K\2\2gh\7P\2\2hi\7V\2\2i\30\3\2\2\2jk\7E\2\2kl\7Q\2\2lm\7O\2\2"+
		"mn\7R\2\2no\7K\2\2op\7N\2\2pq\7G\2\2q\32\3\2\2\2rt\t\2\2\2sr\3\2\2\2t"+
		"u\3\2\2\2us\3\2\2\2uv\3\2\2\2v\34\3\2\2\2wy\t\3\2\2xw\3\2\2\2yz\3\2\2"+
		"\2zx\3\2\2\2z{\3\2\2\2{\36\3\2\2\2|~\t\3\2\2}|\3\2\2\2~\177\3\2\2\2\177"+
		"}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0083\7\60\2\2\u0082"+
		"\u0084\t\3\2\2\u0083\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0083\3\2"+
		"\2\2\u0085\u0086\3\2\2\2\u0086 \3\2\2\2\u0087\u0088\7V\2\2\u0088\u0089"+
		"\7t\2\2\u0089\u008a\7w\2\2\u008a\u0091\7g\2\2\u008b\u008c\7H\2\2\u008c"+
		"\u008d\7c\2\2\u008d\u008e\7n\2\2\u008e\u008f\7u\2\2\u008f\u0091\7g\2\2"+
		"\u0090\u0087\3\2\2\2\u0090\u008b\3\2\2\2\u0091\"\3\2\2\2\u0092\u0093\7"+
		"K\2\2\u0093\u0094\7P\2\2\u0094\u0095\7V\2\2\u0095$\3\2\2\2\u0096\u0097"+
		"\7H\2\2\u0097\u0098\7N\2\2\u0098\u0099\7Q\2\2\u0099\u009a\7C\2\2\u009a"+
		"\u009b\7V\2\2\u009b&\3\2\2\2\u009c\u009d\7D\2\2\u009d\u009e\7Q\2\2\u009e"+
		"\u009f\7Q\2\2\u009f\u00a0\7N\2\2\u00a0(\3\2\2\2\u00a1\u00a2\7?\2\2\u00a2"+
		"\u00a3\7?\2\2\u00a3*\3\2\2\2\u00a4\u00a5\7#\2\2\u00a5\u00a6\7?\2\2\u00a6"+
		",\3\2\2\2\u00a7\u00a8\7@\2\2\u00a8.\3\2\2\2\u00a9\u00aa\7@\2\2\u00aa\u00ab"+
		"\7?\2\2\u00ab\60\3\2\2\2\u00ac\u00ad\7>\2\2\u00ad\62\3\2\2\2\u00ae\u00af"+
		"\7>\2\2\u00af\u00b0\7?\2\2\u00b0\64\3\2\2\2\u00b1\u00b2\7(\2\2\u00b2\66"+
		"\3\2\2\2\u00b3\u00b4\7~\2\2\u00b48\3\2\2\2\u00b5\u00b6\7-\2\2\u00b6:\3"+
		"\2\2\2\u00b7\u00b8\7/\2\2\u00b8<\3\2\2\2\u00b9\u00ba\7,\2\2\u00ba>\3\2"+
		"\2\2\u00bb\u00bc\7\61\2\2\u00bc@\3\2\2\2\u00bd\u00be\7\'\2\2\u00beB\3"+
		"\2\2\2\u00bf\u00c1\t\4\2\2\u00c0\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2"+
		"\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5\b\""+
		"\2\2\u00c5D\3\2\2\2\t\2uz\177\u0085\u0090\u00c2\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}