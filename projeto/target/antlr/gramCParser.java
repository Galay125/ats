// Generated from gramC.g4 by ANTLR 4.4
package antlr;

        import java.util.*;

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


	    HashMap<String,Integer> linesFunc = new HashMap<String,Integer>();
	    int linesAux;
	    
	    HashMap<String,Integer> argsFunc = new HashMap<String,Integer>();
	    int argsAux;

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
			   System.out.println("Funções: " + linesFunc.size());
			                            int aux = 0;
			                            for(String s : linesFunc.keySet()){
			                                aux+=linesFunc.get(s);
			                                System.out.println("Função: "+ s +" = "+ linesFunc.get(s) +" Linhas");
			                                System.out.println("Args:  "+ argsFunc.get(s));
			                            }
			                            int total = aux + (linesFunc.size()*2);
			                            System.out.println("Numero Total de Linhas: " + total);
			                        
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
		 linesAux=0; argsAux=0;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(89); declaracao();
				setState(90); match(T__8);
				}
				break;
			case 2:
				{
				setState(92); funcao();
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
			setState(95); idTipo();
			setState(96); dec_nodo();
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__40) {
				{
				{
				setState(97); match(T__40);
				setState(98); dec_nodo();
				}
				}
				setState(103);
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
			setState(111);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(104); match(ID);
				}
				break;
			case 2:
				{
				setState(105); match(ID);
				setState(106); match(T__9);
				setState(109);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(107); expressao();
					}
					break;
				case 2:
					{
					setState(108); condicao();
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
		public Token ID;
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
			setState(113); idTipo();
			setState(114); ((FuncaoContext)_localctx).ID = match(ID);
			setState(115); match(T__35);
			setState(117);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__33) | (1L << T__26) | (1L << T__21) | (1L << T__20) | (1L << T__17))) != 0)) {
				{
				setState(116); argumentos();
				}
			}

			 argsFunc.put((((FuncaoContext)_localctx).ID!=null?((FuncaoContext)_localctx).ID.getText():null), argsAux); 
			setState(120); match(T__14);
			setState(121); blocoCodigo();
			 linesFunc.put((((FuncaoContext)_localctx).ID!=null?((FuncaoContext)_localctx).ID.getText():null), linesAux-1); 
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
			argsAux++;
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
			setState(148);
			switch (_input.LA(1)) {
			case T__34:
				{
				setState(136); if_();
				}
				break;
			case T__11:
				{
				setState(137); for_();
				}
				break;
			case T__39:
				{
				setState(138); while_();
				}
				break;
			case T__10:
				{
				setState(139); return_();
				setState(140); match(T__8);
				}
				break;
			case ID:
				{
				setState(142); call();
				setState(143); match(T__8);
				}
				break;
			case T__12:
				{
				setState(145); print_();
				setState(146); match(T__8);
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
			setState(150); match(T__34);
			setState(151); match(T__35);
			setState(152); condicao();
			setState(153); match(T__14);
			setState(154); blocoCodigo();
			setState(156);
			_la = _input.LA(1);
			if (_la==T__23) {
				{
				setState(155); else_();
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
			setState(158); match(T__23);
			setState(161);
			switch (_input.LA(1)) {
			case T__25:
				{
				setState(159); blocoCodigo();
				}
				break;
			case T__34:
				{
				setState(160); if_();
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
			setState(163); match(T__11);
			setState(164); match(T__35);
			setState(165); for_declaracao();
			setState(166); match(T__8);
			setState(167); condicao();
			setState(168); match(T__8);
			setState(169); expressao();
			setState(170); match(T__14);
			setState(171); blocoCodigo();
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
			setState(175);
			switch (_input.LA(1)) {
			case T__33:
			case T__26:
			case T__21:
			case T__20:
			case T__17:
				{
				setState(173); declaracao();
				}
				break;
			case ID:
				{
				setState(174); atribuicao();
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
			setState(177); match(T__39);
			setState(178); match(T__35);
			setState(179); condicao();
			setState(180); match(T__14);
			setState(181); blocoCodigo();
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
			setState(183); match(T__10);
			setState(184); expressao();
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
			setState(186); match(ID);
			setState(187); match(T__35);
			setState(189);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__41) | (1L << T__38) | (1L << T__31) | (1L << T__30) | (1L << T__19) | (1L << T__18) | (1L << T__13) | (1L << T__0) | (1L << CHAR) | (1L << FLOAT) | (1L << INT) | (1L << ID))) != 0)) {
				{
				setState(188); parametros();
				}
			}

			setState(191); match(T__14);
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
			setState(193); match(T__12);
			setState(194); match(T__35);
			setState(195); expressao();
			setState(196); match(T__14);
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
			setState(198); match(T__41);
			setState(199); match(T__35);
			setState(200); idTipo();
			setState(201); match(T__14);
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
			setState(203); parametro();
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__40) {
				{
				{
				setState(204); match(T__40);
				setState(205); parametro();
				}
				}
				setState(210);
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
			setState(211); expressao();
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
			setState(213); match(T__25);
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__39) | (1L << T__34) | (1L << T__33) | (1L << T__26) | (1L << T__21) | (1L << T__20) | (1L << T__17) | (1L << T__12) | (1L << T__11) | (1L << T__10) | (1L << ID))) != 0)) {
				{
				{
				setState(214); codigo();
				}
				}
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			 linesAux++; 
			setState(221); match(T__22);
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
			setState(230);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(223); atribuicao();
				setState(224); match(T__8);
				}
				break;
			case 2:
				{
				setState(226); declaracao();
				setState(227); match(T__8);
				}
				break;
			case 3:
				{
				setState(229); instrucao();
				}
				break;
			}
			 linesAux++; 
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
			setState(234); condicao_ou();
			setState(243);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(241);
					switch (_input.LA(1)) {
					case T__27:
						{
						setState(235); match(T__27);
						setState(236); expressao();
						setState(237); match(T__36);
						setState(238); condicao();
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
						setState(240); condicao_ou();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(245);
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
			setState(246); condicao_e();
			}
			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(247); match(T__6);
				setState(248); condicao_e();
				}
				}
				setState(253);
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
			setState(254); condicao_comparacao();
			}
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(255); match(T__7);
				setState(256); condicao_comparacao();
				}
				}
				setState(261);
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
			setState(262); condicao_igualdade();
			}
			setState(273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__32) | (1L << T__28) | (1L << T__5) | (1L << T__1))) != 0)) {
				{
				setState(271);
				switch (_input.LA(1)) {
				case T__5:
					{
					setState(263); match(T__5);
					setState(264); condicao_igualdade();
					}
					break;
				case T__32:
					{
					setState(265); match(T__32);
					setState(266); condicao_igualdade();
					}
					break;
				case T__1:
					{
					setState(267); match(T__1);
					setState(268); condicao_igualdade();
					}
					break;
				case T__28:
					{
					setState(269); match(T__28);
					setState(270); condicao_igualdade();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(275);
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
			setState(276); expressao();
			}
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__29 || _la==T__3) {
				{
				{
				setState(281);
				switch (_input.LA(1)) {
				case T__29:
					{
					setState(277); match(T__29);
					setState(278); expressao();
					}
					break;
				case T__3:
					{
					setState(279); match(T__3);
					setState(280); expressao();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(287);
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
			setState(288); match(ID);
			setState(289); opAtribuicao();
			setState(292);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(290); expressao();
				}
				break;
			case 2:
				{
				setState(291); condicao();
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
			setState(294);
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
			setState(296); expressaoNum();
			}
			setState(305);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(301);
					switch (_input.LA(1)) {
					case T__13:
						{
						setState(297); match(T__13);
						setState(298); expressaoNum();
						}
						break;
					case T__38:
						{
						setState(299); match(T__38);
						setState(300); expressaoNum();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(307);
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
			setState(308); oper();
			}
			setState(319);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__37) | (1L << T__16) | (1L << T__2))) != 0)) {
				{
				{
				setState(315);
				switch (_input.LA(1)) {
				case T__37:
					{
					setState(309); match(T__37);
					setState(310); oper();
					}
					break;
				case T__2:
					{
					setState(311); match(T__2);
					setState(312); oper();
					}
					break;
				case T__16:
					{
					setState(313); match(T__16);
					setState(314); oper();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(321);
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
			setState(337);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(322); opUnario();
				setState(323); match(ID);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(325); opUnario();
				setState(326); tipo();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(328); tipo();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(329); match(ID);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(330); incOp();
				setState(331); match(ID);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(333); match(ID);
				setState(334); incOp();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(335); call();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(336); input_();
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
			setState(339);
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
			setState(341);
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
			setState(343);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\63\u015c\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\3\3\3\3\3\3\3\5\3Q\n\3\3\4\7\4"+
		"T\n\4\f\4\16\4W\13\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\5\5`\n\5\3\6\3\6\3\6"+
		"\3\6\7\6f\n\6\f\6\16\6i\13\6\3\7\3\7\3\7\3\7\3\7\5\7p\n\7\5\7r\n\7\3\b"+
		"\3\b\3\b\3\b\5\bx\n\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\7\t\u0082\n\t\f"+
		"\t\16\t\u0085\13\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\5\13\u0097\n\13\3\f\3\f\3\f\3\f\3\f\3\f\5\f"+
		"\u009f\n\f\3\r\3\r\3\r\5\r\u00a4\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\5\17\u00b2\n\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\22\3\22\3\22\5\22\u00c0\n\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\7\25\u00d1\n\25\f\25"+
		"\16\25\u00d4\13\25\3\26\3\26\3\27\3\27\7\27\u00da\n\27\f\27\16\27\u00dd"+
		"\13\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u00e9\n"+
		"\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u00f4\n\31\f\31"+
		"\16\31\u00f7\13\31\3\32\3\32\3\32\7\32\u00fc\n\32\f\32\16\32\u00ff\13"+
		"\32\3\33\3\33\3\33\7\33\u0104\n\33\f\33\16\33\u0107\13\33\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\7\34\u0112\n\34\f\34\16\34\u0115\13"+
		"\34\3\35\3\35\3\35\3\35\3\35\5\35\u011c\n\35\7\35\u011e\n\35\f\35\16\35"+
		"\u0121\13\35\3\36\3\36\3\36\3\36\5\36\u0127\n\36\3\37\3\37\3 \3 \3 \3"+
		" \3 \5 \u0130\n \7 \u0132\n \f \16 \u0135\13 \3!\3!\3!\3!\3!\3!\3!\5!"+
		"\u013e\n!\7!\u0140\n!\f!\16!\u0143\13!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u0154\n\"\3#\3#\3$\3$\3%\3%\3%\2\2&\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFH\2"+
		"\7\6\2\f\f\23\23\30\31\34\34\7\2\3\3\25\25\36\36$$))\4\2\16\16\33\33\5"+
		"\2\7\7  --\4\2\17\17\32\32\u0165\2J\3\2\2\2\4P\3\2\2\2\6U\3\2\2\2\b_\3"+
		"\2\2\2\na\3\2\2\2\fq\3\2\2\2\16s\3\2\2\2\20~\3\2\2\2\22\u0086\3\2\2\2"+
		"\24\u0096\3\2\2\2\26\u0098\3\2\2\2\30\u00a0\3\2\2\2\32\u00a5\3\2\2\2\34"+
		"\u00b1\3\2\2\2\36\u00b3\3\2\2\2 \u00b9\3\2\2\2\"\u00bc\3\2\2\2$\u00c3"+
		"\3\2\2\2&\u00c8\3\2\2\2(\u00cd\3\2\2\2*\u00d5\3\2\2\2,\u00d7\3\2\2\2."+
		"\u00e8\3\2\2\2\60\u00ec\3\2\2\2\62\u00f8\3\2\2\2\64\u0100\3\2\2\2\66\u0108"+
		"\3\2\2\28\u0116\3\2\2\2:\u0122\3\2\2\2<\u0128\3\2\2\2>\u012a\3\2\2\2@"+
		"\u0136\3\2\2\2B\u0153\3\2\2\2D\u0155\3\2\2\2F\u0157\3\2\2\2H\u0159\3\2"+
		"\2\2JK\t\2\2\2K\3\3\2\2\2LQ\7\61\2\2MQ\7/\2\2NQ\7.\2\2OQ\5H%\2PL\3\2\2"+
		"\2PM\3\2\2\2PN\3\2\2\2PO\3\2\2\2Q\5\3\2\2\2RT\5\b\5\2SR\3\2\2\2TW\3\2"+
		"\2\2US\3\2\2\2UV\3\2\2\2VX\3\2\2\2WU\3\2\2\2XY\7\2\2\3YZ\b\4\1\2Z\7\3"+
		"\2\2\2[\\\5\n\6\2\\]\7%\2\2]`\3\2\2\2^`\5\16\b\2_[\3\2\2\2_^\3\2\2\2`"+
		"\t\3\2\2\2ab\5\2\2\2bg\5\f\7\2cd\7\5\2\2df\5\f\7\2ec\3\2\2\2fi\3\2\2\2"+
		"ge\3\2\2\2gh\3\2\2\2h\13\3\2\2\2ig\3\2\2\2jr\7\62\2\2kl\7\62\2\2lo\7$"+
		"\2\2mp\5> \2np\5\60\31\2om\3\2\2\2on\3\2\2\2pr\3\2\2\2qj\3\2\2\2qk\3\2"+
		"\2\2r\r\3\2\2\2st\5\2\2\2tu\7\62\2\2uw\7\n\2\2vx\5\20\t\2wv\3\2\2\2wx"+
		"\3\2\2\2xy\3\2\2\2yz\b\b\1\2z{\7\37\2\2{|\5,\27\2|}\b\b\1\2}\17\3\2\2"+
		"\2~\u0083\5\22\n\2\177\u0080\7\5\2\2\u0080\u0082\5\22\n\2\u0081\177\3"+
		"\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084"+
		"\21\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u0087\5\2\2\2\u0087\u0088\7\62\2"+
		"\2\u0088\u0089\b\n\1\2\u0089\23\3\2\2\2\u008a\u0097\5\26\f\2\u008b\u0097"+
		"\5\32\16\2\u008c\u0097\5\36\20\2\u008d\u008e\5 \21\2\u008e\u008f\7%\2"+
		"\2\u008f\u0097\3\2\2\2\u0090\u0091\5\"\22\2\u0091\u0092\7%\2\2\u0092\u0097"+
		"\3\2\2\2\u0093\u0094\5$\23\2\u0094\u0095\7%\2\2\u0095\u0097\3\2\2\2\u0096"+
		"\u008a\3\2\2\2\u0096\u008b\3\2\2\2\u0096\u008c\3\2\2\2\u0096\u008d\3\2"+
		"\2\2\u0096\u0090\3\2\2\2\u0096\u0093\3\2\2\2\u0097\25\3\2\2\2\u0098\u0099"+
		"\7\13\2\2\u0099\u009a\7\n\2\2\u009a\u009b\5\60\31\2\u009b\u009c\7\37\2"+
		"\2\u009c\u009e\5,\27\2\u009d\u009f\5\30\r\2\u009e\u009d\3\2\2\2\u009e"+
		"\u009f\3\2\2\2\u009f\27\3\2\2\2\u00a0\u00a3\7\26\2\2\u00a1\u00a4\5,\27"+
		"\2\u00a2\u00a4\5\26\f\2\u00a3\u00a1\3\2\2\2\u00a3\u00a2\3\2\2\2\u00a4"+
		"\31\3\2\2\2\u00a5\u00a6\7\"\2\2\u00a6\u00a7\7\n\2\2\u00a7\u00a8\5\34\17"+
		"\2\u00a8\u00a9\7%\2\2\u00a9\u00aa\5\60\31\2\u00aa\u00ab\7%\2\2\u00ab\u00ac"+
		"\5> \2\u00ac\u00ad\7\37\2\2\u00ad\u00ae\5,\27\2\u00ae\33\3\2\2\2\u00af"+
		"\u00b2\5\n\6\2\u00b0\u00b2\5:\36\2\u00b1\u00af\3\2\2\2\u00b1\u00b0\3\2"+
		"\2\2\u00b2\35\3\2\2\2\u00b3\u00b4\7\6\2\2\u00b4\u00b5\7\n\2\2\u00b5\u00b6"+
		"\5\60\31\2\u00b6\u00b7\7\37\2\2\u00b7\u00b8\5,\27\2\u00b8\37\3\2\2\2\u00b9"+
		"\u00ba\7#\2\2\u00ba\u00bb\5> \2\u00bb!\3\2\2\2\u00bc\u00bd\7\62\2\2\u00bd"+
		"\u00bf\7\n\2\2\u00be\u00c0\5(\25\2\u00bf\u00be\3\2\2\2\u00bf\u00c0\3\2"+
		"\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2\7\37\2\2\u00c2#\3\2\2\2\u00c3\u00c4"+
		"\7!\2\2\u00c4\u00c5\7\n\2\2\u00c5\u00c6\5> \2\u00c6\u00c7\7\37\2\2\u00c7"+
		"%\3\2\2\2\u00c8\u00c9\7\4\2\2\u00c9\u00ca\7\n\2\2\u00ca\u00cb\5\2\2\2"+
		"\u00cb\u00cc\7\37\2\2\u00cc\'\3\2\2\2\u00cd\u00d2\5*\26\2\u00ce\u00cf"+
		"\7\5\2\2\u00cf\u00d1\5*\26\2\u00d0\u00ce\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2"+
		"\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3)\3\2\2\2\u00d4\u00d2\3\2\2\2"+
		"\u00d5\u00d6\5> \2\u00d6+\3\2\2\2\u00d7\u00db\7\24\2\2\u00d8\u00da\5."+
		"\30\2\u00d9\u00d8\3\2\2\2\u00da\u00dd\3\2\2\2\u00db\u00d9\3\2\2\2\u00db"+
		"\u00dc\3\2\2\2\u00dc\u00de\3\2\2\2\u00dd\u00db\3\2\2\2\u00de\u00df\b\27"+
		"\1\2\u00df\u00e0\7\27\2\2\u00e0-\3\2\2\2\u00e1\u00e2\5:\36\2\u00e2\u00e3"+
		"\7%\2\2\u00e3\u00e9\3\2\2\2\u00e4\u00e5\5\n\6\2\u00e5\u00e6\7%\2\2\u00e6"+
		"\u00e9\3\2\2\2\u00e7\u00e9\5\24\13\2\u00e8\u00e1\3\2\2\2\u00e8\u00e4\3"+
		"\2\2\2\u00e8\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00eb\b\30\1\2\u00eb"+
		"/\3\2\2\2\u00ec\u00f5\5\62\32\2\u00ed\u00ee\7\22\2\2\u00ee\u00ef\5> \2"+
		"\u00ef\u00f0\7\t\2\2\u00f0\u00f1\5\60\31\2\u00f1\u00f4\3\2\2\2\u00f2\u00f4"+
		"\5\62\32\2\u00f3\u00ed\3\2\2\2\u00f3\u00f2\3\2\2\2\u00f4\u00f7\3\2\2\2"+
		"\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\61\3\2\2\2\u00f7\u00f5"+
		"\3\2\2\2\u00f8\u00fd\5\64\33\2\u00f9\u00fa\7\'\2\2\u00fa\u00fc\5\64\33"+
		"\2\u00fb\u00f9\3\2\2\2\u00fc\u00ff\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe"+
		"\3\2\2\2\u00fe\63\3\2\2\2\u00ff\u00fd\3\2\2\2\u0100\u0105\5\66\34\2\u0101"+
		"\u0102\7&\2\2\u0102\u0104\5\66\34\2\u0103\u0101\3\2\2\2\u0104\u0107\3"+
		"\2\2\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106\65\3\2\2\2\u0107"+
		"\u0105\3\2\2\2\u0108\u0113\58\35\2\u0109\u010a\7(\2\2\u010a\u0112\58\35"+
		"\2\u010b\u010c\7\r\2\2\u010c\u0112\58\35\2\u010d\u010e\7,\2\2\u010e\u0112"+
		"\58\35\2\u010f\u0110\7\21\2\2\u0110\u0112\58\35\2\u0111\u0109\3\2\2\2"+
		"\u0111\u010b\3\2\2\2\u0111\u010d\3\2\2\2\u0111\u010f\3\2\2\2\u0112\u0115"+
		"\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114\67\3\2\2\2\u0115"+
		"\u0113\3\2\2\2\u0116\u011f\5> \2\u0117\u0118\7\20\2\2\u0118\u011c\5> "+
		"\2\u0119\u011a\7*\2\2\u011a\u011c\5> \2\u011b\u0117\3\2\2\2\u011b\u0119"+
		"\3\2\2\2\u011c\u011e\3\2\2\2\u011d\u011b\3\2\2\2\u011e\u0121\3\2\2\2\u011f"+
		"\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u01209\3\2\2\2\u0121\u011f\3\2\2\2"+
		"\u0122\u0123\7\62\2\2\u0123\u0126\5<\37\2\u0124\u0127\5> \2\u0125\u0127"+
		"\5\60\31\2\u0126\u0124\3\2\2\2\u0126\u0125\3\2\2\2\u0127;\3\2\2\2\u0128"+
		"\u0129\t\3\2\2\u0129=\3\2\2\2\u012a\u0133\5@!\2\u012b\u012c\7 \2\2\u012c"+
		"\u0130\5@!\2\u012d\u012e\7\7\2\2\u012e\u0130\5@!\2\u012f\u012b\3\2\2\2"+
		"\u012f\u012d\3\2\2\2\u0130\u0132\3\2\2\2\u0131\u012f\3\2\2\2\u0132\u0135"+
		"\3\2\2\2\u0133\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134?\3\2\2\2\u0135"+
		"\u0133\3\2\2\2\u0136\u0141\5B\"\2\u0137\u0138\7\b\2\2\u0138\u013e\5B\""+
		"\2\u0139\u013a\7+\2\2\u013a\u013e\5B\"\2\u013b\u013c\7\35\2\2\u013c\u013e"+
		"\5B\"\2\u013d\u0137\3\2\2\2\u013d\u0139\3\2\2\2\u013d\u013b\3\2\2\2\u013e"+
		"\u0140\3\2\2\2\u013f\u013d\3\2\2\2\u0140\u0143\3\2\2\2\u0141\u013f\3\2"+
		"\2\2\u0141\u0142\3\2\2\2\u0142A\3\2\2\2\u0143\u0141\3\2\2\2\u0144\u0145"+
		"\5F$\2\u0145\u0146\7\62\2\2\u0146\u0154\3\2\2\2\u0147\u0148\5F$\2\u0148"+
		"\u0149\5\4\3\2\u0149\u0154\3\2\2\2\u014a\u0154\5\4\3\2\u014b\u0154\7\62"+
		"\2\2\u014c\u014d\5D#\2\u014d\u014e\7\62\2\2\u014e\u0154\3\2\2\2\u014f"+
		"\u0150\7\62\2\2\u0150\u0154\5D#\2\u0151\u0154\5\"\22\2\u0152\u0154\5&"+
		"\24\2\u0153\u0144\3\2\2\2\u0153\u0147\3\2\2\2\u0153\u014a\3\2\2\2\u0153"+
		"\u014b\3\2\2\2\u0153\u014c\3\2\2\2\u0153\u014f\3\2\2\2\u0153\u0151\3\2"+
		"\2\2\u0153\u0152\3\2\2\2\u0154C\3\2\2\2\u0155\u0156\t\4\2\2\u0156E\3\2"+
		"\2\2\u0157\u0158\t\5\2\2\u0158G\3\2\2\2\u0159\u015a\t\6\2\2\u015aI\3\2"+
		"\2\2 PU_goqw\u0083\u0096\u009e\u00a3\u00b1\u00bf\u00d2\u00db\u00e8\u00f3"+
		"\u00f5\u00fd\u0105\u0111\u0113\u011b\u011f\u0126\u012f\u0133\u013d\u0141"+
		"\u0153";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}