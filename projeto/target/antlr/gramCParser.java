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
		"<INVALID>", "'/'", "'*='", "'+='", "'char'", "'true'", "'return'", "'!='", 
		"'float'", "'||'", "'{'", "'while'", "';'", "'void'", "'&&'", "'}'", "'='", 
		"'for'", "'if'", "'?'", "'<='", "'int'", "'print'", "'('", "'*'", "'-='", 
		"','", "'false'", "'/='", "'boolean'", "':'", "'>='", "'--'", "'++'", 
		"'=='", "'<'", "'>'", "'!'", "'%'", "'else'", "'input'", "')'", "'+'", 
		"'-'", "CHAR", "FLOAT", "SufixoFloat", "INT", "ID", "WS"
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


		/* Nome da função */
		private String func;
		
		/* Argumentos Globais */
		private int argsGlobal = 0;
		
		/* Linhas por Função */
	    private HashMap<String,Integer> linesFunc = new HashMap<String,Integer>();
	    private int linesAux;
	    
	    /* Argumentos por Função */
	    private HashMap<String,Integer> argsFunc = new HashMap<String,Integer>();
	    private int argsAux;
	    
	    /* Nasted Blocks */
	    private HashMap<String,Integer> blocksFunc = new HashMap<String,Integer>();
	    private int blocksAux;
	    
	    public int getFuncs(){
	    	return this.linesFunc.size();
	    }
	    
	    public HashMap<String,Integer> getLinesFunc(){
	    	return this.linesFunc;
	    }
	    
	    public int getLines(){
	    	int aux=0;
	    	for(String s : this.linesFunc.keySet()){
	               aux+=this.linesFunc.get(s);
	        }
	        aux += (this.linesFunc.size()*2);
	        return aux;
	    }
	    
	    public HashMap<String,Integer> getArgsFunc(){
	    	return this.argsFunc;
	    }
	    
	    public int getArgs(){
	    	int aux=0;
	    	for(String s : this.argsFunc.keySet()){
	               aux+=this.argsFunc.get(s);
	        }
	    	return aux+this.argsGlobal;
	    }
	    
	    public HashMap<String,Integer> getNastedBlocks(){
	    	return this.blocksFunc;
	    }
	    

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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramCVisitor ) return ((gramCVisitor<? extends T>)visitor).visitIdTipo(this);
			else return visitor.visitChildren(this);
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
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__39) | (1L << T__35) | (1L << T__30) | (1L << T__22) | (1L << T__14))) != 0)) ) {
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
		public Boolean_Context boolean_() {
			return getRuleContext(Boolean_Context.class,0);
		}
		public TerminalNode CHAR() { return getToken(gramCParser.CHAR, 0); }
		public TerminalNode INT() { return getToken(gramCParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(gramCParser.FLOAT, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramCVisitor ) return ((gramCVisitor<? extends T>)visitor).visitTipo(this);
			else return visitor.visitChildren(this);
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
			case T__38:
			case T__16:
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
		public ProgramaContext programa(int i) {
			return getRuleContext(ProgramaContext.class,i);
		}
		public TerminalNode EOF() { return getToken(gramCParser.EOF, 0); }
		public List<ProgramaContext> programa() {
			return getRuleContexts(ProgramaContext.class);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramCVisitor ) return ((gramCVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__39) | (1L << T__35) | (1L << T__30) | (1L << T__22) | (1L << T__14))) != 0)) {
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
		public FuncaoContext funcao() {
			return getRuleContext(FuncaoContext.class,0);
		}
		public DeclaracaoContext declaracao() {
			return getRuleContext(DeclaracaoContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramCVisitor ) return ((gramCVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_programa);
		 linesAux=0; argsAux=0; blocksAux=0;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(88); declaracao();
				setState(89); match(T__31);
				argsGlobal+=argsAux;
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
		public List<IdTipoContext> idTipo() {
			return getRuleContexts(IdTipoContext.class);
		}
		public Dec_nodoContext dec_nodo(int i) {
			return getRuleContext(Dec_nodoContext.class,i);
		}
		public List<Dec_nodoContext> dec_nodo() {
			return getRuleContexts(Dec_nodoContext.class);
		}
		public IdTipoContext idTipo(int i) {
			return getRuleContext(IdTipoContext.class,i);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramCVisitor ) return ((gramCVisitor<? extends T>)visitor).visitDeclaracao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracaoContext declaracao() throws RecognitionException {
		DeclaracaoContext _localctx = new DeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declaracao);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(95); idTipo();
			setState(96); dec_nodo();
			setState(105);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(103);
					switch (_input.LA(1)) {
					case T__17:
						{
						setState(97); match(T__17);
						setState(98); dec_nodo();
						}
						break;
					case T__31:
						{
						setState(99); match(T__31);
						setState(100); idTipo();
						setState(101); dec_nodo();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(107);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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
		public TerminalNode ID() { return getToken(gramCParser.ID, 0); }
		public CondicaoContext condicao() {
			return getRuleContext(CondicaoContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramCVisitor ) return ((gramCVisitor<? extends T>)visitor).visitDec_nodo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dec_nodoContext dec_nodo() throws RecognitionException {
		Dec_nodoContext _localctx = new Dec_nodoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_dec_nodo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(108); match(ID);
				}
				break;
			case 2:
				{
				setState(109); match(ID);
				setState(110); match(T__27);
				setState(113);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(111); expressao();
					}
					break;
				case 2:
					{
					setState(112); condicao();
					}
					break;
				}
				}
				break;
			}
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

	public static class FuncaoContext extends ParserRuleContext {
		public Token ID;
		public IdTipoContext idTipo() {
			return getRuleContext(IdTipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(gramCParser.ID, 0); }
		public BlocoCodigoContext blocoCodigo() {
			return getRuleContext(BlocoCodigoContext.class,0);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramCVisitor ) return ((gramCVisitor<? extends T>)visitor).visitFuncao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncaoContext funcao() throws RecognitionException {
		FuncaoContext _localctx = new FuncaoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_funcao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119); idTipo();
			setState(120); ((FuncaoContext)_localctx).ID = match(ID);
			func = (((FuncaoContext)_localctx).ID!=null?((FuncaoContext)_localctx).ID.getText():null); 	blocksFunc.put(func, 0);
			setState(122); match(T__20);
			setState(124);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__39) | (1L << T__35) | (1L << T__30) | (1L << T__22) | (1L << T__14))) != 0)) {
				{
				setState(123); argumentos();
				}
			}

			setState(126); match(T__2);
			setState(127); blocoCodigo();
			 
					linesFunc.put(func, linesAux-1); 
					argsFunc.put(func, argsAux); 
				
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramCVisitor ) return ((gramCVisitor<? extends T>)visitor).visitArgumentos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentosContext argumentos() throws RecognitionException {
		ArgumentosContext _localctx = new ArgumentosContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_argumentos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130); argumento();
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__17) {
				{
				{
				setState(131); match(T__17);
				setState(132); argumento();
				}
				}
				setState(137);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramCVisitor ) return ((gramCVisitor<? extends T>)visitor).visitArgumento(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentoContext argumento() throws RecognitionException {
		ArgumentoContext _localctx = new ArgumentoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_argumento);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138); idTipo();
			setState(139); match(ID);
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
		public Print_Context print_() {
			return getRuleContext(Print_Context.class,0);
		}
		public For_Context for_() {
			return getRuleContext(For_Context.class,0);
		}
		public While_Context while_() {
			return getRuleContext(While_Context.class,0);
		}
		public Return_Context return_() {
			return getRuleContext(Return_Context.class,0);
		}
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public If_Context if_() {
			return getRuleContext(If_Context.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramCVisitor ) return ((gramCVisitor<? extends T>)visitor).visitInstrucao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstrucaoContext instrucao() throws RecognitionException {
		InstrucaoContext _localctx = new InstrucaoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_instrucao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			switch (_input.LA(1)) {
			case T__25:
				{
				setState(141); if_();
				}
				break;
			case T__26:
				{
				setState(142); for_();
				}
				break;
			case T__32:
				{
				setState(143); while_();
				}
				break;
			case T__37:
				{
				setState(144); return_();
				setState(145); match(T__31);
				}
				break;
			case ID:
				{
				setState(147); call();
				setState(148); match(T__31);
				}
				break;
			case T__21:
				{
				setState(150); print_();
				setState(151); match(T__31);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramCVisitor ) return ((gramCVisitor<? extends T>)visitor).visitIf_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_Context if_() throws RecognitionException {
		If_Context _localctx = new If_Context(_ctx, getState());
		enterRule(_localctx, 20, RULE_if_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155); match(T__25);
			setState(156); match(T__20);
			setState(157); condicao();
			setState(158); match(T__2);
			blocksAux++;
			setState(160); blocoCodigo();
				if(blocksFunc.get(func) < blocksAux) blocksFunc.put(func, blocksAux); 		blocksAux--;
			setState(163);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(162); else_();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramCVisitor ) return ((gramCVisitor<? extends T>)visitor).visitElse_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_Context else_() throws RecognitionException {
		Else_Context _localctx = new Else_Context(_ctx, getState());
		enterRule(_localctx, 22, RULE_else_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165); match(T__4);
			setState(171);
			switch (_input.LA(1)) {
			case T__33:
				{
				blocksAux++;
				setState(167); blocoCodigo();
					if(blocksFunc.get(func) < blocksAux) blocksFunc.put(func, blocksAux); 		blocksAux--;
				}
				break;
			case T__25:
				{
				setState(170); if_();
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
		public CondicaoContext condicao() {
			return getRuleContext(CondicaoContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramCVisitor ) return ((gramCVisitor<? extends T>)visitor).visitFor_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_Context for_() throws RecognitionException {
		For_Context _localctx = new For_Context(_ctx, getState());
		enterRule(_localctx, 24, RULE_for_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173); match(T__26);
			setState(174); match(T__20);
			setState(175); for_declaracao();
			setState(176); match(T__31);
			setState(177); condicao();
			setState(178); match(T__31);
			setState(179); expressao();
			setState(180); match(T__2);
			blocksAux++;
			setState(182); blocoCodigo();
			  if(blocksFunc.get(func) < blocksAux) blocksFunc.put(func, blocksAux); 		blocksAux--;
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramCVisitor ) return ((gramCVisitor<? extends T>)visitor).visitFor_declaracao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_declaracaoContext for_declaracao() throws RecognitionException {
		For_declaracaoContext _localctx = new For_declaracaoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_for_declaracao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			switch (_input.LA(1)) {
			case T__39:
			case T__35:
			case T__30:
			case T__22:
			case T__14:
				{
				setState(185); declaracao();
				}
				break;
			case ID:
				{
				setState(186); atribuicao();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramCVisitor ) return ((gramCVisitor<? extends T>)visitor).visitWhile_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_Context while_() throws RecognitionException {
		While_Context _localctx = new While_Context(_ctx, getState());
		enterRule(_localctx, 28, RULE_while_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189); match(T__32);
			setState(190); match(T__20);
			setState(191); condicao();
			setState(192); match(T__2);
			blocksAux++;
			setState(194); blocoCodigo();
			  if(blocksFunc.get(func) < blocksAux) blocksFunc.put(func, blocksAux); 		blocksAux--;
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramCVisitor ) return ((gramCVisitor<? extends T>)visitor).visitReturn_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_Context return_() throws RecognitionException {
		Return_Context _localctx = new Return_Context(_ctx, getState());
		enterRule(_localctx, 30, RULE_return_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197); match(T__37);
			setState(198); expressao();
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
		public TerminalNode ID() { return getToken(gramCParser.ID, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramCVisitor ) return ((gramCVisitor<? extends T>)visitor).visitCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallContext call() throws RecognitionException {
		CallContext _localctx = new CallContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200); match(ID);
			setState(201); match(T__20);
			setState(203);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__38) | (1L << T__16) | (1L << T__11) | (1L << T__10) | (1L << T__6) | (1L << T__3) | (1L << T__1) | (1L << T__0) | (1L << CHAR) | (1L << FLOAT) | (1L << INT) | (1L << ID))) != 0)) {
				{
				setState(202); parametros();
				}
			}

			setState(205); match(T__2);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramCVisitor ) return ((gramCVisitor<? extends T>)visitor).visitPrint_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Print_Context print_() throws RecognitionException {
		Print_Context _localctx = new Print_Context(_ctx, getState());
		enterRule(_localctx, 34, RULE_print_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207); match(T__21);
			setState(208); match(T__20);
			setState(209); expressao();
			setState(210); match(T__2);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramCVisitor ) return ((gramCVisitor<? extends T>)visitor).visitInput_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Input_Context input_() throws RecognitionException {
		Input_Context _localctx = new Input_Context(_ctx, getState());
		enterRule(_localctx, 36, RULE_input_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212); match(T__3);
			setState(213); match(T__20);
			setState(214); idTipo();
			setState(215); match(T__2);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramCVisitor ) return ((gramCVisitor<? extends T>)visitor).visitParametros(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_parametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217); parametro();
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__17) {
				{
				{
				setState(218); match(T__17);
				setState(219); parametro();
				}
				}
				setState(224);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramCVisitor ) return ((gramCVisitor<? extends T>)visitor).visitParametro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_parametro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225); expressao();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramCVisitor ) return ((gramCVisitor<? extends T>)visitor).visitBlocoCodigo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlocoCodigoContext blocoCodigo() throws RecognitionException {
		BlocoCodigoContext _localctx = new BlocoCodigoContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_blocoCodigo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227); match(T__33);
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__39) | (1L << T__37) | (1L << T__35) | (1L << T__32) | (1L << T__30) | (1L << T__26) | (1L << T__25) | (1L << T__22) | (1L << T__21) | (1L << T__14) | (1L << ID))) != 0)) {
				{
				{
				setState(228); codigo();
				}
				}
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			 linesAux++; 
			setState(235); match(T__28);
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
		public InstrucaoContext instrucao() {
			return getRuleContext(InstrucaoContext.class,0);
		}
		public AtribuicaoContext atribuicao() {
			return getRuleContext(AtribuicaoContext.class,0);
		}
		public DeclaracaoContext declaracao() {
			return getRuleContext(DeclaracaoContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramCVisitor ) return ((gramCVisitor<? extends T>)visitor).visitCodigo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodigoContext codigo() throws RecognitionException {
		CodigoContext _localctx = new CodigoContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_codigo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(237); atribuicao();
				setState(238); match(T__31);
				}
				break;
			case 2:
				{
				setState(240); declaracao();
				setState(241); match(T__31);
				}
				break;
			case 3:
				{
				setState(243); instrucao();
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
		public List<CondicaoContext> condicao() {
			return getRuleContexts(CondicaoContext.class);
		}
		public Condicao_ouContext condicao_ou(int i) {
			return getRuleContext(Condicao_ouContext.class,i);
		}
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public List<Condicao_ouContext> condicao_ou() {
			return getRuleContexts(Condicao_ouContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public CondicaoContext condicao(int i) {
			return getRuleContext(CondicaoContext.class,i);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramCVisitor ) return ((gramCVisitor<? extends T>)visitor).visitCondicao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicaoContext condicao() throws RecognitionException {
		CondicaoContext _localctx = new CondicaoContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_condicao);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(248); condicao_ou();
			setState(257);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(255);
					switch (_input.LA(1)) {
					case T__24:
						{
						setState(249); match(T__24);
						setState(250); expressao();
						setState(251); match(T__13);
						setState(252); condicao();
						}
						break;
					case T__38:
					case T__16:
					case T__11:
					case T__10:
					case T__6:
					case T__3:
					case T__1:
					case T__0:
					case CHAR:
					case FLOAT:
					case INT:
					case ID:
						{
						setState(254); condicao_ou();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(259);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramCVisitor ) return ((gramCVisitor<? extends T>)visitor).visitCondicao_ou(this);
			else return visitor.visitChildren(this);
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
			setState(260); condicao_e();
			}
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__34) {
				{
				{
				setState(261); match(T__34);
				setState(262); condicao_e();
				}
				}
				setState(267);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramCVisitor ) return ((gramCVisitor<? extends T>)visitor).visitCondicao_e(this);
			else return visitor.visitChildren(this);
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
			setState(268); condicao_comparacao();
			}
			setState(273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__29) {
				{
				{
				setState(269); match(T__29);
				setState(270); condicao_comparacao();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramCVisitor ) return ((gramCVisitor<? extends T>)visitor).visitCondicao_comparacao(this);
			else return visitor.visitChildren(this);
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
			setState(276); condicao_igualdade();
			}
			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << T__12) | (1L << T__8) | (1L << T__7))) != 0)) {
				{
				setState(285);
				switch (_input.LA(1)) {
				case T__7:
					{
					setState(277); match(T__7);
					setState(278); condicao_igualdade();
					}
					break;
				case T__8:
					{
					setState(279); match(T__8);
					setState(280); condicao_igualdade();
					}
					break;
				case T__12:
					{
					setState(281); match(T__12);
					setState(282); condicao_igualdade();
					}
					break;
				case T__23:
					{
					setState(283); match(T__23);
					setState(284); condicao_igualdade();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(289);
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
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramCVisitor ) return ((gramCVisitor<? extends T>)visitor).visitCondicao_igualdade(this);
			else return visitor.visitChildren(this);
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
			setState(290); expressao();
			}
			setState(299);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__36 || _la==T__9) {
				{
				{
				setState(295);
				switch (_input.LA(1)) {
				case T__36:
					{
					setState(291); match(T__36);
					setState(292); expressao();
					}
					break;
				case T__9:
					{
					setState(293); match(T__9);
					setState(294); expressao();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(301);
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
		public TerminalNode ID() { return getToken(gramCParser.ID, 0); }
		public CondicaoContext condicao() {
			return getRuleContext(CondicaoContext.class,0);
		}
		public OpAtribuicaoContext opAtribuicao() {
			return getRuleContext(OpAtribuicaoContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramCVisitor ) return ((gramCVisitor<? extends T>)visitor).visitAtribuicao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtribuicaoContext atribuicao() throws RecognitionException {
		AtribuicaoContext _localctx = new AtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_atribuicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302); match(ID);
			setState(303); opAtribuicao();
			setState(306);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(304); expressao();
				}
				break;
			case 2:
				{
				setState(305); condicao();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramCVisitor ) return ((gramCVisitor<? extends T>)visitor).visitOpAtribuicao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpAtribuicaoContext opAtribuicao() throws RecognitionException {
		OpAtribuicaoContext _localctx = new OpAtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_opAtribuicao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__41) | (1L << T__40) | (1L << T__27) | (1L << T__18) | (1L << T__15))) != 0)) ) {
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramCVisitor ) return ((gramCVisitor<? extends T>)visitor).visitExpressao(this);
			else return visitor.visitChildren(this);
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
			setState(310); expressaoNum();
			}
			setState(319);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(315);
					switch (_input.LA(1)) {
					case T__1:
						{
						setState(311); match(T__1);
						setState(312); expressaoNum();
						}
						break;
					case T__0:
						{
						setState(313); match(T__0);
						setState(314); expressaoNum();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(321);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramCVisitor ) return ((gramCVisitor<? extends T>)visitor).visitExpressaoNum(this);
			else return visitor.visitChildren(this);
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
			setState(322); oper();
			}
			setState(333);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__42) | (1L << T__19) | (1L << T__5))) != 0)) {
				{
				{
				setState(329);
				switch (_input.LA(1)) {
				case T__19:
					{
					setState(323); match(T__19);
					setState(324); oper();
					}
					break;
				case T__42:
					{
					setState(325); match(T__42);
					setState(326); oper();
					}
					break;
				case T__5:
					{
					setState(327); match(T__5);
					setState(328); oper();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(335);
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
		public Input_Context input_() {
			return getRuleContext(Input_Context.class,0);
		}
		public TerminalNode ID() { return getToken(gramCParser.ID, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public OpUnarioContext opUnario() {
			return getRuleContext(OpUnarioContext.class,0);
		}
		public IncOpContext incOp() {
			return getRuleContext(IncOpContext.class,0);
		}
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramCVisitor ) return ((gramCVisitor<? extends T>)visitor).visitOper(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperContext oper() throws RecognitionException {
		OperContext _localctx = new OperContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_oper);
		try {
			setState(351);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(336); opUnario();
				setState(337); match(ID);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(339); opUnario();
				setState(340); tipo();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(342); tipo();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(343); match(ID);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(344); incOp();
				setState(345); match(ID);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(347); match(ID);
				setState(348); incOp();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(349); call();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(350); input_();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramCVisitor ) return ((gramCVisitor<? extends T>)visitor).visitIncOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncOpContext incOp() throws RecognitionException {
		IncOpContext _localctx = new IncOpContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_incOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			_la = _input.LA(1);
			if ( !(_la==T__11 || _la==T__10) ) {
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramCVisitor ) return ((gramCVisitor<? extends T>)visitor).visitOpUnario(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpUnarioContext opUnario() throws RecognitionException {
		OpUnarioContext _localctx = new OpUnarioContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_opUnario);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__1) | (1L << T__0))) != 0)) ) {
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramCVisitor ) return ((gramCVisitor<? extends T>)visitor).visitBoolean_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolean_Context boolean_() throws RecognitionException {
		Boolean_Context _localctx = new Boolean_Context(_ctx, getState());
		enterRule(_localctx, 70, RULE_boolean_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			_la = _input.LA(1);
			if ( !(_la==T__38 || _la==T__16) ) {
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\63\u016a\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\3\3\3\3\3\3\3\5\3Q\n\3\3\4\7\4"+
		"T\n\4\f\4\16\4W\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\5\5`\n\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\7\6j\n\6\f\6\16\6m\13\6\3\7\3\7\3\7\3\7\3\7\5\7t"+
		"\n\7\5\7v\n\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\5\b\177\n\b\3\b\3\b\3\b\3\b"+
		"\3\t\3\t\3\t\7\t\u0088\n\t\f\t\16\t\u008b\13\t\3\n\3\n\3\n\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u009c\n\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00a6\n\f\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00ae"+
		"\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17"+
		"\3\17\5\17\u00be\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\5\22\u00ce\n\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\7\25\u00df\n\25\f\25\16\25\u00e2"+
		"\13\25\3\26\3\26\3\27\3\27\7\27\u00e8\n\27\f\27\16\27\u00eb\13\27\3\27"+
		"\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u00f7\n\30\3\30\3\30"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u0102\n\31\f\31\16\31\u0105\13"+
		"\31\3\32\3\32\3\32\7\32\u010a\n\32\f\32\16\32\u010d\13\32\3\33\3\33\3"+
		"\33\7\33\u0112\n\33\f\33\16\33\u0115\13\33\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\7\34\u0120\n\34\f\34\16\34\u0123\13\34\3\35\3\35\3"+
		"\35\3\35\3\35\5\35\u012a\n\35\7\35\u012c\n\35\f\35\16\35\u012f\13\35\3"+
		"\36\3\36\3\36\3\36\5\36\u0135\n\36\3\37\3\37\3 \3 \3 \3 \3 \5 \u013e\n"+
		" \7 \u0140\n \f \16 \u0143\13 \3!\3!\3!\3!\3!\3!\3!\5!\u014c\n!\7!\u014e"+
		"\n!\f!\16!\u0151\13!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\5\"\u0162\n\"\3#\3#\3$\3$\3%\3%\3%\2\2&\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFH\2\7\7\2\6\6\n\n\17\17"+
		"\27\27\37\37\6\2\4\5\22\22\33\33\36\36\3\2\"#\4\2\'\',-\4\2\7\7\35\35"+
		"\u0174\2J\3\2\2\2\4P\3\2\2\2\6U\3\2\2\2\b_\3\2\2\2\na\3\2\2\2\fu\3\2\2"+
		"\2\16y\3\2\2\2\20\u0084\3\2\2\2\22\u008c\3\2\2\2\24\u009b\3\2\2\2\26\u009d"+
		"\3\2\2\2\30\u00a7\3\2\2\2\32\u00af\3\2\2\2\34\u00bd\3\2\2\2\36\u00bf\3"+
		"\2\2\2 \u00c7\3\2\2\2\"\u00ca\3\2\2\2$\u00d1\3\2\2\2&\u00d6\3\2\2\2(\u00db"+
		"\3\2\2\2*\u00e3\3\2\2\2,\u00e5\3\2\2\2.\u00f6\3\2\2\2\60\u00fa\3\2\2\2"+
		"\62\u0106\3\2\2\2\64\u010e\3\2\2\2\66\u0116\3\2\2\28\u0124\3\2\2\2:\u0130"+
		"\3\2\2\2<\u0136\3\2\2\2>\u0138\3\2\2\2@\u0144\3\2\2\2B\u0161\3\2\2\2D"+
		"\u0163\3\2\2\2F\u0165\3\2\2\2H\u0167\3\2\2\2JK\t\2\2\2K\3\3\2\2\2LQ\7"+
		"\61\2\2MQ\7/\2\2NQ\7.\2\2OQ\5H%\2PL\3\2\2\2PM\3\2\2\2PN\3\2\2\2PO\3\2"+
		"\2\2Q\5\3\2\2\2RT\5\b\5\2SR\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2\2VX\3"+
		"\2\2\2WU\3\2\2\2XY\7\2\2\3Y\7\3\2\2\2Z[\5\n\6\2[\\\7\16\2\2\\]\b\5\1\2"+
		"]`\3\2\2\2^`\5\16\b\2_Z\3\2\2\2_^\3\2\2\2`\t\3\2\2\2ab\5\2\2\2bk\5\f\7"+
		"\2cd\7\34\2\2dj\5\f\7\2ef\7\16\2\2fg\5\2\2\2gh\5\f\7\2hj\3\2\2\2ic\3\2"+
		"\2\2ie\3\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2l\13\3\2\2\2mk\3\2\2\2nv\7"+
		"\62\2\2op\7\62\2\2ps\7\22\2\2qt\5> \2rt\5\60\31\2sq\3\2\2\2sr\3\2\2\2"+
		"tv\3\2\2\2un\3\2\2\2uo\3\2\2\2vw\3\2\2\2wx\b\7\1\2x\r\3\2\2\2yz\5\2\2"+
		"\2z{\7\62\2\2{|\b\b\1\2|~\7\31\2\2}\177\5\20\t\2~}\3\2\2\2~\177\3\2\2"+
		"\2\177\u0080\3\2\2\2\u0080\u0081\7+\2\2\u0081\u0082\5,\27\2\u0082\u0083"+
		"\b\b\1\2\u0083\17\3\2\2\2\u0084\u0089\5\22\n\2\u0085\u0086\7\34\2\2\u0086"+
		"\u0088\5\22\n\2\u0087\u0085\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087\3"+
		"\2\2\2\u0089\u008a\3\2\2\2\u008a\21\3\2\2\2\u008b\u0089\3\2\2\2\u008c"+
		"\u008d\5\2\2\2\u008d\u008e\7\62\2\2\u008e\23\3\2\2\2\u008f\u009c\5\26"+
		"\f\2\u0090\u009c\5\32\16\2\u0091\u009c\5\36\20\2\u0092\u0093\5 \21\2\u0093"+
		"\u0094\7\16\2\2\u0094\u009c\3\2\2\2\u0095\u0096\5\"\22\2\u0096\u0097\7"+
		"\16\2\2\u0097\u009c\3\2\2\2\u0098\u0099\5$\23\2\u0099\u009a\7\16\2\2\u009a"+
		"\u009c\3\2\2\2\u009b\u008f\3\2\2\2\u009b\u0090\3\2\2\2\u009b\u0091\3\2"+
		"\2\2\u009b\u0092\3\2\2\2\u009b\u0095\3\2\2\2\u009b\u0098\3\2\2\2\u009c"+
		"\25\3\2\2\2\u009d\u009e\7\24\2\2\u009e\u009f\7\31\2\2\u009f\u00a0\5\60"+
		"\31\2\u00a0\u00a1\7+\2\2\u00a1\u00a2\b\f\1\2\u00a2\u00a3\5,\27\2\u00a3"+
		"\u00a5\b\f\1\2\u00a4\u00a6\5\30\r\2\u00a5\u00a4\3\2\2\2\u00a5\u00a6\3"+
		"\2\2\2\u00a6\27\3\2\2\2\u00a7\u00ad\7)\2\2\u00a8\u00a9\b\r\1\2\u00a9\u00aa"+
		"\5,\27\2\u00aa\u00ab\b\r\1\2\u00ab\u00ae\3\2\2\2\u00ac\u00ae\5\26\f\2"+
		"\u00ad\u00a8\3\2\2\2\u00ad\u00ac\3\2\2\2\u00ae\31\3\2\2\2\u00af\u00b0"+
		"\7\23\2\2\u00b0\u00b1\7\31\2\2\u00b1\u00b2\5\34\17\2\u00b2\u00b3\7\16"+
		"\2\2\u00b3\u00b4\5\60\31\2\u00b4\u00b5\7\16\2\2\u00b5\u00b6\5> \2\u00b6"+
		"\u00b7\7+\2\2\u00b7\u00b8\b\16\1\2\u00b8\u00b9\5,\27\2\u00b9\u00ba\b\16"+
		"\1\2\u00ba\33\3\2\2\2\u00bb\u00be\5\n\6\2\u00bc\u00be\5:\36\2\u00bd\u00bb"+
		"\3\2\2\2\u00bd\u00bc\3\2\2\2\u00be\35\3\2\2\2\u00bf\u00c0\7\r\2\2\u00c0"+
		"\u00c1\7\31\2\2\u00c1\u00c2\5\60\31\2\u00c2\u00c3\7+\2\2\u00c3\u00c4\b"+
		"\20\1\2\u00c4\u00c5\5,\27\2\u00c5\u00c6\b\20\1\2\u00c6\37\3\2\2\2\u00c7"+
		"\u00c8\7\b\2\2\u00c8\u00c9\5> \2\u00c9!\3\2\2\2\u00ca\u00cb\7\62\2\2\u00cb"+
		"\u00cd\7\31\2\2\u00cc\u00ce\5(\25\2\u00cd\u00cc\3\2\2\2\u00cd\u00ce\3"+
		"\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0\7+\2\2\u00d0#\3\2\2\2\u00d1\u00d2"+
		"\7\30\2\2\u00d2\u00d3\7\31\2\2\u00d3\u00d4\5> \2\u00d4\u00d5\7+\2\2\u00d5"+
		"%\3\2\2\2\u00d6\u00d7\7*\2\2\u00d7\u00d8\7\31\2\2\u00d8\u00d9\5\2\2\2"+
		"\u00d9\u00da\7+\2\2\u00da\'\3\2\2\2\u00db\u00e0\5*\26\2\u00dc\u00dd\7"+
		"\34\2\2\u00dd\u00df\5*\26\2\u00de\u00dc\3\2\2\2\u00df\u00e2\3\2\2\2\u00e0"+
		"\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1)\3\2\2\2\u00e2\u00e0\3\2\2\2"+
		"\u00e3\u00e4\5> \2\u00e4+\3\2\2\2\u00e5\u00e9\7\f\2\2\u00e6\u00e8\5.\30"+
		"\2\u00e7\u00e6\3\2\2\2\u00e8\u00eb\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea"+
		"\3\2\2\2\u00ea\u00ec\3\2\2\2\u00eb\u00e9\3\2\2\2\u00ec\u00ed\b\27\1\2"+
		"\u00ed\u00ee\7\21\2\2\u00ee-\3\2\2\2\u00ef\u00f0\5:\36\2\u00f0\u00f1\7"+
		"\16\2\2\u00f1\u00f7\3\2\2\2\u00f2\u00f3\5\n\6\2\u00f3\u00f4\7\16\2\2\u00f4"+
		"\u00f7\3\2\2\2\u00f5\u00f7\5\24\13\2\u00f6\u00ef\3\2\2\2\u00f6\u00f2\3"+
		"\2\2\2\u00f6\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f9\b\30\1\2\u00f9"+
		"/\3\2\2\2\u00fa\u0103\5\62\32\2\u00fb\u00fc\7\25\2\2\u00fc\u00fd\5> \2"+
		"\u00fd\u00fe\7 \2\2\u00fe\u00ff\5\60\31\2\u00ff\u0102\3\2\2\2\u0100\u0102"+
		"\5\62\32\2\u0101\u00fb\3\2\2\2\u0101\u0100\3\2\2\2\u0102\u0105\3\2\2\2"+
		"\u0103\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104\61\3\2\2\2\u0105\u0103"+
		"\3\2\2\2\u0106\u010b\5\64\33\2\u0107\u0108\7\13\2\2\u0108\u010a\5\64\33"+
		"\2\u0109\u0107\3\2\2\2\u010a\u010d\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010c"+
		"\3\2\2\2\u010c\63\3\2\2\2\u010d\u010b\3\2\2\2\u010e\u0113\5\66\34\2\u010f"+
		"\u0110\7\20\2\2\u0110\u0112\5\66\34\2\u0111\u010f\3\2\2\2\u0112\u0115"+
		"\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114\65\3\2\2\2\u0115"+
		"\u0113\3\2\2\2\u0116\u0121\58\35\2\u0117\u0118\7&\2\2\u0118\u0120\58\35"+
		"\2\u0119\u011a\7%\2\2\u011a\u0120\58\35\2\u011b\u011c\7!\2\2\u011c\u0120"+
		"\58\35\2\u011d\u011e\7\26\2\2\u011e\u0120\58\35\2\u011f\u0117\3\2\2\2"+
		"\u011f\u0119\3\2\2\2\u011f\u011b\3\2\2\2\u011f\u011d\3\2\2\2\u0120\u0123"+
		"\3\2\2\2\u0121\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122\67\3\2\2\2\u0123"+
		"\u0121\3\2\2\2\u0124\u012d\5> \2\u0125\u0126\7\t\2\2\u0126\u012a\5> \2"+
		"\u0127\u0128\7$\2\2\u0128\u012a\5> \2\u0129\u0125\3\2\2\2\u0129\u0127"+
		"\3\2\2\2\u012a\u012c\3\2\2\2\u012b\u0129\3\2\2\2\u012c\u012f\3\2\2\2\u012d"+
		"\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e9\3\2\2\2\u012f\u012d\3\2\2\2"+
		"\u0130\u0131\7\62\2\2\u0131\u0134\5<\37\2\u0132\u0135\5> \2\u0133\u0135"+
		"\5\60\31\2\u0134\u0132\3\2\2\2\u0134\u0133\3\2\2\2\u0135;\3\2\2\2\u0136"+
		"\u0137\t\3\2\2\u0137=\3\2\2\2\u0138\u0141\5@!\2\u0139\u013a\7,\2\2\u013a"+
		"\u013e\5@!\2\u013b\u013c\7-\2\2\u013c\u013e\5@!\2\u013d\u0139\3\2\2\2"+
		"\u013d\u013b\3\2\2\2\u013e\u0140\3\2\2\2\u013f\u013d\3\2\2\2\u0140\u0143"+
		"\3\2\2\2\u0141\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142?\3\2\2\2\u0143"+
		"\u0141\3\2\2\2\u0144\u014f\5B\"\2\u0145\u0146\7\32\2\2\u0146\u014c\5B"+
		"\"\2\u0147\u0148\7\3\2\2\u0148\u014c\5B\"\2\u0149\u014a\7(\2\2\u014a\u014c"+
		"\5B\"\2\u014b\u0145\3\2\2\2\u014b\u0147\3\2\2\2\u014b\u0149\3\2\2\2\u014c"+
		"\u014e\3\2\2\2\u014d\u014b\3\2\2\2\u014e\u0151\3\2\2\2\u014f\u014d\3\2"+
		"\2\2\u014f\u0150\3\2\2\2\u0150A\3\2\2\2\u0151\u014f\3\2\2\2\u0152\u0153"+
		"\5F$\2\u0153\u0154\7\62\2\2\u0154\u0162\3\2\2\2\u0155\u0156\5F$\2\u0156"+
		"\u0157\5\4\3\2\u0157\u0162\3\2\2\2\u0158\u0162\5\4\3\2\u0159\u0162\7\62"+
		"\2\2\u015a\u015b\5D#\2\u015b\u015c\7\62\2\2\u015c\u0162\3\2\2\2\u015d"+
		"\u015e\7\62\2\2\u015e\u0162\5D#\2\u015f\u0162\5\"\22\2\u0160\u0162\5&"+
		"\24\2\u0161\u0152\3\2\2\2\u0161\u0155\3\2\2\2\u0161\u0158\3\2\2\2\u0161"+
		"\u0159\3\2\2\2\u0161\u015a\3\2\2\2\u0161\u015d\3\2\2\2\u0161\u015f\3\2"+
		"\2\2\u0161\u0160\3\2\2\2\u0162C\3\2\2\2\u0163\u0164\t\4\2\2\u0164E\3\2"+
		"\2\2\u0165\u0166\t\5\2\2\u0166G\3\2\2\2\u0167\u0168\t\6\2\2\u0168I\3\2"+
		"\2\2!PU_iksu~\u0089\u009b\u00a5\u00ad\u00bd\u00cd\u00e0\u00e9\u00f6\u0101"+
		"\u0103\u010b\u0113\u011f\u0121\u0129\u012d\u0134\u013d\u0141\u014b\u014f"+
		"\u0161";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}