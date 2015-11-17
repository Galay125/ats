// Generated from gramC.g4 by ANTLR 4.4
package antlr;

        import java.util.*;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link gramCParser}.
 */
public interface gramCListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link gramCParser#opUnario}.
	 * @param ctx the parse tree
	 */
	void enterOpUnario(@NotNull gramCParser.OpUnarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramCParser#opUnario}.
	 * @param ctx the parse tree
	 */
	void exitOpUnario(@NotNull gramCParser.OpUnarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramCParser#call}.
	 * @param ctx the parse tree
	 */
	void enterCall(@NotNull gramCParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramCParser#call}.
	 * @param ctx the parse tree
	 */
	void exitCall(@NotNull gramCParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramCParser#condicao_igualdade}.
	 * @param ctx the parse tree
	 */
	void enterCondicao_igualdade(@NotNull gramCParser.Condicao_igualdadeContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramCParser#condicao_igualdade}.
	 * @param ctx the parse tree
	 */
	void exitCondicao_igualdade(@NotNull gramCParser.Condicao_igualdadeContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramCParser#input_}.
	 * @param ctx the parse tree
	 */
	void enterInput_(@NotNull gramCParser.Input_Context ctx);
	/**
	 * Exit a parse tree produced by {@link gramCParser#input_}.
	 * @param ctx the parse tree
	 */
	void exitInput_(@NotNull gramCParser.Input_Context ctx);
	/**
	 * Enter a parse tree produced by {@link gramCParser#expressaoNum}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoNum(@NotNull gramCParser.ExpressaoNumContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramCParser#expressaoNum}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoNum(@NotNull gramCParser.ExpressaoNumContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramCParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(@NotNull gramCParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramCParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(@NotNull gramCParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramCParser#codigo}.
	 * @param ctx the parse tree
	 */
	void enterCodigo(@NotNull gramCParser.CodigoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramCParser#codigo}.
	 * @param ctx the parse tree
	 */
	void exitCodigo(@NotNull gramCParser.CodigoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramCParser#for_}.
	 * @param ctx the parse tree
	 */
	void enterFor_(@NotNull gramCParser.For_Context ctx);
	/**
	 * Exit a parse tree produced by {@link gramCParser#for_}.
	 * @param ctx the parse tree
	 */
	void exitFor_(@NotNull gramCParser.For_Context ctx);
	/**
	 * Enter a parse tree produced by {@link gramCParser#incOp}.
	 * @param ctx the parse tree
	 */
	void enterIncOp(@NotNull gramCParser.IncOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramCParser#incOp}.
	 * @param ctx the parse tree
	 */
	void exitIncOp(@NotNull gramCParser.IncOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramCParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(@NotNull gramCParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramCParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(@NotNull gramCParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramCParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicao(@NotNull gramCParser.AtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramCParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicao(@NotNull gramCParser.AtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramCParser#funcao}.
	 * @param ctx the parse tree
	 */
	void enterFuncao(@NotNull gramCParser.FuncaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramCParser#funcao}.
	 * @param ctx the parse tree
	 */
	void exitFuncao(@NotNull gramCParser.FuncaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramCParser#else_}.
	 * @param ctx the parse tree
	 */
	void enterElse_(@NotNull gramCParser.Else_Context ctx);
	/**
	 * Exit a parse tree produced by {@link gramCParser#else_}.
	 * @param ctx the parse tree
	 */
	void exitElse_(@NotNull gramCParser.Else_Context ctx);
	/**
	 * Enter a parse tree produced by {@link gramCParser#while_}.
	 * @param ctx the parse tree
	 */
	void enterWhile_(@NotNull gramCParser.While_Context ctx);
	/**
	 * Exit a parse tree produced by {@link gramCParser#while_}.
	 * @param ctx the parse tree
	 */
	void exitWhile_(@NotNull gramCParser.While_Context ctx);
	/**
	 * Enter a parse tree produced by {@link gramCParser#oper}.
	 * @param ctx the parse tree
	 */
	void enterOper(@NotNull gramCParser.OperContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramCParser#oper}.
	 * @param ctx the parse tree
	 */
	void exitOper(@NotNull gramCParser.OperContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramCParser#boolean_}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_(@NotNull gramCParser.Boolean_Context ctx);
	/**
	 * Exit a parse tree produced by {@link gramCParser#boolean_}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_(@NotNull gramCParser.Boolean_Context ctx);
	/**
	 * Enter a parse tree produced by {@link gramCParser#condicao_comparacao}.
	 * @param ctx the parse tree
	 */
	void enterCondicao_comparacao(@NotNull gramCParser.Condicao_comparacaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramCParser#condicao_comparacao}.
	 * @param ctx the parse tree
	 */
	void exitCondicao_comparacao(@NotNull gramCParser.Condicao_comparacaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramCParser#for_declaracao}.
	 * @param ctx the parse tree
	 */
	void enterFor_declaracao(@NotNull gramCParser.For_declaracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramCParser#for_declaracao}.
	 * @param ctx the parse tree
	 */
	void exitFor_declaracao(@NotNull gramCParser.For_declaracaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramCParser#condicao_e}.
	 * @param ctx the parse tree
	 */
	void enterCondicao_e(@NotNull gramCParser.Condicao_eContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramCParser#condicao_e}.
	 * @param ctx the parse tree
	 */
	void exitCondicao_e(@NotNull gramCParser.Condicao_eContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramCParser#parametro}.
	 * @param ctx the parse tree
	 */
	void enterParametro(@NotNull gramCParser.ParametroContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramCParser#parametro}.
	 * @param ctx the parse tree
	 */
	void exitParametro(@NotNull gramCParser.ParametroContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramCParser#argumentos}.
	 * @param ctx the parse tree
	 */
	void enterArgumentos(@NotNull gramCParser.ArgumentosContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramCParser#argumentos}.
	 * @param ctx the parse tree
	 */
	void exitArgumentos(@NotNull gramCParser.ArgumentosContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramCParser#dec_nodo}.
	 * @param ctx the parse tree
	 */
	void enterDec_nodo(@NotNull gramCParser.Dec_nodoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramCParser#dec_nodo}.
	 * @param ctx the parse tree
	 */
	void exitDec_nodo(@NotNull gramCParser.Dec_nodoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramCParser#instrucao}.
	 * @param ctx the parse tree
	 */
	void enterInstrucao(@NotNull gramCParser.InstrucaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramCParser#instrucao}.
	 * @param ctx the parse tree
	 */
	void exitInstrucao(@NotNull gramCParser.InstrucaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramCParser#print_}.
	 * @param ctx the parse tree
	 */
	void enterPrint_(@NotNull gramCParser.Print_Context ctx);
	/**
	 * Exit a parse tree produced by {@link gramCParser#print_}.
	 * @param ctx the parse tree
	 */
	void exitPrint_(@NotNull gramCParser.Print_Context ctx);
	/**
	 * Enter a parse tree produced by {@link gramCParser#opAtribuicao}.
	 * @param ctx the parse tree
	 */
	void enterOpAtribuicao(@NotNull gramCParser.OpAtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramCParser#opAtribuicao}.
	 * @param ctx the parse tree
	 */
	void exitOpAtribuicao(@NotNull gramCParser.OpAtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramCParser#idTipo}.
	 * @param ctx the parse tree
	 */
	void enterIdTipo(@NotNull gramCParser.IdTipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramCParser#idTipo}.
	 * @param ctx the parse tree
	 */
	void exitIdTipo(@NotNull gramCParser.IdTipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramCParser#condicao_ou}.
	 * @param ctx the parse tree
	 */
	void enterCondicao_ou(@NotNull gramCParser.Condicao_ouContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramCParser#condicao_ou}.
	 * @param ctx the parse tree
	 */
	void exitCondicao_ou(@NotNull gramCParser.Condicao_ouContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramCParser#return_}.
	 * @param ctx the parse tree
	 */
	void enterReturn_(@NotNull gramCParser.Return_Context ctx);
	/**
	 * Exit a parse tree produced by {@link gramCParser#return_}.
	 * @param ctx the parse tree
	 */
	void exitReturn_(@NotNull gramCParser.Return_Context ctx);
	/**
	 * Enter a parse tree produced by {@link gramCParser#blocoCodigo}.
	 * @param ctx the parse tree
	 */
	void enterBlocoCodigo(@NotNull gramCParser.BlocoCodigoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramCParser#blocoCodigo}.
	 * @param ctx the parse tree
	 */
	void exitBlocoCodigo(@NotNull gramCParser.BlocoCodigoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramCParser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterParametros(@NotNull gramCParser.ParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramCParser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitParametros(@NotNull gramCParser.ParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramCParser#argumento}.
	 * @param ctx the parse tree
	 */
	void enterArgumento(@NotNull gramCParser.ArgumentoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramCParser#argumento}.
	 * @param ctx the parse tree
	 */
	void exitArgumento(@NotNull gramCParser.ArgumentoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramCParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(@NotNull gramCParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramCParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(@NotNull gramCParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramCParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao(@NotNull gramCParser.DeclaracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramCParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao(@NotNull gramCParser.DeclaracaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramCParser#if_}.
	 * @param ctx the parse tree
	 */
	void enterIf_(@NotNull gramCParser.If_Context ctx);
	/**
	 * Exit a parse tree produced by {@link gramCParser#if_}.
	 * @param ctx the parse tree
	 */
	void exitIf_(@NotNull gramCParser.If_Context ctx);
	/**
	 * Enter a parse tree produced by {@link gramCParser#condicao}.
	 * @param ctx the parse tree
	 */
	void enterCondicao(@NotNull gramCParser.CondicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramCParser#condicao}.
	 * @param ctx the parse tree
	 */
	void exitCondicao(@NotNull gramCParser.CondicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramCParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(@NotNull gramCParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramCParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(@NotNull gramCParser.ExpressaoContext ctx);
}