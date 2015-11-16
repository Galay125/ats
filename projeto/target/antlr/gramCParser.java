// Generated from gramC.g4 by ANTLR 4.4
package antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class gramCParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__42=1, T__41=2, T__40=3, T__39=4, T__38=5, T__37=6, T__36=7, T__35=8, 
		T__34=9, T__33=10, T__32=11, T__31=12, T__30=13, T__29=14, T__28=15, T__27=16, 
		T__26=17, T__25=18, T__24=19, T__23=20, T__22=21, T__21=22, T__20=23, 
		T__19=24, T__18=25, T__17=26, T__16=27, T__15=28, T__14=29, T__13=30, 
		T__12=31, T__11=32, T__10=33, T__9=34, T__8=35, T__7=36, T__6=37, T__5=38, 
		T__4=39, T__3=40, T__2=41, T__1=42, T__0=43, CHAR=44, FLOAT=45, SufixoFloat=46, 
		INT=47, ID=48, WS=49;
	public static final String[] tokenNames = {
		"<INVALID>", "'-='", "'input'", "','", "'while'", "'-'", "'*'", "':'", 
		"'('", "'if'", "'int'", "'<'", "'--'", "'false'", "'!='", "'<='", "'?'", 
		"'void'", "'{'", "'+='", "'else'", "'}'", "'boolean'", "'float'", "'true'", 
		"'++'", "'char'", "'%'", "'*='", "')'", "'+'", "'print'", "'for'", "'return'", 
		"'='", "';'", "'&&'", "'||'", "'>'", "'/='", "'=='", "'/'", "'>='", "'!'", 
		"CHAR", "FLOAT", "SufixoFloat", "INT", "ID", "WS"
	};
	public static final int
		RULE_idTipo = 0, RULE_tipo = 1, RULE_prog = 2, RULE_programa = 3, RULE_declaracao = 4, 
		RULE_dec_nodo = 5, RULE_funcao = 6, RULE_argumentos = 7, RULE_argumento = 8, 
		RULE_instrucao = 9, RULE_if_ = 10, RULE_else_ = 11, RULE_for_ = 12, RULE_for_declaracao = 13, 
		RULE_while_ = 14, RULE_return_ = 15, RULE_call = 16, RULE_print_ = 17, 
		RULE_input_ = 18, RULE_parametros = 19, RULE_parametro = 20, RULE_blocoCodigo = 21, 
		RULE_codigo = 22, RULE_condicao = 23, RULE_condicao_ou = 24, RULE_condicao_e = 25, 
		RULE_condicao_comparacao = 26, RULE_condicao_igualdade = 27, RULE_atribuicao = 28, 
		RULE_opAtribuicao = 29, RULE_expressao = 30, RULE_expressaoNum = 31, RULE_oper = 32, 
		RULE_incOp = 33, RULE_opUnario = 34, RULE_boolean_ = 35;
	public static final String[] ruleNames = {
		"idTipo", "tipo", "prog", "programa", "declaracao", "dec_nodo", "funcao", 
		"argumentos", "argumento", "instrucao", "if_", "else_", "for_", "for_declaracao", 
		"while_", "return_", "call", "print_", "input_", "parametros", "parametro", 
		"blocoCodigo", "codigo", "condicao", "condicao_ou", "condicao_e", "condicao_comparacao", 
		"condicao_igualdade", "atribuicao", "opAtribuicao", "expressao", "expressaoNum", 
		"oper", "incOp", "opUnario", "boolean_"
	};

	@Override
	public String getGrammarFileName() { return "gramC.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public gramCParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class IdTipoContext extends ParserRuleContext {
		public IdTipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idTipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramCListener ) ((gramCListener)listener).enterIdTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramCListener ) ((gramCListener)listener).exitIdTipo(this);
		}
	}

	public final IdTipoContext idTipo() throws RecognitionException {
		IdTipoContext _localctx = new IdTipoContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_idTipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__33) | (1L << T__26) | (1L << T__21) | (1L << T__20) | (1L << T__17))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
		public TerminalNode FLOAT() { return getToken(gramCParser.FLOAT, 0); }
		public TerminalNode INT() { return getToken(gramCParser.INT, 0); }
		public Boolean_Context boolean_() {
			return getRuleContext(Boolean_Context.class,0);
		}
		public TerminalNode CHAR() { return getToken(gramCParser.CHAR, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramCListener ) ((gramCListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramCListener ) ((gramCListener)listener).exitTipo(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_tipo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(74); match(INT);
				}
				break;
			case FLOAT:
				{
				setState(75); match(FLOAT);
				}
				break;
			case CHAR:
				{
				setState(76); match(CHAR);
				}
				break;
			case T__30:
			case T__19:
				{
				setState(77); boolean_();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ProgContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(gramCParser.EOF, 0); }
		public List<ProgramaContext> programa() {
			return getRuleContexts(ProgramaContext.class);
		}
		public ProgramaContext programa(int i) {
			return getRuleContext(ProgramaContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramCListener ) ((gramCListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramCListener ) ((gramCListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__33) | (1L << T__26) | (1L << T__21) | (1L << T__20) | (1L << T__17))) != 0)) {
				{
				{
				setState(80); programa();
				}
				}
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(86); match(EOF);
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

	public static class ProgramaContext extends ParserRuleContext {
		public FuncaoContext funcao;
		public DeclaracaoContext declaracao() {
			return getRuleContext(DeclaracaoContext.class,0);
		}
		public FuncaoContext funcao() {
			return getRuleContext(FuncaoContext.class,0);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramCListener ) ((gramCListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramCListener ) ((gramCListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(88); declaracao();
				setState(89); match(T__8);
				}
				break;
			case 2:
				{
				setState(91); ((ProgramaContext)_localctx).funcao = funcao();
				}
				break;
			}
				System.out.println("Funçõess: " + ((ProgramaContext)_localctx).funcao.funcaoOut);
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

	public static class DeclaracaoContext extends ParserRuleContext {
		public Dec_nodoContext dec_nodo(int i) {
			return getRuleContext(Dec_nodoContext.class,i);
		}
		public List<Dec_nodoContext> dec_nodo() {
			return getRuleContexts(Dec_nodoContext.class);
		}
		public IdTipoContext idTipo() {
			return getRuleContext(IdTipoContext.class,0);
		}
		public DeclaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramCListener ) ((gramCListener)listener).enterDeclaracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramCListener ) ((gramCListener)listener).exitDeclaracao(this);
		}
	}

	public final DeclaracaoContext declaracao() throws RecognitionException {
		DeclaracaoContext _localctx = new DeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declaracao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96); idTipo();
			setState(97); dec_nodo();
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__40) {
				{
				{
				setState(98); match(T__40);
				setState(99); dec_nodo();
				}
				}
				setState(104);
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

	public static class Dec_nodoContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public CondicaoContext condicao() {
			return getRuleContext(CondicaoContext.class,0);
		}
		public TerminalNode ID() { return getToken(gramCParser.ID, 0); }
		public Dec_nodoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec_nodo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramCListener ) ((gramCListener)listener).enterDec_nodo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramCListener ) ((gramCListener)listener).exitDec_nodo(this);
		}
	}

	public final Dec_nodoContext dec_nodo() throws RecognitionException {
		Dec_nodoContext _localctx = new Dec_nodoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_dec_nodo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(105); match(ID);
				}
				break;
			case 2:
				{
				setState(106); match(ID);
				setState(107); match(T__9);
				setState(110);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(108); expressao();
					}
					break;
				case 2:
					{
					setState(109); condicao();
					}
					break;
				}
				}
				break;
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

	public static class FuncaoContext extends ParserRuleContext {
		public int funcaoOut;
		public BlocoCodigoContext blocoCodigo() {
			return getRuleContext(BlocoCodigoContext.class,0);
		}
		public IdTipoContext idTipo() {
			return getRuleContext(IdTipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(gramCParser.ID, 0); }
		public ArgumentosContext argumentos() {
			return getRuleContext(ArgumentosContext.class,0);
		}
		public FuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramCListener ) ((gramCListener)listener).enterFuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramCListener ) ((gramCListener)listener).exitFuncao(this);
		}
	}

	public final FuncaoContext funcao() throws RecognitionException {
		FuncaoContext _localctx = new FuncaoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_funcao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114); idTipo();
			setState(115); match(ID);
			setState(116); match(T__35);
			setState(118);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__33) | (1L << T__26) | (1L << T__21) | (1L << T__20) | (1L << T__17))) != 0)) {
				{
				setState(117); argumentos();
				}
			}

			setState(120); match(T__14);
			setState(121); blocoCodigo();
			((FuncaoContext)_localctx).funcaoOut = 1;
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

	public static class ArgumentosContext extends ParserRuleContext {
		public List<ArgumentoContext> argumento() {
			return getRuleContexts(ArgumentoContext.class);
		}
		public ArgumentoContext argumento(int i) {
			return getRuleContext(ArgumentoContext.class,i);
		}
		public ArgumentosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramCListener ) ((gramCListener)listener).enterArgumentos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramCListener ) ((gramCListener)listener).exitArgumentos(this);
		}
	}

	public final ArgumentosContext argumentos() throws RecognitionException {
		ArgumentosContext _localctx = new ArgumentosContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_argumentos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124); argumento();
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__40) {
				{
				{
				setState(125); match(T__40);
				setState(126); argumento();
				}
				}
				setState(131);
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

	public static class ArgumentoContext extends ParserRuleContext {
		public IdTipoContext idTipo() {
			return getRuleContext(IdTipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(gramCParser.ID, 0); }
		public ArgumentoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumento; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramCListener ) ((gramCListener)listener).enterArgumento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramCListener ) ((gramCListener)listener).exitArgumento(this);
		}
	}

	public final ArgumentoContext argumento() throws RecognitionException {
		ArgumentoContext _localctx = new ArgumentoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_argumento);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132); idTipo();
			setState(133); match(ID);
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

	public static class InstrucaoContext extends ParserRuleContext {
		public Return_Context return_() {
			return getRuleContext(Return_Context.class,0);
		}
		public Print_Context print_() {
			return getRuleContext(Print_Context.class,0);
		}
		public For_Context for_() {
			return getRuleContext(For_Context.class,0);
		}
		public If_Context if_() {
			return getRuleContext(If_Context.class,0);
		}
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public While_Context while_() {
			return getRuleContext(While_Context.class,0);
		}
		public InstrucaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramCListener ) ((gramCListener)listener).enterInstrucao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramCListener ) ((gramCListener)listener).exitInstrucao(this);
		}
	}

	public final InstrucaoContext instrucao() throws RecognitionException {
		InstrucaoContext _localctx = new InstrucaoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_instrucao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			switch (_input.LA(1)) {
			case T__34:
				{
				setState(135); if_();
				}
				break;
			case T__11:
				{
				setState(136); for_();
				}
				break;
			case T__39:
				{
				setState(137); while_();
				}
				break;
			case T__10:
				{
				setState(138); return_();
				setState(139); match(T__8);
				}
				break;
			case ID:
				{
				setState(141); call();
				setState(142); match(T__8);
				}
				break;
			case T__12:
				{
				setState(144); print_();
				setState(145); match(T__8);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class If_Context extends ParserRuleContext {
		public BlocoCodigoContext blocoCodigo() {
			return getRuleContext(BlocoCodigoContext.class,0);
		}
		public CondicaoContext condicao() {
			return getRuleContext(CondicaoContext.class,0);
		}
		public Else_Context else_() {
			return getRuleContext(Else_Context.class,0);
		}
		public If_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramCListener ) ((gramCListener)listener).enterIf_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramCListener ) ((gramCListener)listener).exitIf_(this);
		}
	}

	public final If_Context if_() throws RecognitionException {
		If_Context _localctx = new If_Context(_ctx, getState());
		enterRule(_localctx, 20, RULE_if_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149); match(T__34);
			setState(150); match(T__35);
			setState(151); condicao();
			setState(152); match(T__14);
			setState(153); blocoCodigo();
			setState(155);
			_la = _input.LA(1);
			if (_la==T__23) {
				{
				setState(154); else_();
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

	public static class Else_Context extends ParserRuleContext {
		public BlocoCodigoContext blocoCodigo() {
			return getRuleContext(BlocoCodigoContext.class,0);
		}
		public If_Context if_() {
			return getRuleContext(If_Context.class,0);
		}
		public Else_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramCListener ) ((gramCListener)listener).enterElse_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramCListener ) ((gramCListener)listener).exitElse_(this);
		}
	}

	public final Else_Context else_() throws RecognitionException {
		Else_Context _localctx = new Else_Context(_ctx, getState());
		enterRule(_localctx, 22, RULE_else_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157); match(T__23);
			setState(160);
			switch (_input.LA(1)) {
			case T__25:
				{
				setState(158); blocoCodigo();
				}
				break;
			case T__34:
				{
				setState(159); if_();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class For_Context extends ParserRuleContext {
		public BlocoCodigoContext blocoCodigo() {
			return getRuleContext(BlocoCodigoContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public CondicaoContext condicao() {
			return getRuleContext(CondicaoContext.class,0);
		}
		public For_declaracaoContext for_declaracao() {
			return getRuleContext(For_declaracaoContext.class,0);
		}
		public For_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramCListener ) ((gramCListener)listener).enterFor_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramCListener ) ((gramCListener)listener).exitFor_(this);
		}
	}

	public final For_Context for_() throws RecognitionException {
		For_Context _localctx = new For_Context(_ctx, getState());
		enterRule(_localctx, 24, RULE_for_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162); match(T__11);
			setState(163); match(T__35);
			setState(164); for_declaracao();
			setState(165); match(T__8);
			setState(166); condicao();
			setState(167); match(T__8);
			setState(168); expressao();
			setState(169); match(T__14);
			setState(170); blocoCodigo();
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

	public static class For_declaracaoContext extends ParserRuleContext {
		public AtribuicaoContext atribuicao() {
			return getRuleContext(AtribuicaoContext.class,0);
		}
		public DeclaracaoContext declaracao() {
			return getRuleContext(DeclaracaoContext.class,0);
		}
		public For_declaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_declaracao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramCListener ) ((gramCListener)listener).enterFor_declaracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramCListener ) ((gramCListener)listener).exitFor_declaracao(this);
		}
	}

	public final For_declaracaoContext for_declaracao() throws RecognitionException {
		For_declaracaoContext _localctx = new For_declaracaoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_for_declaracao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			switch (_input.LA(1)) {
			case T__33:
			case T__26:
			case T__21:
			case T__20:
			case T__17:
				{
				setState(172); declaracao();
				}
				break;
			case ID:
				{
				setState(173); atribuicao();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class While_Context extends ParserRuleContext {
		public BlocoCodigoContext blocoCodigo() {
			return getRuleContext(BlocoCodigoContext.class,0);
		}
		public CondicaoContext condicao() {
			return getRuleContext(CondicaoContext.class,0);
		}
		public While_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramCListener ) ((gramCListener)listener).enterWhile_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramCListener ) ((gramCListener)listener).exitWhile_(this);
		}
	}

	public final While_Context while_() throws RecognitionException {
		While_Context _localctx = new While_Context(_ctx, getState());
		enterRule(_localctx, 28, RULE_while_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176); match(T__39);
			setState(177); match(T__35);
			setState(178); condicao();
			setState(179); match(T__14);
			setState(180); blocoCodigo();
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

	public static class Return_Context extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public Return_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramCListener ) ((gramCListener)listener).enterReturn_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramCListener ) ((gramCListener)listener).exitReturn_(this);
		}
	}

	public final Return_Context return_() throws RecognitionException {
		Return_Context _localctx = new Return_Context(_ctx, getState());
		enterRule(_localctx, 30, RULE_return_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182); match(T__10);
			setState(183); expressao();
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
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public TerminalNode ID() { return getToken(gramCParser.ID, 0); }
		public CallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramCListener ) ((gramCListener)listener).enterCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramCListener ) ((gramCListener)listener).exitCall(this);
		}
	}

	public final CallContext call() throws RecognitionException {
		CallContext _localctx = new CallContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185); match(ID);
			setState(186); match(T__35);
			setState(188);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__41) | (1L << T__38) | (1L << T__31) | (1L << T__30) | (1L << T__19) | (1L << T__18) | (1L << T__13) | (1L << T__0) | (1L << CHAR) | (1L << FLOAT) | (1L << INT) | (1L << ID))) != 0)) {
				{
				setState(187); parametros();
				}
			}

			setState(190); match(T__14);
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

	public static class Print_Context extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public Print_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramCListener ) ((gramCListener)listener).enterPrint_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramCListener ) ((gramCListener)listener).exitPrint_(this);
		}
	}

	public final Print_Context print_() throws RecognitionException {
		Print_Context _localctx = new Print_Context(_ctx, getState());
		enterRule(_localctx, 34, RULE_print_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192); match(T__12);
			setState(193); match(T__35);
			setState(194); expressao();
			setState(195); match(T__14);
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

	public static class Input_Context extends ParserRuleContext {
		public IdTipoContext idTipo() {
			return getRuleContext(IdTipoContext.class,0);
		}
		public Input_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramCListener ) ((gramCListener)listener).enterInput_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramCListener ) ((gramCListener)listener).exitInput_(this);
		}
	}

	public final Input_Context input_() throws RecognitionException {
		Input_Context _localctx = new Input_Context(_ctx, getState());
		enterRule(_localctx, 36, RULE_input_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197); match(T__41);
			setState(198); match(T__35);
			setState(199); idTipo();
			setState(200); match(T__14);
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

	public static class ParametrosContext extends ParserRuleContext {
		public ParametroContext parametro(int i) {
			return getRuleContext(ParametroContext.class,i);
		}
		public List<ParametroContext> parametro() {
			return getRuleContexts(ParametroContext.class);
		}
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramCListener ) ((gramCListener)listener).enterParametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramCListener ) ((gramCListener)listener).exitParametros(this);
		}
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_parametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202); parametro();
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__40) {
				{
				{
				setState(203); match(T__40);
				setState(204); parametro();
				}
				}
				setState(209);
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

	public static class ParametroContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public ParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramCListener ) ((gramCListener)listener).enterParametro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramCListener ) ((gramCListener)listener).exitParametro(this);
		}
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_parametro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210); expressao();
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

	public static class BlocoCodigoContext extends ParserRuleContext {
		public CodigoContext codigo(int i) {
			return getRuleContext(CodigoContext.class,i);
		}
		public List<CodigoContext> codigo() {
			return getRuleContexts(CodigoContext.class);
		}
		public BlocoCodigoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blocoCodigo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramCListener ) ((gramCListener)listener).enterBlocoCodigo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramCListener ) ((gramCListener)listener).exitBlocoCodigo(this);
		}
	}

	public final BlocoCodigoContext blocoCodigo() throws RecognitionException {
		BlocoCodigoContext _localctx = new BlocoCodigoContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_blocoCodigo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212); match(T__25);
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__39) | (1L << T__34) | (1L << T__33) | (1L << T__26) | (1L << T__21) | (1L << T__20) | (1L << T__17) | (1L << T__12) | (1L << T__11) | (1L << T__10) | (1L << ID))) != 0)) {
				{
				{
				setState(213); codigo();
				}
				}
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(219); match(T__22);
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

	public static class CodigoContext extends ParserRuleContext {
		public AtribuicaoContext atribuicao() {
			return getRuleContext(AtribuicaoContext.class,0);
		}
		public DeclaracaoContext declaracao() {
			return getRuleContext(DeclaracaoContext.class,0);
		}
		public InstrucaoContext instrucao() {
			return getRuleContext(InstrucaoContext.class,0);
		}
		public CodigoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codigo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramCListener ) ((gramCListener)listener).enterCodigo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramCListener ) ((gramCListener)listener).exitCodigo(this);
		}
	}

	public final CodigoContext codigo() throws RecognitionException {
		CodigoContext _localctx = new CodigoContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_codigo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(221); atribuicao();
				setState(222); match(T__8);
				}
				break;
			case 2:
				{
				setState(224); declaracao();
				setState(225); match(T__8);
				}
				break;
			case 3:
				{
				setState(227); instrucao();
				}
				break;
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

	public static class CondicaoContext extends ParserRuleContext {
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public CondicaoContext condicao(int i) {
			return getRuleContext(CondicaoContext.class,i);
		}
		public List<CondicaoContext> condicao() {
			return getRuleContexts(CondicaoContext.class);
		}
		public List<Condicao_ouContext> condicao_ou() {
			return getRuleContexts(Condicao_ouContext.class);
		}
		public Condicao_ouContext condicao_ou(int i) {
			return getRuleContext(Condicao_ouContext.class,i);
		}
		public CondicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramCListener ) ((gramCListener)listener).enterCondicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramCListener ) ((gramCListener)listener).exitCondicao(this);
		}
	}

	public final CondicaoContext condicao() throws RecognitionException {
		CondicaoContext _localctx = new CondicaoContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_condicao);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(230); condicao_ou();
			setState(239);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(237);
					switch (_input.LA(1)) {
					case T__27:
						{
						setState(231); match(T__27);
						setState(232); expressao();
						setState(233); match(T__36);
						setState(234); condicao();
						}
						break;
					case T__41:
					case T__38:
					case T__31:
					case T__30:
					case T__19:
					case T__18:
					case T__13:
					case T__0:
					case CHAR:
					case FLOAT:
					case INT:
					case ID:
						{
						setState(236); condicao_ou();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(241);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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

	public static class Condicao_ouContext extends ParserRuleContext {
		public Condicao_eContext condicao_e(int i) {
			return getRuleContext(Condicao_eContext.class,i);
		}
		public List<Condicao_eContext> condicao_e() {
			return getRuleContexts(Condicao_eContext.class);
		}
		public Condicao_ouContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicao_ou; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramCListener ) ((gramCListener)listener).enterCondicao_ou(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramCListener ) ((gramCListener)listener).exitCondicao_ou(this);
		}
	}

	public final Condicao_ouContext condicao_ou() throws RecognitionException {
		Condicao_ouContext _localctx = new Condicao_ouContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_condicao_ou);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(242); condicao_e();
			}
			setState(247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(243); match(T__6);
				setState(244); condicao_e();
				}
				}
				setState(249);
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

	public static class Condicao_eContext extends ParserRuleContext {
		public List<Condicao_comparacaoContext> condicao_comparacao() {
			return getRuleContexts(Condicao_comparacaoContext.class);
		}
		public Condicao_comparacaoContext condicao_comparacao(int i) {
			return getRuleContext(Condicao_comparacaoContext.class,i);
		}
		public Condicao_eContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicao_e; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramCListener ) ((gramCListener)listener).enterCondicao_e(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramCListener ) ((gramCListener)listener).exitCondicao_e(this);
		}
	}

	public final Condicao_eContext condicao_e() throws RecognitionException {
		Condicao_eContext _localctx = new Condicao_eContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_condicao_e);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(250); condicao_comparacao();
			}
			setState(255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(251); match(T__7);
				setState(252); condicao_comparacao();
				}
				}
				setState(257);
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

	public static class Condicao_comparacaoContext extends ParserRuleContext {
		public Condicao_igualdadeContext condicao_igualdade(int i) {
			return getRuleContext(Condicao_igualdadeContext.class,i);
		}
		public List<Condicao_igualdadeContext> condicao_igualdade() {
			return getRuleContexts(Condicao_igualdadeContext.class);
		}
		public Condicao_comparacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicao_comparacao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramCListener ) ((gramCListener)listener).enterCondicao_comparacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramCListener ) ((gramCListener)listener).exitCondicao_comparacao(this);
		}
	}

	public final Condicao_comparacaoContext condicao_comparacao() throws RecognitionException {
		Condicao_comparacaoContext _localctx = new Condicao_comparacaoContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_condicao_comparacao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(258); condicao_igualdade();
			}
			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__32) | (1L << T__28) | (1L << T__5) | (1L << T__1))) != 0)) {
				{
				setState(267);
				switch (_input.LA(1)) {
				case T__5:
					{
					setState(259); match(T__5);
					setState(260); condicao_igualdade();
					}
					break;
				case T__32:
					{
					setState(261); match(T__32);
					setState(262); condicao_igualdade();
					}
					break;
				case T__1:
					{
					setState(263); match(T__1);
					setState(264); condicao_igualdade();
					}
					break;
				case T__28:
					{
					setState(265); match(T__28);
					setState(266); condicao_igualdade();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(271);
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

	public static class Condicao_igualdadeContext extends ParserRuleContext {
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public Condicao_igualdadeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicao_igualdade; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramCListener ) ((gramCListener)listener).enterCondicao_igualdade(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramCListener ) ((gramCListener)listener).exitCondicao_igualdade(this);
		}
	}

	public final Condicao_igualdadeContext condicao_igualdade() throws RecognitionException {
		Condicao_igualdadeContext _localctx = new Condicao_igualdadeContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_condicao_igualdade);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(272); expressao();
			}
			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__29 || _la==T__3) {
				{
				{
				setState(277);
				switch (_input.LA(1)) {
				case T__29:
					{
					setState(273); match(T__29);
					setState(274); expressao();
					}
					break;
				case T__3:
					{
					setState(275); match(T__3);
					setState(276); expressao();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(283);
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

	public static class AtribuicaoContext extends ParserRuleContext {
		public OpAtribuicaoContext opAtribuicao() {
			return getRuleContext(OpAtribuicaoContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public CondicaoContext condicao() {
			return getRuleContext(CondicaoContext.class,0);
		}
		public TerminalNode ID() { return getToken(gramCParser.ID, 0); }
		public AtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramCListener ) ((gramCListener)listener).enterAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramCListener ) ((gramCListener)listener).exitAtribuicao(this);
		}
	}

	public final AtribuicaoContext atribuicao() throws RecognitionException {
		AtribuicaoContext _localctx = new AtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_atribuicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284); match(ID);
			setState(285); opAtribuicao();
			setState(288);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(286); expressao();
				}
				break;
			case 2:
				{
				setState(287); condicao();
				}
				break;
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

	public static class OpAtribuicaoContext extends ParserRuleContext {
		public OpAtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opAtribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramCListener ) ((gramCListener)listener).enterOpAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramCListener ) ((gramCListener)listener).exitOpAtribuicao(this);
		}
	}

	public final OpAtribuicaoContext opAtribuicao() throws RecognitionException {
		OpAtribuicaoContext _localctx = new OpAtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_opAtribuicao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__42) | (1L << T__24) | (1L << T__15) | (1L << T__9) | (1L << T__4))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class ExpressaoContext extends ParserRuleContext {
		public List<ExpressaoNumContext> expressaoNum() {
			return getRuleContexts(ExpressaoNumContext.class);
		}
		public ExpressaoNumContext expressaoNum(int i) {
			return getRuleContext(ExpressaoNumContext.class,i);
		}
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramCListener ) ((gramCListener)listener).enterExpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramCListener ) ((gramCListener)listener).exitExpressao(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_expressao);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(292); expressaoNum();
			}
			setState(301);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(297);
					switch (_input.LA(1)) {
					case T__13:
						{
						setState(293); match(T__13);
						setState(294); expressaoNum();
						}
						break;
					case T__38:
						{
						setState(295); match(T__38);
						setState(296); expressaoNum();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(303);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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

	public static class ExpressaoNumContext extends ParserRuleContext {
		public OperContext oper(int i) {
			return getRuleContext(OperContext.class,i);
		}
		public List<OperContext> oper() {
			return getRuleContexts(OperContext.class);
		}
		public ExpressaoNumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoNum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramCListener ) ((gramCListener)listener).enterExpressaoNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramCListener ) ((gramCListener)listener).exitExpressaoNum(this);
		}
	}

	public final ExpressaoNumContext expressaoNum() throws RecognitionException {
		ExpressaoNumContext _localctx = new ExpressaoNumContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_expressaoNum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(304); oper();
			}
			setState(315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__37) | (1L << T__16) | (1L << T__2))) != 0)) {
				{
				{
				setState(311);
				switch (_input.LA(1)) {
				case T__37:
					{
					setState(305); match(T__37);
					setState(306); oper();
					}
					break;
				case T__2:
					{
					setState(307); match(T__2);
					setState(308); oper();
					}
					break;
				case T__16:
					{
					setState(309); match(T__16);
					setState(310); oper();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(317);
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

	public static class OperContext extends ParserRuleContext {
		public OpUnarioContext opUnario() {
			return getRuleContext(OpUnarioContext.class,0);
		}
		public IncOpContext incOp() {
			return getRuleContext(IncOpContext.class,0);
		}
		public TerminalNode ID() { return getToken(gramCParser.ID, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public Input_Context input_() {
			return getRuleContext(Input_Context.class,0);
		}
		public OperContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oper; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramCListener ) ((gramCListener)listener).enterOper(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramCListener ) ((gramCListener)listener).exitOper(this);
		}
	}

	public final OperContext oper() throws RecognitionException {
		OperContext _localctx = new OperContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_oper);
		try {
			setState(333);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(318); opUnario();
				setState(319); match(ID);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(321); opUnario();
				setState(322); tipo();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(324); tipo();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(325); match(ID);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(326); incOp();
				setState(327); match(ID);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(329); match(ID);
				setState(330); incOp();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(331); call();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(332); input_();
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

	public static class IncOpContext extends ParserRuleContext {
		public IncOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramCListener ) ((gramCListener)listener).enterIncOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramCListener ) ((gramCListener)listener).exitIncOp(this);
		}
	}

	public final IncOpContext incOp() throws RecognitionException {
		IncOpContext _localctx = new IncOpContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_incOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			_la = _input.LA(1);
			if ( !(_la==T__31 || _la==T__18) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class OpUnarioContext extends ParserRuleContext {
		public OpUnarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opUnario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramCListener ) ((gramCListener)listener).enterOpUnario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramCListener ) ((gramCListener)listener).exitOpUnario(this);
		}
	}

	public final OpUnarioContext opUnario() throws RecognitionException {
		OpUnarioContext _localctx = new OpUnarioContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_opUnario);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__38) | (1L << T__13) | (1L << T__0))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class Boolean_Context extends ParserRuleContext {
		public Boolean_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramCListener ) ((gramCListener)listener).enterBoolean_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramCListener ) ((gramCListener)listener).exitBoolean_(this);
		}
	}

	public final Boolean_Context boolean_() throws RecognitionException {
		Boolean_Context _localctx = new Boolean_Context(_ctx, getState());
		enterRule(_localctx, 70, RULE_boolean_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			_la = _input.LA(1);
			if ( !(_la==T__30 || _la==T__19) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\63\u0158\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\3\3\3\3\3\3\3\5\3Q\n\3\3\4\7\4"+
		"T\n\4\f\4\16\4W\13\4\3\4\3\4\3\5\3\5\3\5\3\5\5\5_\n\5\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\7\6g\n\6\f\6\16\6j\13\6\3\7\3\7\3\7\3\7\3\7\5\7q\n\7\5\7s\n\7"+
		"\3\b\3\b\3\b\3\b\5\by\n\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\7\t\u0082\n\t\f"+
		"\t\16\t\u0085\13\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\5\13\u0096\n\13\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u009e"+
		"\n\f\3\r\3\r\3\r\5\r\u00a3\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\5\17\u00b1\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\5\22\u00bf\n\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\7\25\u00d0\n\25\f\25\16"+
		"\25\u00d3\13\25\3\26\3\26\3\27\3\27\7\27\u00d9\n\27\f\27\16\27\u00dc\13"+
		"\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u00e7\n\30\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u00f0\n\31\f\31\16\31\u00f3\13\31"+
		"\3\32\3\32\3\32\7\32\u00f8\n\32\f\32\16\32\u00fb\13\32\3\33\3\33\3\33"+
		"\7\33\u0100\n\33\f\33\16\33\u0103\13\33\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\7\34\u010e\n\34\f\34\16\34\u0111\13\34\3\35\3\35\3\35"+
		"\3\35\3\35\5\35\u0118\n\35\7\35\u011a\n\35\f\35\16\35\u011d\13\35\3\36"+
		"\3\36\3\36\3\36\5\36\u0123\n\36\3\37\3\37\3 \3 \3 \3 \3 \5 \u012c\n \7"+
		" \u012e\n \f \16 \u0131\13 \3!\3!\3!\3!\3!\3!\3!\5!\u013a\n!\7!\u013c"+
		"\n!\f!\16!\u013f\13!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\5\"\u0150\n\"\3#\3#\3$\3$\3%\3%\3%\2\2&\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFH\2\7\6\2\f\f\23\23\30"+
		"\31\34\34\7\2\3\3\25\25\36\36$$))\4\2\16\16\33\33\5\2\7\7  --\4\2\17\17"+
		"\32\32\u0161\2J\3\2\2\2\4P\3\2\2\2\6U\3\2\2\2\b^\3\2\2\2\nb\3\2\2\2\f"+
		"r\3\2\2\2\16t\3\2\2\2\20~\3\2\2\2\22\u0086\3\2\2\2\24\u0095\3\2\2\2\26"+
		"\u0097\3\2\2\2\30\u009f\3\2\2\2\32\u00a4\3\2\2\2\34\u00b0\3\2\2\2\36\u00b2"+
		"\3\2\2\2 \u00b8\3\2\2\2\"\u00bb\3\2\2\2$\u00c2\3\2\2\2&\u00c7\3\2\2\2"+
		"(\u00cc\3\2\2\2*\u00d4\3\2\2\2,\u00d6\3\2\2\2.\u00e6\3\2\2\2\60\u00e8"+
		"\3\2\2\2\62\u00f4\3\2\2\2\64\u00fc\3\2\2\2\66\u0104\3\2\2\28\u0112\3\2"+
		"\2\2:\u011e\3\2\2\2<\u0124\3\2\2\2>\u0126\3\2\2\2@\u0132\3\2\2\2B\u014f"+
		"\3\2\2\2D\u0151\3\2\2\2F\u0153\3\2\2\2H\u0155\3\2\2\2JK\t\2\2\2K\3\3\2"+
		"\2\2LQ\7\61\2\2MQ\7/\2\2NQ\7.\2\2OQ\5H%\2PL\3\2\2\2PM\3\2\2\2PN\3\2\2"+
		"\2PO\3\2\2\2Q\5\3\2\2\2RT\5\b\5\2SR\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2"+
		"\2\2VX\3\2\2\2WU\3\2\2\2XY\7\2\2\3Y\7\3\2\2\2Z[\5\n\6\2[\\\7%\2\2\\_\3"+
		"\2\2\2]_\5\16\b\2^Z\3\2\2\2^]\3\2\2\2_`\3\2\2\2`a\b\5\1\2a\t\3\2\2\2b"+
		"c\5\2\2\2ch\5\f\7\2de\7\5\2\2eg\5\f\7\2fd\3\2\2\2gj\3\2\2\2hf\3\2\2\2"+
		"hi\3\2\2\2i\13\3\2\2\2jh\3\2\2\2ks\7\62\2\2lm\7\62\2\2mp\7$\2\2nq\5> "+
		"\2oq\5\60\31\2pn\3\2\2\2po\3\2\2\2qs\3\2\2\2rk\3\2\2\2rl\3\2\2\2s\r\3"+
		"\2\2\2tu\5\2\2\2uv\7\62\2\2vx\7\n\2\2wy\5\20\t\2xw\3\2\2\2xy\3\2\2\2y"+
		"z\3\2\2\2z{\7\37\2\2{|\5,\27\2|}\b\b\1\2}\17\3\2\2\2~\u0083\5\22\n\2\177"+
		"\u0080\7\5\2\2\u0080\u0082\5\22\n\2\u0081\177\3\2\2\2\u0082\u0085\3\2"+
		"\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\21\3\2\2\2\u0085\u0083"+
		"\3\2\2\2\u0086\u0087\5\2\2\2\u0087\u0088\7\62\2\2\u0088\23\3\2\2\2\u0089"+
		"\u0096\5\26\f\2\u008a\u0096\5\32\16\2\u008b\u0096\5\36\20\2\u008c\u008d"+
		"\5 \21\2\u008d\u008e\7%\2\2\u008e\u0096\3\2\2\2\u008f\u0090\5\"\22\2\u0090"+
		"\u0091\7%\2\2\u0091\u0096\3\2\2\2\u0092\u0093\5$\23\2\u0093\u0094\7%\2"+
		"\2\u0094\u0096\3\2\2\2\u0095\u0089\3\2\2\2\u0095\u008a\3\2\2\2\u0095\u008b"+
		"\3\2\2\2\u0095\u008c\3\2\2\2\u0095\u008f\3\2\2\2\u0095\u0092\3\2\2\2\u0096"+
		"\25\3\2\2\2\u0097\u0098\7\13\2\2\u0098\u0099\7\n\2\2\u0099\u009a\5\60"+
		"\31\2\u009a\u009b\7\37\2\2\u009b\u009d\5,\27\2\u009c\u009e\5\30\r\2\u009d"+
		"\u009c\3\2\2\2\u009d\u009e\3\2\2\2\u009e\27\3\2\2\2\u009f\u00a2\7\26\2"+
		"\2\u00a0\u00a3\5,\27\2\u00a1\u00a3\5\26\f\2\u00a2\u00a0\3\2\2\2\u00a2"+
		"\u00a1\3\2\2\2\u00a3\31\3\2\2\2\u00a4\u00a5\7\"\2\2\u00a5\u00a6\7\n\2"+
		"\2\u00a6\u00a7\5\34\17\2\u00a7\u00a8\7%\2\2\u00a8\u00a9\5\60\31\2\u00a9"+
		"\u00aa\7%\2\2\u00aa\u00ab\5> \2\u00ab\u00ac\7\37\2\2\u00ac\u00ad\5,\27"+
		"\2\u00ad\33\3\2\2\2\u00ae\u00b1\5\n\6\2\u00af\u00b1\5:\36\2\u00b0\u00ae"+
		"\3\2\2\2\u00b0\u00af\3\2\2\2\u00b1\35\3\2\2\2\u00b2\u00b3\7\6\2\2\u00b3"+
		"\u00b4\7\n\2\2\u00b4\u00b5\5\60\31\2\u00b5\u00b6\7\37\2\2\u00b6\u00b7"+
		"\5,\27\2\u00b7\37\3\2\2\2\u00b8\u00b9\7#\2\2\u00b9\u00ba\5> \2\u00ba!"+
		"\3\2\2\2\u00bb\u00bc\7\62\2\2\u00bc\u00be\7\n\2\2\u00bd\u00bf\5(\25\2"+
		"\u00be\u00bd\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1"+
		"\7\37\2\2\u00c1#\3\2\2\2\u00c2\u00c3\7!\2\2\u00c3\u00c4\7\n\2\2\u00c4"+
		"\u00c5\5> \2\u00c5\u00c6\7\37\2\2\u00c6%\3\2\2\2\u00c7\u00c8\7\4\2\2\u00c8"+
		"\u00c9\7\n\2\2\u00c9\u00ca\5\2\2\2\u00ca\u00cb\7\37\2\2\u00cb\'\3\2\2"+
		"\2\u00cc\u00d1\5*\26\2\u00cd\u00ce\7\5\2\2\u00ce\u00d0\5*\26\2\u00cf\u00cd"+
		"\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2"+
		")\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4\u00d5\5> \2\u00d5+\3\2\2\2\u00d6\u00da"+
		"\7\24\2\2\u00d7\u00d9\5.\30\2\u00d8\u00d7\3\2\2\2\u00d9\u00dc\3\2\2\2"+
		"\u00da\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dd\3\2\2\2\u00dc\u00da"+
		"\3\2\2\2\u00dd\u00de\7\27\2\2\u00de-\3\2\2\2\u00df\u00e0\5:\36\2\u00e0"+
		"\u00e1\7%\2\2\u00e1\u00e7\3\2\2\2\u00e2\u00e3\5\n\6\2\u00e3\u00e4\7%\2"+
		"\2\u00e4\u00e7\3\2\2\2\u00e5\u00e7\5\24\13\2\u00e6\u00df\3\2\2\2\u00e6"+
		"\u00e2\3\2\2\2\u00e6\u00e5\3\2\2\2\u00e7/\3\2\2\2\u00e8\u00f1\5\62\32"+
		"\2\u00e9\u00ea\7\22\2\2\u00ea\u00eb\5> \2\u00eb\u00ec\7\t\2\2\u00ec\u00ed"+
		"\5\60\31\2\u00ed\u00f0\3\2\2\2\u00ee\u00f0\5\62\32\2\u00ef\u00e9\3\2\2"+
		"\2\u00ef\u00ee\3\2\2\2\u00f0\u00f3\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2"+
		"\3\2\2\2\u00f2\61\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4\u00f9\5\64\33\2\u00f5"+
		"\u00f6\7\'\2\2\u00f6\u00f8\5\64\33\2\u00f7\u00f5\3\2\2\2\u00f8\u00fb\3"+
		"\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\63\3\2\2\2\u00fb"+
		"\u00f9\3\2\2\2\u00fc\u0101\5\66\34\2\u00fd\u00fe\7&\2\2\u00fe\u0100\5"+
		"\66\34\2\u00ff\u00fd\3\2\2\2\u0100\u0103\3\2\2\2\u0101\u00ff\3\2\2\2\u0101"+
		"\u0102\3\2\2\2\u0102\65\3\2\2\2\u0103\u0101\3\2\2\2\u0104\u010f\58\35"+
		"\2\u0105\u0106\7(\2\2\u0106\u010e\58\35\2\u0107\u0108\7\r\2\2\u0108\u010e"+
		"\58\35\2\u0109\u010a\7,\2\2\u010a\u010e\58\35\2\u010b\u010c\7\21\2\2\u010c"+
		"\u010e\58\35\2\u010d\u0105\3\2\2\2\u010d\u0107\3\2\2\2\u010d\u0109\3\2"+
		"\2\2\u010d\u010b\3\2\2\2\u010e\u0111\3\2\2\2\u010f\u010d\3\2\2\2\u010f"+
		"\u0110\3\2\2\2\u0110\67\3\2\2\2\u0111\u010f\3\2\2\2\u0112\u011b\5> \2"+
		"\u0113\u0114\7\20\2\2\u0114\u0118\5> \2\u0115\u0116\7*\2\2\u0116\u0118"+
		"\5> \2\u0117\u0113\3\2\2\2\u0117\u0115\3\2\2\2\u0118\u011a\3\2\2\2\u0119"+
		"\u0117\3\2\2\2\u011a\u011d\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2"+
		"\2\2\u011c9\3\2\2\2\u011d\u011b\3\2\2\2\u011e\u011f\7\62\2\2\u011f\u0122"+
		"\5<\37\2\u0120\u0123\5> \2\u0121\u0123\5\60\31\2\u0122\u0120\3\2\2\2\u0122"+
		"\u0121\3\2\2\2\u0123;\3\2\2\2\u0124\u0125\t\3\2\2\u0125=\3\2\2\2\u0126"+
		"\u012f\5@!\2\u0127\u0128\7 \2\2\u0128\u012c\5@!\2\u0129\u012a\7\7\2\2"+
		"\u012a\u012c\5@!\2\u012b\u0127\3\2\2\2\u012b\u0129\3\2\2\2\u012c\u012e"+
		"\3\2\2\2\u012d\u012b\3\2\2\2\u012e\u0131\3\2\2\2\u012f\u012d\3\2\2\2\u012f"+
		"\u0130\3\2\2\2\u0130?\3\2\2\2\u0131\u012f\3\2\2\2\u0132\u013d\5B\"\2\u0133"+
		"\u0134\7\b\2\2\u0134\u013a\5B\"\2\u0135\u0136\7+\2\2\u0136\u013a\5B\""+
		"\2\u0137\u0138\7\35\2\2\u0138\u013a\5B\"\2\u0139\u0133\3\2\2\2\u0139\u0135"+
		"\3\2\2\2\u0139\u0137\3\2\2\2\u013a\u013c\3\2\2\2\u013b\u0139\3\2\2\2\u013c"+
		"\u013f\3\2\2\2\u013d\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013eA\3\2\2\2"+
		"\u013f\u013d\3\2\2\2\u0140\u0141\5F$\2\u0141\u0142\7\62\2\2\u0142\u0150"+
		"\3\2\2\2\u0143\u0144\5F$\2\u0144\u0145\5\4\3\2\u0145\u0150\3\2\2\2\u0146"+
		"\u0150\5\4\3\2\u0147\u0150\7\62\2\2\u0148\u0149\5D#\2\u0149\u014a\7\62"+
		"\2\2\u014a\u0150\3\2\2\2\u014b\u014c\7\62\2\2\u014c\u0150\5D#\2\u014d"+
		"\u0150\5\"\22\2\u014e\u0150\5&\24\2\u014f\u0140\3\2\2\2\u014f\u0143\3"+
		"\2\2\2\u014f\u0146\3\2\2\2\u014f\u0147\3\2\2\2\u014f\u0148\3\2\2\2\u014f"+
		"\u014b\3\2\2\2\u014f\u014d\3\2\2\2\u014f\u014e\3\2\2\2\u0150C\3\2\2\2"+
		"\u0151\u0152\t\4\2\2\u0152E\3\2\2\2\u0153\u0154\t\5\2\2\u0154G\3\2\2\2"+
		"\u0155\u0156\t\6\2\2\u0156I\3\2\2\2 PU^hprx\u0083\u0095\u009d\u00a2\u00b0"+
		"\u00be\u00d1\u00da\u00e6\u00ef\u00f1\u00f9\u0101\u010d\u010f\u0117\u011b"+
		"\u0122\u012b\u012f\u0139\u013d\u014f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}