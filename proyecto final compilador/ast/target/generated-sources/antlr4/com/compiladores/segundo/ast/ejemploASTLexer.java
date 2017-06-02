// Generated from com\compiladores\segundo\ast\ejemploAST.g4 by ANTLR 4.5.1
package com.compiladores.segundo.ast;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ejemploASTLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMPI=1, ESCRIBIR=2, CICLO=3, CONSTANTE=4, FUN=5, INT=6, DOUBLE=7, STRING=8, 
		SUMA=9, RESTA=10, MULT=11, DIV=12, AND=13, OR=14, NOT=15, FALSE=16, TRUE=17, 
		MAYOR=18, MENOR=19, MAI=20, MEI=21, DI=22, NDI=23, ASIGNAR=24, FIN=25, 
		SEP=26, LLA_ABRIR=27, LLA_CERRAR=28, PAR_ABRIR=29, PAR_CERRAR=30, C_ABRIR=31, 
		C_CERRAR=32, IF=33, THEN=34, FOR=35, WHILE=36, MASCICLO=37, MENOSCICLO=38, 
		ID=39, NUMERO=40, NUMERODOUBLE=41, IDENT=42, COMMENT=43, WS=44;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"COMPI", "ESCRIBIR", "CICLO", "CONSTANTE", "FUN", "INT", "DOUBLE", "STRING", 
		"SUMA", "RESTA", "MULT", "DIV", "AND", "OR", "NOT", "FALSE", "TRUE", "MAYOR", 
		"MENOR", "MAI", "MEI", "DI", "NDI", "ASIGNAR", "FIN", "SEP", "LLA_ABRIR", 
		"LLA_CERRAR", "PAR_ABRIR", "PAR_CERRAR", "C_ABRIR", "C_CERRAR", "IF", 
		"THEN", "FOR", "WHILE", "MASCICLO", "MENOSCICLO", "ID", "NUMERO", "NUMERODOUBLE", 
		"IDENT", "COMMENT", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'compi'", "'mostrar'", "'ciclo'", "'constante'", "'fun'", "'int'", 
		"'double'", "'string'", "'+'", "'-'", "'*'", "'/'", "'and'", "'or'", "'!'", 
		"'false'", "'true'", "'>'", "'<'", "'>='", "'<='", "'=='", "'!='", "'='", 
		"';'", "','", "'{'", "'}'", "'('", "')'", "'['", "']'", "'if'", "'then'", 
		"'for'", "'while'", "'++'", "'--'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "COMPI", "ESCRIBIR", "CICLO", "CONSTANTE", "FUN", "INT", "DOUBLE", 
		"STRING", "SUMA", "RESTA", "MULT", "DIV", "AND", "OR", "NOT", "FALSE", 
		"TRUE", "MAYOR", "MENOR", "MAI", "MEI", "DI", "NDI", "ASIGNAR", "FIN", 
		"SEP", "LLA_ABRIR", "LLA_CERRAR", "PAR_ABRIR", "PAR_CERRAR", "C_ABRIR", 
		"C_CERRAR", "IF", "THEN", "FOR", "WHILE", "MASCICLO", "MENOSCICLO", "ID", 
		"NUMERO", "NUMERODOUBLE", "IDENT", "COMMENT", "WS"
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


	public ejemploASTLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ejemploAST.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2.\u011b\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3"+
		"\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3"+
		"\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3"+
		"\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3"+
		"\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3%\3"+
		"%\3%\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3(\7(\u00e7\n(\f(\16(\u00ea\13(\3)"+
		"\6)\u00ed\n)\r)\16)\u00ee\3*\5*\u00f2\n*\3*\6*\u00f5\n*\r*\16*\u00f6\3"+
		"*\3*\6*\u00fb\n*\r*\16*\u00fc\5*\u00ff\n*\3+\3+\7+\u0103\n+\f+\16+\u0106"+
		"\13+\3,\3,\3,\3,\6,\u010c\n,\r,\16,\u010d\3,\5,\u0111\n,\3,\3,\3-\6-\u0116"+
		"\n-\r-\16-\u0117\3-\3-\3\u010d\2.\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31"+
		"\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.\3\2\b"+
		"\4\2C\\c|\3\2\62;\5\2C\\aac|\6\2\62;C\\aac|\3\3\f\f\4\2\13\f\17\17\u0123"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\3[\3\2\2\2\5a\3\2\2\2\7i\3\2\2\2\to\3"+
		"\2\2\2\13y\3\2\2\2\r}\3\2\2\2\17\u0081\3\2\2\2\21\u0088\3\2\2\2\23\u008f"+
		"\3\2\2\2\25\u0091\3\2\2\2\27\u0093\3\2\2\2\31\u0095\3\2\2\2\33\u0097\3"+
		"\2\2\2\35\u009b\3\2\2\2\37\u009e\3\2\2\2!\u00a0\3\2\2\2#\u00a6\3\2\2\2"+
		"%\u00ab\3\2\2\2\'\u00ad\3\2\2\2)\u00af\3\2\2\2+\u00b2\3\2\2\2-\u00b5\3"+
		"\2\2\2/\u00b8\3\2\2\2\61\u00bb\3\2\2\2\63\u00bd\3\2\2\2\65\u00bf\3\2\2"+
		"\2\67\u00c1\3\2\2\29\u00c3\3\2\2\2;\u00c5\3\2\2\2=\u00c7\3\2\2\2?\u00c9"+
		"\3\2\2\2A\u00cb\3\2\2\2C\u00cd\3\2\2\2E\u00d0\3\2\2\2G\u00d5\3\2\2\2I"+
		"\u00d9\3\2\2\2K\u00df\3\2\2\2M\u00e2\3\2\2\2O\u00e8\3\2\2\2Q\u00ec\3\2"+
		"\2\2S\u00f1\3\2\2\2U\u0100\3\2\2\2W\u0107\3\2\2\2Y\u0115\3\2\2\2[\\\7"+
		"e\2\2\\]\7q\2\2]^\7o\2\2^_\7r\2\2_`\7k\2\2`\4\3\2\2\2ab\7o\2\2bc\7q\2"+
		"\2cd\7u\2\2de\7v\2\2ef\7t\2\2fg\7c\2\2gh\7t\2\2h\6\3\2\2\2ij\7e\2\2jk"+
		"\7k\2\2kl\7e\2\2lm\7n\2\2mn\7q\2\2n\b\3\2\2\2op\7e\2\2pq\7q\2\2qr\7p\2"+
		"\2rs\7u\2\2st\7v\2\2tu\7c\2\2uv\7p\2\2vw\7v\2\2wx\7g\2\2x\n\3\2\2\2yz"+
		"\7h\2\2z{\7w\2\2{|\7p\2\2|\f\3\2\2\2}~\7k\2\2~\177\7p\2\2\177\u0080\7"+
		"v\2\2\u0080\16\3\2\2\2\u0081\u0082\7f\2\2\u0082\u0083\7q\2\2\u0083\u0084"+
		"\7w\2\2\u0084\u0085\7d\2\2\u0085\u0086\7n\2\2\u0086\u0087\7g\2\2\u0087"+
		"\20\3\2\2\2\u0088\u0089\7u\2\2\u0089\u008a\7v\2\2\u008a\u008b\7t\2\2\u008b"+
		"\u008c\7k\2\2\u008c\u008d\7p\2\2\u008d\u008e\7i\2\2\u008e\22\3\2\2\2\u008f"+
		"\u0090\7-\2\2\u0090\24\3\2\2\2\u0091\u0092\7/\2\2\u0092\26\3\2\2\2\u0093"+
		"\u0094\7,\2\2\u0094\30\3\2\2\2\u0095\u0096\7\61\2\2\u0096\32\3\2\2\2\u0097"+
		"\u0098\7c\2\2\u0098\u0099\7p\2\2\u0099\u009a\7f\2\2\u009a\34\3\2\2\2\u009b"+
		"\u009c\7q\2\2\u009c\u009d\7t\2\2\u009d\36\3\2\2\2\u009e\u009f\7#\2\2\u009f"+
		" \3\2\2\2\u00a0\u00a1\7h\2\2\u00a1\u00a2\7c\2\2\u00a2\u00a3\7n\2\2\u00a3"+
		"\u00a4\7u\2\2\u00a4\u00a5\7g\2\2\u00a5\"\3\2\2\2\u00a6\u00a7\7v\2\2\u00a7"+
		"\u00a8\7t\2\2\u00a8\u00a9\7w\2\2\u00a9\u00aa\7g\2\2\u00aa$\3\2\2\2\u00ab"+
		"\u00ac\7@\2\2\u00ac&\3\2\2\2\u00ad\u00ae\7>\2\2\u00ae(\3\2\2\2\u00af\u00b0"+
		"\7@\2\2\u00b0\u00b1\7?\2\2\u00b1*\3\2\2\2\u00b2\u00b3\7>\2\2\u00b3\u00b4"+
		"\7?\2\2\u00b4,\3\2\2\2\u00b5\u00b6\7?\2\2\u00b6\u00b7\7?\2\2\u00b7.\3"+
		"\2\2\2\u00b8\u00b9\7#\2\2\u00b9\u00ba\7?\2\2\u00ba\60\3\2\2\2\u00bb\u00bc"+
		"\7?\2\2\u00bc\62\3\2\2\2\u00bd\u00be\7=\2\2\u00be\64\3\2\2\2\u00bf\u00c0"+
		"\7.\2\2\u00c0\66\3\2\2\2\u00c1\u00c2\7}\2\2\u00c28\3\2\2\2\u00c3\u00c4"+
		"\7\177\2\2\u00c4:\3\2\2\2\u00c5\u00c6\7*\2\2\u00c6<\3\2\2\2\u00c7\u00c8"+
		"\7+\2\2\u00c8>\3\2\2\2\u00c9\u00ca\7]\2\2\u00ca@\3\2\2\2\u00cb\u00cc\7"+
		"_\2\2\u00ccB\3\2\2\2\u00cd\u00ce\7k\2\2\u00ce\u00cf\7h\2\2\u00cfD\3\2"+
		"\2\2\u00d0\u00d1\7v\2\2\u00d1\u00d2\7j\2\2\u00d2\u00d3\7g\2\2\u00d3\u00d4"+
		"\7p\2\2\u00d4F\3\2\2\2\u00d5\u00d6\7h\2\2\u00d6\u00d7\7q\2\2\u00d7\u00d8"+
		"\7t\2\2\u00d8H\3\2\2\2\u00d9\u00da\7y\2\2\u00da\u00db\7j\2\2\u00db\u00dc"+
		"\7k\2\2\u00dc\u00dd\7n\2\2\u00dd\u00de\7g\2\2\u00deJ\3\2\2\2\u00df\u00e0"+
		"\7-\2\2\u00e0\u00e1\7-\2\2\u00e1L\3\2\2\2\u00e2\u00e3\7/\2\2\u00e3\u00e4"+
		"\7/\2\2\u00e4N\3\2\2\2\u00e5\u00e7\t\2\2\2\u00e6\u00e5\3\2\2\2\u00e7\u00ea"+
		"\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9P\3\2\2\2\u00ea"+
		"\u00e8\3\2\2\2\u00eb\u00ed\t\3\2\2\u00ec\u00eb\3\2\2\2\u00ed\u00ee\3\2"+
		"\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00efR\3\2\2\2\u00f0\u00f2"+
		"\7/\2\2\u00f1\u00f0\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f4\3\2\2\2\u00f3"+
		"\u00f5\t\3\2\2\u00f4\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f4\3\2"+
		"\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00fe\3\2\2\2\u00f8\u00fa\7\60\2\2\u00f9"+
		"\u00fb\t\3\2\2\u00fa\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fa\3\2"+
		"\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00ff\3\2\2\2\u00fe\u00f8\3\2\2\2\u00fe"+
		"\u00ff\3\2\2\2\u00ffT\3\2\2\2\u0100\u0104\t\4\2\2\u0101\u0103\t\5\2\2"+
		"\u0102\u0101\3\2\2\2\u0103\u0106\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105"+
		"\3\2\2\2\u0105V\3\2\2\2\u0106\u0104\3\2\2\2\u0107\u0108\7\61\2\2\u0108"+
		"\u0109\7\61\2\2\u0109\u010b\3\2\2\2\u010a\u010c\13\2\2\2\u010b\u010a\3"+
		"\2\2\2\u010c\u010d\3\2\2\2\u010d\u010e\3\2\2\2\u010d\u010b\3\2\2\2\u010e"+
		"\u0110\3\2\2\2\u010f\u0111\t\6\2\2\u0110\u010f\3\2\2\2\u0111\u0112\3\2"+
		"\2\2\u0112\u0113\b,\2\2\u0113X\3\2\2\2\u0114\u0116\t\7\2\2\u0115\u0114"+
		"\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118"+
		"\u0119\3\2\2\2\u0119\u011a\b-\2\2\u011aZ\3\2\2\2\r\2\u00e8\u00ee\u00f1"+
		"\u00f6\u00fc\u00fe\u0104\u010d\u0110\u0117\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}