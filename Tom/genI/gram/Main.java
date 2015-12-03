package gram;
 
import gram.i.iAdaptor;
import gram.i.types.*;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.tree.Tree;
import tom.library.utils.Viewer;
import tom.library.sl.*;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	private static boolean tom_equal_term_Strategy(Object t1, Object t2) {return  (t1.equals(t2)) ;}private static boolean tom_is_sort_Strategy(Object t) {return  (t instanceof tom.library.sl.Strategy) ;} private static boolean tom_equal_term_Position(Object t1, Object t2) {return  (t1.equals(t2)) ;}private static boolean tom_is_sort_Position(Object t) {return  (t instanceof tom.library.sl.Position) ;} private static boolean tom_equal_term_int(int t1, int t2) {return  t1==t2 ;}private static boolean tom_is_sort_int(int t) {return  true ;} private static boolean tom_equal_term_char(char t1, char t2) {return  t1==t2 ;}private static boolean tom_is_sort_char(char t) {return  true ;} private static boolean tom_equal_term_String(String t1, String t2) {return  t1.equals(t2) ;}private static boolean tom_is_sort_String(String t) {return  t instanceof String ;} private static  tom.library.sl.Strategy  tom_make_mu( tom.library.sl.Strategy  var,  tom.library.sl.Strategy  v) { return ( new tom.library.sl.Mu(var,v) );}private static  tom.library.sl.Strategy  tom_make_MuVar( String  name) { return ( new tom.library.sl.MuVar(name) );}private static  tom.library.sl.Strategy  tom_make_Identity() { return ( new tom.library.sl.Identity() );}private static  tom.library.sl.Strategy  tom_make_One( tom.library.sl.Strategy  v) { return ( new tom.library.sl.One(v) );}private static  tom.library.sl.Strategy  tom_make_All( tom.library.sl.Strategy  v) { return ( new tom.library.sl.All(v) );}private static  tom.library.sl.Strategy  tom_make_Fail() { return ( new tom.library.sl.Fail() );}private static boolean tom_is_fun_sym_Sequence( tom.library.sl.Strategy  t) {return ( t instanceof tom.library.sl.Sequence );}private static  tom.library.sl.Strategy  tom_empty_list_Sequence() { return  null ;}private static  tom.library.sl.Strategy  tom_cons_list_Sequence( tom.library.sl.Strategy  head,  tom.library.sl.Strategy  tail) { return  tom.library.sl.Sequence.make(head,tail) ;}private static  tom.library.sl.Strategy  tom_get_head_Sequence_Strategy( tom.library.sl.Strategy  t) {return ( (tom.library.sl.Strategy)t.getChildAt(tom.library.sl.Sequence.FIRST) );}private static  tom.library.sl.Strategy  tom_get_tail_Sequence_Strategy( tom.library.sl.Strategy  t) {return ( (tom.library.sl.Strategy)t.getChildAt(tom.library.sl.Sequence.THEN) );}private static boolean tom_is_empty_Sequence_Strategy( tom.library.sl.Strategy  t) {return ( t == null );}   private static   tom.library.sl.Strategy  tom_append_list_Sequence( tom.library.sl.Strategy  l1,  tom.library.sl.Strategy  l2) {     if(( l1 == null )) {       return l2;     } else if(( l2 == null )) {       return l1;     } else if(( l1 instanceof tom.library.sl.Sequence )) {       if(( ( (tom.library.sl.Strategy)l1.getChildAt(tom.library.sl.Sequence.THEN) ) == null )) {         return  tom.library.sl.Sequence.make(( (tom.library.sl.Strategy)l1.getChildAt(tom.library.sl.Sequence.FIRST) ),l2) ;       } else {         return  tom.library.sl.Sequence.make(( (tom.library.sl.Strategy)l1.getChildAt(tom.library.sl.Sequence.FIRST) ),tom_append_list_Sequence(( (tom.library.sl.Strategy)l1.getChildAt(tom.library.sl.Sequence.THEN) ),l2)) ;       }     } else {       return  tom.library.sl.Sequence.make(l1,l2) ;     }   }   private static   tom.library.sl.Strategy  tom_get_slice_Sequence( tom.library.sl.Strategy  begin,  tom.library.sl.Strategy  end, tom.library.sl.Strategy  tail) {     if( (begin.equals(end)) ) {       return tail;     } else if( (end.equals(tail))  && (( end == null ) ||  (end.equals(tom_empty_list_Sequence())) )) {       /* code to avoid a call to make, and thus to avoid looping during list-matching */       return begin;     }     return  tom.library.sl.Sequence.make(((( begin instanceof tom.library.sl.Sequence ))?( (tom.library.sl.Strategy)begin.getChildAt(tom.library.sl.Sequence.FIRST) ):begin),( tom.library.sl.Strategy )tom_get_slice_Sequence(((( begin instanceof tom.library.sl.Sequence ))?( (tom.library.sl.Strategy)begin.getChildAt(tom.library.sl.Sequence.THEN) ):tom_empty_list_Sequence()),end,tail)) ;   }   private static boolean tom_is_fun_sym_Choice( tom.library.sl.Strategy  t) {return ( t instanceof tom.library.sl.Choice );}private static  tom.library.sl.Strategy  tom_empty_list_Choice() { return  null ;}private static  tom.library.sl.Strategy  tom_cons_list_Choice( tom.library.sl.Strategy  head,  tom.library.sl.Strategy  tail) { return  tom.library.sl.Choice.make(head,tail) ;}private static  tom.library.sl.Strategy  tom_get_head_Choice_Strategy( tom.library.sl.Strategy  t) {return ( (tom.library.sl.Strategy)t.getChildAt(tom.library.sl.Choice.FIRST) );}private static  tom.library.sl.Strategy  tom_get_tail_Choice_Strategy( tom.library.sl.Strategy  t) {return ( (tom.library.sl.Strategy)t.getChildAt(tom.library.sl.Choice.THEN) );}private static boolean tom_is_empty_Choice_Strategy( tom.library.sl.Strategy  t) {return ( t ==null );}   private static   tom.library.sl.Strategy  tom_append_list_Choice( tom.library.sl.Strategy  l1,  tom.library.sl.Strategy  l2) {     if(( l1 ==null )) {       return l2;     } else if(( l2 ==null )) {       return l1;     } else if(( l1 instanceof tom.library.sl.Choice )) {       if(( ( (tom.library.sl.Strategy)l1.getChildAt(tom.library.sl.Choice.THEN) ) ==null )) {         return  tom.library.sl.Choice.make(( (tom.library.sl.Strategy)l1.getChildAt(tom.library.sl.Choice.FIRST) ),l2) ;       } else {         return  tom.library.sl.Choice.make(( (tom.library.sl.Strategy)l1.getChildAt(tom.library.sl.Choice.FIRST) ),tom_append_list_Choice(( (tom.library.sl.Strategy)l1.getChildAt(tom.library.sl.Choice.THEN) ),l2)) ;       }     } else {       return  tom.library.sl.Choice.make(l1,l2) ;     }   }   private static   tom.library.sl.Strategy  tom_get_slice_Choice( tom.library.sl.Strategy  begin,  tom.library.sl.Strategy  end, tom.library.sl.Strategy  tail) {     if( (begin.equals(end)) ) {       return tail;     } else if( (end.equals(tail))  && (( end ==null ) ||  (end.equals(tom_empty_list_Choice())) )) {       /* code to avoid a call to make, and thus to avoid looping during list-matching */       return begin;     }     return  tom.library.sl.Choice.make(((( begin instanceof tom.library.sl.Choice ))?( (tom.library.sl.Strategy)begin.getChildAt(tom.library.sl.Choice.FIRST) ):begin),( tom.library.sl.Strategy )tom_get_slice_Choice(((( begin instanceof tom.library.sl.Choice ))?( (tom.library.sl.Strategy)begin.getChildAt(tom.library.sl.Choice.THEN) ):tom_empty_list_Choice()),end,tail)) ;   }   private static boolean tom_is_fun_sym_SequenceId( tom.library.sl.Strategy  t) {return ( t instanceof tom.library.sl.SequenceId );}private static  tom.library.sl.Strategy  tom_empty_list_SequenceId() { return  null ;}private static  tom.library.sl.Strategy  tom_cons_list_SequenceId( tom.library.sl.Strategy  head,  tom.library.sl.Strategy  tail) { return  tom.library.sl.SequenceId.make(head,tail) ;}private static  tom.library.sl.Strategy  tom_get_head_SequenceId_Strategy( tom.library.sl.Strategy  t) {return ( (tom.library.sl.Strategy)t.getChildAt(tom.library.sl.SequenceId.FIRST) );}private static  tom.library.sl.Strategy  tom_get_tail_SequenceId_Strategy( tom.library.sl.Strategy  t) {return ( (tom.library.sl.Strategy)t.getChildAt(tom.library.sl.SequenceId.THEN) );}private static boolean tom_is_empty_SequenceId_Strategy( tom.library.sl.Strategy  t) {return ( t == null );}   private static   tom.library.sl.Strategy  tom_append_list_SequenceId( tom.library.sl.Strategy  l1,  tom.library.sl.Strategy  l2) {     if(( l1 == null )) {       return l2;     } else if(( l2 == null )) {       return l1;     } else if(( l1 instanceof tom.library.sl.SequenceId )) {       if(( ( (tom.library.sl.Strategy)l1.getChildAt(tom.library.sl.SequenceId.THEN) ) == null )) {         return  tom.library.sl.SequenceId.make(( (tom.library.sl.Strategy)l1.getChildAt(tom.library.sl.SequenceId.FIRST) ),l2) ;       } else {         return  tom.library.sl.SequenceId.make(( (tom.library.sl.Strategy)l1.getChildAt(tom.library.sl.SequenceId.FIRST) ),tom_append_list_SequenceId(( (tom.library.sl.Strategy)l1.getChildAt(tom.library.sl.SequenceId.THEN) ),l2)) ;       }     } else {       return  tom.library.sl.SequenceId.make(l1,l2) ;     }   }   private static   tom.library.sl.Strategy  tom_get_slice_SequenceId( tom.library.sl.Strategy  begin,  tom.library.sl.Strategy  end, tom.library.sl.Strategy  tail) {     if( (begin.equals(end)) ) {       return tail;     } else if( (end.equals(tail))  && (( end == null ) ||  (end.equals(tom_empty_list_SequenceId())) )) {       /* code to avoid a call to make, and thus to avoid looping during list-matching */       return begin;     }     return  tom.library.sl.SequenceId.make(((( begin instanceof tom.library.sl.SequenceId ))?( (tom.library.sl.Strategy)begin.getChildAt(tom.library.sl.SequenceId.FIRST) ):begin),( tom.library.sl.Strategy )tom_get_slice_SequenceId(((( begin instanceof tom.library.sl.SequenceId ))?( (tom.library.sl.Strategy)begin.getChildAt(tom.library.sl.SequenceId.THEN) ):tom_empty_list_SequenceId()),end,tail)) ;   }   private static boolean tom_is_fun_sym_ChoiceId( tom.library.sl.Strategy  t) {return ( t instanceof tom.library.sl.ChoiceId );}private static  tom.library.sl.Strategy  tom_empty_list_ChoiceId() { return  null ;}private static  tom.library.sl.Strategy  tom_cons_list_ChoiceId( tom.library.sl.Strategy  head,  tom.library.sl.Strategy  tail) { return  tom.library.sl.ChoiceId.make(head,tail) ;}private static  tom.library.sl.Strategy  tom_get_head_ChoiceId_Strategy( tom.library.sl.Strategy  t) {return ( (tom.library.sl.Strategy)t.getChildAt(tom.library.sl.ChoiceId.FIRST) );}private static  tom.library.sl.Strategy  tom_get_tail_ChoiceId_Strategy( tom.library.sl.Strategy  t) {return ( (tom.library.sl.Strategy)t.getChildAt(tom.library.sl.ChoiceId.THEN) );}private static boolean tom_is_empty_ChoiceId_Strategy( tom.library.sl.Strategy  t) {return ( t ==null );}   private static   tom.library.sl.Strategy  tom_append_list_ChoiceId( tom.library.sl.Strategy  l1,  tom.library.sl.Strategy  l2) {     if(( l1 ==null )) {       return l2;     } else if(( l2 ==null )) {       return l1;     } else if(( l1 instanceof tom.library.sl.ChoiceId )) {       if(( ( (tom.library.sl.Strategy)l1.getChildAt(tom.library.sl.ChoiceId.THEN) ) ==null )) {         return  tom.library.sl.ChoiceId.make(( (tom.library.sl.Strategy)l1.getChildAt(tom.library.sl.ChoiceId.FIRST) ),l2) ;       } else {         return  tom.library.sl.ChoiceId.make(( (tom.library.sl.Strategy)l1.getChildAt(tom.library.sl.ChoiceId.FIRST) ),tom_append_list_ChoiceId(( (tom.library.sl.Strategy)l1.getChildAt(tom.library.sl.ChoiceId.THEN) ),l2)) ;       }     } else {       return  tom.library.sl.ChoiceId.make(l1,l2) ;     }   }   private static   tom.library.sl.Strategy  tom_get_slice_ChoiceId( tom.library.sl.Strategy  begin,  tom.library.sl.Strategy  end, tom.library.sl.Strategy  tail) {     if( (begin.equals(end)) ) {       return tail;     } else if( (end.equals(tail))  && (( end ==null ) ||  (end.equals(tom_empty_list_ChoiceId())) )) {       /* code to avoid a call to make, and thus to avoid looping during list-matching */       return begin;     }     return  tom.library.sl.ChoiceId.make(((( begin instanceof tom.library.sl.ChoiceId ))?( (tom.library.sl.Strategy)begin.getChildAt(tom.library.sl.ChoiceId.FIRST) ):begin),( tom.library.sl.Strategy )tom_get_slice_ChoiceId(((( begin instanceof tom.library.sl.ChoiceId ))?( (tom.library.sl.Strategy)begin.getChildAt(tom.library.sl.ChoiceId.THEN) ):tom_empty_list_ChoiceId()),end,tail)) ;   }   private static  tom.library.sl.Strategy  tom_make_OneId( tom.library.sl.Strategy  v) { return ( new tom.library.sl.OneId(v) );}   private static  tom.library.sl.Strategy  tom_make_AllSeq( tom.library.sl.Strategy  s) { return ( new tom.library.sl.AllSeq(s) );}private static  tom.library.sl.Strategy  tom_make_AUCtl( tom.library.sl.Strategy  s1,  tom.library.sl.Strategy  s2) { return ( tom_make_mu(tom_make_MuVar("x"),tom_cons_list_Choice(s2,tom_cons_list_Choice(tom_cons_list_Sequence(tom_cons_list_Sequence(s1,tom_cons_list_Sequence(tom_make_All(tom_make_MuVar("x")),tom_empty_list_Sequence())),tom_cons_list_Sequence(tom_make_One(tom_make_Identity()),tom_empty_list_Sequence())),tom_empty_list_Choice()))) );}private static  tom.library.sl.Strategy  tom_make_EUCtl( tom.library.sl.Strategy  s1,  tom.library.sl.Strategy  s2) { return ( tom_make_mu(tom_make_MuVar("x"),tom_cons_list_Choice(s2,tom_cons_list_Choice(tom_cons_list_Sequence(s1,tom_cons_list_Sequence(tom_make_One(tom_make_MuVar("x")),tom_empty_list_Sequence())),tom_empty_list_Choice()))));} private static  tom.library.sl.Strategy  tom_make_Try( tom.library.sl.Strategy  s) { return ( tom_cons_list_Choice(s,tom_cons_list_Choice(tom_make_Identity(),tom_empty_list_Choice())) );}private static  tom.library.sl.Strategy  tom_make_Repeat( tom.library.sl.Strategy  s) { return ( tom_make_mu(tom_make_MuVar("_x"),tom_cons_list_Choice(tom_cons_list_Sequence(s,tom_cons_list_Sequence(tom_make_MuVar("_x"),tom_empty_list_Sequence())),tom_cons_list_Choice(tom_make_Identity(),tom_empty_list_Choice()))) );}private static  tom.library.sl.Strategy  tom_make_TopDown( tom.library.sl.Strategy  v) { return ( tom_make_mu(tom_make_MuVar("_x"),tom_cons_list_Sequence(v,tom_cons_list_Sequence(tom_make_All(tom_make_MuVar("_x")),tom_empty_list_Sequence()))) );}private static  tom.library.sl.Strategy  tom_make_OnceTopDown( tom.library.sl.Strategy  v) { return ( tom_make_mu(tom_make_MuVar("_x"),tom_cons_list_Choice(v,tom_cons_list_Choice(tom_make_One(tom_make_MuVar("_x")),tom_empty_list_Choice()))) );}private static  tom.library.sl.Strategy  tom_make_RepeatId( tom.library.sl.Strategy  v) { return ( tom_make_mu(tom_make_MuVar("_x"),tom_cons_list_SequenceId(v,tom_cons_list_SequenceId(tom_make_MuVar("_x"),tom_empty_list_SequenceId()))) );}private static  tom.library.sl.Strategy  tom_make_OnceTopDownId( tom.library.sl.Strategy  v) { return ( tom_make_mu(tom_make_MuVar("_x"),tom_cons_list_ChoiceId(v,tom_cons_list_ChoiceId(tom_make_OneId(tom_make_MuVar("_x")),tom_empty_list_ChoiceId()))) );}      static class MapEntry {   private Object key;   private Object val;   public Object getKey() { return key; }   public Object getVal() { return val; }   public MapEntry(Object key, Object val) {     this.key = key;     this.val = val;   } }  private static boolean tom_equal_term_MapEntry(Object e1, Object e2) {return  e1.equals(e2) ;}private static boolean tom_is_sort_MapEntry(Object t) {return  t instanceof MapEntry ;}private static boolean tom_equal_term_Object(Object o1, Object o2) {return  o1.equals(o2) ;}private static boolean tom_is_sort_Object(Object t) {return  t instanceof Object ;}  private static boolean tom_equal_term_HashMap(Object l1, Object l2) {return  l1.equals(l2) ;}private static boolean tom_is_sort_HashMap(Object t) {return  t instanceof java.util.HashMap ;}   @SuppressWarnings("unchecked") private static java.util.HashMap hashMapAppend(MapEntry e, java.util.HashMap m) {   java.util.HashMap res = (java.util.HashMap) m.clone();   res.put(e.getKey(), e.getVal());   return res; }  @SuppressWarnings("unchecked") private static MapEntry hashMapGetHead(java.util.HashMap m) {   java.util.Set es = m.entrySet();   java.util.Iterator it = es.iterator();   java.util.Map.Entry e = (java.util.Map.Entry) it.next();   return new MapEntry(e.getKey(), e.getValue()); }  @SuppressWarnings("unchecked") private static java.util.HashMap hashMapGetTail(java.util.HashMap m) {   java.util.HashMap res = (java.util.HashMap) m.clone();   java.util.Set es = m.entrySet();   java.util.Iterator it = es.iterator();   java.util.Map.Entry e = (java.util.Map.Entry) it.next();   res.remove(e.getKey());   return res; }   private static boolean tom_equal_term_ArrayList(Object l1, Object l2) {return  l1.equals(l2) ;}private static boolean tom_is_sort_ArrayList(Object t) {return  t instanceof java.util.ArrayList ;}   @SuppressWarnings("unchecked") private static java.util.ArrayList concArrayListAppend(Object o, java.util.ArrayList l) {   java.util.ArrayList res = (java.util.ArrayList)l.clone();   res.add(o);   return res; } private static boolean tom_equal_term_Collection(Object l1, Object l2) {return  l1.equals(l2) ;}private static boolean tom_is_sort_Collection(Object t) {return  t instanceof java.util.Collection ;} private static boolean tom_equal_term_Set(Object l1, Object l2) {return  l1.equals(l2) ;}private static boolean tom_is_sort_Set(Object t) {return  t instanceof java.util.Set ;} private static boolean tom_equal_term_DefTipo(Object t1, Object t2) {return  (t1==t2) ;}private static boolean tom_is_sort_DefTipo(Object t) {return  (t instanceof gram.i.types.DefTipo) ;}private static boolean tom_equal_term_OpNum(Object t1, Object t2) {return  (t1==t2) ;}private static boolean tom_is_sort_OpNum(Object t) {return  (t instanceof gram.i.types.OpNum) ;}private static boolean tom_equal_term_OpComp(Object t1, Object t2) {return  (t1==t2) ;}private static boolean tom_is_sort_OpComp(Object t) {return  (t instanceof gram.i.types.OpComp) ;}private static boolean tom_equal_term_Expressao(Object t1, Object t2) {return  (t1==t2) ;}private static boolean tom_is_sort_Expressao(Object t) {return  (t instanceof gram.i.types.Expressao) ;}private static boolean tom_equal_term_OpAtribuicao(Object t1, Object t2) {return  (t1==t2) ;}private static boolean tom_is_sort_OpAtribuicao(Object t) {return  (t instanceof gram.i.types.OpAtribuicao) ;}private static boolean tom_equal_term_OpInc(Object t1, Object t2) {return  (t1==t2) ;}private static boolean tom_is_sort_OpInc(Object t) {return  (t instanceof gram.i.types.OpInc) ;}private static boolean tom_equal_term_Parametros(Object t1, Object t2) {return  (t1==t2) ;}private static boolean tom_is_sort_Parametros(Object t) {return  (t instanceof gram.i.types.Parametros) ;}private static boolean tom_equal_term_Argumentos(Object t1, Object t2) {return  (t1==t2) ;}private static boolean tom_is_sort_Argumentos(Object t) {return  (t instanceof gram.i.types.Argumentos) ;}private static boolean tom_equal_term_Declaracoes(Object t1, Object t2) {return  (t1==t2) ;}private static boolean tom_is_sort_Declaracoes(Object t) {return  (t instanceof gram.i.types.Declaracoes) ;}private static boolean tom_equal_term_Instrucao(Object t1, Object t2) {return  (t1==t2) ;}private static boolean tom_is_sort_Instrucao(Object t) {return  (t instanceof gram.i.types.Instrucao) ;}private static boolean tom_equal_term_IntWrapper(Object t1, Object t2) {return  (t1==t2) ;}private static boolean tom_is_sort_IntWrapper(Object t) {return  (t instanceof gram.i.types.IntWrapper) ;}private static boolean tom_is_fun_sym_Ou( gram.i.types.Expressao  t) {return  (t instanceof gram.i.types.expressao.Ou) ;}private static  gram.i.types.Expressao  tom_get_slot_Ou_Cond1( gram.i.types.Expressao  t) {return  t.getCond1() ;}private static  gram.i.types.Expressao  tom_get_slot_Ou_Cond2( gram.i.types.Expressao  t) {return  t.getCond2() ;}private static boolean tom_is_fun_sym_E( gram.i.types.Expressao  t) {return  (t instanceof gram.i.types.expressao.E) ;}private static  gram.i.types.Expressao  tom_get_slot_E_Cond1( gram.i.types.Expressao  t) {return  t.getCond1() ;}private static  gram.i.types.Expressao  tom_get_slot_E_Cond2( gram.i.types.Expressao  t) {return  t.getCond2() ;}private static boolean tom_is_fun_sym_Argumento( gram.i.types.Argumentos  t) {return  (t instanceof gram.i.types.argumentos.Argumento) ;}private static  gram.i.types.DefTipo  tom_get_slot_Argumento_DefTipo( gram.i.types.Argumentos  t) {return  t.getDefTipo() ;}private static  String  tom_get_slot_Argumento_Id( gram.i.types.Argumentos  t) {return  t.getId() ;}private static boolean tom_is_fun_sym_Atribuicao( gram.i.types.Instrucao  t) {return  (t instanceof gram.i.types.instrucao.Atribuicao) ;}private static  String  tom_get_slot_Atribuicao_Id( gram.i.types.Instrucao  t) {return  t.getId() ;}private static  gram.i.types.OpAtribuicao  tom_get_slot_Atribuicao_op( gram.i.types.Instrucao  t) {return  t.getop() ;}private static  gram.i.types.Expressao  tom_get_slot_Atribuicao_Expressao( gram.i.types.Instrucao  t) {return  t.getExpressao() ;}private static boolean tom_is_fun_sym_Declaracao( gram.i.types.Instrucao  t) {return  (t instanceof gram.i.types.instrucao.Declaracao) ;}private static  gram.i.types.DefTipo  tom_get_slot_Declaracao_DefTipo( gram.i.types.Instrucao  t) {return  t.getDefTipo() ;}private static  gram.i.types.Declaracoes  tom_get_slot_Declaracao_Declaracoes( gram.i.types.Instrucao  t) {return  t.getDeclaracoes() ;}private static boolean tom_is_fun_sym_If( gram.i.types.Instrucao  t) {return  (t instanceof gram.i.types.instrucao.If) ;}private static  gram.i.types.Expressao  tom_get_slot_If_Condicao( gram.i.types.Instrucao  t) {return  t.getCondicao() ;}private static  gram.i.types.Instrucao  tom_get_slot_If_Instrucao1( gram.i.types.Instrucao  t) {return  t.getInstrucao1() ;}private static  gram.i.types.Instrucao  tom_get_slot_If_Instrucao2( gram.i.types.Instrucao  t) {return  t.getInstrucao2() ;}private static boolean tom_is_fun_sym_While( gram.i.types.Instrucao  t) {return  (t instanceof gram.i.types.instrucao.While) ;}private static  gram.i.types.Expressao  tom_get_slot_While_Condicao( gram.i.types.Instrucao  t) {return  t.getCondicao() ;}private static  gram.i.types.Instrucao  tom_get_slot_While_Instrucao( gram.i.types.Instrucao  t) {return  t.getInstrucao() ;}private static boolean tom_is_fun_sym_For( gram.i.types.Instrucao  t) {return  (t instanceof gram.i.types.instrucao.For) ;}private static  gram.i.types.Instrucao  tom_get_slot_For_Declaracao( gram.i.types.Instrucao  t) {return  t.getDeclaracao() ;}private static  gram.i.types.Expressao  tom_get_slot_For_Condicao( gram.i.types.Instrucao  t) {return  t.getCondicao() ;}private static  gram.i.types.Expressao  tom_get_slot_For_Expressao( gram.i.types.Instrucao  t) {return  t.getExpressao() ;}private static  gram.i.types.Instrucao  tom_get_slot_For_Instrucao( gram.i.types.Instrucao  t) {return  t.getInstrucao() ;}private static boolean tom_is_fun_sym_Return( gram.i.types.Instrucao  t) {return  (t instanceof gram.i.types.instrucao.Return) ;}private static  gram.i.types.Expressao  tom_get_slot_Return_Expressao( gram.i.types.Instrucao  t) {return  t.getExpressao() ;}private static boolean tom_is_fun_sym_Funcao( gram.i.types.Instrucao  t) {return  (t instanceof gram.i.types.instrucao.Funcao) ;}private static  gram.i.types.DefTipo  tom_get_slot_Funcao_DefTipo( gram.i.types.Instrucao  t) {return  t.getDefTipo() ;}private static  String  tom_get_slot_Funcao_Nome( gram.i.types.Instrucao  t) {return  t.getNome() ;}private static  gram.i.types.Argumentos  tom_get_slot_Funcao_Argumentos( gram.i.types.Instrucao  t) {return  t.getArgumentos() ;}private static  gram.i.types.Instrucao  tom_get_slot_Funcao_Instrucao( gram.i.types.Instrucao  t) {return  t.getInstrucao() ;}private static boolean tom_is_fun_sym_Exp( gram.i.types.Instrucao  t) {return  (t instanceof gram.i.types.instrucao.Exp) ;}private static  gram.i.types.Expressao  tom_get_slot_Exp_Expressao( gram.i.types.Instrucao  t) {return  t.getExpressao() ;}private static boolean tom_is_fun_sym_ListaArgumentos( gram.i.types.Argumentos  t) {return  ((t instanceof gram.i.types.argumentos.ConsListaArgumentos) || (t instanceof gram.i.types.argumentos.EmptyListaArgumentos)) ;}private static  gram.i.types.Argumentos  tom_empty_list_ListaArgumentos() { return  gram.i.types.argumentos.EmptyListaArgumentos.make() ;}private static  gram.i.types.Argumentos  tom_cons_list_ListaArgumentos( gram.i.types.Argumentos  e,  gram.i.types.Argumentos  l) { return  gram.i.types.argumentos.ConsListaArgumentos.make(e,l) ;}private static  gram.i.types.Argumentos  tom_get_head_ListaArgumentos_Argumentos( gram.i.types.Argumentos  l) {return  l.getHeadListaArgumentos() ;}private static  gram.i.types.Argumentos  tom_get_tail_ListaArgumentos_Argumentos( gram.i.types.Argumentos  l) {return  l.getTailListaArgumentos() ;}private static boolean tom_is_empty_ListaArgumentos_Argumentos( gram.i.types.Argumentos  l) {return  l.isEmptyListaArgumentos() ;}   private static   gram.i.types.Argumentos  tom_append_list_ListaArgumentos( gram.i.types.Argumentos  l1,  gram.i.types.Argumentos  l2) {     if( l1.isEmptyListaArgumentos() ) {       return l2;     } else if( l2.isEmptyListaArgumentos() ) {       return l1;     } else if( ((l1 instanceof gram.i.types.argumentos.ConsListaArgumentos) || (l1 instanceof gram.i.types.argumentos.EmptyListaArgumentos)) ) {       if(  l1.getTailListaArgumentos() .isEmptyListaArgumentos() ) {         return  gram.i.types.argumentos.ConsListaArgumentos.make( l1.getHeadListaArgumentos() ,l2) ;       } else {         return  gram.i.types.argumentos.ConsListaArgumentos.make( l1.getHeadListaArgumentos() ,tom_append_list_ListaArgumentos( l1.getTailListaArgumentos() ,l2)) ;       }     } else {       return  gram.i.types.argumentos.ConsListaArgumentos.make(l1,l2) ;     }   }   private static   gram.i.types.Argumentos  tom_get_slice_ListaArgumentos( gram.i.types.Argumentos  begin,  gram.i.types.Argumentos  end, gram.i.types.Argumentos  tail) {     if( (begin==end) ) {       return tail;     } else if( (end==tail)  && ( end.isEmptyListaArgumentos()  ||  (end==tom_empty_list_ListaArgumentos()) )) {       /* code to avoid a call to make, and thus to avoid looping during list-matching */       return begin;     }     return  gram.i.types.argumentos.ConsListaArgumentos.make((( ((begin instanceof gram.i.types.argumentos.ConsListaArgumentos) || (begin instanceof gram.i.types.argumentos.EmptyListaArgumentos)) )? begin.getHeadListaArgumentos() :begin),( gram.i.types.Argumentos )tom_get_slice_ListaArgumentos((( ((begin instanceof gram.i.types.argumentos.ConsListaArgumentos) || (begin instanceof gram.i.types.argumentos.EmptyListaArgumentos)) )? begin.getTailListaArgumentos() :tom_empty_list_ListaArgumentos()),end,tail)) ;   }   private static boolean tom_is_fun_sym_SeqInstrucao( gram.i.types.Instrucao  t) {return  ((t instanceof gram.i.types.instrucao.ConsSeqInstrucao) || (t instanceof gram.i.types.instrucao.EmptySeqInstrucao)) ;}private static  gram.i.types.Instrucao  tom_empty_list_SeqInstrucao() { return  gram.i.types.instrucao.EmptySeqInstrucao.make() ;}private static  gram.i.types.Instrucao  tom_cons_list_SeqInstrucao( gram.i.types.Instrucao  e,  gram.i.types.Instrucao  l) { return  gram.i.types.instrucao.ConsSeqInstrucao.make(e,l) ;}private static  gram.i.types.Instrucao  tom_get_head_SeqInstrucao_Instrucao( gram.i.types.Instrucao  l) {return  l.getHeadSeqInstrucao() ;}private static  gram.i.types.Instrucao  tom_get_tail_SeqInstrucao_Instrucao( gram.i.types.Instrucao  l) {return  l.getTailSeqInstrucao() ;}private static boolean tom_is_empty_SeqInstrucao_Instrucao( gram.i.types.Instrucao  l) {return  l.isEmptySeqInstrucao() ;}   private static   gram.i.types.Instrucao  tom_append_list_SeqInstrucao( gram.i.types.Instrucao  l1,  gram.i.types.Instrucao  l2) {     if( l1.isEmptySeqInstrucao() ) {       return l2;     } else if( l2.isEmptySeqInstrucao() ) {       return l1;     } else if( ((l1 instanceof gram.i.types.instrucao.ConsSeqInstrucao) || (l1 instanceof gram.i.types.instrucao.EmptySeqInstrucao)) ) {       if(  l1.getTailSeqInstrucao() .isEmptySeqInstrucao() ) {         return  gram.i.types.instrucao.ConsSeqInstrucao.make( l1.getHeadSeqInstrucao() ,l2) ;       } else {         return  gram.i.types.instrucao.ConsSeqInstrucao.make( l1.getHeadSeqInstrucao() ,tom_append_list_SeqInstrucao( l1.getTailSeqInstrucao() ,l2)) ;       }     } else {       return  gram.i.types.instrucao.ConsSeqInstrucao.make(l1,l2) ;     }   }   private static   gram.i.types.Instrucao  tom_get_slice_SeqInstrucao( gram.i.types.Instrucao  begin,  gram.i.types.Instrucao  end, gram.i.types.Instrucao  tail) {     if( (begin==end) ) {       return tail;     } else if( (end==tail)  && ( end.isEmptySeqInstrucao()  ||  (end==tom_empty_list_SeqInstrucao()) )) {       /* code to avoid a call to make, and thus to avoid looping during list-matching */       return begin;     }     return  gram.i.types.instrucao.ConsSeqInstrucao.make((( ((begin instanceof gram.i.types.instrucao.ConsSeqInstrucao) || (begin instanceof gram.i.types.instrucao.EmptySeqInstrucao)) )? begin.getHeadSeqInstrucao() :begin),( gram.i.types.Instrucao )tom_get_slice_SeqInstrucao((( ((begin instanceof gram.i.types.instrucao.ConsSeqInstrucao) || (begin instanceof gram.i.types.instrucao.EmptySeqInstrucao)) )? begin.getTailSeqInstrucao() :tom_empty_list_SeqInstrucao()),end,tail)) ;   }    







	private String actualFunctionName;
	HashMap<String, Argumentos> functionSignatures;
	private boolean callReturnNeeded;
	private int memAdress;
	StringBuilder functionsDeclarations;
	HashMap<String, Instrucao> funcoesInst;

	public static void menu(String file){

		System.out.println("\n************** Menu ************");
		
		if(file != null)
				System.out.println("\nFicheiro executado:"+file+"\n");

		System.out.println("1 ----------------- Ler ficheiros");
		System.out.println("2 ----------------- Árvore GOM ");
		System.out.println("3 ----------------- Gerar código MSP");
		System.out.println("4 ----------------- Gerar ficheiro .dot");
		System.out.println("5 ----------------- Metricas");
		System.out.println("0 ----------------- Sair do Sistema ");

		System.out.println("\nDigite um número:");
	}

	public static void main(String[] args) throws IOException {

		System.out.println("*************************** Trabalho de ATS ****************************\n");

		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

		Boolean sair = false;
 		String file = null;
 		String opcao = null;
 		Instrucao p = null;
 		String aux = null;
 		Main main = new Main();
 		ArrayList<Integer> numInstrucao = new ArrayList<Integer>();
 		Metrica met = new Metrica();

		while(sair == false){
 			 
 			 menu(file);
			 
			 opcao = teclado.readLine();
			 
			 switch(opcao){
			 	case "1":
			 		System.out.println("\nDigite o nome do ficheiro: ");
			 		file = teclado.readLine();
			 		main = new Main();
			 		try{
						iLexer lexer = new iLexer(new ANTLRFileStream("../exemplos/"+file));
						CommonTokenStream tokens = new CommonTokenStream(lexer);
						iParser parser = new iParser(tokens);
							// Parse the input expression
						Tree b = (Tree) parser.prog().getTree();
						p = (Instrucao) iAdaptor.getTerm(b);
					} catch(Exception e) {
						e.printStackTrace();
					}
			 	break;

			 	case "2":
			 		System.out.println("Arvore gerada = " + p); // name of the Gom module + Adaptor
			 	break;

			 	case "3":
 					System.out.println("Em construção !");
			 	/*		try{
			 				numInstrucao = new ArrayList<Integer>();
							numInstrucao.add(1);
							`TopDown(CollectFuncsSignature(main.functionSignatures)).visit(p);
							Instrucao p2 = p;
							int numInst = numInstrucao.get(0)-1;
							Expressao numInstExps = `Expressoes(Print(Int(numInst)),Print(Char("#")));
							NumToInt n = new NumToInt(1);
							String numInstString = main.compileAnnotExpressoes(numInstExps, n);
							String instrucoes = "";

							System.out.println("\n1--- Injectar falhas");
							System.out.println("2--- Tratar bad smells");
							System.out.println("0--- Sair\n");
							aux = readFile();
							
							if(aux.equals("1")){
								TreeSet<Integer> blocosMaisUsados = new TreeSet<Integer>();
								Main.parseFile(file,blocosMaisUsados);
								numInstrucao.clear();
								numInstrucao.add(1);
								Instrucao p3 = `BottomUp(stratFaultInjectionWithKnowledge(numInstrucao, blocosMaisUsados)).visit(p2);
								instrucoes = main.compileAnnot(p3);
							}
							else if(aux.equals("2")){
								Instrucao p3 = `TopDown(stratBadSmells()).visit(p);
								instrucoes = main.compileAnnot(p3);
							}
							else{
								instrucoes = main.compileAnnot(p2);
							}
							String functionDeclarationsAndArguments = main.functionsDeclarations.toString();
							System.out.println(functionDeclarationsAndArguments + numInstString + instrucoes);
						} 
						catch(VisitFailure e) {
							System.out.println("the strategy failed");
						}*/
			 	break;

			 	case "4":
			 			/* Export this representation to .dot file*/
						try{
							System.out.println("Nome de Ficheiro: ");
							aux = teclado.readLine();
							FileWriter out=new FileWriter(aux);
							Viewer.toDot(p,out);
 						}
						catch (IOException e){
							System.out.println("ERROR in dot file"); 
						}
			 	break;


			 	case "5":
						try{
							System.out.println("\n*********** Métricas ************ ");

							if(main.funcoesInst.size()==0){
								/* Vai recolher as instruções por função */
								tom_make_TopDown(tom_make_visitFuncoes(main.funcoesInst)).visit(p);
							}

							System.out.println("\nNúmero de funcoes: "+main.funcoesInst.size());

							System.out.println("1 ----------------- Linhas");
							System.out.println("2 ----------------- Variaveis Declaradas ");
							System.out.println("3 ----------------- Numero de Argumentos ");
							System.out.println("4 ----------------- Blocos Aninhados");
							System.out.println("5 ----------------- Cyclomatic Complexity");
							System.out.println("6 ----------------- Todas as Métricas");
							System.out.println("0 ----------------- Voltar");

 							opcao = teclado.readLine();
							int a;

							switch(opcao){
								case "1":
									for(String s : main.funcoesInst.keySet()){
										System.out.println("\n----> Funcao: "+s);
										a = linesOfCode(main.funcoesInst.get(s));
										met.setFuncoesLinhas(s,a);
										System.out.println("Numero de Linhas: "+a);
									}
									System.out.println("\nTotal de Linhas: "+met.getTotalLinhas());
								break;

								case "2":
									for(String s : main.funcoesInst.keySet()){
										System.out.println("\n----> Funcao: "+s);
										a = foundDecl(main.funcoesInst.get(s));
										met.setFuncoesDecl(s,a);
										System.out.println("Numero de Declaracoes: "+a);
									}
										System.out.println("\nTotal de Declaracoes: "+met.getTotalDecl());
								break;

								case "3":
									for(String s : main.funcoesInst.keySet()){
										System.out.println("\n----> Funcao: "+s);
										a = foundArgs(s,p);
										met.setFuncoesArgs(s,a);
										System.out.println("Numero de Argumentos: "+a);
									}
										System.out.println("\nTotal de Argumentos: "+met.getTotalArgs());
								break;

								case "4":
									for(String s : main.funcoesInst.keySet()){
										System.out.println("\n----> Funcao: "+s);
										a = foundNested(main.funcoesInst.get(s));
										met.setFuncoesNested(s,a);
										System.out.println("Maior Bloco Aninhado: "+a);
									}
								break;

								case "5":
									for(String s : main.funcoesInst.keySet()){
										System.out.println("\n----> Funcao: "+s);
										a = foundCC(main.funcoesInst.get(s))+1;
										met.setFuncoesCC(s,a);
										System.out.println("Cyclomatic Complexity: "+a);
									}
								break;

								case "6":
									for(String s : main.funcoesInst.keySet()){
										System.out.println("\n----> Funcao: "+s);
										a = linesOfCode(main.funcoesInst.get(s));
										met.setFuncoesLinhas(s,a);
										System.out.println("Numero de Linhas: "+a);

										a = foundDecl(main.funcoesInst.get(s));
										met.setFuncoesDecl(s,a);
										System.out.println("Numero de Declaracoes: "+a);

										a = foundArgs(s,p);
										met.setFuncoesArgs(s,a);
										System.out.println("Numero de Argumentos: "+a);

										a = foundNested(main.funcoesInst.get(s));
										met.setFuncoesNested(s,a);
										System.out.println("Maior Bloco Aninhado: "+a);

										a = foundCC(main.funcoesInst.get(s))+1;
										met.setFuncoesCC(s,a);
										System.out.println("Cyclomatic Complexity: "+a);
									}
									System.out.println("\n\nTotal de Linhas: "+met.getTotalLinhas());
									System.out.println("Total de Declaracoes: "+met.getTotalDecl());
									System.out.println("Total de Argumentos: "+met.getTotalArgs());
								break;
							}
						}
						catch(VisitFailure e) {
								System.out.println("the strategy failed");
						}
			 	break;

			 	default:
			 		 sair = true;
			 	break;
			 }
		}		
	}

	public Main() {
		actualFunctionName = "";
		functionSignatures = new HashMap<String, Argumentos>();
		callReturnNeeded = true;
		functionsDeclarations = new StringBuilder();
		memAdress = 0;
		funcoesInst = new HashMap<String, Instrucao>();
	}

    /*vai inserir numa hash as instruções de uma dada função*/
    public static class visitFuncoes extends tom.library.sl.AbstractStrategyBasic {private  java.util.HashMap  funcoes;public visitFuncoes( java.util.HashMap  funcoes) {super(tom_make_Identity());this.funcoes=funcoes;}public  java.util.HashMap  getfuncoes() {return funcoes;}public tom.library.sl.Visitable[] getChildren() {tom.library.sl.Visitable[] stratChilds = new tom.library.sl.Visitable[getChildCount()];stratChilds[0] = super.getChildAt(0);return stratChilds;}public tom.library.sl.Visitable setChildren(tom.library.sl.Visitable[] children) {super.setChildAt(0, children[0]);return this;}public int getChildCount() {return 1;}public tom.library.sl.Visitable getChildAt(int index) {switch (index) {case 0: return super.getChildAt(0);default: throw new IndexOutOfBoundsException();}}public tom.library.sl.Visitable setChildAt(int index, tom.library.sl.Visitable child) {switch (index) {case 0: return super.setChildAt(0, child);default: throw new IndexOutOfBoundsException();}}@SuppressWarnings("unchecked")public <T> T visitLight(T v, tom.library.sl.Introspector introspector) throws tom.library.sl.VisitFailure {if (tom_is_sort_Instrucao(v)) {return ((T)visit_Instrucao((( gram.i.types.Instrucao )v),introspector));}if (!(( null  == environment))) {return ((T)any.visit(environment,introspector));} else {return any.visitLight(v,introspector);}}@SuppressWarnings("unchecked")public  gram.i.types.Instrucao  _visit_Instrucao( gram.i.types.Instrucao  arg, tom.library.sl.Introspector introspector) throws tom.library.sl.VisitFailure {if (!(( null  == environment))) {return (( gram.i.types.Instrucao )any.visit(environment,introspector));} else {return any.visitLight(arg,introspector);}}@SuppressWarnings("unchecked")public  gram.i.types.Instrucao  visit_Instrucao( gram.i.types.Instrucao  tom__arg, tom.library.sl.Introspector introspector) throws tom.library.sl.VisitFailure {{{if (tom_is_sort_Instrucao(((Object)tom__arg))) {if (tom_is_sort_Instrucao((( gram.i.types.Instrucao )((Object)tom__arg)))) {if (tom_is_fun_sym_Funcao((( gram.i.types.Instrucao )(( gram.i.types.Instrucao )((Object)tom__arg))))) {


      	  		funcoes.put(tom_get_slot_Funcao_Nome((( gram.i.types.Instrucao )((Object)tom__arg))), tom_get_slot_Funcao_Instrucao((( gram.i.types.Instrucao )((Object)tom__arg))));
      	  }}}}}return _visit_Instrucao(tom__arg,introspector);}}private static  tom.library.sl.Strategy  tom_make_visitFuncoes( java.util.HashMap  t0) { return new visitFuncoes(t0);}



    /*vai contar o numero de vezes que cada instruçao aparece*/
    private static int linesOfCode(Instrucao i) {
    	int aux = 0;
		{{if (tom_is_sort_Instrucao(((Object)i))) {if (tom_is_sort_Instrucao((( gram.i.types.Instrucao )((Object)i)))) {if (tom_is_fun_sym_Atribuicao((( gram.i.types.Instrucao )(( gram.i.types.Instrucao )((Object)i))))) {
 return 1;}}}}{if (tom_is_sort_Instrucao(((Object)i))) {if (tom_is_sort_Instrucao((( gram.i.types.Instrucao )((Object)i)))) {if (tom_is_fun_sym_Declaracao((( gram.i.types.Instrucao )(( gram.i.types.Instrucao )((Object)i))))) {
 return 1;}}}}{if (tom_is_sort_Instrucao(((Object)i))) {if (tom_is_sort_Instrucao((( gram.i.types.Instrucao )((Object)i)))) {if (tom_is_fun_sym_If((( gram.i.types.Instrucao )(( gram.i.types.Instrucao )((Object)i))))) { gram.i.types.Instrucao  tom_inst2=tom_get_slot_If_Instrucao2((( gram.i.types.Instrucao )((Object)i)));
 if(linesOfCode(tom_inst2)>0) aux=2; return (linesOfCode(tom_get_slot_If_Instrucao1((( gram.i.types.Instrucao )((Object)i))))+2)+(linesOfCode(tom_inst2)+aux);}}}}{if (tom_is_sort_Instrucao(((Object)i))) {if (tom_is_sort_Instrucao((( gram.i.types.Instrucao )((Object)i)))) {if (tom_is_fun_sym_While((( gram.i.types.Instrucao )(( gram.i.types.Instrucao )((Object)i))))) {
 return linesOfCode(tom_get_slot_While_Instrucao((( gram.i.types.Instrucao )((Object)i))))+2;}}}}{if (tom_is_sort_Instrucao(((Object)i))) {if (tom_is_sort_Instrucao((( gram.i.types.Instrucao )((Object)i)))) {if (tom_is_fun_sym_For((( gram.i.types.Instrucao )(( gram.i.types.Instrucao )((Object)i))))) {
 return linesOfCode(tom_get_slot_For_Instrucao((( gram.i.types.Instrucao )((Object)i))))+2;}}}}{if (tom_is_sort_Instrucao(((Object)i))) {if (tom_is_sort_Instrucao((( gram.i.types.Instrucao )((Object)i)))) {if (tom_is_fun_sym_Return((( gram.i.types.Instrucao )(( gram.i.types.Instrucao )((Object)i))))) {
 return 1;}}}}{if (tom_is_sort_Instrucao(((Object)i))) {if (tom_is_sort_Instrucao((( gram.i.types.Instrucao )((Object)i)))) {if (tom_is_fun_sym_Funcao((( gram.i.types.Instrucao )(( gram.i.types.Instrucao )((Object)i))))) {
 return linesOfCode(tom_get_slot_Funcao_Instrucao((( gram.i.types.Instrucao )((Object)i))));}}}}{if (tom_is_sort_Instrucao(((Object)i))) {if (tom_is_sort_Instrucao((( gram.i.types.Instrucao )((Object)i)))) {if (tom_is_fun_sym_Exp((( gram.i.types.Instrucao )(( gram.i.types.Instrucao )((Object)i))))) {
 return 1;}}}}{if (tom_is_sort_Instrucao(((Object)i))) {if (tom_is_fun_sym_SeqInstrucao((( gram.i.types.Instrucao )(( gram.i.types.Instrucao )((Object)i))))) {if (!( ( tom_is_empty_SeqInstrucao_Instrucao((( gram.i.types.Instrucao )((Object)i))) || tom_equal_term_Instrucao((( gram.i.types.Instrucao )((Object)i)), tom_empty_list_SeqInstrucao()) ) )) {
 return linesOfCode(((tom_is_fun_sym_SeqInstrucao((( gram.i.types.Instrucao )((Object)i))))?(tom_get_head_SeqInstrucao_Instrucao((( gram.i.types.Instrucao )((Object)i)))):((( gram.i.types.Instrucao )((Object)i)))))+linesOfCode(((tom_is_fun_sym_SeqInstrucao((( gram.i.types.Instrucao )((Object)i))))?(tom_get_tail_SeqInstrucao_Instrucao((( gram.i.types.Instrucao )((Object)i)))):(tom_empty_list_SeqInstrucao())));}}}}}

		return aux;
	}

	/*vai contar o numero de declarações*/
	private static int foundDecl(Instrucao i) {
		{{if (tom_is_sort_Instrucao(((Object)i))) {if (tom_is_sort_Instrucao((( gram.i.types.Instrucao )((Object)i)))) {if (tom_is_fun_sym_Declaracao((( gram.i.types.Instrucao )(( gram.i.types.Instrucao )((Object)i))))) {
 return 1; }}}}{if (tom_is_sort_Instrucao(((Object)i))) {if (tom_is_fun_sym_SeqInstrucao((( gram.i.types.Instrucao )(( gram.i.types.Instrucao )((Object)i))))) {if (!( ( tom_is_empty_SeqInstrucao_Instrucao((( gram.i.types.Instrucao )((Object)i))) || tom_equal_term_Instrucao((( gram.i.types.Instrucao )((Object)i)), tom_empty_list_SeqInstrucao()) ) )) {
 return foundDecl(((tom_is_fun_sym_SeqInstrucao((( gram.i.types.Instrucao )((Object)i))))?(tom_get_head_SeqInstrucao_Instrucao((( gram.i.types.Instrucao )((Object)i)))):((( gram.i.types.Instrucao )((Object)i)))))+foundDecl(((tom_is_fun_sym_SeqInstrucao((( gram.i.types.Instrucao )((Object)i))))?(tom_get_tail_SeqInstrucao_Instrucao((( gram.i.types.Instrucao )((Object)i)))):(tom_empty_list_SeqInstrucao())));}}}}}

		return 0;
	}

	/*vai contar o numero de argumentos por função*/
	private static int foundArgs(String funcao, Instrucao i) {
		{{if (tom_is_sort_Instrucao(((Object)i))) {if (tom_is_sort_Instrucao((( gram.i.types.Instrucao )((Object)i)))) {if (tom_is_fun_sym_Funcao((( gram.i.types.Instrucao )(( gram.i.types.Instrucao )((Object)i))))) {
 if(funcao.equals(tom_get_slot_Funcao_Nome((( gram.i.types.Instrucao )((Object)i))))) return foundListArgs(tom_get_slot_Funcao_Argumentos((( gram.i.types.Instrucao )((Object)i)))); }}}}{if (tom_is_sort_Instrucao(((Object)i))) {if (tom_is_fun_sym_SeqInstrucao((( gram.i.types.Instrucao )(( gram.i.types.Instrucao )((Object)i))))) {if (!( ( tom_is_empty_SeqInstrucao_Instrucao((( gram.i.types.Instrucao )((Object)i))) || tom_equal_term_Instrucao((( gram.i.types.Instrucao )((Object)i)), tom_empty_list_SeqInstrucao()) ) )) {
 return foundArgs(funcao, ((tom_is_fun_sym_SeqInstrucao((( gram.i.types.Instrucao )((Object)i))))?(tom_get_head_SeqInstrucao_Instrucao((( gram.i.types.Instrucao )((Object)i)))):((( gram.i.types.Instrucao )((Object)i)))))+foundArgs(funcao, ((tom_is_fun_sym_SeqInstrucao((( gram.i.types.Instrucao )((Object)i))))?(tom_get_tail_SeqInstrucao_Instrucao((( gram.i.types.Instrucao )((Object)i)))):(tom_empty_list_SeqInstrucao())));}}}}}

		return 0;
	}

	/*vai contar o numero de argumentos de uma dada lista de argumentos*/
	private static int foundListArgs(Argumentos args) {
		{{if (tom_is_sort_Argumentos(((Object)args))) {if (tom_is_fun_sym_ListaArgumentos((( gram.i.types.Argumentos )(( gram.i.types.Argumentos )((Object)args))))) {if (!( ( tom_is_empty_ListaArgumentos_Argumentos((( gram.i.types.Argumentos )((Object)args))) || tom_equal_term_Argumentos((( gram.i.types.Argumentos )((Object)args)), tom_empty_list_ListaArgumentos()) ) )) {
 return foundListArgs(((tom_is_fun_sym_ListaArgumentos((( gram.i.types.Argumentos )((Object)args))))?(tom_get_head_ListaArgumentos_Argumentos((( gram.i.types.Argumentos )((Object)args)))):((( gram.i.types.Argumentos )((Object)args)))))+foundListArgs(((tom_is_fun_sym_ListaArgumentos((( gram.i.types.Argumentos )((Object)args))))?(tom_get_tail_ListaArgumentos_Argumentos((( gram.i.types.Argumentos )((Object)args)))):(tom_empty_list_ListaArgumentos()))); }}}}{if (tom_is_sort_Argumentos(((Object)args))) {if (tom_is_sort_Argumentos((( gram.i.types.Argumentos )((Object)args)))) {if (tom_is_fun_sym_Argumento((( gram.i.types.Argumentos )(( gram.i.types.Argumentos )((Object)args))))) {
 return 1; }}}}}

		return 0;
	}

	/*vai encontrar o máximo de blocos aninhados de uma dada função*/
	private static int foundNested(Instrucao i) {
		{{if (tom_is_sort_Instrucao(((Object)i))) {if (tom_is_sort_Instrucao((( gram.i.types.Instrucao )((Object)i)))) {if (tom_is_fun_sym_If((( gram.i.types.Instrucao )(( gram.i.types.Instrucao )((Object)i))))) {
 return 1+max(foundNested(tom_get_slot_If_Instrucao1((( gram.i.types.Instrucao )((Object)i)))),foundNested(tom_get_slot_If_Instrucao2((( gram.i.types.Instrucao )((Object)i)))));}}}}{if (tom_is_sort_Instrucao(((Object)i))) {if (tom_is_sort_Instrucao((( gram.i.types.Instrucao )((Object)i)))) {if (tom_is_fun_sym_While((( gram.i.types.Instrucao )(( gram.i.types.Instrucao )((Object)i))))) {
 return foundNested(tom_get_slot_While_Instrucao((( gram.i.types.Instrucao )((Object)i))))+1;}}}}{if (tom_is_sort_Instrucao(((Object)i))) {if (tom_is_sort_Instrucao((( gram.i.types.Instrucao )((Object)i)))) {if (tom_is_fun_sym_For((( gram.i.types.Instrucao )(( gram.i.types.Instrucao )((Object)i))))) {
 return foundNested(tom_get_slot_For_Instrucao((( gram.i.types.Instrucao )((Object)i))))+1;}}}}{if (tom_is_sort_Instrucao(((Object)i))) {if (tom_is_fun_sym_SeqInstrucao((( gram.i.types.Instrucao )(( gram.i.types.Instrucao )((Object)i))))) {if (!( ( tom_is_empty_SeqInstrucao_Instrucao((( gram.i.types.Instrucao )((Object)i))) || tom_equal_term_Instrucao((( gram.i.types.Instrucao )((Object)i)), tom_empty_list_SeqInstrucao()) ) )) {
 return max(foundNested(((tom_is_fun_sym_SeqInstrucao((( gram.i.types.Instrucao )((Object)i))))?(tom_get_head_SeqInstrucao_Instrucao((( gram.i.types.Instrucao )((Object)i)))):((( gram.i.types.Instrucao )((Object)i))))),foundNested(((tom_is_fun_sym_SeqInstrucao((( gram.i.types.Instrucao )((Object)i))))?(tom_get_tail_SeqInstrucao_Instrucao((( gram.i.types.Instrucao )((Object)i)))):(tom_empty_list_SeqInstrucao()))));}}}}}

		return 0;
	}

	/*vai calcuar o cyclometic complexity com a formula D+1 (D = pontos de decisão)*/
	private static int foundCC(Instrucao i) {
		{{if (tom_is_sort_Instrucao(((Object)i))) {if (tom_is_sort_Instrucao((( gram.i.types.Instrucao )((Object)i)))) {if (tom_is_fun_sym_If((( gram.i.types.Instrucao )(( gram.i.types.Instrucao )((Object)i))))) {
 return 1+foundCC(tom_get_slot_If_Instrucao1((( gram.i.types.Instrucao )((Object)i))))+foundCC(tom_get_slot_If_Instrucao2((( gram.i.types.Instrucao )((Object)i))))+foundBoolean(tom_get_slot_If_Condicao((( gram.i.types.Instrucao )((Object)i))));}}}}{if (tom_is_sort_Instrucao(((Object)i))) {if (tom_is_sort_Instrucao((( gram.i.types.Instrucao )((Object)i)))) {if (tom_is_fun_sym_While((( gram.i.types.Instrucao )(( gram.i.types.Instrucao )((Object)i))))) {
 return 1+foundCC(tom_get_slot_While_Instrucao((( gram.i.types.Instrucao )((Object)i))))+foundBoolean(tom_get_slot_While_Condicao((( gram.i.types.Instrucao )((Object)i))));}}}}{if (tom_is_sort_Instrucao(((Object)i))) {if (tom_is_sort_Instrucao((( gram.i.types.Instrucao )((Object)i)))) {if (tom_is_fun_sym_For((( gram.i.types.Instrucao )(( gram.i.types.Instrucao )((Object)i))))) {
 return 1+foundCC(tom_get_slot_For_Instrucao((( gram.i.types.Instrucao )((Object)i))))+foundBoolean(tom_get_slot_For_Condicao((( gram.i.types.Instrucao )((Object)i))));}}}}{if (tom_is_sort_Instrucao(((Object)i))) {if (tom_is_fun_sym_SeqInstrucao((( gram.i.types.Instrucao )(( gram.i.types.Instrucao )((Object)i))))) {if (!( ( tom_is_empty_SeqInstrucao_Instrucao((( gram.i.types.Instrucao )((Object)i))) || tom_equal_term_Instrucao((( gram.i.types.Instrucao )((Object)i)), tom_empty_list_SeqInstrucao()) ) )) {
 return foundCC(((tom_is_fun_sym_SeqInstrucao((( gram.i.types.Instrucao )((Object)i))))?(tom_get_head_SeqInstrucao_Instrucao((( gram.i.types.Instrucao )((Object)i)))):((( gram.i.types.Instrucao )((Object)i)))))+foundCC(((tom_is_fun_sym_SeqInstrucao((( gram.i.types.Instrucao )((Object)i))))?(tom_get_tail_SeqInstrucao_Instrucao((( gram.i.types.Instrucao )((Object)i)))):(tom_empty_list_SeqInstrucao())));}}}}}

		return 0;
	}

	/* Numero de operações booleanas nas operaçoes de condição (auxiliar para o CC) */
	private static int foundBoolean(Expressao e) {
		{{if (tom_is_sort_Expressao(((Object)e))) {if (tom_is_sort_Expressao((( gram.i.types.Expressao )((Object)e)))) {if (tom_is_fun_sym_E((( gram.i.types.Expressao )(( gram.i.types.Expressao )((Object)e))))) {
 return 1+foundBoolean(tom_get_slot_E_Cond1((( gram.i.types.Expressao )((Object)e))))+foundBoolean(tom_get_slot_E_Cond2((( gram.i.types.Expressao )((Object)e))));}}}}{if (tom_is_sort_Expressao(((Object)e))) {if (tom_is_sort_Expressao((( gram.i.types.Expressao )((Object)e)))) {if (tom_is_fun_sym_Ou((( gram.i.types.Expressao )(( gram.i.types.Expressao )((Object)e))))) {
 return 1+foundBoolean(tom_get_slot_Ou_Cond1((( gram.i.types.Expressao )((Object)e))))+foundBoolean(tom_get_slot_Ou_Cond2((( gram.i.types.Expressao )((Object)e))));}}}}}

		return 0;
	}

	private static int max(int a, int b){
		if(a>b)
			return a;
		else
			return b;
	}
	
}

