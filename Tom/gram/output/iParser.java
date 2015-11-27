// $ANTLR 3.5 /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g 2015-11-14 19:28:41
 package gram; 

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class iParser extends DebugParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "SeqInstrucao", "Exp", "Funcao", 
		"Print", "Return", "For", "While", "If", "Declaracao", "Atribuicao", "Decl", 
		"ListaDecl", "Argumento", "ListaArgumentos", "Parametro", "ListaParametros", 
		"Dec", "Inc", "Sub", "Soma", "Div", "Mult", "Atrib", "Empty", "Input", 
		"Comp", "E", "Ou", "Float", "False", "True", "Char", "Int", "Condicional", 
		"IncDepois", "IncAntes", "Call", "Nao", "Neg", "Pos", "Id", "ExpNum", 
		"Igual", "Dif", "MenorQ", "MaiorQ", "Menor", "Maior", "Vazio", "Comentario", 
		"Comentarios", "Mod", "Menos", "Divide", "Vezes", "Mais", "DVoid", "DFloat", 
		"DBoolean", "DChar", "DInt", "CHAR", "COMENTARIO_LINHA", "COMENTARIO_LINHAS", 
		"DIGITO", "FLOAT", "ID", "INT", "LETRA", "SufixoFloat", "WS", "'!'", "'!='", 
		"'%'", "'&&'", "'('", "')'", "'*'", "'*='", "'+'", "'++'", "'+='", "','", 
		"'-'", "'--'", "'-='", "'/'", "'/='", "':'", "';'", "'<'", "'<='", "'='", 
		"'=='", "'>'", "'>='", "'?'", "'boolean'", "'char'", "'else'", "'false'", 
		"'float'", "'for'", "'if'", "'input'", "'int'", "'print'", "'return'", 
		"'true'", "'void'", "'while'", "'{'", "'||'", "'}'"
	};
	public static final int EOF=-1;
	public static final int Funcao=12;
	public static final int ListaParametros=25;
	public static final int Comentarios=60;
	public static final int Int=42;
	public static final int ListaDecl=21;
	public static final int DBoolean=68;
	public static final int Char=41;
	public static final int Ou=37;
	public static final int Atribuicao=19;
	public static final int Input=34;
	public static final int MenorQ=54;
	public static final int DVoid=66;
	public static final int Nao=47;
	public static final int Mod=61;
	public static final int E=36;
	public static final int If=17;
	public static final int Dif=53;
	public static final int DInt=70;
	public static final int Call=46;
	public static final int DFloat=67;
	public static final int Empty=33;
	public static final int Igual=52;
	public static final int DChar=69;
	public static final int Condicional=43;
	public static final int Declaracao=18;
	public static final int Dec=26;
	public static final int Parametro=24;
	public static final int Comp=35;
	public static final int Divide=63;
	public static final int Comentario=59;
	public static final int Menos=62;
	public static final int Mais=65;
	public static final int Neg=48;
	public static final int ExpNum=51;
	public static final int Exp=11;
	public static final int Vezes=64;
	public static final int Vazio=58;
	public static final int Decl=20;
	public static final int Pos=49;
	public static final int Float=38;
	public static final int Soma=29;
	public static final int Inc=27;
	public static final int SeqInstrucao=10;
	public static final int Atrib=32;
	public static final int Div=30;
	public static final int ListaArgumentos=23;
	public static final int True=40;
	public static final int False=39;
	public static final int For=15;
	public static final int Print=13;
	public static final int IncDepois=44;
	public static final int Mult=31;
	public static final int Menor=56;
	public static final int Argumento=22;
	public static final int Sub=28;
	public static final int MaiorQ=55;
	public static final int While=16;
	public static final int Maior=57;
	public static final int IncAntes=45;
	public static final int Return=14;
	public static final int Id=50;
	public static final int T__81=81;
	public static final int T__82=82;
	public static final int T__83=83;
	public static final int T__84=84;
	public static final int T__85=85;
	public static final int T__86=86;
	public static final int T__87=87;
	public static final int T__88=88;
	public static final int T__89=89;
	public static final int T__90=90;
	public static final int T__91=91;
	public static final int T__92=92;
	public static final int T__93=93;
	public static final int T__94=94;
	public static final int T__95=95;
	public static final int T__96=96;
	public static final int T__97=97;
	public static final int T__98=98;
	public static final int T__99=99;
	public static final int T__100=100;
	public static final int T__101=101;
	public static final int T__102=102;
	public static final int T__103=103;
	public static final int T__104=104;
	public static final int T__105=105;
	public static final int T__106=106;
	public static final int T__107=107;
	public static final int T__108=108;
	public static final int T__109=109;
	public static final int T__110=110;
	public static final int T__111=111;
	public static final int T__112=112;
	public static final int T__113=113;
	public static final int T__114=114;
	public static final int T__115=115;
	public static final int T__116=116;
	public static final int T__117=117;
	public static final int T__118=118;
	public static final int T__119=119;
	public static final int T__120=120;
	public static final int T__121=121;
	public static final int T__122=122;
	public static final int T__123=123;
	public static final int CHAR=71;
	public static final int COMENTARIO_LINHA=72;
	public static final int COMENTARIO_LINHAS=73;
	public static final int DIGITO=74;
	public static final int FLOAT=75;
	public static final int ID=76;
	public static final int INT=77;
	public static final int LETRA=78;
	public static final int SufixoFloat=79;
	public static final int WS=80;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public static final String[] ruleNames = new String[] {
		"invalidRule", "condicao_comparacao", "prog", "dec_nodo", "expressao", 
		"funcao", "parametro", "codigo", "condicao_ou", "if_", "instrucao", "tipo", 
		"parametros", "for_declaracao", "while_", "oper", "condicao_e", "else_", 
		"incOp", "comentarios", "blocoCodigo", "declaracao", "call", "opAtribuicao", 
		"boolean_", "argumento", "atribuicao", "input_", "print_", "for_", "comentario", 
		"programa", "idTipo", "condicao_igualdade", "condicao", "opUnario", "expressaoNum", 
		"argumentos", "return_"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
		false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false
	};

 
	public int ruleLevel = 0;
	public int getRuleLevel() { return ruleLevel; }
	public void incRuleLevel() { ruleLevel++; }
	public void decRuleLevel() { ruleLevel--; }
	public iParser(TokenStream input) {
		this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
	}
	public iParser(TokenStream input, int port, RecognizerSharedState state) {
		super(input, state);
		DebugEventSocketProxy proxy =
			new DebugEventSocketProxy(this,port,adaptor);
		setDebugListener(proxy);
		setTokenStream(new DebugTokenStream(input,proxy));
		try {
			proxy.handshake();
		}
		catch (IOException ioe) {
			reportError(ioe);
		}
		TreeAdaptor adap = new CommonTreeAdaptor();
		setTreeAdaptor(adap);
		proxy.setTreeAdaptor(adap);
	}

	public iParser(TokenStream input, DebugEventListener dbg) {
		super(input, dbg);
		 
		TreeAdaptor adap = new CommonTreeAdaptor();
		setTreeAdaptor(adap);

	}

	protected boolean evalPredicate(boolean result, String predicate) {
		dbg.semanticPredicate(result, predicate);
		return result;
	}

		protected DebugTreeAdaptor adaptor;
		public void setTreeAdaptor(TreeAdaptor adaptor) {
			this.adaptor = new DebugTreeAdaptor(dbg,adaptor);
		}
		public TreeAdaptor getTreeAdaptor() {
			return adaptor;
		}
	@Override public String[] getTokenNames() { return iParser.tokenNames; }
	@Override public String getGrammarFileName() { return "/home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g"; }


	public static class idTipo_return extends ParserRuleReturnScope {
		Tree tree;
		@Override
		public Tree getTree() { return tree; }
	};


	// $ANTLR start "idTipo"
	// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:15:1: idTipo : ( 'char' -> ^( DChar ) | 'int' -> ^( DInt ) | 'boolean' -> ^( DBoolean ) | 'float' -> ^( DFloat ) | 'void' -> ^( DVoid ) ) ;
	public final iParser.idTipo_return idTipo() throws  {
		iParser.idTipo_return retval = new iParser.idTipo_return();
		retval.start = input.LT(1);

		Tree root_0 = null;

		Token string_literal1=null;
		Token string_literal2=null;
		Token string_literal3=null;
		Token string_literal4=null;
		Token string_literal5=null;

		Tree string_literal1_tree=null;
		Tree string_literal2_tree=null;
		Tree string_literal3_tree=null;
		Tree string_literal4_tree=null;
		Tree string_literal5_tree=null;
		RewriteRuleTokenStream stream_115=new RewriteRuleTokenStream(adaptor,"token 115");
		RewriteRuleTokenStream stream_108=new RewriteRuleTokenStream(adaptor,"token 108");
		RewriteRuleTokenStream stream_107=new RewriteRuleTokenStream(adaptor,"token 107");
		RewriteRuleTokenStream stream_111=new RewriteRuleTokenStream(adaptor,"token 111");
		RewriteRuleTokenStream stream_119=new RewriteRuleTokenStream(adaptor,"token 119");

		try { dbg.enterRule(getGrammarFileName(), "idTipo");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(15, 0);

		try {
			// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:15:8: ( ( 'char' -> ^( DChar ) | 'int' -> ^( DInt ) | 'boolean' -> ^( DBoolean ) | 'float' -> ^( DFloat ) | 'void' -> ^( DVoid ) ) )
			dbg.enterAlt(1);

			// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:15:10: ( 'char' -> ^( DChar ) | 'int' -> ^( DInt ) | 'boolean' -> ^( DBoolean ) | 'float' -> ^( DFloat ) | 'void' -> ^( DVoid ) )
			{
			dbg.location(15,10);
			// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:15:10: ( 'char' -> ^( DChar ) | 'int' -> ^( DInt ) | 'boolean' -> ^( DBoolean ) | 'float' -> ^( DFloat ) | 'void' -> ^( DVoid ) )
			int alt1=5;
			try { dbg.enterSubRule(1);
			try { dbg.enterDecision(1, decisionCanBacktrack[1]);

			switch ( input.LA(1) ) {
			case 108:
				{
				alt1=1;
				}
				break;
			case 115:
				{
				alt1=2;
				}
				break;
			case 107:
				{
				alt1=3;
				}
				break;
			case 111:
				{
				alt1=4;
				}
				break;
			case 119:
				{
				alt1=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(1);}

			switch (alt1) {
				case 1 :
					dbg.enterAlt(1);

					// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:15:11: 'char'
					{
					dbg.location(15,11);
					string_literal1=(Token)match(input,108,FOLLOW_108_in_idTipo56);  
					stream_108.add(string_literal1);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Tree)adaptor.nil();
					// 15:18: -> ^( DChar )
					{
						dbg.location(15,21);
						// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:15:21: ^( DChar )
						{
						Tree root_1 = (Tree)adaptor.nil();
						dbg.location(15,23);
						root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(DChar, "DChar"), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:15:32: 'int'
					{
					dbg.location(15,32);
					string_literal2=(Token)match(input,115,FOLLOW_115_in_idTipo66);  
					stream_115.add(string_literal2);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Tree)adaptor.nil();
					// 15:38: -> ^( DInt )
					{
						dbg.location(15,41);
						// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:15:41: ^( DInt )
						{
						Tree root_1 = (Tree)adaptor.nil();
						dbg.location(15,43);
						root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(DInt, "DInt"), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:15:51: 'boolean'
					{
					dbg.location(15,51);
					string_literal3=(Token)match(input,107,FOLLOW_107_in_idTipo76);  
					stream_107.add(string_literal3);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Tree)adaptor.nil();
					// 15:61: -> ^( DBoolean )
					{
						dbg.location(15,64);
						// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:15:64: ^( DBoolean )
						{
						Tree root_1 = (Tree)adaptor.nil();
						dbg.location(15,66);
						root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(DBoolean, "DBoolean"), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:15:78: 'float'
					{
					dbg.location(15,78);
					string_literal4=(Token)match(input,111,FOLLOW_111_in_idTipo86);  
					stream_111.add(string_literal4);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Tree)adaptor.nil();
					// 15:86: -> ^( DFloat )
					{
						dbg.location(15,89);
						// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:15:89: ^( DFloat )
						{
						Tree root_1 = (Tree)adaptor.nil();
						dbg.location(15,91);
						root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(DFloat, "DFloat"), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:15:101: 'void'
					{
					dbg.location(15,101);
					string_literal5=(Token)match(input,119,FOLLOW_119_in_idTipo96);  
					stream_119.add(string_literal5);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Tree)adaptor.nil();
					// 15:108: -> ^( DVoid )
					{
						dbg.location(15,111);
						// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:15:111: ^( DVoid )
						{
						Tree root_1 = (Tree)adaptor.nil();
						dbg.location(15,113);
						root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(DVoid, "DVoid"), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			} finally {dbg.exitSubRule(1);}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(16, 2);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "idTipo");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "idTipo"


	public static class tipo_return extends ParserRuleReturnScope {
		Tree tree;
		@Override
		public Tree getTree() { return tree; }
	};


	// $ANTLR start "tipo"
	// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:18:1: tipo : ( INT -> ^( Int INT ) | FLOAT -> ^( Float FLOAT ) | CHAR -> ^( Char CHAR ) | boolean_ -> boolean_ ) ;
	public final iParser.tipo_return tipo() throws  {
		iParser.tipo_return retval = new iParser.tipo_return();
		retval.start = input.LT(1);

		Tree root_0 = null;

		Token INT6=null;
		Token FLOAT7=null;
		Token CHAR8=null;
		ParserRuleReturnScope boolean_9 =null;

		Tree INT6_tree=null;
		Tree FLOAT7_tree=null;
		Tree CHAR8_tree=null;
		RewriteRuleTokenStream stream_CHAR=new RewriteRuleTokenStream(adaptor,"token CHAR");
		RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
		RewriteRuleTokenStream stream_FLOAT=new RewriteRuleTokenStream(adaptor,"token FLOAT");
		RewriteRuleSubtreeStream stream_boolean_=new RewriteRuleSubtreeStream(adaptor,"rule boolean_");

		try { dbg.enterRule(getGrammarFileName(), "tipo");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(18, 0);

		try {
			// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:18:6: ( ( INT -> ^( Int INT ) | FLOAT -> ^( Float FLOAT ) | CHAR -> ^( Char CHAR ) | boolean_ -> boolean_ ) )
			dbg.enterAlt(1);

			// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:18:8: ( INT -> ^( Int INT ) | FLOAT -> ^( Float FLOAT ) | CHAR -> ^( Char CHAR ) | boolean_ -> boolean_ )
			{
			dbg.location(18,8);
			// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:18:8: ( INT -> ^( Int INT ) | FLOAT -> ^( Float FLOAT ) | CHAR -> ^( Char CHAR ) | boolean_ -> boolean_ )
			int alt2=4;
			try { dbg.enterSubRule(2);
			try { dbg.enterDecision(2, decisionCanBacktrack[2]);

			switch ( input.LA(1) ) {
			case INT:
				{
				alt2=1;
				}
				break;
			case FLOAT:
				{
				alt2=2;
				}
				break;
			case CHAR:
				{
				alt2=3;
				}
				break;
			case 110:
			case 118:
				{
				alt2=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(2);}

			switch (alt2) {
				case 1 :
					dbg.enterAlt(1);

					// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:18:9: INT
					{
					dbg.location(18,9);
					INT6=(Token)match(input,INT,FOLLOW_INT_in_tipo117);  
					stream_INT.add(INT6);

					// AST REWRITE
					// elements: INT
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Tree)adaptor.nil();
					// 18:13: -> ^( Int INT )
					{
						dbg.location(18,16);
						// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:18:16: ^( Int INT )
						{
						Tree root_1 = (Tree)adaptor.nil();
						dbg.location(18,18);
						root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Int, "Int"), root_1);
						dbg.location(18,22);
						adaptor.addChild(root_1, stream_INT.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:18:29: FLOAT
					{
					dbg.location(18,29);
					FLOAT7=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_tipo129);  
					stream_FLOAT.add(FLOAT7);

					// AST REWRITE
					// elements: FLOAT
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Tree)adaptor.nil();
					// 18:35: -> ^( Float FLOAT )
					{
						dbg.location(18,38);
						// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:18:38: ^( Float FLOAT )
						{
						Tree root_1 = (Tree)adaptor.nil();
						dbg.location(18,40);
						root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Float, "Float"), root_1);
						dbg.location(18,46);
						adaptor.addChild(root_1, stream_FLOAT.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:18:55: CHAR
					{
					dbg.location(18,55);
					CHAR8=(Token)match(input,CHAR,FOLLOW_CHAR_in_tipo141);  
					stream_CHAR.add(CHAR8);

					// AST REWRITE
					// elements: CHAR
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Tree)adaptor.nil();
					// 18:60: -> ^( Char CHAR )
					{
						dbg.location(18,63);
						// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:18:63: ^( Char CHAR )
						{
						Tree root_1 = (Tree)adaptor.nil();
						dbg.location(18,65);
						root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Char, "Char"), root_1);
						dbg.location(18,70);
						adaptor.addChild(root_1, stream_CHAR.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:18:78: boolean_
					{
					dbg.location(18,78);
					pushFollow(FOLLOW_boolean__in_tipo153);
					boolean_9=boolean_();
					state._fsp--;

					stream_boolean_.add(boolean_9.getTree());
					// AST REWRITE
					// elements: boolean_
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Tree)adaptor.nil();
					// 18:87: -> boolean_
					{
						dbg.location(18,90);
						adaptor.addChild(root_0, stream_boolean_.nextTree());
					}


					retval.tree = root_0;

					}
					break;

			}
			} finally {dbg.exitSubRule(2);}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(19, 2);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "tipo");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "tipo"


	public static class prog_return extends ParserRuleReturnScope {
		Tree tree;
		@Override
		public Tree getTree() { return tree; }
	};


	// $ANTLR start "prog"
	// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:23:1: prog : ( programa )* EOF -> ^( SeqInstrucao ( programa )* ) ;
	public final iParser.prog_return prog() throws  {
		iParser.prog_return retval = new iParser.prog_return();
		retval.start = input.LT(1);

		Tree root_0 = null;

		Token EOF11=null;
		ParserRuleReturnScope programa10 =null;

		Tree EOF11_tree=null;
		RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
		RewriteRuleSubtreeStream stream_programa=new RewriteRuleSubtreeStream(adaptor,"rule programa");

		try { dbg.enterRule(getGrammarFileName(), "prog");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(23, 0);

		try {
			// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:23:6: ( ( programa )* EOF -> ^( SeqInstrucao ( programa )* ) )
			dbg.enterAlt(1);

			// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:24:2: ( programa )* EOF
			{
			dbg.location(24,2);
			// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:24:2: ( programa )*
			try { dbg.enterSubRule(3);

			loop3:
			while (true) {
				int alt3=2;
				try { dbg.enterDecision(3, decisionCanBacktrack[3]);

				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= COMENTARIO_LINHA && LA3_0 <= COMENTARIO_LINHAS)||(LA3_0 >= 107 && LA3_0 <= 108)||LA3_0==111||LA3_0==115||LA3_0==119) ) {
					alt3=1;
				}

				} finally {dbg.exitDecision(3);}

				switch (alt3) {
				case 1 :
					dbg.enterAlt(1);

					// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:24:2: programa
					{
					dbg.location(24,2);
					pushFollow(FOLLOW_programa_in_prog174);
					programa10=programa();
					state._fsp--;

					stream_programa.add(programa10.getTree());
					}
					break;

				default :
					break loop3;
				}
			}
			} finally {dbg.exitSubRule(3);}
			dbg.location(24,12);
			EOF11=(Token)match(input,EOF,FOLLOW_EOF_in_prog177);  
			stream_EOF.add(EOF11);

			// AST REWRITE
			// elements: programa
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Tree)adaptor.nil();
			// 24:16: -> ^( SeqInstrucao ( programa )* )
			{
				dbg.location(24,19);
				// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:24:19: ^( SeqInstrucao ( programa )* )
				{
				Tree root_1 = (Tree)adaptor.nil();
				dbg.location(24,21);
				root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(SeqInstrucao, "SeqInstrucao"), root_1);
				dbg.location(24,34);
				// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:24:34: ( programa )*
				while ( stream_programa.hasNext() ) {
					dbg.location(24,34);
					adaptor.addChild(root_1, stream_programa.nextTree());
				}
				stream_programa.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(25, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "prog");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "prog"


	public static class programa_return extends ParserRuleReturnScope {
		Tree tree;
		@Override
		public Tree getTree() { return tree; }
	};


	// $ANTLR start "programa"
	// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:27:1: programa : ( declaracao ';' -> declaracao | funcao -> funcao ) ;
	public final iParser.programa_return programa() throws  {
		iParser.programa_return retval = new iParser.programa_return();
		retval.start = input.LT(1);

		Tree root_0 = null;

		Token char_literal13=null;
		ParserRuleReturnScope declaracao12 =null;
		ParserRuleReturnScope funcao14 =null;

		Tree char_literal13_tree=null;
		RewriteRuleTokenStream stream_99=new RewriteRuleTokenStream(adaptor,"token 99");
		RewriteRuleSubtreeStream stream_funcao=new RewriteRuleSubtreeStream(adaptor,"rule funcao");
		RewriteRuleSubtreeStream stream_declaracao=new RewriteRuleSubtreeStream(adaptor,"rule declaracao");

		try { dbg.enterRule(getGrammarFileName(), "programa");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(27, 0);

		try {
			// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:27:10: ( ( declaracao ';' -> declaracao | funcao -> funcao ) )
			dbg.enterAlt(1);

			// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:28:2: ( declaracao ';' -> declaracao | funcao -> funcao )
			{
			dbg.location(28,2);
			// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:28:2: ( declaracao ';' -> declaracao | funcao -> funcao )
			int alt4=2;
			try { dbg.enterSubRule(4);
			try { dbg.enterDecision(4, decisionCanBacktrack[4]);

			try {
				isCyclicDecision = true;
				alt4 = dfa4.predict(input);
			}
			catch (NoViableAltException nvae) {
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(4);}

			switch (alt4) {
				case 1 :
					dbg.enterAlt(1);

					// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:28:4: declaracao ';'
					{
					dbg.location(28,4);
					pushFollow(FOLLOW_declaracao_in_programa201);
					declaracao12=declaracao();
					state._fsp--;

					stream_declaracao.add(declaracao12.getTree());dbg.location(28,15);
					char_literal13=(Token)match(input,99,FOLLOW_99_in_programa203);  
					stream_99.add(char_literal13);

					// AST REWRITE
					// elements: declaracao
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Tree)adaptor.nil();
					// 28:19: -> declaracao
					{
						dbg.location(28,22);
						adaptor.addChild(root_0, stream_declaracao.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:29:4: funcao
					{
					dbg.location(29,4);
					pushFollow(FOLLOW_funcao_in_programa212);
					funcao14=funcao();
					state._fsp--;

					stream_funcao.add(funcao14.getTree());
					// AST REWRITE
					// elements: funcao
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Tree)adaptor.nil();
					// 29:11: -> funcao
					{
						dbg.location(29,14);
						adaptor.addChild(root_0, stream_funcao.nextTree());
					}


					retval.tree = root_0;

					}
					break;

			}
			} finally {dbg.exitSubRule(4);}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(31, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "programa");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "programa"


	public static class declaracao_return extends ParserRuleReturnScope {
		Tree tree;
		@Override
		public Tree getTree() { return tree; }
	};


	// $ANTLR start "declaracao"
	// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:33:1: declaracao : c1= comentarios idTipo c2= comentarios dec_nodo (c3= comentarios ',' c4= comentarios dec_nodo )* -> ^( Declaracao ^( Comentarios ( $c1)? ) idTipo ^( Comentarios ( $c2)? ) ^( ListaDecl ( dec_nodo )* ) ^( Comentarios ( $c3)? ) ^( Comentarios ( $c4)? ) ) ;
	public final iParser.declaracao_return declaracao() throws  {
		iParser.declaracao_return retval = new iParser.declaracao_return();
		retval.start = input.LT(1);

		Tree root_0 = null;

		Token char_literal17=null;
		ParserRuleReturnScope c1 =null;
		ParserRuleReturnScope c2 =null;
		ParserRuleReturnScope c3 =null;
		ParserRuleReturnScope c4 =null;
		ParserRuleReturnScope idTipo15 =null;
		ParserRuleReturnScope dec_nodo16 =null;
		ParserRuleReturnScope dec_nodo18 =null;

		Tree char_literal17_tree=null;
		RewriteRuleTokenStream stream_92=new RewriteRuleTokenStream(adaptor,"token 92");
		RewriteRuleSubtreeStream stream_comentarios=new RewriteRuleSubtreeStream(adaptor,"rule comentarios");
		RewriteRuleSubtreeStream stream_dec_nodo=new RewriteRuleSubtreeStream(adaptor,"rule dec_nodo");
		RewriteRuleSubtreeStream stream_idTipo=new RewriteRuleSubtreeStream(adaptor,"rule idTipo");

		try { dbg.enterRule(getGrammarFileName(), "declaracao");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(33, 0);

		try {
			// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:33:12: (c1= comentarios idTipo c2= comentarios dec_nodo (c3= comentarios ',' c4= comentarios dec_nodo )* -> ^( Declaracao ^( Comentarios ( $c1)? ) idTipo ^( Comentarios ( $c2)? ) ^( ListaDecl ( dec_nodo )* ) ^( Comentarios ( $c3)? ) ^( Comentarios ( $c4)? ) ) )
			dbg.enterAlt(1);

			// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:34:2: c1= comentarios idTipo c2= comentarios dec_nodo (c3= comentarios ',' c4= comentarios dec_nodo )*
			{
			dbg.location(34,4);
			pushFollow(FOLLOW_comentarios_in_declaracao232);
			c1=comentarios();
			state._fsp--;

			stream_comentarios.add(c1.getTree());dbg.location(34,17);
			pushFollow(FOLLOW_idTipo_in_declaracao234);
			idTipo15=idTipo();
			state._fsp--;

			stream_idTipo.add(idTipo15.getTree());dbg.location(34,26);
			pushFollow(FOLLOW_comentarios_in_declaracao238);
			c2=comentarios();
			state._fsp--;

			stream_comentarios.add(c2.getTree());dbg.location(34,39);
			pushFollow(FOLLOW_dec_nodo_in_declaracao240);
			dec_nodo16=dec_nodo();
			state._fsp--;

			stream_dec_nodo.add(dec_nodo16.getTree());dbg.location(34,48);
			// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:34:48: (c3= comentarios ',' c4= comentarios dec_nodo )*
			try { dbg.enterSubRule(5);

			loop5:
			while (true) {
				int alt5=2;
				try { dbg.enterDecision(5, decisionCanBacktrack[5]);

				int LA5_0 = input.LA(1);
				if ( ((LA5_0 >= COMENTARIO_LINHA && LA5_0 <= COMENTARIO_LINHAS)||LA5_0==92) ) {
					alt5=1;
				}

				} finally {dbg.exitDecision(5);}

				switch (alt5) {
				case 1 :
					dbg.enterAlt(1);

					// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:34:50: c3= comentarios ',' c4= comentarios dec_nodo
					{
					dbg.location(34,52);
					pushFollow(FOLLOW_comentarios_in_declaracao246);
					c3=comentarios();
					state._fsp--;

					stream_comentarios.add(c3.getTree());dbg.location(34,65);
					char_literal17=(Token)match(input,92,FOLLOW_92_in_declaracao248);  
					stream_92.add(char_literal17);
					dbg.location(34,71);
					pushFollow(FOLLOW_comentarios_in_declaracao252);
					c4=comentarios();
					state._fsp--;

					stream_comentarios.add(c4.getTree());dbg.location(34,84);
					pushFollow(FOLLOW_dec_nodo_in_declaracao254);
					dec_nodo18=dec_nodo();
					state._fsp--;

					stream_dec_nodo.add(dec_nodo18.getTree());
					}
					break;

				default :
					break loop5;
				}
			}
			} finally {dbg.exitSubRule(5);}

			// AST REWRITE
			// elements: dec_nodo, c4, c1, c2, c3, idTipo
			// token labels: 
			// rule labels: retval, c1, c2, c4, c3
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_c1=new RewriteRuleSubtreeStream(adaptor,"rule c1",c1!=null?c1.getTree():null);
			RewriteRuleSubtreeStream stream_c2=new RewriteRuleSubtreeStream(adaptor,"rule c2",c2!=null?c2.getTree():null);
			RewriteRuleSubtreeStream stream_c4=new RewriteRuleSubtreeStream(adaptor,"rule c4",c4!=null?c4.getTree():null);
			RewriteRuleSubtreeStream stream_c3=new RewriteRuleSubtreeStream(adaptor,"rule c3",c3!=null?c3.getTree():null);

			root_0 = (Tree)adaptor.nil();
			// 34:96: -> ^( Declaracao ^( Comentarios ( $c1)? ) idTipo ^( Comentarios ( $c2)? ) ^( ListaDecl ( dec_nodo )* ) ^( Comentarios ( $c3)? ) ^( Comentarios ( $c4)? ) )
			{
				dbg.location(34,99);
				// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:34:99: ^( Declaracao ^( Comentarios ( $c1)? ) idTipo ^( Comentarios ( $c2)? ) ^( ListaDecl ( dec_nodo )* ) ^( Comentarios ( $c3)? ) ^( Comentarios ( $c4)? ) )
				{
				Tree root_1 = (Tree)adaptor.nil();
				dbg.location(34,101);
				root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Declaracao, "Declaracao"), root_1);
				dbg.location(34,112);
				// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:34:112: ^( Comentarios ( $c1)? )
				{
				Tree root_2 = (Tree)adaptor.nil();
				dbg.location(34,114);
				root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);
				dbg.location(34,127);
				// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:34:127: ( $c1)?
				if ( stream_c1.hasNext() ) {
					dbg.location(34,127);
					adaptor.addChild(root_2, stream_c1.nextTree());
				}
				stream_c1.reset();

				adaptor.addChild(root_1, root_2);
				}
				dbg.location(34,132);
				adaptor.addChild(root_1, stream_idTipo.nextTree());dbg.location(34,139);
				// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:34:139: ^( Comentarios ( $c2)? )
				{
				Tree root_2 = (Tree)adaptor.nil();
				dbg.location(34,141);
				root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);
				dbg.location(34,154);
				// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:34:154: ( $c2)?
				if ( stream_c2.hasNext() ) {
					dbg.location(34,154);
					adaptor.addChild(root_2, stream_c2.nextTree());
				}
				stream_c2.reset();

				adaptor.addChild(root_1, root_2);
				}
				dbg.location(34,159);
				// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:34:159: ^( ListaDecl ( dec_nodo )* )
				{
				Tree root_2 = (Tree)adaptor.nil();
				dbg.location(34,161);
				root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(ListaDecl, "ListaDecl"), root_2);
				dbg.location(34,171);
				// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:34:171: ( dec_nodo )*
				while ( stream_dec_nodo.hasNext() ) {
					dbg.location(34,171);
					adaptor.addChild(root_2, stream_dec_nodo.nextTree());
				}
				stream_dec_nodo.reset();

				adaptor.addChild(root_1, root_2);
				}
				dbg.location(34,182);
				// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:34:182: ^( Comentarios ( $c3)? )
				{
				Tree root_2 = (Tree)adaptor.nil();
				dbg.location(34,184);
				root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);
				dbg.location(34,197);
				// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:34:197: ( $c3)?
				if ( stream_c3.hasNext() ) {
					dbg.location(34,197);
					adaptor.addChild(root_2, stream_c3.nextTree());
				}
				stream_c3.reset();

				adaptor.addChild(root_1, root_2);
				}
				dbg.location(34,202);
				// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:34:202: ^( Comentarios ( $c4)? )
				{
				Tree root_2 = (Tree)adaptor.nil();
				dbg.location(34,204);
				root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);
				dbg.location(34,217);
				// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:34:217: ( $c4)?
				if ( stream_c4.hasNext() ) {
					dbg.location(34,217);
					adaptor.addChild(root_2, stream_c4.nextTree());
				}
				stream_c4.reset();

				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(35, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "declaracao");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "declaracao"


	public static class dec_nodo_return extends ParserRuleReturnScope {
		Tree tree;
		@Override
		public Tree getTree() { return tree; }
	};


	// $ANTLR start "dec_nodo"
	// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:37:1: dec_nodo : ( ID c1= comentarios -> ^( Decl ID ^( Comentarios ( $c1)? ) ^( Comentarios ) Empty ^( Comentarios ) ) | ID c1= comentarios '=' c2= comentarios condicao c3= comentarios -> ^( Decl ID ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) condicao ^( Comentarios ( $c3)? ) ) ) ;
	public final iParser.dec_nodo_return dec_nodo() throws  {
		iParser.dec_nodo_return retval = new iParser.dec_nodo_return();
		retval.start = input.LT(1);

		Tree root_0 = null;

		Token ID19=null;
		Token ID20=null;
		Token char_literal21=null;
		ParserRuleReturnScope c1 =null;
		ParserRuleReturnScope c2 =null;
		ParserRuleReturnScope c3 =null;
		ParserRuleReturnScope condicao22 =null;

		Tree ID19_tree=null;
		Tree ID20_tree=null;
		Tree char_literal21_tree=null;
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_102=new RewriteRuleTokenStream(adaptor,"token 102");
		RewriteRuleSubtreeStream stream_comentarios=new RewriteRuleSubtreeStream(adaptor,"rule comentarios");
		RewriteRuleSubtreeStream stream_condicao=new RewriteRuleSubtreeStream(adaptor,"rule condicao");

		try { dbg.enterRule(getGrammarFileName(), "dec_nodo");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(37, 0);

		try {
			// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:37:10: ( ( ID c1= comentarios -> ^( Decl ID ^( Comentarios ( $c1)? ) ^( Comentarios ) Empty ^( Comentarios ) ) | ID c1= comentarios '=' c2= comentarios condicao c3= comentarios -> ^( Decl ID ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) condicao ^( Comentarios ( $c3)? ) ) ) )
			dbg.enterAlt(1);

			// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:38:2: ( ID c1= comentarios -> ^( Decl ID ^( Comentarios ( $c1)? ) ^( Comentarios ) Empty ^( Comentarios ) ) | ID c1= comentarios '=' c2= comentarios condicao c3= comentarios -> ^( Decl ID ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) condicao ^( Comentarios ( $c3)? ) ) )
			{
			dbg.location(38,2);
			// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:38:2: ( ID c1= comentarios -> ^( Decl ID ^( Comentarios ( $c1)? ) ^( Comentarios ) Empty ^( Comentarios ) ) | ID c1= comentarios '=' c2= comentarios condicao c3= comentarios -> ^( Decl ID ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) condicao ^( Comentarios ( $c3)? ) ) )
			int alt6=2;
			try { dbg.enterSubRule(6);
			try { dbg.enterDecision(6, decisionCanBacktrack[6]);

			try {
				isCyclicDecision = true;
				alt6 = dfa6.predict(input);
			}
			catch (NoViableAltException nvae) {
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(6);}

			switch (alt6) {
				case 1 :
					dbg.enterAlt(1);

					// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:38:4: ID c1= comentarios
					{
					dbg.location(38,4);
					ID19=(Token)match(input,ID,FOLLOW_ID_in_dec_nodo317);  
					stream_ID.add(ID19);
					dbg.location(38,9);
					pushFollow(FOLLOW_comentarios_in_dec_nodo321);
					c1=comentarios();
					state._fsp--;

					stream_comentarios.add(c1.getTree());
					// AST REWRITE
					// elements: c1, ID
					// token labels: 
					// rule labels: retval, c1
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_c1=new RewriteRuleSubtreeStream(adaptor,"rule c1",c1!=null?c1.getTree():null);

					root_0 = (Tree)adaptor.nil();
					// 38:22: -> ^( Decl ID ^( Comentarios ( $c1)? ) ^( Comentarios ) Empty ^( Comentarios ) )
					{
						dbg.location(38,25);
						// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:38:25: ^( Decl ID ^( Comentarios ( $c1)? ) ^( Comentarios ) Empty ^( Comentarios ) )
						{
						Tree root_1 = (Tree)adaptor.nil();
						dbg.location(38,27);
						root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Decl, "Decl"), root_1);
						dbg.location(38,32);
						adaptor.addChild(root_1, stream_ID.nextNode());dbg.location(38,35);
						// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:38:35: ^( Comentarios ( $c1)? )
						{
						Tree root_2 = (Tree)adaptor.nil();
						dbg.location(38,37);
						root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);
						dbg.location(38,50);
						// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:38:50: ( $c1)?
						if ( stream_c1.hasNext() ) {
							dbg.location(38,50);
							adaptor.addChild(root_2, stream_c1.nextTree());
						}
						stream_c1.reset();

						adaptor.addChild(root_1, root_2);
						}
						dbg.location(38,55);
						// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:38:55: ^( Comentarios )
						{
						Tree root_2 = (Tree)adaptor.nil();
						dbg.location(38,57);
						root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);
						adaptor.addChild(root_1, root_2);
						}
						dbg.location(38,70);
						adaptor.addChild(root_1, (Tree)adaptor.create(Empty, "Empty"));dbg.location(38,76);
						// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:38:76: ^( Comentarios )
						{
						Tree root_2 = (Tree)adaptor.nil();
						dbg.location(38,78);
						root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);
						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:39:4: ID c1= comentarios '=' c2= comentarios condicao c3= comentarios
					{
					dbg.location(39,4);
					ID20=(Token)match(input,ID,FOLLOW_ID_in_dec_nodo353);  
					stream_ID.add(ID20);
					dbg.location(39,9);
					pushFollow(FOLLOW_comentarios_in_dec_nodo357);
					c1=comentarios();
					state._fsp--;

					stream_comentarios.add(c1.getTree());dbg.location(39,22);
					char_literal21=(Token)match(input,102,FOLLOW_102_in_dec_nodo359);  
					stream_102.add(char_literal21);
					dbg.location(39,28);
					pushFollow(FOLLOW_comentarios_in_dec_nodo363);
					c2=comentarios();
					state._fsp--;

					stream_comentarios.add(c2.getTree());dbg.location(39,41);
					pushFollow(FOLLOW_condicao_in_dec_nodo365);
					condicao22=condicao();
					state._fsp--;

					stream_condicao.add(condicao22.getTree());dbg.location(39,52);
					pushFollow(FOLLOW_comentarios_in_dec_nodo369);
					c3=comentarios();
					state._fsp--;

					stream_comentarios.add(c3.getTree());
					// AST REWRITE
					// elements: condicao, c3, c2, c1, ID
					// token labels: 
					// rule labels: retval, c1, c2, c3
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_c1=new RewriteRuleSubtreeStream(adaptor,"rule c1",c1!=null?c1.getTree():null);
					RewriteRuleSubtreeStream stream_c2=new RewriteRuleSubtreeStream(adaptor,"rule c2",c2!=null?c2.getTree():null);
					RewriteRuleSubtreeStream stream_c3=new RewriteRuleSubtreeStream(adaptor,"rule c3",c3!=null?c3.getTree():null);

					root_0 = (Tree)adaptor.nil();
					// 39:65: -> ^( Decl ID ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) condicao ^( Comentarios ( $c3)? ) )
					{
						dbg.location(39,68);
						// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:39:68: ^( Decl ID ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) condicao ^( Comentarios ( $c3)? ) )
						{
						Tree root_1 = (Tree)adaptor.nil();
						dbg.location(39,70);
						root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Decl, "Decl"), root_1);
						dbg.location(39,75);
						adaptor.addChild(root_1, stream_ID.nextNode());dbg.location(39,78);
						// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:39:78: ^( Comentarios ( $c1)? )
						{
						Tree root_2 = (Tree)adaptor.nil();
						dbg.location(39,80);
						root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);
						dbg.location(39,93);
						// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:39:93: ( $c1)?
						if ( stream_c1.hasNext() ) {
							dbg.location(39,93);
							adaptor.addChild(root_2, stream_c1.nextTree());
						}
						stream_c1.reset();

						adaptor.addChild(root_1, root_2);
						}
						dbg.location(39,98);
						// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:39:98: ^( Comentarios ( $c2)? )
						{
						Tree root_2 = (Tree)adaptor.nil();
						dbg.location(39,100);
						root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);
						dbg.location(39,113);
						// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:39:113: ( $c2)?
						if ( stream_c2.hasNext() ) {
							dbg.location(39,113);
							adaptor.addChild(root_2, stream_c2.nextTree());
						}
						stream_c2.reset();

						adaptor.addChild(root_1, root_2);
						}
						dbg.location(39,118);
						adaptor.addChild(root_1, stream_condicao.nextTree());dbg.location(39,127);
						// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:39:127: ^( Comentarios ( $c3)? )
						{
						Tree root_2 = (Tree)adaptor.nil();
						dbg.location(39,129);
						root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);
						dbg.location(39,142);
						// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:39:142: ( $c3)?
						if ( stream_c3.hasNext() ) {
							dbg.location(39,142);
							adaptor.addChild(root_2, stream_c3.nextTree());
						}
						stream_c3.reset();

						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			} finally {dbg.exitSubRule(6);}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(41, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "dec_nodo");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "dec_nodo"


	public static class funcao_return extends ParserRuleReturnScope {
		Tree tree;
		@Override
		public Tree getTree() { return tree; }
	};


	// $ANTLR start "funcao"
	// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:43:1: funcao : c1= comentarios idTipo c2= comentarios ID c3= comentarios '(' c4= comentarios ( argumentos )? c5= comentarios ')' c6= comentarios blocoCodigo c7= comentarios -> ^( Funcao ^( Comentarios ( $c1)? ) idTipo ^( Comentarios ( $c2)? ) ID ^( Comentarios ( $c3)? ) ^( Comentarios ( $c4)? ) ^( ListaArgumentos ( argumentos )? ) ^( Comentarios ( $c5)? ) ^( Comentarios ( $c6)? ) blocoCodigo ^( Comentarios ( $c7)? ) ) ;
	public final iParser.funcao_return funcao() throws  {
		iParser.funcao_return retval = new iParser.funcao_return();
		retval.start = input.LT(1);

		Tree root_0 = null;

		Token ID24=null;
		Token char_literal25=null;
		Token char_literal27=null;
		ParserRuleReturnScope c1 =null;
		ParserRuleReturnScope c2 =null;
		ParserRuleReturnScope c3 =null;
		ParserRuleReturnScope c4 =null;
		ParserRuleReturnScope c5 =null;
		ParserRuleReturnScope c6 =null;
		ParserRuleReturnScope c7 =null;
		ParserRuleReturnScope idTipo23 =null;
		ParserRuleReturnScope argumentos26 =null;
		ParserRuleReturnScope blocoCodigo28 =null;

		Tree ID24_tree=null;
		Tree char_literal25_tree=null;
		Tree char_literal27_tree=null;
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_86=new RewriteRuleTokenStream(adaptor,"token 86");
		RewriteRuleTokenStream stream_85=new RewriteRuleTokenStream(adaptor,"token 85");
		RewriteRuleSubtreeStream stream_blocoCodigo=new RewriteRuleSubtreeStream(adaptor,"rule blocoCodigo");
		RewriteRuleSubtreeStream stream_comentarios=new RewriteRuleSubtreeStream(adaptor,"rule comentarios");
		RewriteRuleSubtreeStream stream_argumentos=new RewriteRuleSubtreeStream(adaptor,"rule argumentos");
		RewriteRuleSubtreeStream stream_idTipo=new RewriteRuleSubtreeStream(adaptor,"rule idTipo");

		try { dbg.enterRule(getGrammarFileName(), "funcao");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(43, 0);

		try {
			// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:43:8: (c1= comentarios idTipo c2= comentarios ID c3= comentarios '(' c4= comentarios ( argumentos )? c5= comentarios ')' c6= comentarios blocoCodigo c7= comentarios -> ^( Funcao ^( Comentarios ( $c1)? ) idTipo ^( Comentarios ( $c2)? ) ID ^( Comentarios ( $c3)? ) ^( Comentarios ( $c4)? ) ^( ListaArgumentos ( argumentos )? ) ^( Comentarios ( $c5)? ) ^( Comentarios ( $c6)? ) blocoCodigo ^( Comentarios ( $c7)? ) ) )
			dbg.enterAlt(1);

			// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:44:2: c1= comentarios idTipo c2= comentarios ID c3= comentarios '(' c4= comentarios ( argumentos )? c5= comentarios ')' c6= comentarios blocoCodigo c7= comentarios
			{
			dbg.location(44,4);
			pushFollow(FOLLOW_comentarios_in_funcao422);
			c1=comentarios();
			state._fsp--;

			stream_comentarios.add(c1.getTree());dbg.location(44,17);
			pushFollow(FOLLOW_idTipo_in_funcao424);
			idTipo23=idTipo();
			state._fsp--;

			stream_idTipo.add(idTipo23.getTree());dbg.location(44,26);
			pushFollow(FOLLOW_comentarios_in_funcao428);
			c2=comentarios();
			state._fsp--;

			stream_comentarios.add(c2.getTree());dbg.location(44,39);
			ID24=(Token)match(input,ID,FOLLOW_ID_in_funcao430);  
			stream_ID.add(ID24);
			dbg.location(44,44);
			pushFollow(FOLLOW_comentarios_in_funcao434);
			c3=comentarios();
			state._fsp--;

			stream_comentarios.add(c3.getTree());dbg.location(44,57);
			char_literal25=(Token)match(input,85,FOLLOW_85_in_funcao436);  
			stream_85.add(char_literal25);
			dbg.location(44,63);
			pushFollow(FOLLOW_comentarios_in_funcao440);
			c4=comentarios();
			state._fsp--;

			stream_comentarios.add(c4.getTree());dbg.location(44,76);
			// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:44:76: ( argumentos )?
			int alt7=2;
			try { dbg.enterSubRule(7);
			try { dbg.enterDecision(7, decisionCanBacktrack[7]);

			try {
				isCyclicDecision = true;
				alt7 = dfa7.predict(input);
			}
			catch (NoViableAltException nvae) {
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(7);}

			switch (alt7) {
				case 1 :
					dbg.enterAlt(1);

					// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:44:76: argumentos
					{
					dbg.location(44,76);
					pushFollow(FOLLOW_argumentos_in_funcao442);
					argumentos26=argumentos();
					state._fsp--;

					stream_argumentos.add(argumentos26.getTree());
					}
					break;

			}
			} finally {dbg.exitSubRule(7);}
			dbg.location(44,90);
			pushFollow(FOLLOW_comentarios_in_funcao447);
			c5=comentarios();
			state._fsp--;

			stream_comentarios.add(c5.getTree());dbg.location(44,103);
			char_literal27=(Token)match(input,86,FOLLOW_86_in_funcao449);  
			stream_86.add(char_literal27);
			dbg.location(44,109);
			pushFollow(FOLLOW_comentarios_in_funcao453);
			c6=comentarios();
			state._fsp--;

			stream_comentarios.add(c6.getTree());dbg.location(44,122);
			pushFollow(FOLLOW_blocoCodigo_in_funcao455);
			blocoCodigo28=blocoCodigo();
			state._fsp--;

			stream_blocoCodigo.add(blocoCodigo28.getTree());dbg.location(44,136);
			pushFollow(FOLLOW_comentarios_in_funcao459);
			c7=comentarios();
			state._fsp--;

			stream_comentarios.add(c7.getTree());
			// AST REWRITE
			// elements: c2, idTipo, c3, c6, argumentos, c1, c4, c7, c5, blocoCodigo, ID
			// token labels: 
			// rule labels: retval, c1, c2, c6, c5, c4, c3, c7
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_c1=new RewriteRuleSubtreeStream(adaptor,"rule c1",c1!=null?c1.getTree():null);
			RewriteRuleSubtreeStream stream_c2=new RewriteRuleSubtreeStream(adaptor,"rule c2",c2!=null?c2.getTree():null);
			RewriteRuleSubtreeStream stream_c6=new RewriteRuleSubtreeStream(adaptor,"rule c6",c6!=null?c6.getTree():null);
			RewriteRuleSubtreeStream stream_c5=new RewriteRuleSubtreeStream(adaptor,"rule c5",c5!=null?c5.getTree():null);
			RewriteRuleSubtreeStream stream_c4=new RewriteRuleSubtreeStream(adaptor,"rule c4",c4!=null?c4.getTree():null);
			RewriteRuleSubtreeStream stream_c3=new RewriteRuleSubtreeStream(adaptor,"rule c3",c3!=null?c3.getTree():null);
			RewriteRuleSubtreeStream stream_c7=new RewriteRuleSubtreeStream(adaptor,"rule c7",c7!=null?c7.getTree():null);

			root_0 = (Tree)adaptor.nil();
			// 44:149: -> ^( Funcao ^( Comentarios ( $c1)? ) idTipo ^( Comentarios ( $c2)? ) ID ^( Comentarios ( $c3)? ) ^( Comentarios ( $c4)? ) ^( ListaArgumentos ( argumentos )? ) ^( Comentarios ( $c5)? ) ^( Comentarios ( $c6)? ) blocoCodigo ^( Comentarios ( $c7)? ) )
			{
				dbg.location(44,152);
				// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:44:152: ^( Funcao ^( Comentarios ( $c1)? ) idTipo ^( Comentarios ( $c2)? ) ID ^( Comentarios ( $c3)? ) ^( Comentarios ( $c4)? ) ^( ListaArgumentos ( argumentos )? ) ^( Comentarios ( $c5)? ) ^( Comentarios ( $c6)? ) blocoCodigo ^( Comentarios ( $c7)? ) )
				{
				Tree root_1 = (Tree)adaptor.nil();
				dbg.location(44,154);
				root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Funcao, "Funcao"), root_1);
				dbg.location(44,161);
				// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:44:161: ^( Comentarios ( $c1)? )
				{
				Tree root_2 = (Tree)adaptor.nil();
				dbg.location(44,163);
				root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);
				dbg.location(44,176);
				// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:44:176: ( $c1)?
				if ( stream_c1.hasNext() ) {
					dbg.location(44,176);
					adaptor.addChild(root_2, stream_c1.nextTree());
				}
				stream_c1.reset();

				adaptor.addChild(root_1, root_2);
				}
				dbg.location(44,181);
				adaptor.addChild(root_1, stream_idTipo.nextTree());dbg.location(44,188);
				// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:44:188: ^( Comentarios ( $c2)? )
				{
				Tree root_2 = (Tree)adaptor.nil();
				dbg.location(44,190);
				root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);
				dbg.location(44,203);
				// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:44:203: ( $c2)?
				if ( stream_c2.hasNext() ) {
					dbg.location(44,203);
					adaptor.addChild(root_2, stream_c2.nextTree());
				}
				stream_c2.reset();

				adaptor.addChild(root_1, root_2);
				}
				dbg.location(44,208);
				adaptor.addChild(root_1, stream_ID.nextNode());dbg.location(44,211);
				// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:44:211: ^( Comentarios ( $c3)? )
				{
				Tree root_2 = (Tree)adaptor.nil();
				dbg.location(44,213);
				root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);
				dbg.location(44,226);
				// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:44:226: ( $c3)?
				if ( stream_c3.hasNext() ) {
					dbg.location(44,226);
					adaptor.addChild(root_2, stream_c3.nextTree());
				}
				stream_c3.reset();

				adaptor.addChild(root_1, root_2);
				}
				dbg.location(44,231);
				// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:44:231: ^( Comentarios ( $c4)? )
				{
				Tree root_2 = (Tree)adaptor.nil();
				dbg.location(44,233);
				root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);
				dbg.location(44,246);
				// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:44:246: ( $c4)?
				if ( stream_c4.hasNext() ) {
					dbg.location(44,246);
					adaptor.addChild(root_2, stream_c4.nextTree());
				}
				stream_c4.reset();

				adaptor.addChild(root_1, root_2);
				}
				dbg.location(44,251);
				// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:44:251: ^( ListaArgumentos ( argumentos )? )
				{
				Tree root_2 = (Tree)adaptor.nil();
				dbg.location(44,253);
				root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(ListaArgumentos, "ListaArgumentos"), root_2);
				dbg.location(44,269);
				// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:44:269: ( argumentos )?
				if ( stream_argumentos.hasNext() ) {
					dbg.location(44,269);
					adaptor.addChild(root_2, stream_argumentos.nextTree());
				}
				stream_argumentos.reset();

				adaptor.addChild(root_1, root_2);
				}
				dbg.location(44,282);
				// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:44:282: ^( Comentarios ( $c5)? )
				{
				Tree root_2 = (Tree)adaptor.nil();
				dbg.location(44,284);
				root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);
				dbg.location(44,297);
				// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:44:297: ( $c5)?
				if ( stream_c5.hasNext() ) {
					dbg.location(44,297);
					adaptor.addChild(root_2, stream_c5.nextTree());
				}
				stream_c5.reset();

				adaptor.addChild(root_1, root_2);
				}
				dbg.location(44,302);
				// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:44:302: ^( Comentarios ( $c6)? )
				{
				Tree root_2 = (Tree)adaptor.nil();
				dbg.location(44,304);
				root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);
				dbg.location(44,317);
				// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:44:317: ( $c6)?
				if ( stream_c6.hasNext() ) {
					dbg.location(44,317);
					adaptor.addChild(root_2, stream_c6.nextTree());
				}
				stream_c6.reset();

				adaptor.addChild(root_1, root_2);
				}
				dbg.location(44,322);
				adaptor.addChild(root_1, stream_blocoCodigo.nextTree());dbg.location(44,334);
				// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:44:334: ^( Comentarios ( $c7)? )
				{
				Tree root_2 = (Tree)adaptor.nil();
				dbg.location(44,336);
				root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);
				dbg.location(44,349);
				// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:44:349: ( $c7)?
				if ( stream_c7.hasNext() ) {
					dbg.location(44,349);
					adaptor.addChild(root_2, stream_c7.nextTree());
				}
				stream_c7.reset();

				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(45, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "funcao");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "funcao"


	public static class argumentos_return extends ParserRuleReturnScope {
		Tree tree;
		@Override
		public Tree getTree() { return tree; }
	};


	// $ANTLR start "argumentos"
	// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:47:1: argumentos : argumento ( ',' argumento )* -> ( argumento )+ ;
	public final iParser.argumentos_return argumentos() throws  {
		iParser.argumentos_return retval = new iParser.argumentos_return();
		retval.start = input.LT(1);

		Tree root_0 = null;

		Token char_literal30=null;
		ParserRuleReturnScope argumento29 =null;
		ParserRuleReturnScope argumento31 =null;

		Tree char_literal30_tree=null;
		RewriteRuleTokenStream stream_92=new RewriteRuleTokenStream(adaptor,"token 92");
		RewriteRuleSubtreeStream stream_argumento=new RewriteRuleSubtreeStream(adaptor,"rule argumento");

		try { dbg.enterRule(getGrammarFileName(), "argumentos");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(47, 0);

		try {
			// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:47:12: ( argumento ( ',' argumento )* -> ( argumento )+ )
			dbg.enterAlt(1);

			// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:48:2: argumento ( ',' argumento )*
			{
			dbg.location(48,2);
			pushFollow(FOLLOW_argumento_in_argumentos546);
			argumento29=argumento();
			state._fsp--;

			stream_argumento.add(argumento29.getTree());dbg.location(48,12);
			// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:48:12: ( ',' argumento )*
			try { dbg.enterSubRule(8);

			loop8:
			while (true) {
				int alt8=2;
				try { dbg.enterDecision(8, decisionCanBacktrack[8]);

				int LA8_0 = input.LA(1);
				if ( (LA8_0==92) ) {
					alt8=1;
				}

				} finally {dbg.exitDecision(8);}

				switch (alt8) {
				case 1 :
					dbg.enterAlt(1);

					// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:48:14: ',' argumento
					{
					dbg.location(48,14);
					char_literal30=(Token)match(input,92,FOLLOW_92_in_argumentos550);  
					stream_92.add(char_literal30);
					dbg.location(48,18);
					pushFollow(FOLLOW_argumento_in_argumentos552);
					argumento31=argumento();
					state._fsp--;

					stream_argumento.add(argumento31.getTree());
					}
					break;

				default :
					break loop8;
				}
			}
			} finally {dbg.exitSubRule(8);}

			// AST REWRITE
			// elements: argumento
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Tree)adaptor.nil();
			// 48:31: -> ( argumento )+
			{
				dbg.location(48,34);
				if ( !(stream_argumento.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_argumento.hasNext() ) {
					dbg.location(48,34);
					adaptor.addChild(root_0, stream_argumento.nextTree());
				}
				stream_argumento.reset();

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(49, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "argumentos");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "argumentos"


	public static class argumento_return extends ParserRuleReturnScope {
		Tree tree;
		@Override
		public Tree getTree() { return tree; }
	};


	// $ANTLR start "argumento"
	// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:51:1: argumento : c1= comentarios idTipo c2= comentarios ID c3= comentarios -> ^( Argumento ^( Comentarios ( $c1)? ) idTipo ^( Comentarios ( $c2)? ) ID ^( Comentarios ( $c3)? ) ) ;
	public final iParser.argumento_return argumento() throws  {
		iParser.argumento_return retval = new iParser.argumento_return();
		retval.start = input.LT(1);

		Tree root_0 = null;

		Token ID33=null;
		ParserRuleReturnScope c1 =null;
		ParserRuleReturnScope c2 =null;
		ParserRuleReturnScope c3 =null;
		ParserRuleReturnScope idTipo32 =null;

		Tree ID33_tree=null;
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleSubtreeStream stream_comentarios=new RewriteRuleSubtreeStream(adaptor,"rule comentarios");
		RewriteRuleSubtreeStream stream_idTipo=new RewriteRuleSubtreeStream(adaptor,"rule idTipo");

		try { dbg.enterRule(getGrammarFileName(), "argumento");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(51, 0);

		try {
			// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:51:11: (c1= comentarios idTipo c2= comentarios ID c3= comentarios -> ^( Argumento ^( Comentarios ( $c1)? ) idTipo ^( Comentarios ( $c2)? ) ID ^( Comentarios ( $c3)? ) ) )
			dbg.enterAlt(1);

			// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:52:2: c1= comentarios idTipo c2= comentarios ID c3= comentarios
			{
			dbg.location(52,4);
			pushFollow(FOLLOW_comentarios_in_argumento574);
			c1=comentarios();
			state._fsp--;

			stream_comentarios.add(c1.getTree());dbg.location(52,17);
			pushFollow(FOLLOW_idTipo_in_argumento576);
			idTipo32=idTipo();
			state._fsp--;

			stream_idTipo.add(idTipo32.getTree());dbg.location(52,26);
			pushFollow(FOLLOW_comentarios_in_argumento580);
			c2=comentarios();
			state._fsp--;

			stream_comentarios.add(c2.getTree());dbg.location(52,39);
			ID33=(Token)match(input,ID,FOLLOW_ID_in_argumento582);  
			stream_ID.add(ID33);
			dbg.location(52,44);
			pushFollow(FOLLOW_comentarios_in_argumento586);
			c3=comentarios();
			state._fsp--;

			stream_comentarios.add(c3.getTree());
			// AST REWRITE
			// elements: idTipo, ID, c2, c1, c3
			// token labels: 
			// rule labels: retval, c1, c2, c3
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_c1=new RewriteRuleSubtreeStream(adaptor,"rule c1",c1!=null?c1.getTree():null);
			RewriteRuleSubtreeStream stream_c2=new RewriteRuleSubtreeStream(adaptor,"rule c2",c2!=null?c2.getTree():null);
			RewriteRuleSubtreeStream stream_c3=new RewriteRuleSubtreeStream(adaptor,"rule c3",c3!=null?c3.getTree():null);

			root_0 = (Tree)adaptor.nil();
			// 52:57: -> ^( Argumento ^( Comentarios ( $c1)? ) idTipo ^( Comentarios ( $c2)? ) ID ^( Comentarios ( $c3)? ) )
			{
				dbg.location(52,60);
				// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:52:60: ^( Argumento ^( Comentarios ( $c1)? ) idTipo ^( Comentarios ( $c2)? ) ID ^( Comentarios ( $c3)? ) )
				{
				Tree root_1 = (Tree)adaptor.nil();
				dbg.location(52,62);
				root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Argumento, "Argumento"), root_1);
				dbg.location(52,72);
				// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:52:72: ^( Comentarios ( $c1)? )
				{
				Tree root_2 = (Tree)adaptor.nil();
				dbg.location(52,74);
				root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);
				dbg.location(52,87);
				// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:52:87: ( $c1)?
				if ( stream_c1.hasNext() ) {
					dbg.location(52,87);
					adaptor.addChild(root_2, stream_c1.nextTree());
				}
				stream_c1.reset();

				adaptor.addChild(root_1, root_2);
				}
				dbg.location(52,92);
				adaptor.addChild(root_1, stream_idTipo.nextTree());dbg.location(52,99);
				// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:52:99: ^( Comentarios ( $c2)? )
				{
				Tree root_2 = (Tree)adaptor.nil();
				dbg.location(52,101);
				root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);
				dbg.location(52,114);
				// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:52:114: ( $c2)?
				if ( stream_c2.hasNext() ) {
					dbg.location(52,114);
					adaptor.addChild(root_2, stream_c2.nextTree());
				}
				stream_c2.reset();

				adaptor.addChild(root_1, root_2);
				}
				dbg.location(52,119);
				adaptor.addChild(root_1, stream_ID.nextNode());dbg.location(52,122);
				// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:52:122: ^( Comentarios ( $c3)? )
				{
				Tree root_2 = (Tree)adaptor.nil();
				dbg.location(52,124);
				root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);
				dbg.location(52,137);
				// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:52:137: ( $c3)?
				if ( stream_c3.hasNext() ) {
					dbg.location(52,137);
					adaptor.addChild(root_2, stream_c3.nextTree());
				}
				stream_c3.reset();

				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(53, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "argumento");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "argumento"


	public static class instrucao_return extends ParserRuleReturnScope {
		Tree tree;
		@Override
		public Tree getTree() { return tree; }
	};


	// $ANTLR start "instrucao"
	// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:57:1: instrucao : ( if_ -> if_ | for_ -> for_ | while_ -> while_ | return_ ';' -> return_ | call ';' -> ^( Exp call ) | print_ ';' -> print_ ) ;
	public final iParser.instrucao_return instrucao() throws  {
		iParser.instrucao_return retval = new iParser.instrucao_return();
		retval.start = input.LT(1);

		Tree root_0 = null;

		Token char_literal38=null;
		Token char_literal40=null;
		Token char_literal42=null;
		ParserRuleReturnScope if_34 =null;
		ParserRuleReturnScope for_35 =null;
		ParserRuleReturnScope while_36 =null;
		ParserRuleReturnScope return_37 =null;
		ParserRuleReturnScope call39 =null;
		ParserRuleReturnScope print_41 =null;

		Tree char_literal38_tree=null;
		Tree char_literal40_tree=null;
		Tree char_literal42_tree=null;
		RewriteRuleTokenStream stream_99=new RewriteRuleTokenStream(adaptor,"token 99");
		RewriteRuleSubtreeStream stream_for_=new RewriteRuleSubtreeStream(adaptor,"rule for_");
		RewriteRuleSubtreeStream stream_return_=new RewriteRuleSubtreeStream(adaptor,"rule return_");
		RewriteRuleSubtreeStream stream_call=new RewriteRuleSubtreeStream(adaptor,"rule call");
		RewriteRuleSubtreeStream stream_while_=new RewriteRuleSubtreeStream(adaptor,"rule while_");
		RewriteRuleSubtreeStream stream_if_=new RewriteRuleSubtreeStream(adaptor,"rule if_");
		RewriteRuleSubtreeStream stream_print_=new RewriteRuleSubtreeStream(adaptor,"rule print_");

		try { dbg.enterRule(getGrammarFileName(), "instrucao");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(57, 0);

		try {
			// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:57:11: ( ( if_ -> if_ | for_ -> for_ | while_ -> while_ | return_ ';' -> return_ | call ';' -> ^( Exp call ) | print_ ';' -> print_ ) )
			dbg.enterAlt(1);

			// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:58:2: ( if_ -> if_ | for_ -> for_ | while_ -> while_ | return_ ';' -> return_ | call ';' -> ^( Exp call ) | print_ ';' -> print_ )
			{
			dbg.location(58,2);
			// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:58:2: ( if_ -> if_ | for_ -> for_ | while_ -> while_ | return_ ';' -> return_ | call ';' -> ^( Exp call ) | print_ ';' -> print_ )
			int alt9=6;
			try { dbg.enterSubRule(9);
			try { dbg.enterDecision(9, decisionCanBacktrack[9]);

			try {
				isCyclicDecision = true;
				alt9 = dfa9.predict(input);
			}
			catch (NoViableAltException nvae) {
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(9);}

			switch (alt9) {
				case 1 :
					dbg.enterAlt(1);

					// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:58:3: if_
					{
					dbg.location(58,3);
					pushFollow(FOLLOW_if__in_instrucao636);
					if_34=if_();
					state._fsp--;

					stream_if_.add(if_34.getTree());
					// AST REWRITE
					// elements: if_
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Tree)adaptor.nil();
					// 58:7: -> if_
					{
						dbg.location(58,10);
						adaptor.addChild(root_0, stream_if_.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:58:16: for_
					{
					dbg.location(58,16);
					pushFollow(FOLLOW_for__in_instrucao644);
					for_35=for_();
					state._fsp--;

					stream_for_.add(for_35.getTree());
					// AST REWRITE
					// elements: for_
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Tree)adaptor.nil();
					// 58:21: -> for_
					{
						dbg.location(58,24);
						adaptor.addChild(root_0, stream_for_.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:58:31: while_
					{
					dbg.location(58,31);
					pushFollow(FOLLOW_while__in_instrucao652);
					while_36=while_();
					state._fsp--;

					stream_while_.add(while_36.getTree());
					// AST REWRITE
					// elements: while_
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Tree)adaptor.nil();
					// 58:38: -> while_
					{
						dbg.location(58,41);
						adaptor.addChild(root_0, stream_while_.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:58:50: return_ ';'
					{
					dbg.location(58,50);
					pushFollow(FOLLOW_return__in_instrucao660);
					return_37=return_();
					state._fsp--;

					stream_return_.add(return_37.getTree());dbg.location(58,58);
					char_literal38=(Token)match(input,99,FOLLOW_99_in_instrucao662);  
					stream_99.add(char_literal38);

					// AST REWRITE
					// elements: return_
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Tree)adaptor.nil();
					// 58:62: -> return_
					{
						dbg.location(58,65);
						adaptor.addChild(root_0, stream_return_.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:58:75: call ';'
					{
					dbg.location(58,75);
					pushFollow(FOLLOW_call_in_instrucao670);
					call39=call();
					state._fsp--;

					stream_call.add(call39.getTree());dbg.location(58,80);
					char_literal40=(Token)match(input,99,FOLLOW_99_in_instrucao672);  
					stream_99.add(char_literal40);

					// AST REWRITE
					// elements: call
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Tree)adaptor.nil();
					// 58:84: -> ^( Exp call )
					{
						dbg.location(58,87);
						// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:58:87: ^( Exp call )
						{
						Tree root_1 = (Tree)adaptor.nil();
						dbg.location(58,89);
						root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Exp, "Exp"), root_1);
						dbg.location(58,93);
						adaptor.addChild(root_1, stream_call.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:58:101: print_ ';'
					{
					dbg.location(58,101);
					pushFollow(FOLLOW_print__in_instrucao684);
					print_41=print_();
					state._fsp--;

					stream_print_.add(print_41.getTree());dbg.location(58,108);
					char_literal42=(Token)match(input,99,FOLLOW_99_in_instrucao686);  
					stream_99.add(char_literal42);

					// AST REWRITE
					// elements: print_
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Tree)adaptor.nil();
					// 58:112: -> print_
					{
						dbg.location(58,115);
						adaptor.addChild(root_0, stream_print_.nextTree());
					}


					retval.tree = root_0;

					}
					break;

			}
			} finally {dbg.exitSubRule(9);}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(59, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "instrucao");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "instrucao"


	public static class if__return extends ParserRuleReturnScope {
		Tree tree;
		@Override
		public Tree getTree() { return tree; }
	};


	// $ANTLR start "if_"
	// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:61:1: if_ : c1= comentarios 'if' c2= comentarios '(' c3= comentarios condicao c4= comentarios ')' c5= comentarios blocoCodigo ( else_ -> ^( If ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) ^( Comentarios ( $c3)? ) condicao ^( Comentarios ( $c4)? ) ^( Comentarios ( $c5)? ) blocoCodigo else_ ) | -> ^( If ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) ^( Comentarios ( $c3)? ) condicao ^( Comentarios ( $c4)? ) ^( Comentarios ( $c5)? ) blocoCodigo ^( SeqInstrucao ) ) ) ;
	public final iParser.if__return if_() throws  {
		iParser.if__return retval = new iParser.if__return();
		retval.start = input.LT(1);

		Tree root_0 = null;

		Token string_literal43=null;
		Token char_literal44=null;
		Token char_literal46=null;
		ParserRuleReturnScope c1 =null;
		ParserRuleReturnScope c2 =null;
		ParserRuleReturnScope c3 =null;
		ParserRuleReturnScope c4 =null;
		ParserRuleReturnScope c5 =null;
		ParserRuleReturnScope condicao45 =null;
		ParserRuleReturnScope blocoCodigo47 =null;
		ParserRuleReturnScope else_48 =null;

		Tree string_literal43_tree=null;
		Tree char_literal44_tree=null;
		Tree char_literal46_tree=null;
		RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
		RewriteRuleTokenStream stream_86=new RewriteRuleTokenStream(adaptor,"token 86");
		RewriteRuleTokenStream stream_85=new RewriteRuleTokenStream(adaptor,"token 85");
		RewriteRuleSubtreeStream stream_blocoCodigo=new RewriteRuleSubtreeStream(adaptor,"rule blocoCodigo");
		RewriteRuleSubtreeStream stream_else_=new RewriteRuleSubtreeStream(adaptor,"rule else_");
		RewriteRuleSubtreeStream stream_comentarios=new RewriteRuleSubtreeStream(adaptor,"rule comentarios");
		RewriteRuleSubtreeStream stream_condicao=new RewriteRuleSubtreeStream(adaptor,"rule condicao");

		try { dbg.enterRule(getGrammarFileName(), "if_");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(61, 0);

		try {
			// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:61:6: (c1= comentarios 'if' c2= comentarios '(' c3= comentarios condicao c4= comentarios ')' c5= comentarios blocoCodigo ( else_ -> ^( If ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) ^( Comentarios ( $c3)? ) condicao ^( Comentarios ( $c4)? ) ^( Comentarios ( $c5)? ) blocoCodigo else_ ) | -> ^( If ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) ^( Comentarios ( $c3)? ) condicao ^( Comentarios ( $c4)? ) ^( Comentarios ( $c5)? ) blocoCodigo ^( SeqInstrucao ) ) ) )
			dbg.enterAlt(1);

			// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:62:2: c1= comentarios 'if' c2= comentarios '(' c3= comentarios condicao c4= comentarios ')' c5= comentarios blocoCodigo ( else_ -> ^( If ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) ^( Comentarios ( $c3)? ) condicao ^( Comentarios ( $c4)? ) ^( Comentarios ( $c5)? ) blocoCodigo else_ ) | -> ^( If ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) ^( Comentarios ( $c3)? ) condicao ^( Comentarios ( $c4)? ) ^( Comentarios ( $c5)? ) blocoCodigo ^( SeqInstrucao ) ) )
			{
			dbg.location(62,4);
			pushFollow(FOLLOW_comentarios_in_if_705);
			c1=comentarios();
			state._fsp--;

			stream_comentarios.add(c1.getTree());dbg.location(62,17);
			string_literal43=(Token)match(input,113,FOLLOW_113_in_if_707);  
			stream_113.add(string_literal43);
			dbg.location(62,24);
			pushFollow(FOLLOW_comentarios_in_if_711);
			c2=comentarios();
			state._fsp--;

			stream_comentarios.add(c2.getTree());dbg.location(62,37);
			char_literal44=(Token)match(input,85,FOLLOW_85_in_if_713);  
			stream_85.add(char_literal44);
			dbg.location(62,43);
			pushFollow(FOLLOW_comentarios_in_if_717);
			c3=comentarios();
			state._fsp--;

			stream_comentarios.add(c3.getTree());dbg.location(62,56);
			pushFollow(FOLLOW_condicao_in_if_719);
			condicao45=condicao();
			state._fsp--;

			stream_condicao.add(condicao45.getTree());dbg.location(62,67);
			pushFollow(FOLLOW_comentarios_in_if_723);
			c4=comentarios();
			state._fsp--;

			stream_comentarios.add(c4.getTree());dbg.location(62,80);
			char_literal46=(Token)match(input,86,FOLLOW_86_in_if_725);  
			stream_86.add(char_literal46);
			dbg.location(62,86);
			pushFollow(FOLLOW_comentarios_in_if_729);
			c5=comentarios();
			state._fsp--;

			stream_comentarios.add(c5.getTree());dbg.location(62,99);
			pushFollow(FOLLOW_blocoCodigo_in_if_731);
			blocoCodigo47=blocoCodigo();
			state._fsp--;

			stream_blocoCodigo.add(blocoCodigo47.getTree());dbg.location(62,111);
			// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:62:111: ( else_ -> ^( If ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) ^( Comentarios ( $c3)? ) condicao ^( Comentarios ( $c4)? ) ^( Comentarios ( $c5)? ) blocoCodigo else_ ) | -> ^( If ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) ^( Comentarios ( $c3)? ) condicao ^( Comentarios ( $c4)? ) ^( Comentarios ( $c5)? ) blocoCodigo ^( SeqInstrucao ) ) )
			int alt10=2;
			try { dbg.enterSubRule(10);
			try { dbg.enterDecision(10, decisionCanBacktrack[10]);

			int LA10_0 = input.LA(1);
			if ( (LA10_0==109) ) {
				alt10=1;
			}
			else if ( (LA10_0==EOF||(LA10_0 >= CHAR && LA10_0 <= COMENTARIO_LINHAS)||(LA10_0 >= FLOAT && LA10_0 <= INT)||(LA10_0 >= 81 && LA10_0 <= 108)||(LA10_0 >= 110 && LA10_0 <= 123)) ) {
				alt10=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(10);}

			switch (alt10) {
				case 1 :
					dbg.enterAlt(1);

					// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:62:113: else_
					{
					dbg.location(62,113);
					pushFollow(FOLLOW_else__in_if_735);
					else_48=else_();
					state._fsp--;

					stream_else_.add(else_48.getTree());
					// AST REWRITE
					// elements: c5, condicao, c3, c1, blocoCodigo, c4, else_, c2
					// token labels: 
					// rule labels: retval, c1, c2, c5, c4, c3
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_c1=new RewriteRuleSubtreeStream(adaptor,"rule c1",c1!=null?c1.getTree():null);
					RewriteRuleSubtreeStream stream_c2=new RewriteRuleSubtreeStream(adaptor,"rule c2",c2!=null?c2.getTree():null);
					RewriteRuleSubtreeStream stream_c5=new RewriteRuleSubtreeStream(adaptor,"rule c5",c5!=null?c5.getTree():null);
					RewriteRuleSubtreeStream stream_c4=new RewriteRuleSubtreeStream(adaptor,"rule c4",c4!=null?c4.getTree():null);
					RewriteRuleSubtreeStream stream_c3=new RewriteRuleSubtreeStream(adaptor,"rule c3",c3!=null?c3.getTree():null);

					root_0 = (Tree)adaptor.nil();
					// 62:119: -> ^( If ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) ^( Comentarios ( $c3)? ) condicao ^( Comentarios ( $c4)? ) ^( Comentarios ( $c5)? ) blocoCodigo else_ )
					{
						dbg.location(62,122);
						// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:62:122: ^( If ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) ^( Comentarios ( $c3)? ) condicao ^( Comentarios ( $c4)? ) ^( Comentarios ( $c5)? ) blocoCodigo else_ )
						{
						Tree root_1 = (Tree)adaptor.nil();
						dbg.location(62,124);
						root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(If, "If"), root_1);
						dbg.location(62,127);
						// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:62:127: ^( Comentarios ( $c1)? )
						{
						Tree root_2 = (Tree)adaptor.nil();
						dbg.location(62,129);
						root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);
						dbg.location(62,142);
						// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:62:142: ( $c1)?
						if ( stream_c1.hasNext() ) {
							dbg.location(62,142);
							adaptor.addChild(root_2, stream_c1.nextTree());
						}
						stream_c1.reset();

						adaptor.addChild(root_1, root_2);
						}
						dbg.location(62,147);
						// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:62:147: ^( Comentarios ( $c2)? )
						{
						Tree root_2 = (Tree)adaptor.nil();
						dbg.location(62,149);
						root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);
						dbg.location(62,162);
						// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:62:162: ( $c2)?
						if ( stream_c2.hasNext() ) {
							dbg.location(62,162);
							adaptor.addChild(root_2, stream_c2.nextTree());
						}
						stream_c2.reset();

						adaptor.addChild(root_1, root_2);
						}
						dbg.location(62,167);
						// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:62:167: ^( Comentarios ( $c3)? )
						{
						Tree root_2 = (Tree)adaptor.nil();
						dbg.location(62,169);
						root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);
						dbg.location(62,182);
						// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:62:182: ( $c3)?
						if ( stream_c3.hasNext() ) {
							dbg.location(62,182);
							adaptor.addChild(root_2, stream_c3.nextTree());
						}
						stream_c3.reset();

						adaptor.addChild(root_1, root_2);
						}
						dbg.location(62,187);
						adaptor.addChild(root_1, stream_condicao.nextTree());dbg.location(62,196);
						// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:62:196: ^( Comentarios ( $c4)? )
						{
						Tree root_2 = (Tree)adaptor.nil();
						dbg.location(62,198);
						root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);
						dbg.location(62,211);
						// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:62:211: ( $c4)?
						if ( stream_c4.hasNext() ) {
							dbg.location(62,211);
							adaptor.addChild(root_2, stream_c4.nextTree());
						}
						stream_c4.reset();

						adaptor.addChild(root_1, root_2);
						}
						dbg.location(62,216);
						// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:62:216: ^( Comentarios ( $c5)? )
						{
						Tree root_2 = (Tree)adaptor.nil();
						dbg.location(62,218);
						root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);
						dbg.location(62,231);
						// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:62:231: ( $c5)?
						if ( stream_c5.hasNext() ) {
							dbg.location(62,231);
							adaptor.addChild(root_2, stream_c5.nextTree());
						}
						stream_c5.reset();

						adaptor.addChild(root_1, root_2);
						}
						dbg.location(62,236);
						adaptor.addChild(root_1, stream_blocoCodigo.nextTree());dbg.location(62,248);
						adaptor.addChild(root_1, stream_else_.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:63:25: 
					{
					// AST REWRITE
					// elements: c5, c1, c2, condicao, c4, c3, blocoCodigo
					// token labels: 
					// rule labels: retval, c1, c2, c5, c4, c3
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_c1=new RewriteRuleSubtreeStream(adaptor,"rule c1",c1!=null?c1.getTree():null);
					RewriteRuleSubtreeStream stream_c2=new RewriteRuleSubtreeStream(adaptor,"rule c2",c2!=null?c2.getTree():null);
					RewriteRuleSubtreeStream stream_c5=new RewriteRuleSubtreeStream(adaptor,"rule c5",c5!=null?c5.getTree():null);
					RewriteRuleSubtreeStream stream_c4=new RewriteRuleSubtreeStream(adaptor,"rule c4",c4!=null?c4.getTree():null);
					RewriteRuleSubtreeStream stream_c3=new RewriteRuleSubtreeStream(adaptor,"rule c3",c3!=null?c3.getTree():null);

					root_0 = (Tree)adaptor.nil();
					// 63:25: -> ^( If ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) ^( Comentarios ( $c3)? ) condicao ^( Comentarios ( $c4)? ) ^( Comentarios ( $c5)? ) blocoCodigo ^( SeqInstrucao ) )
					{
						dbg.location(63,28);
						// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:63:28: ^( If ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) ^( Comentarios ( $c3)? ) condicao ^( Comentarios ( $c4)? ) ^( Comentarios ( $c5)? ) blocoCodigo ^( SeqInstrucao ) )
						{
						Tree root_1 = (Tree)adaptor.nil();
						dbg.location(63,30);
						root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(If, "If"), root_1);
						dbg.location(63,33);
						// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:63:33: ^( Comentarios ( $c1)? )
						{
						Tree root_2 = (Tree)adaptor.nil();
						dbg.location(63,35);
						root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);
						dbg.location(63,48);
						// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:63:48: ( $c1)?
						if ( stream_c1.hasNext() ) {
							dbg.location(63,48);
							adaptor.addChild(root_2, stream_c1.nextTree());
						}
						stream_c1.reset();

						adaptor.addChild(root_1, root_2);
						}
						dbg.location(63,53);
						// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:63:53: ^( Comentarios ( $c2)? )
						{
						Tree root_2 = (Tree)adaptor.nil();
						dbg.location(63,55);
						root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);
						dbg.location(63,68);
						// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:63:68: ( $c2)?
						if ( stream_c2.hasNext() ) {
							dbg.location(63,68);
							adaptor.addChild(root_2, stream_c2.nextTree());
						}
						stream_c2.reset();

						adaptor.addChild(root_1, root_2);
						}
						dbg.location(63,73);
						// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:63:73: ^( Comentarios ( $c3)? )
						{
						Tree root_2 = (Tree)adaptor.nil();
						dbg.location(63,75);
						root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);
						dbg.location(63,88);
						// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:63:88: ( $c3)?
						if ( stream_c3.hasNext() ) {
							dbg.location(63,88);
							adaptor.addChild(root_2, stream_c3.nextTree());
						}
						stream_c3.reset();

						adaptor.addChild(root_1, root_2);
						}
						dbg.location(63,93);
						adaptor.addChild(root_1, stream_condicao.nextTree());dbg.location(63,102);
						// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:63:102: ^( Comentarios ( $c4)? )
						{
						Tree root_2 = (Tree)adaptor.nil();
						dbg.location(63,104);
						root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);
						dbg.location(63,117);
						// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:63:117: ( $c4)?
						if ( stream_c4.hasNext() ) {
							dbg.location(63,117);
							adaptor.addChild(root_2, stream_c4.nextTree());
						}
						stream_c4.reset();

						adaptor.addChild(root_1, root_2);
						}
						dbg.location(63,122);
						// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:63:122: ^( Comentarios ( $c5)? )
						{
						Tree root_2 = (Tree)adaptor.nil();
						dbg.location(63,124);
						root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);
						dbg.location(63,137);
						// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:63:137: ( $c5)?
						if ( stream_c5.hasNext() ) {
							dbg.location(63,137);
							adaptor.addChild(root_2, stream_c5.nextTree());
						}
						stream_c5.reset();

						adaptor.addChild(root_1, root_2);
						}
						dbg.location(63,142);
						adaptor.addChild(root_1, stream_blocoCodigo.nextTree());dbg.location(63,154);
						// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:63:154: ^( SeqInstrucao )
						{
						Tree root_2 = (Tree)adaptor.nil();
						dbg.location(63,156);
						root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(SeqInstrucao, "SeqInstrucao"), root_2);
						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			} finally {dbg.exitSubRule(10);}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(65, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "if_");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "if_"


	public static class else__return extends ParserRuleReturnScope {
		Tree tree;
		@Override
		public Tree getTree() { return tree; }
	};


	// $ANTLR start "else_"
	// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:67:1: else_ : 'else' ( blocoCodigo -> blocoCodigo | if_ -> if_ ) ;
	public final iParser.else__return else_() throws  {
		iParser.else__return retval = new iParser.else__return();
		retval.start = input.LT(1);

		Tree root_0 = null;

		Token string_literal49=null;
		ParserRuleReturnScope blocoCodigo50 =null;
		ParserRuleReturnScope if_51 =null;

		Tree string_literal49_tree=null;
		RewriteRuleTokenStream stream_109=new RewriteRuleTokenStream(adaptor,"token 109");
		RewriteRuleSubtreeStream stream_blocoCodigo=new RewriteRuleSubtreeStream(adaptor,"rule blocoCodigo");
		RewriteRuleSubtreeStream stream_if_=new RewriteRuleSubtreeStream(adaptor,"rule if_");

		try { dbg.enterRule(getGrammarFileName(), "else_");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(67, 0);

		try {
			// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:67:7: ( 'else' ( blocoCodigo -> blocoCodigo | if_ -> if_ ) )
			dbg.enterAlt(1);

			// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:68:2: 'else' ( blocoCodigo -> blocoCodigo | if_ -> if_ )
			{
			dbg.location(68,2);
			string_literal49=(Token)match(input,109,FOLLOW_109_in_else_901);  
			stream_109.add(string_literal49);
			dbg.location(68,9);
			// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:68:9: ( blocoCodigo -> blocoCodigo | if_ -> if_ )
			int alt11=2;
			try { dbg.enterSubRule(11);
			try { dbg.enterDecision(11, decisionCanBacktrack[11]);

			int LA11_0 = input.LA(1);
			if ( (LA11_0==121) ) {
				alt11=1;
			}
			else if ( ((LA11_0 >= COMENTARIO_LINHA && LA11_0 <= COMENTARIO_LINHAS)||LA11_0==113) ) {
				alt11=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(11);}

			switch (alt11) {
				case 1 :
					dbg.enterAlt(1);

					// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:68:11: blocoCodigo
					{
					dbg.location(68,11);
					pushFollow(FOLLOW_blocoCodigo_in_else_905);
					blocoCodigo50=blocoCodigo();
					state._fsp--;

					stream_blocoCodigo.add(blocoCodigo50.getTree());
					// AST REWRITE
					// elements: blocoCodigo
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Tree)adaptor.nil();
					// 68:23: -> blocoCodigo
					{
						dbg.location(68,26);
						adaptor.addChild(root_0, stream_blocoCodigo.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:68:40: if_
					{
					dbg.location(68,40);
					pushFollow(FOLLOW_if__in_else_913);
					if_51=if_();
					state._fsp--;

					stream_if_.add(if_51.getTree());
					// AST REWRITE
					// elements: if_
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Tree)adaptor.nil();
					// 68:44: -> if_
					{
						dbg.location(68,47);
						adaptor.addChild(root_0, stream_if_.nextTree());
					}


					retval.tree = root_0;

					}
					break;

			}
			} finally {dbg.exitSubRule(11);}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(69, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "else_");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "else_"


	public static class for__return extends ParserRuleReturnScope {
		Tree tree;
		@Override
		public Tree getTree() { return tree; }
	};


	// $ANTLR start "for_"
	// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:71:1: for_ : c1= comentarios 'for' c2= comentarios '(' for_declaracao ';' c3= comentarios condicao c4= comentarios ';' c5= comentarios expressao c6= comentarios ')' c7= comentarios blocoCodigo c8= comentarios -> ^( For ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) for_declaracao ^( Comentarios ( $c3)? ) condicao ^( Comentarios ( $c4)? ) ^( Comentarios ( $c5)? ) expressao ^( Comentarios ( $c6)? ) ^( Comentarios ( $c7)? ) blocoCodigo ^( Comentarios ( $c8)? ) ) ;
	public final iParser.for__return for_() throws  {
		iParser.for__return retval = new iParser.for__return();
		retval.start = input.LT(1);

		Tree root_0 = null;

		Token string_literal52=null;
		Token char_literal53=null;
		Token char_literal55=null;
		Token char_literal57=null;
		Token char_literal59=null;
		ParserRuleReturnScope c1 =null;
		ParserRuleReturnScope c2 =null;
		ParserRuleReturnScope c3 =null;
		ParserRuleReturnScope c4 =null;
		ParserRuleReturnScope c5 =null;
		ParserRuleReturnScope c6 =null;
		ParserRuleReturnScope c7 =null;
		ParserRuleReturnScope c8 =null;
		ParserRuleReturnScope for_declaracao54 =null;
		ParserRuleReturnScope condicao56 =null;
		ParserRuleReturnScope expressao58 =null;
		ParserRuleReturnScope blocoCodigo60 =null;

		Tree string_literal52_tree=null;
		Tree char_literal53_tree=null;
		Tree char_literal55_tree=null;
		Tree char_literal57_tree=null;
		Tree char_literal59_tree=null;
		RewriteRuleTokenStream stream_112=new RewriteRuleTokenStream(adaptor,"token 112");
		RewriteRuleTokenStream stream_86=new RewriteRuleTokenStream(adaptor,"token 86");
		RewriteRuleTokenStream stream_99=new RewriteRuleTokenStream(adaptor,"token 99");
		RewriteRuleTokenStream stream_85=new RewriteRuleTokenStream(adaptor,"token 85");
		RewriteRuleSubtreeStream stream_blocoCodigo=new RewriteRuleSubtreeStream(adaptor,"rule blocoCodigo");
		RewriteRuleSubtreeStream stream_comentarios=new RewriteRuleSubtreeStream(adaptor,"rule comentarios");
		RewriteRuleSubtreeStream stream_condicao=new RewriteRuleSubtreeStream(adaptor,"rule condicao");
		RewriteRuleSubtreeStream stream_for_declaracao=new RewriteRuleSubtreeStream(adaptor,"rule for_declaracao");
		RewriteRuleSubtreeStream stream_expressao=new RewriteRuleSubtreeStream(adaptor,"rule expressao");

		try { dbg.enterRule(getGrammarFileName(), "for_");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(71, 0);

		try {
			// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:71:6: (c1= comentarios 'for' c2= comentarios '(' for_declaracao ';' c3= comentarios condicao c4= comentarios ';' c5= comentarios expressao c6= comentarios ')' c7= comentarios blocoCodigo c8= comentarios -> ^( For ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) for_declaracao ^( Comentarios ( $c3)? ) condicao ^( Comentarios ( $c4)? ) ^( Comentarios ( $c5)? ) expressao ^( Comentarios ( $c6)? ) ^( Comentarios ( $c7)? ) blocoCodigo ^( Comentarios ( $c8)? ) ) )
			dbg.enterAlt(1);

			// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:72:2: c1= comentarios 'for' c2= comentarios '(' for_declaracao ';' c3= comentarios condicao c4= comentarios ';' c5= comentarios expressao c6= comentarios ')' c7= comentarios blocoCodigo c8= comentarios
			{
			dbg.location(72,4);
			pushFollow(FOLLOW_comentarios_in_for_933);
			c1=comentarios();
			state._fsp--;

			stream_comentarios.add(c1.getTree());dbg.location(72,17);
			string_literal52=(Token)match(input,112,FOLLOW_112_in_for_935);  
			stream_112.add(string_literal52);
			dbg.location(72,25);
			pushFollow(FOLLOW_comentarios_in_for_939);
			c2=comentarios();
			state._fsp--;

			stream_comentarios.add(c2.getTree());dbg.location(72,38);
			char_literal53=(Token)match(input,85,FOLLOW_85_in_for_941);  
			stream_85.add(char_literal53);
			dbg.location(72,42);
			pushFollow(FOLLOW_for_declaracao_in_for_943);
			for_declaracao54=for_declaracao();
			state._fsp--;

			stream_for_declaracao.add(for_declaracao54.getTree());dbg.location(72,57);
			char_literal55=(Token)match(input,99,FOLLOW_99_in_for_945);  
			stream_99.add(char_literal55);
			dbg.location(72,63);
			pushFollow(FOLLOW_comentarios_in_for_949);
			c3=comentarios();
			state._fsp--;

			stream_comentarios.add(c3.getTree());dbg.location(72,76);
			pushFollow(FOLLOW_condicao_in_for_951);
			condicao56=condicao();
			state._fsp--;

			stream_condicao.add(condicao56.getTree());dbg.location(72,87);
			pushFollow(FOLLOW_comentarios_in_for_955);
			c4=comentarios();
			state._fsp--;

			stream_comentarios.add(c4.getTree());dbg.location(72,100);
			char_literal57=(Token)match(input,99,FOLLOW_99_in_for_957);  
			stream_99.add(char_literal57);
			dbg.location(72,106);
			pushFollow(FOLLOW_comentarios_in_for_961);
			c5=comentarios();
			state._fsp--;

			stream_comentarios.add(c5.getTree());dbg.location(72,119);
			pushFollow(FOLLOW_expressao_in_for_963);
			expressao58=expressao();
			state._fsp--;

			stream_expressao.add(expressao58.getTree());dbg.location(72,131);
			pushFollow(FOLLOW_comentarios_in_for_967);
			c6=comentarios();
			state._fsp--;

			stream_comentarios.add(c6.getTree());dbg.location(72,144);
			char_literal59=(Token)match(input,86,FOLLOW_86_in_for_969);  
			stream_86.add(char_literal59);
			dbg.location(72,150);
			pushFollow(FOLLOW_comentarios_in_for_973);
			c7=comentarios();
			state._fsp--;

			stream_comentarios.add(c7.getTree());dbg.location(72,163);
			pushFollow(FOLLOW_blocoCodigo_in_for_975);
			blocoCodigo60=blocoCodigo();
			state._fsp--;

			stream_blocoCodigo.add(blocoCodigo60.getTree());dbg.location(72,177);
			pushFollow(FOLLOW_comentarios_in_for_979);
			c8=comentarios();
			state._fsp--;

			stream_comentarios.add(c8.getTree());
			// AST REWRITE
			// elements: condicao, expressao, c2, c1, c7, c6, c8, blocoCodigo, c5, for_declaracao, c3, c4
			// token labels: 
			// rule labels: retval, c1, c2, c6, c5, c4, c3, c8, c7
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_c1=new RewriteRuleSubtreeStream(adaptor,"rule c1",c1!=null?c1.getTree():null);
			RewriteRuleSubtreeStream stream_c2=new RewriteRuleSubtreeStream(adaptor,"rule c2",c2!=null?c2.getTree():null);
			RewriteRuleSubtreeStream stream_c6=new RewriteRuleSubtreeStream(adaptor,"rule c6",c6!=null?c6.getTree():null);
			RewriteRuleSubtreeStream stream_c5=new RewriteRuleSubtreeStream(adaptor,"rule c5",c5!=null?c5.getTree():null);
			RewriteRuleSubtreeStream stream_c4=new RewriteRuleSubtreeStream(adaptor,"rule c4",c4!=null?c4.getTree():null);
			RewriteRuleSubtreeStream stream_c3=new RewriteRuleSubtreeStream(adaptor,"rule c3",c3!=null?c3.getTree():null);
			RewriteRuleSubtreeStream stream_c8=new RewriteRuleSubtreeStream(adaptor,"rule c8",c8!=null?c8.getTree():null);
			RewriteRuleSubtreeStream stream_c7=new RewriteRuleSubtreeStream(adaptor,"rule c7",c7!=null?c7.getTree():null);

			root_0 = (Tree)adaptor.nil();
			// 72:190: -> ^( For ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) for_declaracao ^( Comentarios ( $c3)? ) condicao ^( Comentarios ( $c4)? ) ^( Comentarios ( $c5)? ) expressao ^( Comentarios ( $c6)? ) ^( Comentarios ( $c7)? ) blocoCodigo ^( Comentarios ( $c8)? ) )
			{
				dbg.location(72,193);
				// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:72:193: ^( For ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) for_declaracao ^( Comentarios ( $c3)? ) condicao ^( Comentarios ( $c4)? ) ^( Comentarios ( $c5)? ) expressao ^( Comentarios ( $c6)? ) ^( Comentarios ( $c7)? ) blocoCodigo ^( Comentarios ( $c8)? ) )
				{
				Tree root_1 = (Tree)adaptor.nil();
				dbg.location(72,195);
				root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(For, "For"), root_1);
				dbg.location(72,199);
				// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:72:199: ^( Comentarios ( $c1)? )
				{
				Tree root_2 = (Tree)adaptor.nil();
				dbg.location(72,201);
				root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);
				dbg.location(72,214);
				// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:72:214: ( $c1)?
				if ( stream_c1.hasNext() ) {
					dbg.location(72,214);
					adaptor.addChild(root_2, stream_c1.nextTree());
				}
				stream_c1.reset();

				adaptor.addChild(root_1, root_2);
				}
				dbg.location(72,219);
				// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:72:219: ^( Comentarios ( $c2)? )
				{
				Tree root_2 = (Tree)adaptor.nil();
				dbg.location(72,221);
				root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);
				dbg.location(72,234);
				// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:72:234: ( $c2)?
				if ( stream_c2.hasNext() ) {
					dbg.location(72,234);
					adaptor.addChild(root_2, stream_c2.nextTree());
				}
				stream_c2.reset();

				adaptor.addChild(root_1, root_2);
				}
				dbg.location(72,239);
				adaptor.addChild(root_1, stream_for_declaracao.nextTree());dbg.location(72,254);
				// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:72:254: ^( Comentarios ( $c3)? )
				{
				Tree root_2 = (Tree)adaptor.nil();
				dbg.location(72,256);
				root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);
				dbg.location(72,269);
				// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:72:269: ( $c3)?
				if ( stream_c3.hasNext() ) {
					dbg.location(72,269);
					adaptor.addChild(root_2, stream_c3.nextTree());
				}
				stream_c3.reset();

				adaptor.addChild(root_1, root_2);
				}
				dbg.location(72,274);
				adaptor.addChild(root_1, stream_condicao.nextTree());dbg.location(72,283);
				// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:72:283: ^( Comentarios ( $c4)? )
				{
				Tree root_2 = (Tree)adaptor.nil();
				dbg.location(72,285);
				root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);
				dbg.location(72,298);
				// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:72:298: ( $c4)?
				if ( stream_c4.hasNext() ) {
					dbg.location(72,298);
					adaptor.addChild(root_2, stream_c4.nextTree());
				}
				stream_c4.reset();

				adaptor.addChild(root_1, root_2);
				}
				dbg.location(72,303);
				// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:72:303: ^( Comentarios ( $c5)? )
				{
				Tree root_2 = (Tree)adaptor.nil();
				dbg.location(72,305);
				root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);
				dbg.location(72,318);
				// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:72:318: ( $c5)?
				if ( stream_c5.hasNext() ) {
					dbg.location(72,318);
					adaptor.addChild(root_2, stream_c5.nextTree());
				}
				stream_c5.reset();

				adaptor.addChild(root_1, root_2);
				}
				dbg.location(72,323);
				adaptor.addChild(root_1, stream_expressao.nextTree());dbg.location(72,333);
				// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:72:333: ^( Comentarios ( $c6)? )
				{
				Tree root_2 = (Tree)adaptor.nil();
				dbg.location(72,335);
				root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);
				dbg.location(72,348);
				// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:72:348: ( $c6)?
				if ( stream_c6.hasNext() ) {
					dbg.location(72,348);
					adaptor.addChild(root_2, stream_c6.nextTree());
				}
				stream_c6.reset();

				adaptor.addChild(root_1, root_2);
				}
				dbg.location(72,353);
				// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:72:353: ^( Comentarios ( $c7)? )
				{
				Tree root_2 = (Tree)adaptor.nil();
				dbg.location(72,355);
				root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);
				dbg.location(72,368);
				// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:72:368: ( $c7)?
				if ( stream_c7.hasNext() ) {
					dbg.location(72,368);
					adaptor.addChild(root_2, stream_c7.nextTree());
				}
				stream_c7.reset();

				adaptor.addChild(root_1, root_2);
				}
				dbg.location(72,373);
				adaptor.addChild(root_1, stream_blocoCodigo.nextTree());dbg.location(72,385);
				// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:72:385: ^( Comentarios ( $c8)? )
				{
				Tree root_2 = (Tree)adaptor.nil();
				dbg.location(72,387);
				root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);
				dbg.location(72,400);
				// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:72:400: ( $c8)?
				if ( stream_c8.hasNext() ) {
					dbg.location(72,400);
					adaptor.addChild(root_2, stream_c8.nextTree());
				}
				stream_c8.reset();

				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(73, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "for_");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "for_"


	public static class for_declaracao_return extends ParserRuleReturnScope {
		Tree tree;
		@Override
		public Tree getTree() { return tree; }
	};


	// $ANTLR start "for_declaracao"
	// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:75:1: for_declaracao : ( declaracao -> declaracao | atribuicao -> atribuicao ) ;
	public final iParser.for_declaracao_return for_declaracao() throws  {
		iParser.for_declaracao_return retval = new iParser.for_declaracao_return();
		retval.start = input.LT(1);

		Tree root_0 = null;

		ParserRuleReturnScope declaracao61 =null;
		ParserRuleReturnScope atribuicao62 =null;

		RewriteRuleSubtreeStream stream_atribuicao=new RewriteRuleSubtreeStream(adaptor,"rule atribuicao");
		RewriteRuleSubtreeStream stream_declaracao=new RewriteRuleSubtreeStream(adaptor,"rule declaracao");

		try { dbg.enterRule(getGrammarFileName(), "for_declaracao");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(75, 0);

		try {
			// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:75:16: ( ( declaracao -> declaracao | atribuicao -> atribuicao ) )
			dbg.enterAlt(1);

			// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:76:2: ( declaracao -> declaracao | atribuicao -> atribuicao )
			{
			dbg.location(76,2);
			// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:76:2: ( declaracao -> declaracao | atribuicao -> atribuicao )
			int alt12=2;
			try { dbg.enterSubRule(12);
			try { dbg.enterDecision(12, decisionCanBacktrack[12]);

			try {
				isCyclicDecision = true;
				alt12 = dfa12.predict(input);
			}
			catch (NoViableAltException nvae) {
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(12);}

			switch (alt12) {
				case 1 :
					dbg.enterAlt(1);

					// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:76:4: declaracao
					{
					dbg.location(76,4);
					pushFollow(FOLLOW_declaracao_in_for_declaracao1071);
					declaracao61=declaracao();
					state._fsp--;

					stream_declaracao.add(declaracao61.getTree());
					// AST REWRITE
					// elements: declaracao
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Tree)adaptor.nil();
					// 76:15: -> declaracao
					{
						dbg.location(76,18);
						adaptor.addChild(root_0, stream_declaracao.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:77:4: atribuicao
					{
					dbg.location(77,4);
					pushFollow(FOLLOW_atribuicao_in_for_declaracao1080);
					atribuicao62=atribuicao();
					state._fsp--;

					stream_atribuicao.add(atribuicao62.getTree());
					// AST REWRITE
					// elements: atribuicao
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Tree)adaptor.nil();
					// 77:15: -> atribuicao
					{
						dbg.location(77,18);
						adaptor.addChild(root_0, stream_atribuicao.nextTree());
					}


					retval.tree = root_0;

					}
					break;

			}
			} finally {dbg.exitSubRule(12);}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(79, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "for_declaracao");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "for_declaracao"


	public static class while__return extends ParserRuleReturnScope {
		Tree tree;
		@Override
		public Tree getTree() { return tree; }
	};


	// $ANTLR start "while_"
	// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:81:1: while_ : c1= comentarios 'while' c2= comentarios '(' c3= comentarios condicao c4= comentarios ')' c5= comentarios blocoCodigo c6= comentarios -> ^( While ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) ^( Comentarios ( $c3)? ) condicao ^( Comentarios ( $c4)? ) ^( Comentarios ( $c5)? ) blocoCodigo ^( Comentarios ( $c6)? ) ) ;
	public final iParser.while__return while_() throws  {
		iParser.while__return retval = new iParser.while__return();
		retval.start = input.LT(1);

		Tree root_0 = null;

		Token string_literal63=null;
		Token char_literal64=null;
		Token char_literal66=null;
		ParserRuleReturnScope c1 =null;
		ParserRuleReturnScope c2 =null;
		ParserRuleReturnScope c3 =null;
		ParserRuleReturnScope c4 =null;
		ParserRuleReturnScope c5 =null;
		ParserRuleReturnScope c6 =null;
		ParserRuleReturnScope condicao65 =null;
		ParserRuleReturnScope blocoCodigo67 =null;

		Tree string_literal63_tree=null;
		Tree char_literal64_tree=null;
		Tree char_literal66_tree=null;
		RewriteRuleTokenStream stream_120=new RewriteRuleTokenStream(adaptor,"token 120");
		RewriteRuleTokenStream stream_86=new RewriteRuleTokenStream(adaptor,"token 86");
		RewriteRuleTokenStream stream_85=new RewriteRuleTokenStream(adaptor,"token 85");
		RewriteRuleSubtreeStream stream_blocoCodigo=new RewriteRuleSubtreeStream(adaptor,"rule blocoCodigo");
		RewriteRuleSubtreeStream stream_comentarios=new RewriteRuleSubtreeStream(adaptor,"rule comentarios");
		RewriteRuleSubtreeStream stream_condicao=new RewriteRuleSubtreeStream(adaptor,"rule condicao");

		try { dbg.enterRule(getGrammarFileName(), "while_");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(81, 0);

		try {
			// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:81:8: (c1= comentarios 'while' c2= comentarios '(' c3= comentarios condicao c4= comentarios ')' c5= comentarios blocoCodigo c6= comentarios -> ^( While ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) ^( Comentarios ( $c3)? ) condicao ^( Comentarios ( $c4)? ) ^( Comentarios ( $c5)? ) blocoCodigo ^( Comentarios ( $c6)? ) ) )
			dbg.enterAlt(1);

			// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:82:2: c1= comentarios 'while' c2= comentarios '(' c3= comentarios condicao c4= comentarios ')' c5= comentarios blocoCodigo c6= comentarios
			{
			dbg.location(82,4);
			pushFollow(FOLLOW_comentarios_in_while_1103);
			c1=comentarios();
			state._fsp--;

			stream_comentarios.add(c1.getTree());dbg.location(82,17);
			string_literal63=(Token)match(input,120,FOLLOW_120_in_while_1105);  
			stream_120.add(string_literal63);
			dbg.location(82,27);
			pushFollow(FOLLOW_comentarios_in_while_1109);
			c2=comentarios();
			state._fsp--;

			stream_comentarios.add(c2.getTree());dbg.location(82,40);
			char_literal64=(Token)match(input,85,FOLLOW_85_in_while_1111);  
			stream_85.add(char_literal64);
			dbg.location(82,46);
			pushFollow(FOLLOW_comentarios_in_while_1115);
			c3=comentarios();
			state._fsp--;

			stream_comentarios.add(c3.getTree());dbg.location(82,59);
			pushFollow(FOLLOW_condicao_in_while_1117);
			condicao65=condicao();
			state._fsp--;

			stream_condicao.add(condicao65.getTree());dbg.location(82,70);
			pushFollow(FOLLOW_comentarios_in_while_1121);
			c4=comentarios();
			state._fsp--;

			stream_comentarios.add(c4.getTree());dbg.location(82,83);
			char_literal66=(Token)match(input,86,FOLLOW_86_in_while_1123);  
			stream_86.add(char_literal66);
			dbg.location(82,89);
			pushFollow(FOLLOW_comentarios_in_while_1127);
			c5=comentarios();
			state._fsp--;

			stream_comentarios.add(c5.getTree());dbg.location(82,102);
			pushFollow(FOLLOW_blocoCodigo_in_while_1129);
			blocoCodigo67=blocoCodigo();
			state._fsp--;

			stream_blocoCodigo.add(blocoCodigo67.getTree());dbg.location(82,116);
			pushFollow(FOLLOW_comentarios_in_while_1133);
			c6=comentarios();
			state._fsp--;

			stream_comentarios.add(c6.getTree());
			// AST REWRITE
			// elements: c1, condicao, blocoCodigo, c3, c4, c6, c2, c5
			// token labels: 
			// rule labels: retval, c1, c2, c6, c5, c4, c3
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_c1=new RewriteRuleSubtreeStream(adaptor,"rule c1",c1!=null?c1.getTree():null);
			RewriteRuleSubtreeStream stream_c2=new RewriteRuleSubtreeStream(adaptor,"rule c2",c2!=null?c2.getTree():null);
			RewriteRuleSubtreeStream stream_c6=new RewriteRuleSubtreeStream(adaptor,"rule c6",c6!=null?c6.getTree():null);
			RewriteRuleSubtreeStream stream_c5=new RewriteRuleSubtreeStream(adaptor,"rule c5",c5!=null?c5.getTree():null);
			RewriteRuleSubtreeStream stream_c4=new RewriteRuleSubtreeStream(adaptor,"rule c4",c4!=null?c4.getTree():null);
			RewriteRuleSubtreeStream stream_c3=new RewriteRuleSubtreeStream(adaptor,"rule c3",c3!=null?c3.getTree():null);

			root_0 = (Tree)adaptor.nil();
			// 82:129: -> ^( While ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) ^( Comentarios ( $c3)? ) condicao ^( Comentarios ( $c4)? ) ^( Comentarios ( $c5)? ) blocoCodigo ^( Comentarios ( $c6)? ) )
			{
				dbg.location(82,132);
				// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:82:132: ^( While ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) ^( Comentarios ( $c3)? ) condicao ^( Comentarios ( $c4)? ) ^( Comentarios ( $c5)? ) blocoCodigo ^( Comentarios ( $c6)? ) )
				{
				Tree root_1 = (Tree)adaptor.nil();
				dbg.location(82,134);
				root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(While, "While"), root_1);
				dbg.location(82,140);
				// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:82:140: ^( Comentarios ( $c1)? )
				{
				Tree root_2 = (Tree)adaptor.nil();
				dbg.location(82,142);
				root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);
				dbg.location(82,155);
				// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:82:155: ( $c1)?
				if ( stream_c1.hasNext() ) {
					dbg.location(82,155);
					adaptor.addChild(root_2, stream_c1.nextTree());
				}
				stream_c1.reset();

				adaptor.addChild(root_1, root_2);
				}
				dbg.location(82,160);
				// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:82:160: ^( Comentarios ( $c2)? )
				{
				Tree root_2 = (Tree)adaptor.nil();
				dbg.location(82,162);
				root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);
				dbg.location(82,175);
				// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:82:175: ( $c2)?
				if ( stream_c2.hasNext() ) {
					dbg.location(82,175);
					adaptor.addChild(root_2, stream_c2.nextTree());
				}
				stream_c2.reset();

				adaptor.addChild(root_1, root_2);
				}
				dbg.location(82,180);
				// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:82:180: ^( Comentarios ( $c3)? )
				{
				Tree root_2 = (Tree)adaptor.nil();
				dbg.location(82,182);
				root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);
				dbg.location(82,195);
				// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:82:195: ( $c3)?
				if ( stream_c3.hasNext() ) {
					dbg.location(82,195);
					adaptor.addChild(root_2, stream_c3.nextTree());
				}
				stream_c3.reset();

				adaptor.addChild(root_1, root_2);
				}
				dbg.location(82,200);
				adaptor.addChild(root_1, stream_condicao.nextTree());dbg.location(82,209);
				// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:82:209: ^( Comentarios ( $c4)? )
				{
				Tree root_2 = (Tree)adaptor.nil();
				dbg.location(82,211);
				root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);
				dbg.location(82,224);
				// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:82:224: ( $c4)?
				if ( stream_c4.hasNext() ) {
					dbg.location(82,224);
					adaptor.addChild(root_2, stream_c4.nextTree());
				}
				stream_c4.reset();

				adaptor.addChild(root_1, root_2);
				}
				dbg.location(82,229);
				// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:82:229: ^( Comentarios ( $c5)? )
				{
				Tree root_2 = (Tree)adaptor.nil();
				dbg.location(82,231);
				root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);
				dbg.location(82,244);
				// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:82:244: ( $c5)?
				if ( stream_c5.hasNext() ) {
					dbg.location(82,244);
					adaptor.addChild(root_2, stream_c5.nextTree());
				}
				stream_c5.reset();

				adaptor.addChild(root_1, root_2);
				}
				dbg.location(82,249);
				adaptor.addChild(root_1, stream_blocoCodigo.nextTree());dbg.location(82,261);
				// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:82:261: ^( Comentarios ( $c6)? )
				{
				Tree root_2 = (Tree)adaptor.nil();
				dbg.location(82,263);
				root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);
				dbg.location(82,276);
				// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:82:276: ( $c6)?
				if ( stream_c6.hasNext() ) {
					dbg.location(82,276);
					adaptor.addChild(root_2, stream_c6.nextTree());
				}
				stream_c6.reset();

				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(83, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "while_");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "while_"


	public static class return__return extends ParserRuleReturnScope {
		Tree tree;
		@Override
		public Tree getTree() { return tree; }
	};


	// $ANTLR start "return_"
	// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:85:1: return_ : c1= comentarios 'return' c2= comentarios expressao c3= comentarios -> ^( Return ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) expressao ^( Comentarios ( $c3)? ) ) ;
	public final iParser.return__return return_() throws  {
		iParser.return__return retval = new iParser.return__return();
		retval.start = input.LT(1);

		Tree root_0 = null;

		Token string_literal68=null;
		ParserRuleReturnScope c1 =null;
		ParserRuleReturnScope c2 =null;
		ParserRuleReturnScope c3 =null;
		ParserRuleReturnScope expressao69 =null;

		Tree string_literal68_tree=null;
		RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
		RewriteRuleSubtreeStream stream_comentarios=new RewriteRuleSubtreeStream(adaptor,"rule comentarios");
		RewriteRuleSubtreeStream stream_expressao=new RewriteRuleSubtreeStream(adaptor,"rule expressao");

		try { dbg.enterRule(getGrammarFileName(), "return_");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(85, 0);

		try {
			// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:85:10: (c1= comentarios 'return' c2= comentarios expressao c3= comentarios -> ^( Return ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) expressao ^( Comentarios ( $c3)? ) ) )
			dbg.enterAlt(1);

			// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:86:2: c1= comentarios 'return' c2= comentarios expressao c3= comentarios
			{
			dbg.location(86,4);
			pushFollow(FOLLOW_comentarios_in_return_1207);
			c1=comentarios();
			state._fsp--;

			stream_comentarios.add(c1.getTree());dbg.location(86,17);
			string_literal68=(Token)match(input,117,FOLLOW_117_in_return_1209);  
			stream_117.add(string_literal68);
			dbg.location(86,28);
			pushFollow(FOLLOW_comentarios_in_return_1213);
			c2=comentarios();
			state._fsp--;

			stream_comentarios.add(c2.getTree());dbg.location(86,41);
			pushFollow(FOLLOW_expressao_in_return_1215);
			expressao69=expressao();
			state._fsp--;

			stream_expressao.add(expressao69.getTree());dbg.location(86,53);
			pushFollow(FOLLOW_comentarios_in_return_1219);
			c3=comentarios();
			state._fsp--;

			stream_comentarios.add(c3.getTree());
			// AST REWRITE
			// elements: expressao, c1, c2, c3
			// token labels: 
			// rule labels: retval, c1, c2, c3
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_c1=new RewriteRuleSubtreeStream(adaptor,"rule c1",c1!=null?c1.getTree():null);
			RewriteRuleSubtreeStream stream_c2=new RewriteRuleSubtreeStream(adaptor,"rule c2",c2!=null?c2.getTree():null);
			RewriteRuleSubtreeStream stream_c3=new RewriteRuleSubtreeStream(adaptor,"rule c3",c3!=null?c3.getTree():null);

			root_0 = (Tree)adaptor.nil();
			// 86:66: -> ^( Return ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) expressao ^( Comentarios ( $c3)? ) )
			{
				dbg.location(86,69);
				// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:86:69: ^( Return ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) expressao ^( Comentarios ( $c3)? ) )
				{
				Tree root_1 = (Tree)adaptor.nil();
				dbg.location(86,71);
				root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Return, "Return"), root_1);
				dbg.location(86,78);
				// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:86:78: ^( Comentarios ( $c1)? )
				{
				Tree root_2 = (Tree)adaptor.nil();
				dbg.location(86,80);
				root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);
				dbg.location(86,93);
				// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:86:93: ( $c1)?
				if ( stream_c1.hasNext() ) {
					dbg.location(86,93);
					adaptor.addChild(root_2, stream_c1.nextTree());
				}
				stream_c1.reset();

				adaptor.addChild(root_1, root_2);
				}
				dbg.location(86,98);
				// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:86:98: ^( Comentarios ( $c2)? )
				{
				Tree root_2 = (Tree)adaptor.nil();
				dbg.location(86,100);
				root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);
				dbg.location(86,113);
				// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:86:113: ( $c2)?
				if ( stream_c2.hasNext() ) {
					dbg.location(86,113);
					adaptor.addChild(root_2, stream_c2.nextTree());
				}
				stream_c2.reset();

				adaptor.addChild(root_1, root_2);
				}
				dbg.location(86,118);
				adaptor.addChild(root_1, stream_expressao.nextTree());dbg.location(86,128);
				// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:86:128: ^( Comentarios ( $c3)? )
				{
				Tree root_2 = (Tree)adaptor.nil();
				dbg.location(86,130);
				root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);
				dbg.location(86,143);
				// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:86:143: ( $c3)?
				if ( stream_c3.hasNext() ) {
					dbg.location(86,143);
					adaptor.addChild(root_2, stream_c3.nextTree());
				}
				stream_c3.reset();

				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(87, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "return_");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "return_"


	public static class call_return extends ParserRuleReturnScope {
		Tree tree;
		@Override
		public Tree getTree() { return tree; }
	};


	// $ANTLR start "call"
	// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:89:1: call : c1= comentarios ID c2= comentarios '(' c3= comentarios ( parametros )? c4= comentarios ')' c5= comentarios -> ^( Call ^( Comentarios ( $c1)? ) ID ^( Comentarios ( $c2)? ) ^( Comentarios ( $c3)? ) ^( ListaParametros ( parametros )? ) ^( Comentarios ( $c4)? ) ^( Comentarios ( $c5)? ) ) ;
	public final iParser.call_return call() throws  {
		iParser.call_return retval = new iParser.call_return();
		retval.start = input.LT(1);

		Tree root_0 = null;

		Token ID70=null;
		Token char_literal71=null;
		Token char_literal73=null;
		ParserRuleReturnScope c1 =null;
		ParserRuleReturnScope c2 =null;
		ParserRuleReturnScope c3 =null;
		ParserRuleReturnScope c4 =null;
		ParserRuleReturnScope c5 =null;
		ParserRuleReturnScope parametros72 =null;

		Tree ID70_tree=null;
		Tree char_literal71_tree=null;
		Tree char_literal73_tree=null;
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_86=new RewriteRuleTokenStream(adaptor,"token 86");
		RewriteRuleTokenStream stream_85=new RewriteRuleTokenStream(adaptor,"token 85");
		RewriteRuleSubtreeStream stream_parametros=new RewriteRuleSubtreeStream(adaptor,"rule parametros");
		RewriteRuleSubtreeStream stream_comentarios=new RewriteRuleSubtreeStream(adaptor,"rule comentarios");

		try { dbg.enterRule(getGrammarFileName(), "call");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(89, 0);

		try {
			// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:89:6: (c1= comentarios ID c2= comentarios '(' c3= comentarios ( parametros )? c4= comentarios ')' c5= comentarios -> ^( Call ^( Comentarios ( $c1)? ) ID ^( Comentarios ( $c2)? ) ^( Comentarios ( $c3)? ) ^( ListaParametros ( parametros )? ) ^( Comentarios ( $c4)? ) ^( Comentarios ( $c5)? ) ) )
			dbg.enterAlt(1);

			// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:90:2: c1= comentarios ID c2= comentarios '(' c3= comentarios ( parametros )? c4= comentarios ')' c5= comentarios
			{
			dbg.location(90,4);
			pushFollow(FOLLOW_comentarios_in_call1267);
			c1=comentarios();
			state._fsp--;

			stream_comentarios.add(c1.getTree());dbg.location(90,17);
			ID70=(Token)match(input,ID,FOLLOW_ID_in_call1269);  
			stream_ID.add(ID70);
			dbg.location(90,23);
			pushFollow(FOLLOW_comentarios_in_call1274);
			c2=comentarios();
			state._fsp--;

			stream_comentarios.add(c2.getTree());dbg.location(90,36);
			char_literal71=(Token)match(input,85,FOLLOW_85_in_call1276);  
			stream_85.add(char_literal71);
			dbg.location(90,42);
			pushFollow(FOLLOW_comentarios_in_call1280);
			c3=comentarios();
			state._fsp--;

			stream_comentarios.add(c3.getTree());dbg.location(90,55);
			// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:90:55: ( parametros )?
			int alt13=2;
			try { dbg.enterSubRule(13);
			try { dbg.enterDecision(13, decisionCanBacktrack[13]);

			try {
				isCyclicDecision = true;
				alt13 = dfa13.predict(input);
			}
			catch (NoViableAltException nvae) {
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(13);}

			switch (alt13) {
				case 1 :
					dbg.enterAlt(1);

					// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:90:55: parametros
					{
					dbg.location(90,55);
					pushFollow(FOLLOW_parametros_in_call1282);
					parametros72=parametros();
					state._fsp--;

					stream_parametros.add(parametros72.getTree());
					}
					break;

			}
			} finally {dbg.exitSubRule(13);}
			dbg.location(90,69);
			pushFollow(FOLLOW_comentarios_in_call1287);
			c4=comentarios();
			state._fsp--;

			stream_comentarios.add(c4.getTree());dbg.location(90,82);
			char_literal73=(Token)match(input,86,FOLLOW_86_in_call1289);  
			stream_86.add(char_literal73);
			dbg.location(90,88);
			pushFollow(FOLLOW_comentarios_in_call1293);
			c5=comentarios();
			state._fsp--;

			stream_comentarios.add(c5.getTree());
			// AST REWRITE
			// elements: c4, c3, c2, c1, c5, ID, parametros
			// token labels: 
			// rule labels: retval, c1, c2, c5, c4, c3
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_c1=new RewriteRuleSubtreeStream(adaptor,"rule c1",c1!=null?c1.getTree():null);
			RewriteRuleSubtreeStream stream_c2=new RewriteRuleSubtreeStream(adaptor,"rule c2",c2!=null?c2.getTree():null);
			RewriteRuleSubtreeStream stream_c5=new RewriteRuleSubtreeStream(adaptor,"rule c5",c5!=null?c5.getTree():null);
			RewriteRuleSubtreeStream stream_c4=new RewriteRuleSubtreeStream(adaptor,"rule c4",c4!=null?c4.getTree():null);
			RewriteRuleSubtreeStream stream_c3=new RewriteRuleSubtreeStream(adaptor,"rule c3",c3!=null?c3.getTree():null);

			root_0 = (Tree)adaptor.nil();
			// 90:101: -> ^( Call ^( Comentarios ( $c1)? ) ID ^( Comentarios ( $c2)? ) ^( Comentarios ( $c3)? ) ^( ListaParametros ( parametros )? ) ^( Comentarios ( $c4)? ) ^( Comentarios ( $c5)? ) )
			{
				dbg.location(90,104);
				// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:90:104: ^( Call ^( Comentarios ( $c1)? ) ID ^( Comentarios ( $c2)? ) ^( Comentarios ( $c3)? ) ^( ListaParametros ( parametros )? ) ^( Comentarios ( $c4)? ) ^( Comentarios ( $c5)? ) )
				{
				Tree root_1 = (Tree)adaptor.nil();
				dbg.location(90,106);
				root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Call, "Call"), root_1);
				dbg.location(90,111);
				// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:90:111: ^( Comentarios ( $c1)? )
				{
				Tree root_2 = (Tree)adaptor.nil();
				dbg.location(90,113);
				root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);
				dbg.location(90,126);
				// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:90:126: ( $c1)?
				if ( stream_c1.hasNext() ) {
					dbg.location(90,126);
					adaptor.addChild(root_2, stream_c1.nextTree());
				}
				stream_c1.reset();

				adaptor.addChild(root_1, root_2);
				}
				dbg.location(90,131);
				adaptor.addChild(root_1, stream_ID.nextNode());dbg.location(90,134);
				// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:90:134: ^( Comentarios ( $c2)? )
				{
				Tree root_2 = (Tree)adaptor.nil();
				dbg.location(90,136);
				root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);
				dbg.location(90,149);
				// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:90:149: ( $c2)?
				if ( stream_c2.hasNext() ) {
					dbg.location(90,149);
					adaptor.addChild(root_2, stream_c2.nextTree());
				}
				stream_c2.reset();

				adaptor.addChild(root_1, root_2);
				}
				dbg.location(90,154);
				// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:90:154: ^( Comentarios ( $c3)? )
				{
				Tree root_2 = (Tree)adaptor.nil();
				dbg.location(90,156);
				root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);
				dbg.location(90,169);
				// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:90:169: ( $c3)?
				if ( stream_c3.hasNext() ) {
					dbg.location(90,169);
					adaptor.addChild(root_2, stream_c3.nextTree());
				}
				stream_c3.reset();

				adaptor.addChild(root_1, root_2);
				}
				dbg.location(90,174);
				// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:90:174: ^( ListaParametros ( parametros )? )
				{
				Tree root_2 = (Tree)adaptor.nil();
				dbg.location(90,176);
				root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(ListaParametros, "ListaParametros"), root_2);
				dbg.location(90,192);
				// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:90:192: ( parametros )?
				if ( stream_parametros.hasNext() ) {
					dbg.location(90,192);
					adaptor.addChild(root_2, stream_parametros.nextTree());
				}
				stream_parametros.reset();

				adaptor.addChild(root_1, root_2);
				}
				dbg.location(90,205);
				// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:90:205: ^( Comentarios ( $c4)? )
				{
				Tree root_2 = (Tree)adaptor.nil();
				dbg.location(90,207);
				root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);
				dbg.location(90,220);
				// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:90:220: ( $c4)?
				if ( stream_c4.hasNext() ) {
					dbg.location(90,220);
					adaptor.addChild(root_2, stream_c4.nextTree());
				}
				stream_c4.reset();

				adaptor.addChild(root_1, root_2);
				}
				dbg.location(90,225);
				// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:90:225: ^( Comentarios ( $c5)? )
				{
				Tree root_2 = (Tree)adaptor.nil();
				dbg.location(90,227);
				root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);
				dbg.location(90,240);
				// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:90:240: ( $c5)?
				if ( stream_c5.hasNext() ) {
					dbg.location(90,240);
					adaptor.addChild(root_2, stream_c5.nextTree());
				}
				stream_c5.reset();

				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(91, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "call");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "call"


	public static class print__return extends ParserRuleReturnScope {
		Tree tree;
		@Override
		public Tree getTree() { return tree; }
	};


	// $ANTLR start "print_"
	// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:93:1: print_ : c1= comentarios 'print' c2= comentarios '(' c3= comentarios expressao c4= comentarios ')' c5= comentarios -> ^( Exp ^( Print ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) ^( Comentarios ( $c3)? ) expressao ^( Comentarios ( $c4)? ) ^( Comentarios ( $c5)? ) ) ) ;
	public final iParser.print__return print_() throws  {
		iParser.print__return retval = new iParser.print__return();
		retval.start = input.LT(1);

		Tree root_0 = null;

		Token string_literal74=null;
		Token char_literal75=null;
		Token char_literal77=null;
		ParserRuleReturnScope c1 =null;
		ParserRuleReturnScope c2 =null;
		ParserRuleReturnScope c3 =null;
		ParserRuleReturnScope c4 =null;
		ParserRuleReturnScope c5 =null;
		ParserRuleReturnScope expressao76 =null;

		Tree string_literal74_tree=null;
		Tree char_literal75_tree=null;
		Tree char_literal77_tree=null;
		RewriteRuleTokenStream stream_116=new RewriteRuleTokenStream(adaptor,"token 116");
		RewriteRuleTokenStream stream_86=new RewriteRuleTokenStream(adaptor,"token 86");
		RewriteRuleTokenStream stream_85=new RewriteRuleTokenStream(adaptor,"token 85");
		RewriteRuleSubtreeStream stream_comentarios=new RewriteRuleSubtreeStream(adaptor,"rule comentarios");
		RewriteRuleSubtreeStream stream_expressao=new RewriteRuleSubtreeStream(adaptor,"rule expressao");

		try { dbg.enterRule(getGrammarFileName(), "print_");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(93, 0);

		try {
			// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:93:8: (c1= comentarios 'print' c2= comentarios '(' c3= comentarios expressao c4= comentarios ')' c5= comentarios -> ^( Exp ^( Print ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) ^( Comentarios ( $c3)? ) expressao ^( Comentarios ( $c4)? ) ^( Comentarios ( $c5)? ) ) ) )
			dbg.enterAlt(1);

			// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:94:2: c1= comentarios 'print' c2= comentarios '(' c3= comentarios expressao c4= comentarios ')' c5= comentarios
			{
			dbg.location(94,4);
			pushFollow(FOLLOW_comentarios_in_print_1361);
			c1=comentarios();
			state._fsp--;

			stream_comentarios.add(c1.getTree());dbg.location(94,17);
			string_literal74=(Token)match(input,116,FOLLOW_116_in_print_1363);  
			stream_116.add(string_literal74);
			dbg.location(94,27);
			pushFollow(FOLLOW_comentarios_in_print_1367);
			c2=comentarios();
			state._fsp--;

			stream_comentarios.add(c2.getTree());dbg.location(94,40);
			char_literal75=(Token)match(input,85,FOLLOW_85_in_print_1369);  
			stream_85.add(char_literal75);
			dbg.location(94,46);
			pushFollow(FOLLOW_comentarios_in_print_1373);
			c3=comentarios();
			state._fsp--;

			stream_comentarios.add(c3.getTree());dbg.location(94,59);
			pushFollow(FOLLOW_expressao_in_print_1375);
			expressao76=expressao();
			state._fsp--;

			stream_expressao.add(expressao76.getTree());dbg.location(94,71);
			pushFollow(FOLLOW_comentarios_in_print_1379);
			c4=comentarios();
			state._fsp--;

			stream_comentarios.add(c4.getTree());dbg.location(94,84);
			char_literal77=(Token)match(input,86,FOLLOW_86_in_print_1381);  
			stream_86.add(char_literal77);
			dbg.location(94,90);
			pushFollow(FOLLOW_comentarios_in_print_1385);
			c5=comentarios();
			state._fsp--;

			stream_comentarios.add(c5.getTree());
			// AST REWRITE
			// elements: c5, c1, expressao, c4, c2, c3
			// token labels: 
			// rule labels: retval, c1, c2, c5, c4, c3
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_c1=new RewriteRuleSubtreeStream(adaptor,"rule c1",c1!=null?c1.getTree():null);
			RewriteRuleSubtreeStream stream_c2=new RewriteRuleSubtreeStream(adaptor,"rule c2",c2!=null?c2.getTree():null);
			RewriteRuleSubtreeStream stream_c5=new RewriteRuleSubtreeStream(adaptor,"rule c5",c5!=null?c5.getTree():null);
			RewriteRuleSubtreeStream stream_c4=new RewriteRuleSubtreeStream(adaptor,"rule c4",c4!=null?c4.getTree():null);
			RewriteRuleSubtreeStream stream_c3=new RewriteRuleSubtreeStream(adaptor,"rule c3",c3!=null?c3.getTree():null);

			root_0 = (Tree)adaptor.nil();
			// 94:103: -> ^( Exp ^( Print ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) ^( Comentarios ( $c3)? ) expressao ^( Comentarios ( $c4)? ) ^( Comentarios ( $c5)? ) ) )
			{
				dbg.location(94,106);
				// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:94:106: ^( Exp ^( Print ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) ^( Comentarios ( $c3)? ) expressao ^( Comentarios ( $c4)? ) ^( Comentarios ( $c5)? ) ) )
				{
				Tree root_1 = (Tree)adaptor.nil();
				dbg.location(94,108);
				root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Exp, "Exp"), root_1);
				dbg.location(94,112);
				// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:94:112: ^( Print ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) ^( Comentarios ( $c3)? ) expressao ^( Comentarios ( $c4)? ) ^( Comentarios ( $c5)? ) )
				{
				Tree root_2 = (Tree)adaptor.nil();
				dbg.location(94,114);
				root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Print, "Print"), root_2);
				dbg.location(94,120);
				// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:94:120: ^( Comentarios ( $c1)? )
				{
				Tree root_3 = (Tree)adaptor.nil();
				dbg.location(94,122);
				root_3 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_3);
				dbg.location(94,135);
				// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:94:135: ( $c1)?
				if ( stream_c1.hasNext() ) {
					dbg.location(94,135);
					adaptor.addChild(root_3, stream_c1.nextTree());
				}
				stream_c1.reset();

				adaptor.addChild(root_2, root_3);
				}
				dbg.location(94,140);
				// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:94:140: ^( Comentarios ( $c2)? )
				{
				Tree root_3 = (Tree)adaptor.nil();
				dbg.location(94,142);
				root_3 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_3);
				dbg.location(94,155);
				// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:94:155: ( $c2)?
				if ( stream_c2.hasNext() ) {
					dbg.location(94,155);
					adaptor.addChild(root_3, stream_c2.nextTree());
				}
				stream_c2.reset();

				adaptor.addChild(root_2, root_3);
				}
				dbg.location(94,160);
				// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:94:160: ^( Comentarios ( $c3)? )
				{
				Tree root_3 = (Tree)adaptor.nil();
				dbg.location(94,162);
				root_3 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_3);
				dbg.location(94,175);
				// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:94:175: ( $c3)?
				if ( stream_c3.hasNext() ) {
					dbg.location(94,175);
					adaptor.addChild(root_3, stream_c3.nextTree());
				}
				stream_c3.reset();

				adaptor.addChild(root_2, root_3);
				}
				dbg.location(94,180);
				adaptor.addChild(root_2, stream_expressao.nextTree());dbg.location(94,190);
				// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:94:190: ^( Comentarios ( $c4)? )
				{
				Tree root_3 = (Tree)adaptor.nil();
				dbg.location(94,192);
				root_3 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_3);
				dbg.location(94,205);
				// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:94:205: ( $c4)?
				if ( stream_c4.hasNext() ) {
					dbg.location(94,205);
					adaptor.addChild(root_3, stream_c4.nextTree());
				}
				stream_c4.reset();

				adaptor.addChild(root_2, root_3);
				}
				dbg.location(94,210);
				// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:94:210: ^( Comentarios ( $c5)? )
				{
				Tree root_3 = (Tree)adaptor.nil();
				dbg.location(94,212);
				root_3 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_3);
				dbg.location(94,225);
				// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:94:225: ( $c5)?
				if ( stream_c5.hasNext() ) {
					dbg.location(94,225);
					adaptor.addChild(root_3, stream_c5.nextTree());
				}
				stream_c5.reset();

				adaptor.addChild(root_2, root_3);
				}

				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(95, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "print_");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "print_"


	public static class input__return extends ParserRuleReturnScope {
		Tree tree;
		@Override
		public Tree getTree() { return tree; }
	};


	// $ANTLR start "input_"
	// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:97:1: input_ : c1= comentarios 'input' c2= comentarios '(' c3= comentarios idTipo c4= comentarios ')' c5= comentarios -> ^( Input ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) ^( Comentarios ( $c3)? ) idTipo ^( Comentarios ( $c4)? ) ^( Comentarios ( $c5)? ) ) ;
	public final iParser.input__return input_() throws  {
		iParser.input__return retval = new iParser.input__return();
		retval.start = input.LT(1);

		Tree root_0 = null;

		Token string_literal78=null;
		Token char_literal79=null;
		Token char_literal81=null;
		ParserRuleReturnScope c1 =null;
		ParserRuleReturnScope c2 =null;
		ParserRuleReturnScope c3 =null;
		ParserRuleReturnScope c4 =null;
		ParserRuleReturnScope c5 =null;
		ParserRuleReturnScope idTipo80 =null;

		Tree string_literal78_tree=null;
		Tree char_literal79_tree=null;
		Tree char_literal81_tree=null;
		RewriteRuleTokenStream stream_114=new RewriteRuleTokenStream(adaptor,"token 114");
		RewriteRuleTokenStream stream_86=new RewriteRuleTokenStream(adaptor,"token 86");
		RewriteRuleTokenStream stream_85=new RewriteRuleTokenStream(adaptor,"token 85");
		RewriteRuleSubtreeStream stream_comentarios=new RewriteRuleSubtreeStream(adaptor,"rule comentarios");
		RewriteRuleSubtreeStream stream_idTipo=new RewriteRuleSubtreeStream(adaptor,"rule idTipo");

		try { dbg.enterRule(getGrammarFileName(), "input_");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(97, 0);

		try {
			// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:97:8: (c1= comentarios 'input' c2= comentarios '(' c3= comentarios idTipo c4= comentarios ')' c5= comentarios -> ^( Input ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) ^( Comentarios ( $c3)? ) idTipo ^( Comentarios ( $c4)? ) ^( Comentarios ( $c5)? ) ) )
			dbg.enterAlt(1);

			// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:98:2: c1= comentarios 'input' c2= comentarios '(' c3= comentarios idTipo c4= comentarios ')' c5= comentarios
			{
			dbg.location(98,4);
			pushFollow(FOLLOW_comentarios_in_input_1451);
			c1=comentarios();
			state._fsp--;

			stream_comentarios.add(c1.getTree());dbg.location(98,17);
			string_literal78=(Token)match(input,114,FOLLOW_114_in_input_1453);  
			stream_114.add(string_literal78);
			dbg.location(98,27);
			pushFollow(FOLLOW_comentarios_in_input_1457);
			c2=comentarios();
			state._fsp--;

			stream_comentarios.add(c2.getTree());dbg.location(98,40);
			char_literal79=(Token)match(input,85,FOLLOW_85_in_input_1459);  
			stream_85.add(char_literal79);
			dbg.location(98,46);
			pushFollow(FOLLOW_comentarios_in_input_1463);
			c3=comentarios();
			state._fsp--;

			stream_comentarios.add(c3.getTree());dbg.location(98,59);
			pushFollow(FOLLOW_idTipo_in_input_1465);
			idTipo80=idTipo();
			state._fsp--;

			stream_idTipo.add(idTipo80.getTree());dbg.location(98,68);
			pushFollow(FOLLOW_comentarios_in_input_1469);
			c4=comentarios();
			state._fsp--;

			stream_comentarios.add(c4.getTree());dbg.location(98,81);
			char_literal81=(Token)match(input,86,FOLLOW_86_in_input_1471);  
			stream_86.add(char_literal81);
			dbg.location(98,87);
			pushFollow(FOLLOW_comentarios_in_input_1475);
			c5=comentarios();
			state._fsp--;

			stream_comentarios.add(c5.getTree());
			// AST REWRITE
			// elements: c1, c4, idTipo, c5, c3, c2
			// token labels: 
			// rule labels: retval, c1, c2, c5, c4, c3
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_c1=new RewriteRuleSubtreeStream(adaptor,"rule c1",c1!=null?c1.getTree():null);
			RewriteRuleSubtreeStream stream_c2=new RewriteRuleSubtreeStream(adaptor,"rule c2",c2!=null?c2.getTree():null);
			RewriteRuleSubtreeStream stream_c5=new RewriteRuleSubtreeStream(adaptor,"rule c5",c5!=null?c5.getTree():null);
			RewriteRuleSubtreeStream stream_c4=new RewriteRuleSubtreeStream(adaptor,"rule c4",c4!=null?c4.getTree():null);
			RewriteRuleSubtreeStream stream_c3=new RewriteRuleSubtreeStream(adaptor,"rule c3",c3!=null?c3.getTree():null);

			root_0 = (Tree)adaptor.nil();
			// 98:100: -> ^( Input ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) ^( Comentarios ( $c3)? ) idTipo ^( Comentarios ( $c4)? ) ^( Comentarios ( $c5)? ) )
			{
				dbg.location(98,103);
				// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:98:103: ^( Input ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) ^( Comentarios ( $c3)? ) idTipo ^( Comentarios ( $c4)? ) ^( Comentarios ( $c5)? ) )
				{
				Tree root_1 = (Tree)adaptor.nil();
				dbg.location(98,105);
				root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Input, "Input"), root_1);
				dbg.location(98,111);
				// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:98:111: ^( Comentarios ( $c1)? )
				{
				Tree root_2 = (Tree)adaptor.nil();
				dbg.location(98,113);
				root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);
				dbg.location(98,126);
				// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:98:126: ( $c1)?
				if ( stream_c1.hasNext() ) {
					dbg.location(98,126);
					adaptor.addChild(root_2, stream_c1.nextTree());
				}
				stream_c1.reset();

				adaptor.addChild(root_1, root_2);
				}
				dbg.location(98,131);
				// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:98:131: ^( Comentarios ( $c2)? )
				{
				Tree root_2 = (Tree)adaptor.nil();
				dbg.location(98,133);
				root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);
				dbg.location(98,146);
				// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:98:146: ( $c2)?
				if ( stream_c2.hasNext() ) {
					dbg.location(98,146);
					adaptor.addChild(root_2, stream_c2.nextTree());
				}
				stream_c2.reset();

				adaptor.addChild(root_1, root_2);
				}
				dbg.location(98,151);
				// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:98:151: ^( Comentarios ( $c3)? )
				{
				Tree root_2 = (Tree)adaptor.nil();
				dbg.location(98,153);
				root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);
				dbg.location(98,166);
				// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:98:166: ( $c3)?
				if ( stream_c3.hasNext() ) {
					dbg.location(98,166);
					adaptor.addChild(root_2, stream_c3.nextTree());
				}
				stream_c3.reset();

				adaptor.addChild(root_1, root_2);
				}
				dbg.location(98,171);
				adaptor.addChild(root_1, stream_idTipo.nextTree());dbg.location(98,178);
				// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:98:178: ^( Comentarios ( $c4)? )
				{
				Tree root_2 = (Tree)adaptor.nil();
				dbg.location(98,180);
				root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);
				dbg.location(98,193);
				// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:98:193: ( $c4)?
				if ( stream_c4.hasNext() ) {
					dbg.location(98,193);
					adaptor.addChild(root_2, stream_c4.nextTree());
				}
				stream_c4.reset();

				adaptor.addChild(root_1, root_2);
				}
				dbg.location(98,198);
				// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:98:198: ^( Comentarios ( $c5)? )
				{
				Tree root_2 = (Tree)adaptor.nil();
				dbg.location(98,200);
				root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);
				dbg.location(98,213);
				// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:98:213: ( $c5)?
				if ( stream_c5.hasNext() ) {
					dbg.location(98,213);
					adaptor.addChild(root_2, stream_c5.nextTree());
				}
				stream_c5.reset();

				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(99, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "input_");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "input_"


	public static class parametros_return extends ParserRuleReturnScope {
		Tree tree;
		@Override
		public Tree getTree() { return tree; }
	};


	// $ANTLR start "parametros"
	// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:101:1: parametros : parametro ( ',' parametro )* -> ( parametro )+ ;
	public final iParser.parametros_return parametros() throws  {
		iParser.parametros_return retval = new iParser.parametros_return();
		retval.start = input.LT(1);

		Tree root_0 = null;

		Token char_literal83=null;
		ParserRuleReturnScope parametro82 =null;
		ParserRuleReturnScope parametro84 =null;

		Tree char_literal83_tree=null;
		RewriteRuleTokenStream stream_92=new RewriteRuleTokenStream(adaptor,"token 92");
		RewriteRuleSubtreeStream stream_parametro=new RewriteRuleSubtreeStream(adaptor,"rule parametro");

		try { dbg.enterRule(getGrammarFileName(), "parametros");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(101, 0);

		try {
			// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:101:12: ( parametro ( ',' parametro )* -> ( parametro )+ )
			dbg.enterAlt(1);

			// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:102:2: parametro ( ',' parametro )*
			{
			dbg.location(102,2);
			pushFollow(FOLLOW_parametro_in_parametros1535);
			parametro82=parametro();
			state._fsp--;

			stream_parametro.add(parametro82.getTree());dbg.location(102,12);
			// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:102:12: ( ',' parametro )*
			try { dbg.enterSubRule(14);

			loop14:
			while (true) {
				int alt14=2;
				try { dbg.enterDecision(14, decisionCanBacktrack[14]);

				int LA14_0 = input.LA(1);
				if ( (LA14_0==92) ) {
					alt14=1;
				}

				} finally {dbg.exitDecision(14);}

				switch (alt14) {
				case 1 :
					dbg.enterAlt(1);

					// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:102:14: ',' parametro
					{
					dbg.location(102,14);
					char_literal83=(Token)match(input,92,FOLLOW_92_in_parametros1539);  
					stream_92.add(char_literal83);
					dbg.location(102,18);
					pushFollow(FOLLOW_parametro_in_parametros1541);
					parametro84=parametro();
					state._fsp--;

					stream_parametro.add(parametro84.getTree());
					}
					break;

				default :
					break loop14;
				}
			}
			} finally {dbg.exitSubRule(14);}

			// AST REWRITE
			// elements: parametro
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Tree)adaptor.nil();
			// 102:30: -> ( parametro )+
			{
				dbg.location(102,34);
				if ( !(stream_parametro.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_parametro.hasNext() ) {
					dbg.location(102,34);
					adaptor.addChild(root_0, stream_parametro.nextTree());
				}
				stream_parametro.reset();

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(103, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "parametros");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "parametros"


	public static class parametro_return extends ParserRuleReturnScope {
		Tree tree;
		@Override
		public Tree getTree() { return tree; }
	};


	// $ANTLR start "parametro"
	// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:105:1: parametro : c1= comentarios expressao c2= comentarios -> ^( Parametro ^( Comentarios ( $c1)? ) expressao ^( Comentarios ( $c2)? ) ) ;
	public final iParser.parametro_return parametro() throws  {
		iParser.parametro_return retval = new iParser.parametro_return();
		retval.start = input.LT(1);

		Tree root_0 = null;

		ParserRuleReturnScope c1 =null;
		ParserRuleReturnScope c2 =null;
		ParserRuleReturnScope expressao85 =null;

		RewriteRuleSubtreeStream stream_comentarios=new RewriteRuleSubtreeStream(adaptor,"rule comentarios");
		RewriteRuleSubtreeStream stream_expressao=new RewriteRuleSubtreeStream(adaptor,"rule expressao");

		try { dbg.enterRule(getGrammarFileName(), "parametro");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(105, 0);

		try {
			// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:105:11: (c1= comentarios expressao c2= comentarios -> ^( Parametro ^( Comentarios ( $c1)? ) expressao ^( Comentarios ( $c2)? ) ) )
			dbg.enterAlt(1);

			// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:106:2: c1= comentarios expressao c2= comentarios
			{
			dbg.location(106,4);
			pushFollow(FOLLOW_comentarios_in_parametro1562);
			c1=comentarios();
			state._fsp--;

			stream_comentarios.add(c1.getTree());dbg.location(106,17);
			pushFollow(FOLLOW_expressao_in_parametro1564);
			expressao85=expressao();
			state._fsp--;

			stream_expressao.add(expressao85.getTree());dbg.location(106,29);
			pushFollow(FOLLOW_comentarios_in_parametro1568);
			c2=comentarios();
			state._fsp--;

			stream_comentarios.add(c2.getTree());
			// AST REWRITE
			// elements: c2, expressao, c1
			// token labels: 
			// rule labels: retval, c1, c2
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_c1=new RewriteRuleSubtreeStream(adaptor,"rule c1",c1!=null?c1.getTree():null);
			RewriteRuleSubtreeStream stream_c2=new RewriteRuleSubtreeStream(adaptor,"rule c2",c2!=null?c2.getTree():null);

			root_0 = (Tree)adaptor.nil();
			// 106:42: -> ^( Parametro ^( Comentarios ( $c1)? ) expressao ^( Comentarios ( $c2)? ) )
			{
				dbg.location(106,45);
				// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:106:45: ^( Parametro ^( Comentarios ( $c1)? ) expressao ^( Comentarios ( $c2)? ) )
				{
				Tree root_1 = (Tree)adaptor.nil();
				dbg.location(106,47);
				root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Parametro, "Parametro"), root_1);
				dbg.location(106,57);
				// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:106:57: ^( Comentarios ( $c1)? )
				{
				Tree root_2 = (Tree)adaptor.nil();
				dbg.location(106,59);
				root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);
				dbg.location(106,72);
				// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:106:72: ( $c1)?
				if ( stream_c1.hasNext() ) {
					dbg.location(106,72);
					adaptor.addChild(root_2, stream_c1.nextTree());
				}
				stream_c1.reset();

				adaptor.addChild(root_1, root_2);
				}
				dbg.location(106,77);
				adaptor.addChild(root_1, stream_expressao.nextTree());dbg.location(106,87);
				// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:106:87: ^( Comentarios ( $c2)? )
				{
				Tree root_2 = (Tree)adaptor.nil();
				dbg.location(106,89);
				root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);
				dbg.location(106,102);
				// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:106:102: ( $c2)?
				if ( stream_c2.hasNext() ) {
					dbg.location(106,102);
					adaptor.addChild(root_2, stream_c2.nextTree());
				}
				stream_c2.reset();

				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(107, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "parametro");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "parametro"


	public static class blocoCodigo_return extends ParserRuleReturnScope {
		Tree tree;
		@Override
		public Tree getTree() { return tree; }
	};


	// $ANTLR start "blocoCodigo"
	// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:109:1: blocoCodigo : '{' ( codigo )* '}' -> ^( SeqInstrucao ( codigo )* ) ;
	public final iParser.blocoCodigo_return blocoCodigo() throws  {
		iParser.blocoCodigo_return retval = new iParser.blocoCodigo_return();
		retval.start = input.LT(1);

		Tree root_0 = null;

		Token char_literal86=null;
		Token char_literal88=null;
		ParserRuleReturnScope codigo87 =null;

		Tree char_literal86_tree=null;
		Tree char_literal88_tree=null;
		RewriteRuleTokenStream stream_121=new RewriteRuleTokenStream(adaptor,"token 121");
		RewriteRuleTokenStream stream_123=new RewriteRuleTokenStream(adaptor,"token 123");
		RewriteRuleSubtreeStream stream_codigo=new RewriteRuleSubtreeStream(adaptor,"rule codigo");

		try { dbg.enterRule(getGrammarFileName(), "blocoCodigo");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(109, 0);

		try {
			// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:109:13: ( '{' ( codigo )* '}' -> ^( SeqInstrucao ( codigo )* ) )
			dbg.enterAlt(1);

			// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:110:2: '{' ( codigo )* '}'
			{
			dbg.location(110,2);
			char_literal86=(Token)match(input,121,FOLLOW_121_in_blocoCodigo1604);  
			stream_121.add(char_literal86);
			dbg.location(110,6);
			// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:110:6: ( codigo )*
			try { dbg.enterSubRule(15);

			loop15:
			while (true) {
				int alt15=2;
				try { dbg.enterDecision(15, decisionCanBacktrack[15]);

				int LA15_0 = input.LA(1);
				if ( ((LA15_0 >= COMENTARIO_LINHA && LA15_0 <= COMENTARIO_LINHAS)||LA15_0==ID||(LA15_0 >= 107 && LA15_0 <= 108)||(LA15_0 >= 111 && LA15_0 <= 113)||(LA15_0 >= 115 && LA15_0 <= 117)||(LA15_0 >= 119 && LA15_0 <= 120)) ) {
					alt15=1;
				}

				} finally {dbg.exitDecision(15);}

				switch (alt15) {
				case 1 :
					dbg.enterAlt(1);

					// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:110:6: codigo
					{
					dbg.location(110,6);
					pushFollow(FOLLOW_codigo_in_blocoCodigo1606);
					codigo87=codigo();
					state._fsp--;

					stream_codigo.add(codigo87.getTree());
					}
					break;

				default :
					break loop15;
				}
			}
			} finally {dbg.exitSubRule(15);}
			dbg.location(110,14);
			char_literal88=(Token)match(input,123,FOLLOW_123_in_blocoCodigo1609);  
			stream_123.add(char_literal88);

			// AST REWRITE
			// elements: codigo
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Tree)adaptor.nil();
			// 110:18: -> ^( SeqInstrucao ( codigo )* )
			{
				dbg.location(110,21);
				// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:110:21: ^( SeqInstrucao ( codigo )* )
				{
				Tree root_1 = (Tree)adaptor.nil();
				dbg.location(110,23);
				root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(SeqInstrucao, "SeqInstrucao"), root_1);
				dbg.location(110,36);
				// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:110:36: ( codigo )*
				while ( stream_codigo.hasNext() ) {
					dbg.location(110,36);
					adaptor.addChild(root_1, stream_codigo.nextTree());
				}
				stream_codigo.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(111, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "blocoCodigo");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "blocoCodigo"


	public static class codigo_return extends ParserRuleReturnScope {
		Tree tree;
		@Override
		public Tree getTree() { return tree; }
	};


	// $ANTLR start "codigo"
	// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:113:1: codigo : ( atribuicao ';' -> atribuicao | declaracao ';' -> declaracao | instrucao -> instrucao ) ;
	public final iParser.codigo_return codigo() throws  {
		iParser.codigo_return retval = new iParser.codigo_return();
		retval.start = input.LT(1);

		Tree root_0 = null;

		Token char_literal90=null;
		Token char_literal92=null;
		ParserRuleReturnScope atribuicao89 =null;
		ParserRuleReturnScope declaracao91 =null;
		ParserRuleReturnScope instrucao93 =null;

		Tree char_literal90_tree=null;
		Tree char_literal92_tree=null;
		RewriteRuleTokenStream stream_99=new RewriteRuleTokenStream(adaptor,"token 99");
		RewriteRuleSubtreeStream stream_atribuicao=new RewriteRuleSubtreeStream(adaptor,"rule atribuicao");
		RewriteRuleSubtreeStream stream_declaracao=new RewriteRuleSubtreeStream(adaptor,"rule declaracao");
		RewriteRuleSubtreeStream stream_instrucao=new RewriteRuleSubtreeStream(adaptor,"rule instrucao");

		try { dbg.enterRule(getGrammarFileName(), "codigo");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(113, 0);

		try {
			// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:113:8: ( ( atribuicao ';' -> atribuicao | declaracao ';' -> declaracao | instrucao -> instrucao ) )
			dbg.enterAlt(1);

			// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:114:2: ( atribuicao ';' -> atribuicao | declaracao ';' -> declaracao | instrucao -> instrucao )
			{
			dbg.location(114,2);
			// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:114:2: ( atribuicao ';' -> atribuicao | declaracao ';' -> declaracao | instrucao -> instrucao )
			int alt16=3;
			try { dbg.enterSubRule(16);
			try { dbg.enterDecision(16, decisionCanBacktrack[16]);

			try {
				isCyclicDecision = true;
				alt16 = dfa16.predict(input);
			}
			catch (NoViableAltException nvae) {
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(16);}

			switch (alt16) {
				case 1 :
					dbg.enterAlt(1);

					// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:114:4: atribuicao ';'
					{
					dbg.location(114,4);
					pushFollow(FOLLOW_atribuicao_in_codigo1631);
					atribuicao89=atribuicao();
					state._fsp--;

					stream_atribuicao.add(atribuicao89.getTree());dbg.location(114,15);
					char_literal90=(Token)match(input,99,FOLLOW_99_in_codigo1633);  
					stream_99.add(char_literal90);

					// AST REWRITE
					// elements: atribuicao
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Tree)adaptor.nil();
					// 114:19: -> atribuicao
					{
						dbg.location(114,22);
						adaptor.addChild(root_0, stream_atribuicao.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:115:4: declaracao ';'
					{
					dbg.location(115,4);
					pushFollow(FOLLOW_declaracao_in_codigo1642);
					declaracao91=declaracao();
					state._fsp--;

					stream_declaracao.add(declaracao91.getTree());dbg.location(115,15);
					char_literal92=(Token)match(input,99,FOLLOW_99_in_codigo1644);  
					stream_99.add(char_literal92);

					// AST REWRITE
					// elements: declaracao
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Tree)adaptor.nil();
					// 115:19: -> declaracao
					{
						dbg.location(115,22);
						adaptor.addChild(root_0, stream_declaracao.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:116:4: instrucao
					{
					dbg.location(116,4);
					pushFollow(FOLLOW_instrucao_in_codigo1653);
					instrucao93=instrucao();
					state._fsp--;

					stream_instrucao.add(instrucao93.getTree());
					// AST REWRITE
					// elements: instrucao
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Tree)adaptor.nil();
					// 116:14: -> instrucao
					{
						dbg.location(116,17);
						adaptor.addChild(root_0, stream_instrucao.nextTree());
					}


					retval.tree = root_0;

					}
					break;

			}
			} finally {dbg.exitSubRule(16);}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(118, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "codigo");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "codigo"


	public static class condicao_return extends ParserRuleReturnScope {
		Tree tree;
		@Override
		public Tree getTree() { return tree; }
	};


	// $ANTLR start "condicao"
	// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:123:1: condicao : condicao_ou (c1= comentarios '?' c2= comentarios expressao c3= comentarios ':' c4= comentarios condicao -> ^( Condicional condicao_ou ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) expressao ^( Comentarios ( $c3)? ) ^( Comentarios ( $c4)? ) condicao ) | -> condicao_ou ) ;
	public final iParser.condicao_return condicao() throws  {
		iParser.condicao_return retval = new iParser.condicao_return();
		retval.start = input.LT(1);

		Tree root_0 = null;

		Token char_literal95=null;
		Token char_literal97=null;
		ParserRuleReturnScope c1 =null;
		ParserRuleReturnScope c2 =null;
		ParserRuleReturnScope c3 =null;
		ParserRuleReturnScope c4 =null;
		ParserRuleReturnScope condicao_ou94 =null;
		ParserRuleReturnScope expressao96 =null;
		ParserRuleReturnScope condicao98 =null;

		Tree char_literal95_tree=null;
		Tree char_literal97_tree=null;
		RewriteRuleTokenStream stream_98=new RewriteRuleTokenStream(adaptor,"token 98");
		RewriteRuleTokenStream stream_106=new RewriteRuleTokenStream(adaptor,"token 106");
		RewriteRuleSubtreeStream stream_condicao_ou=new RewriteRuleSubtreeStream(adaptor,"rule condicao_ou");
		RewriteRuleSubtreeStream stream_comentarios=new RewriteRuleSubtreeStream(adaptor,"rule comentarios");
		RewriteRuleSubtreeStream stream_condicao=new RewriteRuleSubtreeStream(adaptor,"rule condicao");
		RewriteRuleSubtreeStream stream_expressao=new RewriteRuleSubtreeStream(adaptor,"rule expressao");

		try { dbg.enterRule(getGrammarFileName(), "condicao");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(123, 0);

		try {
			// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:123:11: ( condicao_ou (c1= comentarios '?' c2= comentarios expressao c3= comentarios ':' c4= comentarios condicao -> ^( Condicional condicao_ou ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) expressao ^( Comentarios ( $c3)? ) ^( Comentarios ( $c4)? ) condicao ) | -> condicao_ou ) )
			dbg.enterAlt(1);

			// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:124:2: condicao_ou (c1= comentarios '?' c2= comentarios expressao c3= comentarios ':' c4= comentarios condicao -> ^( Condicional condicao_ou ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) expressao ^( Comentarios ( $c3)? ) ^( Comentarios ( $c4)? ) condicao ) | -> condicao_ou )
			{
			dbg.location(124,2);
			pushFollow(FOLLOW_condicao_ou_in_condicao1676);
			condicao_ou94=condicao_ou();
			state._fsp--;

			stream_condicao_ou.add(condicao_ou94.getTree());dbg.location(124,14);
			// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:124:14: (c1= comentarios '?' c2= comentarios expressao c3= comentarios ':' c4= comentarios condicao -> ^( Condicional condicao_ou ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) expressao ^( Comentarios ( $c3)? ) ^( Comentarios ( $c4)? ) condicao ) | -> condicao_ou )
			int alt17=2;
			try { dbg.enterSubRule(17);
			try { dbg.enterDecision(17, decisionCanBacktrack[17]);

			try {
				isCyclicDecision = true;
				alt17 = dfa17.predict(input);
			}
			catch (NoViableAltException nvae) {
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(17);}

			switch (alt17) {
				case 1 :
					dbg.enterAlt(1);

					// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:124:16: c1= comentarios '?' c2= comentarios expressao c3= comentarios ':' c4= comentarios condicao
					{
					dbg.location(124,18);
					pushFollow(FOLLOW_comentarios_in_condicao1682);
					c1=comentarios();
					state._fsp--;

					stream_comentarios.add(c1.getTree());dbg.location(124,31);
					char_literal95=(Token)match(input,106,FOLLOW_106_in_condicao1684);  
					stream_106.add(char_literal95);
					dbg.location(124,37);
					pushFollow(FOLLOW_comentarios_in_condicao1688);
					c2=comentarios();
					state._fsp--;

					stream_comentarios.add(c2.getTree());dbg.location(124,50);
					pushFollow(FOLLOW_expressao_in_condicao1690);
					expressao96=expressao();
					state._fsp--;

					stream_expressao.add(expressao96.getTree());dbg.location(124,62);
					pushFollow(FOLLOW_comentarios_in_condicao1694);
					c3=comentarios();
					state._fsp--;

					stream_comentarios.add(c3.getTree());dbg.location(124,75);
					char_literal97=(Token)match(input,98,FOLLOW_98_in_condicao1696);  
					stream_98.add(char_literal97);
					dbg.location(124,81);
					pushFollow(FOLLOW_comentarios_in_condicao1700);
					c4=comentarios();
					state._fsp--;

					stream_comentarios.add(c4.getTree());dbg.location(124,94);
					pushFollow(FOLLOW_condicao_in_condicao1702);
					condicao98=condicao();
					state._fsp--;

					stream_condicao.add(condicao98.getTree());
					// AST REWRITE
					// elements: condicao_ou, c2, condicao, c3, c1, expressao, c4
					// token labels: 
					// rule labels: retval, c1, c2, c4, c3
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_c1=new RewriteRuleSubtreeStream(adaptor,"rule c1",c1!=null?c1.getTree():null);
					RewriteRuleSubtreeStream stream_c2=new RewriteRuleSubtreeStream(adaptor,"rule c2",c2!=null?c2.getTree():null);
					RewriteRuleSubtreeStream stream_c4=new RewriteRuleSubtreeStream(adaptor,"rule c4",c4!=null?c4.getTree():null);
					RewriteRuleSubtreeStream stream_c3=new RewriteRuleSubtreeStream(adaptor,"rule c3",c3!=null?c3.getTree():null);

					root_0 = (Tree)adaptor.nil();
					// 124:103: -> ^( Condicional condicao_ou ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) expressao ^( Comentarios ( $c3)? ) ^( Comentarios ( $c4)? ) condicao )
					{
						dbg.location(124,106);
						// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:124:106: ^( Condicional condicao_ou ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) expressao ^( Comentarios ( $c3)? ) ^( Comentarios ( $c4)? ) condicao )
						{
						Tree root_1 = (Tree)adaptor.nil();
						dbg.location(124,108);
						root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Condicional, "Condicional"), root_1);
						dbg.location(124,120);
						adaptor.addChild(root_1, stream_condicao_ou.nextTree());dbg.location(124,132);
						// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:124:132: ^( Comentarios ( $c1)? )
						{
						Tree root_2 = (Tree)adaptor.nil();
						dbg.location(124,134);
						root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);
						dbg.location(124,147);
						// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:124:147: ( $c1)?
						if ( stream_c1.hasNext() ) {
							dbg.location(124,147);
							adaptor.addChild(root_2, stream_c1.nextTree());
						}
						stream_c1.reset();

						adaptor.addChild(root_1, root_2);
						}
						dbg.location(124,152);
						// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:124:152: ^( Comentarios ( $c2)? )
						{
						Tree root_2 = (Tree)adaptor.nil();
						dbg.location(124,154);
						root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);
						dbg.location(124,167);
						// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:124:167: ( $c2)?
						if ( stream_c2.hasNext() ) {
							dbg.location(124,167);
							adaptor.addChild(root_2, stream_c2.nextTree());
						}
						stream_c2.reset();

						adaptor.addChild(root_1, root_2);
						}
						dbg.location(124,172);
						adaptor.addChild(root_1, stream_expressao.nextTree());dbg.location(124,182);
						// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:124:182: ^( Comentarios ( $c3)? )
						{
						Tree root_2 = (Tree)adaptor.nil();
						dbg.location(124,184);
						root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);
						dbg.location(124,197);
						// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:124:197: ( $c3)?
						if ( stream_c3.hasNext() ) {
							dbg.location(124,197);
							adaptor.addChild(root_2, stream_c3.nextTree());
						}
						stream_c3.reset();

						adaptor.addChild(root_1, root_2);
						}
						dbg.location(124,202);
						// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:124:202: ^( Comentarios ( $c4)? )
						{
						Tree root_2 = (Tree)adaptor.nil();
						dbg.location(124,204);
						root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);
						dbg.location(124,217);
						// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:124:217: ( $c4)?
						if ( stream_c4.hasNext() ) {
							dbg.location(124,217);
							adaptor.addChild(root_2, stream_c4.nextTree());
						}
						stream_c4.reset();

						adaptor.addChild(root_1, root_2);
						}
						dbg.location(124,222);
						adaptor.addChild(root_1, stream_condicao.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:125:7: 
					{
					// AST REWRITE
					// elements: condicao_ou
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Tree)adaptor.nil();
					// 125:7: -> condicao_ou
					{
						dbg.location(125,10);
						adaptor.addChild(root_0, stream_condicao_ou.nextTree());
					}


					retval.tree = root_0;

					}
					break;

			}
			} finally {dbg.exitSubRule(17);}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(127, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "condicao");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "condicao"


	public static class condicao_ou_return extends ParserRuleReturnScope {
		Tree tree;
		@Override
		public Tree getTree() { return tree; }
	};


	// $ANTLR start "condicao_ou"
	// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:129:1: condicao_ou : ( condicao_e -> condicao_e ) (c1= comentarios '||' c2= comentarios c= condicao_e -> ^( Ou $condicao_ou ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) $c) )* ;
	public final iParser.condicao_ou_return condicao_ou() throws  {
		iParser.condicao_ou_return retval = new iParser.condicao_ou_return();
		retval.start = input.LT(1);

		Tree root_0 = null;

		Token string_literal100=null;
		ParserRuleReturnScope c1 =null;
		ParserRuleReturnScope c2 =null;
		ParserRuleReturnScope c =null;
		ParserRuleReturnScope condicao_e99 =null;

		Tree string_literal100_tree=null;
		RewriteRuleTokenStream stream_122=new RewriteRuleTokenStream(adaptor,"token 122");
		RewriteRuleSubtreeStream stream_condicao_e=new RewriteRuleSubtreeStream(adaptor,"rule condicao_e");
		RewriteRuleSubtreeStream stream_comentarios=new RewriteRuleSubtreeStream(adaptor,"rule comentarios");

		try { dbg.enterRule(getGrammarFileName(), "condicao_ou");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(129, 0);

		try {
			// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:129:13: ( ( condicao_e -> condicao_e ) (c1= comentarios '||' c2= comentarios c= condicao_e -> ^( Ou $condicao_ou ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) $c) )* )
			dbg.enterAlt(1);

			// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:130:2: ( condicao_e -> condicao_e ) (c1= comentarios '||' c2= comentarios c= condicao_e -> ^( Ou $condicao_ou ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) $c) )*
			{
			dbg.location(130,2);
			// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:130:2: ( condicao_e -> condicao_e )
			dbg.enterAlt(1);

			// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:130:3: condicao_e
			{
			dbg.location(130,3);
			pushFollow(FOLLOW_condicao_e_in_condicao_ou1776);
			condicao_e99=condicao_e();
			state._fsp--;

			stream_condicao_e.add(condicao_e99.getTree());
			// AST REWRITE
			// elements: condicao_e
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Tree)adaptor.nil();
			// 130:14: -> condicao_e
			{
				dbg.location(130,17);
				adaptor.addChild(root_0, stream_condicao_e.nextTree());
			}


			retval.tree = root_0;

			}
			dbg.location(130,29);
			// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:130:29: (c1= comentarios '||' c2= comentarios c= condicao_e -> ^( Ou $condicao_ou ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) $c) )*
			try { dbg.enterSubRule(18);

			loop18:
			while (true) {
				int alt18=2;
				try { dbg.enterDecision(18, decisionCanBacktrack[18]);

				try {
					isCyclicDecision = true;
					alt18 = dfa18.predict(input);
				}
				catch (NoViableAltException nvae) {
					dbg.recognitionException(nvae);
					throw nvae;
				}
				} finally {dbg.exitDecision(18);}

				switch (alt18) {
				case 1 :
					dbg.enterAlt(1);

					// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:130:31: c1= comentarios '||' c2= comentarios c= condicao_e
					{
					dbg.location(130,33);
					pushFollow(FOLLOW_comentarios_in_condicao_ou1787);
					c1=comentarios();
					state._fsp--;

					stream_comentarios.add(c1.getTree());dbg.location(130,46);
					string_literal100=(Token)match(input,122,FOLLOW_122_in_condicao_ou1789);  
					stream_122.add(string_literal100);
					dbg.location(130,53);
					pushFollow(FOLLOW_comentarios_in_condicao_ou1793);
					c2=comentarios();
					state._fsp--;

					stream_comentarios.add(c2.getTree());dbg.location(130,67);
					pushFollow(FOLLOW_condicao_e_in_condicao_ou1797);
					c=condicao_e();
					state._fsp--;

					stream_condicao_e.add(c.getTree());
					// AST REWRITE
					// elements: condicao_ou, c2, c, c1
					// token labels: 
					// rule labels: retval, c1, c, c2
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_c1=new RewriteRuleSubtreeStream(adaptor,"rule c1",c1!=null?c1.getTree():null);
					RewriteRuleSubtreeStream stream_c=new RewriteRuleSubtreeStream(adaptor,"rule c",c!=null?c.getTree():null);
					RewriteRuleSubtreeStream stream_c2=new RewriteRuleSubtreeStream(adaptor,"rule c2",c2!=null?c2.getTree():null);

					root_0 = (Tree)adaptor.nil();
					// 130:79: -> ^( Ou $condicao_ou ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) $c)
					{
						dbg.location(130,82);
						// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:130:82: ^( Ou $condicao_ou ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) $c)
						{
						Tree root_1 = (Tree)adaptor.nil();
						dbg.location(130,84);
						root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Ou, "Ou"), root_1);
						dbg.location(130,88);
						adaptor.addChild(root_1, stream_retval.nextTree());dbg.location(130,100);
						// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:130:100: ^( Comentarios ( $c1)? )
						{
						Tree root_2 = (Tree)adaptor.nil();
						dbg.location(130,102);
						root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);
						dbg.location(130,115);
						// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:130:115: ( $c1)?
						if ( stream_c1.hasNext() ) {
							dbg.location(130,115);
							adaptor.addChild(root_2, stream_c1.nextTree());
						}
						stream_c1.reset();

						adaptor.addChild(root_1, root_2);
						}
						dbg.location(130,120);
						// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:130:120: ^( Comentarios ( $c2)? )
						{
						Tree root_2 = (Tree)adaptor.nil();
						dbg.location(130,122);
						root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);
						dbg.location(130,135);
						// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:130:135: ( $c2)?
						if ( stream_c2.hasNext() ) {
							dbg.location(130,135);
							adaptor.addChild(root_2, stream_c2.nextTree());
						}
						stream_c2.reset();

						adaptor.addChild(root_1, root_2);
						}
						dbg.location(130,141);
						adaptor.addChild(root_1, stream_c.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

				default :
					break loop18;
				}
			}
			} finally {dbg.exitSubRule(18);}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(131, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "condicao_ou");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "condicao_ou"


	public static class condicao_e_return extends ParserRuleReturnScope {
		Tree tree;
		@Override
		public Tree getTree() { return tree; }
	};


	// $ANTLR start "condicao_e"
	// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:133:1: condicao_e : ( condicao_comparacao -> condicao_comparacao ) (c1= comentarios '&&' c2= comentarios c= condicao_comparacao -> ^( E $condicao_e ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) $c) )* ;
	public final iParser.condicao_e_return condicao_e() throws  {
		iParser.condicao_e_return retval = new iParser.condicao_e_return();
		retval.start = input.LT(1);

		Tree root_0 = null;

		Token string_literal102=null;
		ParserRuleReturnScope c1 =null;
		ParserRuleReturnScope c2 =null;
		ParserRuleReturnScope c =null;
		ParserRuleReturnScope condicao_comparacao101 =null;

		Tree string_literal102_tree=null;
		RewriteRuleTokenStream stream_84=new RewriteRuleTokenStream(adaptor,"token 84");
		RewriteRuleSubtreeStream stream_comentarios=new RewriteRuleSubtreeStream(adaptor,"rule comentarios");
		RewriteRuleSubtreeStream stream_condicao_comparacao=new RewriteRuleSubtreeStream(adaptor,"rule condicao_comparacao");

		try { dbg.enterRule(getGrammarFileName(), "condicao_e");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(133, 0);

		try {
			// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:133:12: ( ( condicao_comparacao -> condicao_comparacao ) (c1= comentarios '&&' c2= comentarios c= condicao_comparacao -> ^( E $condicao_e ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) $c) )* )
			dbg.enterAlt(1);

			// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:134:2: ( condicao_comparacao -> condicao_comparacao ) (c1= comentarios '&&' c2= comentarios c= condicao_comparacao -> ^( E $condicao_e ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) $c) )*
			{
			dbg.location(134,2);
			// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:134:2: ( condicao_comparacao -> condicao_comparacao )
			dbg.enterAlt(1);

			// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:134:3: condicao_comparacao
			{
			dbg.location(134,3);
			pushFollow(FOLLOW_condicao_comparacao_in_condicao_e1842);
			condicao_comparacao101=condicao_comparacao();
			state._fsp--;

			stream_condicao_comparacao.add(condicao_comparacao101.getTree());
			// AST REWRITE
			// elements: condicao_comparacao
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Tree)adaptor.nil();
			// 134:23: -> condicao_comparacao
			{
				dbg.location(134,26);
				adaptor.addChild(root_0, stream_condicao_comparacao.nextTree());
			}


			retval.tree = root_0;

			}
			dbg.location(134,47);
			// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:134:47: (c1= comentarios '&&' c2= comentarios c= condicao_comparacao -> ^( E $condicao_e ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) $c) )*
			try { dbg.enterSubRule(19);

			loop19:
			while (true) {
				int alt19=2;
				try { dbg.enterDecision(19, decisionCanBacktrack[19]);

				try {
					isCyclicDecision = true;
					alt19 = dfa19.predict(input);
				}
				catch (NoViableAltException nvae) {
					dbg.recognitionException(nvae);
					throw nvae;
				}
				} finally {dbg.exitDecision(19);}

				switch (alt19) {
				case 1 :
					dbg.enterAlt(1);

					// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:134:49: c1= comentarios '&&' c2= comentarios c= condicao_comparacao
					{
					dbg.location(134,51);
					pushFollow(FOLLOW_comentarios_in_condicao_e1853);
					c1=comentarios();
					state._fsp--;

					stream_comentarios.add(c1.getTree());dbg.location(134,64);
					string_literal102=(Token)match(input,84,FOLLOW_84_in_condicao_e1855);  
					stream_84.add(string_literal102);
					dbg.location(134,71);
					pushFollow(FOLLOW_comentarios_in_condicao_e1859);
					c2=comentarios();
					state._fsp--;

					stream_comentarios.add(c2.getTree());dbg.location(134,85);
					pushFollow(FOLLOW_condicao_comparacao_in_condicao_e1863);
					c=condicao_comparacao();
					state._fsp--;

					stream_condicao_comparacao.add(c.getTree());
					// AST REWRITE
					// elements: c1, condicao_e, c, c2
					// token labels: 
					// rule labels: retval, c1, c2, c
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_c1=new RewriteRuleSubtreeStream(adaptor,"rule c1",c1!=null?c1.getTree():null);
					RewriteRuleSubtreeStream stream_c2=new RewriteRuleSubtreeStream(adaptor,"rule c2",c2!=null?c2.getTree():null);
					RewriteRuleSubtreeStream stream_c=new RewriteRuleSubtreeStream(adaptor,"rule c",c!=null?c.getTree():null);

					root_0 = (Tree)adaptor.nil();
					// 134:106: -> ^( E $condicao_e ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) $c)
					{
						dbg.location(134,109);
						// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:134:109: ^( E $condicao_e ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) $c)
						{
						Tree root_1 = (Tree)adaptor.nil();
						dbg.location(134,111);
						root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(E, "E"), root_1);
						dbg.location(134,114);
						adaptor.addChild(root_1, stream_retval.nextTree());dbg.location(134,125);
						// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:134:125: ^( Comentarios ( $c1)? )
						{
						Tree root_2 = (Tree)adaptor.nil();
						dbg.location(134,127);
						root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);
						dbg.location(134,140);
						// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:134:140: ( $c1)?
						if ( stream_c1.hasNext() ) {
							dbg.location(134,140);
							adaptor.addChild(root_2, stream_c1.nextTree());
						}
						stream_c1.reset();

						adaptor.addChild(root_1, root_2);
						}
						dbg.location(134,145);
						// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:134:145: ^( Comentarios ( $c2)? )
						{
						Tree root_2 = (Tree)adaptor.nil();
						dbg.location(134,147);
						root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);
						dbg.location(134,160);
						// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:134:160: ( $c2)?
						if ( stream_c2.hasNext() ) {
							dbg.location(134,160);
							adaptor.addChild(root_2, stream_c2.nextTree());
						}
						stream_c2.reset();

						adaptor.addChild(root_1, root_2);
						}
						dbg.location(134,166);
						adaptor.addChild(root_1, stream_c.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

				default :
					break loop19;
				}
			}
			} finally {dbg.exitSubRule(19);}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(135, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "condicao_e");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "condicao_e"


	public static class condicao_comparacao_return extends ParserRuleReturnScope {
		Tree tree;
		@Override
		public Tree getTree() { return tree; }
	};


	// $ANTLR start "condicao_comparacao"
	// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:137:1: condicao_comparacao : ( condicao_igualdade -> condicao_igualdade ) (c1= comentarios ( '>' c2= comentarios c= condicao_igualdade -> ^( Comp $condicao_comparacao ^( Comentarios ( $c1)? ) ^( Maior ) ^( Comentarios ( $c2)? ) $c) | '<' c2= comentarios c= condicao_igualdade -> ^( Comp $condicao_comparacao ^( Comentarios ( $c1)? ) ^( Menor ) ^( Comentarios ( $c2)? ) $c) | '>=' c2= comentarios c= condicao_igualdade -> ^( Comp $condicao_comparacao ^( Comentarios ( $c1)? ) ^( MaiorQ ) ^( Comentarios ( $c2)? ) $c) | '<=' c2= comentarios c= condicao_igualdade -> ^( Comp $condicao_comparacao ^( Comentarios ( $c1)? ) ^( MenorQ ) ^( Comentarios ( $c2)? ) $c) ) )* ;
	public final iParser.condicao_comparacao_return condicao_comparacao() throws  {
		iParser.condicao_comparacao_return retval = new iParser.condicao_comparacao_return();
		retval.start = input.LT(1);

		Tree root_0 = null;

		Token char_literal104=null;
		Token char_literal105=null;
		Token string_literal106=null;
		Token string_literal107=null;
		ParserRuleReturnScope c1 =null;
		ParserRuleReturnScope c2 =null;
		ParserRuleReturnScope c =null;
		ParserRuleReturnScope condicao_igualdade103 =null;

		Tree char_literal104_tree=null;
		Tree char_literal105_tree=null;
		Tree string_literal106_tree=null;
		Tree string_literal107_tree=null;
		RewriteRuleTokenStream stream_105=new RewriteRuleTokenStream(adaptor,"token 105");
		RewriteRuleTokenStream stream_104=new RewriteRuleTokenStream(adaptor,"token 104");
		RewriteRuleTokenStream stream_101=new RewriteRuleTokenStream(adaptor,"token 101");
		RewriteRuleTokenStream stream_100=new RewriteRuleTokenStream(adaptor,"token 100");
		RewriteRuleSubtreeStream stream_condicao_igualdade=new RewriteRuleSubtreeStream(adaptor,"rule condicao_igualdade");
		RewriteRuleSubtreeStream stream_comentarios=new RewriteRuleSubtreeStream(adaptor,"rule comentarios");

		try { dbg.enterRule(getGrammarFileName(), "condicao_comparacao");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(137, 0);

		try {
			// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:137:21: ( ( condicao_igualdade -> condicao_igualdade ) (c1= comentarios ( '>' c2= comentarios c= condicao_igualdade -> ^( Comp $condicao_comparacao ^( Comentarios ( $c1)? ) ^( Maior ) ^( Comentarios ( $c2)? ) $c) | '<' c2= comentarios c= condicao_igualdade -> ^( Comp $condicao_comparacao ^( Comentarios ( $c1)? ) ^( Menor ) ^( Comentarios ( $c2)? ) $c) | '>=' c2= comentarios c= condicao_igualdade -> ^( Comp $condicao_comparacao ^( Comentarios ( $c1)? ) ^( MaiorQ ) ^( Comentarios ( $c2)? ) $c) | '<=' c2= comentarios c= condicao_igualdade -> ^( Comp $condicao_comparacao ^( Comentarios ( $c1)? ) ^( MenorQ ) ^( Comentarios ( $c2)? ) $c) ) )* )
			dbg.enterAlt(1);

			// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:138:2: ( condicao_igualdade -> condicao_igualdade ) (c1= comentarios ( '>' c2= comentarios c= condicao_igualdade -> ^( Comp $condicao_comparacao ^( Comentarios ( $c1)? ) ^( Maior ) ^( Comentarios ( $c2)? ) $c) | '<' c2= comentarios c= condicao_igualdade -> ^( Comp $condicao_comparacao ^( Comentarios ( $c1)? ) ^( Menor ) ^( Comentarios ( $c2)? ) $c) | '>=' c2= comentarios c= condicao_igualdade -> ^( Comp $condicao_comparacao ^( Comentarios ( $c1)? ) ^( MaiorQ ) ^( Comentarios ( $c2)? ) $c) | '<=' c2= comentarios c= condicao_igualdade -> ^( Comp $condicao_comparacao ^( Comentarios ( $c1)? ) ^( MenorQ ) ^( Comentarios ( $c2)? ) $c) ) )*
			{
			dbg.location(138,2);
			// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:138:2: ( condicao_igualdade -> condicao_igualdade )
			dbg.enterAlt(1);

			// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:138:3: condicao_igualdade
			{
			dbg.location(138,3);
			pushFollow(FOLLOW_condicao_igualdade_in_condicao_comparacao1908);
			condicao_igualdade103=condicao_igualdade();
			state._fsp--;

			stream_condicao_igualdade.add(condicao_igualdade103.getTree());
			// AST REWRITE
			// elements: condicao_igualdade
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Tree)adaptor.nil();
			// 138:22: -> condicao_igualdade
			{
				dbg.location(138,25);
				adaptor.addChild(root_0, stream_condicao_igualdade.nextTree());
			}


			retval.tree = root_0;

			}
			dbg.location(138,46);
			// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:138:46: (c1= comentarios ( '>' c2= comentarios c= condicao_igualdade -> ^( Comp $condicao_comparacao ^( Comentarios ( $c1)? ) ^( Maior ) ^( Comentarios ( $c2)? ) $c) | '<' c2= comentarios c= condicao_igualdade -> ^( Comp $condicao_comparacao ^( Comentarios ( $c1)? ) ^( Menor ) ^( Comentarios ( $c2)? ) $c) | '>=' c2= comentarios c= condicao_igualdade -> ^( Comp $condicao_comparacao ^( Comentarios ( $c1)? ) ^( MaiorQ ) ^( Comentarios ( $c2)? ) $c) | '<=' c2= comentarios c= condicao_igualdade -> ^( Comp $condicao_comparacao ^( Comentarios ( $c1)? ) ^( MenorQ ) ^( Comentarios ( $c2)? ) $c) ) )*
			try { dbg.enterSubRule(21);

			loop21:
			while (true) {
				int alt21=2;
				try { dbg.enterDecision(21, decisionCanBacktrack[21]);

				try {
					isCyclicDecision = true;
					alt21 = dfa21.predict(input);
				}
				catch (NoViableAltException nvae) {
					dbg.recognitionException(nvae);
					throw nvae;
				}
				} finally {dbg.exitDecision(21);}

				switch (alt21) {
				case 1 :
					dbg.enterAlt(1);

					// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:138:48: c1= comentarios ( '>' c2= comentarios c= condicao_igualdade -> ^( Comp $condicao_comparacao ^( Comentarios ( $c1)? ) ^( Maior ) ^( Comentarios ( $c2)? ) $c) | '<' c2= comentarios c= condicao_igualdade -> ^( Comp $condicao_comparacao ^( Comentarios ( $c1)? ) ^( Menor ) ^( Comentarios ( $c2)? ) $c) | '>=' c2= comentarios c= condicao_igualdade -> ^( Comp $condicao_comparacao ^( Comentarios ( $c1)? ) ^( MaiorQ ) ^( Comentarios ( $c2)? ) $c) | '<=' c2= comentarios c= condicao_igualdade -> ^( Comp $condicao_comparacao ^( Comentarios ( $c1)? ) ^( MenorQ ) ^( Comentarios ( $c2)? ) $c) )
					{
					dbg.location(138,50);
					pushFollow(FOLLOW_comentarios_in_condicao_comparacao1920);
					c1=comentarios();
					state._fsp--;

					stream_comentarios.add(c1.getTree());dbg.location(138,63);
					// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:138:63: ( '>' c2= comentarios c= condicao_igualdade -> ^( Comp $condicao_comparacao ^( Comentarios ( $c1)? ) ^( Maior ) ^( Comentarios ( $c2)? ) $c) | '<' c2= comentarios c= condicao_igualdade -> ^( Comp $condicao_comparacao ^( Comentarios ( $c1)? ) ^( Menor ) ^( Comentarios ( $c2)? ) $c) | '>=' c2= comentarios c= condicao_igualdade -> ^( Comp $condicao_comparacao ^( Comentarios ( $c1)? ) ^( MaiorQ ) ^( Comentarios ( $c2)? ) $c) | '<=' c2= comentarios c= condicao_igualdade -> ^( Comp $condicao_comparacao ^( Comentarios ( $c1)? ) ^( MenorQ ) ^( Comentarios ( $c2)? ) $c) )
					int alt20=4;
					try { dbg.enterSubRule(20);
					try { dbg.enterDecision(20, decisionCanBacktrack[20]);

					switch ( input.LA(1) ) {
					case 104:
						{
						alt20=1;
						}
						break;
					case 100:
						{
						alt20=2;
						}
						break;
					case 105:
						{
						alt20=3;
						}
						break;
					case 101:
						{
						alt20=4;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 20, 0, input);
						dbg.recognitionException(nvae);
						throw nvae;
					}
					} finally {dbg.exitDecision(20);}

					switch (alt20) {
						case 1 :
							dbg.enterAlt(1);

							// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:138:65: '>' c2= comentarios c= condicao_igualdade
							{
							dbg.location(138,65);
							char_literal104=(Token)match(input,104,FOLLOW_104_in_condicao_comparacao1924);  
							stream_104.add(char_literal104);
							dbg.location(138,71);
							pushFollow(FOLLOW_comentarios_in_condicao_comparacao1928);
							c2=comentarios();
							state._fsp--;

							stream_comentarios.add(c2.getTree());dbg.location(138,85);
							pushFollow(FOLLOW_condicao_igualdade_in_condicao_comparacao1932);
							c=condicao_igualdade();
							state._fsp--;

							stream_condicao_igualdade.add(c.getTree());
							// AST REWRITE
							// elements: condicao_comparacao, c2, c1, c
							// token labels: 
							// rule labels: retval, c1, c, c2
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
							RewriteRuleSubtreeStream stream_c1=new RewriteRuleSubtreeStream(adaptor,"rule c1",c1!=null?c1.getTree():null);
							RewriteRuleSubtreeStream stream_c=new RewriteRuleSubtreeStream(adaptor,"rule c",c!=null?c.getTree():null);
							RewriteRuleSubtreeStream stream_c2=new RewriteRuleSubtreeStream(adaptor,"rule c2",c2!=null?c2.getTree():null);

							root_0 = (Tree)adaptor.nil();
							// 138:105: -> ^( Comp $condicao_comparacao ^( Comentarios ( $c1)? ) ^( Maior ) ^( Comentarios ( $c2)? ) $c)
							{
								dbg.location(138,108);
								// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:138:108: ^( Comp $condicao_comparacao ^( Comentarios ( $c1)? ) ^( Maior ) ^( Comentarios ( $c2)? ) $c)
								{
								Tree root_1 = (Tree)adaptor.nil();
								dbg.location(138,110);
								root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comp, "Comp"), root_1);
								dbg.location(138,116);
								adaptor.addChild(root_1, stream_retval.nextTree());dbg.location(138,136);
								// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:138:136: ^( Comentarios ( $c1)? )
								{
								Tree root_2 = (Tree)adaptor.nil();
								dbg.location(138,138);
								root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);
								dbg.location(138,151);
								// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:138:151: ( $c1)?
								if ( stream_c1.hasNext() ) {
									dbg.location(138,151);
									adaptor.addChild(root_2, stream_c1.nextTree());
								}
								stream_c1.reset();

								adaptor.addChild(root_1, root_2);
								}
								dbg.location(138,156);
								// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:138:156: ^( Maior )
								{
								Tree root_2 = (Tree)adaptor.nil();
								dbg.location(138,158);
								root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Maior, "Maior"), root_2);
								adaptor.addChild(root_1, root_2);
								}
								dbg.location(138,165);
								// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:138:165: ^( Comentarios ( $c2)? )
								{
								Tree root_2 = (Tree)adaptor.nil();
								dbg.location(138,167);
								root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);
								dbg.location(138,180);
								// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:138:180: ( $c2)?
								if ( stream_c2.hasNext() ) {
									dbg.location(138,180);
									adaptor.addChild(root_2, stream_c2.nextTree());
								}
								stream_c2.reset();

								adaptor.addChild(root_1, root_2);
								}
								dbg.location(138,186);
								adaptor.addChild(root_1, stream_c.nextTree());
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:139:20: '<' c2= comentarios c= condicao_igualdade
							{
							dbg.location(139,20);
							char_literal105=(Token)match(input,100,FOLLOW_100_in_condicao_comparacao1986);  
							stream_100.add(char_literal105);
							dbg.location(139,26);
							pushFollow(FOLLOW_comentarios_in_condicao_comparacao1990);
							c2=comentarios();
							state._fsp--;

							stream_comentarios.add(c2.getTree());dbg.location(139,40);
							pushFollow(FOLLOW_condicao_igualdade_in_condicao_comparacao1994);
							c=condicao_igualdade();
							state._fsp--;

							stream_condicao_igualdade.add(c.getTree());
							// AST REWRITE
							// elements: c1, condicao_comparacao, c2, c
							// token labels: 
							// rule labels: retval, c1, c, c2
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
							RewriteRuleSubtreeStream stream_c1=new RewriteRuleSubtreeStream(adaptor,"rule c1",c1!=null?c1.getTree():null);
							RewriteRuleSubtreeStream stream_c=new RewriteRuleSubtreeStream(adaptor,"rule c",c!=null?c.getTree():null);
							RewriteRuleSubtreeStream stream_c2=new RewriteRuleSubtreeStream(adaptor,"rule c2",c2!=null?c2.getTree():null);

							root_0 = (Tree)adaptor.nil();
							// 139:60: -> ^( Comp $condicao_comparacao ^( Comentarios ( $c1)? ) ^( Menor ) ^( Comentarios ( $c2)? ) $c)
							{
								dbg.location(139,63);
								// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:139:63: ^( Comp $condicao_comparacao ^( Comentarios ( $c1)? ) ^( Menor ) ^( Comentarios ( $c2)? ) $c)
								{
								Tree root_1 = (Tree)adaptor.nil();
								dbg.location(139,65);
								root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comp, "Comp"), root_1);
								dbg.location(139,71);
								adaptor.addChild(root_1, stream_retval.nextTree());dbg.location(139,91);
								// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:139:91: ^( Comentarios ( $c1)? )
								{
								Tree root_2 = (Tree)adaptor.nil();
								dbg.location(139,93);
								root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);
								dbg.location(139,106);
								// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:139:106: ( $c1)?
								if ( stream_c1.hasNext() ) {
									dbg.location(139,106);
									adaptor.addChild(root_2, stream_c1.nextTree());
								}
								stream_c1.reset();

								adaptor.addChild(root_1, root_2);
								}
								dbg.location(139,111);
								// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:139:111: ^( Menor )
								{
								Tree root_2 = (Tree)adaptor.nil();
								dbg.location(139,113);
								root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Menor, "Menor"), root_2);
								adaptor.addChild(root_1, root_2);
								}
								dbg.location(139,120);
								// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:139:120: ^( Comentarios ( $c2)? )
								{
								Tree root_2 = (Tree)adaptor.nil();
								dbg.location(139,122);
								root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);
								dbg.location(139,135);
								// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:139:135: ( $c2)?
								if ( stream_c2.hasNext() ) {
									dbg.location(139,135);
									adaptor.addChild(root_2, stream_c2.nextTree());
								}
								stream_c2.reset();

								adaptor.addChild(root_1, root_2);
								}
								dbg.location(139,141);
								adaptor.addChild(root_1, stream_c.nextTree());
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;
						case 3 :
							dbg.enterAlt(3);

							// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:140:20: '>=' c2= comentarios c= condicao_igualdade
							{
							dbg.location(140,20);
							string_literal106=(Token)match(input,105,FOLLOW_105_in_condicao_comparacao2048);  
							stream_105.add(string_literal106);
							dbg.location(140,27);
							pushFollow(FOLLOW_comentarios_in_condicao_comparacao2052);
							c2=comentarios();
							state._fsp--;

							stream_comentarios.add(c2.getTree());dbg.location(140,41);
							pushFollow(FOLLOW_condicao_igualdade_in_condicao_comparacao2056);
							c=condicao_igualdade();
							state._fsp--;

							stream_condicao_igualdade.add(c.getTree());
							// AST REWRITE
							// elements: c, c1, condicao_comparacao, c2
							// token labels: 
							// rule labels: retval, c1, c2, c
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
							RewriteRuleSubtreeStream stream_c1=new RewriteRuleSubtreeStream(adaptor,"rule c1",c1!=null?c1.getTree():null);
							RewriteRuleSubtreeStream stream_c2=new RewriteRuleSubtreeStream(adaptor,"rule c2",c2!=null?c2.getTree():null);
							RewriteRuleSubtreeStream stream_c=new RewriteRuleSubtreeStream(adaptor,"rule c",c!=null?c.getTree():null);

							root_0 = (Tree)adaptor.nil();
							// 140:61: -> ^( Comp $condicao_comparacao ^( Comentarios ( $c1)? ) ^( MaiorQ ) ^( Comentarios ( $c2)? ) $c)
							{
								dbg.location(140,64);
								// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:140:64: ^( Comp $condicao_comparacao ^( Comentarios ( $c1)? ) ^( MaiorQ ) ^( Comentarios ( $c2)? ) $c)
								{
								Tree root_1 = (Tree)adaptor.nil();
								dbg.location(140,66);
								root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comp, "Comp"), root_1);
								dbg.location(140,72);
								adaptor.addChild(root_1, stream_retval.nextTree());dbg.location(140,92);
								// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:140:92: ^( Comentarios ( $c1)? )
								{
								Tree root_2 = (Tree)adaptor.nil();
								dbg.location(140,94);
								root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);
								dbg.location(140,107);
								// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:140:107: ( $c1)?
								if ( stream_c1.hasNext() ) {
									dbg.location(140,107);
									adaptor.addChild(root_2, stream_c1.nextTree());
								}
								stream_c1.reset();

								adaptor.addChild(root_1, root_2);
								}
								dbg.location(140,112);
								// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:140:112: ^( MaiorQ )
								{
								Tree root_2 = (Tree)adaptor.nil();
								dbg.location(140,114);
								root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(MaiorQ, "MaiorQ"), root_2);
								adaptor.addChild(root_1, root_2);
								}
								dbg.location(140,122);
								// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:140:122: ^( Comentarios ( $c2)? )
								{
								Tree root_2 = (Tree)adaptor.nil();
								dbg.location(140,124);
								root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);
								dbg.location(140,137);
								// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:140:137: ( $c2)?
								if ( stream_c2.hasNext() ) {
									dbg.location(140,137);
									adaptor.addChild(root_2, stream_c2.nextTree());
								}
								stream_c2.reset();

								adaptor.addChild(root_1, root_2);
								}
								dbg.location(140,143);
								adaptor.addChild(root_1, stream_c.nextTree());
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;
						case 4 :
							dbg.enterAlt(4);

							// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:141:20: '<=' c2= comentarios c= condicao_igualdade
							{
							dbg.location(141,20);
							string_literal107=(Token)match(input,101,FOLLOW_101_in_condicao_comparacao2110);  
							stream_101.add(string_literal107);
							dbg.location(141,27);
							pushFollow(FOLLOW_comentarios_in_condicao_comparacao2114);
							c2=comentarios();
							state._fsp--;

							stream_comentarios.add(c2.getTree());dbg.location(141,41);
							pushFollow(FOLLOW_condicao_igualdade_in_condicao_comparacao2118);
							c=condicao_igualdade();
							state._fsp--;

							stream_condicao_igualdade.add(c.getTree());
							// AST REWRITE
							// elements: c1, c, c2, condicao_comparacao
							// token labels: 
							// rule labels: retval, c1, c2, c
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
							RewriteRuleSubtreeStream stream_c1=new RewriteRuleSubtreeStream(adaptor,"rule c1",c1!=null?c1.getTree():null);
							RewriteRuleSubtreeStream stream_c2=new RewriteRuleSubtreeStream(adaptor,"rule c2",c2!=null?c2.getTree():null);
							RewriteRuleSubtreeStream stream_c=new RewriteRuleSubtreeStream(adaptor,"rule c",c!=null?c.getTree():null);

							root_0 = (Tree)adaptor.nil();
							// 141:61: -> ^( Comp $condicao_comparacao ^( Comentarios ( $c1)? ) ^( MenorQ ) ^( Comentarios ( $c2)? ) $c)
							{
								dbg.location(141,64);
								// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:141:64: ^( Comp $condicao_comparacao ^( Comentarios ( $c1)? ) ^( MenorQ ) ^( Comentarios ( $c2)? ) $c)
								{
								Tree root_1 = (Tree)adaptor.nil();
								dbg.location(141,66);
								root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comp, "Comp"), root_1);
								dbg.location(141,72);
								adaptor.addChild(root_1, stream_retval.nextTree());dbg.location(141,92);
								// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:141:92: ^( Comentarios ( $c1)? )
								{
								Tree root_2 = (Tree)adaptor.nil();
								dbg.location(141,94);
								root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);
								dbg.location(141,107);
								// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:141:107: ( $c1)?
								if ( stream_c1.hasNext() ) {
									dbg.location(141,107);
									adaptor.addChild(root_2, stream_c1.nextTree());
								}
								stream_c1.reset();

								adaptor.addChild(root_1, root_2);
								}
								dbg.location(141,112);
								// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:141:112: ^( MenorQ )
								{
								Tree root_2 = (Tree)adaptor.nil();
								dbg.location(141,114);
								root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(MenorQ, "MenorQ"), root_2);
								adaptor.addChild(root_1, root_2);
								}
								dbg.location(141,122);
								// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:141:122: ^( Comentarios ( $c2)? )
								{
								Tree root_2 = (Tree)adaptor.nil();
								dbg.location(141,124);
								root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);
								dbg.location(141,137);
								// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:141:137: ( $c2)?
								if ( stream_c2.hasNext() ) {
									dbg.location(141,137);
									adaptor.addChild(root_2, stream_c2.nextTree());
								}
								stream_c2.reset();

								adaptor.addChild(root_1, root_2);
								}
								dbg.location(141,143);
								adaptor.addChild(root_1, stream_c.nextTree());
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;

					}
					} finally {dbg.exitSubRule(20);}

					}
					break;

				default :
					break loop21;
				}
			}
			} finally {dbg.exitSubRule(21);}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(144, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "condicao_comparacao");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "condicao_comparacao"


	public static class condicao_igualdade_return extends ParserRuleReturnScope {
		Tree tree;
		@Override
		public Tree getTree() { return tree; }
	};


	// $ANTLR start "condicao_igualdade"
	// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:146:1: condicao_igualdade : ( expressao -> expressao ) (c1= comentarios ( '!=' c2= comentarios e= expressao -> ^( Comp $condicao_igualdade ^( Comentarios ( $c1)? ) ^( Dif ) ^( Comentarios ( $c2)? ) $e) | '==' c2= comentarios e= expressao -> ^( Comp $condicao_igualdade ^( Comentarios ( $c2)? ) ^( Igual ) ^( Comentarios ( $c2)? ) $e) ) )* ;
	public final iParser.condicao_igualdade_return condicao_igualdade() throws  {
		iParser.condicao_igualdade_return retval = new iParser.condicao_igualdade_return();
		retval.start = input.LT(1);

		Tree root_0 = null;

		Token string_literal109=null;
		Token string_literal110=null;
		ParserRuleReturnScope c1 =null;
		ParserRuleReturnScope c2 =null;
		ParserRuleReturnScope e =null;
		ParserRuleReturnScope expressao108 =null;

		Tree string_literal109_tree=null;
		Tree string_literal110_tree=null;
		RewriteRuleTokenStream stream_82=new RewriteRuleTokenStream(adaptor,"token 82");
		RewriteRuleTokenStream stream_103=new RewriteRuleTokenStream(adaptor,"token 103");
		RewriteRuleSubtreeStream stream_comentarios=new RewriteRuleSubtreeStream(adaptor,"rule comentarios");
		RewriteRuleSubtreeStream stream_expressao=new RewriteRuleSubtreeStream(adaptor,"rule expressao");

		try { dbg.enterRule(getGrammarFileName(), "condicao_igualdade");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(146, 0);

		try {
			// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:146:20: ( ( expressao -> expressao ) (c1= comentarios ( '!=' c2= comentarios e= expressao -> ^( Comp $condicao_igualdade ^( Comentarios ( $c1)? ) ^( Dif ) ^( Comentarios ( $c2)? ) $e) | '==' c2= comentarios e= expressao -> ^( Comp $condicao_igualdade ^( Comentarios ( $c2)? ) ^( Igual ) ^( Comentarios ( $c2)? ) $e) ) )* )
			dbg.enterAlt(1);

			// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:147:2: ( expressao -> expressao ) (c1= comentarios ( '!=' c2= comentarios e= expressao -> ^( Comp $condicao_igualdade ^( Comentarios ( $c1)? ) ^( Dif ) ^( Comentarios ( $c2)? ) $e) | '==' c2= comentarios e= expressao -> ^( Comp $condicao_igualdade ^( Comentarios ( $c2)? ) ^( Igual ) ^( Comentarios ( $c2)? ) $e) ) )*
			{
			dbg.location(147,2);
			// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:147:2: ( expressao -> expressao )
			dbg.enterAlt(1);

			// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:147:3: expressao
			{
			dbg.location(147,3);
			pushFollow(FOLLOW_expressao_in_condicao_igualdade2198);
			expressao108=expressao();
			state._fsp--;

			stream_expressao.add(expressao108.getTree());
			// AST REWRITE
			// elements: expressao
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Tree)adaptor.nil();
			// 147:13: -> expressao
			{
				dbg.location(147,16);
				adaptor.addChild(root_0, stream_expressao.nextTree());
			}


			retval.tree = root_0;

			}
			dbg.location(147,27);
			// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:147:27: (c1= comentarios ( '!=' c2= comentarios e= expressao -> ^( Comp $condicao_igualdade ^( Comentarios ( $c1)? ) ^( Dif ) ^( Comentarios ( $c2)? ) $e) | '==' c2= comentarios e= expressao -> ^( Comp $condicao_igualdade ^( Comentarios ( $c2)? ) ^( Igual ) ^( Comentarios ( $c2)? ) $e) ) )*
			try { dbg.enterSubRule(23);

			loop23:
			while (true) {
				int alt23=2;
				try { dbg.enterDecision(23, decisionCanBacktrack[23]);

				try {
					isCyclicDecision = true;
					alt23 = dfa23.predict(input);
				}
				catch (NoViableAltException nvae) {
					dbg.recognitionException(nvae);
					throw nvae;
				}
				} finally {dbg.exitDecision(23);}

				switch (alt23) {
				case 1 :
					dbg.enterAlt(1);

					// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:147:29: c1= comentarios ( '!=' c2= comentarios e= expressao -> ^( Comp $condicao_igualdade ^( Comentarios ( $c1)? ) ^( Dif ) ^( Comentarios ( $c2)? ) $e) | '==' c2= comentarios e= expressao -> ^( Comp $condicao_igualdade ^( Comentarios ( $c2)? ) ^( Igual ) ^( Comentarios ( $c2)? ) $e) )
					{
					dbg.location(147,31);
					pushFollow(FOLLOW_comentarios_in_condicao_igualdade2209);
					c1=comentarios();
					state._fsp--;

					stream_comentarios.add(c1.getTree());dbg.location(147,44);
					// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:147:44: ( '!=' c2= comentarios e= expressao -> ^( Comp $condicao_igualdade ^( Comentarios ( $c1)? ) ^( Dif ) ^( Comentarios ( $c2)? ) $e) | '==' c2= comentarios e= expressao -> ^( Comp $condicao_igualdade ^( Comentarios ( $c2)? ) ^( Igual ) ^( Comentarios ( $c2)? ) $e) )
					int alt22=2;
					try { dbg.enterSubRule(22);
					try { dbg.enterDecision(22, decisionCanBacktrack[22]);

					int LA22_0 = input.LA(1);
					if ( (LA22_0==82) ) {
						alt22=1;
					}
					else if ( (LA22_0==103) ) {
						alt22=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 22, 0, input);
						dbg.recognitionException(nvae);
						throw nvae;
					}

					} finally {dbg.exitDecision(22);}

					switch (alt22) {
						case 1 :
							dbg.enterAlt(1);

							// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:147:46: '!=' c2= comentarios e= expressao
							{
							dbg.location(147,46);
							string_literal109=(Token)match(input,82,FOLLOW_82_in_condicao_igualdade2213);  
							stream_82.add(string_literal109);
							dbg.location(147,53);
							pushFollow(FOLLOW_comentarios_in_condicao_igualdade2217);
							c2=comentarios();
							state._fsp--;

							stream_comentarios.add(c2.getTree());dbg.location(147,67);
							pushFollow(FOLLOW_expressao_in_condicao_igualdade2221);
							e=expressao();
							state._fsp--;

							stream_expressao.add(e.getTree());
							// AST REWRITE
							// elements: c1, condicao_igualdade, e, c2
							// token labels: 
							// rule labels: retval, e, c1, c2
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
							RewriteRuleSubtreeStream stream_e=new RewriteRuleSubtreeStream(adaptor,"rule e",e!=null?e.getTree():null);
							RewriteRuleSubtreeStream stream_c1=new RewriteRuleSubtreeStream(adaptor,"rule c1",c1!=null?c1.getTree():null);
							RewriteRuleSubtreeStream stream_c2=new RewriteRuleSubtreeStream(adaptor,"rule c2",c2!=null?c2.getTree():null);

							root_0 = (Tree)adaptor.nil();
							// 147:78: -> ^( Comp $condicao_igualdade ^( Comentarios ( $c1)? ) ^( Dif ) ^( Comentarios ( $c2)? ) $e)
							{
								dbg.location(147,81);
								// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:147:81: ^( Comp $condicao_igualdade ^( Comentarios ( $c1)? ) ^( Dif ) ^( Comentarios ( $c2)? ) $e)
								{
								Tree root_1 = (Tree)adaptor.nil();
								dbg.location(147,83);
								root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comp, "Comp"), root_1);
								dbg.location(147,89);
								adaptor.addChild(root_1, stream_retval.nextTree());dbg.location(147,108);
								// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:147:108: ^( Comentarios ( $c1)? )
								{
								Tree root_2 = (Tree)adaptor.nil();
								dbg.location(147,110);
								root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);
								dbg.location(147,123);
								// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:147:123: ( $c1)?
								if ( stream_c1.hasNext() ) {
									dbg.location(147,123);
									adaptor.addChild(root_2, stream_c1.nextTree());
								}
								stream_c1.reset();

								adaptor.addChild(root_1, root_2);
								}
								dbg.location(147,128);
								// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:147:128: ^( Dif )
								{
								Tree root_2 = (Tree)adaptor.nil();
								dbg.location(147,130);
								root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Dif, "Dif"), root_2);
								adaptor.addChild(root_1, root_2);
								}
								dbg.location(147,135);
								// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:147:135: ^( Comentarios ( $c2)? )
								{
								Tree root_2 = (Tree)adaptor.nil();
								dbg.location(147,137);
								root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);
								dbg.location(147,150);
								// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:147:150: ( $c2)?
								if ( stream_c2.hasNext() ) {
									dbg.location(147,150);
									adaptor.addChild(root_2, stream_c2.nextTree());
								}
								stream_c2.reset();

								adaptor.addChild(root_1, root_2);
								}
								dbg.location(147,156);
								adaptor.addChild(root_1, stream_e.nextTree());
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:148:16: '==' c2= comentarios e= expressao
							{
							dbg.location(148,16);
							string_literal110=(Token)match(input,103,FOLLOW_103_in_condicao_igualdade2271);  
							stream_103.add(string_literal110);
							dbg.location(148,23);
							pushFollow(FOLLOW_comentarios_in_condicao_igualdade2275);
							c2=comentarios();
							state._fsp--;

							stream_comentarios.add(c2.getTree());dbg.location(148,37);
							pushFollow(FOLLOW_expressao_in_condicao_igualdade2279);
							e=expressao();
							state._fsp--;

							stream_expressao.add(e.getTree());
							// AST REWRITE
							// elements: condicao_igualdade, c2, e, c2
							// token labels: 
							// rule labels: retval, e, c2
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
							RewriteRuleSubtreeStream stream_e=new RewriteRuleSubtreeStream(adaptor,"rule e",e!=null?e.getTree():null);
							RewriteRuleSubtreeStream stream_c2=new RewriteRuleSubtreeStream(adaptor,"rule c2",c2!=null?c2.getTree():null);

							root_0 = (Tree)adaptor.nil();
							// 148:48: -> ^( Comp $condicao_igualdade ^( Comentarios ( $c2)? ) ^( Igual ) ^( Comentarios ( $c2)? ) $e)
							{
								dbg.location(148,51);
								// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:148:51: ^( Comp $condicao_igualdade ^( Comentarios ( $c2)? ) ^( Igual ) ^( Comentarios ( $c2)? ) $e)
								{
								Tree root_1 = (Tree)adaptor.nil();
								dbg.location(148,53);
								root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comp, "Comp"), root_1);
								dbg.location(148,59);
								adaptor.addChild(root_1, stream_retval.nextTree());dbg.location(148,78);
								// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:148:78: ^( Comentarios ( $c2)? )
								{
								Tree root_2 = (Tree)adaptor.nil();
								dbg.location(148,80);
								root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);
								dbg.location(148,93);
								// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:148:93: ( $c2)?
								if ( stream_c2.hasNext() ) {
									dbg.location(148,93);
									adaptor.addChild(root_2, stream_c2.nextTree());
								}
								stream_c2.reset();

								adaptor.addChild(root_1, root_2);
								}
								dbg.location(148,98);
								// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:148:98: ^( Igual )
								{
								Tree root_2 = (Tree)adaptor.nil();
								dbg.location(148,100);
								root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Igual, "Igual"), root_2);
								adaptor.addChild(root_1, root_2);
								}
								dbg.location(148,107);
								// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:148:107: ^( Comentarios ( $c2)? )
								{
								Tree root_2 = (Tree)adaptor.nil();
								dbg.location(148,109);
								root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);
								dbg.location(148,122);
								// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:148:122: ( $c2)?
								if ( stream_c2.hasNext() ) {
									dbg.location(148,122);
									adaptor.addChild(root_2, stream_c2.nextTree());
								}
								stream_c2.reset();

								adaptor.addChild(root_1, root_2);
								}
								dbg.location(148,128);
								adaptor.addChild(root_1, stream_e.nextTree());
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;

					}
					} finally {dbg.exitSubRule(22);}

					}
					break;

				default :
					break loop23;
				}
			}
			} finally {dbg.exitSubRule(23);}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(151, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "condicao_igualdade");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "condicao_igualdade"


	public static class atribuicao_return extends ParserRuleReturnScope {
		Tree tree;
		@Override
		public Tree getTree() { return tree; }
	};


	// $ANTLR start "atribuicao"
	// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:155:1: atribuicao : c1= comentarios ID c2= comentarios opAtribuicao c3= comentarios condicao c4= comentarios -> ^( Atribuicao ^( Comentarios ( $c1)? ) ID ^( Comentarios ( $c2)? ) opAtribuicao ^( Comentarios ( $c3)? ) condicao ^( Comentarios ( $c4)? ) ) ;
	public final iParser.atribuicao_return atribuicao() throws  {
		iParser.atribuicao_return retval = new iParser.atribuicao_return();
		retval.start = input.LT(1);

		Tree root_0 = null;

		Token ID111=null;
		ParserRuleReturnScope c1 =null;
		ParserRuleReturnScope c2 =null;
		ParserRuleReturnScope c3 =null;
		ParserRuleReturnScope c4 =null;
		ParserRuleReturnScope opAtribuicao112 =null;
		ParserRuleReturnScope condicao113 =null;

		Tree ID111_tree=null;
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleSubtreeStream stream_comentarios=new RewriteRuleSubtreeStream(adaptor,"rule comentarios");
		RewriteRuleSubtreeStream stream_condicao=new RewriteRuleSubtreeStream(adaptor,"rule condicao");
		RewriteRuleSubtreeStream stream_opAtribuicao=new RewriteRuleSubtreeStream(adaptor,"rule opAtribuicao");

		try { dbg.enterRule(getGrammarFileName(), "atribuicao");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(155, 0);

		try {
			// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:155:12: (c1= comentarios ID c2= comentarios opAtribuicao c3= comentarios condicao c4= comentarios -> ^( Atribuicao ^( Comentarios ( $c1)? ) ID ^( Comentarios ( $c2)? ) opAtribuicao ^( Comentarios ( $c3)? ) condicao ^( Comentarios ( $c4)? ) ) )
			dbg.enterAlt(1);

			// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:156:2: c1= comentarios ID c2= comentarios opAtribuicao c3= comentarios condicao c4= comentarios
			{
			dbg.location(156,4);
			pushFollow(FOLLOW_comentarios_in_atribuicao2356);
			c1=comentarios();
			state._fsp--;

			stream_comentarios.add(c1.getTree());dbg.location(156,17);
			ID111=(Token)match(input,ID,FOLLOW_ID_in_atribuicao2358);  
			stream_ID.add(ID111);
			dbg.location(156,22);
			pushFollow(FOLLOW_comentarios_in_atribuicao2362);
			c2=comentarios();
			state._fsp--;

			stream_comentarios.add(c2.getTree());dbg.location(156,35);
			pushFollow(FOLLOW_opAtribuicao_in_atribuicao2364);
			opAtribuicao112=opAtribuicao();
			state._fsp--;

			stream_opAtribuicao.add(opAtribuicao112.getTree());dbg.location(156,50);
			pushFollow(FOLLOW_comentarios_in_atribuicao2368);
			c3=comentarios();
			state._fsp--;

			stream_comentarios.add(c3.getTree());dbg.location(156,63);
			pushFollow(FOLLOW_condicao_in_atribuicao2370);
			condicao113=condicao();
			state._fsp--;

			stream_condicao.add(condicao113.getTree());dbg.location(156,74);
			pushFollow(FOLLOW_comentarios_in_atribuicao2374);
			c4=comentarios();
			state._fsp--;

			stream_comentarios.add(c4.getTree());
			// AST REWRITE
			// elements: c3, c4, c2, ID, c1, opAtribuicao, condicao
			// token labels: 
			// rule labels: retval, c1, c2, c4, c3
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_c1=new RewriteRuleSubtreeStream(adaptor,"rule c1",c1!=null?c1.getTree():null);
			RewriteRuleSubtreeStream stream_c2=new RewriteRuleSubtreeStream(adaptor,"rule c2",c2!=null?c2.getTree():null);
			RewriteRuleSubtreeStream stream_c4=new RewriteRuleSubtreeStream(adaptor,"rule c4",c4!=null?c4.getTree():null);
			RewriteRuleSubtreeStream stream_c3=new RewriteRuleSubtreeStream(adaptor,"rule c3",c3!=null?c3.getTree():null);

			root_0 = (Tree)adaptor.nil();
			// 156:87: -> ^( Atribuicao ^( Comentarios ( $c1)? ) ID ^( Comentarios ( $c2)? ) opAtribuicao ^( Comentarios ( $c3)? ) condicao ^( Comentarios ( $c4)? ) )
			{
				dbg.location(156,90);
				// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:156:90: ^( Atribuicao ^( Comentarios ( $c1)? ) ID ^( Comentarios ( $c2)? ) opAtribuicao ^( Comentarios ( $c3)? ) condicao ^( Comentarios ( $c4)? ) )
				{
				Tree root_1 = (Tree)adaptor.nil();
				dbg.location(156,92);
				root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Atribuicao, "Atribuicao"), root_1);
				dbg.location(156,103);
				// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:156:103: ^( Comentarios ( $c1)? )
				{
				Tree root_2 = (Tree)adaptor.nil();
				dbg.location(156,105);
				root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);
				dbg.location(156,118);
				// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:156:118: ( $c1)?
				if ( stream_c1.hasNext() ) {
					dbg.location(156,118);
					adaptor.addChild(root_2, stream_c1.nextTree());
				}
				stream_c1.reset();

				adaptor.addChild(root_1, root_2);
				}
				dbg.location(156,123);
				adaptor.addChild(root_1, stream_ID.nextNode());dbg.location(156,126);
				// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:156:126: ^( Comentarios ( $c2)? )
				{
				Tree root_2 = (Tree)adaptor.nil();
				dbg.location(156,128);
				root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);
				dbg.location(156,141);
				// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:156:141: ( $c2)?
				if ( stream_c2.hasNext() ) {
					dbg.location(156,141);
					adaptor.addChild(root_2, stream_c2.nextTree());
				}
				stream_c2.reset();

				adaptor.addChild(root_1, root_2);
				}
				dbg.location(156,146);
				adaptor.addChild(root_1, stream_opAtribuicao.nextTree());dbg.location(156,159);
				// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:156:159: ^( Comentarios ( $c3)? )
				{
				Tree root_2 = (Tree)adaptor.nil();
				dbg.location(156,161);
				root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);
				dbg.location(156,174);
				// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:156:174: ( $c3)?
				if ( stream_c3.hasNext() ) {
					dbg.location(156,174);
					adaptor.addChild(root_2, stream_c3.nextTree());
				}
				stream_c3.reset();

				adaptor.addChild(root_1, root_2);
				}
				dbg.location(156,179);
				adaptor.addChild(root_1, stream_condicao.nextTree());dbg.location(156,188);
				// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:156:188: ^( Comentarios ( $c4)? )
				{
				Tree root_2 = (Tree)adaptor.nil();
				dbg.location(156,190);
				root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);
				dbg.location(156,203);
				// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:156:203: ( $c4)?
				if ( stream_c4.hasNext() ) {
					dbg.location(156,203);
					adaptor.addChild(root_2, stream_c4.nextTree());
				}
				stream_c4.reset();

				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(157, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "atribuicao");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "atribuicao"


	public static class opAtribuicao_return extends ParserRuleReturnScope {
		Tree tree;
		@Override
		public Tree getTree() { return tree; }
	};


	// $ANTLR start "opAtribuicao"
	// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:159:1: opAtribuicao : ( '=' -> ^( Atrib ) | '*=' -> ^( Mult ) | '/=' -> ^( Div ) | '+=' -> ^( Soma ) | '-=' -> ^( Sub ) ) ;
	public final iParser.opAtribuicao_return opAtribuicao() throws  {
		iParser.opAtribuicao_return retval = new iParser.opAtribuicao_return();
		retval.start = input.LT(1);

		Tree root_0 = null;

		Token char_literal114=null;
		Token string_literal115=null;
		Token string_literal116=null;
		Token string_literal117=null;
		Token string_literal118=null;

		Tree char_literal114_tree=null;
		Tree string_literal115_tree=null;
		Tree string_literal116_tree=null;
		Tree string_literal117_tree=null;
		Tree string_literal118_tree=null;
		RewriteRuleTokenStream stream_97=new RewriteRuleTokenStream(adaptor,"token 97");
		RewriteRuleTokenStream stream_95=new RewriteRuleTokenStream(adaptor,"token 95");
		RewriteRuleTokenStream stream_91=new RewriteRuleTokenStream(adaptor,"token 91");
		RewriteRuleTokenStream stream_102=new RewriteRuleTokenStream(adaptor,"token 102");
		RewriteRuleTokenStream stream_88=new RewriteRuleTokenStream(adaptor,"token 88");

		try { dbg.enterRule(getGrammarFileName(), "opAtribuicao");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(159, 0);

		try {
			// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:159:14: ( ( '=' -> ^( Atrib ) | '*=' -> ^( Mult ) | '/=' -> ^( Div ) | '+=' -> ^( Soma ) | '-=' -> ^( Sub ) ) )
			dbg.enterAlt(1);

			// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:160:2: ( '=' -> ^( Atrib ) | '*=' -> ^( Mult ) | '/=' -> ^( Div ) | '+=' -> ^( Soma ) | '-=' -> ^( Sub ) )
			{
			dbg.location(160,2);
			// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:160:2: ( '=' -> ^( Atrib ) | '*=' -> ^( Mult ) | '/=' -> ^( Div ) | '+=' -> ^( Soma ) | '-=' -> ^( Sub ) )
			int alt24=5;
			try { dbg.enterSubRule(24);
			try { dbg.enterDecision(24, decisionCanBacktrack[24]);

			switch ( input.LA(1) ) {
			case 102:
				{
				alt24=1;
				}
				break;
			case 88:
				{
				alt24=2;
				}
				break;
			case 97:
				{
				alt24=3;
				}
				break;
			case 91:
				{
				alt24=4;
				}
				break;
			case 95:
				{
				alt24=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 24, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(24);}

			switch (alt24) {
				case 1 :
					dbg.enterAlt(1);

					// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:160:4: '='
					{
					dbg.location(160,4);
					char_literal114=(Token)match(input,102,FOLLOW_102_in_opAtribuicao2433);  
					stream_102.add(char_literal114);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Tree)adaptor.nil();
					// 160:8: -> ^( Atrib )
					{
						dbg.location(160,11);
						// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:160:11: ^( Atrib )
						{
						Tree root_1 = (Tree)adaptor.nil();
						dbg.location(160,13);
						root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Atrib, "Atrib"), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:161:4: '*='
					{
					dbg.location(161,4);
					string_literal115=(Token)match(input,88,FOLLOW_88_in_opAtribuicao2444);  
					stream_88.add(string_literal115);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Tree)adaptor.nil();
					// 161:9: -> ^( Mult )
					{
						dbg.location(161,12);
						// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:161:12: ^( Mult )
						{
						Tree root_1 = (Tree)adaptor.nil();
						dbg.location(161,14);
						root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Mult, "Mult"), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:162:4: '/='
					{
					dbg.location(162,4);
					string_literal116=(Token)match(input,97,FOLLOW_97_in_opAtribuicao2455);  
					stream_97.add(string_literal116);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Tree)adaptor.nil();
					// 162:9: -> ^( Div )
					{
						dbg.location(162,12);
						// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:162:12: ^( Div )
						{
						Tree root_1 = (Tree)adaptor.nil();
						dbg.location(162,14);
						root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Div, "Div"), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:163:4: '+='
					{
					dbg.location(163,4);
					string_literal117=(Token)match(input,91,FOLLOW_91_in_opAtribuicao2466);  
					stream_91.add(string_literal117);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Tree)adaptor.nil();
					// 163:9: -> ^( Soma )
					{
						dbg.location(163,12);
						// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:163:12: ^( Soma )
						{
						Tree root_1 = (Tree)adaptor.nil();
						dbg.location(163,14);
						root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Soma, "Soma"), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:164:4: '-='
					{
					dbg.location(164,4);
					string_literal118=(Token)match(input,95,FOLLOW_95_in_opAtribuicao2477);  
					stream_95.add(string_literal118);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Tree)adaptor.nil();
					// 164:9: -> ^( Sub )
					{
						dbg.location(164,12);
						// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:164:12: ^( Sub )
						{
						Tree root_1 = (Tree)adaptor.nil();
						dbg.location(164,14);
						root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Sub, "Sub"), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			} finally {dbg.exitSubRule(24);}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(166, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "opAtribuicao");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "opAtribuicao"


	public static class expressao_return extends ParserRuleReturnScope {
		Tree tree;
		@Override
		public Tree getTree() { return tree; }
	};


	// $ANTLR start "expressao"
	// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:170:1: expressao : ( expressaoNum -> expressaoNum ) (c1= comentarios ( '+' c2= comentarios e= expressaoNum -> ^( ExpNum $expressao ^( Comentarios ( $c1)? ) ^( Mais ) ^( Comentarios ( $c2)? ) $e) | '-' c2= comentarios e= expressaoNum -> ^( ExpNum $expressao ^( Comentarios ( $c1)? ) ^( Menos ) ^( Comentarios ( $c2)? ) $e) ) )* ;
	public final iParser.expressao_return expressao() throws  {
		iParser.expressao_return retval = new iParser.expressao_return();
		retval.start = input.LT(1);

		Tree root_0 = null;

		Token char_literal120=null;
		Token char_literal121=null;
		ParserRuleReturnScope c1 =null;
		ParserRuleReturnScope c2 =null;
		ParserRuleReturnScope e =null;
		ParserRuleReturnScope expressaoNum119 =null;

		Tree char_literal120_tree=null;
		Tree char_literal121_tree=null;
		RewriteRuleTokenStream stream_93=new RewriteRuleTokenStream(adaptor,"token 93");
		RewriteRuleTokenStream stream_89=new RewriteRuleTokenStream(adaptor,"token 89");
		RewriteRuleSubtreeStream stream_comentarios=new RewriteRuleSubtreeStream(adaptor,"rule comentarios");
		RewriteRuleSubtreeStream stream_expressaoNum=new RewriteRuleSubtreeStream(adaptor,"rule expressaoNum");

		try { dbg.enterRule(getGrammarFileName(), "expressao");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(170, 0);

		try {
			// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:170:11: ( ( expressaoNum -> expressaoNum ) (c1= comentarios ( '+' c2= comentarios e= expressaoNum -> ^( ExpNum $expressao ^( Comentarios ( $c1)? ) ^( Mais ) ^( Comentarios ( $c2)? ) $e) | '-' c2= comentarios e= expressaoNum -> ^( ExpNum $expressao ^( Comentarios ( $c1)? ) ^( Menos ) ^( Comentarios ( $c2)? ) $e) ) )* )
			dbg.enterAlt(1);

			// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:171:2: ( expressaoNum -> expressaoNum ) (c1= comentarios ( '+' c2= comentarios e= expressaoNum -> ^( ExpNum $expressao ^( Comentarios ( $c1)? ) ^( Mais ) ^( Comentarios ( $c2)? ) $e) | '-' c2= comentarios e= expressaoNum -> ^( ExpNum $expressao ^( Comentarios ( $c1)? ) ^( Menos ) ^( Comentarios ( $c2)? ) $e) ) )*
			{
			dbg.location(171,2);
			// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:171:2: ( expressaoNum -> expressaoNum )
			dbg.enterAlt(1);

			// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:171:3: expressaoNum
			{
			dbg.location(171,3);
			pushFollow(FOLLOW_expressaoNum_in_expressao2503);
			expressaoNum119=expressaoNum();
			state._fsp--;

			stream_expressaoNum.add(expressaoNum119.getTree());
			// AST REWRITE
			// elements: expressaoNum
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Tree)adaptor.nil();
			// 171:16: -> expressaoNum
			{
				dbg.location(171,19);
				adaptor.addChild(root_0, stream_expressaoNum.nextTree());
			}


			retval.tree = root_0;

			}
			dbg.location(171,33);
			// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:171:33: (c1= comentarios ( '+' c2= comentarios e= expressaoNum -> ^( ExpNum $expressao ^( Comentarios ( $c1)? ) ^( Mais ) ^( Comentarios ( $c2)? ) $e) | '-' c2= comentarios e= expressaoNum -> ^( ExpNum $expressao ^( Comentarios ( $c1)? ) ^( Menos ) ^( Comentarios ( $c2)? ) $e) ) )*
			try { dbg.enterSubRule(26);

			loop26:
			while (true) {
				int alt26=2;
				try { dbg.enterDecision(26, decisionCanBacktrack[26]);

				try {
					isCyclicDecision = true;
					alt26 = dfa26.predict(input);
				}
				catch (NoViableAltException nvae) {
					dbg.recognitionException(nvae);
					throw nvae;
				}
				} finally {dbg.exitDecision(26);}

				switch (alt26) {
				case 1 :
					dbg.enterAlt(1);

					// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:171:35: c1= comentarios ( '+' c2= comentarios e= expressaoNum -> ^( ExpNum $expressao ^( Comentarios ( $c1)? ) ^( Mais ) ^( Comentarios ( $c2)? ) $e) | '-' c2= comentarios e= expressaoNum -> ^( ExpNum $expressao ^( Comentarios ( $c1)? ) ^( Menos ) ^( Comentarios ( $c2)? ) $e) )
					{
					dbg.location(171,37);
					pushFollow(FOLLOW_comentarios_in_expressao2514);
					c1=comentarios();
					state._fsp--;

					stream_comentarios.add(c1.getTree());dbg.location(171,50);
					// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:171:50: ( '+' c2= comentarios e= expressaoNum -> ^( ExpNum $expressao ^( Comentarios ( $c1)? ) ^( Mais ) ^( Comentarios ( $c2)? ) $e) | '-' c2= comentarios e= expressaoNum -> ^( ExpNum $expressao ^( Comentarios ( $c1)? ) ^( Menos ) ^( Comentarios ( $c2)? ) $e) )
					int alt25=2;
					try { dbg.enterSubRule(25);
					try { dbg.enterDecision(25, decisionCanBacktrack[25]);

					int LA25_0 = input.LA(1);
					if ( (LA25_0==89) ) {
						alt25=1;
					}
					else if ( (LA25_0==93) ) {
						alt25=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 25, 0, input);
						dbg.recognitionException(nvae);
						throw nvae;
					}

					} finally {dbg.exitDecision(25);}

					switch (alt25) {
						case 1 :
							dbg.enterAlt(1);

							// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:171:52: '+' c2= comentarios e= expressaoNum
							{
							dbg.location(171,52);
							char_literal120=(Token)match(input,89,FOLLOW_89_in_expressao2518);  
							stream_89.add(char_literal120);
							dbg.location(171,58);
							pushFollow(FOLLOW_comentarios_in_expressao2522);
							c2=comentarios();
							state._fsp--;

							stream_comentarios.add(c2.getTree());dbg.location(171,72);
							pushFollow(FOLLOW_expressaoNum_in_expressao2526);
							e=expressaoNum();
							state._fsp--;

							stream_expressaoNum.add(e.getTree());
							// AST REWRITE
							// elements: c2, expressao, e, c1
							// token labels: 
							// rule labels: retval, e, c1, c2
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
							RewriteRuleSubtreeStream stream_e=new RewriteRuleSubtreeStream(adaptor,"rule e",e!=null?e.getTree():null);
							RewriteRuleSubtreeStream stream_c1=new RewriteRuleSubtreeStream(adaptor,"rule c1",c1!=null?c1.getTree():null);
							RewriteRuleSubtreeStream stream_c2=new RewriteRuleSubtreeStream(adaptor,"rule c2",c2!=null?c2.getTree():null);

							root_0 = (Tree)adaptor.nil();
							// 171:86: -> ^( ExpNum $expressao ^( Comentarios ( $c1)? ) ^( Mais ) ^( Comentarios ( $c2)? ) $e)
							{
								dbg.location(171,89);
								// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:171:89: ^( ExpNum $expressao ^( Comentarios ( $c1)? ) ^( Mais ) ^( Comentarios ( $c2)? ) $e)
								{
								Tree root_1 = (Tree)adaptor.nil();
								dbg.location(171,91);
								root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(ExpNum, "ExpNum"), root_1);
								dbg.location(171,99);
								adaptor.addChild(root_1, stream_retval.nextTree());dbg.location(171,109);
								// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:171:109: ^( Comentarios ( $c1)? )
								{
								Tree root_2 = (Tree)adaptor.nil();
								dbg.location(171,111);
								root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);
								dbg.location(171,124);
								// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:171:124: ( $c1)?
								if ( stream_c1.hasNext() ) {
									dbg.location(171,124);
									adaptor.addChild(root_2, stream_c1.nextTree());
								}
								stream_c1.reset();

								adaptor.addChild(root_1, root_2);
								}
								dbg.location(171,129);
								// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:171:129: ^( Mais )
								{
								Tree root_2 = (Tree)adaptor.nil();
								dbg.location(171,131);
								root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Mais, "Mais"), root_2);
								adaptor.addChild(root_1, root_2);
								}
								dbg.location(171,137);
								// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:171:137: ^( Comentarios ( $c2)? )
								{
								Tree root_2 = (Tree)adaptor.nil();
								dbg.location(171,139);
								root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);
								dbg.location(171,152);
								// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:171:152: ( $c2)?
								if ( stream_c2.hasNext() ) {
									dbg.location(171,152);
									adaptor.addChild(root_2, stream_c2.nextTree());
								}
								stream_c2.reset();

								adaptor.addChild(root_1, root_2);
								}
								dbg.location(171,158);
								adaptor.addChild(root_1, stream_e.nextTree());
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:172:17: '-' c2= comentarios e= expressaoNum
							{
							dbg.location(172,17);
							char_literal121=(Token)match(input,93,FOLLOW_93_in_expressao2577);  
							stream_93.add(char_literal121);
							dbg.location(172,23);
							pushFollow(FOLLOW_comentarios_in_expressao2581);
							c2=comentarios();
							state._fsp--;

							stream_comentarios.add(c2.getTree());dbg.location(172,37);
							pushFollow(FOLLOW_expressaoNum_in_expressao2585);
							e=expressaoNum();
							state._fsp--;

							stream_expressaoNum.add(e.getTree());
							// AST REWRITE
							// elements: e, expressao, c2, c1
							// token labels: 
							// rule labels: retval, e, c1, c2
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
							RewriteRuleSubtreeStream stream_e=new RewriteRuleSubtreeStream(adaptor,"rule e",e!=null?e.getTree():null);
							RewriteRuleSubtreeStream stream_c1=new RewriteRuleSubtreeStream(adaptor,"rule c1",c1!=null?c1.getTree():null);
							RewriteRuleSubtreeStream stream_c2=new RewriteRuleSubtreeStream(adaptor,"rule c2",c2!=null?c2.getTree():null);

							root_0 = (Tree)adaptor.nil();
							// 172:51: -> ^( ExpNum $expressao ^( Comentarios ( $c1)? ) ^( Menos ) ^( Comentarios ( $c2)? ) $e)
							{
								dbg.location(172,54);
								// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:172:54: ^( ExpNum $expressao ^( Comentarios ( $c1)? ) ^( Menos ) ^( Comentarios ( $c2)? ) $e)
								{
								Tree root_1 = (Tree)adaptor.nil();
								dbg.location(172,56);
								root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(ExpNum, "ExpNum"), root_1);
								dbg.location(172,64);
								adaptor.addChild(root_1, stream_retval.nextTree());dbg.location(172,74);
								// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:172:74: ^( Comentarios ( $c1)? )
								{
								Tree root_2 = (Tree)adaptor.nil();
								dbg.location(172,76);
								root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);
								dbg.location(172,89);
								// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:172:89: ( $c1)?
								if ( stream_c1.hasNext() ) {
									dbg.location(172,89);
									adaptor.addChild(root_2, stream_c1.nextTree());
								}
								stream_c1.reset();

								adaptor.addChild(root_1, root_2);
								}
								dbg.location(172,94);
								// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:172:94: ^( Menos )
								{
								Tree root_2 = (Tree)adaptor.nil();
								dbg.location(172,96);
								root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Menos, "Menos"), root_2);
								adaptor.addChild(root_1, root_2);
								}
								dbg.location(172,103);
								// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:172:103: ^( Comentarios ( $c2)? )
								{
								Tree root_2 = (Tree)adaptor.nil();
								dbg.location(172,105);
								root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);
								dbg.location(172,118);
								// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:172:118: ( $c2)?
								if ( stream_c2.hasNext() ) {
									dbg.location(172,118);
									adaptor.addChild(root_2, stream_c2.nextTree());
								}
								stream_c2.reset();

								adaptor.addChild(root_1, root_2);
								}
								dbg.location(172,124);
								adaptor.addChild(root_1, stream_e.nextTree());
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;

					}
					} finally {dbg.exitSubRule(25);}

					}
					break;

				default :
					break loop26;
				}
			}
			} finally {dbg.exitSubRule(26);}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(175, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "expressao");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "expressao"


	public static class expressaoNum_return extends ParserRuleReturnScope {
		Tree tree;
		@Override
		public Tree getTree() { return tree; }
	};


	// $ANTLR start "expressaoNum"
	// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:177:1: expressaoNum : ( oper -> oper ) (c1= comentarios ( '*' c2= comentarios o= oper -> ^( ExpNum $expressaoNum ^( Comentarios ( $c1)? ) ^( Vezes ) ^( Comentarios ( $c2)? ) $o) | '/' c2= comentarios o= oper -> ^( ExpNum $expressaoNum ^( Comentarios ( $c1)? ) ^( Divide ) ^( Comentarios ( $c2)? ) $o) | '%' c2= comentarios o= oper -> ^( ExpNum $expressaoNum ^( Comentarios ( $c1)? ) ^( Mod ) ^( Comentarios ( $c2)? ) $o) ) )* ;
	public final iParser.expressaoNum_return expressaoNum() throws  {
		iParser.expressaoNum_return retval = new iParser.expressaoNum_return();
		retval.start = input.LT(1);

		Tree root_0 = null;

		Token char_literal123=null;
		Token char_literal124=null;
		Token char_literal125=null;
		ParserRuleReturnScope c1 =null;
		ParserRuleReturnScope c2 =null;
		ParserRuleReturnScope o =null;
		ParserRuleReturnScope oper122 =null;

		Tree char_literal123_tree=null;
		Tree char_literal124_tree=null;
		Tree char_literal125_tree=null;
		RewriteRuleTokenStream stream_96=new RewriteRuleTokenStream(adaptor,"token 96");
		RewriteRuleTokenStream stream_83=new RewriteRuleTokenStream(adaptor,"token 83");
		RewriteRuleTokenStream stream_87=new RewriteRuleTokenStream(adaptor,"token 87");
		RewriteRuleSubtreeStream stream_oper=new RewriteRuleSubtreeStream(adaptor,"rule oper");
		RewriteRuleSubtreeStream stream_comentarios=new RewriteRuleSubtreeStream(adaptor,"rule comentarios");

		try { dbg.enterRule(getGrammarFileName(), "expressaoNum");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(177, 0);

		try {
			// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:177:14: ( ( oper -> oper ) (c1= comentarios ( '*' c2= comentarios o= oper -> ^( ExpNum $expressaoNum ^( Comentarios ( $c1)? ) ^( Vezes ) ^( Comentarios ( $c2)? ) $o) | '/' c2= comentarios o= oper -> ^( ExpNum $expressaoNum ^( Comentarios ( $c1)? ) ^( Divide ) ^( Comentarios ( $c2)? ) $o) | '%' c2= comentarios o= oper -> ^( ExpNum $expressaoNum ^( Comentarios ( $c1)? ) ^( Mod ) ^( Comentarios ( $c2)? ) $o) ) )* )
			dbg.enterAlt(1);

			// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:178:2: ( oper -> oper ) (c1= comentarios ( '*' c2= comentarios o= oper -> ^( ExpNum $expressaoNum ^( Comentarios ( $c1)? ) ^( Vezes ) ^( Comentarios ( $c2)? ) $o) | '/' c2= comentarios o= oper -> ^( ExpNum $expressaoNum ^( Comentarios ( $c1)? ) ^( Divide ) ^( Comentarios ( $c2)? ) $o) | '%' c2= comentarios o= oper -> ^( ExpNum $expressaoNum ^( Comentarios ( $c1)? ) ^( Mod ) ^( Comentarios ( $c2)? ) $o) ) )*
			{
			dbg.location(178,2);
			// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:178:2: ( oper -> oper )
			dbg.enterAlt(1);

			// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:178:3: oper
			{
			dbg.location(178,3);
			pushFollow(FOLLOW_oper_in_expressaoNum2658);
			oper122=oper();
			state._fsp--;

			stream_oper.add(oper122.getTree());
			// AST REWRITE
			// elements: oper
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Tree)adaptor.nil();
			// 178:8: -> oper
			{
				dbg.location(178,11);
				adaptor.addChild(root_0, stream_oper.nextTree());
			}


			retval.tree = root_0;

			}
			dbg.location(178,17);
			// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:178:17: (c1= comentarios ( '*' c2= comentarios o= oper -> ^( ExpNum $expressaoNum ^( Comentarios ( $c1)? ) ^( Vezes ) ^( Comentarios ( $c2)? ) $o) | '/' c2= comentarios o= oper -> ^( ExpNum $expressaoNum ^( Comentarios ( $c1)? ) ^( Divide ) ^( Comentarios ( $c2)? ) $o) | '%' c2= comentarios o= oper -> ^( ExpNum $expressaoNum ^( Comentarios ( $c1)? ) ^( Mod ) ^( Comentarios ( $c2)? ) $o) ) )*
			try { dbg.enterSubRule(28);

			loop28:
			while (true) {
				int alt28=2;
				try { dbg.enterDecision(28, decisionCanBacktrack[28]);

				try {
					isCyclicDecision = true;
					alt28 = dfa28.predict(input);
				}
				catch (NoViableAltException nvae) {
					dbg.recognitionException(nvae);
					throw nvae;
				}
				} finally {dbg.exitDecision(28);}

				switch (alt28) {
				case 1 :
					dbg.enterAlt(1);

					// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:178:19: c1= comentarios ( '*' c2= comentarios o= oper -> ^( ExpNum $expressaoNum ^( Comentarios ( $c1)? ) ^( Vezes ) ^( Comentarios ( $c2)? ) $o) | '/' c2= comentarios o= oper -> ^( ExpNum $expressaoNum ^( Comentarios ( $c1)? ) ^( Divide ) ^( Comentarios ( $c2)? ) $o) | '%' c2= comentarios o= oper -> ^( ExpNum $expressaoNum ^( Comentarios ( $c1)? ) ^( Mod ) ^( Comentarios ( $c2)? ) $o) )
					{
					dbg.location(178,21);
					pushFollow(FOLLOW_comentarios_in_expressaoNum2669);
					c1=comentarios();
					state._fsp--;

					stream_comentarios.add(c1.getTree());dbg.location(178,34);
					// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:178:34: ( '*' c2= comentarios o= oper -> ^( ExpNum $expressaoNum ^( Comentarios ( $c1)? ) ^( Vezes ) ^( Comentarios ( $c2)? ) $o) | '/' c2= comentarios o= oper -> ^( ExpNum $expressaoNum ^( Comentarios ( $c1)? ) ^( Divide ) ^( Comentarios ( $c2)? ) $o) | '%' c2= comentarios o= oper -> ^( ExpNum $expressaoNum ^( Comentarios ( $c1)? ) ^( Mod ) ^( Comentarios ( $c2)? ) $o) )
					int alt27=3;
					try { dbg.enterSubRule(27);
					try { dbg.enterDecision(27, decisionCanBacktrack[27]);

					switch ( input.LA(1) ) {
					case 87:
						{
						alt27=1;
						}
						break;
					case 96:
						{
						alt27=2;
						}
						break;
					case 83:
						{
						alt27=3;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 27, 0, input);
						dbg.recognitionException(nvae);
						throw nvae;
					}
					} finally {dbg.exitDecision(27);}

					switch (alt27) {
						case 1 :
							dbg.enterAlt(1);

							// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:178:36: '*' c2= comentarios o= oper
							{
							dbg.location(178,36);
							char_literal123=(Token)match(input,87,FOLLOW_87_in_expressaoNum2673);  
							stream_87.add(char_literal123);
							dbg.location(178,42);
							pushFollow(FOLLOW_comentarios_in_expressaoNum2677);
							c2=comentarios();
							state._fsp--;

							stream_comentarios.add(c2.getTree());dbg.location(178,56);
							pushFollow(FOLLOW_oper_in_expressaoNum2681);
							o=oper();
							state._fsp--;

							stream_oper.add(o.getTree());
							// AST REWRITE
							// elements: c1, o, c2, expressaoNum
							// token labels: 
							// rule labels: retval, c1, c2, o
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
							RewriteRuleSubtreeStream stream_c1=new RewriteRuleSubtreeStream(adaptor,"rule c1",c1!=null?c1.getTree():null);
							RewriteRuleSubtreeStream stream_c2=new RewriteRuleSubtreeStream(adaptor,"rule c2",c2!=null?c2.getTree():null);
							RewriteRuleSubtreeStream stream_o=new RewriteRuleSubtreeStream(adaptor,"rule o",o!=null?o.getTree():null);

							root_0 = (Tree)adaptor.nil();
							// 178:62: -> ^( ExpNum $expressaoNum ^( Comentarios ( $c1)? ) ^( Vezes ) ^( Comentarios ( $c2)? ) $o)
							{
								dbg.location(178,65);
								// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:178:65: ^( ExpNum $expressaoNum ^( Comentarios ( $c1)? ) ^( Vezes ) ^( Comentarios ( $c2)? ) $o)
								{
								Tree root_1 = (Tree)adaptor.nil();
								dbg.location(178,67);
								root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(ExpNum, "ExpNum"), root_1);
								dbg.location(178,75);
								adaptor.addChild(root_1, stream_retval.nextTree());dbg.location(178,88);
								// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:178:88: ^( Comentarios ( $c1)? )
								{
								Tree root_2 = (Tree)adaptor.nil();
								dbg.location(178,90);
								root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);
								dbg.location(178,103);
								// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:178:103: ( $c1)?
								if ( stream_c1.hasNext() ) {
									dbg.location(178,103);
									adaptor.addChild(root_2, stream_c1.nextTree());
								}
								stream_c1.reset();

								adaptor.addChild(root_1, root_2);
								}
								dbg.location(178,108);
								// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:178:108: ^( Vezes )
								{
								Tree root_2 = (Tree)adaptor.nil();
								dbg.location(178,110);
								root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Vezes, "Vezes"), root_2);
								adaptor.addChild(root_1, root_2);
								}
								dbg.location(178,117);
								// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:178:117: ^( Comentarios ( $c2)? )
								{
								Tree root_2 = (Tree)adaptor.nil();
								dbg.location(178,119);
								root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);
								dbg.location(178,132);
								// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:178:132: ( $c2)?
								if ( stream_c2.hasNext() ) {
									dbg.location(178,132);
									adaptor.addChild(root_2, stream_c2.nextTree());
								}
								stream_c2.reset();

								adaptor.addChild(root_1, root_2);
								}
								dbg.location(178,138);
								adaptor.addChild(root_1, stream_o.nextTree());
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:179:12: '/' c2= comentarios o= oper
							{
							dbg.location(179,12);
							char_literal124=(Token)match(input,96,FOLLOW_96_in_expressaoNum2727);  
							stream_96.add(char_literal124);
							dbg.location(179,18);
							pushFollow(FOLLOW_comentarios_in_expressaoNum2731);
							c2=comentarios();
							state._fsp--;

							stream_comentarios.add(c2.getTree());dbg.location(179,32);
							pushFollow(FOLLOW_oper_in_expressaoNum2735);
							o=oper();
							state._fsp--;

							stream_oper.add(o.getTree());
							// AST REWRITE
							// elements: c1, c2, o, expressaoNum
							// token labels: 
							// rule labels: retval, c1, c2, o
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
							RewriteRuleSubtreeStream stream_c1=new RewriteRuleSubtreeStream(adaptor,"rule c1",c1!=null?c1.getTree():null);
							RewriteRuleSubtreeStream stream_c2=new RewriteRuleSubtreeStream(adaptor,"rule c2",c2!=null?c2.getTree():null);
							RewriteRuleSubtreeStream stream_o=new RewriteRuleSubtreeStream(adaptor,"rule o",o!=null?o.getTree():null);

							root_0 = (Tree)adaptor.nil();
							// 179:38: -> ^( ExpNum $expressaoNum ^( Comentarios ( $c1)? ) ^( Divide ) ^( Comentarios ( $c2)? ) $o)
							{
								dbg.location(179,41);
								// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:179:41: ^( ExpNum $expressaoNum ^( Comentarios ( $c1)? ) ^( Divide ) ^( Comentarios ( $c2)? ) $o)
								{
								Tree root_1 = (Tree)adaptor.nil();
								dbg.location(179,43);
								root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(ExpNum, "ExpNum"), root_1);
								dbg.location(179,51);
								adaptor.addChild(root_1, stream_retval.nextTree());dbg.location(179,64);
								// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:179:64: ^( Comentarios ( $c1)? )
								{
								Tree root_2 = (Tree)adaptor.nil();
								dbg.location(179,66);
								root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);
								dbg.location(179,79);
								// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:179:79: ( $c1)?
								if ( stream_c1.hasNext() ) {
									dbg.location(179,79);
									adaptor.addChild(root_2, stream_c1.nextTree());
								}
								stream_c1.reset();

								adaptor.addChild(root_1, root_2);
								}
								dbg.location(179,84);
								// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:179:84: ^( Divide )
								{
								Tree root_2 = (Tree)adaptor.nil();
								dbg.location(179,86);
								root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Divide, "Divide"), root_2);
								adaptor.addChild(root_1, root_2);
								}
								dbg.location(179,94);
								// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:179:94: ^( Comentarios ( $c2)? )
								{
								Tree root_2 = (Tree)adaptor.nil();
								dbg.location(179,96);
								root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);
								dbg.location(179,109);
								// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:179:109: ( $c2)?
								if ( stream_c2.hasNext() ) {
									dbg.location(179,109);
									adaptor.addChild(root_2, stream_c2.nextTree());
								}
								stream_c2.reset();

								adaptor.addChild(root_1, root_2);
								}
								dbg.location(179,115);
								adaptor.addChild(root_1, stream_o.nextTree());
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;
						case 3 :
							dbg.enterAlt(3);

							// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:180:12: '%' c2= comentarios o= oper
							{
							dbg.location(180,12);
							char_literal125=(Token)match(input,83,FOLLOW_83_in_expressaoNum2781);  
							stream_83.add(char_literal125);
							dbg.location(180,18);
							pushFollow(FOLLOW_comentarios_in_expressaoNum2785);
							c2=comentarios();
							state._fsp--;

							stream_comentarios.add(c2.getTree());dbg.location(180,32);
							pushFollow(FOLLOW_oper_in_expressaoNum2789);
							o=oper();
							state._fsp--;

							stream_oper.add(o.getTree());
							// AST REWRITE
							// elements: c2, expressaoNum, o, c1
							// token labels: 
							// rule labels: retval, c1, c2, o
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
							RewriteRuleSubtreeStream stream_c1=new RewriteRuleSubtreeStream(adaptor,"rule c1",c1!=null?c1.getTree():null);
							RewriteRuleSubtreeStream stream_c2=new RewriteRuleSubtreeStream(adaptor,"rule c2",c2!=null?c2.getTree():null);
							RewriteRuleSubtreeStream stream_o=new RewriteRuleSubtreeStream(adaptor,"rule o",o!=null?o.getTree():null);

							root_0 = (Tree)adaptor.nil();
							// 180:38: -> ^( ExpNum $expressaoNum ^( Comentarios ( $c1)? ) ^( Mod ) ^( Comentarios ( $c2)? ) $o)
							{
								dbg.location(180,41);
								// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:180:41: ^( ExpNum $expressaoNum ^( Comentarios ( $c1)? ) ^( Mod ) ^( Comentarios ( $c2)? ) $o)
								{
								Tree root_1 = (Tree)adaptor.nil();
								dbg.location(180,43);
								root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(ExpNum, "ExpNum"), root_1);
								dbg.location(180,51);
								adaptor.addChild(root_1, stream_retval.nextTree());dbg.location(180,64);
								// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:180:64: ^( Comentarios ( $c1)? )
								{
								Tree root_2 = (Tree)adaptor.nil();
								dbg.location(180,66);
								root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);
								dbg.location(180,79);
								// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:180:79: ( $c1)?
								if ( stream_c1.hasNext() ) {
									dbg.location(180,79);
									adaptor.addChild(root_2, stream_c1.nextTree());
								}
								stream_c1.reset();

								adaptor.addChild(root_1, root_2);
								}
								dbg.location(180,84);
								// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:180:84: ^( Mod )
								{
								Tree root_2 = (Tree)adaptor.nil();
								dbg.location(180,86);
								root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Mod, "Mod"), root_2);
								adaptor.addChild(root_1, root_2);
								}
								dbg.location(180,91);
								// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:180:91: ^( Comentarios ( $c2)? )
								{
								Tree root_2 = (Tree)adaptor.nil();
								dbg.location(180,93);
								root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentarios, "Comentarios"), root_2);
								dbg.location(180,106);
								// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:180:106: ( $c2)?
								if ( stream_c2.hasNext() ) {
									dbg.location(180,106);
									adaptor.addChild(root_2, stream_c2.nextTree());
								}
								stream_c2.reset();

								adaptor.addChild(root_1, root_2);
								}
								dbg.location(180,112);
								adaptor.addChild(root_1, stream_o.nextTree());
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;

					}
					} finally {dbg.exitSubRule(27);}

					}
					break;

				default :
					break loop28;
				}
			}
			} finally {dbg.exitSubRule(28);}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(183, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "expressaoNum");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "expressaoNum"


	public static class oper_return extends ParserRuleReturnScope {
		Tree tree;
		@Override
		public Tree getTree() { return tree; }
	};


	// $ANTLR start "oper"
	// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:185:1: oper : ( opUnario ID -> ^( opUnario ^( Id ID ) ) | opUnario tipo -> ^( opUnario tipo ) | tipo -> tipo | ID -> ^( Id ID ) | incOp ID -> ^( IncAntes incOp ID ) | ID incOp -> ^( IncDepois incOp ID ) | call -> call | input_ -> input_ ) ;
	public final iParser.oper_return oper() throws  {
		iParser.oper_return retval = new iParser.oper_return();
		retval.start = input.LT(1);

		Tree root_0 = null;

		Token ID127=null;
		Token ID131=null;
		Token ID133=null;
		Token ID134=null;
		ParserRuleReturnScope opUnario126 =null;
		ParserRuleReturnScope opUnario128 =null;
		ParserRuleReturnScope tipo129 =null;
		ParserRuleReturnScope tipo130 =null;
		ParserRuleReturnScope incOp132 =null;
		ParserRuleReturnScope incOp135 =null;
		ParserRuleReturnScope call136 =null;
		ParserRuleReturnScope input_137 =null;

		Tree ID127_tree=null;
		Tree ID131_tree=null;
		Tree ID133_tree=null;
		Tree ID134_tree=null;
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleSubtreeStream stream_opUnario=new RewriteRuleSubtreeStream(adaptor,"rule opUnario");
		RewriteRuleSubtreeStream stream_call=new RewriteRuleSubtreeStream(adaptor,"rule call");
		RewriteRuleSubtreeStream stream_incOp=new RewriteRuleSubtreeStream(adaptor,"rule incOp");
		RewriteRuleSubtreeStream stream_tipo=new RewriteRuleSubtreeStream(adaptor,"rule tipo");
		RewriteRuleSubtreeStream stream_input_=new RewriteRuleSubtreeStream(adaptor,"rule input_");

		try { dbg.enterRule(getGrammarFileName(), "oper");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(185, 0);

		try {
			// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:185:6: ( ( opUnario ID -> ^( opUnario ^( Id ID ) ) | opUnario tipo -> ^( opUnario tipo ) | tipo -> tipo | ID -> ^( Id ID ) | incOp ID -> ^( IncAntes incOp ID ) | ID incOp -> ^( IncDepois incOp ID ) | call -> call | input_ -> input_ ) )
			dbg.enterAlt(1);

			// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:186:2: ( opUnario ID -> ^( opUnario ^( Id ID ) ) | opUnario tipo -> ^( opUnario tipo ) | tipo -> tipo | ID -> ^( Id ID ) | incOp ID -> ^( IncAntes incOp ID ) | ID incOp -> ^( IncDepois incOp ID ) | call -> call | input_ -> input_ )
			{
			dbg.location(186,2);
			// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:186:2: ( opUnario ID -> ^( opUnario ^( Id ID ) ) | opUnario tipo -> ^( opUnario tipo ) | tipo -> tipo | ID -> ^( Id ID ) | incOp ID -> ^( IncAntes incOp ID ) | ID incOp -> ^( IncDepois incOp ID ) | call -> call | input_ -> input_ )
			int alt29=8;
			try { dbg.enterSubRule(29);
			try { dbg.enterDecision(29, decisionCanBacktrack[29]);

			try {
				isCyclicDecision = true;
				alt29 = dfa29.predict(input);
			}
			catch (NoViableAltException nvae) {
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(29);}

			switch (alt29) {
				case 1 :
					dbg.enterAlt(1);

					// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:186:4: opUnario ID
					{
					dbg.location(186,4);
					pushFollow(FOLLOW_opUnario_in_oper2856);
					opUnario126=opUnario();
					state._fsp--;

					stream_opUnario.add(opUnario126.getTree());dbg.location(186,13);
					ID127=(Token)match(input,ID,FOLLOW_ID_in_oper2858);  
					stream_ID.add(ID127);

					// AST REWRITE
					// elements: ID, opUnario
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Tree)adaptor.nil();
					// 186:16: -> ^( opUnario ^( Id ID ) )
					{
						dbg.location(186,19);
						// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:186:19: ^( opUnario ^( Id ID ) )
						{
						Tree root_1 = (Tree)adaptor.nil();
						dbg.location(186,21);
						root_1 = (Tree)adaptor.becomeRoot(stream_opUnario.nextNode(), root_1);
						dbg.location(186,30);
						// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:186:30: ^( Id ID )
						{
						Tree root_2 = (Tree)adaptor.nil();
						dbg.location(186,32);
						root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Id, "Id"), root_2);
						dbg.location(186,35);
						adaptor.addChild(root_2, stream_ID.nextNode());
						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:187:4: opUnario tipo
					{
					dbg.location(187,4);
					pushFollow(FOLLOW_opUnario_in_oper2875);
					opUnario128=opUnario();
					state._fsp--;

					stream_opUnario.add(opUnario128.getTree());dbg.location(187,13);
					pushFollow(FOLLOW_tipo_in_oper2877);
					tipo129=tipo();
					state._fsp--;

					stream_tipo.add(tipo129.getTree());
					// AST REWRITE
					// elements: opUnario, tipo
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Tree)adaptor.nil();
					// 187:18: -> ^( opUnario tipo )
					{
						dbg.location(187,21);
						// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:187:21: ^( opUnario tipo )
						{
						Tree root_1 = (Tree)adaptor.nil();
						dbg.location(187,23);
						root_1 = (Tree)adaptor.becomeRoot(stream_opUnario.nextNode(), root_1);
						dbg.location(187,32);
						adaptor.addChild(root_1, stream_tipo.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:188:4: tipo
					{
					dbg.location(188,4);
					pushFollow(FOLLOW_tipo_in_oper2890);
					tipo130=tipo();
					state._fsp--;

					stream_tipo.add(tipo130.getTree());
					// AST REWRITE
					// elements: tipo
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Tree)adaptor.nil();
					// 188:9: -> tipo
					{
						dbg.location(188,12);
						adaptor.addChild(root_0, stream_tipo.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:189:4: ID
					{
					dbg.location(189,4);
					ID131=(Token)match(input,ID,FOLLOW_ID_in_oper2900);  
					stream_ID.add(ID131);

					// AST REWRITE
					// elements: ID
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Tree)adaptor.nil();
					// 189:7: -> ^( Id ID )
					{
						dbg.location(189,10);
						// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:189:10: ^( Id ID )
						{
						Tree root_1 = (Tree)adaptor.nil();
						dbg.location(189,12);
						root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Id, "Id"), root_1);
						dbg.location(189,15);
						adaptor.addChild(root_1, stream_ID.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:190:4: incOp ID
					{
					dbg.location(190,4);
					pushFollow(FOLLOW_incOp_in_oper2913);
					incOp132=incOp();
					state._fsp--;

					stream_incOp.add(incOp132.getTree());dbg.location(190,10);
					ID133=(Token)match(input,ID,FOLLOW_ID_in_oper2915);  
					stream_ID.add(ID133);

					// AST REWRITE
					// elements: ID, incOp
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Tree)adaptor.nil();
					// 190:13: -> ^( IncAntes incOp ID )
					{
						dbg.location(190,16);
						// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:190:16: ^( IncAntes incOp ID )
						{
						Tree root_1 = (Tree)adaptor.nil();
						dbg.location(190,18);
						root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(IncAntes, "IncAntes"), root_1);
						dbg.location(190,27);
						adaptor.addChild(root_1, stream_incOp.nextTree());dbg.location(190,33);
						adaptor.addChild(root_1, stream_ID.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:191:4: ID incOp
					{
					dbg.location(191,4);
					ID134=(Token)match(input,ID,FOLLOW_ID_in_oper2930);  
					stream_ID.add(ID134);
					dbg.location(191,7);
					pushFollow(FOLLOW_incOp_in_oper2932);
					incOp135=incOp();
					state._fsp--;

					stream_incOp.add(incOp135.getTree());
					// AST REWRITE
					// elements: incOp, ID
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Tree)adaptor.nil();
					// 191:13: -> ^( IncDepois incOp ID )
					{
						dbg.location(191,16);
						// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:191:16: ^( IncDepois incOp ID )
						{
						Tree root_1 = (Tree)adaptor.nil();
						dbg.location(191,18);
						root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(IncDepois, "IncDepois"), root_1);
						dbg.location(191,28);
						adaptor.addChild(root_1, stream_incOp.nextTree());dbg.location(191,34);
						adaptor.addChild(root_1, stream_ID.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 7 :
					dbg.enterAlt(7);

					// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:192:4: call
					{
					dbg.location(192,4);
					pushFollow(FOLLOW_call_in_oper2947);
					call136=call();
					state._fsp--;

					stream_call.add(call136.getTree());
					// AST REWRITE
					// elements: call
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Tree)adaptor.nil();
					// 192:9: -> call
					{
						dbg.location(192,12);
						adaptor.addChild(root_0, stream_call.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 8 :
					dbg.enterAlt(8);

					// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:193:4: input_
					{
					dbg.location(193,4);
					pushFollow(FOLLOW_input__in_oper2956);
					input_137=input_();
					state._fsp--;

					stream_input_.add(input_137.getTree());
					// AST REWRITE
					// elements: input_
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Tree)adaptor.nil();
					// 193:11: -> input_
					{
						dbg.location(193,14);
						adaptor.addChild(root_0, stream_input_.nextTree());
					}


					retval.tree = root_0;

					}
					break;

			}
			} finally {dbg.exitSubRule(29);}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(195, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "oper");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "oper"


	public static class incOp_return extends ParserRuleReturnScope {
		Tree tree;
		@Override
		public Tree getTree() { return tree; }
	};


	// $ANTLR start "incOp"
	// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:197:1: incOp : ( '++' -> ^( Inc ) | '--' -> ^( Dec ) ) ;
	public final iParser.incOp_return incOp() throws  {
		iParser.incOp_return retval = new iParser.incOp_return();
		retval.start = input.LT(1);

		Tree root_0 = null;

		Token string_literal138=null;
		Token string_literal139=null;

		Tree string_literal138_tree=null;
		Tree string_literal139_tree=null;
		RewriteRuleTokenStream stream_94=new RewriteRuleTokenStream(adaptor,"token 94");
		RewriteRuleTokenStream stream_90=new RewriteRuleTokenStream(adaptor,"token 90");

		try { dbg.enterRule(getGrammarFileName(), "incOp");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(197, 0);

		try {
			// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:197:7: ( ( '++' -> ^( Inc ) | '--' -> ^( Dec ) ) )
			dbg.enterAlt(1);

			// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:198:2: ( '++' -> ^( Inc ) | '--' -> ^( Dec ) )
			{
			dbg.location(198,2);
			// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:198:2: ( '++' -> ^( Inc ) | '--' -> ^( Dec ) )
			int alt30=2;
			try { dbg.enterSubRule(30);
			try { dbg.enterDecision(30, decisionCanBacktrack[30]);

			int LA30_0 = input.LA(1);
			if ( (LA30_0==90) ) {
				alt30=1;
			}
			else if ( (LA30_0==94) ) {
				alt30=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 30, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(30);}

			switch (alt30) {
				case 1 :
					dbg.enterAlt(1);

					// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:198:4: '++'
					{
					dbg.location(198,4);
					string_literal138=(Token)match(input,90,FOLLOW_90_in_incOp2978);  
					stream_90.add(string_literal138);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Tree)adaptor.nil();
					// 198:9: -> ^( Inc )
					{
						dbg.location(198,12);
						// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:198:12: ^( Inc )
						{
						Tree root_1 = (Tree)adaptor.nil();
						dbg.location(198,14);
						root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Inc, "Inc"), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:198:21: '--'
					{
					dbg.location(198,21);
					string_literal139=(Token)match(input,94,FOLLOW_94_in_incOp2988);  
					stream_94.add(string_literal139);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Tree)adaptor.nil();
					// 198:26: -> ^( Dec )
					{
						dbg.location(198,29);
						// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:198:29: ^( Dec )
						{
						Tree root_1 = (Tree)adaptor.nil();
						dbg.location(198,31);
						root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Dec, "Dec"), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			} finally {dbg.exitSubRule(30);}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(199, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "incOp");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "incOp"


	public static class opUnario_return extends ParserRuleReturnScope {
		Tree tree;
		@Override
		public Tree getTree() { return tree; }
	};


	// $ANTLR start "opUnario"
	// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:201:1: opUnario : ( '+' -> ^( Pos ) | '-' -> ^( Neg ) | '!' -> ^( Nao ) ) ;
	public final iParser.opUnario_return opUnario() throws  {
		iParser.opUnario_return retval = new iParser.opUnario_return();
		retval.start = input.LT(1);

		Tree root_0 = null;

		Token char_literal140=null;
		Token char_literal141=null;
		Token char_literal142=null;

		Tree char_literal140_tree=null;
		Tree char_literal141_tree=null;
		Tree char_literal142_tree=null;
		RewriteRuleTokenStream stream_93=new RewriteRuleTokenStream(adaptor,"token 93");
		RewriteRuleTokenStream stream_81=new RewriteRuleTokenStream(adaptor,"token 81");
		RewriteRuleTokenStream stream_89=new RewriteRuleTokenStream(adaptor,"token 89");

		try { dbg.enterRule(getGrammarFileName(), "opUnario");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(201, 0);

		try {
			// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:201:10: ( ( '+' -> ^( Pos ) | '-' -> ^( Neg ) | '!' -> ^( Nao ) ) )
			dbg.enterAlt(1);

			// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:202:2: ( '+' -> ^( Pos ) | '-' -> ^( Neg ) | '!' -> ^( Nao ) )
			{
			dbg.location(202,2);
			// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:202:2: ( '+' -> ^( Pos ) | '-' -> ^( Neg ) | '!' -> ^( Nao ) )
			int alt31=3;
			try { dbg.enterSubRule(31);
			try { dbg.enterDecision(31, decisionCanBacktrack[31]);

			switch ( input.LA(1) ) {
			case 89:
				{
				alt31=1;
				}
				break;
			case 93:
				{
				alt31=2;
				}
				break;
			case 81:
				{
				alt31=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 31, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(31);}

			switch (alt31) {
				case 1 :
					dbg.enterAlt(1);

					// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:202:4: '+'
					{
					dbg.location(202,4);
					char_literal140=(Token)match(input,89,FOLLOW_89_in_opUnario3009);  
					stream_89.add(char_literal140);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Tree)adaptor.nil();
					// 202:8: -> ^( Pos )
					{
						dbg.location(202,11);
						// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:202:11: ^( Pos )
						{
						Tree root_1 = (Tree)adaptor.nil();
						dbg.location(202,13);
						root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Pos, "Pos"), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:203:4: '-'
					{
					dbg.location(203,4);
					char_literal141=(Token)match(input,93,FOLLOW_93_in_opUnario3020);  
					stream_93.add(char_literal141);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Tree)adaptor.nil();
					// 203:8: -> ^( Neg )
					{
						dbg.location(203,11);
						// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:203:11: ^( Neg )
						{
						Tree root_1 = (Tree)adaptor.nil();
						dbg.location(203,13);
						root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Neg, "Neg"), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:204:4: '!'
					{
					dbg.location(204,4);
					char_literal142=(Token)match(input,81,FOLLOW_81_in_opUnario3031);  
					stream_81.add(char_literal142);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Tree)adaptor.nil();
					// 204:8: -> ^( Nao )
					{
						dbg.location(204,11);
						// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:204:11: ^( Nao )
						{
						Tree root_1 = (Tree)adaptor.nil();
						dbg.location(204,13);
						root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Nao, "Nao"), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			} finally {dbg.exitSubRule(31);}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(206, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "opUnario");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "opUnario"


	public static class boolean__return extends ParserRuleReturnScope {
		Tree tree;
		@Override
		public Tree getTree() { return tree; }
	};


	// $ANTLR start "boolean_"
	// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:208:1: boolean_ : ( 'true' -> ^( True ) | 'false' -> ^( False ) ) ;
	public final iParser.boolean__return boolean_() throws  {
		iParser.boolean__return retval = new iParser.boolean__return();
		retval.start = input.LT(1);

		Tree root_0 = null;

		Token string_literal143=null;
		Token string_literal144=null;

		Tree string_literal143_tree=null;
		Tree string_literal144_tree=null;
		RewriteRuleTokenStream stream_110=new RewriteRuleTokenStream(adaptor,"token 110");
		RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");

		try { dbg.enterRule(getGrammarFileName(), "boolean_");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(208, 0);

		try {
			// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:208:10: ( ( 'true' -> ^( True ) | 'false' -> ^( False ) ) )
			dbg.enterAlt(1);

			// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:208:12: ( 'true' -> ^( True ) | 'false' -> ^( False ) )
			{
			dbg.location(208,12);
			// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:208:12: ( 'true' -> ^( True ) | 'false' -> ^( False ) )
			int alt32=2;
			try { dbg.enterSubRule(32);
			try { dbg.enterDecision(32, decisionCanBacktrack[32]);

			int LA32_0 = input.LA(1);
			if ( (LA32_0==118) ) {
				alt32=1;
			}
			else if ( (LA32_0==110) ) {
				alt32=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 32, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(32);}

			switch (alt32) {
				case 1 :
					dbg.enterAlt(1);

					// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:208:13: 'true'
					{
					dbg.location(208,13);
					string_literal143=(Token)match(input,118,FOLLOW_118_in_boolean_3052);  
					stream_118.add(string_literal143);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Tree)adaptor.nil();
					// 208:20: -> ^( True )
					{
						dbg.location(208,23);
						// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:208:23: ^( True )
						{
						Tree root_1 = (Tree)adaptor.nil();
						dbg.location(208,25);
						root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(True, "True"), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:208:33: 'false'
					{
					dbg.location(208,33);
					string_literal144=(Token)match(input,110,FOLLOW_110_in_boolean_3062);  
					stream_110.add(string_literal144);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Tree)adaptor.nil();
					// 208:41: -> ^( False )
					{
						dbg.location(208,44);
						// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:208:44: ^( False )
						{
						Tree root_1 = (Tree)adaptor.nil();
						dbg.location(208,46);
						root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(False, "False"), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			} finally {dbg.exitSubRule(32);}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(209, 2);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "boolean_");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "boolean_"


	public static class comentarios_return extends ParserRuleReturnScope {
		Tree tree;
		@Override
		public Tree getTree() { return tree; }
	};


	// $ANTLR start "comentarios"
	// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:212:1: comentarios : ( ( comentario )* -> ( comentario )* ) ;
	public final iParser.comentarios_return comentarios() throws  {
		iParser.comentarios_return retval = new iParser.comentarios_return();
		retval.start = input.LT(1);

		Tree root_0 = null;

		ParserRuleReturnScope comentario145 =null;

		RewriteRuleSubtreeStream stream_comentario=new RewriteRuleSubtreeStream(adaptor,"rule comentario");

		try { dbg.enterRule(getGrammarFileName(), "comentarios");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(212, 0);

		try {
			// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:212:13: ( ( ( comentario )* -> ( comentario )* ) )
			dbg.enterAlt(1);

			// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:213:2: ( ( comentario )* -> ( comentario )* )
			{
			dbg.location(213,2);
			// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:213:2: ( ( comentario )* -> ( comentario )* )
			dbg.enterAlt(1);

			// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:213:4: ( comentario )*
			{
			dbg.location(213,4);
			// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:213:4: ( comentario )*
			try { dbg.enterSubRule(33);

			loop33:
			while (true) {
				int alt33=2;
				try { dbg.enterDecision(33, decisionCanBacktrack[33]);

				int LA33_0 = input.LA(1);
				if ( (LA33_0==COMENTARIO_LINHA) ) {
					alt33=1;
				}
				else if ( (LA33_0==COMENTARIO_LINHAS) ) {
					alt33=1;
				}

				} finally {dbg.exitDecision(33);}

				switch (alt33) {
				case 1 :
					dbg.enterAlt(1);

					// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:213:4: comentario
					{
					dbg.location(213,4);
					pushFollow(FOLLOW_comentario_in_comentarios3085);
					comentario145=comentario();
					state._fsp--;

					stream_comentario.add(comentario145.getTree());
					}
					break;

				default :
					break loop33;
				}
			}
			} finally {dbg.exitSubRule(33);}

			// AST REWRITE
			// elements: comentario
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Tree)adaptor.nil();
			// 213:16: -> ( comentario )*
			{
				dbg.location(213,19);
				// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:213:19: ( comentario )*
				while ( stream_comentario.hasNext() ) {
					dbg.location(213,19);
					adaptor.addChild(root_0, stream_comentario.nextTree());
				}
				stream_comentario.reset();

			}


			retval.tree = root_0;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(216, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "comentarios");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "comentarios"


	public static class comentario_return extends ParserRuleReturnScope {
		Tree tree;
		@Override
		public Tree getTree() { return tree; }
	};


	// $ANTLR start "comentario"
	// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:218:1: comentario : ( COMENTARIO_LINHA -> ^( Comentario COMENTARIO_LINHA ) | COMENTARIO_LINHAS -> ^( Comentario COMENTARIO_LINHAS ) ) ;
	public final iParser.comentario_return comentario() throws  {
		iParser.comentario_return retval = new iParser.comentario_return();
		retval.start = input.LT(1);

		Tree root_0 = null;

		Token COMENTARIO_LINHA146=null;
		Token COMENTARIO_LINHAS147=null;

		Tree COMENTARIO_LINHA146_tree=null;
		Tree COMENTARIO_LINHAS147_tree=null;
		RewriteRuleTokenStream stream_COMENTARIO_LINHA=new RewriteRuleTokenStream(adaptor,"token COMENTARIO_LINHA");
		RewriteRuleTokenStream stream_COMENTARIO_LINHAS=new RewriteRuleTokenStream(adaptor,"token COMENTARIO_LINHAS");

		try { dbg.enterRule(getGrammarFileName(), "comentario");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(218, 0);

		try {
			// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:218:12: ( ( COMENTARIO_LINHA -> ^( Comentario COMENTARIO_LINHA ) | COMENTARIO_LINHAS -> ^( Comentario COMENTARIO_LINHAS ) ) )
			dbg.enterAlt(1);

			// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:219:2: ( COMENTARIO_LINHA -> ^( Comentario COMENTARIO_LINHA ) | COMENTARIO_LINHAS -> ^( Comentario COMENTARIO_LINHAS ) )
			{
			dbg.location(219,2);
			// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:219:2: ( COMENTARIO_LINHA -> ^( Comentario COMENTARIO_LINHA ) | COMENTARIO_LINHAS -> ^( Comentario COMENTARIO_LINHAS ) )
			int alt34=2;
			try { dbg.enterSubRule(34);
			try { dbg.enterDecision(34, decisionCanBacktrack[34]);

			int LA34_0 = input.LA(1);
			if ( (LA34_0==COMENTARIO_LINHA) ) {
				alt34=1;
			}
			else if ( (LA34_0==COMENTARIO_LINHAS) ) {
				alt34=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 34, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(34);}

			switch (alt34) {
				case 1 :
					dbg.enterAlt(1);

					// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:219:4: COMENTARIO_LINHA
					{
					dbg.location(219,4);
					COMENTARIO_LINHA146=(Token)match(input,COMENTARIO_LINHA,FOLLOW_COMENTARIO_LINHA_in_comentario3108);  
					stream_COMENTARIO_LINHA.add(COMENTARIO_LINHA146);

					// AST REWRITE
					// elements: COMENTARIO_LINHA
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Tree)adaptor.nil();
					// 219:21: -> ^( Comentario COMENTARIO_LINHA )
					{
						dbg.location(219,24);
						// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:219:24: ^( Comentario COMENTARIO_LINHA )
						{
						Tree root_1 = (Tree)adaptor.nil();
						dbg.location(219,26);
						root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentario, "Comentario"), root_1);
						dbg.location(219,37);
						adaptor.addChild(root_1, stream_COMENTARIO_LINHA.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:220:4: COMENTARIO_LINHAS
					{
					dbg.location(220,4);
					COMENTARIO_LINHAS147=(Token)match(input,COMENTARIO_LINHAS,FOLLOW_COMENTARIO_LINHAS_in_comentario3121);  
					stream_COMENTARIO_LINHAS.add(COMENTARIO_LINHAS147);

					// AST REWRITE
					// elements: COMENTARIO_LINHAS
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Tree)adaptor.nil();
					// 220:22: -> ^( Comentario COMENTARIO_LINHAS )
					{
						dbg.location(220,25);
						// /home/mario/Área de Trabalho/ATS/greenmsp/Tools/i2msp/Tom/gram/i.g:220:25: ^( Comentario COMENTARIO_LINHAS )
						{
						Tree root_1 = (Tree)adaptor.nil();
						dbg.location(220,27);
						root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comentario, "Comentario"), root_1);
						dbg.location(220,38);
						adaptor.addChild(root_1, stream_COMENTARIO_LINHAS.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			} finally {dbg.exitSubRule(34);}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(222, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "comentario");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "comentario"

	// Delegated rules


	protected DFA4 dfa4 = new DFA4(this);
	protected DFA6 dfa6 = new DFA6(this);
	protected DFA7 dfa7 = new DFA7(this);
	protected DFA9 dfa9 = new DFA9(this);
	protected DFA12 dfa12 = new DFA12(this);
	protected DFA13 dfa13 = new DFA13(this);
	protected DFA16 dfa16 = new DFA16(this);
	protected DFA17 dfa17 = new DFA17(this);
	protected DFA18 dfa18 = new DFA18(this);
	protected DFA19 dfa19 = new DFA19(this);
	protected DFA21 dfa21 = new DFA21(this);
	protected DFA23 dfa23 = new DFA23(this);
	protected DFA26 dfa26 = new DFA26(this);
	protected DFA28 dfa28 = new DFA28(this);
	protected DFA29 dfa29 = new DFA29(this);
	static final String DFA4_eotS =
		"\17\uffff";
	static final String DFA4_eofS =
		"\17\uffff";
	static final String DFA4_minS =
		"\15\110\2\uffff";
	static final String DFA4_maxS =
		"\3\167\7\114\3\146\2\uffff";
	static final String DFA4_acceptS =
		"\15\uffff\1\1\1\2";
	static final String DFA4_specialS =
		"\17\uffff}>";
	static final String[] DFA4_transitionS = {
			"\1\1\1\2\41\uffff\1\5\1\3\2\uffff\1\6\3\uffff\1\4\3\uffff\1\7",
			"\1\1\1\2\41\uffff\1\5\1\3\2\uffff\1\6\3\uffff\1\4\3\uffff\1\7",
			"\1\1\1\2\41\uffff\1\5\1\3\2\uffff\1\6\3\uffff\1\4\3\uffff\1\7",
			"\1\10\1\11\2\uffff\1\12",
			"\1\10\1\11\2\uffff\1\12",
			"\1\10\1\11\2\uffff\1\12",
			"\1\10\1\11\2\uffff\1\12",
			"\1\10\1\11\2\uffff\1\12",
			"\1\10\1\11\2\uffff\1\12",
			"\1\10\1\11\2\uffff\1\12",
			"\1\13\1\14\13\uffff\1\16\6\uffff\1\15\6\uffff\1\15\2\uffff\1\15",
			"\1\13\1\14\13\uffff\1\16\6\uffff\1\15\6\uffff\1\15\2\uffff\1\15",
			"\1\13\1\14\13\uffff\1\16\6\uffff\1\15\6\uffff\1\15\2\uffff\1\15",
			"",
			""
	};

	static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
	static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
	static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
	static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
	static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
	static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
	static final short[][] DFA4_transition;

	static {
		int numStates = DFA4_transitionS.length;
		DFA4_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
		}
	}

	protected class DFA4 extends DFA {

		public DFA4(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 4;
			this.eot = DFA4_eot;
			this.eof = DFA4_eof;
			this.min = DFA4_min;
			this.max = DFA4_max;
			this.accept = DFA4_accept;
			this.special = DFA4_special;
			this.transition = DFA4_transition;
		}
		@Override
		public String getDescription() {
			return "28:2: ( declaracao ';' -> declaracao | funcao -> funcao )";
		}
		public void error(NoViableAltException nvae) {
			dbg.recognitionException(nvae);
		}
	}

	static final String DFA6_eotS =
		"\6\uffff";
	static final String DFA6_eofS =
		"\6\uffff";
	static final String DFA6_minS =
		"\1\114\3\110\2\uffff";
	static final String DFA6_maxS =
		"\1\114\3\146\2\uffff";
	static final String DFA6_acceptS =
		"\4\uffff\1\1\1\2";
	static final String DFA6_specialS =
		"\6\uffff}>";
	static final String[] DFA6_transitionS = {
			"\1\1",
			"\1\2\1\3\22\uffff\1\4\6\uffff\1\4\2\uffff\1\5",
			"\1\2\1\3\22\uffff\1\4\6\uffff\1\4\2\uffff\1\5",
			"\1\2\1\3\22\uffff\1\4\6\uffff\1\4\2\uffff\1\5",
			"",
			""
	};

	static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
	static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
	static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
	static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
	static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
	static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
	static final short[][] DFA6_transition;

	static {
		int numStates = DFA6_transitionS.length;
		DFA6_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
		}
	}

	protected class DFA6 extends DFA {

		public DFA6(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 6;
			this.eot = DFA6_eot;
			this.eof = DFA6_eof;
			this.min = DFA6_min;
			this.max = DFA6_max;
			this.accept = DFA6_accept;
			this.special = DFA6_special;
			this.transition = DFA6_transition;
		}
		@Override
		public String getDescription() {
			return "38:2: ( ID c1= comentarios -> ^( Decl ID ^( Comentarios ( $c1)? ) ^( Comentarios ) Empty ^( Comentarios ) ) | ID c1= comentarios '=' c2= comentarios condicao c3= comentarios -> ^( Decl ID ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) condicao ^( Comentarios ( $c3)? ) ) )";
		}
		public void error(NoViableAltException nvae) {
			dbg.recognitionException(nvae);
		}
	}

	static final String DFA7_eotS =
		"\5\uffff";
	static final String DFA7_eofS =
		"\5\uffff";
	static final String DFA7_minS =
		"\3\110\2\uffff";
	static final String DFA7_maxS =
		"\3\167\2\uffff";
	static final String DFA7_acceptS =
		"\3\uffff\1\1\1\2";
	static final String DFA7_specialS =
		"\5\uffff}>";
	static final String[] DFA7_transitionS = {
			"\1\1\1\2\14\uffff\1\4\24\uffff\2\3\2\uffff\1\3\3\uffff\1\3\3\uffff\1"+
			"\3",
			"\1\1\1\2\14\uffff\1\4\24\uffff\2\3\2\uffff\1\3\3\uffff\1\3\3\uffff\1"+
			"\3",
			"\1\1\1\2\14\uffff\1\4\24\uffff\2\3\2\uffff\1\3\3\uffff\1\3\3\uffff\1"+
			"\3",
			"",
			""
	};

	static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
	static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
	static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
	static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
	static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
	static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
	static final short[][] DFA7_transition;

	static {
		int numStates = DFA7_transitionS.length;
		DFA7_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
		}
	}

	protected class DFA7 extends DFA {

		public DFA7(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 7;
			this.eot = DFA7_eot;
			this.eof = DFA7_eof;
			this.min = DFA7_min;
			this.max = DFA7_max;
			this.accept = DFA7_accept;
			this.special = DFA7_special;
			this.transition = DFA7_transition;
		}
		@Override
		public String getDescription() {
			return "44:76: ( argumentos )?";
		}
		public void error(NoViableAltException nvae) {
			dbg.recognitionException(nvae);
		}
	}

	static final String DFA9_eotS =
		"\11\uffff";
	static final String DFA9_eofS =
		"\11\uffff";
	static final String DFA9_minS =
		"\3\110\6\uffff";
	static final String DFA9_maxS =
		"\3\170\6\uffff";
	static final String DFA9_acceptS =
		"\3\uffff\1\1\1\2\1\3\1\4\1\5\1\6";
	static final String DFA9_specialS =
		"\11\uffff}>";
	static final String[] DFA9_transitionS = {
			"\1\1\1\2\2\uffff\1\7\43\uffff\1\4\1\3\2\uffff\1\10\1\6\2\uffff\1\5",
			"\1\1\1\2\2\uffff\1\7\43\uffff\1\4\1\3\2\uffff\1\10\1\6\2\uffff\1\5",
			"\1\1\1\2\2\uffff\1\7\43\uffff\1\4\1\3\2\uffff\1\10\1\6\2\uffff\1\5",
			"",
			"",
			"",
			"",
			"",
			""
	};

	static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
	static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
	static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
	static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
	static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
	static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
	static final short[][] DFA9_transition;

	static {
		int numStates = DFA9_transitionS.length;
		DFA9_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
		}
	}

	protected class DFA9 extends DFA {

		public DFA9(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 9;
			this.eot = DFA9_eot;
			this.eof = DFA9_eof;
			this.min = DFA9_min;
			this.max = DFA9_max;
			this.accept = DFA9_accept;
			this.special = DFA9_special;
			this.transition = DFA9_transition;
		}
		@Override
		public String getDescription() {
			return "58:2: ( if_ -> if_ | for_ -> for_ | while_ -> while_ | return_ ';' -> return_ | call ';' -> ^( Exp call ) | print_ ';' -> print_ )";
		}
		public void error(NoViableAltException nvae) {
			dbg.recognitionException(nvae);
		}
	}

	static final String DFA12_eotS =
		"\5\uffff";
	static final String DFA12_eofS =
		"\5\uffff";
	static final String DFA12_minS =
		"\3\110\2\uffff";
	static final String DFA12_maxS =
		"\3\167\2\uffff";
	static final String DFA12_acceptS =
		"\3\uffff\1\1\1\2";
	static final String DFA12_specialS =
		"\5\uffff}>";
	static final String[] DFA12_transitionS = {
			"\1\1\1\2\2\uffff\1\4\36\uffff\2\3\2\uffff\1\3\3\uffff\1\3\3\uffff\1\3",
			"\1\1\1\2\2\uffff\1\4\36\uffff\2\3\2\uffff\1\3\3\uffff\1\3\3\uffff\1"+
			"\3",
			"\1\1\1\2\2\uffff\1\4\36\uffff\2\3\2\uffff\1\3\3\uffff\1\3\3\uffff\1"+
			"\3",
			"",
			""
	};

	static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
	static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
	static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
	static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
	static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
	static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
	static final short[][] DFA12_transition;

	static {
		int numStates = DFA12_transitionS.length;
		DFA12_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
		}
	}

	protected class DFA12 extends DFA {

		public DFA12(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 12;
			this.eot = DFA12_eot;
			this.eof = DFA12_eof;
			this.min = DFA12_min;
			this.max = DFA12_max;
			this.accept = DFA12_accept;
			this.special = DFA12_special;
			this.transition = DFA12_transition;
		}
		@Override
		public String getDescription() {
			return "76:2: ( declaracao -> declaracao | atribuicao -> atribuicao )";
		}
		public void error(NoViableAltException nvae) {
			dbg.recognitionException(nvae);
		}
	}

	static final String DFA13_eotS =
		"\5\uffff";
	static final String DFA13_eofS =
		"\5\uffff";
	static final String DFA13_minS =
		"\3\107\2\uffff";
	static final String DFA13_maxS =
		"\3\166\2\uffff";
	static final String DFA13_acceptS =
		"\3\uffff\1\1\1\2";
	static final String DFA13_specialS =
		"\5\uffff}>";
	static final String[] DFA13_transitionS = {
			"\1\3\1\1\1\2\1\uffff\3\3\3\uffff\1\3\4\uffff\1\4\2\uffff\2\3\2\uffff"+
			"\2\3\17\uffff\1\3\3\uffff\1\3\3\uffff\1\3",
			"\1\3\1\1\1\2\1\uffff\3\3\3\uffff\1\3\4\uffff\1\4\2\uffff\2\3\2\uffff"+
			"\2\3\17\uffff\1\3\3\uffff\1\3\3\uffff\1\3",
			"\1\3\1\1\1\2\1\uffff\3\3\3\uffff\1\3\4\uffff\1\4\2\uffff\2\3\2\uffff"+
			"\2\3\17\uffff\1\3\3\uffff\1\3\3\uffff\1\3",
			"",
			""
	};

	static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
	static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
	static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
	static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
	static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
	static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
	static final short[][] DFA13_transition;

	static {
		int numStates = DFA13_transitionS.length;
		DFA13_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
		}
	}

	protected class DFA13 extends DFA {

		public DFA13(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 13;
			this.eot = DFA13_eot;
			this.eof = DFA13_eof;
			this.min = DFA13_min;
			this.max = DFA13_max;
			this.accept = DFA13_accept;
			this.special = DFA13_special;
			this.transition = DFA13_transition;
		}
		@Override
		public String getDescription() {
			return "90:55: ( parametros )?";
		}
		public void error(NoViableAltException nvae) {
			dbg.recognitionException(nvae);
		}
	}

	static final String DFA16_eotS =
		"\11\uffff";
	static final String DFA16_eofS =
		"\11\uffff";
	static final String DFA16_minS =
		"\4\110\2\uffff\2\110\1\uffff";
	static final String DFA16_maxS =
		"\3\170\1\146\2\uffff\2\146\1\uffff";
	static final String DFA16_acceptS =
		"\4\uffff\1\2\1\3\2\uffff\1\1";
	static final String DFA16_specialS =
		"\11\uffff}>";
	static final String[] DFA16_transitionS = {
			"\1\1\1\2\2\uffff\1\3\36\uffff\2\4\2\uffff\1\4\2\5\1\uffff\1\4\2\5\1\uffff"+
			"\1\4\1\5",
			"\1\1\1\2\2\uffff\1\3\36\uffff\2\4\2\uffff\1\4\2\5\1\uffff\1\4\2\5\1"+
			"\uffff\1\4\1\5",
			"\1\1\1\2\2\uffff\1\3\36\uffff\2\4\2\uffff\1\4\2\5\1\uffff\1\4\2\5\1"+
			"\uffff\1\4\1\5",
			"\1\6\1\7\13\uffff\1\5\2\uffff\1\10\2\uffff\1\10\3\uffff\1\10\1\uffff"+
			"\1\10\4\uffff\1\10",
			"",
			"",
			"\1\6\1\7\13\uffff\1\5\2\uffff\1\10\2\uffff\1\10\3\uffff\1\10\1\uffff"+
			"\1\10\4\uffff\1\10",
			"\1\6\1\7\13\uffff\1\5\2\uffff\1\10\2\uffff\1\10\3\uffff\1\10\1\uffff"+
			"\1\10\4\uffff\1\10",
			""
	};

	static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
	static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
	static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
	static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
	static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
	static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
	static final short[][] DFA16_transition;

	static {
		int numStates = DFA16_transitionS.length;
		DFA16_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
		}
	}

	protected class DFA16 extends DFA {

		public DFA16(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 16;
			this.eot = DFA16_eot;
			this.eof = DFA16_eof;
			this.min = DFA16_min;
			this.max = DFA16_max;
			this.accept = DFA16_accept;
			this.special = DFA16_special;
			this.transition = DFA16_transition;
		}
		@Override
		public String getDescription() {
			return "114:2: ( atribuicao ';' -> atribuicao | declaracao ';' -> declaracao | instrucao -> instrucao )";
		}
		public void error(NoViableAltException nvae) {
			dbg.recognitionException(nvae);
		}
	}

	static final String DFA17_eotS =
		"\5\uffff";
	static final String DFA17_eofS =
		"\5\uffff";
	static final String DFA17_minS =
		"\3\110\2\uffff";
	static final String DFA17_maxS =
		"\3\152\2\uffff";
	static final String DFA17_acceptS =
		"\3\uffff\1\1\1\2";
	static final String DFA17_specialS =
		"\5\uffff}>";
	static final String[] DFA17_transitionS = {
			"\1\1\1\2\14\uffff\1\4\5\uffff\1\4\6\uffff\1\4\6\uffff\1\3",
			"\1\1\1\2\14\uffff\1\4\5\uffff\1\4\6\uffff\1\4\6\uffff\1\3",
			"\1\1\1\2\14\uffff\1\4\5\uffff\1\4\6\uffff\1\4\6\uffff\1\3",
			"",
			""
	};

	static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
	static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
	static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
	static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
	static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
	static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
	static final short[][] DFA17_transition;

	static {
		int numStates = DFA17_transitionS.length;
		DFA17_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
		}
	}

	protected class DFA17 extends DFA {

		public DFA17(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 17;
			this.eot = DFA17_eot;
			this.eof = DFA17_eof;
			this.min = DFA17_min;
			this.max = DFA17_max;
			this.accept = DFA17_accept;
			this.special = DFA17_special;
			this.transition = DFA17_transition;
		}
		@Override
		public String getDescription() {
			return "124:14: (c1= comentarios '?' c2= comentarios expressao c3= comentarios ':' c4= comentarios condicao -> ^( Condicional condicao_ou ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) expressao ^( Comentarios ( $c3)? ) ^( Comentarios ( $c4)? ) condicao ) | -> condicao_ou )";
		}
		public void error(NoViableAltException nvae) {
			dbg.recognitionException(nvae);
		}
	}

	static final String DFA18_eotS =
		"\5\uffff";
	static final String DFA18_eofS =
		"\5\uffff";
	static final String DFA18_minS =
		"\3\110\2\uffff";
	static final String DFA18_maxS =
		"\3\172\2\uffff";
	static final String DFA18_acceptS =
		"\3\uffff\1\2\1\1";
	static final String DFA18_specialS =
		"\5\uffff}>";
	static final String[] DFA18_transitionS = {
			"\1\1\1\2\14\uffff\1\3\5\uffff\1\3\6\uffff\1\3\6\uffff\1\3\17\uffff\1"+
			"\4",
			"\1\1\1\2\14\uffff\1\3\5\uffff\1\3\6\uffff\1\3\6\uffff\1\3\17\uffff\1"+
			"\4",
			"\1\1\1\2\14\uffff\1\3\5\uffff\1\3\6\uffff\1\3\6\uffff\1\3\17\uffff\1"+
			"\4",
			"",
			""
	};

	static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
	static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
	static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
	static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
	static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
	static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
	static final short[][] DFA18_transition;

	static {
		int numStates = DFA18_transitionS.length;
		DFA18_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
		}
	}

	protected class DFA18 extends DFA {

		public DFA18(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 18;
			this.eot = DFA18_eot;
			this.eof = DFA18_eof;
			this.min = DFA18_min;
			this.max = DFA18_max;
			this.accept = DFA18_accept;
			this.special = DFA18_special;
			this.transition = DFA18_transition;
		}
		@Override
		public String getDescription() {
			return "()* loopback of 130:29: (c1= comentarios '||' c2= comentarios c= condicao_e -> ^( Ou $condicao_ou ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) $c) )*";
		}
		public void error(NoViableAltException nvae) {
			dbg.recognitionException(nvae);
		}
	}

	static final String DFA19_eotS =
		"\5\uffff";
	static final String DFA19_eofS =
		"\5\uffff";
	static final String DFA19_minS =
		"\3\110\2\uffff";
	static final String DFA19_maxS =
		"\3\172\2\uffff";
	static final String DFA19_acceptS =
		"\3\uffff\1\2\1\1";
	static final String DFA19_specialS =
		"\5\uffff}>";
	static final String[] DFA19_transitionS = {
			"\1\1\1\2\12\uffff\1\4\1\uffff\1\3\5\uffff\1\3\6\uffff\1\3\6\uffff\1\3"+
			"\17\uffff\1\3",
			"\1\1\1\2\12\uffff\1\4\1\uffff\1\3\5\uffff\1\3\6\uffff\1\3\6\uffff\1"+
			"\3\17\uffff\1\3",
			"\1\1\1\2\12\uffff\1\4\1\uffff\1\3\5\uffff\1\3\6\uffff\1\3\6\uffff\1"+
			"\3\17\uffff\1\3",
			"",
			""
	};

	static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
	static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
	static final char[] DFA19_min = DFA.unpackEncodedStringToUnsignedChars(DFA19_minS);
	static final char[] DFA19_max = DFA.unpackEncodedStringToUnsignedChars(DFA19_maxS);
	static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
	static final short[] DFA19_special = DFA.unpackEncodedString(DFA19_specialS);
	static final short[][] DFA19_transition;

	static {
		int numStates = DFA19_transitionS.length;
		DFA19_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA19_transition[i] = DFA.unpackEncodedString(DFA19_transitionS[i]);
		}
	}

	protected class DFA19 extends DFA {

		public DFA19(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 19;
			this.eot = DFA19_eot;
			this.eof = DFA19_eof;
			this.min = DFA19_min;
			this.max = DFA19_max;
			this.accept = DFA19_accept;
			this.special = DFA19_special;
			this.transition = DFA19_transition;
		}
		@Override
		public String getDescription() {
			return "()* loopback of 134:47: (c1= comentarios '&&' c2= comentarios c= condicao_comparacao -> ^( E $condicao_e ^( Comentarios ( $c1)? ) ^( Comentarios ( $c2)? ) $c) )*";
		}
		public void error(NoViableAltException nvae) {
			dbg.recognitionException(nvae);
		}
	}

	static final String DFA21_eotS =
		"\5\uffff";
	static final String DFA21_eofS =
		"\5\uffff";
	static final String DFA21_minS =
		"\3\110\2\uffff";
	static final String DFA21_maxS =
		"\3\172\2\uffff";
	static final String DFA21_acceptS =
		"\3\uffff\1\2\1\1";
	static final String DFA21_specialS =
		"\5\uffff}>";
	static final String[] DFA21_transitionS = {
			"\1\1\1\2\12\uffff\1\3\1\uffff\1\3\5\uffff\1\3\6\uffff\1\3\2\4\2\uffff"+
			"\2\4\1\3\17\uffff\1\3",
			"\1\1\1\2\12\uffff\1\3\1\uffff\1\3\5\uffff\1\3\6\uffff\1\3\2\4\2\uffff"+
			"\2\4\1\3\17\uffff\1\3",
			"\1\1\1\2\12\uffff\1\3\1\uffff\1\3\5\uffff\1\3\6\uffff\1\3\2\4\2\uffff"+
			"\2\4\1\3\17\uffff\1\3",
			"",
			""
	};

	static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
	static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
	static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
	static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
	static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
	static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
	static final short[][] DFA21_transition;

	static {
		int numStates = DFA21_transitionS.length;
		DFA21_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
		}
	}

	protected class DFA21 extends DFA {

		public DFA21(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 21;
			this.eot = DFA21_eot;
			this.eof = DFA21_eof;
			this.min = DFA21_min;
			this.max = DFA21_max;
			this.accept = DFA21_accept;
			this.special = DFA21_special;
			this.transition = DFA21_transition;
		}
		@Override
		public String getDescription() {
			return "()* loopback of 138:46: (c1= comentarios ( '>' c2= comentarios c= condicao_igualdade -> ^( Comp $condicao_comparacao ^( Comentarios ( $c1)? ) ^( Maior ) ^( Comentarios ( $c2)? ) $c) | '<' c2= comentarios c= condicao_igualdade -> ^( Comp $condicao_comparacao ^( Comentarios ( $c1)? ) ^( Menor ) ^( Comentarios ( $c2)? ) $c) | '>=' c2= comentarios c= condicao_igualdade -> ^( Comp $condicao_comparacao ^( Comentarios ( $c1)? ) ^( MaiorQ ) ^( Comentarios ( $c2)? ) $c) | '<=' c2= comentarios c= condicao_igualdade -> ^( Comp $condicao_comparacao ^( Comentarios ( $c1)? ) ^( MenorQ ) ^( Comentarios ( $c2)? ) $c) ) )*";
		}
		public void error(NoViableAltException nvae) {
			dbg.recognitionException(nvae);
		}
	}

	static final String DFA23_eotS =
		"\5\uffff";
	static final String DFA23_eofS =
		"\5\uffff";
	static final String DFA23_minS =
		"\3\110\2\uffff";
	static final String DFA23_maxS =
		"\3\172\2\uffff";
	static final String DFA23_acceptS =
		"\3\uffff\1\2\1\1";
	static final String DFA23_specialS =
		"\5\uffff}>";
	static final String[] DFA23_transitionS = {
			"\1\1\1\2\10\uffff\1\4\1\uffff\1\3\1\uffff\1\3\5\uffff\1\3\6\uffff\3\3"+
			"\1\uffff\1\4\3\3\17\uffff\1\3",
			"\1\1\1\2\10\uffff\1\4\1\uffff\1\3\1\uffff\1\3\5\uffff\1\3\6\uffff\3"+
			"\3\1\uffff\1\4\3\3\17\uffff\1\3",
			"\1\1\1\2\10\uffff\1\4\1\uffff\1\3\1\uffff\1\3\5\uffff\1\3\6\uffff\3"+
			"\3\1\uffff\1\4\3\3\17\uffff\1\3",
			"",
			""
	};

	static final short[] DFA23_eot = DFA.unpackEncodedString(DFA23_eotS);
	static final short[] DFA23_eof = DFA.unpackEncodedString(DFA23_eofS);
	static final char[] DFA23_min = DFA.unpackEncodedStringToUnsignedChars(DFA23_minS);
	static final char[] DFA23_max = DFA.unpackEncodedStringToUnsignedChars(DFA23_maxS);
	static final short[] DFA23_accept = DFA.unpackEncodedString(DFA23_acceptS);
	static final short[] DFA23_special = DFA.unpackEncodedString(DFA23_specialS);
	static final short[][] DFA23_transition;

	static {
		int numStates = DFA23_transitionS.length;
		DFA23_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA23_transition[i] = DFA.unpackEncodedString(DFA23_transitionS[i]);
		}
	}

	protected class DFA23 extends DFA {

		public DFA23(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 23;
			this.eot = DFA23_eot;
			this.eof = DFA23_eof;
			this.min = DFA23_min;
			this.max = DFA23_max;
			this.accept = DFA23_accept;
			this.special = DFA23_special;
			this.transition = DFA23_transition;
		}
		@Override
		public String getDescription() {
			return "()* loopback of 147:27: (c1= comentarios ( '!=' c2= comentarios e= expressao -> ^( Comp $condicao_igualdade ^( Comentarios ( $c1)? ) ^( Dif ) ^( Comentarios ( $c2)? ) $e) | '==' c2= comentarios e= expressao -> ^( Comp $condicao_igualdade ^( Comentarios ( $c2)? ) ^( Igual ) ^( Comentarios ( $c2)? ) $e) ) )*";
		}
		public void error(NoViableAltException nvae) {
			dbg.recognitionException(nvae);
		}
	}

	static final String DFA26_eotS =
		"\5\uffff";
	static final String DFA26_eofS =
		"\5\uffff";
	static final String DFA26_minS =
		"\3\110\2\uffff";
	static final String DFA26_maxS =
		"\3\172\2\uffff";
	static final String DFA26_acceptS =
		"\3\uffff\1\2\1\1";
	static final String DFA26_specialS =
		"\5\uffff}>";
	static final String[] DFA26_transitionS = {
			"\1\1\1\2\10\uffff\1\3\1\uffff\1\3\1\uffff\1\3\2\uffff\1\4\2\uffff\1\3"+
			"\1\4\4\uffff\4\3\1\uffff\4\3\17\uffff\1\3",
			"\1\1\1\2\10\uffff\1\3\1\uffff\1\3\1\uffff\1\3\2\uffff\1\4\2\uffff\1"+
			"\3\1\4\4\uffff\4\3\1\uffff\4\3\17\uffff\1\3",
			"\1\1\1\2\10\uffff\1\3\1\uffff\1\3\1\uffff\1\3\2\uffff\1\4\2\uffff\1"+
			"\3\1\4\4\uffff\4\3\1\uffff\4\3\17\uffff\1\3",
			"",
			""
	};

	static final short[] DFA26_eot = DFA.unpackEncodedString(DFA26_eotS);
	static final short[] DFA26_eof = DFA.unpackEncodedString(DFA26_eofS);
	static final char[] DFA26_min = DFA.unpackEncodedStringToUnsignedChars(DFA26_minS);
	static final char[] DFA26_max = DFA.unpackEncodedStringToUnsignedChars(DFA26_maxS);
	static final short[] DFA26_accept = DFA.unpackEncodedString(DFA26_acceptS);
	static final short[] DFA26_special = DFA.unpackEncodedString(DFA26_specialS);
	static final short[][] DFA26_transition;

	static {
		int numStates = DFA26_transitionS.length;
		DFA26_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA26_transition[i] = DFA.unpackEncodedString(DFA26_transitionS[i]);
		}
	}

	protected class DFA26 extends DFA {

		public DFA26(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 26;
			this.eot = DFA26_eot;
			this.eof = DFA26_eof;
			this.min = DFA26_min;
			this.max = DFA26_max;
			this.accept = DFA26_accept;
			this.special = DFA26_special;
			this.transition = DFA26_transition;
		}
		@Override
		public String getDescription() {
			return "()* loopback of 171:33: (c1= comentarios ( '+' c2= comentarios e= expressaoNum -> ^( ExpNum $expressao ^( Comentarios ( $c1)? ) ^( Mais ) ^( Comentarios ( $c2)? ) $e) | '-' c2= comentarios e= expressaoNum -> ^( ExpNum $expressao ^( Comentarios ( $c1)? ) ^( Menos ) ^( Comentarios ( $c2)? ) $e) ) )*";
		}
		public void error(NoViableAltException nvae) {
			dbg.recognitionException(nvae);
		}
	}

	static final String DFA28_eotS =
		"\5\uffff";
	static final String DFA28_eofS =
		"\5\uffff";
	static final String DFA28_minS =
		"\3\110\2\uffff";
	static final String DFA28_maxS =
		"\3\172\2\uffff";
	static final String DFA28_acceptS =
		"\3\uffff\1\2\1\1";
	static final String DFA28_specialS =
		"\5\uffff}>";
	static final String[] DFA28_transitionS = {
			"\1\1\1\2\10\uffff\1\3\1\4\1\3\1\uffff\1\3\1\4\1\uffff\1\3\2\uffff\2\3"+
			"\2\uffff\1\4\1\uffff\4\3\1\uffff\4\3\17\uffff\1\3",
			"\1\1\1\2\10\uffff\1\3\1\4\1\3\1\uffff\1\3\1\4\1\uffff\1\3\2\uffff\2"+
			"\3\2\uffff\1\4\1\uffff\4\3\1\uffff\4\3\17\uffff\1\3",
			"\1\1\1\2\10\uffff\1\3\1\4\1\3\1\uffff\1\3\1\4\1\uffff\1\3\2\uffff\2"+
			"\3\2\uffff\1\4\1\uffff\4\3\1\uffff\4\3\17\uffff\1\3",
			"",
			""
	};

	static final short[] DFA28_eot = DFA.unpackEncodedString(DFA28_eotS);
	static final short[] DFA28_eof = DFA.unpackEncodedString(DFA28_eofS);
	static final char[] DFA28_min = DFA.unpackEncodedStringToUnsignedChars(DFA28_minS);
	static final char[] DFA28_max = DFA.unpackEncodedStringToUnsignedChars(DFA28_maxS);
	static final short[] DFA28_accept = DFA.unpackEncodedString(DFA28_acceptS);
	static final short[] DFA28_special = DFA.unpackEncodedString(DFA28_specialS);
	static final short[][] DFA28_transition;

	static {
		int numStates = DFA28_transitionS.length;
		DFA28_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA28_transition[i] = DFA.unpackEncodedString(DFA28_transitionS[i]);
		}
	}

	protected class DFA28 extends DFA {

		public DFA28(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 28;
			this.eot = DFA28_eot;
			this.eof = DFA28_eof;
			this.min = DFA28_min;
			this.max = DFA28_max;
			this.accept = DFA28_accept;
			this.special = DFA28_special;
			this.transition = DFA28_transition;
		}
		@Override
		public String getDescription() {
			return "()* loopback of 178:17: (c1= comentarios ( '*' c2= comentarios o= oper -> ^( ExpNum $expressaoNum ^( Comentarios ( $c1)? ) ^( Vezes ) ^( Comentarios ( $c2)? ) $o) | '/' c2= comentarios o= oper -> ^( ExpNum $expressaoNum ^( Comentarios ( $c1)? ) ^( Divide ) ^( Comentarios ( $c2)? ) $o) | '%' c2= comentarios o= oper -> ^( ExpNum $expressaoNum ^( Comentarios ( $c1)? ) ^( Mod ) ^( Comentarios ( $c2)? ) $o) ) )*";
		}
		public void error(NoViableAltException nvae) {
			dbg.recognitionException(nvae);
		}
	}

	static final String DFA29_eotS =
		"\21\uffff";
	static final String DFA29_eofS =
		"\21\uffff";
	static final String DFA29_minS =
		"\4\107\1\uffff\1\110\1\uffff\2\110\3\uffff\2\110\3\uffff";
	static final String DFA29_maxS =
		"\4\166\1\uffff\1\172\1\uffff\2\162\3\uffff\2\172\3\uffff";
	static final String DFA29_acceptS =
		"\4\uffff\1\3\1\uffff\1\5\2\uffff\1\10\1\1\1\2\2\uffff\1\4\1\6\1\7";
	static final String DFA29_specialS =
		"\21\uffff}>";
	static final String[] DFA29_transitionS = {
			"\1\4\1\7\1\10\1\uffff\1\4\1\5\1\4\3\uffff\1\3\7\uffff\1\1\1\6\2\uffff"+
			"\1\2\1\6\17\uffff\1\4\3\uffff\1\11\3\uffff\1\4",
			"\1\13\3\uffff\1\13\1\12\1\13\40\uffff\1\13\7\uffff\1\13",
			"\1\13\3\uffff\1\13\1\12\1\13\40\uffff\1\13\7\uffff\1\13",
			"\1\13\3\uffff\1\13\1\12\1\13\40\uffff\1\13\7\uffff\1\13",
			"",
			"\1\14\1\15\10\uffff\3\16\1\20\2\16\1\uffff\1\16\1\17\1\uffff\2\16\1"+
			"\17\1\uffff\1\16\1\uffff\4\16\1\uffff\4\16\17\uffff\1\16",
			"",
			"\1\7\1\10\2\uffff\1\20\45\uffff\1\11",
			"\1\7\1\10\2\uffff\1\20\45\uffff\1\11",
			"",
			"",
			"",
			"\1\14\1\15\10\uffff\3\16\1\20\2\16\1\uffff\1\16\2\uffff\2\16\2\uffff"+
			"\1\16\1\uffff\4\16\1\uffff\4\16\17\uffff\1\16",
			"\1\14\1\15\10\uffff\3\16\1\20\2\16\1\uffff\1\16\2\uffff\2\16\2\uffff"+
			"\1\16\1\uffff\4\16\1\uffff\4\16\17\uffff\1\16",
			"",
			"",
			""
	};

	static final short[] DFA29_eot = DFA.unpackEncodedString(DFA29_eotS);
	static final short[] DFA29_eof = DFA.unpackEncodedString(DFA29_eofS);
	static final char[] DFA29_min = DFA.unpackEncodedStringToUnsignedChars(DFA29_minS);
	static final char[] DFA29_max = DFA.unpackEncodedStringToUnsignedChars(DFA29_maxS);
	static final short[] DFA29_accept = DFA.unpackEncodedString(DFA29_acceptS);
	static final short[] DFA29_special = DFA.unpackEncodedString(DFA29_specialS);
	static final short[][] DFA29_transition;

	static {
		int numStates = DFA29_transitionS.length;
		DFA29_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA29_transition[i] = DFA.unpackEncodedString(DFA29_transitionS[i]);
		}
	}

	protected class DFA29 extends DFA {

		public DFA29(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 29;
			this.eot = DFA29_eot;
			this.eof = DFA29_eof;
			this.min = DFA29_min;
			this.max = DFA29_max;
			this.accept = DFA29_accept;
			this.special = DFA29_special;
			this.transition = DFA29_transition;
		}
		@Override
		public String getDescription() {
			return "186:2: ( opUnario ID -> ^( opUnario ^( Id ID ) ) | opUnario tipo -> ^( opUnario tipo ) | tipo -> tipo | ID -> ^( Id ID ) | incOp ID -> ^( IncAntes incOp ID ) | ID incOp -> ^( IncDepois incOp ID ) | call -> call | input_ -> input_ )";
		}
		public void error(NoViableAltException nvae) {
			dbg.recognitionException(nvae);
		}
	}

	public static final BitSet FOLLOW_108_in_idTipo56 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_115_in_idTipo66 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_107_in_idTipo76 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_111_in_idTipo86 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_119_in_idTipo96 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_tipo117 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_tipo129 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_in_tipo141 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_boolean__in_tipo153 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_programa_in_prog174 = new BitSet(new long[]{0x0000000000000000L,0x0088980000000300L});
	public static final BitSet FOLLOW_EOF_in_prog177 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declaracao_in_programa201 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_99_in_programa203 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_funcao_in_programa212 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_comentarios_in_declaracao232 = new BitSet(new long[]{0x0000000000000000L,0x0088980000000000L});
	public static final BitSet FOLLOW_idTipo_in_declaracao234 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001300L});
	public static final BitSet FOLLOW_comentarios_in_declaracao238 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_dec_nodo_in_declaracao240 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000300L});
	public static final BitSet FOLLOW_comentarios_in_declaracao246 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_92_in_declaracao248 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001300L});
	public static final BitSet FOLLOW_comentarios_in_declaracao252 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_dec_nodo_in_declaracao254 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000300L});
	public static final BitSet FOLLOW_ID_in_dec_nodo317 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000300L});
	public static final BitSet FOLLOW_comentarios_in_dec_nodo321 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_dec_nodo353 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000300L});
	public static final BitSet FOLLOW_comentarios_in_dec_nodo357 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
	public static final BitSet FOLLOW_102_in_dec_nodo359 = new BitSet(new long[]{0x0000000000000000L,0x0044400066023B80L});
	public static final BitSet FOLLOW_comentarios_in_dec_nodo363 = new BitSet(new long[]{0x0000000000000000L,0x0044400066023B80L});
	public static final BitSet FOLLOW_condicao_in_dec_nodo365 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000300L});
	public static final BitSet FOLLOW_comentarios_in_dec_nodo369 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_comentarios_in_funcao422 = new BitSet(new long[]{0x0000000000000000L,0x0088980000000000L});
	public static final BitSet FOLLOW_idTipo_in_funcao424 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001300L});
	public static final BitSet FOLLOW_comentarios_in_funcao428 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_ID_in_funcao430 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200300L});
	public static final BitSet FOLLOW_comentarios_in_funcao434 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_85_in_funcao436 = new BitSet(new long[]{0x0000000000000000L,0x0088980000400300L});
	public static final BitSet FOLLOW_comentarios_in_funcao440 = new BitSet(new long[]{0x0000000000000000L,0x0088980000400300L});
	public static final BitSet FOLLOW_argumentos_in_funcao442 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400300L});
	public static final BitSet FOLLOW_comentarios_in_funcao447 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_86_in_funcao449 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000300L});
	public static final BitSet FOLLOW_comentarios_in_funcao453 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_blocoCodigo_in_funcao455 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000300L});
	public static final BitSet FOLLOW_comentarios_in_funcao459 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_argumento_in_argumentos546 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
	public static final BitSet FOLLOW_92_in_argumentos550 = new BitSet(new long[]{0x0000000000000000L,0x0088980000000300L});
	public static final BitSet FOLLOW_argumento_in_argumentos552 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
	public static final BitSet FOLLOW_comentarios_in_argumento574 = new BitSet(new long[]{0x0000000000000000L,0x0088980000000000L});
	public static final BitSet FOLLOW_idTipo_in_argumento576 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001300L});
	public static final BitSet FOLLOW_comentarios_in_argumento580 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_ID_in_argumento582 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000300L});
	public static final BitSet FOLLOW_comentarios_in_argumento586 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_if__in_instrucao636 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_for__in_instrucao644 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_while__in_instrucao652 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_return__in_instrucao660 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_99_in_instrucao662 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_call_in_instrucao670 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_99_in_instrucao672 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_print__in_instrucao684 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_99_in_instrucao686 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_comentarios_in_if_705 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_113_in_if_707 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200300L});
	public static final BitSet FOLLOW_comentarios_in_if_711 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_85_in_if_713 = new BitSet(new long[]{0x0000000000000000L,0x0044400066023B80L});
	public static final BitSet FOLLOW_comentarios_in_if_717 = new BitSet(new long[]{0x0000000000000000L,0x0044400066023B80L});
	public static final BitSet FOLLOW_condicao_in_if_719 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400300L});
	public static final BitSet FOLLOW_comentarios_in_if_723 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_86_in_if_725 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000300L});
	public static final BitSet FOLLOW_comentarios_in_if_729 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_blocoCodigo_in_if_731 = new BitSet(new long[]{0x0000000000000002L,0x0000200000000000L});
	public static final BitSet FOLLOW_else__in_if_735 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_109_in_else_901 = new BitSet(new long[]{0x0000000000000000L,0x0202000000000300L});
	public static final BitSet FOLLOW_blocoCodigo_in_else_905 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_if__in_else_913 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_comentarios_in_for_933 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_112_in_for_935 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200300L});
	public static final BitSet FOLLOW_comentarios_in_for_939 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_85_in_for_941 = new BitSet(new long[]{0x0000000000000000L,0x0088980000001300L});
	public static final BitSet FOLLOW_for_declaracao_in_for_943 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_99_in_for_945 = new BitSet(new long[]{0x0000000000000000L,0x0044400066023B80L});
	public static final BitSet FOLLOW_comentarios_in_for_949 = new BitSet(new long[]{0x0000000000000000L,0x0044400066023B80L});
	public static final BitSet FOLLOW_condicao_in_for_951 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000300L});
	public static final BitSet FOLLOW_comentarios_in_for_955 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_99_in_for_957 = new BitSet(new long[]{0x0000000000000000L,0x0044400066023B80L});
	public static final BitSet FOLLOW_comentarios_in_for_961 = new BitSet(new long[]{0x0000000000000000L,0x0044400066023B80L});
	public static final BitSet FOLLOW_expressao_in_for_963 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400300L});
	public static final BitSet FOLLOW_comentarios_in_for_967 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_86_in_for_969 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000300L});
	public static final BitSet FOLLOW_comentarios_in_for_973 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_blocoCodigo_in_for_975 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000300L});
	public static final BitSet FOLLOW_comentarios_in_for_979 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declaracao_in_for_declaracao1071 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atribuicao_in_for_declaracao1080 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_comentarios_in_while_1103 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
	public static final BitSet FOLLOW_120_in_while_1105 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200300L});
	public static final BitSet FOLLOW_comentarios_in_while_1109 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_85_in_while_1111 = new BitSet(new long[]{0x0000000000000000L,0x0044400066023B80L});
	public static final BitSet FOLLOW_comentarios_in_while_1115 = new BitSet(new long[]{0x0000000000000000L,0x0044400066023B80L});
	public static final BitSet FOLLOW_condicao_in_while_1117 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400300L});
	public static final BitSet FOLLOW_comentarios_in_while_1121 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_86_in_while_1123 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000300L});
	public static final BitSet FOLLOW_comentarios_in_while_1127 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_blocoCodigo_in_while_1129 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000300L});
	public static final BitSet FOLLOW_comentarios_in_while_1133 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_comentarios_in_return_1207 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_117_in_return_1209 = new BitSet(new long[]{0x0000000000000000L,0x0044400066023B80L});
	public static final BitSet FOLLOW_comentarios_in_return_1213 = new BitSet(new long[]{0x0000000000000000L,0x0044400066023B80L});
	public static final BitSet FOLLOW_expressao_in_return_1215 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000300L});
	public static final BitSet FOLLOW_comentarios_in_return_1219 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_comentarios_in_call1267 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_ID_in_call1269 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200300L});
	public static final BitSet FOLLOW_comentarios_in_call1274 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_85_in_call1276 = new BitSet(new long[]{0x0000000000000000L,0x0044400066423B80L});
	public static final BitSet FOLLOW_comentarios_in_call1280 = new BitSet(new long[]{0x0000000000000000L,0x0044400066423B80L});
	public static final BitSet FOLLOW_parametros_in_call1282 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400300L});
	public static final BitSet FOLLOW_comentarios_in_call1287 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_86_in_call1289 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000300L});
	public static final BitSet FOLLOW_comentarios_in_call1293 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_comentarios_in_print_1361 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
	public static final BitSet FOLLOW_116_in_print_1363 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200300L});
	public static final BitSet FOLLOW_comentarios_in_print_1367 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_85_in_print_1369 = new BitSet(new long[]{0x0000000000000000L,0x0044400066023B80L});
	public static final BitSet FOLLOW_comentarios_in_print_1373 = new BitSet(new long[]{0x0000000000000000L,0x0044400066023B80L});
	public static final BitSet FOLLOW_expressao_in_print_1375 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400300L});
	public static final BitSet FOLLOW_comentarios_in_print_1379 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_86_in_print_1381 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000300L});
	public static final BitSet FOLLOW_comentarios_in_print_1385 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_comentarios_in_input_1451 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_114_in_input_1453 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200300L});
	public static final BitSet FOLLOW_comentarios_in_input_1457 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_85_in_input_1459 = new BitSet(new long[]{0x0000000000000000L,0x0088980000000300L});
	public static final BitSet FOLLOW_comentarios_in_input_1463 = new BitSet(new long[]{0x0000000000000000L,0x0088980000000000L});
	public static final BitSet FOLLOW_idTipo_in_input_1465 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400300L});
	public static final BitSet FOLLOW_comentarios_in_input_1469 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_86_in_input_1471 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000300L});
	public static final BitSet FOLLOW_comentarios_in_input_1475 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_parametro_in_parametros1535 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
	public static final BitSet FOLLOW_92_in_parametros1539 = new BitSet(new long[]{0x0000000000000000L,0x0044400066023B80L});
	public static final BitSet FOLLOW_parametro_in_parametros1541 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
	public static final BitSet FOLLOW_comentarios_in_parametro1562 = new BitSet(new long[]{0x0000000000000000L,0x0044400066023B80L});
	public static final BitSet FOLLOW_expressao_in_parametro1564 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000300L});
	public static final BitSet FOLLOW_comentarios_in_parametro1568 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_121_in_blocoCodigo1604 = new BitSet(new long[]{0x0000000000000000L,0x09BB980000001300L});
	public static final BitSet FOLLOW_codigo_in_blocoCodigo1606 = new BitSet(new long[]{0x0000000000000000L,0x09BB980000001300L});
	public static final BitSet FOLLOW_123_in_blocoCodigo1609 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atribuicao_in_codigo1631 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_99_in_codigo1633 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declaracao_in_codigo1642 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_99_in_codigo1644 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_instrucao_in_codigo1653 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_condicao_ou_in_condicao1676 = new BitSet(new long[]{0x0000000000000002L,0x0000040000000300L});
	public static final BitSet FOLLOW_comentarios_in_condicao1682 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_106_in_condicao1684 = new BitSet(new long[]{0x0000000000000000L,0x0044400066023B80L});
	public static final BitSet FOLLOW_comentarios_in_condicao1688 = new BitSet(new long[]{0x0000000000000000L,0x0044400066023B80L});
	public static final BitSet FOLLOW_expressao_in_condicao1690 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000300L});
	public static final BitSet FOLLOW_comentarios_in_condicao1694 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
	public static final BitSet FOLLOW_98_in_condicao1696 = new BitSet(new long[]{0x0000000000000000L,0x0044400066023B80L});
	public static final BitSet FOLLOW_comentarios_in_condicao1700 = new BitSet(new long[]{0x0000000000000000L,0x0044400066023B80L});
	public static final BitSet FOLLOW_condicao_in_condicao1702 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_condicao_e_in_condicao_ou1776 = new BitSet(new long[]{0x0000000000000002L,0x0400000000000300L});
	public static final BitSet FOLLOW_comentarios_in_condicao_ou1787 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_122_in_condicao_ou1789 = new BitSet(new long[]{0x0000000000000000L,0x0044400066023B80L});
	public static final BitSet FOLLOW_comentarios_in_condicao_ou1793 = new BitSet(new long[]{0x0000000000000000L,0x0044400066023B80L});
	public static final BitSet FOLLOW_condicao_e_in_condicao_ou1797 = new BitSet(new long[]{0x0000000000000002L,0x0400000000000300L});
	public static final BitSet FOLLOW_condicao_comparacao_in_condicao_e1842 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100300L});
	public static final BitSet FOLLOW_comentarios_in_condicao_e1853 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_84_in_condicao_e1855 = new BitSet(new long[]{0x0000000000000000L,0x0044400066023B80L});
	public static final BitSet FOLLOW_comentarios_in_condicao_e1859 = new BitSet(new long[]{0x0000000000000000L,0x0044400066023B80L});
	public static final BitSet FOLLOW_condicao_comparacao_in_condicao_e1863 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100300L});
	public static final BitSet FOLLOW_condicao_igualdade_in_condicao_comparacao1908 = new BitSet(new long[]{0x0000000000000002L,0x0000033000000300L});
	public static final BitSet FOLLOW_comentarios_in_condicao_comparacao1920 = new BitSet(new long[]{0x0000000000000000L,0x0000033000000000L});
	public static final BitSet FOLLOW_104_in_condicao_comparacao1924 = new BitSet(new long[]{0x0000000000000000L,0x0044400066023B80L});
	public static final BitSet FOLLOW_comentarios_in_condicao_comparacao1928 = new BitSet(new long[]{0x0000000000000000L,0x0044400066023B80L});
	public static final BitSet FOLLOW_condicao_igualdade_in_condicao_comparacao1932 = new BitSet(new long[]{0x0000000000000002L,0x0000033000000300L});
	public static final BitSet FOLLOW_100_in_condicao_comparacao1986 = new BitSet(new long[]{0x0000000000000000L,0x0044400066023B80L});
	public static final BitSet FOLLOW_comentarios_in_condicao_comparacao1990 = new BitSet(new long[]{0x0000000000000000L,0x0044400066023B80L});
	public static final BitSet FOLLOW_condicao_igualdade_in_condicao_comparacao1994 = new BitSet(new long[]{0x0000000000000002L,0x0000033000000300L});
	public static final BitSet FOLLOW_105_in_condicao_comparacao2048 = new BitSet(new long[]{0x0000000000000000L,0x0044400066023B80L});
	public static final BitSet FOLLOW_comentarios_in_condicao_comparacao2052 = new BitSet(new long[]{0x0000000000000000L,0x0044400066023B80L});
	public static final BitSet FOLLOW_condicao_igualdade_in_condicao_comparacao2056 = new BitSet(new long[]{0x0000000000000002L,0x0000033000000300L});
	public static final BitSet FOLLOW_101_in_condicao_comparacao2110 = new BitSet(new long[]{0x0000000000000000L,0x0044400066023B80L});
	public static final BitSet FOLLOW_comentarios_in_condicao_comparacao2114 = new BitSet(new long[]{0x0000000000000000L,0x0044400066023B80L});
	public static final BitSet FOLLOW_condicao_igualdade_in_condicao_comparacao2118 = new BitSet(new long[]{0x0000000000000002L,0x0000033000000300L});
	public static final BitSet FOLLOW_expressao_in_condicao_igualdade2198 = new BitSet(new long[]{0x0000000000000002L,0x0000008000040300L});
	public static final BitSet FOLLOW_comentarios_in_condicao_igualdade2209 = new BitSet(new long[]{0x0000000000000000L,0x0000008000040000L});
	public static final BitSet FOLLOW_82_in_condicao_igualdade2213 = new BitSet(new long[]{0x0000000000000000L,0x0044400066023B80L});
	public static final BitSet FOLLOW_comentarios_in_condicao_igualdade2217 = new BitSet(new long[]{0x0000000000000000L,0x0044400066023B80L});
	public static final BitSet FOLLOW_expressao_in_condicao_igualdade2221 = new BitSet(new long[]{0x0000000000000002L,0x0000008000040300L});
	public static final BitSet FOLLOW_103_in_condicao_igualdade2271 = new BitSet(new long[]{0x0000000000000000L,0x0044400066023B80L});
	public static final BitSet FOLLOW_comentarios_in_condicao_igualdade2275 = new BitSet(new long[]{0x0000000000000000L,0x0044400066023B80L});
	public static final BitSet FOLLOW_expressao_in_condicao_igualdade2279 = new BitSet(new long[]{0x0000000000000002L,0x0000008000040300L});
	public static final BitSet FOLLOW_comentarios_in_atribuicao2356 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_ID_in_atribuicao2358 = new BitSet(new long[]{0x0000000000000000L,0x0000004289000300L});
	public static final BitSet FOLLOW_comentarios_in_atribuicao2362 = new BitSet(new long[]{0x0000000000000000L,0x0000004289000000L});
	public static final BitSet FOLLOW_opAtribuicao_in_atribuicao2364 = new BitSet(new long[]{0x0000000000000000L,0x0044400066023B80L});
	public static final BitSet FOLLOW_comentarios_in_atribuicao2368 = new BitSet(new long[]{0x0000000000000000L,0x0044400066023B80L});
	public static final BitSet FOLLOW_condicao_in_atribuicao2370 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000300L});
	public static final BitSet FOLLOW_comentarios_in_atribuicao2374 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_102_in_opAtribuicao2433 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_88_in_opAtribuicao2444 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_97_in_opAtribuicao2455 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_91_in_opAtribuicao2466 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_95_in_opAtribuicao2477 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expressaoNum_in_expressao2503 = new BitSet(new long[]{0x0000000000000002L,0x0000000022000300L});
	public static final BitSet FOLLOW_comentarios_in_expressao2514 = new BitSet(new long[]{0x0000000000000000L,0x0000000022000000L});
	public static final BitSet FOLLOW_89_in_expressao2518 = new BitSet(new long[]{0x0000000000000000L,0x0044400066023B80L});
	public static final BitSet FOLLOW_comentarios_in_expressao2522 = new BitSet(new long[]{0x0000000000000000L,0x0044400066023B80L});
	public static final BitSet FOLLOW_expressaoNum_in_expressao2526 = new BitSet(new long[]{0x0000000000000002L,0x0000000022000300L});
	public static final BitSet FOLLOW_93_in_expressao2577 = new BitSet(new long[]{0x0000000000000000L,0x0044400066023B80L});
	public static final BitSet FOLLOW_comentarios_in_expressao2581 = new BitSet(new long[]{0x0000000000000000L,0x0044400066023B80L});
	public static final BitSet FOLLOW_expressaoNum_in_expressao2585 = new BitSet(new long[]{0x0000000000000002L,0x0000000022000300L});
	public static final BitSet FOLLOW_oper_in_expressaoNum2658 = new BitSet(new long[]{0x0000000000000002L,0x0000000100880300L});
	public static final BitSet FOLLOW_comentarios_in_expressaoNum2669 = new BitSet(new long[]{0x0000000000000000L,0x0000000100880000L});
	public static final BitSet FOLLOW_87_in_expressaoNum2673 = new BitSet(new long[]{0x0000000000000000L,0x0044400066023B80L});
	public static final BitSet FOLLOW_comentarios_in_expressaoNum2677 = new BitSet(new long[]{0x0000000000000000L,0x0044400066023B80L});
	public static final BitSet FOLLOW_oper_in_expressaoNum2681 = new BitSet(new long[]{0x0000000000000002L,0x0000000100880300L});
	public static final BitSet FOLLOW_96_in_expressaoNum2727 = new BitSet(new long[]{0x0000000000000000L,0x0044400066023B80L});
	public static final BitSet FOLLOW_comentarios_in_expressaoNum2731 = new BitSet(new long[]{0x0000000000000000L,0x0044400066023B80L});
	public static final BitSet FOLLOW_oper_in_expressaoNum2735 = new BitSet(new long[]{0x0000000000000002L,0x0000000100880300L});
	public static final BitSet FOLLOW_83_in_expressaoNum2781 = new BitSet(new long[]{0x0000000000000000L,0x0044400066023B80L});
	public static final BitSet FOLLOW_comentarios_in_expressaoNum2785 = new BitSet(new long[]{0x0000000000000000L,0x0044400066023B80L});
	public static final BitSet FOLLOW_oper_in_expressaoNum2789 = new BitSet(new long[]{0x0000000000000002L,0x0000000100880300L});
	public static final BitSet FOLLOW_opUnario_in_oper2856 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_ID_in_oper2858 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_opUnario_in_oper2875 = new BitSet(new long[]{0x0000000000000000L,0x0040400000002880L});
	public static final BitSet FOLLOW_tipo_in_oper2877 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tipo_in_oper2890 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_oper2900 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_incOp_in_oper2913 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_ID_in_oper2915 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_oper2930 = new BitSet(new long[]{0x0000000000000000L,0x0000000044000000L});
	public static final BitSet FOLLOW_incOp_in_oper2932 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_call_in_oper2947 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_input__in_oper2956 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_90_in_incOp2978 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_94_in_incOp2988 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_89_in_opUnario3009 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_93_in_opUnario3020 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_81_in_opUnario3031 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_118_in_boolean_3052 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_110_in_boolean_3062 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_comentario_in_comentarios3085 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000300L});
	public static final BitSet FOLLOW_COMENTARIO_LINHA_in_comentario3108 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMENTARIO_LINHAS_in_comentario3121 = new BitSet(new long[]{0x0000000000000002L});
}
