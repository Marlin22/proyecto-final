// Generated from com\compiladores\segundo\ast\ejemploAST.g4 by ANTLR 4.5.1
package com.compiladores.segundo.ast;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ejemploASTParser extends Parser {
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
	public static final int
		RULE_cadena = 0, RULE_compi = 1, RULE_sentence = 2, RULE_int_assing = 3, 
		RULE_combinada = 4, RULE_double_assing = 5, RULE_string_assing = 6, RULE_println = 7, 
		RULE_texto = 8, RULE_tipo_const = 9, RULE_const_assing = 10, RULE_retorno = 11, 
		RULE_condition = 12, RULE_logical_expr = 13, RULE_condicion_if = 14, RULE_comparacion = 15, 
		RULE_operador = 16, RULE_conclusion = 17, RULE_ciclo_if = 18, RULE_iniciacion = 19, 
		RULE_tope = 20, RULE_tope_op = 21, RULE_pasos = 22, RULE_paso_op = 23, 
		RULE_ciclo_for = 24, RULE_operaciones = 25, RULE_llamada = 26, RULE_ciclo_while = 27, 
		RULE_tipo = 28, RULE_repeticion = 29, RULE_var = 30, RULE_cantidad = 31, 
		RULE_assing_vector = 32, RULE_rep = 33, RULE_cant = 34, RULE_assing_matriz = 35, 
		RULE_funcion = 36;
	public static final String[] ruleNames = {
		"cadena", "compi", "sentence", "int_assing", "combinada", "double_assing", 
		"string_assing", "println", "texto", "tipo_const", "const_assing", "retorno", 
		"condition", "logical_expr", "condicion_if", "comparacion", "operador", 
		"conclusion", "ciclo_if", "iniciacion", "tope", "tope_op", "pasos", "paso_op", 
		"ciclo_for", "operaciones", "llamada", "ciclo_while", "tipo", "repeticion", 
		"var", "cantidad", "assing_vector", "rep", "cant", "assing_matriz", "funcion"
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

	@Override
	public String getGrammarFileName() { return "ejemploAST.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ejemploASTParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CadenaContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ejemploASTParser.ID, 0); }
		public TerminalNode NUMERO() { return getToken(ejemploASTParser.NUMERO, 0); }
		public CadenaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cadena; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ejemploASTListener ) ((ejemploASTListener)listener).enterCadena(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ejemploASTListener ) ((ejemploASTListener)listener).exitCadena(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ejemploASTVisitor ) return ((ejemploASTVisitor<? extends T>)visitor).visitCadena(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CadenaContext cadena() throws RecognitionException {
		CadenaContext _localctx = new CadenaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_cadena);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==NUMERO) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class CompiContext extends ParserRuleContext {
		public TerminalNode COMPI() { return getToken(ejemploASTParser.COMPI, 0); }
		public TerminalNode ID() { return getToken(ejemploASTParser.ID, 0); }
		public TerminalNode LLA_ABRIR() { return getToken(ejemploASTParser.LLA_ABRIR, 0); }
		public TerminalNode LLA_CERRAR() { return getToken(ejemploASTParser.LLA_CERRAR, 0); }
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public CompiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ejemploASTListener ) ((ejemploASTListener)listener).enterCompi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ejemploASTListener ) ((ejemploASTListener)listener).exitCompi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ejemploASTVisitor ) return ((ejemploASTVisitor<? extends T>)visitor).visitCompi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompiContext compi() throws RecognitionException {
		CompiContext _localctx = new CompiContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_compi);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(COMPI);
			setState(77);
			match(ID);
			setState(78);
			match(LLA_ABRIR);
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - -1)) & ~0x3f) == 0 && ((1L << (_la - -1)) & ((1L << (EOF - -1)) | (1L << (ESCRIBIR - -1)) | (1L << (CICLO - -1)) | (1L << (CONSTANTE - -1)) | (1L << (FUN - -1)) | (1L << (INT - -1)) | (1L << (DOUBLE - -1)) | (1L << (STRING - -1)) | (1L << (MAYOR - -1)) | (1L << (MENOR - -1)) | (1L << (MAI - -1)) | (1L << (MEI - -1)) | (1L << (DI - -1)) | (1L << (LLA_ABRIR - -1)) | (1L << (PAR_ABRIR - -1)) | (1L << (MASCICLO - -1)) | (1L << (MENOSCICLO - -1)) | (1L << (ID - -1)) | (1L << (NUMERO - -1)) | (1L << (IDENT - -1)))) != 0)) {
				{
				{
				setState(79);
				sentence();
				}
				}
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(85);
			match(LLA_CERRAR);
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

	public static class SentenceContext extends ParserRuleContext {
		public Int_assingContext int_assing() {
			return getRuleContext(Int_assingContext.class,0);
		}
		public CombinadaContext combinada() {
			return getRuleContext(CombinadaContext.class,0);
		}
		public Double_assingContext double_assing() {
			return getRuleContext(Double_assingContext.class,0);
		}
		public String_assingContext string_assing() {
			return getRuleContext(String_assingContext.class,0);
		}
		public PrintlnContext println() {
			return getRuleContext(PrintlnContext.class,0);
		}
		public TextoContext texto() {
			return getRuleContext(TextoContext.class,0);
		}
		public CadenaContext cadena() {
			return getRuleContext(CadenaContext.class,0);
		}
		public Tipo_constContext tipo_const() {
			return getRuleContext(Tipo_constContext.class,0);
		}
		public RetornoContext retorno() {
			return getRuleContext(RetornoContext.class,0);
		}
		public Const_assingContext const_assing() {
			return getRuleContext(Const_assingContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public Logical_exprContext logical_expr() {
			return getRuleContext(Logical_exprContext.class,0);
		}
		public Condicion_ifContext condicion_if() {
			return getRuleContext(Condicion_ifContext.class,0);
		}
		public ComparacionContext comparacion() {
			return getRuleContext(ComparacionContext.class,0);
		}
		public OperadorContext operador() {
			return getRuleContext(OperadorContext.class,0);
		}
		public ConclusionContext conclusion() {
			return getRuleContext(ConclusionContext.class,0);
		}
		public Ciclo_ifContext ciclo_if() {
			return getRuleContext(Ciclo_ifContext.class,0);
		}
		public IniciacionContext iniciacion() {
			return getRuleContext(IniciacionContext.class,0);
		}
		public TopeContext tope() {
			return getRuleContext(TopeContext.class,0);
		}
		public Tope_opContext tope_op() {
			return getRuleContext(Tope_opContext.class,0);
		}
		public PasosContext pasos() {
			return getRuleContext(PasosContext.class,0);
		}
		public Paso_opContext paso_op() {
			return getRuleContext(Paso_opContext.class,0);
		}
		public Ciclo_forContext ciclo_for() {
			return getRuleContext(Ciclo_forContext.class,0);
		}
		public OperacionesContext operaciones() {
			return getRuleContext(OperacionesContext.class,0);
		}
		public LlamadaContext llamada() {
			return getRuleContext(LlamadaContext.class,0);
		}
		public Ciclo_whileContext ciclo_while() {
			return getRuleContext(Ciclo_whileContext.class,0);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public RepeticionContext repeticion() {
			return getRuleContext(RepeticionContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public CantidadContext cantidad() {
			return getRuleContext(CantidadContext.class,0);
		}
		public Assing_vectorContext assing_vector() {
			return getRuleContext(Assing_vectorContext.class,0);
		}
		public RepContext rep() {
			return getRuleContext(RepContext.class,0);
		}
		public CantContext cant() {
			return getRuleContext(CantContext.class,0);
		}
		public Assing_matrizContext assing_matriz() {
			return getRuleContext(Assing_matrizContext.class,0);
		}
		public FuncionContext funcion() {
			return getRuleContext(FuncionContext.class,0);
		}
		public SentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ejemploASTListener ) ((ejemploASTListener)listener).enterSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ejemploASTListener ) ((ejemploASTListener)listener).exitSentence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ejemploASTVisitor ) return ((ejemploASTVisitor<? extends T>)visitor).visitSentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenceContext sentence() throws RecognitionException {
		SentenceContext _localctx = new SentenceContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sentence);
		try {
			setState(122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				int_assing();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
				combinada();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(89);
				double_assing();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(90);
				string_assing();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(91);
				println();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(92);
				texto();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(93);
				cadena();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(94);
				tipo_const();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(95);
				retorno();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(96);
				const_assing();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(97);
				condition();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(98);
				logical_expr(0);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(99);
				condicion_if();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(100);
				comparacion();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(101);
				operador();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(102);
				conclusion();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(103);
				ciclo_if();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(104);
				iniciacion();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(105);
				tope();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(106);
				tope_op();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(107);
				pasos();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(108);
				paso_op();
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(109);
				ciclo_for();
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(110);
				operaciones();
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(111);
				llamada();
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(112);
				ciclo_while();
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(113);
				tipo();
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(114);
				repeticion();
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(115);
				var();
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(116);
				cantidad();
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(117);
				assing_vector();
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(118);
				rep();
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(119);
				cant();
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(120);
				assing_matriz();
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(121);
				funcion();
				}
				break;
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

	public static class Int_assingContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(ejemploASTParser.INT, 0); }
		public TerminalNode ID() { return getToken(ejemploASTParser.ID, 0); }
		public TerminalNode ASIGNAR() { return getToken(ejemploASTParser.ASIGNAR, 0); }
		public TerminalNode NUMERO() { return getToken(ejemploASTParser.NUMERO, 0); }
		public TerminalNode FIN() { return getToken(ejemploASTParser.FIN, 0); }
		public Int_assingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_assing; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ejemploASTListener ) ((ejemploASTListener)listener).enterInt_assing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ejemploASTListener ) ((ejemploASTListener)listener).exitInt_assing(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ejemploASTVisitor ) return ((ejemploASTVisitor<? extends T>)visitor).visitInt_assing(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Int_assingContext int_assing() throws RecognitionException {
		Int_assingContext _localctx = new Int_assingContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_int_assing);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(INT);
			setState(125);
			match(ID);
			setState(126);
			match(ASIGNAR);
			setState(127);
			match(NUMERO);
			setState(128);
			match(FIN);
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

	public static class CombinadaContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(ejemploASTParser.INT, 0); }
		public List<TerminalNode> ID() { return getTokens(ejemploASTParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ejemploASTParser.ID, i);
		}
		public TerminalNode ASIGNAR() { return getToken(ejemploASTParser.ASIGNAR, 0); }
		public TerminalNode SUMA() { return getToken(ejemploASTParser.SUMA, 0); }
		public TerminalNode NUMERO() { return getToken(ejemploASTParser.NUMERO, 0); }
		public TerminalNode FIN() { return getToken(ejemploASTParser.FIN, 0); }
		public CombinadaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_combinada; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ejemploASTListener ) ((ejemploASTListener)listener).enterCombinada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ejemploASTListener ) ((ejemploASTListener)listener).exitCombinada(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ejemploASTVisitor ) return ((ejemploASTVisitor<? extends T>)visitor).visitCombinada(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CombinadaContext combinada() throws RecognitionException {
		CombinadaContext _localctx = new CombinadaContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_combinada);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(INT);
			setState(131);
			match(ID);
			setState(132);
			match(ASIGNAR);
			setState(133);
			match(ID);
			setState(134);
			match(SUMA);
			setState(135);
			match(NUMERO);
			setState(136);
			match(FIN);
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

	public static class Double_assingContext extends ParserRuleContext {
		public TerminalNode DOUBLE() { return getToken(ejemploASTParser.DOUBLE, 0); }
		public TerminalNode ID() { return getToken(ejemploASTParser.ID, 0); }
		public TerminalNode ASIGNAR() { return getToken(ejemploASTParser.ASIGNAR, 0); }
		public TerminalNode NUMERODOUBLE() { return getToken(ejemploASTParser.NUMERODOUBLE, 0); }
		public TerminalNode FIN() { return getToken(ejemploASTParser.FIN, 0); }
		public Double_assingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_double_assing; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ejemploASTListener ) ((ejemploASTListener)listener).enterDouble_assing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ejemploASTListener ) ((ejemploASTListener)listener).exitDouble_assing(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ejemploASTVisitor ) return ((ejemploASTVisitor<? extends T>)visitor).visitDouble_assing(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Double_assingContext double_assing() throws RecognitionException {
		Double_assingContext _localctx = new Double_assingContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_double_assing);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(DOUBLE);
			setState(139);
			match(ID);
			setState(140);
			match(ASIGNAR);
			setState(141);
			match(NUMERODOUBLE);
			setState(142);
			match(FIN);
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

	public static class String_assingContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(ejemploASTParser.STRING, 0); }
		public List<TerminalNode> ID() { return getTokens(ejemploASTParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ejemploASTParser.ID, i);
		}
		public TerminalNode ASIGNAR() { return getToken(ejemploASTParser.ASIGNAR, 0); }
		public TerminalNode FIN() { return getToken(ejemploASTParser.FIN, 0); }
		public String_assingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_assing; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ejemploASTListener ) ((ejemploASTListener)listener).enterString_assing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ejemploASTListener ) ((ejemploASTListener)listener).exitString_assing(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ejemploASTVisitor ) return ((ejemploASTVisitor<? extends T>)visitor).visitString_assing(this);
			else return visitor.visitChildren(this);
		}
	}

	public final String_assingContext string_assing() throws RecognitionException {
		String_assingContext _localctx = new String_assingContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_string_assing);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(STRING);
			setState(145);
			match(ID);
			setState(146);
			match(ASIGNAR);
			setState(147);
			match(ID);
			setState(148);
			match(FIN);
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

	public static class PrintlnContext extends ParserRuleContext {
		public TerminalNode ESCRIBIR() { return getToken(ejemploASTParser.ESCRIBIR, 0); }
		public TerminalNode ID() { return getToken(ejemploASTParser.ID, 0); }
		public TerminalNode SUMA() { return getToken(ejemploASTParser.SUMA, 0); }
		public List<TerminalNode> NUMERO() { return getTokens(ejemploASTParser.NUMERO); }
		public TerminalNode NUMERO(int i) {
			return getToken(ejemploASTParser.NUMERO, i);
		}
		public TerminalNode MULT() { return getToken(ejemploASTParser.MULT, 0); }
		public TerminalNode FIN() { return getToken(ejemploASTParser.FIN, 0); }
		public PrintlnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_println; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ejemploASTListener ) ((ejemploASTListener)listener).enterPrintln(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ejemploASTListener ) ((ejemploASTListener)listener).exitPrintln(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ejemploASTVisitor ) return ((ejemploASTVisitor<? extends T>)visitor).visitPrintln(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintlnContext println() throws RecognitionException {
		PrintlnContext _localctx = new PrintlnContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_println);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(ESCRIBIR);
			setState(151);
			match(ID);
			setState(152);
			match(SUMA);
			setState(153);
			match(NUMERO);
			setState(154);
			match(MULT);
			setState(155);
			match(NUMERO);
			setState(156);
			match(FIN);
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

	public static class TextoContext extends ParserRuleContext {
		public TerminalNode ESCRIBIR() { return getToken(ejemploASTParser.ESCRIBIR, 0); }
		public CadenaContext cadena() {
			return getRuleContext(CadenaContext.class,0);
		}
		public TerminalNode FIN() { return getToken(ejemploASTParser.FIN, 0); }
		public TextoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_texto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ejemploASTListener ) ((ejemploASTListener)listener).enterTexto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ejemploASTListener ) ((ejemploASTListener)listener).exitTexto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ejemploASTVisitor ) return ((ejemploASTVisitor<? extends T>)visitor).visitTexto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextoContext texto() throws RecognitionException {
		TextoContext _localctx = new TextoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_texto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(ESCRIBIR);
			setState(159);
			cadena();
			setState(160);
			match(FIN);
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

	public static class Tipo_constContext extends ParserRuleContext {
		public Int_assingContext int_assing() {
			return getRuleContext(Int_assingContext.class,0);
		}
		public Double_assingContext double_assing() {
			return getRuleContext(Double_assingContext.class,0);
		}
		public Tipo_constContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_const; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ejemploASTListener ) ((ejemploASTListener)listener).enterTipo_const(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ejemploASTListener ) ((ejemploASTListener)listener).exitTipo_const(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ejemploASTVisitor ) return ((ejemploASTVisitor<? extends T>)visitor).visitTipo_const(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tipo_constContext tipo_const() throws RecognitionException {
		Tipo_constContext _localctx = new Tipo_constContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_tipo_const);
		try {
			setState(164);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				int_assing();
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				double_assing();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Const_assingContext extends ParserRuleContext {
		public TerminalNode CONSTANTE() { return getToken(ejemploASTParser.CONSTANTE, 0); }
		public Tipo_constContext tipo_const() {
			return getRuleContext(Tipo_constContext.class,0);
		}
		public Const_assingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_const_assing; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ejemploASTListener ) ((ejemploASTListener)listener).enterConst_assing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ejemploASTListener ) ((ejemploASTListener)listener).exitConst_assing(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ejemploASTVisitor ) return ((ejemploASTVisitor<? extends T>)visitor).visitConst_assing(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Const_assingContext const_assing() throws RecognitionException {
		Const_assingContext _localctx = new Const_assingContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_const_assing);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(CONSTANTE);
			setState(167);
			tipo_const();
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

	public static class RetornoContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ejemploASTParser.EOF, 0); }
		public List<Ciclo_ifContext> ciclo_if() {
			return getRuleContexts(Ciclo_ifContext.class);
		}
		public Ciclo_ifContext ciclo_if(int i) {
			return getRuleContext(Ciclo_ifContext.class,i);
		}
		public RetornoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retorno; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ejemploASTListener ) ((ejemploASTListener)listener).enterRetorno(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ejemploASTListener ) ((ejemploASTListener)listener).exitRetorno(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ejemploASTVisitor ) return ((ejemploASTVisitor<? extends T>)visitor).visitRetorno(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RetornoContext retorno() throws RecognitionException {
		RetornoContext _localctx = new RetornoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_retorno);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CICLO) {
				{
				{
				setState(169);
				ciclo_if();
				}
				}
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(175);
			match(EOF);
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
		public Logical_exprContext logical_expr() {
			return getRuleContext(Logical_exprContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ejemploASTListener ) ((ejemploASTListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ejemploASTListener ) ((ejemploASTListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ejemploASTVisitor ) return ((ejemploASTVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			logical_expr(0);
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

	public static class Logical_exprContext extends ParserRuleContext {
		public Condicion_ifContext condicion_if() {
			return getRuleContext(Condicion_ifContext.class,0);
		}
		public List<Logical_exprContext> logical_expr() {
			return getRuleContexts(Logical_exprContext.class);
		}
		public Logical_exprContext logical_expr(int i) {
			return getRuleContext(Logical_exprContext.class,i);
		}
		public TerminalNode AND() { return getToken(ejemploASTParser.AND, 0); }
		public TerminalNode OR() { return getToken(ejemploASTParser.OR, 0); }
		public Logical_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ejemploASTListener ) ((ejemploASTListener)listener).enterLogical_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ejemploASTListener ) ((ejemploASTListener)listener).exitLogical_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ejemploASTVisitor ) return ((ejemploASTVisitor<? extends T>)visitor).visitLogical_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logical_exprContext logical_expr() throws RecognitionException {
		return logical_expr(0);
	}

	private Logical_exprContext logical_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Logical_exprContext _localctx = new Logical_exprContext(_ctx, _parentState);
		Logical_exprContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_logical_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(180);
			condicion_if();
			}
			_ctx.stop = _input.LT(-1);
			setState(190);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(188);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new Logical_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logical_expr);
						setState(182);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(183);
						match(AND);
						setState(184);
						logical_expr(4);
						}
						break;
					case 2:
						{
						_localctx = new Logical_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logical_expr);
						setState(185);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(186);
						match(OR);
						setState(187);
						logical_expr(3);
						}
						break;
					}
					} 
				}
				setState(192);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Condicion_ifContext extends ParserRuleContext {
		public TerminalNode PAR_ABRIR() { return getToken(ejemploASTParser.PAR_ABRIR, 0); }
		public List<ComparacionContext> comparacion() {
			return getRuleContexts(ComparacionContext.class);
		}
		public ComparacionContext comparacion(int i) {
			return getRuleContext(ComparacionContext.class,i);
		}
		public OperadorContext operador() {
			return getRuleContext(OperadorContext.class,0);
		}
		public TerminalNode PAR_CERRAR() { return getToken(ejemploASTParser.PAR_CERRAR, 0); }
		public Condicion_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicion_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ejemploASTListener ) ((ejemploASTListener)listener).enterCondicion_if(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ejemploASTListener ) ((ejemploASTListener)listener).exitCondicion_if(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ejemploASTVisitor ) return ((ejemploASTVisitor<? extends T>)visitor).visitCondicion_if(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condicion_ifContext condicion_if() throws RecognitionException {
		Condicion_ifContext _localctx = new Condicion_ifContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_condicion_if);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(PAR_ABRIR);
			setState(194);
			comparacion();
			setState(195);
			operador();
			setState(196);
			comparacion();
			setState(197);
			match(PAR_CERRAR);
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

	public static class ComparacionContext extends ParserRuleContext {
		public TerminalNode PAR_ABRIR() { return getToken(ejemploASTParser.PAR_ABRIR, 0); }
		public List<TerminalNode> NUMERO() { return getTokens(ejemploASTParser.NUMERO); }
		public TerminalNode NUMERO(int i) {
			return getToken(ejemploASTParser.NUMERO, i);
		}
		public TerminalNode MULT() { return getToken(ejemploASTParser.MULT, 0); }
		public TerminalNode PAR_CERRAR() { return getToken(ejemploASTParser.PAR_CERRAR, 0); }
		public TerminalNode DIV() { return getToken(ejemploASTParser.DIV, 0); }
		public TerminalNode SUMA() { return getToken(ejemploASTParser.SUMA, 0); }
		public TerminalNode RESTA() { return getToken(ejemploASTParser.RESTA, 0); }
		public ComparacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ejemploASTListener ) ((ejemploASTListener)listener).enterComparacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ejemploASTListener ) ((ejemploASTListener)listener).exitComparacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ejemploASTVisitor ) return ((ejemploASTVisitor<? extends T>)visitor).visitComparacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparacionContext comparacion() throws RecognitionException {
		ComparacionContext _localctx = new ComparacionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_comparacion);
		try {
			setState(219);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(199);
				match(PAR_ABRIR);
				setState(200);
				match(NUMERO);
				setState(201);
				match(MULT);
				setState(202);
				match(NUMERO);
				setState(203);
				match(PAR_CERRAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(204);
				match(PAR_ABRIR);
				setState(205);
				match(NUMERO);
				setState(206);
				match(DIV);
				setState(207);
				match(NUMERO);
				setState(208);
				match(PAR_CERRAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(209);
				match(PAR_ABRIR);
				setState(210);
				match(NUMERO);
				setState(211);
				match(SUMA);
				setState(212);
				match(NUMERO);
				setState(213);
				match(PAR_CERRAR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(214);
				match(PAR_ABRIR);
				setState(215);
				match(NUMERO);
				setState(216);
				match(RESTA);
				setState(217);
				match(NUMERO);
				setState(218);
				match(PAR_CERRAR);
				}
				break;
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

	public static class OperadorContext extends ParserRuleContext {
		public TerminalNode MAYOR() { return getToken(ejemploASTParser.MAYOR, 0); }
		public TerminalNode MENOR() { return getToken(ejemploASTParser.MENOR, 0); }
		public TerminalNode MAI() { return getToken(ejemploASTParser.MAI, 0); }
		public TerminalNode MEI() { return getToken(ejemploASTParser.MEI, 0); }
		public TerminalNode DI() { return getToken(ejemploASTParser.DI, 0); }
		public OperadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ejemploASTListener ) ((ejemploASTListener)listener).enterOperador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ejemploASTListener ) ((ejemploASTListener)listener).exitOperador(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ejemploASTVisitor ) return ((ejemploASTVisitor<? extends T>)visitor).visitOperador(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperadorContext operador() throws RecognitionException {
		OperadorContext _localctx = new OperadorContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_operador);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAYOR) | (1L << MENOR) | (1L << MAI) | (1L << MEI) | (1L << DI))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class ConclusionContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(ejemploASTParser.IDENT, 0); }
		public ConclusionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conclusion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ejemploASTListener ) ((ejemploASTListener)listener).enterConclusion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ejemploASTListener ) ((ejemploASTListener)listener).exitConclusion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ejemploASTVisitor ) return ((ejemploASTVisitor<? extends T>)visitor).visitConclusion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConclusionContext conclusion() throws RecognitionException {
		ConclusionContext _localctx = new ConclusionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_conclusion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(IDENT);
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

	public static class Ciclo_ifContext extends ParserRuleContext {
		public TerminalNode CICLO() { return getToken(ejemploASTParser.CICLO, 0); }
		public TerminalNode IF() { return getToken(ejemploASTParser.IF, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(ejemploASTParser.THEN, 0); }
		public ConclusionContext conclusion() {
			return getRuleContext(ConclusionContext.class,0);
		}
		public TerminalNode FIN() { return getToken(ejemploASTParser.FIN, 0); }
		public Ciclo_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ciclo_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ejemploASTListener ) ((ejemploASTListener)listener).enterCiclo_if(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ejemploASTListener ) ((ejemploASTListener)listener).exitCiclo_if(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ejemploASTVisitor ) return ((ejemploASTVisitor<? extends T>)visitor).visitCiclo_if(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ciclo_ifContext ciclo_if() throws RecognitionException {
		Ciclo_ifContext _localctx = new Ciclo_ifContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_ciclo_if);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(CICLO);
			setState(226);
			match(IF);
			setState(227);
			condition();
			setState(228);
			match(THEN);
			setState(229);
			conclusion();
			setState(230);
			match(FIN);
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

	public static class IniciacionContext extends ParserRuleContext {
		public Int_assingContext int_assing() {
			return getRuleContext(Int_assingContext.class,0);
		}
		public IniciacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iniciacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ejemploASTListener ) ((ejemploASTListener)listener).enterIniciacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ejemploASTListener ) ((ejemploASTListener)listener).exitIniciacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ejemploASTVisitor ) return ((ejemploASTVisitor<? extends T>)visitor).visitIniciacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IniciacionContext iniciacion() throws RecognitionException {
		IniciacionContext _localctx = new IniciacionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_iniciacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			int_assing();
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

	public static class TopeContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ejemploASTParser.ID, 0); }
		public Tope_opContext tope_op() {
			return getRuleContext(Tope_opContext.class,0);
		}
		public TerminalNode NUMERO() { return getToken(ejemploASTParser.NUMERO, 0); }
		public TerminalNode FIN() { return getToken(ejemploASTParser.FIN, 0); }
		public TopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tope; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ejemploASTListener ) ((ejemploASTListener)listener).enterTope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ejemploASTListener ) ((ejemploASTListener)listener).exitTope(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ejemploASTVisitor ) return ((ejemploASTVisitor<? extends T>)visitor).visitTope(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TopeContext tope() throws RecognitionException {
		TopeContext _localctx = new TopeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_tope);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(ID);
			setState(235);
			tope_op();
			setState(236);
			match(NUMERO);
			setState(237);
			match(FIN);
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

	public static class Tope_opContext extends ParserRuleContext {
		public TerminalNode DI() { return getToken(ejemploASTParser.DI, 0); }
		public TerminalNode MENOR() { return getToken(ejemploASTParser.MENOR, 0); }
		public TerminalNode MAYOR() { return getToken(ejemploASTParser.MAYOR, 0); }
		public Tope_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tope_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ejemploASTListener ) ((ejemploASTListener)listener).enterTope_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ejemploASTListener ) ((ejemploASTListener)listener).exitTope_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ejemploASTVisitor ) return ((ejemploASTVisitor<? extends T>)visitor).visitTope_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tope_opContext tope_op() throws RecognitionException {
		Tope_opContext _localctx = new Tope_opContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_tope_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAYOR) | (1L << MENOR) | (1L << DI))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class PasosContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ejemploASTParser.ID, 0); }
		public Paso_opContext paso_op() {
			return getRuleContext(Paso_opContext.class,0);
		}
		public PasosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pasos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ejemploASTListener ) ((ejemploASTListener)listener).enterPasos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ejemploASTListener ) ((ejemploASTListener)listener).exitPasos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ejemploASTVisitor ) return ((ejemploASTVisitor<? extends T>)visitor).visitPasos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PasosContext pasos() throws RecognitionException {
		PasosContext _localctx = new PasosContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_pasos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(ID);
			setState(242);
			paso_op();
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

	public static class Paso_opContext extends ParserRuleContext {
		public TerminalNode MASCICLO() { return getToken(ejemploASTParser.MASCICLO, 0); }
		public TerminalNode MENOSCICLO() { return getToken(ejemploASTParser.MENOSCICLO, 0); }
		public Paso_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paso_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ejemploASTListener ) ((ejemploASTListener)listener).enterPaso_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ejemploASTListener ) ((ejemploASTListener)listener).exitPaso_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ejemploASTVisitor ) return ((ejemploASTVisitor<? extends T>)visitor).visitPaso_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Paso_opContext paso_op() throws RecognitionException {
		Paso_opContext _localctx = new Paso_opContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_paso_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			_la = _input.LA(1);
			if ( !(_la==MASCICLO || _la==MENOSCICLO) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class Ciclo_forContext extends ParserRuleContext {
		public TerminalNode CICLO() { return getToken(ejemploASTParser.CICLO, 0); }
		public TerminalNode FOR() { return getToken(ejemploASTParser.FOR, 0); }
		public TerminalNode PAR_ABRIR() { return getToken(ejemploASTParser.PAR_ABRIR, 0); }
		public IniciacionContext iniciacion() {
			return getRuleContext(IniciacionContext.class,0);
		}
		public TopeContext tope() {
			return getRuleContext(TopeContext.class,0);
		}
		public PasosContext pasos() {
			return getRuleContext(PasosContext.class,0);
		}
		public TerminalNode PAR_CERRAR() { return getToken(ejemploASTParser.PAR_CERRAR, 0); }
		public Ciclo_forContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ciclo_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ejemploASTListener ) ((ejemploASTListener)listener).enterCiclo_for(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ejemploASTListener ) ((ejemploASTListener)listener).exitCiclo_for(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ejemploASTVisitor ) return ((ejemploASTVisitor<? extends T>)visitor).visitCiclo_for(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ciclo_forContext ciclo_for() throws RecognitionException {
		Ciclo_forContext _localctx = new Ciclo_forContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_ciclo_for);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(CICLO);
			setState(247);
			match(FOR);
			setState(248);
			match(PAR_ABRIR);
			setState(249);
			iniciacion();
			setState(250);
			tope();
			setState(251);
			pasos();
			setState(252);
			match(PAR_CERRAR);
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

	public static class OperacionesContext extends ParserRuleContext {
		public List<CombinadaContext> combinada() {
			return getRuleContexts(CombinadaContext.class);
		}
		public CombinadaContext combinada(int i) {
			return getRuleContext(CombinadaContext.class,i);
		}
		public List<PrintlnContext> println() {
			return getRuleContexts(PrintlnContext.class);
		}
		public PrintlnContext println(int i) {
			return getRuleContext(PrintlnContext.class,i);
		}
		public List<Double_assingContext> double_assing() {
			return getRuleContexts(Double_assingContext.class);
		}
		public Double_assingContext double_assing(int i) {
			return getRuleContext(Double_assingContext.class,i);
		}
		public List<String_assingContext> string_assing() {
			return getRuleContexts(String_assingContext.class);
		}
		public String_assingContext string_assing(int i) {
			return getRuleContext(String_assingContext.class,i);
		}
		public OperacionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operaciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ejemploASTListener ) ((ejemploASTListener)listener).enterOperaciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ejemploASTListener ) ((ejemploASTListener)listener).exitOperaciones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ejemploASTVisitor ) return ((ejemploASTVisitor<? extends T>)visitor).visitOperaciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperacionesContext operaciones() throws RecognitionException {
		OperacionesContext _localctx = new OperacionesContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_operaciones);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(258); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(258);
					switch (_input.LA(1)) {
					case INT:
						{
						setState(254);
						combinada();
						}
						break;
					case ESCRIBIR:
						{
						setState(255);
						println();
						}
						break;
					case DOUBLE:
						{
						setState(256);
						double_assing();
						}
						break;
					case STRING:
						{
						setState(257);
						string_assing();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(260); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class LlamadaContext extends ParserRuleContext {
		public TerminalNode LLA_ABRIR() { return getToken(ejemploASTParser.LLA_ABRIR, 0); }
		public OperacionesContext operaciones() {
			return getRuleContext(OperacionesContext.class,0);
		}
		public PasosContext pasos() {
			return getRuleContext(PasosContext.class,0);
		}
		public TerminalNode LLA_CERRAR() { return getToken(ejemploASTParser.LLA_CERRAR, 0); }
		public LlamadaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llamada; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ejemploASTListener ) ((ejemploASTListener)listener).enterLlamada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ejemploASTListener ) ((ejemploASTListener)listener).exitLlamada(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ejemploASTVisitor ) return ((ejemploASTVisitor<? extends T>)visitor).visitLlamada(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LlamadaContext llamada() throws RecognitionException {
		LlamadaContext _localctx = new LlamadaContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_llamada);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(LLA_ABRIR);
			setState(263);
			operaciones();
			setState(264);
			pasos();
			setState(265);
			match(LLA_CERRAR);
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

	public static class Ciclo_whileContext extends ParserRuleContext {
		public TerminalNode CICLO() { return getToken(ejemploASTParser.CICLO, 0); }
		public TerminalNode WHILE() { return getToken(ejemploASTParser.WHILE, 0); }
		public TerminalNode PAR_ABRIR() { return getToken(ejemploASTParser.PAR_ABRIR, 0); }
		public IniciacionContext iniciacion() {
			return getRuleContext(IniciacionContext.class,0);
		}
		public TerminalNode PAR_CERRAR() { return getToken(ejemploASTParser.PAR_CERRAR, 0); }
		public LlamadaContext llamada() {
			return getRuleContext(LlamadaContext.class,0);
		}
		public Ciclo_whileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ciclo_while; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ejemploASTListener ) ((ejemploASTListener)listener).enterCiclo_while(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ejemploASTListener ) ((ejemploASTListener)listener).exitCiclo_while(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ejemploASTVisitor ) return ((ejemploASTVisitor<? extends T>)visitor).visitCiclo_while(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ciclo_whileContext ciclo_while() throws RecognitionException {
		Ciclo_whileContext _localctx = new Ciclo_whileContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_ciclo_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(CICLO);
			setState(268);
			match(WHILE);
			setState(269);
			match(PAR_ABRIR);
			setState(270);
			iniciacion();
			setState(271);
			match(PAR_CERRAR);
			setState(272);
			llamada();
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

	public static class TipoContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(ejemploASTParser.INT, 0); }
		public TerminalNode STRING() { return getToken(ejemploASTParser.STRING, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ejemploASTListener ) ((ejemploASTListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ejemploASTListener ) ((ejemploASTListener)listener).exitTipo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ejemploASTVisitor ) return ((ejemploASTVisitor<? extends T>)visitor).visitTipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==STRING) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class RepeticionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ejemploASTParser.ID, 0); }
		public TerminalNode C_ABRIR() { return getToken(ejemploASTParser.C_ABRIR, 0); }
		public TerminalNode NUMERO() { return getToken(ejemploASTParser.NUMERO, 0); }
		public TerminalNode C_CERRAR() { return getToken(ejemploASTParser.C_CERRAR, 0); }
		public RepeticionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeticion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ejemploASTListener ) ((ejemploASTListener)listener).enterRepeticion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ejemploASTListener ) ((ejemploASTListener)listener).exitRepeticion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ejemploASTVisitor ) return ((ejemploASTVisitor<? extends T>)visitor).visitRepeticion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepeticionContext repeticion() throws RecognitionException {
		RepeticionContext _localctx = new RepeticionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_repeticion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(ID);
			setState(277);
			match(C_ABRIR);
			setState(278);
			match(NUMERO);
			setState(279);
			match(C_CERRAR);
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

	public static class VarContext extends ParserRuleContext {
		public CadenaContext cadena() {
			return getRuleContext(CadenaContext.class,0);
		}
		public TerminalNode SEP() { return getToken(ejemploASTParser.SEP, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ejemploASTListener ) ((ejemploASTListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ejemploASTListener ) ((ejemploASTListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ejemploASTVisitor ) return ((ejemploASTVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			cadena();
			setState(282);
			match(SEP);
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

	public static class CantidadContext extends ParserRuleContext {
		public TerminalNode LLA_ABRIR() { return getToken(ejemploASTParser.LLA_ABRIR, 0); }
		public TerminalNode LLA_CERRAR() { return getToken(ejemploASTParser.LLA_CERRAR, 0); }
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public CantidadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cantidad; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ejemploASTListener ) ((ejemploASTListener)listener).enterCantidad(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ejemploASTListener ) ((ejemploASTListener)listener).exitCantidad(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ejemploASTVisitor ) return ((ejemploASTVisitor<? extends T>)visitor).visitCantidad(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CantidadContext cantidad() throws RecognitionException {
		CantidadContext _localctx = new CantidadContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_cantidad);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(LLA_ABRIR);
			setState(286); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(285);
				var();
				}
				}
				setState(288); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID || _la==NUMERO );
			setState(290);
			match(LLA_CERRAR);
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

	public static class Assing_vectorContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public RepeticionContext repeticion() {
			return getRuleContext(RepeticionContext.class,0);
		}
		public TerminalNode ASIGNAR() { return getToken(ejemploASTParser.ASIGNAR, 0); }
		public CantidadContext cantidad() {
			return getRuleContext(CantidadContext.class,0);
		}
		public Assing_vectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assing_vector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ejemploASTListener ) ((ejemploASTListener)listener).enterAssing_vector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ejemploASTListener ) ((ejemploASTListener)listener).exitAssing_vector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ejemploASTVisitor ) return ((ejemploASTVisitor<? extends T>)visitor).visitAssing_vector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assing_vectorContext assing_vector() throws RecognitionException {
		Assing_vectorContext _localctx = new Assing_vectorContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_assing_vector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			tipo();
			setState(293);
			repeticion();
			setState(294);
			match(ASIGNAR);
			setState(295);
			cantidad();
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

	public static class RepContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ejemploASTParser.ID, 0); }
		public List<TerminalNode> C_ABRIR() { return getTokens(ejemploASTParser.C_ABRIR); }
		public TerminalNode C_ABRIR(int i) {
			return getToken(ejemploASTParser.C_ABRIR, i);
		}
		public List<TerminalNode> NUMERO() { return getTokens(ejemploASTParser.NUMERO); }
		public TerminalNode NUMERO(int i) {
			return getToken(ejemploASTParser.NUMERO, i);
		}
		public List<TerminalNode> C_CERRAR() { return getTokens(ejemploASTParser.C_CERRAR); }
		public TerminalNode C_CERRAR(int i) {
			return getToken(ejemploASTParser.C_CERRAR, i);
		}
		public RepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rep; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ejemploASTListener ) ((ejemploASTListener)listener).enterRep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ejemploASTListener ) ((ejemploASTListener)listener).exitRep(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ejemploASTVisitor ) return ((ejemploASTVisitor<? extends T>)visitor).visitRep(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepContext rep() throws RecognitionException {
		RepContext _localctx = new RepContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_rep);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			match(ID);
			setState(298);
			match(C_ABRIR);
			setState(299);
			match(NUMERO);
			setState(300);
			match(C_CERRAR);
			setState(301);
			match(C_ABRIR);
			setState(302);
			match(NUMERO);
			setState(303);
			match(C_CERRAR);
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

	public static class CantContext extends ParserRuleContext {
		public List<TerminalNode> LLA_ABRIR() { return getTokens(ejemploASTParser.LLA_ABRIR); }
		public TerminalNode LLA_ABRIR(int i) {
			return getToken(ejemploASTParser.LLA_ABRIR, i);
		}
		public List<TerminalNode> LLA_CERRAR() { return getTokens(ejemploASTParser.LLA_CERRAR); }
		public TerminalNode LLA_CERRAR(int i) {
			return getToken(ejemploASTParser.LLA_CERRAR, i);
		}
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public CantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ejemploASTListener ) ((ejemploASTListener)listener).enterCant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ejemploASTListener ) ((ejemploASTListener)listener).exitCant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ejemploASTVisitor ) return ((ejemploASTVisitor<? extends T>)visitor).visitCant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CantContext cant() throws RecognitionException {
		CantContext _localctx = new CantContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_cant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			match(LLA_ABRIR);
			setState(307); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(306);
				var();
				}
				}
				setState(309); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID || _la==NUMERO );
			setState(311);
			match(LLA_CERRAR);
			setState(312);
			match(LLA_ABRIR);
			setState(314); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(313);
				var();
				}
				}
				setState(316); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID || _la==NUMERO );
			setState(318);
			match(LLA_CERRAR);
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

	public static class Assing_matrizContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public RepContext rep() {
			return getRuleContext(RepContext.class,0);
		}
		public TerminalNode ASIGNAR() { return getToken(ejemploASTParser.ASIGNAR, 0); }
		public CantContext cant() {
			return getRuleContext(CantContext.class,0);
		}
		public TerminalNode FIN() { return getToken(ejemploASTParser.FIN, 0); }
		public Assing_matrizContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assing_matriz; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ejemploASTListener ) ((ejemploASTListener)listener).enterAssing_matriz(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ejemploASTListener ) ((ejemploASTListener)listener).exitAssing_matriz(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ejemploASTVisitor ) return ((ejemploASTVisitor<? extends T>)visitor).visitAssing_matriz(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assing_matrizContext assing_matriz() throws RecognitionException {
		Assing_matrizContext _localctx = new Assing_matrizContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_assing_matriz);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			tipo();
			setState(321);
			rep();
			setState(322);
			match(ASIGNAR);
			setState(323);
			cant();
			setState(324);
			match(FIN);
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

	public static class FuncionContext extends ParserRuleContext {
		public TerminalNode FUN() { return getToken(ejemploASTParser.FUN, 0); }
		public TerminalNode LLA_ABRIR() { return getToken(ejemploASTParser.LLA_ABRIR, 0); }
		public TerminalNode LLA_CERRAR() { return getToken(ejemploASTParser.LLA_CERRAR, 0); }
		public List<Int_assingContext> int_assing() {
			return getRuleContexts(Int_assingContext.class);
		}
		public Int_assingContext int_assing(int i) {
			return getRuleContext(Int_assingContext.class,i);
		}
		public List<CombinadaContext> combinada() {
			return getRuleContexts(CombinadaContext.class);
		}
		public CombinadaContext combinada(int i) {
			return getRuleContext(CombinadaContext.class,i);
		}
		public List<Double_assingContext> double_assing() {
			return getRuleContexts(Double_assingContext.class);
		}
		public Double_assingContext double_assing(int i) {
			return getRuleContext(Double_assingContext.class,i);
		}
		public List<String_assingContext> string_assing() {
			return getRuleContexts(String_assingContext.class);
		}
		public String_assingContext string_assing(int i) {
			return getRuleContext(String_assingContext.class,i);
		}
		public List<PrintlnContext> println() {
			return getRuleContexts(PrintlnContext.class);
		}
		public PrintlnContext println(int i) {
			return getRuleContext(PrintlnContext.class,i);
		}
		public List<TextoContext> texto() {
			return getRuleContexts(TextoContext.class);
		}
		public TextoContext texto(int i) {
			return getRuleContext(TextoContext.class,i);
		}
		public List<CadenaContext> cadena() {
			return getRuleContexts(CadenaContext.class);
		}
		public CadenaContext cadena(int i) {
			return getRuleContext(CadenaContext.class,i);
		}
		public List<Const_assingContext> const_assing() {
			return getRuleContexts(Const_assingContext.class);
		}
		public Const_assingContext const_assing(int i) {
			return getRuleContext(Const_assingContext.class,i);
		}
		public List<Ciclo_ifContext> ciclo_if() {
			return getRuleContexts(Ciclo_ifContext.class);
		}
		public Ciclo_ifContext ciclo_if(int i) {
			return getRuleContext(Ciclo_ifContext.class,i);
		}
		public List<IniciacionContext> iniciacion() {
			return getRuleContexts(IniciacionContext.class);
		}
		public IniciacionContext iniciacion(int i) {
			return getRuleContext(IniciacionContext.class,i);
		}
		public List<Ciclo_forContext> ciclo_for() {
			return getRuleContexts(Ciclo_forContext.class);
		}
		public Ciclo_forContext ciclo_for(int i) {
			return getRuleContext(Ciclo_forContext.class,i);
		}
		public List<OperacionesContext> operaciones() {
			return getRuleContexts(OperacionesContext.class);
		}
		public OperacionesContext operaciones(int i) {
			return getRuleContext(OperacionesContext.class,i);
		}
		public List<Ciclo_whileContext> ciclo_while() {
			return getRuleContexts(Ciclo_whileContext.class);
		}
		public Ciclo_whileContext ciclo_while(int i) {
			return getRuleContext(Ciclo_whileContext.class,i);
		}
		public List<Assing_vectorContext> assing_vector() {
			return getRuleContexts(Assing_vectorContext.class);
		}
		public Assing_vectorContext assing_vector(int i) {
			return getRuleContext(Assing_vectorContext.class,i);
		}
		public List<Assing_matrizContext> assing_matriz() {
			return getRuleContexts(Assing_matrizContext.class);
		}
		public Assing_matrizContext assing_matriz(int i) {
			return getRuleContext(Assing_matrizContext.class,i);
		}
		public FuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ejemploASTListener ) ((ejemploASTListener)listener).enterFuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ejemploASTListener ) ((ejemploASTListener)listener).exitFuncion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ejemploASTVisitor ) return ((ejemploASTVisitor<? extends T>)visitor).visitFuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncionContext funcion() throws RecognitionException {
		FuncionContext _localctx = new FuncionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_funcion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			match(FUN);
			setState(327);
			match(LLA_ABRIR);
			setState(343); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(343);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(328);
					int_assing();
					}
					break;
				case 2:
					{
					setState(329);
					combinada();
					}
					break;
				case 3:
					{
					setState(330);
					double_assing();
					}
					break;
				case 4:
					{
					setState(331);
					string_assing();
					}
					break;
				case 5:
					{
					setState(332);
					println();
					}
					break;
				case 6:
					{
					setState(333);
					texto();
					}
					break;
				case 7:
					{
					setState(334);
					cadena();
					}
					break;
				case 8:
					{
					setState(335);
					const_assing();
					}
					break;
				case 9:
					{
					setState(336);
					ciclo_if();
					}
					break;
				case 10:
					{
					setState(337);
					iniciacion();
					}
					break;
				case 11:
					{
					setState(338);
					ciclo_for();
					}
					break;
				case 12:
					{
					setState(339);
					operaciones();
					}
					break;
				case 13:
					{
					setState(340);
					ciclo_while();
					}
					break;
				case 14:
					{
					setState(341);
					assing_vector();
					}
					break;
				case 15:
					{
					setState(342);
					assing_matriz();
					}
					break;
				}
				}
				setState(345); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ESCRIBIR) | (1L << CICLO) | (1L << CONSTANTE) | (1L << INT) | (1L << DOUBLE) | (1L << STRING) | (1L << ID) | (1L << NUMERO))) != 0) );
			setState(347);
			match(LLA_CERRAR);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 13:
			return logical_expr_sempred((Logical_exprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean logical_expr_sempred(Logical_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3.\u0160\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\3\3\3\3\3\3\3\7\3S\n\3\f"+
		"\3\16\3V\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\5\4}\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\5\13\u00a7\n\13"+
		"\3\f\3\f\3\f\3\r\7\r\u00ad\n\r\f\r\16\r\u00b0\13\r\3\r\3\r\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00bf\n\17\f\17\16\17"+
		"\u00c2\13\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\5\21\u00de\n\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\31"+
		"\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\6\33"+
		"\u0105\n\33\r\33\16\33\u0106\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3"+
		"\35\3\35\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3!\3!\6"+
		"!\u0121\n!\r!\16!\u0122\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\3$\3$\6$\u0136\n$\r$\16$\u0137\3$\3$\3$\6$\u013d\n$\r$\16$\u013e"+
		"\3$\3$\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&"+
		"\3&\3&\6&\u015a\n&\r&\16&\u015b\3&\3&\3&\2\3\34\'\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJ\2\7\3\2)*\3\2\24\30"+
		"\4\2\24\25\30\30\3\2\'(\4\2\b\b\n\n\u017a\2L\3\2\2\2\4N\3\2\2\2\6|\3\2"+
		"\2\2\b~\3\2\2\2\n\u0084\3\2\2\2\f\u008c\3\2\2\2\16\u0092\3\2\2\2\20\u0098"+
		"\3\2\2\2\22\u00a0\3\2\2\2\24\u00a6\3\2\2\2\26\u00a8\3\2\2\2\30\u00ae\3"+
		"\2\2\2\32\u00b3\3\2\2\2\34\u00b5\3\2\2\2\36\u00c3\3\2\2\2 \u00dd\3\2\2"+
		"\2\"\u00df\3\2\2\2$\u00e1\3\2\2\2&\u00e3\3\2\2\2(\u00ea\3\2\2\2*\u00ec"+
		"\3\2\2\2,\u00f1\3\2\2\2.\u00f3\3\2\2\2\60\u00f6\3\2\2\2\62\u00f8\3\2\2"+
		"\2\64\u0104\3\2\2\2\66\u0108\3\2\2\28\u010d\3\2\2\2:\u0114\3\2\2\2<\u0116"+
		"\3\2\2\2>\u011b\3\2\2\2@\u011e\3\2\2\2B\u0126\3\2\2\2D\u012b\3\2\2\2F"+
		"\u0133\3\2\2\2H\u0142\3\2\2\2J\u0148\3\2\2\2LM\t\2\2\2M\3\3\2\2\2NO\7"+
		"\3\2\2OP\7)\2\2PT\7\35\2\2QS\5\6\4\2RQ\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3"+
		"\2\2\2UW\3\2\2\2VT\3\2\2\2WX\7\36\2\2X\5\3\2\2\2Y}\5\b\5\2Z}\5\n\6\2["+
		"}\5\f\7\2\\}\5\16\b\2]}\5\20\t\2^}\5\22\n\2_}\5\2\2\2`}\5\24\13\2a}\5"+
		"\30\r\2b}\5\26\f\2c}\5\32\16\2d}\5\34\17\2e}\5\36\20\2f}\5 \21\2g}\5\""+
		"\22\2h}\5$\23\2i}\5&\24\2j}\5(\25\2k}\5*\26\2l}\5,\27\2m}\5.\30\2n}\5"+
		"\60\31\2o}\5\62\32\2p}\5\64\33\2q}\5\66\34\2r}\58\35\2s}\5:\36\2t}\5<"+
		"\37\2u}\5> \2v}\5@!\2w}\5B\"\2x}\5D#\2y}\5F$\2z}\5H%\2{}\5J&\2|Y\3\2\2"+
		"\2|Z\3\2\2\2|[\3\2\2\2|\\\3\2\2\2|]\3\2\2\2|^\3\2\2\2|_\3\2\2\2|`\3\2"+
		"\2\2|a\3\2\2\2|b\3\2\2\2|c\3\2\2\2|d\3\2\2\2|e\3\2\2\2|f\3\2\2\2|g\3\2"+
		"\2\2|h\3\2\2\2|i\3\2\2\2|j\3\2\2\2|k\3\2\2\2|l\3\2\2\2|m\3\2\2\2|n\3\2"+
		"\2\2|o\3\2\2\2|p\3\2\2\2|q\3\2\2\2|r\3\2\2\2|s\3\2\2\2|t\3\2\2\2|u\3\2"+
		"\2\2|v\3\2\2\2|w\3\2\2\2|x\3\2\2\2|y\3\2\2\2|z\3\2\2\2|{\3\2\2\2}\7\3"+
		"\2\2\2~\177\7\b\2\2\177\u0080\7)\2\2\u0080\u0081\7\32\2\2\u0081\u0082"+
		"\7*\2\2\u0082\u0083\7\33\2\2\u0083\t\3\2\2\2\u0084\u0085\7\b\2\2\u0085"+
		"\u0086\7)\2\2\u0086\u0087\7\32\2\2\u0087\u0088\7)\2\2\u0088\u0089\7\13"+
		"\2\2\u0089\u008a\7*\2\2\u008a\u008b\7\33\2\2\u008b\13\3\2\2\2\u008c\u008d"+
		"\7\t\2\2\u008d\u008e\7)\2\2\u008e\u008f\7\32\2\2\u008f\u0090\7+\2\2\u0090"+
		"\u0091\7\33\2\2\u0091\r\3\2\2\2\u0092\u0093\7\n\2\2\u0093\u0094\7)\2\2"+
		"\u0094\u0095\7\32\2\2\u0095\u0096\7)\2\2\u0096\u0097\7\33\2\2\u0097\17"+
		"\3\2\2\2\u0098\u0099\7\4\2\2\u0099\u009a\7)\2\2\u009a\u009b\7\13\2\2\u009b"+
		"\u009c\7*\2\2\u009c\u009d\7\r\2\2\u009d\u009e\7*\2\2\u009e\u009f\7\33"+
		"\2\2\u009f\21\3\2\2\2\u00a0\u00a1\7\4\2\2\u00a1\u00a2\5\2\2\2\u00a2\u00a3"+
		"\7\33\2\2\u00a3\23\3\2\2\2\u00a4\u00a7\5\b\5\2\u00a5\u00a7\5\f\7\2\u00a6"+
		"\u00a4\3\2\2\2\u00a6\u00a5\3\2\2\2\u00a7\25\3\2\2\2\u00a8\u00a9\7\6\2"+
		"\2\u00a9\u00aa\5\24\13\2\u00aa\27\3\2\2\2\u00ab\u00ad\5&\24\2\u00ac\u00ab"+
		"\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af"+
		"\u00b1\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1\u00b2\7\2\2\3\u00b2\31\3\2\2"+
		"\2\u00b3\u00b4\5\34\17\2\u00b4\33\3\2\2\2\u00b5\u00b6\b\17\1\2\u00b6\u00b7"+
		"\5\36\20\2\u00b7\u00c0\3\2\2\2\u00b8\u00b9\f\5\2\2\u00b9\u00ba\7\17\2"+
		"\2\u00ba\u00bf\5\34\17\6\u00bb\u00bc\f\4\2\2\u00bc\u00bd\7\20\2\2\u00bd"+
		"\u00bf\5\34\17\5\u00be\u00b8\3\2\2\2\u00be\u00bb\3\2\2\2\u00bf\u00c2\3"+
		"\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\35\3\2\2\2\u00c2"+
		"\u00c0\3\2\2\2\u00c3\u00c4\7\37\2\2\u00c4\u00c5\5 \21\2\u00c5\u00c6\5"+
		"\"\22\2\u00c6\u00c7\5 \21\2\u00c7\u00c8\7 \2\2\u00c8\37\3\2\2\2\u00c9"+
		"\u00ca\7\37\2\2\u00ca\u00cb\7*\2\2\u00cb\u00cc\7\r\2\2\u00cc\u00cd\7*"+
		"\2\2\u00cd\u00de\7 \2\2\u00ce\u00cf\7\37\2\2\u00cf\u00d0\7*\2\2\u00d0"+
		"\u00d1\7\16\2\2\u00d1\u00d2\7*\2\2\u00d2\u00de\7 \2\2\u00d3\u00d4\7\37"+
		"\2\2\u00d4\u00d5\7*\2\2\u00d5\u00d6\7\13\2\2\u00d6\u00d7\7*\2\2\u00d7"+
		"\u00de\7 \2\2\u00d8\u00d9\7\37\2\2\u00d9\u00da\7*\2\2\u00da\u00db\7\f"+
		"\2\2\u00db\u00dc\7*\2\2\u00dc\u00de\7 \2\2\u00dd\u00c9\3\2\2\2\u00dd\u00ce"+
		"\3\2\2\2\u00dd\u00d3\3\2\2\2\u00dd\u00d8\3\2\2\2\u00de!\3\2\2\2\u00df"+
		"\u00e0\t\3\2\2\u00e0#\3\2\2\2\u00e1\u00e2\7,\2\2\u00e2%\3\2\2\2\u00e3"+
		"\u00e4\7\5\2\2\u00e4\u00e5\7#\2\2\u00e5\u00e6\5\32\16\2\u00e6\u00e7\7"+
		"$\2\2\u00e7\u00e8\5$\23\2\u00e8\u00e9\7\33\2\2\u00e9\'\3\2\2\2\u00ea\u00eb"+
		"\5\b\5\2\u00eb)\3\2\2\2\u00ec\u00ed\7)\2\2\u00ed\u00ee\5,\27\2\u00ee\u00ef"+
		"\7*\2\2\u00ef\u00f0\7\33\2\2\u00f0+\3\2\2\2\u00f1\u00f2\t\4\2\2\u00f2"+
		"-\3\2\2\2\u00f3\u00f4\7)\2\2\u00f4\u00f5\5\60\31\2\u00f5/\3\2\2\2\u00f6"+
		"\u00f7\t\5\2\2\u00f7\61\3\2\2\2\u00f8\u00f9\7\5\2\2\u00f9\u00fa\7%\2\2"+
		"\u00fa\u00fb\7\37\2\2\u00fb\u00fc\5(\25\2\u00fc\u00fd\5*\26\2\u00fd\u00fe"+
		"\5.\30\2\u00fe\u00ff\7 \2\2\u00ff\63\3\2\2\2\u0100\u0105\5\n\6\2\u0101"+
		"\u0105\5\20\t\2\u0102\u0105\5\f\7\2\u0103\u0105\5\16\b\2\u0104\u0100\3"+
		"\2\2\2\u0104\u0101\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0103\3\2\2\2\u0105"+
		"\u0106\3\2\2\2\u0106\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107\65\3\2\2"+
		"\2\u0108\u0109\7\35\2\2\u0109\u010a\5\64\33\2\u010a\u010b\5.\30\2\u010b"+
		"\u010c\7\36\2\2\u010c\67\3\2\2\2\u010d\u010e\7\5\2\2\u010e\u010f\7&\2"+
		"\2\u010f\u0110\7\37\2\2\u0110\u0111\5(\25\2\u0111\u0112\7 \2\2\u0112\u0113"+
		"\5\66\34\2\u01139\3\2\2\2\u0114\u0115\t\6\2\2\u0115;\3\2\2\2\u0116\u0117"+
		"\7)\2\2\u0117\u0118\7!\2\2\u0118\u0119\7*\2\2\u0119\u011a\7\"\2\2\u011a"+
		"=\3\2\2\2\u011b\u011c\5\2\2\2\u011c\u011d\7\34\2\2\u011d?\3\2\2\2\u011e"+
		"\u0120\7\35\2\2\u011f\u0121\5> \2\u0120\u011f\3\2\2\2\u0121\u0122\3\2"+
		"\2\2\u0122\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0124\3\2\2\2\u0124"+
		"\u0125\7\36\2\2\u0125A\3\2\2\2\u0126\u0127\5:\36\2\u0127\u0128\5<\37\2"+
		"\u0128\u0129\7\32\2\2\u0129\u012a\5@!\2\u012aC\3\2\2\2\u012b\u012c\7)"+
		"\2\2\u012c\u012d\7!\2\2\u012d\u012e\7*\2\2\u012e\u012f\7\"\2\2\u012f\u0130"+
		"\7!\2\2\u0130\u0131\7*\2\2\u0131\u0132\7\"\2\2\u0132E\3\2\2\2\u0133\u0135"+
		"\7\35\2\2\u0134\u0136\5> \2\u0135\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137"+
		"\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013a\7\36"+
		"\2\2\u013a\u013c\7\35\2\2\u013b\u013d\5> \2\u013c\u013b\3\2\2\2\u013d"+
		"\u013e\3\2\2\2\u013e\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0140\3\2"+
		"\2\2\u0140\u0141\7\36\2\2\u0141G\3\2\2\2\u0142\u0143\5:\36\2\u0143\u0144"+
		"\5D#\2\u0144\u0145\7\32\2\2\u0145\u0146\5F$\2\u0146\u0147\7\33\2\2\u0147"+
		"I\3\2\2\2\u0148\u0149\7\7\2\2\u0149\u0159\7\35\2\2\u014a\u015a\5\b\5\2"+
		"\u014b\u015a\5\n\6\2\u014c\u015a\5\f\7\2\u014d\u015a\5\16\b\2\u014e\u015a"+
		"\5\20\t\2\u014f\u015a\5\22\n\2\u0150\u015a\5\2\2\2\u0151\u015a\5\26\f"+
		"\2\u0152\u015a\5&\24\2\u0153\u015a\5(\25\2\u0154\u015a\5\62\32\2\u0155"+
		"\u015a\5\64\33\2\u0156\u015a\58\35\2\u0157\u015a\5B\"\2\u0158\u015a\5"+
		"H%\2\u0159\u014a\3\2\2\2\u0159\u014b\3\2\2\2\u0159\u014c\3\2\2\2\u0159"+
		"\u014d\3\2\2\2\u0159\u014e\3\2\2\2\u0159\u014f\3\2\2\2\u0159\u0150\3\2"+
		"\2\2\u0159\u0151\3\2\2\2\u0159\u0152\3\2\2\2\u0159\u0153\3\2\2\2\u0159"+
		"\u0154\3\2\2\2\u0159\u0155\3\2\2\2\u0159\u0156\3\2\2\2\u0159\u0157\3\2"+
		"\2\2\u0159\u0158\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u0159\3\2\2\2\u015b"+
		"\u015c\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u015e\7\36\2\2\u015eK\3\2\2\2"+
		"\20T|\u00a6\u00ae\u00be\u00c0\u00dd\u0104\u0106\u0122\u0137\u013e\u0159"+
		"\u015b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}