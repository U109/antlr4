// Generated from F:/antlr/src/main/java/com/zzz/self/plsql\PlSql.g4 by ANTLR 4.12.0
package com.zzz.self.plsql;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class PlSqlLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, Identifier=7, Operator=8, 
		Value=9, WS=10;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "Identifier", "Operator", 
			"Value", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'SELECT'", "'*'", "','", "'.'", "'FROM'", "'WHERE'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "Identifier", "Operator", "Value", 
			"WS"
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


	public PlSqlLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PlSql.g4"; }

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
		"\u0004\u0000\nP\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0004\u0006/\b"+
		"\u0006\u000b\u0006\f\u00060\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007:\b\u0007\u0001"+
		"\b\u0004\b=\b\b\u000b\b\f\b>\u0001\b\u0001\b\u0004\bC\b\b\u000b\b\f\b"+
		"D\u0001\b\u0003\bH\b\b\u0001\t\u0004\tK\b\t\u000b\t\f\tL\u0001\t\u0001"+
		"\t\u0000\u0000\n\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005"+
		"\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0001\u0000\u0004\u0002\u0000"+
		"AZaz\u0001\u000009\u0003\u000009AZaz\u0003\u0000\t\n\r\r  W\u0000\u0001"+
		"\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005"+
		"\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001"+
		"\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000"+
		"\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000"+
		"\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0001\u0015\u0001\u0000"+
		"\u0000\u0000\u0003\u001c\u0001\u0000\u0000\u0000\u0005\u001e\u0001\u0000"+
		"\u0000\u0000\u0007 \u0001\u0000\u0000\u0000\t\"\u0001\u0000\u0000\u0000"+
		"\u000b\'\u0001\u0000\u0000\u0000\r.\u0001\u0000\u0000\u0000\u000f9\u0001"+
		"\u0000\u0000\u0000\u0011G\u0001\u0000\u0000\u0000\u0013J\u0001\u0000\u0000"+
		"\u0000\u0015\u0016\u0005S\u0000\u0000\u0016\u0017\u0005E\u0000\u0000\u0017"+
		"\u0018\u0005L\u0000\u0000\u0018\u0019\u0005E\u0000\u0000\u0019\u001a\u0005"+
		"C\u0000\u0000\u001a\u001b\u0005T\u0000\u0000\u001b\u0002\u0001\u0000\u0000"+
		"\u0000\u001c\u001d\u0005*\u0000\u0000\u001d\u0004\u0001\u0000\u0000\u0000"+
		"\u001e\u001f\u0005,\u0000\u0000\u001f\u0006\u0001\u0000\u0000\u0000 !"+
		"\u0005.\u0000\u0000!\b\u0001\u0000\u0000\u0000\"#\u0005F\u0000\u0000#"+
		"$\u0005R\u0000\u0000$%\u0005O\u0000\u0000%&\u0005M\u0000\u0000&\n\u0001"+
		"\u0000\u0000\u0000\'(\u0005W\u0000\u0000()\u0005H\u0000\u0000)*\u0005"+
		"E\u0000\u0000*+\u0005R\u0000\u0000+,\u0005E\u0000\u0000,\f\u0001\u0000"+
		"\u0000\u0000-/\u0007\u0000\u0000\u0000.-\u0001\u0000\u0000\u0000/0\u0001"+
		"\u0000\u0000\u00000.\u0001\u0000\u0000\u000001\u0001\u0000\u0000\u0000"+
		"1\u000e\u0001\u0000\u0000\u00002:\u0002<>\u000034\u0005<\u0000\u00004"+
		":\u0005=\u0000\u000056\u0005>\u0000\u00006:\u0005=\u0000\u000078\u0005"+
		"<\u0000\u00008:\u0005>\u0000\u000092\u0001\u0000\u0000\u000093\u0001\u0000"+
		"\u0000\u000095\u0001\u0000\u0000\u000097\u0001\u0000\u0000\u0000:\u0010"+
		"\u0001\u0000\u0000\u0000;=\u0007\u0001\u0000\u0000<;\u0001\u0000\u0000"+
		"\u0000=>\u0001\u0000\u0000\u0000><\u0001\u0000\u0000\u0000>?\u0001\u0000"+
		"\u0000\u0000?H\u0001\u0000\u0000\u0000@B\u0005\'\u0000\u0000AC\u0007\u0002"+
		"\u0000\u0000BA\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000DB\u0001"+
		"\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000"+
		"FH\u0005\'\u0000\u0000G<\u0001\u0000\u0000\u0000G@\u0001\u0000\u0000\u0000"+
		"H\u0012\u0001\u0000\u0000\u0000IK\u0007\u0003\u0000\u0000JI\u0001\u0000"+
		"\u0000\u0000KL\u0001\u0000\u0000\u0000LJ\u0001\u0000\u0000\u0000LM\u0001"+
		"\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000NO\u0006\t\u0000\u0000O\u0014"+
		"\u0001\u0000\u0000\u0000\u0007\u000009>DGL\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}