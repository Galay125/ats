// Generated from gramC.g4 by ANTLR 4.4
package antlr;

        import java.util.*;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link gramCParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface gramCVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link gramCParser#dec_nodo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDec_nodo(@NotNull gramCParser.Dec_nodoContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramCParser#funcao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncao(@NotNull gramCParser.FuncaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramCParser#condicao_e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicao_e(@NotNull gramCParser.Condicao_eContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramCParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(@NotNull gramCParser.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramCParser#argumentos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentos(@NotNull gramCParser.ArgumentosContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramCParser#else_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_(@NotNull gramCParser.Else_Context ctx);
	/**
	 * Visit a parse tree produced by {@link gramCParser#print_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_(@NotNull gramCParser.Print_Context ctx);
	/**
	 * Visit a parse tree produced by {@link gramCParser#instrucao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrucao(@NotNull gramCParser.InstrucaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramCParser#for_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_(@NotNull gramCParser.For_Context ctx);
	/**
	 * Visit a parse tree produced by {@link gramCParser#parametro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametro(@NotNull gramCParser.ParametroContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramCParser#opAtribuicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpAtribuicao(@NotNull gramCParser.OpAtribuicaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramCParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(@NotNull gramCParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramCParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressao(@NotNull gramCParser.ExpressaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramCParser#parametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros(@NotNull gramCParser.ParametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramCParser#condicao_ou}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicao_ou(@NotNull gramCParser.Condicao_ouContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramCParser#opUnario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpUnario(@NotNull gramCParser.OpUnarioContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramCParser#return_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_(@NotNull gramCParser.Return_Context ctx);
	/**
	 * Visit a parse tree produced by {@link gramCParser#condicao_comparacao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicao_comparacao(@NotNull gramCParser.Condicao_comparacaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramCParser#codigo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodigo(@NotNull gramCParser.CodigoContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramCParser#atribuicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtribuicao(@NotNull gramCParser.AtribuicaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramCParser#if_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_(@NotNull gramCParser.If_Context ctx);
	/**
	 * Visit a parse tree produced by {@link gramCParser#incOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncOp(@NotNull gramCParser.IncOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramCParser#condicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicao(@NotNull gramCParser.CondicaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramCParser#boolean_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean_(@NotNull gramCParser.Boolean_Context ctx);
	/**
	 * Visit a parse tree produced by {@link gramCParser#for_declaracao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_declaracao(@NotNull gramCParser.For_declaracaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramCParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(@NotNull gramCParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramCParser#call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall(@NotNull gramCParser.CallContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramCParser#declaracao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracao(@NotNull gramCParser.DeclaracaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramCParser#while_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_(@NotNull gramCParser.While_Context ctx);
	/**
	 * Visit a parse tree produced by {@link gramCParser#blocoCodigo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlocoCodigo(@NotNull gramCParser.BlocoCodigoContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramCParser#condicao_igualdade}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicao_igualdade(@NotNull gramCParser.Condicao_igualdadeContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramCParser#expressaoNum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressaoNum(@NotNull gramCParser.ExpressaoNumContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramCParser#idTipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdTipo(@NotNull gramCParser.IdTipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramCParser#input_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput_(@NotNull gramCParser.Input_Context ctx);
	/**
	 * Visit a parse tree produced by {@link gramCParser#oper}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOper(@NotNull gramCParser.OperContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramCParser#argumento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumento(@NotNull gramCParser.ArgumentoContext ctx);
}