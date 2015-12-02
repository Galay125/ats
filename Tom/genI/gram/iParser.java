// $ANTLR 3.2 Sep 23, 2009 12:02:23 gram/i.g 2015-12-02 00:28:08
 package gram; 

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class iParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "IntWrap", "SeqInstrucao", "Exp", "Funcao", "Return", "For", "While", "If", "Declaracao", "Atribuicao", "Decl", "ListaDecl", "Argumento", "ListaArgumentos", "Parametro", "ListaParametros", "Dec", "Inc", "Sub", "Soma", "Div", "Mult", "Atrib", "Empty", "Expressoes", "Print", "Input", "Comp", "E", "Ou", "Float", "False", "True", "Char", "Int", "Condicional", "IncDepois", "IncAntes", "Call", "Nao", "Neg", "Pos", "Id", "ExpNum", "Igual", "Dif", "MenorQ", "MaiorQ", "Menor", "Maior", "Mod", "Menos", "Divide", "Vezes", "Mais", "DVoid", "DFloat", "DBoolean", "DChar", "DInt", "INT", "FLOAT", "CHAR", "ID", "DIGITO", "SufixoFloat", "LETRA", "WS", "'char'", "'int'", "'boolean'", "'float'", "'void'", "';'", "'='", "'('", "')'", "','", "'if'", "'else'", "'for'", "'while'", "'return'", "'print'", "'input'", "'{'", "'}'", "'?'", "':'", "'||'", "'&&'", "'>'", "'<'", "'>='", "'<='", "'!='", "'=='", "'*='", "'/='", "'+='", "'-='", "'+'", "'-'", "'*'", "'/'", "'%'", "'++'", "'--'", "'!'", "'true'", "'false'"
    };
    public static final int Soma=29;
    public static final int Decl=20;
    public static final int CHAR=72;
    public static final int Empty=33;
    public static final int DChar=68;
    public static final int DVoid=65;
    public static final int Neg=50;
    public static final int EOF=-1;
    public static final int Int=44;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__90=90;
    public static final int Parametro=24;
    public static final int Char=43;
    public static final int MaiorQ=57;
    public static final int MenorQ=56;
    public static final int T__99=99;
    public static final int T__98=98;
    public static final int T__97=97;
    public static final int T__96=96;
    public static final int T__95=95;
    public static final int E=38;
    public static final int Mod=60;
    public static final int ListaDecl=21;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int DFloat=66;
    public static final int Maior=59;
    public static final int Atribuicao=19;
    public static final int ListaArgumentos=23;
    public static final int INT=70;
    public static final int T__85=85;
    public static final int T__84=84;
    public static final int Dec=26;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int T__89=89;
    public static final int Menor=58;
    public static final int T__88=88;
    public static final int Menos=61;
    public static final int DBoolean=67;
    public static final int Float=40;
    public static final int Input=36;
    public static final int WS=77;
    public static final int SeqInstrucao=11;
    public static final int Inc=27;
    public static final int SufixoFloat=75;
    public static final int Condicional=45;
    public static final int Funcao=13;
    public static final int ExpNum=53;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int Comp=37;
    public static final int Nao=49;
    public static final int DIGITO=74;
    public static final int T__118=118;
    public static final int T__119=119;
    public static final int T__116=116;
    public static final int T__117=117;
    public static final int T__114=114;
    public static final int False=41;
    public static final int T__115=115;
    public static final int FLOAT=71;
    public static final int T__120=120;
    public static final int While=16;
    public static final int ID=73;
    public static final int Atrib=32;
    public static final int IncDepois=46;
    public static final int Expressoes=34;
    public static final int Call=48;
    public static final int Argumento=22;
    public static final int T__107=107;
    public static final int T__108=108;
    public static final int T__109=109;
    public static final int ListaParametros=25;
    public static final int T__103=103;
    public static final int T__104=104;
    public static final int T__105=105;
    public static final int Print=35;
    public static final int Dif=55;
    public static final int T__106=106;
    public static final int DInt=69;
    public static final int T__111=111;
    public static final int T__110=110;
    public static final int T__113=113;
    public static final int Ou=39;
    public static final int T__112=112;
    public static final int Return=14;
    public static final int True=42;
    public static final int Id=52;
    public static final int If=17;
    public static final int Div=30;
    public static final int Igual=54;
    public static final int Exp=12;
    public static final int T__102=102;
    public static final int Mais=64;
    public static final int T__101=101;
    public static final int T__100=100;
    public static final int For=15;
    public static final int Sub=28;
    public static final int Divide=62;
    public static final int Declaracao=18;
    public static final int Mult=31;
    public static final int Vezes=63;
    public static final int IntWrap=10;
    public static final int Pos=51;
    public static final int IncAntes=47;
    public static final int LETRA=76;

    // delegates
    // delegators


        public iParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public iParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return iParser.tokenNames; }
    public String getGrammarFileName() { return "gram/i.g"; }


    public static class idTipo_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "idTipo"
    // gram/i.g:15:1: idTipo : ( 'char' -> ^( DChar ) | 'int' -> ^( DInt ) | 'boolean' -> ^( DBoolean ) | 'float' -> ^( DFloat ) | 'void' -> ^( DVoid ) ) ;
    public final iParser.idTipo_return idTipo() throws RecognitionException {
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
        RewriteRuleTokenStream stream_79=new RewriteRuleTokenStream(adaptor,"token 79");
        RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
        RewriteRuleTokenStream stream_82=new RewriteRuleTokenStream(adaptor,"token 82");
        RewriteRuleTokenStream stream_80=new RewriteRuleTokenStream(adaptor,"token 80");
        RewriteRuleTokenStream stream_81=new RewriteRuleTokenStream(adaptor,"token 81");

        try {
            // gram/i.g:15:8: ( ( 'char' -> ^( DChar ) | 'int' -> ^( DInt ) | 'boolean' -> ^( DBoolean ) | 'float' -> ^( DFloat ) | 'void' -> ^( DVoid ) ) )
            // gram/i.g:15:10: ( 'char' -> ^( DChar ) | 'int' -> ^( DInt ) | 'boolean' -> ^( DBoolean ) | 'float' -> ^( DFloat ) | 'void' -> ^( DVoid ) )
            {
            // gram/i.g:15:10: ( 'char' -> ^( DChar ) | 'int' -> ^( DInt ) | 'boolean' -> ^( DBoolean ) | 'float' -> ^( DFloat ) | 'void' -> ^( DVoid ) )
            int alt1=5;
            switch ( input.LA(1) ) {
            case 78:
                {
                alt1=1;
                }
                break;
            case 79:
                {
                alt1=2;
                }
                break;
            case 80:
                {
                alt1=3;
                }
                break;
            case 81:
                {
                alt1=4;
                }
                break;
            case 82:
                {
                alt1=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // gram/i.g:15:11: 'char'
                    {
                    string_literal1=(Token)match(input,78,FOLLOW_78_in_idTipo56);  
                    stream_78.add(string_literal1);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 15:18: -> ^( DChar )
                    {
                        // gram/i.g:15:21: ^( DChar )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(DChar, "DChar"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // gram/i.g:15:32: 'int'
                    {
                    string_literal2=(Token)match(input,79,FOLLOW_79_in_idTipo66);  
                    stream_79.add(string_literal2);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 15:38: -> ^( DInt )
                    {
                        // gram/i.g:15:41: ^( DInt )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(DInt, "DInt"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // gram/i.g:15:51: 'boolean'
                    {
                    string_literal3=(Token)match(input,80,FOLLOW_80_in_idTipo76);  
                    stream_80.add(string_literal3);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 15:61: -> ^( DBoolean )
                    {
                        // gram/i.g:15:64: ^( DBoolean )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(DBoolean, "DBoolean"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // gram/i.g:15:78: 'float'
                    {
                    string_literal4=(Token)match(input,81,FOLLOW_81_in_idTipo86);  
                    stream_81.add(string_literal4);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 15:86: -> ^( DFloat )
                    {
                        // gram/i.g:15:89: ^( DFloat )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(DFloat, "DFloat"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // gram/i.g:15:101: 'void'
                    {
                    string_literal5=(Token)match(input,82,FOLLOW_82_in_idTipo96);  
                    stream_82.add(string_literal5);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 15:108: -> ^( DVoid )
                    {
                        // gram/i.g:15:111: ^( DVoid )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(DVoid, "DVoid"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

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
        }
        return retval;
    }
    // $ANTLR end "idTipo"

    public static class tipo_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "tipo"
    // gram/i.g:18:1: tipo : ( INT -> ^( Int INT ) | FLOAT -> ^( Float FLOAT ) | CHAR -> ^( Char CHAR ) | boolean_ -> boolean_ ) ;
    public final iParser.tipo_return tipo() throws RecognitionException {
        iParser.tipo_return retval = new iParser.tipo_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token INT6=null;
        Token FLOAT7=null;
        Token CHAR8=null;
        iParser.boolean__return boolean_9 = null;


        Tree INT6_tree=null;
        Tree FLOAT7_tree=null;
        Tree CHAR8_tree=null;
        RewriteRuleTokenStream stream_CHAR=new RewriteRuleTokenStream(adaptor,"token CHAR");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_FLOAT=new RewriteRuleTokenStream(adaptor,"token FLOAT");
        RewriteRuleSubtreeStream stream_boolean_=new RewriteRuleSubtreeStream(adaptor,"rule boolean_");
        try {
            // gram/i.g:18:6: ( ( INT -> ^( Int INT ) | FLOAT -> ^( Float FLOAT ) | CHAR -> ^( Char CHAR ) | boolean_ -> boolean_ ) )
            // gram/i.g:18:8: ( INT -> ^( Int INT ) | FLOAT -> ^( Float FLOAT ) | CHAR -> ^( Char CHAR ) | boolean_ -> boolean_ )
            {
            // gram/i.g:18:8: ( INT -> ^( Int INT ) | FLOAT -> ^( Float FLOAT ) | CHAR -> ^( Char CHAR ) | boolean_ -> boolean_ )
            int alt2=4;
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
            case 119:
            case 120:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // gram/i.g:18:9: INT
                    {
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
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 18:13: -> ^( Int INT )
                    {
                        // gram/i.g:18:16: ^( Int INT )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Int, "Int"), root_1);

                        adaptor.addChild(root_1, stream_INT.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // gram/i.g:18:29: FLOAT
                    {
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
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 18:35: -> ^( Float FLOAT )
                    {
                        // gram/i.g:18:38: ^( Float FLOAT )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Float, "Float"), root_1);

                        adaptor.addChild(root_1, stream_FLOAT.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // gram/i.g:18:55: CHAR
                    {
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
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 18:60: -> ^( Char CHAR )
                    {
                        // gram/i.g:18:63: ^( Char CHAR )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Char, "Char"), root_1);

                        adaptor.addChild(root_1, stream_CHAR.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // gram/i.g:18:78: boolean_
                    {
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
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 18:87: -> boolean_
                    {
                        adaptor.addChild(root_0, stream_boolean_.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;

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
        }
        return retval;
    }
    // $ANTLR end "tipo"

    public static class prog_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "prog"
    // gram/i.g:23:1: prog : ( programa )* EOF -> ^( SeqInstrucao ( programa )* ) ;
    public final iParser.prog_return prog() throws RecognitionException {
        iParser.prog_return retval = new iParser.prog_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token EOF11=null;
        iParser.programa_return programa10 = null;


        Tree EOF11_tree=null;
        RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
        RewriteRuleSubtreeStream stream_programa=new RewriteRuleSubtreeStream(adaptor,"rule programa");
        try {
            // gram/i.g:23:6: ( ( programa )* EOF -> ^( SeqInstrucao ( programa )* ) )
            // gram/i.g:24:2: ( programa )* EOF
            {
            // gram/i.g:24:2: ( programa )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=78 && LA3_0<=82)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // gram/i.g:24:2: programa
            	    {
            	    pushFollow(FOLLOW_programa_in_prog174);
            	    programa10=programa();

            	    state._fsp--;

            	    stream_programa.add(programa10.getTree());

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

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
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 24:16: -> ^( SeqInstrucao ( programa )* )
            {
                // gram/i.g:24:19: ^( SeqInstrucao ( programa )* )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(SeqInstrucao, "SeqInstrucao"), root_1);

                // gram/i.g:24:34: ( programa )*
                while ( stream_programa.hasNext() ) {
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
        }
        return retval;
    }
    // $ANTLR end "prog"

    public static class programa_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "programa"
    // gram/i.g:27:1: programa : ( declaracao ';' -> declaracao | funcao -> funcao ) ;
    public final iParser.programa_return programa() throws RecognitionException {
        iParser.programa_return retval = new iParser.programa_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token char_literal13=null;
        iParser.declaracao_return declaracao12 = null;

        iParser.funcao_return funcao14 = null;


        Tree char_literal13_tree=null;
        RewriteRuleTokenStream stream_83=new RewriteRuleTokenStream(adaptor,"token 83");
        RewriteRuleSubtreeStream stream_funcao=new RewriteRuleSubtreeStream(adaptor,"rule funcao");
        RewriteRuleSubtreeStream stream_declaracao=new RewriteRuleSubtreeStream(adaptor,"rule declaracao");
        try {
            // gram/i.g:27:10: ( ( declaracao ';' -> declaracao | funcao -> funcao ) )
            // gram/i.g:28:2: ( declaracao ';' -> declaracao | funcao -> funcao )
            {
            // gram/i.g:28:2: ( declaracao ';' -> declaracao | funcao -> funcao )
            int alt4=2;
            switch ( input.LA(1) ) {
            case 78:
                {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==ID) ) {
                    int LA4_6 = input.LA(3);

                    if ( ((LA4_6>=83 && LA4_6<=84)) ) {
                        alt4=1;
                    }
                    else if ( (LA4_6==85) ) {
                        alt4=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 6, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
                }
                break;
            case 79:
                {
                int LA4_2 = input.LA(2);

                if ( (LA4_2==ID) ) {
                    int LA4_6 = input.LA(3);

                    if ( ((LA4_6>=83 && LA4_6<=84)) ) {
                        alt4=1;
                    }
                    else if ( (LA4_6==85) ) {
                        alt4=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 6, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 2, input);

                    throw nvae;
                }
                }
                break;
            case 80:
                {
                int LA4_3 = input.LA(2);

                if ( (LA4_3==ID) ) {
                    int LA4_6 = input.LA(3);

                    if ( ((LA4_6>=83 && LA4_6<=84)) ) {
                        alt4=1;
                    }
                    else if ( (LA4_6==85) ) {
                        alt4=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 6, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 3, input);

                    throw nvae;
                }
                }
                break;
            case 81:
                {
                int LA4_4 = input.LA(2);

                if ( (LA4_4==ID) ) {
                    int LA4_6 = input.LA(3);

                    if ( ((LA4_6>=83 && LA4_6<=84)) ) {
                        alt4=1;
                    }
                    else if ( (LA4_6==85) ) {
                        alt4=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 6, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 4, input);

                    throw nvae;
                }
                }
                break;
            case 82:
                {
                int LA4_5 = input.LA(2);

                if ( (LA4_5==ID) ) {
                    int LA4_6 = input.LA(3);

                    if ( ((LA4_6>=83 && LA4_6<=84)) ) {
                        alt4=1;
                    }
                    else if ( (LA4_6==85) ) {
                        alt4=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 6, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 5, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // gram/i.g:28:4: declaracao ';'
                    {
                    pushFollow(FOLLOW_declaracao_in_programa201);
                    declaracao12=declaracao();

                    state._fsp--;

                    stream_declaracao.add(declaracao12.getTree());
                    char_literal13=(Token)match(input,83,FOLLOW_83_in_programa203);  
                    stream_83.add(char_literal13);



                    // AST REWRITE
                    // elements: declaracao
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 28:19: -> declaracao
                    {
                        adaptor.addChild(root_0, stream_declaracao.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // gram/i.g:29:4: funcao
                    {
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
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 29:11: -> funcao
                    {
                        adaptor.addChild(root_0, stream_funcao.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;

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
        }
        return retval;
    }
    // $ANTLR end "programa"

    public static class declaracao_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "declaracao"
    // gram/i.g:33:1: declaracao : idTipo dec_nodo -> ^( Declaracao idTipo ^( ListaDecl ( dec_nodo )* ) ) ;
    public final iParser.declaracao_return declaracao() throws RecognitionException {
        iParser.declaracao_return retval = new iParser.declaracao_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        iParser.idTipo_return idTipo15 = null;

        iParser.dec_nodo_return dec_nodo16 = null;


        RewriteRuleSubtreeStream stream_dec_nodo=new RewriteRuleSubtreeStream(adaptor,"rule dec_nodo");
        RewriteRuleSubtreeStream stream_idTipo=new RewriteRuleSubtreeStream(adaptor,"rule idTipo");
        try {
            // gram/i.g:33:12: ( idTipo dec_nodo -> ^( Declaracao idTipo ^( ListaDecl ( dec_nodo )* ) ) )
            // gram/i.g:34:2: idTipo dec_nodo
            {
            pushFollow(FOLLOW_idTipo_in_declaracao230);
            idTipo15=idTipo();

            state._fsp--;

            stream_idTipo.add(idTipo15.getTree());
            pushFollow(FOLLOW_dec_nodo_in_declaracao232);
            dec_nodo16=dec_nodo();

            state._fsp--;

            stream_dec_nodo.add(dec_nodo16.getTree());


            // AST REWRITE
            // elements: dec_nodo, idTipo
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 34:18: -> ^( Declaracao idTipo ^( ListaDecl ( dec_nodo )* ) )
            {
                // gram/i.g:34:21: ^( Declaracao idTipo ^( ListaDecl ( dec_nodo )* ) )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Declaracao, "Declaracao"), root_1);

                adaptor.addChild(root_1, stream_idTipo.nextTree());
                // gram/i.g:34:41: ^( ListaDecl ( dec_nodo )* )
                {
                Tree root_2 = (Tree)adaptor.nil();
                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(ListaDecl, "ListaDecl"), root_2);

                // gram/i.g:34:53: ( dec_nodo )*
                while ( stream_dec_nodo.hasNext() ) {
                    adaptor.addChild(root_2, stream_dec_nodo.nextTree());

                }
                stream_dec_nodo.reset();

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
        }
        return retval;
    }
    // $ANTLR end "declaracao"

    public static class dec_nodo_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "dec_nodo"
    // gram/i.g:37:1: dec_nodo : ( ID -> ^( Decl ID Empty ) | ID '=' condicao -> ^( Decl ID condicao ) ) ;
    public final iParser.dec_nodo_return dec_nodo() throws RecognitionException {
        iParser.dec_nodo_return retval = new iParser.dec_nodo_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token ID17=null;
        Token ID18=null;
        Token char_literal19=null;
        iParser.condicao_return condicao20 = null;


        Tree ID17_tree=null;
        Tree ID18_tree=null;
        Tree char_literal19_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_84=new RewriteRuleTokenStream(adaptor,"token 84");
        RewriteRuleSubtreeStream stream_condicao=new RewriteRuleSubtreeStream(adaptor,"rule condicao");
        try {
            // gram/i.g:37:10: ( ( ID -> ^( Decl ID Empty ) | ID '=' condicao -> ^( Decl ID condicao ) ) )
            // gram/i.g:38:2: ( ID -> ^( Decl ID Empty ) | ID '=' condicao -> ^( Decl ID condicao ) )
            {
            // gram/i.g:38:2: ( ID -> ^( Decl ID Empty ) | ID '=' condicao -> ^( Decl ID condicao ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==ID) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==84) ) {
                    alt5=2;
                }
                else if ( (LA5_1==83) ) {
                    alt5=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // gram/i.g:38:4: ID
                    {
                    ID17=(Token)match(input,ID,FOLLOW_ID_in_dec_nodo260);  
                    stream_ID.add(ID17);



                    // AST REWRITE
                    // elements: ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 38:7: -> ^( Decl ID Empty )
                    {
                        // gram/i.g:38:10: ^( Decl ID Empty )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Decl, "Decl"), root_1);

                        adaptor.addChild(root_1, stream_ID.nextNode());
                        adaptor.addChild(root_1, (Tree)adaptor.create(Empty, "Empty"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // gram/i.g:39:4: ID '=' condicao
                    {
                    ID18=(Token)match(input,ID,FOLLOW_ID_in_dec_nodo276);  
                    stream_ID.add(ID18);

                    char_literal19=(Token)match(input,84,FOLLOW_84_in_dec_nodo278);  
                    stream_84.add(char_literal19);

                    pushFollow(FOLLOW_condicao_in_dec_nodo280);
                    condicao20=condicao();

                    state._fsp--;

                    stream_condicao.add(condicao20.getTree());


                    // AST REWRITE
                    // elements: condicao, ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 39:20: -> ^( Decl ID condicao )
                    {
                        // gram/i.g:39:23: ^( Decl ID condicao )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Decl, "Decl"), root_1);

                        adaptor.addChild(root_1, stream_ID.nextNode());
                        adaptor.addChild(root_1, stream_condicao.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

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
        }
        return retval;
    }
    // $ANTLR end "dec_nodo"

    public static class funcao_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "funcao"
    // gram/i.g:43:1: funcao : idTipo ID '(' ( argumentos )? ')' blocoCodigo -> ^( Funcao idTipo ID ^( ListaArgumentos ( argumentos )? ) blocoCodigo ) ;
    public final iParser.funcao_return funcao() throws RecognitionException {
        iParser.funcao_return retval = new iParser.funcao_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token ID22=null;
        Token char_literal23=null;
        Token char_literal25=null;
        iParser.idTipo_return idTipo21 = null;

        iParser.argumentos_return argumentos24 = null;

        iParser.blocoCodigo_return blocoCodigo26 = null;


        Tree ID22_tree=null;
        Tree char_literal23_tree=null;
        Tree char_literal25_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_86=new RewriteRuleTokenStream(adaptor,"token 86");
        RewriteRuleTokenStream stream_85=new RewriteRuleTokenStream(adaptor,"token 85");
        RewriteRuleSubtreeStream stream_blocoCodigo=new RewriteRuleSubtreeStream(adaptor,"rule blocoCodigo");
        RewriteRuleSubtreeStream stream_argumentos=new RewriteRuleSubtreeStream(adaptor,"rule argumentos");
        RewriteRuleSubtreeStream stream_idTipo=new RewriteRuleSubtreeStream(adaptor,"rule idTipo");
        try {
            // gram/i.g:43:8: ( idTipo ID '(' ( argumentos )? ')' blocoCodigo -> ^( Funcao idTipo ID ^( ListaArgumentos ( argumentos )? ) blocoCodigo ) )
            // gram/i.g:44:3: idTipo ID '(' ( argumentos )? ')' blocoCodigo
            {
            pushFollow(FOLLOW_idTipo_in_funcao309);
            idTipo21=idTipo();

            state._fsp--;

            stream_idTipo.add(idTipo21.getTree());
            ID22=(Token)match(input,ID,FOLLOW_ID_in_funcao312);  
            stream_ID.add(ID22);

            char_literal23=(Token)match(input,85,FOLLOW_85_in_funcao315);  
            stream_85.add(char_literal23);

            // gram/i.g:44:20: ( argumentos )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=78 && LA6_0<=82)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // gram/i.g:44:20: argumentos
                    {
                    pushFollow(FOLLOW_argumentos_in_funcao318);
                    argumentos24=argumentos();

                    state._fsp--;

                    stream_argumentos.add(argumentos24.getTree());

                    }
                    break;

            }

            char_literal25=(Token)match(input,86,FOLLOW_86_in_funcao322);  
            stream_86.add(char_literal25);

            pushFollow(FOLLOW_blocoCodigo_in_funcao325);
            blocoCodigo26=blocoCodigo();

            state._fsp--;

            stream_blocoCodigo.add(blocoCodigo26.getTree());


            // AST REWRITE
            // elements: blocoCodigo, ID, idTipo, argumentos
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 44:51: -> ^( Funcao idTipo ID ^( ListaArgumentos ( argumentos )? ) blocoCodigo )
            {
                // gram/i.g:44:54: ^( Funcao idTipo ID ^( ListaArgumentos ( argumentos )? ) blocoCodigo )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Funcao, "Funcao"), root_1);

                adaptor.addChild(root_1, stream_idTipo.nextTree());
                adaptor.addChild(root_1, stream_ID.nextNode());
                // gram/i.g:44:77: ^( ListaArgumentos ( argumentos )? )
                {
                Tree root_2 = (Tree)adaptor.nil();
                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(ListaArgumentos, "ListaArgumentos"), root_2);

                // gram/i.g:44:95: ( argumentos )?
                if ( stream_argumentos.hasNext() ) {
                    adaptor.addChild(root_2, stream_argumentos.nextTree());

                }
                stream_argumentos.reset();

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_blocoCodigo.nextTree());

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
        }
        return retval;
    }
    // $ANTLR end "funcao"

    public static class argumentos_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "argumentos"
    // gram/i.g:47:1: argumentos : argumento ( ',' argumento )* -> ( argumento )+ ;
    public final iParser.argumentos_return argumentos() throws RecognitionException {
        iParser.argumentos_return retval = new iParser.argumentos_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token char_literal28=null;
        iParser.argumento_return argumento27 = null;

        iParser.argumento_return argumento29 = null;


        Tree char_literal28_tree=null;
        RewriteRuleTokenStream stream_87=new RewriteRuleTokenStream(adaptor,"token 87");
        RewriteRuleSubtreeStream stream_argumento=new RewriteRuleSubtreeStream(adaptor,"rule argumento");
        try {
            // gram/i.g:47:12: ( argumento ( ',' argumento )* -> ( argumento )+ )
            // gram/i.g:48:2: argumento ( ',' argumento )*
            {
            pushFollow(FOLLOW_argumento_in_argumentos364);
            argumento27=argumento();

            state._fsp--;

            stream_argumento.add(argumento27.getTree());
            // gram/i.g:48:12: ( ',' argumento )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==87) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // gram/i.g:48:14: ',' argumento
            	    {
            	    char_literal28=(Token)match(input,87,FOLLOW_87_in_argumentos368);  
            	    stream_87.add(char_literal28);

            	    pushFollow(FOLLOW_argumento_in_argumentos370);
            	    argumento29=argumento();

            	    state._fsp--;

            	    stream_argumento.add(argumento29.getTree());

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);



            // AST REWRITE
            // elements: argumento
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 48:31: -> ( argumento )+
            {
                if ( !(stream_argumento.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_argumento.hasNext() ) {
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
        }
        return retval;
    }
    // $ANTLR end "argumentos"

    public static class argumento_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "argumento"
    // gram/i.g:51:1: argumento : idTipo ID -> ^( Argumento idTipo ID ) ;
    public final iParser.argumento_return argumento() throws RecognitionException {
        iParser.argumento_return retval = new iParser.argumento_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token ID31=null;
        iParser.idTipo_return idTipo30 = null;


        Tree ID31_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_idTipo=new RewriteRuleSubtreeStream(adaptor,"rule idTipo");
        try {
            // gram/i.g:51:11: ( idTipo ID -> ^( Argumento idTipo ID ) )
            // gram/i.g:52:3: idTipo ID
            {
            pushFollow(FOLLOW_idTipo_in_argumento391);
            idTipo30=idTipo();

            state._fsp--;

            stream_idTipo.add(idTipo30.getTree());
            ID31=(Token)match(input,ID,FOLLOW_ID_in_argumento394);  
            stream_ID.add(ID31);



            // AST REWRITE
            // elements: ID, idTipo
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 52:15: -> ^( Argumento idTipo ID )
            {
                // gram/i.g:52:18: ^( Argumento idTipo ID )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Argumento, "Argumento"), root_1);

                adaptor.addChild(root_1, stream_idTipo.nextTree());
                adaptor.addChild(root_1, stream_ID.nextNode());

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
        }
        return retval;
    }
    // $ANTLR end "argumento"

    public static class instrucao_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "instrucao"
    // gram/i.g:57:1: instrucao : ( if_ -> if_ | for_ -> for_ | while_ -> while_ | return_ ';' -> return_ | call ';' -> ^( Exp call ) | print_ ';' -> print_ ) ;
    public final iParser.instrucao_return instrucao() throws RecognitionException {
        iParser.instrucao_return retval = new iParser.instrucao_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token char_literal36=null;
        Token char_literal38=null;
        Token char_literal40=null;
        iParser.if__return if_32 = null;

        iParser.for__return for_33 = null;

        iParser.while__return while_34 = null;

        iParser.return__return return_35 = null;

        iParser.call_return call37 = null;

        iParser.print__return print_39 = null;


        Tree char_literal36_tree=null;
        Tree char_literal38_tree=null;
        Tree char_literal40_tree=null;
        RewriteRuleTokenStream stream_83=new RewriteRuleTokenStream(adaptor,"token 83");
        RewriteRuleSubtreeStream stream_for_=new RewriteRuleSubtreeStream(adaptor,"rule for_");
        RewriteRuleSubtreeStream stream_return_=new RewriteRuleSubtreeStream(adaptor,"rule return_");
        RewriteRuleSubtreeStream stream_call=new RewriteRuleSubtreeStream(adaptor,"rule call");
        RewriteRuleSubtreeStream stream_while_=new RewriteRuleSubtreeStream(adaptor,"rule while_");
        RewriteRuleSubtreeStream stream_if_=new RewriteRuleSubtreeStream(adaptor,"rule if_");
        RewriteRuleSubtreeStream stream_print_=new RewriteRuleSubtreeStream(adaptor,"rule print_");
        try {
            // gram/i.g:57:11: ( ( if_ -> if_ | for_ -> for_ | while_ -> while_ | return_ ';' -> return_ | call ';' -> ^( Exp call ) | print_ ';' -> print_ ) )
            // gram/i.g:58:2: ( if_ -> if_ | for_ -> for_ | while_ -> while_ | return_ ';' -> return_ | call ';' -> ^( Exp call ) | print_ ';' -> print_ )
            {
            // gram/i.g:58:2: ( if_ -> if_ | for_ -> for_ | while_ -> while_ | return_ ';' -> return_ | call ';' -> ^( Exp call ) | print_ ';' -> print_ )
            int alt8=6;
            switch ( input.LA(1) ) {
            case 88:
                {
                alt8=1;
                }
                break;
            case 90:
                {
                alt8=2;
                }
                break;
            case 91:
                {
                alt8=3;
                }
                break;
            case 92:
                {
                alt8=4;
                }
                break;
            case ID:
                {
                alt8=5;
                }
                break;
            case 93:
                {
                alt8=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // gram/i.g:58:3: if_
                    {
                    pushFollow(FOLLOW_if__in_instrucao424);
                    if_32=if_();

                    state._fsp--;

                    stream_if_.add(if_32.getTree());


                    // AST REWRITE
                    // elements: if_
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 58:7: -> if_
                    {
                        adaptor.addChild(root_0, stream_if_.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // gram/i.g:58:16: for_
                    {
                    pushFollow(FOLLOW_for__in_instrucao432);
                    for_33=for_();

                    state._fsp--;

                    stream_for_.add(for_33.getTree());


                    // AST REWRITE
                    // elements: for_
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 58:21: -> for_
                    {
                        adaptor.addChild(root_0, stream_for_.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // gram/i.g:58:31: while_
                    {
                    pushFollow(FOLLOW_while__in_instrucao440);
                    while_34=while_();

                    state._fsp--;

                    stream_while_.add(while_34.getTree());


                    // AST REWRITE
                    // elements: while_
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 58:38: -> while_
                    {
                        adaptor.addChild(root_0, stream_while_.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // gram/i.g:58:50: return_ ';'
                    {
                    pushFollow(FOLLOW_return__in_instrucao448);
                    return_35=return_();

                    state._fsp--;

                    stream_return_.add(return_35.getTree());
                    char_literal36=(Token)match(input,83,FOLLOW_83_in_instrucao450);  
                    stream_83.add(char_literal36);



                    // AST REWRITE
                    // elements: return_
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 58:62: -> return_
                    {
                        adaptor.addChild(root_0, stream_return_.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // gram/i.g:58:75: call ';'
                    {
                    pushFollow(FOLLOW_call_in_instrucao458);
                    call37=call();

                    state._fsp--;

                    stream_call.add(call37.getTree());
                    char_literal38=(Token)match(input,83,FOLLOW_83_in_instrucao460);  
                    stream_83.add(char_literal38);



                    // AST REWRITE
                    // elements: call
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 58:84: -> ^( Exp call )
                    {
                        // gram/i.g:58:87: ^( Exp call )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Exp, "Exp"), root_1);

                        adaptor.addChild(root_1, stream_call.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 6 :
                    // gram/i.g:58:101: print_ ';'
                    {
                    pushFollow(FOLLOW_print__in_instrucao472);
                    print_39=print_();

                    state._fsp--;

                    stream_print_.add(print_39.getTree());
                    char_literal40=(Token)match(input,83,FOLLOW_83_in_instrucao474);  
                    stream_83.add(char_literal40);



                    // AST REWRITE
                    // elements: print_
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 58:112: -> print_
                    {
                        adaptor.addChild(root_0, stream_print_.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;

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
        }
        return retval;
    }
    // $ANTLR end "instrucao"

    public static class if__return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "if_"
    // gram/i.g:61:1: if_ : 'if' '(' condicao ')' blocoCodigo ( else_ -> ^( If condicao blocoCodigo else_ ) | -> ^( If condicao blocoCodigo ^( SeqInstrucao ) ) ) ;
    public final iParser.if__return if_() throws RecognitionException {
        iParser.if__return retval = new iParser.if__return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token string_literal41=null;
        Token char_literal42=null;
        Token char_literal44=null;
        iParser.condicao_return condicao43 = null;

        iParser.blocoCodigo_return blocoCodigo45 = null;

        iParser.else__return else_46 = null;


        Tree string_literal41_tree=null;
        Tree char_literal42_tree=null;
        Tree char_literal44_tree=null;
        RewriteRuleTokenStream stream_86=new RewriteRuleTokenStream(adaptor,"token 86");
        RewriteRuleTokenStream stream_88=new RewriteRuleTokenStream(adaptor,"token 88");
        RewriteRuleTokenStream stream_85=new RewriteRuleTokenStream(adaptor,"token 85");
        RewriteRuleSubtreeStream stream_blocoCodigo=new RewriteRuleSubtreeStream(adaptor,"rule blocoCodigo");
        RewriteRuleSubtreeStream stream_else_=new RewriteRuleSubtreeStream(adaptor,"rule else_");
        RewriteRuleSubtreeStream stream_condicao=new RewriteRuleSubtreeStream(adaptor,"rule condicao");
        try {
            // gram/i.g:61:6: ( 'if' '(' condicao ')' blocoCodigo ( else_ -> ^( If condicao blocoCodigo else_ ) | -> ^( If condicao blocoCodigo ^( SeqInstrucao ) ) ) )
            // gram/i.g:62:3: 'if' '(' condicao ')' blocoCodigo ( else_ -> ^( If condicao blocoCodigo else_ ) | -> ^( If condicao blocoCodigo ^( SeqInstrucao ) ) )
            {
            string_literal41=(Token)match(input,88,FOLLOW_88_in_if_492);  
            stream_88.add(string_literal41);

            char_literal42=(Token)match(input,85,FOLLOW_85_in_if_495);  
            stream_85.add(char_literal42);

            pushFollow(FOLLOW_condicao_in_if_498);
            condicao43=condicao();

            state._fsp--;

            stream_condicao.add(condicao43.getTree());
            char_literal44=(Token)match(input,86,FOLLOW_86_in_if_501);  
            stream_86.add(char_literal44);

            pushFollow(FOLLOW_blocoCodigo_in_if_504);
            blocoCodigo45=blocoCodigo();

            state._fsp--;

            stream_blocoCodigo.add(blocoCodigo45.getTree());
            // gram/i.g:62:41: ( else_ -> ^( If condicao blocoCodigo else_ ) | -> ^( If condicao blocoCodigo ^( SeqInstrucao ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==89) ) {
                alt9=1;
            }
            else if ( (LA9_0==ID||(LA9_0>=78 && LA9_0<=82)||LA9_0==88||(LA9_0>=90 && LA9_0<=93)||LA9_0==96) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // gram/i.g:62:43: else_
                    {
                    pushFollow(FOLLOW_else__in_if_508);
                    else_46=else_();

                    state._fsp--;

                    stream_else_.add(else_46.getTree());


                    // AST REWRITE
                    // elements: blocoCodigo, condicao, else_
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 62:49: -> ^( If condicao blocoCodigo else_ )
                    {
                        // gram/i.g:62:52: ^( If condicao blocoCodigo else_ )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(If, "If"), root_1);

                        adaptor.addChild(root_1, stream_condicao.nextTree());
                        adaptor.addChild(root_1, stream_blocoCodigo.nextTree());
                        adaptor.addChild(root_1, stream_else_.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // gram/i.g:63:25: 
                    {

                    // AST REWRITE
                    // elements: condicao, blocoCodigo
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 63:25: -> ^( If condicao blocoCodigo ^( SeqInstrucao ) )
                    {
                        // gram/i.g:63:28: ^( If condicao blocoCodigo ^( SeqInstrucao ) )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(If, "If"), root_1);

                        adaptor.addChild(root_1, stream_condicao.nextTree());
                        adaptor.addChild(root_1, stream_blocoCodigo.nextTree());
                        // gram/i.g:63:59: ^( SeqInstrucao )
                        {
                        Tree root_2 = (Tree)adaptor.nil();
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
        }
        return retval;
    }
    // $ANTLR end "if_"

    public static class else__return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "else_"
    // gram/i.g:67:1: else_ : 'else' ( blocoCodigo -> blocoCodigo | if_ -> if_ ) ;
    public final iParser.else__return else_() throws RecognitionException {
        iParser.else__return retval = new iParser.else__return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token string_literal47=null;
        iParser.blocoCodigo_return blocoCodigo48 = null;

        iParser.if__return if_49 = null;


        Tree string_literal47_tree=null;
        RewriteRuleTokenStream stream_89=new RewriteRuleTokenStream(adaptor,"token 89");
        RewriteRuleSubtreeStream stream_blocoCodigo=new RewriteRuleSubtreeStream(adaptor,"rule blocoCodigo");
        RewriteRuleSubtreeStream stream_if_=new RewriteRuleSubtreeStream(adaptor,"rule if_");
        try {
            // gram/i.g:67:7: ( 'else' ( blocoCodigo -> blocoCodigo | if_ -> if_ ) )
            // gram/i.g:68:2: 'else' ( blocoCodigo -> blocoCodigo | if_ -> if_ )
            {
            string_literal47=(Token)match(input,89,FOLLOW_89_in_else_604);  
            stream_89.add(string_literal47);

            // gram/i.g:68:9: ( blocoCodigo -> blocoCodigo | if_ -> if_ )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==95) ) {
                alt10=1;
            }
            else if ( (LA10_0==88) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // gram/i.g:68:11: blocoCodigo
                    {
                    pushFollow(FOLLOW_blocoCodigo_in_else_608);
                    blocoCodigo48=blocoCodigo();

                    state._fsp--;

                    stream_blocoCodigo.add(blocoCodigo48.getTree());


                    // AST REWRITE
                    // elements: blocoCodigo
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 68:23: -> blocoCodigo
                    {
                        adaptor.addChild(root_0, stream_blocoCodigo.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // gram/i.g:68:40: if_
                    {
                    pushFollow(FOLLOW_if__in_else_616);
                    if_49=if_();

                    state._fsp--;

                    stream_if_.add(if_49.getTree());


                    // AST REWRITE
                    // elements: if_
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 68:44: -> if_
                    {
                        adaptor.addChild(root_0, stream_if_.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;

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
        }
        return retval;
    }
    // $ANTLR end "else_"

    public static class for__return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "for_"
    // gram/i.g:71:1: for_ : 'for' '(' for_declaracao ';' condicao ';' expressao ')' blocoCodigo -> ^( For for_declaracao condicao expressao blocoCodigo ) ;
    public final iParser.for__return for_() throws RecognitionException {
        iParser.for__return retval = new iParser.for__return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token string_literal50=null;
        Token char_literal51=null;
        Token char_literal53=null;
        Token char_literal55=null;
        Token char_literal57=null;
        iParser.for_declaracao_return for_declaracao52 = null;

        iParser.condicao_return condicao54 = null;

        iParser.expressao_return expressao56 = null;

        iParser.blocoCodigo_return blocoCodigo58 = null;


        Tree string_literal50_tree=null;
        Tree char_literal51_tree=null;
        Tree char_literal53_tree=null;
        Tree char_literal55_tree=null;
        Tree char_literal57_tree=null;
        RewriteRuleTokenStream stream_90=new RewriteRuleTokenStream(adaptor,"token 90");
        RewriteRuleTokenStream stream_83=new RewriteRuleTokenStream(adaptor,"token 83");
        RewriteRuleTokenStream stream_86=new RewriteRuleTokenStream(adaptor,"token 86");
        RewriteRuleTokenStream stream_85=new RewriteRuleTokenStream(adaptor,"token 85");
        RewriteRuleSubtreeStream stream_blocoCodigo=new RewriteRuleSubtreeStream(adaptor,"rule blocoCodigo");
        RewriteRuleSubtreeStream stream_condicao=new RewriteRuleSubtreeStream(adaptor,"rule condicao");
        RewriteRuleSubtreeStream stream_for_declaracao=new RewriteRuleSubtreeStream(adaptor,"rule for_declaracao");
        RewriteRuleSubtreeStream stream_expressao=new RewriteRuleSubtreeStream(adaptor,"rule expressao");
        try {
            // gram/i.g:71:6: ( 'for' '(' for_declaracao ';' condicao ';' expressao ')' blocoCodigo -> ^( For for_declaracao condicao expressao blocoCodigo ) )
            // gram/i.g:72:3: 'for' '(' for_declaracao ';' condicao ';' expressao ')' blocoCodigo
            {
            string_literal50=(Token)match(input,90,FOLLOW_90_in_for_635);  
            stream_90.add(string_literal50);

            char_literal51=(Token)match(input,85,FOLLOW_85_in_for_638);  
            stream_85.add(char_literal51);

            pushFollow(FOLLOW_for_declaracao_in_for_640);
            for_declaracao52=for_declaracao();

            state._fsp--;

            stream_for_declaracao.add(for_declaracao52.getTree());
            char_literal53=(Token)match(input,83,FOLLOW_83_in_for_642);  
            stream_83.add(char_literal53);

            pushFollow(FOLLOW_condicao_in_for_645);
            condicao54=condicao();

            state._fsp--;

            stream_condicao.add(condicao54.getTree());
            char_literal55=(Token)match(input,83,FOLLOW_83_in_for_648);  
            stream_83.add(char_literal55);

            pushFollow(FOLLOW_expressao_in_for_651);
            expressao56=expressao();

            state._fsp--;

            stream_expressao.add(expressao56.getTree());
            char_literal57=(Token)match(input,86,FOLLOW_86_in_for_654);  
            stream_86.add(char_literal57);

            pushFollow(FOLLOW_blocoCodigo_in_for_657);
            blocoCodigo58=blocoCodigo();

            state._fsp--;

            stream_blocoCodigo.add(blocoCodigo58.getTree());


            // AST REWRITE
            // elements: expressao, condicao, for_declaracao, blocoCodigo
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 72:78: -> ^( For for_declaracao condicao expressao blocoCodigo )
            {
                // gram/i.g:72:81: ^( For for_declaracao condicao expressao blocoCodigo )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(For, "For"), root_1);

                adaptor.addChild(root_1, stream_for_declaracao.nextTree());
                adaptor.addChild(root_1, stream_condicao.nextTree());
                adaptor.addChild(root_1, stream_expressao.nextTree());
                adaptor.addChild(root_1, stream_blocoCodigo.nextTree());

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
        }
        return retval;
    }
    // $ANTLR end "for_"

    public static class for_declaracao_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "for_declaracao"
    // gram/i.g:75:1: for_declaracao : ( declaracao -> declaracao | atribuicao -> atribuicao ) ;
    public final iParser.for_declaracao_return for_declaracao() throws RecognitionException {
        iParser.for_declaracao_return retval = new iParser.for_declaracao_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        iParser.declaracao_return declaracao59 = null;

        iParser.atribuicao_return atribuicao60 = null;


        RewriteRuleSubtreeStream stream_atribuicao=new RewriteRuleSubtreeStream(adaptor,"rule atribuicao");
        RewriteRuleSubtreeStream stream_declaracao=new RewriteRuleSubtreeStream(adaptor,"rule declaracao");
        try {
            // gram/i.g:75:16: ( ( declaracao -> declaracao | atribuicao -> atribuicao ) )
            // gram/i.g:76:2: ( declaracao -> declaracao | atribuicao -> atribuicao )
            {
            // gram/i.g:76:2: ( declaracao -> declaracao | atribuicao -> atribuicao )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=78 && LA11_0<=82)) ) {
                alt11=1;
            }
            else if ( (LA11_0==ID) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // gram/i.g:76:4: declaracao
                    {
                    pushFollow(FOLLOW_declaracao_in_for_declaracao694);
                    declaracao59=declaracao();

                    state._fsp--;

                    stream_declaracao.add(declaracao59.getTree());


                    // AST REWRITE
                    // elements: declaracao
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 76:15: -> declaracao
                    {
                        adaptor.addChild(root_0, stream_declaracao.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // gram/i.g:77:4: atribuicao
                    {
                    pushFollow(FOLLOW_atribuicao_in_for_declaracao703);
                    atribuicao60=atribuicao();

                    state._fsp--;

                    stream_atribuicao.add(atribuicao60.getTree());


                    // AST REWRITE
                    // elements: atribuicao
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 77:15: -> atribuicao
                    {
                        adaptor.addChild(root_0, stream_atribuicao.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;

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
        }
        return retval;
    }
    // $ANTLR end "for_declaracao"

    public static class while__return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "while_"
    // gram/i.g:81:1: while_ : 'while' '(' condicao ')' blocoCodigo -> ^( While condicao blocoCodigo ) ;
    public final iParser.while__return while_() throws RecognitionException {
        iParser.while__return retval = new iParser.while__return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token string_literal61=null;
        Token char_literal62=null;
        Token char_literal64=null;
        iParser.condicao_return condicao63 = null;

        iParser.blocoCodigo_return blocoCodigo65 = null;


        Tree string_literal61_tree=null;
        Tree char_literal62_tree=null;
        Tree char_literal64_tree=null;
        RewriteRuleTokenStream stream_91=new RewriteRuleTokenStream(adaptor,"token 91");
        RewriteRuleTokenStream stream_86=new RewriteRuleTokenStream(adaptor,"token 86");
        RewriteRuleTokenStream stream_85=new RewriteRuleTokenStream(adaptor,"token 85");
        RewriteRuleSubtreeStream stream_blocoCodigo=new RewriteRuleSubtreeStream(adaptor,"rule blocoCodigo");
        RewriteRuleSubtreeStream stream_condicao=new RewriteRuleSubtreeStream(adaptor,"rule condicao");
        try {
            // gram/i.g:81:8: ( 'while' '(' condicao ')' blocoCodigo -> ^( While condicao blocoCodigo ) )
            // gram/i.g:82:3: 'while' '(' condicao ')' blocoCodigo
            {
            string_literal61=(Token)match(input,91,FOLLOW_91_in_while_725);  
            stream_91.add(string_literal61);

            char_literal62=(Token)match(input,85,FOLLOW_85_in_while_728);  
            stream_85.add(char_literal62);

            pushFollow(FOLLOW_condicao_in_while_731);
            condicao63=condicao();

            state._fsp--;

            stream_condicao.add(condicao63.getTree());
            char_literal64=(Token)match(input,86,FOLLOW_86_in_while_734);  
            stream_86.add(char_literal64);

            pushFollow(FOLLOW_blocoCodigo_in_while_737);
            blocoCodigo65=blocoCodigo();

            state._fsp--;

            stream_blocoCodigo.add(blocoCodigo65.getTree());


            // AST REWRITE
            // elements: blocoCodigo, condicao
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 82:45: -> ^( While condicao blocoCodigo )
            {
                // gram/i.g:82:48: ^( While condicao blocoCodigo )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(While, "While"), root_1);

                adaptor.addChild(root_1, stream_condicao.nextTree());
                adaptor.addChild(root_1, stream_blocoCodigo.nextTree());

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
        }
        return retval;
    }
    // $ANTLR end "while_"

    public static class return__return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "return_"
    // gram/i.g:85:1: return_ : 'return' expressao -> ^( Return expressao ) ;
    public final iParser.return__return return_() throws RecognitionException {
        iParser.return__return retval = new iParser.return__return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token string_literal66=null;
        iParser.expressao_return expressao67 = null;


        Tree string_literal66_tree=null;
        RewriteRuleTokenStream stream_92=new RewriteRuleTokenStream(adaptor,"token 92");
        RewriteRuleSubtreeStream stream_expressao=new RewriteRuleSubtreeStream(adaptor,"rule expressao");
        try {
            // gram/i.g:85:10: ( 'return' expressao -> ^( Return expressao ) )
            // gram/i.g:86:3: 'return' expressao
            {
            string_literal66=(Token)match(input,92,FOLLOW_92_in_return_769);  
            stream_92.add(string_literal66);

            pushFollow(FOLLOW_expressao_in_return_772);
            expressao67=expressao();

            state._fsp--;

            stream_expressao.add(expressao67.getTree());


            // AST REWRITE
            // elements: expressao
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 86:24: -> ^( Return expressao )
            {
                // gram/i.g:86:27: ^( Return expressao )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Return, "Return"), root_1);

                adaptor.addChild(root_1, stream_expressao.nextTree());

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
        }
        return retval;
    }
    // $ANTLR end "return_"

    public static class call_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "call"
    // gram/i.g:89:1: call : ID '(' ( parametros )? ')' -> ^( Call ID ^( ListaParametros ( parametros )? ) ) ;
    public final iParser.call_return call() throws RecognitionException {
        iParser.call_return retval = new iParser.call_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token ID68=null;
        Token char_literal69=null;
        Token char_literal71=null;
        iParser.parametros_return parametros70 = null;


        Tree ID68_tree=null;
        Tree char_literal69_tree=null;
        Tree char_literal71_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_86=new RewriteRuleTokenStream(adaptor,"token 86");
        RewriteRuleTokenStream stream_85=new RewriteRuleTokenStream(adaptor,"token 85");
        RewriteRuleSubtreeStream stream_parametros=new RewriteRuleSubtreeStream(adaptor,"rule parametros");
        try {
            // gram/i.g:89:6: ( ID '(' ( parametros )? ')' -> ^( Call ID ^( ListaParametros ( parametros )? ) ) )
            // gram/i.g:90:3: ID '(' ( parametros )? ')'
            {
            ID68=(Token)match(input,ID,FOLLOW_ID_in_call799);  
            stream_ID.add(ID68);

            char_literal69=(Token)match(input,85,FOLLOW_85_in_call803);  
            stream_85.add(char_literal69);

            // gram/i.g:90:13: ( parametros )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=INT && LA12_0<=ID)||LA12_0==94||(LA12_0>=111 && LA12_0<=112)||(LA12_0>=116 && LA12_0<=120)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // gram/i.g:90:13: parametros
                    {
                    pushFollow(FOLLOW_parametros_in_call806);
                    parametros70=parametros();

                    state._fsp--;

                    stream_parametros.add(parametros70.getTree());

                    }
                    break;

            }

            char_literal71=(Token)match(input,86,FOLLOW_86_in_call810);  
            stream_86.add(char_literal71);



            // AST REWRITE
            // elements: ID, parametros
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 90:31: -> ^( Call ID ^( ListaParametros ( parametros )? ) )
            {
                // gram/i.g:90:34: ^( Call ID ^( ListaParametros ( parametros )? ) )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Call, "Call"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                // gram/i.g:90:47: ^( ListaParametros ( parametros )? )
                {
                Tree root_2 = (Tree)adaptor.nil();
                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(ListaParametros, "ListaParametros"), root_2);

                // gram/i.g:90:65: ( parametros )?
                if ( stream_parametros.hasNext() ) {
                    adaptor.addChild(root_2, stream_parametros.nextTree());

                }
                stream_parametros.reset();

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
        }
        return retval;
    }
    // $ANTLR end "call"

    public static class print__return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "print_"
    // gram/i.g:93:1: print_ : 'print' '(' expressao ')' -> ^( Exp ^( Print expressao ) ) ;
    public final iParser.print__return print_() throws RecognitionException {
        iParser.print__return retval = new iParser.print__return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token string_literal72=null;
        Token char_literal73=null;
        Token char_literal75=null;
        iParser.expressao_return expressao74 = null;


        Tree string_literal72_tree=null;
        Tree char_literal73_tree=null;
        Tree char_literal75_tree=null;
        RewriteRuleTokenStream stream_93=new RewriteRuleTokenStream(adaptor,"token 93");
        RewriteRuleTokenStream stream_86=new RewriteRuleTokenStream(adaptor,"token 86");
        RewriteRuleTokenStream stream_85=new RewriteRuleTokenStream(adaptor,"token 85");
        RewriteRuleSubtreeStream stream_expressao=new RewriteRuleSubtreeStream(adaptor,"rule expressao");
        try {
            // gram/i.g:93:8: ( 'print' '(' expressao ')' -> ^( Exp ^( Print expressao ) ) )
            // gram/i.g:94:3: 'print' '(' expressao ')'
            {
            string_literal72=(Token)match(input,93,FOLLOW_93_in_print_843);  
            stream_93.add(string_literal72);

            char_literal73=(Token)match(input,85,FOLLOW_85_in_print_846);  
            stream_85.add(char_literal73);

            pushFollow(FOLLOW_expressao_in_print_849);
            expressao74=expressao();

            state._fsp--;

            stream_expressao.add(expressao74.getTree());
            char_literal75=(Token)match(input,86,FOLLOW_86_in_print_852);  
            stream_86.add(char_literal75);



            // AST REWRITE
            // elements: expressao
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 94:33: -> ^( Exp ^( Print expressao ) )
            {
                // gram/i.g:94:36: ^( Exp ^( Print expressao ) )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Exp, "Exp"), root_1);

                // gram/i.g:94:42: ^( Print expressao )
                {
                Tree root_2 = (Tree)adaptor.nil();
                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Print, "Print"), root_2);

                adaptor.addChild(root_2, stream_expressao.nextTree());

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
        }
        return retval;
    }
    // $ANTLR end "print_"

    public static class input__return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "input_"
    // gram/i.g:97:1: input_ : 'input' '(' idTipo ')' -> ^( Input idTipo ) ;
    public final iParser.input__return input_() throws RecognitionException {
        iParser.input__return retval = new iParser.input__return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token string_literal76=null;
        Token char_literal77=null;
        Token char_literal79=null;
        iParser.idTipo_return idTipo78 = null;


        Tree string_literal76_tree=null;
        Tree char_literal77_tree=null;
        Tree char_literal79_tree=null;
        RewriteRuleTokenStream stream_94=new RewriteRuleTokenStream(adaptor,"token 94");
        RewriteRuleTokenStream stream_86=new RewriteRuleTokenStream(adaptor,"token 86");
        RewriteRuleTokenStream stream_85=new RewriteRuleTokenStream(adaptor,"token 85");
        RewriteRuleSubtreeStream stream_idTipo=new RewriteRuleSubtreeStream(adaptor,"rule idTipo");
        try {
            // gram/i.g:97:8: ( 'input' '(' idTipo ')' -> ^( Input idTipo ) )
            // gram/i.g:98:3: 'input' '(' idTipo ')'
            {
            string_literal76=(Token)match(input,94,FOLLOW_94_in_input_883);  
            stream_94.add(string_literal76);

            char_literal77=(Token)match(input,85,FOLLOW_85_in_input_886);  
            stream_85.add(char_literal77);

            pushFollow(FOLLOW_idTipo_in_input_889);
            idTipo78=idTipo();

            state._fsp--;

            stream_idTipo.add(idTipo78.getTree());
            char_literal79=(Token)match(input,86,FOLLOW_86_in_input_892);  
            stream_86.add(char_literal79);



            // AST REWRITE
            // elements: idTipo
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 98:30: -> ^( Input idTipo )
            {
                // gram/i.g:98:33: ^( Input idTipo )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Input, "Input"), root_1);

                adaptor.addChild(root_1, stream_idTipo.nextTree());

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
        }
        return retval;
    }
    // $ANTLR end "input_"

    public static class parametros_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "parametros"
    // gram/i.g:101:1: parametros : parametro ( ',' parametro )* -> ( parametro )+ ;
    public final iParser.parametros_return parametros() throws RecognitionException {
        iParser.parametros_return retval = new iParser.parametros_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token char_literal81=null;
        iParser.parametro_return parametro80 = null;

        iParser.parametro_return parametro82 = null;


        Tree char_literal81_tree=null;
        RewriteRuleTokenStream stream_87=new RewriteRuleTokenStream(adaptor,"token 87");
        RewriteRuleSubtreeStream stream_parametro=new RewriteRuleSubtreeStream(adaptor,"rule parametro");
        try {
            // gram/i.g:101:12: ( parametro ( ',' parametro )* -> ( parametro )+ )
            // gram/i.g:102:2: parametro ( ',' parametro )*
            {
            pushFollow(FOLLOW_parametro_in_parametros918);
            parametro80=parametro();

            state._fsp--;

            stream_parametro.add(parametro80.getTree());
            // gram/i.g:102:12: ( ',' parametro )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==87) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // gram/i.g:102:14: ',' parametro
            	    {
            	    char_literal81=(Token)match(input,87,FOLLOW_87_in_parametros922);  
            	    stream_87.add(char_literal81);

            	    pushFollow(FOLLOW_parametro_in_parametros924);
            	    parametro82=parametro();

            	    state._fsp--;

            	    stream_parametro.add(parametro82.getTree());

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);



            // AST REWRITE
            // elements: parametro
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 102:30: -> ( parametro )+
            {
                if ( !(stream_parametro.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_parametro.hasNext() ) {
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
        }
        return retval;
    }
    // $ANTLR end "parametros"

    public static class parametro_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "parametro"
    // gram/i.g:105:1: parametro : expressao -> ^( Parametro expressao ) ;
    public final iParser.parametro_return parametro() throws RecognitionException {
        iParser.parametro_return retval = new iParser.parametro_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        iParser.expressao_return expressao83 = null;


        RewriteRuleSubtreeStream stream_expressao=new RewriteRuleSubtreeStream(adaptor,"rule expressao");
        try {
            // gram/i.g:105:11: ( expressao -> ^( Parametro expressao ) )
            // gram/i.g:106:3: expressao
            {
            pushFollow(FOLLOW_expressao_in_parametro944);
            expressao83=expressao();

            state._fsp--;

            stream_expressao.add(expressao83.getTree());


            // AST REWRITE
            // elements: expressao
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 106:14: -> ^( Parametro expressao )
            {
                // gram/i.g:106:17: ^( Parametro expressao )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Parametro, "Parametro"), root_1);

                adaptor.addChild(root_1, stream_expressao.nextTree());

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
        }
        return retval;
    }
    // $ANTLR end "parametro"

    public static class blocoCodigo_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "blocoCodigo"
    // gram/i.g:109:1: blocoCodigo : '{' ( codigo )* '}' -> ^( SeqInstrucao ( codigo )* ) ;
    public final iParser.blocoCodigo_return blocoCodigo() throws RecognitionException {
        iParser.blocoCodigo_return retval = new iParser.blocoCodigo_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token char_literal84=null;
        Token char_literal86=null;
        iParser.codigo_return codigo85 = null;


        Tree char_literal84_tree=null;
        Tree char_literal86_tree=null;
        RewriteRuleTokenStream stream_96=new RewriteRuleTokenStream(adaptor,"token 96");
        RewriteRuleTokenStream stream_95=new RewriteRuleTokenStream(adaptor,"token 95");
        RewriteRuleSubtreeStream stream_codigo=new RewriteRuleSubtreeStream(adaptor,"rule codigo");
        try {
            // gram/i.g:109:13: ( '{' ( codigo )* '}' -> ^( SeqInstrucao ( codigo )* ) )
            // gram/i.g:110:2: '{' ( codigo )* '}'
            {
            char_literal84=(Token)match(input,95,FOLLOW_95_in_blocoCodigo967);  
            stream_95.add(char_literal84);

            // gram/i.g:110:6: ( codigo )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==ID||(LA14_0>=78 && LA14_0<=82)||LA14_0==88||(LA14_0>=90 && LA14_0<=93)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // gram/i.g:110:6: codigo
            	    {
            	    pushFollow(FOLLOW_codigo_in_blocoCodigo969);
            	    codigo85=codigo();

            	    state._fsp--;

            	    stream_codigo.add(codigo85.getTree());

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            char_literal86=(Token)match(input,96,FOLLOW_96_in_blocoCodigo972);  
            stream_96.add(char_literal86);



            // AST REWRITE
            // elements: codigo
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 110:18: -> ^( SeqInstrucao ( codigo )* )
            {
                // gram/i.g:110:21: ^( SeqInstrucao ( codigo )* )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(SeqInstrucao, "SeqInstrucao"), root_1);

                // gram/i.g:110:36: ( codigo )*
                while ( stream_codigo.hasNext() ) {
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
        }
        return retval;
    }
    // $ANTLR end "blocoCodigo"

    public static class codigo_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "codigo"
    // gram/i.g:113:1: codigo : ( atribuicao ';' -> atribuicao | declaracao ';' -> declaracao | instrucao -> instrucao ) ;
    public final iParser.codigo_return codigo() throws RecognitionException {
        iParser.codigo_return retval = new iParser.codigo_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token char_literal88=null;
        Token char_literal90=null;
        iParser.atribuicao_return atribuicao87 = null;

        iParser.declaracao_return declaracao89 = null;

        iParser.instrucao_return instrucao91 = null;


        Tree char_literal88_tree=null;
        Tree char_literal90_tree=null;
        RewriteRuleTokenStream stream_83=new RewriteRuleTokenStream(adaptor,"token 83");
        RewriteRuleSubtreeStream stream_atribuicao=new RewriteRuleSubtreeStream(adaptor,"rule atribuicao");
        RewriteRuleSubtreeStream stream_declaracao=new RewriteRuleSubtreeStream(adaptor,"rule declaracao");
        RewriteRuleSubtreeStream stream_instrucao=new RewriteRuleSubtreeStream(adaptor,"rule instrucao");
        try {
            // gram/i.g:113:8: ( ( atribuicao ';' -> atribuicao | declaracao ';' -> declaracao | instrucao -> instrucao ) )
            // gram/i.g:114:2: ( atribuicao ';' -> atribuicao | declaracao ';' -> declaracao | instrucao -> instrucao )
            {
            // gram/i.g:114:2: ( atribuicao ';' -> atribuicao | declaracao ';' -> declaracao | instrucao -> instrucao )
            int alt15=3;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==85) ) {
                    alt15=3;
                }
                else if ( (LA15_1==84||(LA15_1>=107 && LA15_1<=110)) ) {
                    alt15=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 1, input);

                    throw nvae;
                }
                }
                break;
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
                {
                alt15=2;
                }
                break;
            case 88:
            case 90:
            case 91:
            case 92:
            case 93:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // gram/i.g:114:4: atribuicao ';'
                    {
                    pushFollow(FOLLOW_atribuicao_in_codigo994);
                    atribuicao87=atribuicao();

                    state._fsp--;

                    stream_atribuicao.add(atribuicao87.getTree());
                    char_literal88=(Token)match(input,83,FOLLOW_83_in_codigo996);  
                    stream_83.add(char_literal88);



                    // AST REWRITE
                    // elements: atribuicao
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 114:19: -> atribuicao
                    {
                        adaptor.addChild(root_0, stream_atribuicao.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // gram/i.g:115:4: declaracao ';'
                    {
                    pushFollow(FOLLOW_declaracao_in_codigo1005);
                    declaracao89=declaracao();

                    state._fsp--;

                    stream_declaracao.add(declaracao89.getTree());
                    char_literal90=(Token)match(input,83,FOLLOW_83_in_codigo1007);  
                    stream_83.add(char_literal90);



                    // AST REWRITE
                    // elements: declaracao
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 115:19: -> declaracao
                    {
                        adaptor.addChild(root_0, stream_declaracao.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // gram/i.g:116:4: instrucao
                    {
                    pushFollow(FOLLOW_instrucao_in_codigo1016);
                    instrucao91=instrucao();

                    state._fsp--;

                    stream_instrucao.add(instrucao91.getTree());


                    // AST REWRITE
                    // elements: instrucao
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 116:14: -> instrucao
                    {
                        adaptor.addChild(root_0, stream_instrucao.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;

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
        }
        return retval;
    }
    // $ANTLR end "codigo"

    public static class condicao_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "condicao"
    // gram/i.g:123:1: condicao : condicao_ou ( '?' expressao ':' condicao -> ^( Condicional condicao_ou expressao condicao ) | -> condicao_ou ) ;
    public final iParser.condicao_return condicao() throws RecognitionException {
        iParser.condicao_return retval = new iParser.condicao_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token char_literal93=null;
        Token char_literal95=null;
        iParser.condicao_ou_return condicao_ou92 = null;

        iParser.expressao_return expressao94 = null;

        iParser.condicao_return condicao96 = null;


        Tree char_literal93_tree=null;
        Tree char_literal95_tree=null;
        RewriteRuleTokenStream stream_98=new RewriteRuleTokenStream(adaptor,"token 98");
        RewriteRuleTokenStream stream_97=new RewriteRuleTokenStream(adaptor,"token 97");
        RewriteRuleSubtreeStream stream_condicao_ou=new RewriteRuleSubtreeStream(adaptor,"rule condicao_ou");
        RewriteRuleSubtreeStream stream_condicao=new RewriteRuleSubtreeStream(adaptor,"rule condicao");
        RewriteRuleSubtreeStream stream_expressao=new RewriteRuleSubtreeStream(adaptor,"rule expressao");
        try {
            // gram/i.g:123:11: ( condicao_ou ( '?' expressao ':' condicao -> ^( Condicional condicao_ou expressao condicao ) | -> condicao_ou ) )
            // gram/i.g:124:2: condicao_ou ( '?' expressao ':' condicao -> ^( Condicional condicao_ou expressao condicao ) | -> condicao_ou )
            {
            pushFollow(FOLLOW_condicao_ou_in_condicao1039);
            condicao_ou92=condicao_ou();

            state._fsp--;

            stream_condicao_ou.add(condicao_ou92.getTree());
            // gram/i.g:124:14: ( '?' expressao ':' condicao -> ^( Condicional condicao_ou expressao condicao ) | -> condicao_ou )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==97) ) {
                alt16=1;
            }
            else if ( (LA16_0==83||LA16_0==86) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // gram/i.g:124:17: '?' expressao ':' condicao
                    {
                    char_literal93=(Token)match(input,97,FOLLOW_97_in_condicao1044);  
                    stream_97.add(char_literal93);

                    pushFollow(FOLLOW_expressao_in_condicao1047);
                    expressao94=expressao();

                    state._fsp--;

                    stream_expressao.add(expressao94.getTree());
                    char_literal95=(Token)match(input,98,FOLLOW_98_in_condicao1050);  
                    stream_98.add(char_literal95);

                    pushFollow(FOLLOW_condicao_in_condicao1053);
                    condicao96=condicao();

                    state._fsp--;

                    stream_condicao.add(condicao96.getTree());


                    // AST REWRITE
                    // elements: condicao, condicao_ou, expressao
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 124:47: -> ^( Condicional condicao_ou expressao condicao )
                    {
                        // gram/i.g:124:50: ^( Condicional condicao_ou expressao condicao )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Condicional, "Condicional"), root_1);

                        adaptor.addChild(root_1, stream_condicao_ou.nextTree());
                        adaptor.addChild(root_1, stream_expressao.nextTree());
                        adaptor.addChild(root_1, stream_condicao.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // gram/i.g:125:7: 
                    {

                    // AST REWRITE
                    // elements: condicao_ou
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 125:7: -> condicao_ou
                    {
                        adaptor.addChild(root_0, stream_condicao_ou.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;

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
        }
        return retval;
    }
    // $ANTLR end "condicao"

    public static class condicao_ou_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "condicao_ou"
    // gram/i.g:129:1: condicao_ou : ( condicao_e -> condicao_e ) ( '||' c= condicao_e -> ^( Ou $condicao_ou $c) )* ;
    public final iParser.condicao_ou_return condicao_ou() throws RecognitionException {
        iParser.condicao_ou_return retval = new iParser.condicao_ou_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token string_literal98=null;
        iParser.condicao_e_return c = null;

        iParser.condicao_e_return condicao_e97 = null;


        Tree string_literal98_tree=null;
        RewriteRuleTokenStream stream_99=new RewriteRuleTokenStream(adaptor,"token 99");
        RewriteRuleSubtreeStream stream_condicao_e=new RewriteRuleSubtreeStream(adaptor,"rule condicao_e");
        try {
            // gram/i.g:129:13: ( ( condicao_e -> condicao_e ) ( '||' c= condicao_e -> ^( Ou $condicao_ou $c) )* )
            // gram/i.g:130:2: ( condicao_e -> condicao_e ) ( '||' c= condicao_e -> ^( Ou $condicao_ou $c) )*
            {
            // gram/i.g:130:2: ( condicao_e -> condicao_e )
            // gram/i.g:130:3: condicao_e
            {
            pushFollow(FOLLOW_condicao_e_in_condicao_ou1099);
            condicao_e97=condicao_e();

            state._fsp--;

            stream_condicao_e.add(condicao_e97.getTree());


            // AST REWRITE
            // elements: condicao_e
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 130:14: -> condicao_e
            {
                adaptor.addChild(root_0, stream_condicao_e.nextTree());

            }

            retval.tree = root_0;
            }

            // gram/i.g:130:29: ( '||' c= condicao_e -> ^( Ou $condicao_ou $c) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==99) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // gram/i.g:130:32: '||' c= condicao_e
            	    {
            	    string_literal98=(Token)match(input,99,FOLLOW_99_in_condicao_ou1109);  
            	    stream_99.add(string_literal98);

            	    pushFollow(FOLLOW_condicao_e_in_condicao_ou1114);
            	    c=condicao_e();

            	    state._fsp--;

            	    stream_condicao_e.add(c.getTree());


            	    // AST REWRITE
            	    // elements: condicao_ou, c
            	    // token labels: 
            	    // rule labels: retval, c
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	    RewriteRuleSubtreeStream stream_c=new RewriteRuleSubtreeStream(adaptor,"rule c",c!=null?c.tree:null);

            	    root_0 = (Tree)adaptor.nil();
            	    // 130:51: -> ^( Ou $condicao_ou $c)
            	    {
            	        // gram/i.g:130:54: ^( Ou $condicao_ou $c)
            	        {
            	        Tree root_1 = (Tree)adaptor.nil();
            	        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Ou, "Ou"), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());
            	        adaptor.addChild(root_1, stream_c.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;
            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


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
        }
        return retval;
    }
    // $ANTLR end "condicao_ou"

    public static class condicao_e_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "condicao_e"
    // gram/i.g:133:1: condicao_e : ( condicao_comparacao -> condicao_comparacao ) ( '&&' c= condicao_comparacao -> ^( E $condicao_e $c) )* ;
    public final iParser.condicao_e_return condicao_e() throws RecognitionException {
        iParser.condicao_e_return retval = new iParser.condicao_e_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token string_literal100=null;
        iParser.condicao_comparacao_return c = null;

        iParser.condicao_comparacao_return condicao_comparacao99 = null;


        Tree string_literal100_tree=null;
        RewriteRuleTokenStream stream_100=new RewriteRuleTokenStream(adaptor,"token 100");
        RewriteRuleSubtreeStream stream_condicao_comparacao=new RewriteRuleSubtreeStream(adaptor,"rule condicao_comparacao");
        try {
            // gram/i.g:133:12: ( ( condicao_comparacao -> condicao_comparacao ) ( '&&' c= condicao_comparacao -> ^( E $condicao_e $c) )* )
            // gram/i.g:134:2: ( condicao_comparacao -> condicao_comparacao ) ( '&&' c= condicao_comparacao -> ^( E $condicao_e $c) )*
            {
            // gram/i.g:134:2: ( condicao_comparacao -> condicao_comparacao )
            // gram/i.g:134:3: condicao_comparacao
            {
            pushFollow(FOLLOW_condicao_comparacao_in_condicao_e1145);
            condicao_comparacao99=condicao_comparacao();

            state._fsp--;

            stream_condicao_comparacao.add(condicao_comparacao99.getTree());


            // AST REWRITE
            // elements: condicao_comparacao
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 134:23: -> condicao_comparacao
            {
                adaptor.addChild(root_0, stream_condicao_comparacao.nextTree());

            }

            retval.tree = root_0;
            }

            // gram/i.g:134:47: ( '&&' c= condicao_comparacao -> ^( E $condicao_e $c) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==100) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // gram/i.g:134:50: '&&' c= condicao_comparacao
            	    {
            	    string_literal100=(Token)match(input,100,FOLLOW_100_in_condicao_e1155);  
            	    stream_100.add(string_literal100);

            	    pushFollow(FOLLOW_condicao_comparacao_in_condicao_e1160);
            	    c=condicao_comparacao();

            	    state._fsp--;

            	    stream_condicao_comparacao.add(c.getTree());


            	    // AST REWRITE
            	    // elements: c, condicao_e
            	    // token labels: 
            	    // rule labels: retval, c
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	    RewriteRuleSubtreeStream stream_c=new RewriteRuleSubtreeStream(adaptor,"rule c",c!=null?c.tree:null);

            	    root_0 = (Tree)adaptor.nil();
            	    // 134:78: -> ^( E $condicao_e $c)
            	    {
            	        // gram/i.g:134:81: ^( E $condicao_e $c)
            	        {
            	        Tree root_1 = (Tree)adaptor.nil();
            	        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(E, "E"), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());
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
            } while (true);


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
        }
        return retval;
    }
    // $ANTLR end "condicao_e"

    public static class condicao_comparacao_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "condicao_comparacao"
    // gram/i.g:137:1: condicao_comparacao : ( condicao_igualdade -> condicao_igualdade ) ( ( '>' c= condicao_igualdade -> ^( Comp $condicao_comparacao ^( Maior ) $c) | '<' c= condicao_igualdade -> ^( Comp $condicao_comparacao ^( Menor ) $c) | '>=' c= condicao_igualdade -> ^( Comp $condicao_comparacao ^( MaiorQ ) $c) | '<=' c= condicao_igualdade -> ^( Comp $condicao_comparacao ^( MenorQ ) $c) ) )* ;
    public final iParser.condicao_comparacao_return condicao_comparacao() throws RecognitionException {
        iParser.condicao_comparacao_return retval = new iParser.condicao_comparacao_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token char_literal102=null;
        Token char_literal103=null;
        Token string_literal104=null;
        Token string_literal105=null;
        iParser.condicao_igualdade_return c = null;

        iParser.condicao_igualdade_return condicao_igualdade101 = null;


        Tree char_literal102_tree=null;
        Tree char_literal103_tree=null;
        Tree string_literal104_tree=null;
        Tree string_literal105_tree=null;
        RewriteRuleTokenStream stream_104=new RewriteRuleTokenStream(adaptor,"token 104");
        RewriteRuleTokenStream stream_103=new RewriteRuleTokenStream(adaptor,"token 103");
        RewriteRuleTokenStream stream_102=new RewriteRuleTokenStream(adaptor,"token 102");
        RewriteRuleTokenStream stream_101=new RewriteRuleTokenStream(adaptor,"token 101");
        RewriteRuleSubtreeStream stream_condicao_igualdade=new RewriteRuleSubtreeStream(adaptor,"rule condicao_igualdade");
        try {
            // gram/i.g:137:21: ( ( condicao_igualdade -> condicao_igualdade ) ( ( '>' c= condicao_igualdade -> ^( Comp $condicao_comparacao ^( Maior ) $c) | '<' c= condicao_igualdade -> ^( Comp $condicao_comparacao ^( Menor ) $c) | '>=' c= condicao_igualdade -> ^( Comp $condicao_comparacao ^( MaiorQ ) $c) | '<=' c= condicao_igualdade -> ^( Comp $condicao_comparacao ^( MenorQ ) $c) ) )* )
            // gram/i.g:138:2: ( condicao_igualdade -> condicao_igualdade ) ( ( '>' c= condicao_igualdade -> ^( Comp $condicao_comparacao ^( Maior ) $c) | '<' c= condicao_igualdade -> ^( Comp $condicao_comparacao ^( Menor ) $c) | '>=' c= condicao_igualdade -> ^( Comp $condicao_comparacao ^( MaiorQ ) $c) | '<=' c= condicao_igualdade -> ^( Comp $condicao_comparacao ^( MenorQ ) $c) ) )*
            {
            // gram/i.g:138:2: ( condicao_igualdade -> condicao_igualdade )
            // gram/i.g:138:3: condicao_igualdade
            {
            pushFollow(FOLLOW_condicao_igualdade_in_condicao_comparacao1191);
            condicao_igualdade101=condicao_igualdade();

            state._fsp--;

            stream_condicao_igualdade.add(condicao_igualdade101.getTree());


            // AST REWRITE
            // elements: condicao_igualdade
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 138:22: -> condicao_igualdade
            {
                adaptor.addChild(root_0, stream_condicao_igualdade.nextTree());

            }

            retval.tree = root_0;
            }

            // gram/i.g:138:46: ( ( '>' c= condicao_igualdade -> ^( Comp $condicao_comparacao ^( Maior ) $c) | '<' c= condicao_igualdade -> ^( Comp $condicao_comparacao ^( Menor ) $c) | '>=' c= condicao_igualdade -> ^( Comp $condicao_comparacao ^( MaiorQ ) $c) | '<=' c= condicao_igualdade -> ^( Comp $condicao_comparacao ^( MenorQ ) $c) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=101 && LA20_0<=104)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // gram/i.g:138:49: ( '>' c= condicao_igualdade -> ^( Comp $condicao_comparacao ^( Maior ) $c) | '<' c= condicao_igualdade -> ^( Comp $condicao_comparacao ^( Menor ) $c) | '>=' c= condicao_igualdade -> ^( Comp $condicao_comparacao ^( MaiorQ ) $c) | '<=' c= condicao_igualdade -> ^( Comp $condicao_comparacao ^( MenorQ ) $c) )
            	    {
            	    // gram/i.g:138:49: ( '>' c= condicao_igualdade -> ^( Comp $condicao_comparacao ^( Maior ) $c) | '<' c= condicao_igualdade -> ^( Comp $condicao_comparacao ^( Menor ) $c) | '>=' c= condicao_igualdade -> ^( Comp $condicao_comparacao ^( MaiorQ ) $c) | '<=' c= condicao_igualdade -> ^( Comp $condicao_comparacao ^( MenorQ ) $c) )
            	    int alt19=4;
            	    switch ( input.LA(1) ) {
            	    case 101:
            	        {
            	        alt19=1;
            	        }
            	        break;
            	    case 102:
            	        {
            	        alt19=2;
            	        }
            	        break;
            	    case 103:
            	        {
            	        alt19=3;
            	        }
            	        break;
            	    case 104:
            	        {
            	        alt19=4;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 19, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt19) {
            	        case 1 :
            	            // gram/i.g:138:51: '>' c= condicao_igualdade
            	            {
            	            char_literal102=(Token)match(input,101,FOLLOW_101_in_condicao_comparacao1204);  
            	            stream_101.add(char_literal102);

            	            pushFollow(FOLLOW_condicao_igualdade_in_condicao_comparacao1209);
            	            c=condicao_igualdade();

            	            state._fsp--;

            	            stream_condicao_igualdade.add(c.getTree());


            	            // AST REWRITE
            	            // elements: c, condicao_comparacao
            	            // token labels: 
            	            // rule labels: retval, c
            	            // token list labels: 
            	            // rule list labels: 
            	            // wildcard labels: 
            	            retval.tree = root_0;
            	            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	            RewriteRuleSubtreeStream stream_c=new RewriteRuleSubtreeStream(adaptor,"rule c",c!=null?c.tree:null);

            	            root_0 = (Tree)adaptor.nil();
            	            // 138:77: -> ^( Comp $condicao_comparacao ^( Maior ) $c)
            	            {
            	                // gram/i.g:138:80: ^( Comp $condicao_comparacao ^( Maior ) $c)
            	                {
            	                Tree root_1 = (Tree)adaptor.nil();
            	                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comp, "Comp"), root_1);

            	                adaptor.addChild(root_1, stream_retval.nextTree());
            	                // gram/i.g:138:109: ^( Maior )
            	                {
            	                Tree root_2 = (Tree)adaptor.nil();
            	                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Maior, "Maior"), root_2);

            	                adaptor.addChild(root_1, root_2);
            	                }
            	                adaptor.addChild(root_1, stream_c.nextTree());

            	                adaptor.addChild(root_0, root_1);
            	                }

            	            }

            	            retval.tree = root_0;
            	            }
            	            break;
            	        case 2 :
            	            // gram/i.g:139:20: '<' c= condicao_igualdade
            	            {
            	            char_literal103=(Token)match(input,102,FOLLOW_102_in_condicao_comparacao1249);  
            	            stream_102.add(char_literal103);

            	            pushFollow(FOLLOW_condicao_igualdade_in_condicao_comparacao1254);
            	            c=condicao_igualdade();

            	            state._fsp--;

            	            stream_condicao_igualdade.add(c.getTree());


            	            // AST REWRITE
            	            // elements: c, condicao_comparacao
            	            // token labels: 
            	            // rule labels: retval, c
            	            // token list labels: 
            	            // rule list labels: 
            	            // wildcard labels: 
            	            retval.tree = root_0;
            	            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	            RewriteRuleSubtreeStream stream_c=new RewriteRuleSubtreeStream(adaptor,"rule c",c!=null?c.tree:null);

            	            root_0 = (Tree)adaptor.nil();
            	            // 139:46: -> ^( Comp $condicao_comparacao ^( Menor ) $c)
            	            {
            	                // gram/i.g:139:49: ^( Comp $condicao_comparacao ^( Menor ) $c)
            	                {
            	                Tree root_1 = (Tree)adaptor.nil();
            	                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comp, "Comp"), root_1);

            	                adaptor.addChild(root_1, stream_retval.nextTree());
            	                // gram/i.g:139:78: ^( Menor )
            	                {
            	                Tree root_2 = (Tree)adaptor.nil();
            	                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Menor, "Menor"), root_2);

            	                adaptor.addChild(root_1, root_2);
            	                }
            	                adaptor.addChild(root_1, stream_c.nextTree());

            	                adaptor.addChild(root_0, root_1);
            	                }

            	            }

            	            retval.tree = root_0;
            	            }
            	            break;
            	        case 3 :
            	            // gram/i.g:140:20: '>=' c= condicao_igualdade
            	            {
            	            string_literal104=(Token)match(input,103,FOLLOW_103_in_condicao_comparacao1294);  
            	            stream_103.add(string_literal104);

            	            pushFollow(FOLLOW_condicao_igualdade_in_condicao_comparacao1299);
            	            c=condicao_igualdade();

            	            state._fsp--;

            	            stream_condicao_igualdade.add(c.getTree());


            	            // AST REWRITE
            	            // elements: c, condicao_comparacao
            	            // token labels: 
            	            // rule labels: retval, c
            	            // token list labels: 
            	            // rule list labels: 
            	            // wildcard labels: 
            	            retval.tree = root_0;
            	            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	            RewriteRuleSubtreeStream stream_c=new RewriteRuleSubtreeStream(adaptor,"rule c",c!=null?c.tree:null);

            	            root_0 = (Tree)adaptor.nil();
            	            // 140:47: -> ^( Comp $condicao_comparacao ^( MaiorQ ) $c)
            	            {
            	                // gram/i.g:140:50: ^( Comp $condicao_comparacao ^( MaiorQ ) $c)
            	                {
            	                Tree root_1 = (Tree)adaptor.nil();
            	                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comp, "Comp"), root_1);

            	                adaptor.addChild(root_1, stream_retval.nextTree());
            	                // gram/i.g:140:79: ^( MaiorQ )
            	                {
            	                Tree root_2 = (Tree)adaptor.nil();
            	                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(MaiorQ, "MaiorQ"), root_2);

            	                adaptor.addChild(root_1, root_2);
            	                }
            	                adaptor.addChild(root_1, stream_c.nextTree());

            	                adaptor.addChild(root_0, root_1);
            	                }

            	            }

            	            retval.tree = root_0;
            	            }
            	            break;
            	        case 4 :
            	            // gram/i.g:141:20: '<=' c= condicao_igualdade
            	            {
            	            string_literal105=(Token)match(input,104,FOLLOW_104_in_condicao_comparacao1339);  
            	            stream_104.add(string_literal105);

            	            pushFollow(FOLLOW_condicao_igualdade_in_condicao_comparacao1344);
            	            c=condicao_igualdade();

            	            state._fsp--;

            	            stream_condicao_igualdade.add(c.getTree());


            	            // AST REWRITE
            	            // elements: condicao_comparacao, c
            	            // token labels: 
            	            // rule labels: retval, c
            	            // token list labels: 
            	            // rule list labels: 
            	            // wildcard labels: 
            	            retval.tree = root_0;
            	            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	            RewriteRuleSubtreeStream stream_c=new RewriteRuleSubtreeStream(adaptor,"rule c",c!=null?c.tree:null);

            	            root_0 = (Tree)adaptor.nil();
            	            // 141:47: -> ^( Comp $condicao_comparacao ^( MenorQ ) $c)
            	            {
            	                // gram/i.g:141:50: ^( Comp $condicao_comparacao ^( MenorQ ) $c)
            	                {
            	                Tree root_1 = (Tree)adaptor.nil();
            	                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comp, "Comp"), root_1);

            	                adaptor.addChild(root_1, stream_retval.nextTree());
            	                // gram/i.g:141:79: ^( MenorQ )
            	                {
            	                Tree root_2 = (Tree)adaptor.nil();
            	                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(MenorQ, "MenorQ"), root_2);

            	                adaptor.addChild(root_1, root_2);
            	                }
            	                adaptor.addChild(root_1, stream_c.nextTree());

            	                adaptor.addChild(root_0, root_1);
            	                }

            	            }

            	            retval.tree = root_0;
            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


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
        }
        return retval;
    }
    // $ANTLR end "condicao_comparacao"

    public static class condicao_igualdade_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "condicao_igualdade"
    // gram/i.g:146:1: condicao_igualdade : ( expressao -> expressao ) ( ( '!=' e= expressao -> ^( Comp $condicao_igualdade ^( Dif ) $e) | '==' e= expressao -> ^( Comp $condicao_igualdade ^( Igual ) $e) ) )* ;
    public final iParser.condicao_igualdade_return condicao_igualdade() throws RecognitionException {
        iParser.condicao_igualdade_return retval = new iParser.condicao_igualdade_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token string_literal107=null;
        Token string_literal108=null;
        iParser.expressao_return e = null;

        iParser.expressao_return expressao106 = null;


        Tree string_literal107_tree=null;
        Tree string_literal108_tree=null;
        RewriteRuleTokenStream stream_106=new RewriteRuleTokenStream(adaptor,"token 106");
        RewriteRuleTokenStream stream_105=new RewriteRuleTokenStream(adaptor,"token 105");
        RewriteRuleSubtreeStream stream_expressao=new RewriteRuleSubtreeStream(adaptor,"rule expressao");
        try {
            // gram/i.g:146:20: ( ( expressao -> expressao ) ( ( '!=' e= expressao -> ^( Comp $condicao_igualdade ^( Dif ) $e) | '==' e= expressao -> ^( Comp $condicao_igualdade ^( Igual ) $e) ) )* )
            // gram/i.g:147:2: ( expressao -> expressao ) ( ( '!=' e= expressao -> ^( Comp $condicao_igualdade ^( Dif ) $e) | '==' e= expressao -> ^( Comp $condicao_igualdade ^( Igual ) $e) ) )*
            {
            // gram/i.g:147:2: ( expressao -> expressao )
            // gram/i.g:147:3: expressao
            {
            pushFollow(FOLLOW_expressao_in_condicao_igualdade1410);
            expressao106=expressao();

            state._fsp--;

            stream_expressao.add(expressao106.getTree());


            // AST REWRITE
            // elements: expressao
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 147:13: -> expressao
            {
                adaptor.addChild(root_0, stream_expressao.nextTree());

            }

            retval.tree = root_0;
            }

            // gram/i.g:147:27: ( ( '!=' e= expressao -> ^( Comp $condicao_igualdade ^( Dif ) $e) | '==' e= expressao -> ^( Comp $condicao_igualdade ^( Igual ) $e) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=105 && LA22_0<=106)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // gram/i.g:147:30: ( '!=' e= expressao -> ^( Comp $condicao_igualdade ^( Dif ) $e) | '==' e= expressao -> ^( Comp $condicao_igualdade ^( Igual ) $e) )
            	    {
            	    // gram/i.g:147:30: ( '!=' e= expressao -> ^( Comp $condicao_igualdade ^( Dif ) $e) | '==' e= expressao -> ^( Comp $condicao_igualdade ^( Igual ) $e) )
            	    int alt21=2;
            	    int LA21_0 = input.LA(1);

            	    if ( (LA21_0==105) ) {
            	        alt21=1;
            	    }
            	    else if ( (LA21_0==106) ) {
            	        alt21=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 21, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt21) {
            	        case 1 :
            	            // gram/i.g:147:32: '!=' e= expressao
            	            {
            	            string_literal107=(Token)match(input,105,FOLLOW_105_in_condicao_igualdade1422);  
            	            stream_105.add(string_literal107);

            	            pushFollow(FOLLOW_expressao_in_condicao_igualdade1427);
            	            e=expressao();

            	            state._fsp--;

            	            stream_expressao.add(e.getTree());


            	            // AST REWRITE
            	            // elements: condicao_igualdade, e
            	            // token labels: 
            	            // rule labels: retval, e
            	            // token list labels: 
            	            // rule list labels: 
            	            // wildcard labels: 
            	            retval.tree = root_0;
            	            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	            RewriteRuleSubtreeStream stream_e=new RewriteRuleSubtreeStream(adaptor,"rule e",e!=null?e.tree:null);

            	            root_0 = (Tree)adaptor.nil();
            	            // 147:50: -> ^( Comp $condicao_igualdade ^( Dif ) $e)
            	            {
            	                // gram/i.g:147:53: ^( Comp $condicao_igualdade ^( Dif ) $e)
            	                {
            	                Tree root_1 = (Tree)adaptor.nil();
            	                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comp, "Comp"), root_1);

            	                adaptor.addChild(root_1, stream_retval.nextTree());
            	                // gram/i.g:147:81: ^( Dif )
            	                {
            	                Tree root_2 = (Tree)adaptor.nil();
            	                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Dif, "Dif"), root_2);

            	                adaptor.addChild(root_1, root_2);
            	                }
            	                adaptor.addChild(root_1, stream_e.nextTree());

            	                adaptor.addChild(root_0, root_1);
            	                }

            	            }

            	            retval.tree = root_0;
            	            }
            	            break;
            	        case 2 :
            	            // gram/i.g:148:16: '==' e= expressao
            	            {
            	            string_literal108=(Token)match(input,106,FOLLOW_106_in_condicao_igualdade1463);  
            	            stream_106.add(string_literal108);

            	            pushFollow(FOLLOW_expressao_in_condicao_igualdade1468);
            	            e=expressao();

            	            state._fsp--;

            	            stream_expressao.add(e.getTree());


            	            // AST REWRITE
            	            // elements: e, condicao_igualdade
            	            // token labels: 
            	            // rule labels: retval, e
            	            // token list labels: 
            	            // rule list labels: 
            	            // wildcard labels: 
            	            retval.tree = root_0;
            	            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	            RewriteRuleSubtreeStream stream_e=new RewriteRuleSubtreeStream(adaptor,"rule e",e!=null?e.tree:null);

            	            root_0 = (Tree)adaptor.nil();
            	            // 148:34: -> ^( Comp $condicao_igualdade ^( Igual ) $e)
            	            {
            	                // gram/i.g:148:37: ^( Comp $condicao_igualdade ^( Igual ) $e)
            	                {
            	                Tree root_1 = (Tree)adaptor.nil();
            	                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Comp, "Comp"), root_1);

            	                adaptor.addChild(root_1, stream_retval.nextTree());
            	                // gram/i.g:148:65: ^( Igual )
            	                {
            	                Tree root_2 = (Tree)adaptor.nil();
            	                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Igual, "Igual"), root_2);

            	                adaptor.addChild(root_1, root_2);
            	                }
            	                adaptor.addChild(root_1, stream_e.nextTree());

            	                adaptor.addChild(root_0, root_1);
            	                }

            	            }

            	            retval.tree = root_0;
            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


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
        }
        return retval;
    }
    // $ANTLR end "condicao_igualdade"

    public static class atribuicao_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "atribuicao"
    // gram/i.g:155:1: atribuicao : ID opAtribuicao condicao -> ^( Atribuicao ID opAtribuicao condicao ) ;
    public final iParser.atribuicao_return atribuicao() throws RecognitionException {
        iParser.atribuicao_return retval = new iParser.atribuicao_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token ID109=null;
        iParser.opAtribuicao_return opAtribuicao110 = null;

        iParser.condicao_return condicao111 = null;


        Tree ID109_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_condicao=new RewriteRuleSubtreeStream(adaptor,"rule condicao");
        RewriteRuleSubtreeStream stream_opAtribuicao=new RewriteRuleSubtreeStream(adaptor,"rule opAtribuicao");
        try {
            // gram/i.g:155:12: ( ID opAtribuicao condicao -> ^( Atribuicao ID opAtribuicao condicao ) )
            // gram/i.g:156:3: ID opAtribuicao condicao
            {
            ID109=(Token)match(input,ID,FOLLOW_ID_in_atribuicao1530);  
            stream_ID.add(ID109);

            pushFollow(FOLLOW_opAtribuicao_in_atribuicao1533);
            opAtribuicao110=opAtribuicao();

            state._fsp--;

            stream_opAtribuicao.add(opAtribuicao110.getTree());
            pushFollow(FOLLOW_condicao_in_atribuicao1536);
            condicao111=condicao();

            state._fsp--;

            stream_condicao.add(condicao111.getTree());


            // AST REWRITE
            // elements: condicao, opAtribuicao, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 156:31: -> ^( Atribuicao ID opAtribuicao condicao )
            {
                // gram/i.g:156:34: ^( Atribuicao ID opAtribuicao condicao )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Atribuicao, "Atribuicao"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                adaptor.addChild(root_1, stream_opAtribuicao.nextTree());
                adaptor.addChild(root_1, stream_condicao.nextTree());

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
        }
        return retval;
    }
    // $ANTLR end "atribuicao"

    public static class opAtribuicao_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "opAtribuicao"
    // gram/i.g:159:1: opAtribuicao : ( '=' -> ^( Atrib ) | '*=' -> ^( Mult ) | '/=' -> ^( Div ) | '+=' -> ^( Soma ) | '-=' -> ^( Sub ) ) ;
    public final iParser.opAtribuicao_return opAtribuicao() throws RecognitionException {
        iParser.opAtribuicao_return retval = new iParser.opAtribuicao_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token char_literal112=null;
        Token string_literal113=null;
        Token string_literal114=null;
        Token string_literal115=null;
        Token string_literal116=null;

        Tree char_literal112_tree=null;
        Tree string_literal113_tree=null;
        Tree string_literal114_tree=null;
        Tree string_literal115_tree=null;
        Tree string_literal116_tree=null;
        RewriteRuleTokenStream stream_109=new RewriteRuleTokenStream(adaptor,"token 109");
        RewriteRuleTokenStream stream_110=new RewriteRuleTokenStream(adaptor,"token 110");
        RewriteRuleTokenStream stream_108=new RewriteRuleTokenStream(adaptor,"token 108");
        RewriteRuleTokenStream stream_107=new RewriteRuleTokenStream(adaptor,"token 107");
        RewriteRuleTokenStream stream_84=new RewriteRuleTokenStream(adaptor,"token 84");

        try {
            // gram/i.g:159:14: ( ( '=' -> ^( Atrib ) | '*=' -> ^( Mult ) | '/=' -> ^( Div ) | '+=' -> ^( Soma ) | '-=' -> ^( Sub ) ) )
            // gram/i.g:160:2: ( '=' -> ^( Atrib ) | '*=' -> ^( Mult ) | '/=' -> ^( Div ) | '+=' -> ^( Soma ) | '-=' -> ^( Sub ) )
            {
            // gram/i.g:160:2: ( '=' -> ^( Atrib ) | '*=' -> ^( Mult ) | '/=' -> ^( Div ) | '+=' -> ^( Soma ) | '-=' -> ^( Sub ) )
            int alt23=5;
            switch ( input.LA(1) ) {
            case 84:
                {
                alt23=1;
                }
                break;
            case 107:
                {
                alt23=2;
                }
                break;
            case 108:
                {
                alt23=3;
                }
                break;
            case 109:
                {
                alt23=4;
                }
                break;
            case 110:
                {
                alt23=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // gram/i.g:160:4: '='
                    {
                    char_literal112=(Token)match(input,84,FOLLOW_84_in_opAtribuicao1568);  
                    stream_84.add(char_literal112);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 160:8: -> ^( Atrib )
                    {
                        // gram/i.g:160:11: ^( Atrib )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Atrib, "Atrib"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // gram/i.g:161:4: '*='
                    {
                    string_literal113=(Token)match(input,107,FOLLOW_107_in_opAtribuicao1579);  
                    stream_107.add(string_literal113);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 161:9: -> ^( Mult )
                    {
                        // gram/i.g:161:12: ^( Mult )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Mult, "Mult"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // gram/i.g:162:4: '/='
                    {
                    string_literal114=(Token)match(input,108,FOLLOW_108_in_opAtribuicao1590);  
                    stream_108.add(string_literal114);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 162:9: -> ^( Div )
                    {
                        // gram/i.g:162:12: ^( Div )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Div, "Div"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // gram/i.g:163:4: '+='
                    {
                    string_literal115=(Token)match(input,109,FOLLOW_109_in_opAtribuicao1601);  
                    stream_109.add(string_literal115);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 163:9: -> ^( Soma )
                    {
                        // gram/i.g:163:12: ^( Soma )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Soma, "Soma"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // gram/i.g:164:4: '-='
                    {
                    string_literal116=(Token)match(input,110,FOLLOW_110_in_opAtribuicao1612);  
                    stream_110.add(string_literal116);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 164:9: -> ^( Sub )
                    {
                        // gram/i.g:164:12: ^( Sub )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Sub, "Sub"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

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
        }
        return retval;
    }
    // $ANTLR end "opAtribuicao"

    public static class expressao_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expressao"
    // gram/i.g:170:1: expressao : ( expressaoNum -> expressaoNum ) ( ( '+' e= expressaoNum -> ^( ExpNum $expressao ^( Mais ) $e) | '-' e= expressaoNum -> ^( ExpNum $expressao ^( Menos ) $e) ) )* ;
    public final iParser.expressao_return expressao() throws RecognitionException {
        iParser.expressao_return retval = new iParser.expressao_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token char_literal118=null;
        Token char_literal119=null;
        iParser.expressaoNum_return e = null;

        iParser.expressaoNum_return expressaoNum117 = null;


        Tree char_literal118_tree=null;
        Tree char_literal119_tree=null;
        RewriteRuleTokenStream stream_112=new RewriteRuleTokenStream(adaptor,"token 112");
        RewriteRuleTokenStream stream_111=new RewriteRuleTokenStream(adaptor,"token 111");
        RewriteRuleSubtreeStream stream_expressaoNum=new RewriteRuleSubtreeStream(adaptor,"rule expressaoNum");
        try {
            // gram/i.g:170:11: ( ( expressaoNum -> expressaoNum ) ( ( '+' e= expressaoNum -> ^( ExpNum $expressao ^( Mais ) $e) | '-' e= expressaoNum -> ^( ExpNum $expressao ^( Menos ) $e) ) )* )
            // gram/i.g:171:2: ( expressaoNum -> expressaoNum ) ( ( '+' e= expressaoNum -> ^( ExpNum $expressao ^( Mais ) $e) | '-' e= expressaoNum -> ^( ExpNum $expressao ^( Menos ) $e) ) )*
            {
            // gram/i.g:171:2: ( expressaoNum -> expressaoNum )
            // gram/i.g:171:3: expressaoNum
            {
            pushFollow(FOLLOW_expressaoNum_in_expressao1638);
            expressaoNum117=expressaoNum();

            state._fsp--;

            stream_expressaoNum.add(expressaoNum117.getTree());


            // AST REWRITE
            // elements: expressaoNum
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 171:16: -> expressaoNum
            {
                adaptor.addChild(root_0, stream_expressaoNum.nextTree());

            }

            retval.tree = root_0;
            }

            // gram/i.g:171:33: ( ( '+' e= expressaoNum -> ^( ExpNum $expressao ^( Mais ) $e) | '-' e= expressaoNum -> ^( ExpNum $expressao ^( Menos ) $e) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=111 && LA25_0<=112)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // gram/i.g:171:36: ( '+' e= expressaoNum -> ^( ExpNum $expressao ^( Mais ) $e) | '-' e= expressaoNum -> ^( ExpNum $expressao ^( Menos ) $e) )
            	    {
            	    // gram/i.g:171:36: ( '+' e= expressaoNum -> ^( ExpNum $expressao ^( Mais ) $e) | '-' e= expressaoNum -> ^( ExpNum $expressao ^( Menos ) $e) )
            	    int alt24=2;
            	    int LA24_0 = input.LA(1);

            	    if ( (LA24_0==111) ) {
            	        alt24=1;
            	    }
            	    else if ( (LA24_0==112) ) {
            	        alt24=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 24, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt24) {
            	        case 1 :
            	            // gram/i.g:171:38: '+' e= expressaoNum
            	            {
            	            char_literal118=(Token)match(input,111,FOLLOW_111_in_expressao1650);  
            	            stream_111.add(char_literal118);

            	            pushFollow(FOLLOW_expressaoNum_in_expressao1655);
            	            e=expressaoNum();

            	            state._fsp--;

            	            stream_expressaoNum.add(e.getTree());


            	            // AST REWRITE
            	            // elements: expressao, e
            	            // token labels: 
            	            // rule labels: retval, e
            	            // token list labels: 
            	            // rule list labels: 
            	            // wildcard labels: 
            	            retval.tree = root_0;
            	            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	            RewriteRuleSubtreeStream stream_e=new RewriteRuleSubtreeStream(adaptor,"rule e",e!=null?e.tree:null);

            	            root_0 = (Tree)adaptor.nil();
            	            // 171:58: -> ^( ExpNum $expressao ^( Mais ) $e)
            	            {
            	                // gram/i.g:171:61: ^( ExpNum $expressao ^( Mais ) $e)
            	                {
            	                Tree root_1 = (Tree)adaptor.nil();
            	                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(ExpNum, "ExpNum"), root_1);

            	                adaptor.addChild(root_1, stream_retval.nextTree());
            	                // gram/i.g:171:82: ^( Mais )
            	                {
            	                Tree root_2 = (Tree)adaptor.nil();
            	                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Mais, "Mais"), root_2);

            	                adaptor.addChild(root_1, root_2);
            	                }
            	                adaptor.addChild(root_1, stream_e.nextTree());

            	                adaptor.addChild(root_0, root_1);
            	                }

            	            }

            	            retval.tree = root_0;
            	            }
            	            break;
            	        case 2 :
            	            // gram/i.g:172:17: '-' e= expressaoNum
            	            {
            	            char_literal119=(Token)match(input,112,FOLLOW_112_in_expressao1692);  
            	            stream_112.add(char_literal119);

            	            pushFollow(FOLLOW_expressaoNum_in_expressao1697);
            	            e=expressaoNum();

            	            state._fsp--;

            	            stream_expressaoNum.add(e.getTree());


            	            // AST REWRITE
            	            // elements: e, expressao
            	            // token labels: 
            	            // rule labels: retval, e
            	            // token list labels: 
            	            // rule list labels: 
            	            // wildcard labels: 
            	            retval.tree = root_0;
            	            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	            RewriteRuleSubtreeStream stream_e=new RewriteRuleSubtreeStream(adaptor,"rule e",e!=null?e.tree:null);

            	            root_0 = (Tree)adaptor.nil();
            	            // 172:37: -> ^( ExpNum $expressao ^( Menos ) $e)
            	            {
            	                // gram/i.g:172:40: ^( ExpNum $expressao ^( Menos ) $e)
            	                {
            	                Tree root_1 = (Tree)adaptor.nil();
            	                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(ExpNum, "ExpNum"), root_1);

            	                adaptor.addChild(root_1, stream_retval.nextTree());
            	                // gram/i.g:172:61: ^( Menos )
            	                {
            	                Tree root_2 = (Tree)adaptor.nil();
            	                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Menos, "Menos"), root_2);

            	                adaptor.addChild(root_1, root_2);
            	                }
            	                adaptor.addChild(root_1, stream_e.nextTree());

            	                adaptor.addChild(root_0, root_1);
            	                }

            	            }

            	            retval.tree = root_0;
            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


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
        }
        return retval;
    }
    // $ANTLR end "expressao"

    public static class expressaoNum_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expressaoNum"
    // gram/i.g:177:1: expressaoNum : ( oper -> oper ) ( ( '*' o= oper -> ^( ExpNum $expressaoNum ^( Vezes ) $o) | '/' o= oper -> ^( ExpNum $expressaoNum ^( Divide ) $o) | '%' o= oper -> ^( ExpNum $expressaoNum ^( Mod ) $o) ) )* ;
    public final iParser.expressaoNum_return expressaoNum() throws RecognitionException {
        iParser.expressaoNum_return retval = new iParser.expressaoNum_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token char_literal121=null;
        Token char_literal122=null;
        Token char_literal123=null;
        iParser.oper_return o = null;

        iParser.oper_return oper120 = null;


        Tree char_literal121_tree=null;
        Tree char_literal122_tree=null;
        Tree char_literal123_tree=null;
        RewriteRuleTokenStream stream_114=new RewriteRuleTokenStream(adaptor,"token 114");
        RewriteRuleTokenStream stream_115=new RewriteRuleTokenStream(adaptor,"token 115");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleSubtreeStream stream_oper=new RewriteRuleSubtreeStream(adaptor,"rule oper");
        try {
            // gram/i.g:177:14: ( ( oper -> oper ) ( ( '*' o= oper -> ^( ExpNum $expressaoNum ^( Vezes ) $o) | '/' o= oper -> ^( ExpNum $expressaoNum ^( Divide ) $o) | '%' o= oper -> ^( ExpNum $expressaoNum ^( Mod ) $o) ) )* )
            // gram/i.g:178:2: ( oper -> oper ) ( ( '*' o= oper -> ^( ExpNum $expressaoNum ^( Vezes ) $o) | '/' o= oper -> ^( ExpNum $expressaoNum ^( Divide ) $o) | '%' o= oper -> ^( ExpNum $expressaoNum ^( Mod ) $o) ) )*
            {
            // gram/i.g:178:2: ( oper -> oper )
            // gram/i.g:178:3: oper
            {
            pushFollow(FOLLOW_oper_in_expressaoNum1756);
            oper120=oper();

            state._fsp--;

            stream_oper.add(oper120.getTree());


            // AST REWRITE
            // elements: oper
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 178:8: -> oper
            {
                adaptor.addChild(root_0, stream_oper.nextTree());

            }

            retval.tree = root_0;
            }

            // gram/i.g:178:17: ( ( '*' o= oper -> ^( ExpNum $expressaoNum ^( Vezes ) $o) | '/' o= oper -> ^( ExpNum $expressaoNum ^( Divide ) $o) | '%' o= oper -> ^( ExpNum $expressaoNum ^( Mod ) $o) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=113 && LA27_0<=115)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // gram/i.g:178:20: ( '*' o= oper -> ^( ExpNum $expressaoNum ^( Vezes ) $o) | '/' o= oper -> ^( ExpNum $expressaoNum ^( Divide ) $o) | '%' o= oper -> ^( ExpNum $expressaoNum ^( Mod ) $o) )
            	    {
            	    // gram/i.g:178:20: ( '*' o= oper -> ^( ExpNum $expressaoNum ^( Vezes ) $o) | '/' o= oper -> ^( ExpNum $expressaoNum ^( Divide ) $o) | '%' o= oper -> ^( ExpNum $expressaoNum ^( Mod ) $o) )
            	    int alt26=3;
            	    switch ( input.LA(1) ) {
            	    case 113:
            	        {
            	        alt26=1;
            	        }
            	        break;
            	    case 114:
            	        {
            	        alt26=2;
            	        }
            	        break;
            	    case 115:
            	        {
            	        alt26=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 26, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt26) {
            	        case 1 :
            	            // gram/i.g:178:22: '*' o= oper
            	            {
            	            char_literal121=(Token)match(input,113,FOLLOW_113_in_expressaoNum1768);  
            	            stream_113.add(char_literal121);

            	            pushFollow(FOLLOW_oper_in_expressaoNum1773);
            	            o=oper();

            	            state._fsp--;

            	            stream_oper.add(o.getTree());


            	            // AST REWRITE
            	            // elements: expressaoNum, o
            	            // token labels: 
            	            // rule labels: retval, o
            	            // token list labels: 
            	            // rule list labels: 
            	            // wildcard labels: 
            	            retval.tree = root_0;
            	            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	            RewriteRuleSubtreeStream stream_o=new RewriteRuleSubtreeStream(adaptor,"rule o",o!=null?o.tree:null);

            	            root_0 = (Tree)adaptor.nil();
            	            // 178:34: -> ^( ExpNum $expressaoNum ^( Vezes ) $o)
            	            {
            	                // gram/i.g:178:37: ^( ExpNum $expressaoNum ^( Vezes ) $o)
            	                {
            	                Tree root_1 = (Tree)adaptor.nil();
            	                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(ExpNum, "ExpNum"), root_1);

            	                adaptor.addChild(root_1, stream_retval.nextTree());
            	                // gram/i.g:178:61: ^( Vezes )
            	                {
            	                Tree root_2 = (Tree)adaptor.nil();
            	                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Vezes, "Vezes"), root_2);

            	                adaptor.addChild(root_1, root_2);
            	                }
            	                adaptor.addChild(root_1, stream_o.nextTree());

            	                adaptor.addChild(root_0, root_1);
            	                }

            	            }

            	            retval.tree = root_0;
            	            }
            	            break;
            	        case 2 :
            	            // gram/i.g:179:12: '/' o= oper
            	            {
            	            char_literal122=(Token)match(input,114,FOLLOW_114_in_expressaoNum1805);  
            	            stream_114.add(char_literal122);

            	            pushFollow(FOLLOW_oper_in_expressaoNum1810);
            	            o=oper();

            	            state._fsp--;

            	            stream_oper.add(o.getTree());


            	            // AST REWRITE
            	            // elements: o, expressaoNum
            	            // token labels: 
            	            // rule labels: retval, o
            	            // token list labels: 
            	            // rule list labels: 
            	            // wildcard labels: 
            	            retval.tree = root_0;
            	            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	            RewriteRuleSubtreeStream stream_o=new RewriteRuleSubtreeStream(adaptor,"rule o",o!=null?o.tree:null);

            	            root_0 = (Tree)adaptor.nil();
            	            // 179:24: -> ^( ExpNum $expressaoNum ^( Divide ) $o)
            	            {
            	                // gram/i.g:179:27: ^( ExpNum $expressaoNum ^( Divide ) $o)
            	                {
            	                Tree root_1 = (Tree)adaptor.nil();
            	                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(ExpNum, "ExpNum"), root_1);

            	                adaptor.addChild(root_1, stream_retval.nextTree());
            	                // gram/i.g:179:51: ^( Divide )
            	                {
            	                Tree root_2 = (Tree)adaptor.nil();
            	                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Divide, "Divide"), root_2);

            	                adaptor.addChild(root_1, root_2);
            	                }
            	                adaptor.addChild(root_1, stream_o.nextTree());

            	                adaptor.addChild(root_0, root_1);
            	                }

            	            }

            	            retval.tree = root_0;
            	            }
            	            break;
            	        case 3 :
            	            // gram/i.g:180:12: '%' o= oper
            	            {
            	            char_literal123=(Token)match(input,115,FOLLOW_115_in_expressaoNum1842);  
            	            stream_115.add(char_literal123);

            	            pushFollow(FOLLOW_oper_in_expressaoNum1847);
            	            o=oper();

            	            state._fsp--;

            	            stream_oper.add(o.getTree());


            	            // AST REWRITE
            	            // elements: expressaoNum, o
            	            // token labels: 
            	            // rule labels: retval, o
            	            // token list labels: 
            	            // rule list labels: 
            	            // wildcard labels: 
            	            retval.tree = root_0;
            	            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	            RewriteRuleSubtreeStream stream_o=new RewriteRuleSubtreeStream(adaptor,"rule o",o!=null?o.tree:null);

            	            root_0 = (Tree)adaptor.nil();
            	            // 180:24: -> ^( ExpNum $expressaoNum ^( Mod ) $o)
            	            {
            	                // gram/i.g:180:27: ^( ExpNum $expressaoNum ^( Mod ) $o)
            	                {
            	                Tree root_1 = (Tree)adaptor.nil();
            	                root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(ExpNum, "ExpNum"), root_1);

            	                adaptor.addChild(root_1, stream_retval.nextTree());
            	                // gram/i.g:180:51: ^( Mod )
            	                {
            	                Tree root_2 = (Tree)adaptor.nil();
            	                root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Mod, "Mod"), root_2);

            	                adaptor.addChild(root_1, root_2);
            	                }
            	                adaptor.addChild(root_1, stream_o.nextTree());

            	                adaptor.addChild(root_0, root_1);
            	                }

            	            }

            	            retval.tree = root_0;
            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


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
        }
        return retval;
    }
    // $ANTLR end "expressaoNum"

    public static class oper_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "oper"
    // gram/i.g:185:1: oper : ( opUnario ID -> ^( opUnario ^( Id ID ) ) | opUnario tipo -> ^( opUnario tipo ) | tipo -> tipo | ID -> ^( Id ID ) | incOp ID -> ^( IncAntes incOp ID ) | ID incOp -> ^( IncDepois incOp ID ) | call -> call | input_ -> input_ ) ;
    public final iParser.oper_return oper() throws RecognitionException {
        iParser.oper_return retval = new iParser.oper_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token ID125=null;
        Token ID129=null;
        Token ID131=null;
        Token ID132=null;
        iParser.opUnario_return opUnario124 = null;

        iParser.opUnario_return opUnario126 = null;

        iParser.tipo_return tipo127 = null;

        iParser.tipo_return tipo128 = null;

        iParser.incOp_return incOp130 = null;

        iParser.incOp_return incOp133 = null;

        iParser.call_return call134 = null;

        iParser.input__return input_135 = null;


        Tree ID125_tree=null;
        Tree ID129_tree=null;
        Tree ID131_tree=null;
        Tree ID132_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_opUnario=new RewriteRuleSubtreeStream(adaptor,"rule opUnario");
        RewriteRuleSubtreeStream stream_call=new RewriteRuleSubtreeStream(adaptor,"rule call");
        RewriteRuleSubtreeStream stream_incOp=new RewriteRuleSubtreeStream(adaptor,"rule incOp");
        RewriteRuleSubtreeStream stream_tipo=new RewriteRuleSubtreeStream(adaptor,"rule tipo");
        RewriteRuleSubtreeStream stream_input_=new RewriteRuleSubtreeStream(adaptor,"rule input_");
        try {
            // gram/i.g:185:6: ( ( opUnario ID -> ^( opUnario ^( Id ID ) ) | opUnario tipo -> ^( opUnario tipo ) | tipo -> tipo | ID -> ^( Id ID ) | incOp ID -> ^( IncAntes incOp ID ) | ID incOp -> ^( IncDepois incOp ID ) | call -> call | input_ -> input_ ) )
            // gram/i.g:186:2: ( opUnario ID -> ^( opUnario ^( Id ID ) ) | opUnario tipo -> ^( opUnario tipo ) | tipo -> tipo | ID -> ^( Id ID ) | incOp ID -> ^( IncAntes incOp ID ) | ID incOp -> ^( IncDepois incOp ID ) | call -> call | input_ -> input_ )
            {
            // gram/i.g:186:2: ( opUnario ID -> ^( opUnario ^( Id ID ) ) | opUnario tipo -> ^( opUnario tipo ) | tipo -> tipo | ID -> ^( Id ID ) | incOp ID -> ^( IncAntes incOp ID ) | ID incOp -> ^( IncDepois incOp ID ) | call -> call | input_ -> input_ )
            int alt28=8;
            alt28 = dfa28.predict(input);
            switch (alt28) {
                case 1 :
                    // gram/i.g:186:4: opUnario ID
                    {
                    pushFollow(FOLLOW_opUnario_in_oper1900);
                    opUnario124=opUnario();

                    state._fsp--;

                    stream_opUnario.add(opUnario124.getTree());
                    ID125=(Token)match(input,ID,FOLLOW_ID_in_oper1902);  
                    stream_ID.add(ID125);



                    // AST REWRITE
                    // elements: ID, opUnario
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 186:16: -> ^( opUnario ^( Id ID ) )
                    {
                        // gram/i.g:186:19: ^( opUnario ^( Id ID ) )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot(stream_opUnario.nextNode(), root_1);

                        // gram/i.g:186:30: ^( Id ID )
                        {
                        Tree root_2 = (Tree)adaptor.nil();
                        root_2 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Id, "Id"), root_2);

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
                    // gram/i.g:187:4: opUnario tipo
                    {
                    pushFollow(FOLLOW_opUnario_in_oper1919);
                    opUnario126=opUnario();

                    state._fsp--;

                    stream_opUnario.add(opUnario126.getTree());
                    pushFollow(FOLLOW_tipo_in_oper1921);
                    tipo127=tipo();

                    state._fsp--;

                    stream_tipo.add(tipo127.getTree());


                    // AST REWRITE
                    // elements: tipo, opUnario
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 187:18: -> ^( opUnario tipo )
                    {
                        // gram/i.g:187:21: ^( opUnario tipo )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot(stream_opUnario.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_tipo.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // gram/i.g:188:4: tipo
                    {
                    pushFollow(FOLLOW_tipo_in_oper1934);
                    tipo128=tipo();

                    state._fsp--;

                    stream_tipo.add(tipo128.getTree());


                    // AST REWRITE
                    // elements: tipo
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 188:9: -> tipo
                    {
                        adaptor.addChild(root_0, stream_tipo.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // gram/i.g:189:4: ID
                    {
                    ID129=(Token)match(input,ID,FOLLOW_ID_in_oper1944);  
                    stream_ID.add(ID129);



                    // AST REWRITE
                    // elements: ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 189:7: -> ^( Id ID )
                    {
                        // gram/i.g:189:10: ^( Id ID )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Id, "Id"), root_1);

                        adaptor.addChild(root_1, stream_ID.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // gram/i.g:190:4: incOp ID
                    {
                    pushFollow(FOLLOW_incOp_in_oper1957);
                    incOp130=incOp();

                    state._fsp--;

                    stream_incOp.add(incOp130.getTree());
                    ID131=(Token)match(input,ID,FOLLOW_ID_in_oper1959);  
                    stream_ID.add(ID131);



                    // AST REWRITE
                    // elements: ID, incOp
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 190:13: -> ^( IncAntes incOp ID )
                    {
                        // gram/i.g:190:16: ^( IncAntes incOp ID )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(IncAntes, "IncAntes"), root_1);

                        adaptor.addChild(root_1, stream_incOp.nextTree());
                        adaptor.addChild(root_1, stream_ID.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 6 :
                    // gram/i.g:191:4: ID incOp
                    {
                    ID132=(Token)match(input,ID,FOLLOW_ID_in_oper1974);  
                    stream_ID.add(ID132);

                    pushFollow(FOLLOW_incOp_in_oper1976);
                    incOp133=incOp();

                    state._fsp--;

                    stream_incOp.add(incOp133.getTree());


                    // AST REWRITE
                    // elements: ID, incOp
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 191:13: -> ^( IncDepois incOp ID )
                    {
                        // gram/i.g:191:16: ^( IncDepois incOp ID )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(IncDepois, "IncDepois"), root_1);

                        adaptor.addChild(root_1, stream_incOp.nextTree());
                        adaptor.addChild(root_1, stream_ID.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 7 :
                    // gram/i.g:192:4: call
                    {
                    pushFollow(FOLLOW_call_in_oper1991);
                    call134=call();

                    state._fsp--;

                    stream_call.add(call134.getTree());


                    // AST REWRITE
                    // elements: call
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 192:9: -> call
                    {
                        adaptor.addChild(root_0, stream_call.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 8 :
                    // gram/i.g:193:4: input_
                    {
                    pushFollow(FOLLOW_input__in_oper2000);
                    input_135=input_();

                    state._fsp--;

                    stream_input_.add(input_135.getTree());


                    // AST REWRITE
                    // elements: input_
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 193:11: -> input_
                    {
                        adaptor.addChild(root_0, stream_input_.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;

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
        }
        return retval;
    }
    // $ANTLR end "oper"

    public static class incOp_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "incOp"
    // gram/i.g:197:1: incOp : ( '++' -> ^( Inc ) | '--' -> ^( Dec ) ) ;
    public final iParser.incOp_return incOp() throws RecognitionException {
        iParser.incOp_return retval = new iParser.incOp_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token string_literal136=null;
        Token string_literal137=null;

        Tree string_literal136_tree=null;
        Tree string_literal137_tree=null;
        RewriteRuleTokenStream stream_116=new RewriteRuleTokenStream(adaptor,"token 116");
        RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");

        try {
            // gram/i.g:197:7: ( ( '++' -> ^( Inc ) | '--' -> ^( Dec ) ) )
            // gram/i.g:198:2: ( '++' -> ^( Inc ) | '--' -> ^( Dec ) )
            {
            // gram/i.g:198:2: ( '++' -> ^( Inc ) | '--' -> ^( Dec ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==116) ) {
                alt29=1;
            }
            else if ( (LA29_0==117) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // gram/i.g:198:4: '++'
                    {
                    string_literal136=(Token)match(input,116,FOLLOW_116_in_incOp2022);  
                    stream_116.add(string_literal136);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 198:9: -> ^( Inc )
                    {
                        // gram/i.g:198:12: ^( Inc )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Inc, "Inc"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // gram/i.g:198:21: '--'
                    {
                    string_literal137=(Token)match(input,117,FOLLOW_117_in_incOp2032);  
                    stream_117.add(string_literal137);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 198:26: -> ^( Dec )
                    {
                        // gram/i.g:198:29: ^( Dec )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Dec, "Dec"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

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
        }
        return retval;
    }
    // $ANTLR end "incOp"

    public static class opUnario_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "opUnario"
    // gram/i.g:201:1: opUnario : ( '+' -> ^( Pos ) | '-' -> ^( Neg ) | '!' -> ^( Nao ) ) ;
    public final iParser.opUnario_return opUnario() throws RecognitionException {
        iParser.opUnario_return retval = new iParser.opUnario_return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token char_literal138=null;
        Token char_literal139=null;
        Token char_literal140=null;

        Tree char_literal138_tree=null;
        Tree char_literal139_tree=null;
        Tree char_literal140_tree=null;
        RewriteRuleTokenStream stream_112=new RewriteRuleTokenStream(adaptor,"token 112");
        RewriteRuleTokenStream stream_111=new RewriteRuleTokenStream(adaptor,"token 111");
        RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");

        try {
            // gram/i.g:201:10: ( ( '+' -> ^( Pos ) | '-' -> ^( Neg ) | '!' -> ^( Nao ) ) )
            // gram/i.g:202:2: ( '+' -> ^( Pos ) | '-' -> ^( Neg ) | '!' -> ^( Nao ) )
            {
            // gram/i.g:202:2: ( '+' -> ^( Pos ) | '-' -> ^( Neg ) | '!' -> ^( Nao ) )
            int alt30=3;
            switch ( input.LA(1) ) {
            case 111:
                {
                alt30=1;
                }
                break;
            case 112:
                {
                alt30=2;
                }
                break;
            case 118:
                {
                alt30=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // gram/i.g:202:4: '+'
                    {
                    char_literal138=(Token)match(input,111,FOLLOW_111_in_opUnario2053);  
                    stream_111.add(char_literal138);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 202:8: -> ^( Pos )
                    {
                        // gram/i.g:202:11: ^( Pos )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Pos, "Pos"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // gram/i.g:203:4: '-'
                    {
                    char_literal139=(Token)match(input,112,FOLLOW_112_in_opUnario2064);  
                    stream_112.add(char_literal139);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 203:8: -> ^( Neg )
                    {
                        // gram/i.g:203:11: ^( Neg )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Neg, "Neg"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // gram/i.g:204:4: '!'
                    {
                    char_literal140=(Token)match(input,118,FOLLOW_118_in_opUnario2075);  
                    stream_118.add(char_literal140);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 204:8: -> ^( Nao )
                    {
                        // gram/i.g:204:11: ^( Nao )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(Nao, "Nao"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

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
        }
        return retval;
    }
    // $ANTLR end "opUnario"

    public static class boolean__return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "boolean_"
    // gram/i.g:208:1: boolean_ : ( 'true' -> ^( True ) | 'false' -> ^( False ) ) ;
    public final iParser.boolean__return boolean_() throws RecognitionException {
        iParser.boolean__return retval = new iParser.boolean__return();
        retval.start = input.LT(1);

        Tree root_0 = null;

        Token string_literal141=null;
        Token string_literal142=null;

        Tree string_literal141_tree=null;
        Tree string_literal142_tree=null;
        RewriteRuleTokenStream stream_120=new RewriteRuleTokenStream(adaptor,"token 120");
        RewriteRuleTokenStream stream_119=new RewriteRuleTokenStream(adaptor,"token 119");

        try {
            // gram/i.g:208:10: ( ( 'true' -> ^( True ) | 'false' -> ^( False ) ) )
            // gram/i.g:208:12: ( 'true' -> ^( True ) | 'false' -> ^( False ) )
            {
            // gram/i.g:208:12: ( 'true' -> ^( True ) | 'false' -> ^( False ) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==119) ) {
                alt31=1;
            }
            else if ( (LA31_0==120) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // gram/i.g:208:13: 'true'
                    {
                    string_literal141=(Token)match(input,119,FOLLOW_119_in_boolean_2096);  
                    stream_119.add(string_literal141);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 208:20: -> ^( True )
                    {
                        // gram/i.g:208:23: ^( True )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(True, "True"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // gram/i.g:208:33: 'false'
                    {
                    string_literal142=(Token)match(input,120,FOLLOW_120_in_boolean_2106);  
                    stream_120.add(string_literal142);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 208:41: -> ^( False )
                    {
                        // gram/i.g:208:44: ^( False )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot((Tree)adaptor.create(False, "False"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

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
        }
        return retval;
    }
    // $ANTLR end "boolean_"

    // Delegated rules


    protected DFA28 dfa28 = new DFA28(this);
    static final String DFA28_eotS =
        "\15\uffff";
    static final String DFA28_eofS =
        "\15\uffff";
    static final String DFA28_minS =
        "\4\106\1\uffff\1\123\7\uffff";
    static final String DFA28_maxS =
        "\4\170\1\uffff\1\165\7\uffff";
    static final String DFA28_acceptS =
        "\4\uffff\1\3\1\uffff\1\5\1\10\1\2\1\1\1\7\1\4\1\6";
    static final String DFA28_specialS =
        "\15\uffff}>";
    static final String[] DFA28_transitionS = {
            "\3\4\1\5\24\uffff\1\7\20\uffff\1\1\1\2\3\uffff\2\6\1\3\2\4",
            "\3\10\1\11\55\uffff\2\10",
            "\3\10\1\11\55\uffff\2\10",
            "\3\10\1\11\55\uffff\2\10",
            "",
            "\1\13\1\uffff\1\12\2\13\11\uffff\12\13\4\uffff\5\13\2\14",
            "",
            "",
            "",
            "",
            "",
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

    class DFA28 extends DFA {

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
        public String getDescription() {
            return "186:2: ( opUnario ID -> ^( opUnario ^( Id ID ) ) | opUnario tipo -> ^( opUnario tipo ) | tipo -> tipo | ID -> ^( Id ID ) | incOp ID -> ^( IncAntes incOp ID ) | ID incOp -> ^( IncDepois incOp ID ) | call -> call | input_ -> input_ )";
        }
    }
 

    public static final BitSet FOLLOW_78_in_idTipo56 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_idTipo66 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_idTipo76 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_idTipo86 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_idTipo96 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_tipo117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_tipo129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_tipo141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolean__in_tipo153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_programa_in_prog174 = new BitSet(new long[]{0x0000000000000000L,0x000000000007C000L});
    public static final BitSet FOLLOW_EOF_in_prog177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaracao_in_programa201 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_programa203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcao_in_programa212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_idTipo_in_declaracao230 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_dec_nodo_in_declaracao232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_dec_nodo260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_dec_nodo276 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_dec_nodo278 = new BitSet(new long[]{0x0000000000000000L,0x01F18000400003C0L});
    public static final BitSet FOLLOW_condicao_in_dec_nodo280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_idTipo_in_funcao309 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_ID_in_funcao312 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_funcao315 = new BitSet(new long[]{0x0000000000000000L,0x000000000047C000L});
    public static final BitSet FOLLOW_argumentos_in_funcao318 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_funcao322 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_blocoCodigo_in_funcao325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_argumento_in_argumentos364 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_87_in_argumentos368 = new BitSet(new long[]{0x0000000000000000L,0x000000000007C000L});
    public static final BitSet FOLLOW_argumento_in_argumentos370 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_idTipo_in_argumento391 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_ID_in_argumento394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if__in_instrucao424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for__in_instrucao432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while__in_instrucao440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_return__in_instrucao448 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_instrucao450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_in_instrucao458 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_instrucao460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_print__in_instrucao472 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_instrucao474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_if_492 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_if_495 = new BitSet(new long[]{0x0000000000000000L,0x01F18000400003C0L});
    public static final BitSet FOLLOW_condicao_in_if_498 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_if_501 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_blocoCodigo_in_if_504 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_else__in_if_508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_else_604 = new BitSet(new long[]{0x0000000000000000L,0x0000000081000000L});
    public static final BitSet FOLLOW_blocoCodigo_in_else_608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if__in_else_616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_for_635 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_for_638 = new BitSet(new long[]{0x0000000000000000L,0x000000000007C200L});
    public static final BitSet FOLLOW_for_declaracao_in_for_640 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_for_642 = new BitSet(new long[]{0x0000000000000000L,0x01F18000400003C0L});
    public static final BitSet FOLLOW_condicao_in_for_645 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_for_648 = new BitSet(new long[]{0x0000000000000000L,0x01F18000400003C0L});
    public static final BitSet FOLLOW_expressao_in_for_651 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_for_654 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_blocoCodigo_in_for_657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaracao_in_for_declaracao694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atribuicao_in_for_declaracao703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_while_725 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_while_728 = new BitSet(new long[]{0x0000000000000000L,0x01F18000400003C0L});
    public static final BitSet FOLLOW_condicao_in_while_731 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_while_734 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_blocoCodigo_in_while_737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_return_769 = new BitSet(new long[]{0x0000000000000000L,0x01F18000400003C0L});
    public static final BitSet FOLLOW_expressao_in_return_772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_call799 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_call803 = new BitSet(new long[]{0x0000000000000000L,0x01F18000404003C0L});
    public static final BitSet FOLLOW_parametros_in_call806 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_call810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_print_843 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_print_846 = new BitSet(new long[]{0x0000000000000000L,0x01F18000400003C0L});
    public static final BitSet FOLLOW_expressao_in_print_849 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_print_852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_input_883 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_input_886 = new BitSet(new long[]{0x0000000000000000L,0x000000000007C000L});
    public static final BitSet FOLLOW_idTipo_in_input_889 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_input_892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parametro_in_parametros918 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_87_in_parametros922 = new BitSet(new long[]{0x0000000000000000L,0x01F18000400003C0L});
    public static final BitSet FOLLOW_parametro_in_parametros924 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_expressao_in_parametro944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_blocoCodigo967 = new BitSet(new long[]{0x0000000000000000L,0x00000001BD07C200L});
    public static final BitSet FOLLOW_codigo_in_blocoCodigo969 = new BitSet(new long[]{0x0000000000000000L,0x00000001BD07C200L});
    public static final BitSet FOLLOW_96_in_blocoCodigo972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atribuicao_in_codigo994 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_codigo996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaracao_in_codigo1005 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_codigo1007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instrucao_in_codigo1016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condicao_ou_in_condicao1039 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000000L});
    public static final BitSet FOLLOW_97_in_condicao1044 = new BitSet(new long[]{0x0000000000000000L,0x01F18000400003C0L});
    public static final BitSet FOLLOW_expressao_in_condicao1047 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_98_in_condicao1050 = new BitSet(new long[]{0x0000000000000000L,0x01F18000400003C0L});
    public static final BitSet FOLLOW_condicao_in_condicao1053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condicao_e_in_condicao_ou1099 = new BitSet(new long[]{0x0000000000000002L,0x0000000800000000L});
    public static final BitSet FOLLOW_99_in_condicao_ou1109 = new BitSet(new long[]{0x0000000000000000L,0x01F18000400003C0L});
    public static final BitSet FOLLOW_condicao_e_in_condicao_ou1114 = new BitSet(new long[]{0x0000000000000002L,0x0000000800000000L});
    public static final BitSet FOLLOW_condicao_comparacao_in_condicao_e1145 = new BitSet(new long[]{0x0000000000000002L,0x0000001000000000L});
    public static final BitSet FOLLOW_100_in_condicao_e1155 = new BitSet(new long[]{0x0000000000000000L,0x01F18000400003C0L});
    public static final BitSet FOLLOW_condicao_comparacao_in_condicao_e1160 = new BitSet(new long[]{0x0000000000000002L,0x0000001000000000L});
    public static final BitSet FOLLOW_condicao_igualdade_in_condicao_comparacao1191 = new BitSet(new long[]{0x0000000000000002L,0x000001E000000000L});
    public static final BitSet FOLLOW_101_in_condicao_comparacao1204 = new BitSet(new long[]{0x0000000000000000L,0x01F18000400003C0L});
    public static final BitSet FOLLOW_condicao_igualdade_in_condicao_comparacao1209 = new BitSet(new long[]{0x0000000000000002L,0x000001E000000000L});
    public static final BitSet FOLLOW_102_in_condicao_comparacao1249 = new BitSet(new long[]{0x0000000000000000L,0x01F18000400003C0L});
    public static final BitSet FOLLOW_condicao_igualdade_in_condicao_comparacao1254 = new BitSet(new long[]{0x0000000000000002L,0x000001E000000000L});
    public static final BitSet FOLLOW_103_in_condicao_comparacao1294 = new BitSet(new long[]{0x0000000000000000L,0x01F18000400003C0L});
    public static final BitSet FOLLOW_condicao_igualdade_in_condicao_comparacao1299 = new BitSet(new long[]{0x0000000000000002L,0x000001E000000000L});
    public static final BitSet FOLLOW_104_in_condicao_comparacao1339 = new BitSet(new long[]{0x0000000000000000L,0x01F18000400003C0L});
    public static final BitSet FOLLOW_condicao_igualdade_in_condicao_comparacao1344 = new BitSet(new long[]{0x0000000000000002L,0x000001E000000000L});
    public static final BitSet FOLLOW_expressao_in_condicao_igualdade1410 = new BitSet(new long[]{0x0000000000000002L,0x0000060000000000L});
    public static final BitSet FOLLOW_105_in_condicao_igualdade1422 = new BitSet(new long[]{0x0000000000000000L,0x01F18000400003C0L});
    public static final BitSet FOLLOW_expressao_in_condicao_igualdade1427 = new BitSet(new long[]{0x0000000000000002L,0x0000060000000000L});
    public static final BitSet FOLLOW_106_in_condicao_igualdade1463 = new BitSet(new long[]{0x0000000000000000L,0x01F18000400003C0L});
    public static final BitSet FOLLOW_expressao_in_condicao_igualdade1468 = new BitSet(new long[]{0x0000000000000002L,0x0000060000000000L});
    public static final BitSet FOLLOW_ID_in_atribuicao1530 = new BitSet(new long[]{0x0000000000000000L,0x0000780000100000L});
    public static final BitSet FOLLOW_opAtribuicao_in_atribuicao1533 = new BitSet(new long[]{0x0000000000000000L,0x01F18000400003C0L});
    public static final BitSet FOLLOW_condicao_in_atribuicao1536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_opAtribuicao1568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_107_in_opAtribuicao1579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_opAtribuicao1590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_109_in_opAtribuicao1601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_110_in_opAtribuicao1612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressaoNum_in_expressao1638 = new BitSet(new long[]{0x0000000000000002L,0x0001800000000000L});
    public static final BitSet FOLLOW_111_in_expressao1650 = new BitSet(new long[]{0x0000000000000000L,0x01F18000400003C0L});
    public static final BitSet FOLLOW_expressaoNum_in_expressao1655 = new BitSet(new long[]{0x0000000000000002L,0x0001800000000000L});
    public static final BitSet FOLLOW_112_in_expressao1692 = new BitSet(new long[]{0x0000000000000000L,0x01F18000400003C0L});
    public static final BitSet FOLLOW_expressaoNum_in_expressao1697 = new BitSet(new long[]{0x0000000000000002L,0x0001800000000000L});
    public static final BitSet FOLLOW_oper_in_expressaoNum1756 = new BitSet(new long[]{0x0000000000000002L,0x000E000000000000L});
    public static final BitSet FOLLOW_113_in_expressaoNum1768 = new BitSet(new long[]{0x0000000000000000L,0x01F18000400003C0L});
    public static final BitSet FOLLOW_oper_in_expressaoNum1773 = new BitSet(new long[]{0x0000000000000002L,0x000E000000000000L});
    public static final BitSet FOLLOW_114_in_expressaoNum1805 = new BitSet(new long[]{0x0000000000000000L,0x01F18000400003C0L});
    public static final BitSet FOLLOW_oper_in_expressaoNum1810 = new BitSet(new long[]{0x0000000000000002L,0x000E000000000000L});
    public static final BitSet FOLLOW_115_in_expressaoNum1842 = new BitSet(new long[]{0x0000000000000000L,0x01F18000400003C0L});
    public static final BitSet FOLLOW_oper_in_expressaoNum1847 = new BitSet(new long[]{0x0000000000000002L,0x000E000000000000L});
    public static final BitSet FOLLOW_opUnario_in_oper1900 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_ID_in_oper1902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_opUnario_in_oper1919 = new BitSet(new long[]{0x0000000000000000L,0x01800000000001C0L});
    public static final BitSet FOLLOW_tipo_in_oper1921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tipo_in_oper1934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_oper1944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_incOp_in_oper1957 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_ID_in_oper1959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_oper1974 = new BitSet(new long[]{0x0000000000000000L,0x0030000000000000L});
    public static final BitSet FOLLOW_incOp_in_oper1976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_in_oper1991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_input__in_oper2000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_116_in_incOp2022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_117_in_incOp2032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_111_in_opUnario2053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_112_in_opUnario2064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_118_in_opUnario2075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_119_in_boolean_2096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_120_in_boolean_2106 = new BitSet(new long[]{0x0000000000000002L});

}