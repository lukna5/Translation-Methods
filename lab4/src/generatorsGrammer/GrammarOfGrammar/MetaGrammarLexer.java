// Generated from MetaGrammar.g4 by ANTLR 4.12.0

package generatorsGrammer.GrammarOfGrammar;
import generatorsGrammer.grammar.*;
import java.util.*;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class MetaGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, LEFT_COMP=2, RIGHT_COMP=3, COMMA=4, SEMICOLON=5, SEPARATOR=6, LEFT_BRACE=7, 
		RIGHT_BRACE=8, LEFT_BRACKET=9, RIGHT_BRACKET=10, RETURNS=11, GRAMMAR=12, 
		EPS=13, ARROW=14, COLON=15, CODE=16, INHER_ATTR=17, SYNT_ATTR=18, WORD_WITH_ALL_CAPITALIZED=19, 
		WORD_START_WITH_CAPITALIZED=20, WORD_START_WITH_SMALL=21, REGEXP=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"WS", "LEFT_COMP", "RIGHT_COMP", "COMMA", "SEMICOLON", "SEPARATOR", "LEFT_BRACE", 
			"RIGHT_BRACE", "LEFT_BRACKET", "RIGHT_BRACKET", "RETURNS", "GRAMMAR", 
			"EPS", "ARROW", "COLON", "CODE", "INHER_ATTR", "SYNT_ATTR", "WORD_WITH_ALL_CAPITALIZED", 
			"WORD_START_WITH_CAPITALIZED", "WORD_START_WITH_SMALL", "REGEXP"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'<'", "'>'", "','", "';'", "'|'", "'{'", "'}'", "'['", "']'", 
			"'returns'", "'grammar'", "'eps'", "'->'", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "LEFT_COMP", "RIGHT_COMP", "COMMA", "SEMICOLON", "SEPARATOR", 
			"LEFT_BRACE", "RIGHT_BRACE", "LEFT_BRACKET", "RIGHT_BRACKET", "RETURNS", 
			"GRAMMAR", "EPS", "ARROW", "COLON", "CODE", "INHER_ATTR", "SYNT_ATTR", 
			"WORD_WITH_ALL_CAPITALIZED", "WORD_START_WITH_CAPITALIZED", "WORD_START_WITH_SMALL", 
			"REGEXP"
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


	public MetaGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MetaGrammar.g4"; }

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
		"\u0004\u0000\u0016\u009e\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0001\u0000\u0004\u0000/\b\u0000\u000b\u0000"+
		"\f\u00000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0005"+
		"\u000fb\b\u000f\n\u000f\f\u000fe\t\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0005\u0010k\b\u0010\n\u0010\f\u0010n\t\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0005\u0011t\b\u0011\n\u0011"+
		"\f\u0011w\t\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0004\u0012|\b\u0012"+
		"\u000b\u0012\f\u0012}\u0001\u0013\u0004\u0013\u0081\b\u0013\u000b\u0013"+
		"\f\u0013\u0082\u0001\u0013\u0005\u0013\u0086\b\u0013\n\u0013\f\u0013\u0089"+
		"\t\u0013\u0001\u0014\u0004\u0014\u008c\b\u0014\u000b\u0014\f\u0014\u008d"+
		"\u0001\u0014\u0005\u0014\u0091\b\u0014\n\u0014\f\u0014\u0094\t\u0014\u0001"+
		"\u0015\u0001\u0015\u0005\u0015\u0098\b\u0015\n\u0015\f\u0015\u009b\t\u0015"+
		"\u0001\u0015\u0001\u0015\u0004clu\u0099\u0000\u0016\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011"+
		"\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010"+
		"!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016\u0001\u0000\u0004\u0003\u0000"+
		"\t\n\r\r  \u0001\u0000AZ\u0002\u0000AZaz\u0001\u0000az\u00a7\u0000\u0001"+
		"\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005"+
		"\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001"+
		"\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000"+
		"\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000"+
		"\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000"+
		"\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000"+
		"\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000"+
		"\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000"+
		"\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000"+
		"\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001"+
		"\u0000\u0000\u0000\u0001.\u0001\u0000\u0000\u0000\u00034\u0001\u0000\u0000"+
		"\u0000\u00056\u0001\u0000\u0000\u0000\u00078\u0001\u0000\u0000\u0000\t"+
		":\u0001\u0000\u0000\u0000\u000b<\u0001\u0000\u0000\u0000\r>\u0001\u0000"+
		"\u0000\u0000\u000f@\u0001\u0000\u0000\u0000\u0011B\u0001\u0000\u0000\u0000"+
		"\u0013D\u0001\u0000\u0000\u0000\u0015F\u0001\u0000\u0000\u0000\u0017N"+
		"\u0001\u0000\u0000\u0000\u0019V\u0001\u0000\u0000\u0000\u001bZ\u0001\u0000"+
		"\u0000\u0000\u001d]\u0001\u0000\u0000\u0000\u001f_\u0001\u0000\u0000\u0000"+
		"!h\u0001\u0000\u0000\u0000#q\u0001\u0000\u0000\u0000%{\u0001\u0000\u0000"+
		"\u0000\'\u0080\u0001\u0000\u0000\u0000)\u008b\u0001\u0000\u0000\u0000"+
		"+\u0095\u0001\u0000\u0000\u0000-/\u0007\u0000\u0000\u0000.-\u0001\u0000"+
		"\u0000\u0000/0\u0001\u0000\u0000\u00000.\u0001\u0000\u0000\u000001\u0001"+
		"\u0000\u0000\u000012\u0001\u0000\u0000\u000023\u0006\u0000\u0000\u0000"+
		"3\u0002\u0001\u0000\u0000\u000045\u0005<\u0000\u00005\u0004\u0001\u0000"+
		"\u0000\u000067\u0005>\u0000\u00007\u0006\u0001\u0000\u0000\u000089\u0005"+
		",\u0000\u00009\b\u0001\u0000\u0000\u0000:;\u0005;\u0000\u0000;\n\u0001"+
		"\u0000\u0000\u0000<=\u0005|\u0000\u0000=\f\u0001\u0000\u0000\u0000>?\u0005"+
		"{\u0000\u0000?\u000e\u0001\u0000\u0000\u0000@A\u0005}\u0000\u0000A\u0010"+
		"\u0001\u0000\u0000\u0000BC\u0005[\u0000\u0000C\u0012\u0001\u0000\u0000"+
		"\u0000DE\u0005]\u0000\u0000E\u0014\u0001\u0000\u0000\u0000FG\u0005r\u0000"+
		"\u0000GH\u0005e\u0000\u0000HI\u0005t\u0000\u0000IJ\u0005u\u0000\u0000"+
		"JK\u0005r\u0000\u0000KL\u0005n\u0000\u0000LM\u0005s\u0000\u0000M\u0016"+
		"\u0001\u0000\u0000\u0000NO\u0005g\u0000\u0000OP\u0005r\u0000\u0000PQ\u0005"+
		"a\u0000\u0000QR\u0005m\u0000\u0000RS\u0005m\u0000\u0000ST\u0005a\u0000"+
		"\u0000TU\u0005r\u0000\u0000U\u0018\u0001\u0000\u0000\u0000VW\u0005e\u0000"+
		"\u0000WX\u0005p\u0000\u0000XY\u0005s\u0000\u0000Y\u001a\u0001\u0000\u0000"+
		"\u0000Z[\u0005-\u0000\u0000[\\\u0005>\u0000\u0000\\\u001c\u0001\u0000"+
		"\u0000\u0000]^\u0005:\u0000\u0000^\u001e\u0001\u0000\u0000\u0000_c\u0003"+
		"\r\u0006\u0000`b\t\u0000\u0000\u0000a`\u0001\u0000\u0000\u0000be\u0001"+
		"\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000"+
		"df\u0001\u0000\u0000\u0000ec\u0001\u0000\u0000\u0000fg\u0003\u000f\u0007"+
		"\u0000g \u0001\u0000\u0000\u0000hl\u0003\u0003\u0001\u0000ik\t\u0000\u0000"+
		"\u0000ji\u0001\u0000\u0000\u0000kn\u0001\u0000\u0000\u0000lm\u0001\u0000"+
		"\u0000\u0000lj\u0001\u0000\u0000\u0000mo\u0001\u0000\u0000\u0000nl\u0001"+
		"\u0000\u0000\u0000op\u0003\u0005\u0002\u0000p\"\u0001\u0000\u0000\u0000"+
		"qu\u0003\u0011\b\u0000rt\t\u0000\u0000\u0000sr\u0001\u0000\u0000\u0000"+
		"tw\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000us\u0001\u0000\u0000"+
		"\u0000vx\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000xy\u0003\u0013"+
		"\t\u0000y$\u0001\u0000\u0000\u0000z|\u0007\u0001\u0000\u0000{z\u0001\u0000"+
		"\u0000\u0000|}\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000}~\u0001"+
		"\u0000\u0000\u0000~&\u0001\u0000\u0000\u0000\u007f\u0081\u0007\u0001\u0000"+
		"\u0000\u0080\u007f\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000\u0000"+
		"\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0082\u0083\u0001\u0000\u0000"+
		"\u0000\u0083\u0087\u0001\u0000\u0000\u0000\u0084\u0086\u0007\u0002\u0000"+
		"\u0000\u0085\u0084\u0001\u0000\u0000\u0000\u0086\u0089\u0001\u0000\u0000"+
		"\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000"+
		"\u0000\u0088(\u0001\u0000\u0000\u0000\u0089\u0087\u0001\u0000\u0000\u0000"+
		"\u008a\u008c\u0007\u0003\u0000\u0000\u008b\u008a\u0001\u0000\u0000\u0000"+
		"\u008c\u008d\u0001\u0000\u0000\u0000\u008d\u008b\u0001\u0000\u0000\u0000"+
		"\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u0092\u0001\u0000\u0000\u0000"+
		"\u008f\u0091\u0007\u0002\u0000\u0000\u0090\u008f\u0001\u0000\u0000\u0000"+
		"\u0091\u0094\u0001\u0000\u0000\u0000\u0092\u0090\u0001\u0000\u0000\u0000"+
		"\u0092\u0093\u0001\u0000\u0000\u0000\u0093*\u0001\u0000\u0000\u0000\u0094"+
		"\u0092\u0001\u0000\u0000\u0000\u0095\u0099\u0005\"\u0000\u0000\u0096\u0098"+
		"\t\u0000\u0000\u0000\u0097\u0096\u0001\u0000\u0000\u0000\u0098\u009b\u0001"+
		"\u0000\u0000\u0000\u0099\u009a\u0001\u0000\u0000\u0000\u0099\u0097\u0001"+
		"\u0000\u0000\u0000\u009a\u009c\u0001\u0000\u0000\u0000\u009b\u0099\u0001"+
		"\u0000\u0000\u0000\u009c\u009d\u0005\"\u0000\u0000\u009d,\u0001\u0000"+
		"\u0000\u0000\u000b\u00000clu}\u0082\u0087\u008d\u0092\u0099\u0001\u0006"+
		"\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}