class NumToInt{
	private int num;

	public NumToInt(int num) {
		this.num = num;
	}

	public NumToInt(){
		num = 0;
	}

	public int inc(){
		return num++;
	}
	
	public int get() {
		return num;
	}
}

class Metrica{
	private int funcoes;
	private HashMap<String, Integer> funcoesLinhas;
	private HashMap<String, Integer> funcoesDecl;
	private HashMap<String, Integer> funcoesArgs;
	private HashMap<String, Integer> funcoesNested;
	private HashMap<String, Integer> funcoesCC;


	public Metrica() {
		this.funcoes = 0;
		this.funcoesLinhas = new HashMap<String, Integer>();
		this.funcoesDecl = new HashMap<String, Integer>();
		this.funcoesArgs = new HashMap<String, Integer>();
		this.funcoesNested = new HashMap<String, Integer>();
		this.funcoesCC = new HashMap<String, Integer>();
	}

	public HashMap <String, Integer> getFuncoesLinhas(){
		return this.funcoesLinhas;
	}

	public HashMap <String, Integer> getFuncoesDecl(){
		return this.funcoesDecl;
	}

	public HashMap <String, Integer> getFuncoesArgs(){
		return this.funcoesArgs;
	}

	public HashMap <String, Integer> getFuncoesNested(){
		return this.funcoesNested;
	}

	public HashMap <String, Integer> getFuncoesCC(){
		return this.funcoesCC;
	}

	public int getTotalLinhas(){
		int aux = 0;
		
		for(String s : this.funcoesLinhas.keySet()){
		  	aux+=this.funcoesLinhas.get(s);
		  	aux+=2;
		}

		return aux;
	}

	public int getTotalArgs(){
		int aux = 0;
		
		for(String s : this.funcoesArgs.keySet()){
		  	aux+=this.funcoesArgs.get(s);
		}

		return aux;
	}

	public int getTotalDecl(){
		int aux = 0;
		
		for(String s : this.funcoesDecl.keySet()){
		  	aux+=this.funcoesDecl.get(s);
		}

		return aux;
	}

	public void setFuncoesLinhas(String s, Integer i){
		this.funcoesLinhas.put(s,i);
	}

	public void setFuncoesDecl(String s, Integer i){
		this.funcoesDecl.put(s,i);
	}

	public void setFuncoesArgs(String s, Integer i){
		this.funcoesArgs.put(s,i);
	}

	public void setFuncoesNested(String s, Integer i){
		this.funcoesNested.put(s,i);
	}

	public void setFuncoesCC(String s, Integer i){
		this.funcoesCC.put(s,i);
	}
}
