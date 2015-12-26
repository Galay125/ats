package maqv;
 
import maqv.msp.mspAdaptor;
import maqv.msp.types.*;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.tree.Tree;
import tom.library.utils.Viewer;
import tom.library.sl.*;
import java.util.*;
import java.lang.*;
import java.io.*;


public class Main {
	private static boolean tom_equal_term_Strategy(Object t1, Object t2) {return  (t1.equals(t2)) ;}private static boolean tom_is_sort_Strategy(Object t) {return  (t instanceof tom.library.sl.Strategy) ;} private static boolean tom_equal_term_Position(Object t1, Object t2) {return  (t1.equals(t2)) ;}private static boolean tom_is_sort_Position(Object t) {return  (t instanceof tom.library.sl.Position) ;} private static boolean tom_equal_term_int(int t1, int t2) {return  t1==t2 ;}private static boolean tom_is_sort_int(int t) {return  true ;} private static boolean tom_equal_term_char(char t1, char t2) {return  t1==t2 ;}private static boolean tom_is_sort_char(char t) {return  true ;} private static boolean tom_equal_term_String(String t1, String t2) {return  t1.equals(t2) ;}private static boolean tom_is_sort_String(String t) {return  t instanceof String ;} private static  tom.library.sl.Strategy  tom_make_mu( tom.library.sl.Strategy  var,  tom.library.sl.Strategy  v) { return ( new tom.library.sl.Mu(var,v) );}private static  tom.library.sl.Strategy  tom_make_MuVar( String  name) { return ( new tom.library.sl.MuVar(name) );}private static  tom.library.sl.Strategy  tom_make_Identity() { return ( new tom.library.sl.Identity() );}private static  tom.library.sl.Strategy  tom_make_One( tom.library.sl.Strategy  v) { return ( new tom.library.sl.One(v) );}private static  tom.library.sl.Strategy  tom_make_All( tom.library.sl.Strategy  v) { return ( new tom.library.sl.All(v) );}private static  tom.library.sl.Strategy  tom_make_Fail() { return ( new tom.library.sl.Fail() );}private static boolean tom_is_fun_sym_Sequence( tom.library.sl.Strategy  t) {return ( t instanceof tom.library.sl.Sequence );}private static  tom.library.sl.Strategy  tom_empty_list_Sequence() { return  null ;}private static  tom.library.sl.Strategy  tom_cons_list_Sequence( tom.library.sl.Strategy  head,  tom.library.sl.Strategy  tail) { return  tom.library.sl.Sequence.make(head,tail) ;}private static  tom.library.sl.Strategy  tom_get_head_Sequence_Strategy( tom.library.sl.Strategy  t) {return ( (tom.library.sl.Strategy)t.getChildAt(tom.library.sl.Sequence.FIRST) );}private static  tom.library.sl.Strategy  tom_get_tail_Sequence_Strategy( tom.library.sl.Strategy  t) {return ( (tom.library.sl.Strategy)t.getChildAt(tom.library.sl.Sequence.THEN) );}private static boolean tom_is_empty_Sequence_Strategy( tom.library.sl.Strategy  t) {return ( t == null );}   private static   tom.library.sl.Strategy  tom_append_list_Sequence( tom.library.sl.Strategy  l1,  tom.library.sl.Strategy  l2) {     if(( l1 == null )) {       return l2;     } else if(( l2 == null )) {       return l1;     } else if(( l1 instanceof tom.library.sl.Sequence )) {       if(( ( (tom.library.sl.Strategy)l1.getChildAt(tom.library.sl.Sequence.THEN) ) == null )) {         return  tom.library.sl.Sequence.make(( (tom.library.sl.Strategy)l1.getChildAt(tom.library.sl.Sequence.FIRST) ),l2) ;       } else {         return  tom.library.sl.Sequence.make(( (tom.library.sl.Strategy)l1.getChildAt(tom.library.sl.Sequence.FIRST) ),tom_append_list_Sequence(( (tom.library.sl.Strategy)l1.getChildAt(tom.library.sl.Sequence.THEN) ),l2)) ;       }     } else {       return  tom.library.sl.Sequence.make(l1,l2) ;     }   }   private static   tom.library.sl.Strategy  tom_get_slice_Sequence( tom.library.sl.Strategy  begin,  tom.library.sl.Strategy  end, tom.library.sl.Strategy  tail) {     if( (begin.equals(end)) ) {       return tail;     } else if( (end.equals(tail))  && (( end == null ) ||  (end.equals(tom_empty_list_Sequence())) )) {       /* code to avoid a call to make, and thus to avoid looping during list-matching */       return begin;     }     return  tom.library.sl.Sequence.make(((( begin instanceof tom.library.sl.Sequence ))?( (tom.library.sl.Strategy)begin.getChildAt(tom.library.sl.Sequence.FIRST) ):begin),( tom.library.sl.Strategy )tom_get_slice_Sequence(((( begin instanceof tom.library.sl.Sequence ))?( (tom.library.sl.Strategy)begin.getChildAt(tom.library.sl.Sequence.THEN) ):tom_empty_list_Sequence()),end,tail)) ;   }   private static boolean tom_is_fun_sym_Choice( tom.library.sl.Strategy  t) {return ( t instanceof tom.library.sl.Choice );}private static  tom.library.sl.Strategy  tom_empty_list_Choice() { return  null ;}private static  tom.library.sl.Strategy  tom_cons_list_Choice( tom.library.sl.Strategy  head,  tom.library.sl.Strategy  tail) { return  tom.library.sl.Choice.make(head,tail) ;}private static  tom.library.sl.Strategy  tom_get_head_Choice_Strategy( tom.library.sl.Strategy  t) {return ( (tom.library.sl.Strategy)t.getChildAt(tom.library.sl.Choice.FIRST) );}private static  tom.library.sl.Strategy  tom_get_tail_Choice_Strategy( tom.library.sl.Strategy  t) {return ( (tom.library.sl.Strategy)t.getChildAt(tom.library.sl.Choice.THEN) );}private static boolean tom_is_empty_Choice_Strategy( tom.library.sl.Strategy  t) {return ( t ==null );}   private static   tom.library.sl.Strategy  tom_append_list_Choice( tom.library.sl.Strategy  l1,  tom.library.sl.Strategy  l2) {     if(( l1 ==null )) {       return l2;     } else if(( l2 ==null )) {       return l1;     } else if(( l1 instanceof tom.library.sl.Choice )) {       if(( ( (tom.library.sl.Strategy)l1.getChildAt(tom.library.sl.Choice.THEN) ) ==null )) {         return  tom.library.sl.Choice.make(( (tom.library.sl.Strategy)l1.getChildAt(tom.library.sl.Choice.FIRST) ),l2) ;       } else {         return  tom.library.sl.Choice.make(( (tom.library.sl.Strategy)l1.getChildAt(tom.library.sl.Choice.FIRST) ),tom_append_list_Choice(( (tom.library.sl.Strategy)l1.getChildAt(tom.library.sl.Choice.THEN) ),l2)) ;       }     } else {       return  tom.library.sl.Choice.make(l1,l2) ;     }   }   private static   tom.library.sl.Strategy  tom_get_slice_Choice( tom.library.sl.Strategy  begin,  tom.library.sl.Strategy  end, tom.library.sl.Strategy  tail) {     if( (begin.equals(end)) ) {       return tail;     } else if( (end.equals(tail))  && (( end ==null ) ||  (end.equals(tom_empty_list_Choice())) )) {       /* code to avoid a call to make, and thus to avoid looping during list-matching */       return begin;     }     return  tom.library.sl.Choice.make(((( begin instanceof tom.library.sl.Choice ))?( (tom.library.sl.Strategy)begin.getChildAt(tom.library.sl.Choice.FIRST) ):begin),( tom.library.sl.Strategy )tom_get_slice_Choice(((( begin instanceof tom.library.sl.Choice ))?( (tom.library.sl.Strategy)begin.getChildAt(tom.library.sl.Choice.THEN) ):tom_empty_list_Choice()),end,tail)) ;   }   private static boolean tom_is_fun_sym_SequenceId( tom.library.sl.Strategy  t) {return ( t instanceof tom.library.sl.SequenceId );}private static  tom.library.sl.Strategy  tom_empty_list_SequenceId() { return  null ;}private static  tom.library.sl.Strategy  tom_cons_list_SequenceId( tom.library.sl.Strategy  head,  tom.library.sl.Strategy  tail) { return  tom.library.sl.SequenceId.make(head,tail) ;}private static  tom.library.sl.Strategy  tom_get_head_SequenceId_Strategy( tom.library.sl.Strategy  t) {return ( (tom.library.sl.Strategy)t.getChildAt(tom.library.sl.SequenceId.FIRST) );}private static  tom.library.sl.Strategy  tom_get_tail_SequenceId_Strategy( tom.library.sl.Strategy  t) {return ( (tom.library.sl.Strategy)t.getChildAt(tom.library.sl.SequenceId.THEN) );}private static boolean tom_is_empty_SequenceId_Strategy( tom.library.sl.Strategy  t) {return ( t == null );}   private static   tom.library.sl.Strategy  tom_append_list_SequenceId( tom.library.sl.Strategy  l1,  tom.library.sl.Strategy  l2) {     if(( l1 == null )) {       return l2;     } else if(( l2 == null )) {       return l1;     } else if(( l1 instanceof tom.library.sl.SequenceId )) {       if(( ( (tom.library.sl.Strategy)l1.getChildAt(tom.library.sl.SequenceId.THEN) ) == null )) {         return  tom.library.sl.SequenceId.make(( (tom.library.sl.Strategy)l1.getChildAt(tom.library.sl.SequenceId.FIRST) ),l2) ;       } else {         return  tom.library.sl.SequenceId.make(( (tom.library.sl.Strategy)l1.getChildAt(tom.library.sl.SequenceId.FIRST) ),tom_append_list_SequenceId(( (tom.library.sl.Strategy)l1.getChildAt(tom.library.sl.SequenceId.THEN) ),l2)) ;       }     } else {       return  tom.library.sl.SequenceId.make(l1,l2) ;     }   }   private static   tom.library.sl.Strategy  tom_get_slice_SequenceId( tom.library.sl.Strategy  begin,  tom.library.sl.Strategy  end, tom.library.sl.Strategy  tail) {     if( (begin.equals(end)) ) {       return tail;     } else if( (end.equals(tail))  && (( end == null ) ||  (end.equals(tom_empty_list_SequenceId())) )) {       /* code to avoid a call to make, and thus to avoid looping during list-matching */       return begin;     }     return  tom.library.sl.SequenceId.make(((( begin instanceof tom.library.sl.SequenceId ))?( (tom.library.sl.Strategy)begin.getChildAt(tom.library.sl.SequenceId.FIRST) ):begin),( tom.library.sl.Strategy )tom_get_slice_SequenceId(((( begin instanceof tom.library.sl.SequenceId ))?( (tom.library.sl.Strategy)begin.getChildAt(tom.library.sl.SequenceId.THEN) ):tom_empty_list_SequenceId()),end,tail)) ;   }   private static boolean tom_is_fun_sym_ChoiceId( tom.library.sl.Strategy  t) {return ( t instanceof tom.library.sl.ChoiceId );}private static  tom.library.sl.Strategy  tom_empty_list_ChoiceId() { return  null ;}private static  tom.library.sl.Strategy  tom_cons_list_ChoiceId( tom.library.sl.Strategy  head,  tom.library.sl.Strategy  tail) { return  tom.library.sl.ChoiceId.make(head,tail) ;}private static  tom.library.sl.Strategy  tom_get_head_ChoiceId_Strategy( tom.library.sl.Strategy  t) {return ( (tom.library.sl.Strategy)t.getChildAt(tom.library.sl.ChoiceId.FIRST) );}private static  tom.library.sl.Strategy  tom_get_tail_ChoiceId_Strategy( tom.library.sl.Strategy  t) {return ( (tom.library.sl.Strategy)t.getChildAt(tom.library.sl.ChoiceId.THEN) );}private static boolean tom_is_empty_ChoiceId_Strategy( tom.library.sl.Strategy  t) {return ( t ==null );}   private static   tom.library.sl.Strategy  tom_append_list_ChoiceId( tom.library.sl.Strategy  l1,  tom.library.sl.Strategy  l2) {     if(( l1 ==null )) {       return l2;     } else if(( l2 ==null )) {       return l1;     } else if(( l1 instanceof tom.library.sl.ChoiceId )) {       if(( ( (tom.library.sl.Strategy)l1.getChildAt(tom.library.sl.ChoiceId.THEN) ) ==null )) {         return  tom.library.sl.ChoiceId.make(( (tom.library.sl.Strategy)l1.getChildAt(tom.library.sl.ChoiceId.FIRST) ),l2) ;       } else {         return  tom.library.sl.ChoiceId.make(( (tom.library.sl.Strategy)l1.getChildAt(tom.library.sl.ChoiceId.FIRST) ),tom_append_list_ChoiceId(( (tom.library.sl.Strategy)l1.getChildAt(tom.library.sl.ChoiceId.THEN) ),l2)) ;       }     } else {       return  tom.library.sl.ChoiceId.make(l1,l2) ;     }   }   private static   tom.library.sl.Strategy  tom_get_slice_ChoiceId( tom.library.sl.Strategy  begin,  tom.library.sl.Strategy  end, tom.library.sl.Strategy  tail) {     if( (begin.equals(end)) ) {       return tail;     } else if( (end.equals(tail))  && (( end ==null ) ||  (end.equals(tom_empty_list_ChoiceId())) )) {       /* code to avoid a call to make, and thus to avoid looping during list-matching */       return begin;     }     return  tom.library.sl.ChoiceId.make(((( begin instanceof tom.library.sl.ChoiceId ))?( (tom.library.sl.Strategy)begin.getChildAt(tom.library.sl.ChoiceId.FIRST) ):begin),( tom.library.sl.Strategy )tom_get_slice_ChoiceId(((( begin instanceof tom.library.sl.ChoiceId ))?( (tom.library.sl.Strategy)begin.getChildAt(tom.library.sl.ChoiceId.THEN) ):tom_empty_list_ChoiceId()),end,tail)) ;   }   private static  tom.library.sl.Strategy  tom_make_OneId( tom.library.sl.Strategy  v) { return ( new tom.library.sl.OneId(v) );}   private static  tom.library.sl.Strategy  tom_make_AllSeq( tom.library.sl.Strategy  s) { return ( new tom.library.sl.AllSeq(s) );}private static  tom.library.sl.Strategy  tom_make_AUCtl( tom.library.sl.Strategy  s1,  tom.library.sl.Strategy  s2) { return ( tom_make_mu(tom_make_MuVar("x"),tom_cons_list_Choice(s2,tom_cons_list_Choice(tom_cons_list_Sequence(tom_cons_list_Sequence(s1,tom_cons_list_Sequence(tom_make_All(tom_make_MuVar("x")),tom_empty_list_Sequence())),tom_cons_list_Sequence(tom_make_One(tom_make_Identity()),tom_empty_list_Sequence())),tom_empty_list_Choice()))) );}private static  tom.library.sl.Strategy  tom_make_EUCtl( tom.library.sl.Strategy  s1,  tom.library.sl.Strategy  s2) { return ( tom_make_mu(tom_make_MuVar("x"),tom_cons_list_Choice(s2,tom_cons_list_Choice(tom_cons_list_Sequence(s1,tom_cons_list_Sequence(tom_make_One(tom_make_MuVar("x")),tom_empty_list_Sequence())),tom_empty_list_Choice()))));} private static  tom.library.sl.Strategy  tom_make_Try( tom.library.sl.Strategy  s) { return ( tom_cons_list_Choice(s,tom_cons_list_Choice(tom_make_Identity(),tom_empty_list_Choice())) );}private static  tom.library.sl.Strategy  tom_make_Repeat( tom.library.sl.Strategy  s) { return ( tom_make_mu(tom_make_MuVar("_x"),tom_cons_list_Choice(tom_cons_list_Sequence(s,tom_cons_list_Sequence(tom_make_MuVar("_x"),tom_empty_list_Sequence())),tom_cons_list_Choice(tom_make_Identity(),tom_empty_list_Choice()))) );}private static  tom.library.sl.Strategy  tom_make_TopDown( tom.library.sl.Strategy  v) { return ( tom_make_mu(tom_make_MuVar("_x"),tom_cons_list_Sequence(v,tom_cons_list_Sequence(tom_make_All(tom_make_MuVar("_x")),tom_empty_list_Sequence()))) );}private static  tom.library.sl.Strategy  tom_make_OnceTopDown( tom.library.sl.Strategy  v) { return ( tom_make_mu(tom_make_MuVar("_x"),tom_cons_list_Choice(v,tom_cons_list_Choice(tom_make_One(tom_make_MuVar("_x")),tom_empty_list_Choice()))) );}private static  tom.library.sl.Strategy  tom_make_RepeatId( tom.library.sl.Strategy  v) { return ( tom_make_mu(tom_make_MuVar("_x"),tom_cons_list_SequenceId(v,tom_cons_list_SequenceId(tom_make_MuVar("_x"),tom_empty_list_SequenceId()))) );}private static  tom.library.sl.Strategy  tom_make_OnceTopDownId( tom.library.sl.Strategy  v) { return ( tom_make_mu(tom_make_MuVar("_x"),tom_cons_list_ChoiceId(v,tom_cons_list_ChoiceId(tom_make_OneId(tom_make_MuVar("_x")),tom_empty_list_ChoiceId()))) );}      static class MapEntry {   private Object key;   private Object val;   public Object getKey() { return key; }   public Object getVal() { return val; }   public MapEntry(Object key, Object val) {     this.key = key;     this.val = val;   } }  private static boolean tom_equal_term_MapEntry(Object e1, Object e2) {return  e1.equals(e2) ;}private static boolean tom_is_sort_MapEntry(Object t) {return  t instanceof MapEntry ;}private static boolean tom_equal_term_Object(Object o1, Object o2) {return  o1.equals(o2) ;}private static boolean tom_is_sort_Object(Object t) {return  t instanceof Object ;}  private static boolean tom_equal_term_HashMap(Object l1, Object l2) {return  l1.equals(l2) ;}private static boolean tom_is_sort_HashMap(Object t) {return  t instanceof java.util.HashMap ;}   @SuppressWarnings("unchecked") private static java.util.HashMap hashMapAppend(MapEntry e, java.util.HashMap m) {   java.util.HashMap res = (java.util.HashMap) m.clone();   res.put(e.getKey(), e.getVal());   return res; }  @SuppressWarnings("unchecked") private static MapEntry hashMapGetHead(java.util.HashMap m) {   java.util.Set es = m.entrySet();   java.util.Iterator it = es.iterator();   java.util.Map.Entry e = (java.util.Map.Entry) it.next();   return new MapEntry(e.getKey(), e.getValue()); }  @SuppressWarnings("unchecked") private static java.util.HashMap hashMapGetTail(java.util.HashMap m) {   java.util.HashMap res = (java.util.HashMap) m.clone();   java.util.Set es = m.entrySet();   java.util.Iterator it = es.iterator();   java.util.Map.Entry e = (java.util.Map.Entry) it.next();   res.remove(e.getKey());   return res; }   private static boolean tom_equal_term_Collection(Object l1, Object l2) {return  l1.equals(l2) ;}private static boolean tom_is_sort_Collection(Object t) {return  t instanceof java.util.Collection ;} private static boolean tom_equal_term_Stackk(Object t1, Object t2) {return  (t1==t2) ;}private static boolean tom_is_sort_Stackk(Object t) {return  (t instanceof maqv.msp.types.Stackk) ;}private static boolean tom_equal_term_Termo(Object t1, Object t2) {return  (t1==t2) ;}private static boolean tom_is_sort_Termo(Object t) {return  (t instanceof maqv.msp.types.Termo) ;}private static boolean tom_equal_term_DefTipo(Object t1, Object t2) {return  (t1==t2) ;}private static boolean tom_is_sort_DefTipo(Object t) {return  (t instanceof maqv.msp.types.DefTipo) ;}private static boolean tom_equal_term_Boool(Object t1, Object t2) {return  (t1==t2) ;}private static boolean tom_is_sort_Boool(Object t) {return  (t instanceof maqv.msp.types.Boool) ;}private static boolean tom_equal_term_Instrucao(Object t1, Object t2) {return  (t1==t2) ;}private static boolean tom_is_sort_Instrucao(Object t) {return  (t instanceof maqv.msp.types.Instrucao) ;}private static boolean tom_equal_term_Instrucoes(Object t1, Object t2) {return  (t1==t2) ;}private static boolean tom_is_sort_Instrucoes(Object t) {return  (t instanceof maqv.msp.types.Instrucoes) ;}private static boolean tom_is_fun_sym_I( maqv.msp.types.Termo  t) {return  (t instanceof maqv.msp.types.termo.I) ;}private static  maqv.msp.types.Termo  tom_make_I( int  t0) { return  maqv.msp.types.termo.I.make(t0) ;}private static  int  tom_get_slot_I_i( maqv.msp.types.Termo  t) {return  t.geti() ;}private static boolean tom_is_fun_sym_S( maqv.msp.types.Termo  t) {return  (t instanceof maqv.msp.types.termo.S) ;}private static  maqv.msp.types.Termo  tom_make_S( String  t0) { return  maqv.msp.types.termo.S.make(t0) ;}private static  String  tom_get_slot_S_id( maqv.msp.types.Termo  t) {return  t.getid() ;}private static boolean tom_is_fun_sym_B( maqv.msp.types.Termo  t) {return  (t instanceof maqv.msp.types.termo.B) ;}private static  maqv.msp.types.Termo  tom_make_B( maqv.msp.types.Boool  t0) { return  maqv.msp.types.termo.B.make(t0) ;}private static  maqv.msp.types.Boool  tom_get_slot_B_b( maqv.msp.types.Termo  t) {return  t.getb() ;}private static boolean tom_is_fun_sym_F( maqv.msp.types.Termo  t) {return  (t instanceof maqv.msp.types.termo.F) ;}private static  int  tom_get_slot_F_f( maqv.msp.types.Termo  t) {return  t.getf() ;}private static  maqv.msp.types.Termo  tom_make_Vazio() { return  maqv.msp.types.termo.Vazio.make() ;}private static boolean tom_is_fun_sym_DInt( maqv.msp.types.DefTipo  t) {return  (t instanceof maqv.msp.types.deftipo.DInt) ;}private static boolean tom_is_fun_sym_DChar( maqv.msp.types.DefTipo  t) {return  (t instanceof maqv.msp.types.deftipo.DChar) ;}private static boolean tom_is_fun_sym_DBoolean( maqv.msp.types.DefTipo  t) {return  (t instanceof maqv.msp.types.deftipo.DBoolean) ;}private static boolean tom_is_fun_sym_DFloat( maqv.msp.types.DefTipo  t) {return  (t instanceof maqv.msp.types.deftipo.DFloat) ;}private static boolean tom_is_fun_sym_True( maqv.msp.types.Boool  t) {return  (t instanceof maqv.msp.types.boool.True) ;}private static  maqv.msp.types.Boool  tom_make_True() { return  maqv.msp.types.boool.True.make() ;}private static boolean tom_is_fun_sym_False( maqv.msp.types.Boool  t) {return  (t instanceof maqv.msp.types.boool.False) ;}private static  maqv.msp.types.Boool  tom_make_False() { return  maqv.msp.types.boool.False.make() ;}private static boolean tom_is_fun_sym_ALabel( maqv.msp.types.Instrucao  t) {return  (t instanceof maqv.msp.types.instrucao.ALabel) ;}private static  String  tom_get_slot_ALabel_id( maqv.msp.types.Instrucao  t) {return  t.getid() ;}private static boolean tom_is_fun_sym_Call( maqv.msp.types.Instrucao  t) {return  (t instanceof maqv.msp.types.instrucao.Call) ;}private static  String  tom_get_slot_Call_id( maqv.msp.types.Instrucao  t) {return  t.getid() ;}private static boolean tom_is_fun_sym_Ret( maqv.msp.types.Instrucao  t) {return  (t instanceof maqv.msp.types.instrucao.Ret) ;}private static boolean tom_is_fun_sym_Add( maqv.msp.types.Instrucao  t) {return  (t instanceof maqv.msp.types.instrucao.Add) ;}private static boolean tom_is_fun_sym_Sub( maqv.msp.types.Instrucao  t) {return  (t instanceof maqv.msp.types.instrucao.Sub) ;}private static boolean tom_is_fun_sym_Div( maqv.msp.types.Instrucao  t) {return  (t instanceof maqv.msp.types.instrucao.Div) ;}private static boolean tom_is_fun_sym_Mul( maqv.msp.types.Instrucao  t) {return  (t instanceof maqv.msp.types.instrucao.Mul) ;}private static boolean tom_is_fun_sym_Mod( maqv.msp.types.Instrucao  t) {return  (t instanceof maqv.msp.types.instrucao.Mod) ;}private static boolean tom_is_fun_sym_Inc( maqv.msp.types.Instrucao  t) {return  (t instanceof maqv.msp.types.instrucao.Inc) ;}private static boolean tom_is_fun_sym_Dec( maqv.msp.types.Instrucao  t) {return  (t instanceof maqv.msp.types.instrucao.Dec) ;}private static boolean tom_is_fun_sym_Eq( maqv.msp.types.Instrucao  t) {return  (t instanceof maqv.msp.types.instrucao.Eq) ;}private static boolean tom_is_fun_sym_Neq( maqv.msp.types.Instrucao  t) {return  (t instanceof maqv.msp.types.instrucao.Neq) ;}private static boolean tom_is_fun_sym_Gt( maqv.msp.types.Instrucao  t) {return  (t instanceof maqv.msp.types.instrucao.Gt) ;}private static boolean tom_is_fun_sym_GoEq( maqv.msp.types.Instrucao  t) {return  (t instanceof maqv.msp.types.instrucao.GoEq) ;}private static boolean tom_is_fun_sym_Lt( maqv.msp.types.Instrucao  t) {return  (t instanceof maqv.msp.types.instrucao.Lt) ;}private static boolean tom_is_fun_sym_LoEq( maqv.msp.types.Instrucao  t) {return  (t instanceof maqv.msp.types.instrucao.LoEq) ;}private static boolean tom_is_fun_sym_Nott( maqv.msp.types.Instrucao  t) {return  (t instanceof maqv.msp.types.instrucao.Nott) ;}private static boolean tom_is_fun_sym_Or( maqv.msp.types.Instrucao  t) {return  (t instanceof maqv.msp.types.instrucao.Or) ;}private static boolean tom_is_fun_sym_And( maqv.msp.types.Instrucao  t) {return  (t instanceof maqv.msp.types.instrucao.And) ;}private static boolean tom_is_fun_sym_Halt( maqv.msp.types.Instrucao  t) {return  (t instanceof maqv.msp.types.instrucao.Halt) ;}private static boolean tom_is_fun_sym_IIn( maqv.msp.types.Instrucao  t) {return  (t instanceof maqv.msp.types.instrucao.IIn) ;}private static  maqv.msp.types.DefTipo  tom_get_slot_IIn_tipo( maqv.msp.types.Instrucao  t) {return  t.gettipo() ;}private static boolean tom_is_fun_sym_IOut( maqv.msp.types.Instrucao  t) {return  (t instanceof maqv.msp.types.instrucao.IOut) ;}private static boolean tom_is_fun_sym_Jump( maqv.msp.types.Instrucao  t) {return  (t instanceof maqv.msp.types.instrucao.Jump) ;}private static  String  tom_get_slot_Jump_id( maqv.msp.types.Instrucao  t) {return  t.getid() ;}private static boolean tom_is_fun_sym_Jumpf( maqv.msp.types.Instrucao  t) {return  (t instanceof maqv.msp.types.instrucao.Jumpf) ;}private static  String  tom_get_slot_Jumpf_id( maqv.msp.types.Instrucao  t) {return  t.getid() ;}private static boolean tom_is_fun_sym_Push( maqv.msp.types.Instrucao  t) {return  (t instanceof maqv.msp.types.instrucao.Push) ;}private static  maqv.msp.types.Termo  tom_get_slot_Push_t( maqv.msp.types.Instrucao  t) {return  t.gett() ;}private static boolean tom_is_fun_sym_Pusha( maqv.msp.types.Instrucao  t) {return  (t instanceof maqv.msp.types.instrucao.Pusha) ;}private static  maqv.msp.types.Termo  tom_get_slot_Pusha_t( maqv.msp.types.Instrucao  t) {return  t.gett() ;}private static boolean tom_is_fun_sym_Load( maqv.msp.types.Instrucao  t) {return  (t instanceof maqv.msp.types.instrucao.Load) ;}private static boolean tom_is_fun_sym_Store( maqv.msp.types.Instrucao  t) {return  (t instanceof maqv.msp.types.instrucao.Store) ;}private static boolean tom_is_fun_sym_Decl( maqv.msp.types.Instrucao  t) {return  (t instanceof maqv.msp.types.instrucao.Decl) ;}private static  String  tom_get_slot_Decl_id( maqv.msp.types.Instrucao  t) {return  t.getid() ;}private static  int  tom_get_slot_Decl_initMemAddress( maqv.msp.types.Instrucao  t) {return  t.getinitMemAddress() ;}private static  int  tom_get_slot_Decl_size( maqv.msp.types.Instrucao  t) {return  t.getsize() ;}private static boolean tom_is_fun_sym_Stackk( maqv.msp.types.Stackk  t) {return  ((t instanceof maqv.msp.types.stackk.ConsStackk) || (t instanceof maqv.msp.types.stackk.EmptyStackk)) ;}private static  maqv.msp.types.Stackk  tom_empty_list_Stackk() { return  maqv.msp.types.stackk.EmptyStackk.make() ;}private static  maqv.msp.types.Stackk  tom_cons_list_Stackk( maqv.msp.types.Termo  e,  maqv.msp.types.Stackk  l) { return  maqv.msp.types.stackk.ConsStackk.make(e,l) ;}private static  maqv.msp.types.Termo  tom_get_head_Stackk_Stackk( maqv.msp.types.Stackk  l) {return  l.getHeadStackk() ;}private static  maqv.msp.types.Stackk  tom_get_tail_Stackk_Stackk( maqv.msp.types.Stackk  l) {return  l.getTailStackk() ;}private static boolean tom_is_empty_Stackk_Stackk( maqv.msp.types.Stackk  l) {return  l.isEmptyStackk() ;}   private static   maqv.msp.types.Stackk  tom_append_list_Stackk( maqv.msp.types.Stackk l1,  maqv.msp.types.Stackk  l2) {     if( l1.isEmptyStackk() ) {       return l2;     } else if( l2.isEmptyStackk() ) {       return l1;     } else if(  l1.getTailStackk() .isEmptyStackk() ) {       return  maqv.msp.types.stackk.ConsStackk.make( l1.getHeadStackk() ,l2) ;     } else {       return  maqv.msp.types.stackk.ConsStackk.make( l1.getHeadStackk() ,tom_append_list_Stackk( l1.getTailStackk() ,l2)) ;     }   }   private static   maqv.msp.types.Stackk  tom_get_slice_Stackk( maqv.msp.types.Stackk  begin,  maqv.msp.types.Stackk  end, maqv.msp.types.Stackk  tail) {     if( (begin==end) ) {       return tail;     } else if( (end==tail)  && ( end.isEmptyStackk()  ||  (end==tom_empty_list_Stackk()) )) {       /* code to avoid a call to make, and thus to avoid looping during list-matching */       return begin;     }     return  maqv.msp.types.stackk.ConsStackk.make( begin.getHeadStackk() ,( maqv.msp.types.Stackk )tom_get_slice_Stackk( begin.getTailStackk() ,end,tail)) ;   }   private static boolean tom_is_fun_sym_Instrucoes( maqv.msp.types.Instrucoes  t) {return  ((t instanceof maqv.msp.types.instrucoes.ConsInstrucoes) || (t instanceof maqv.msp.types.instrucoes.EmptyInstrucoes)) ;}private static  maqv.msp.types.Instrucoes  tom_empty_list_Instrucoes() { return  maqv.msp.types.instrucoes.EmptyInstrucoes.make() ;}private static  maqv.msp.types.Instrucoes  tom_cons_list_Instrucoes( maqv.msp.types.Instrucao  e,  maqv.msp.types.Instrucoes  l) { return  maqv.msp.types.instrucoes.ConsInstrucoes.make(e,l) ;}private static  maqv.msp.types.Instrucao  tom_get_head_Instrucoes_Instrucoes( maqv.msp.types.Instrucoes  l) {return  l.getHeadInstrucoes() ;}private static  maqv.msp.types.Instrucoes  tom_get_tail_Instrucoes_Instrucoes( maqv.msp.types.Instrucoes  l) {return  l.getTailInstrucoes() ;}private static boolean tom_is_empty_Instrucoes_Instrucoes( maqv.msp.types.Instrucoes  l) {return  l.isEmptyInstrucoes() ;}   private static   maqv.msp.types.Instrucoes  tom_append_list_Instrucoes( maqv.msp.types.Instrucoes l1,  maqv.msp.types.Instrucoes  l2) {     if( l1.isEmptyInstrucoes() ) {       return l2;     } else if( l2.isEmptyInstrucoes() ) {       return l1;     } else if(  l1.getTailInstrucoes() .isEmptyInstrucoes() ) {       return  maqv.msp.types.instrucoes.ConsInstrucoes.make( l1.getHeadInstrucoes() ,l2) ;     } else {       return  maqv.msp.types.instrucoes.ConsInstrucoes.make( l1.getHeadInstrucoes() ,tom_append_list_Instrucoes( l1.getTailInstrucoes() ,l2)) ;     }   }   private static   maqv.msp.types.Instrucoes  tom_get_slice_Instrucoes( maqv.msp.types.Instrucoes  begin,  maqv.msp.types.Instrucoes  end, maqv.msp.types.Instrucoes  tail) {     if( (begin==end) ) {       return tail;     } else if( (end==tail)  && ( end.isEmptyInstrucoes()  ||  (end==tom_empty_list_Instrucoes()) )) {       /* code to avoid a call to make, and thus to avoid looping during list-matching */       return begin;     }     return  maqv.msp.types.instrucoes.ConsInstrucoes.make( begin.getHeadInstrucoes() ,( maqv.msp.types.Instrucoes )tom_get_slice_Instrucoes( begin.getTailInstrucoes() ,end,tail)) ;   }    




	private Instrucoes programa;
	private Instrucoes original;
	private Stackk stack;
	private Stackk stackFuncs;
	private String actualFuncName;
	private Map<String,Integer> symbols;
	private ArrayList<Termo> heap;
	private int pc;
	private int numProg;
	private StringBuilder output;
	private HashMap<String,Integer> metricas;

	public void initMetricas(){
		//Chamada de funcoes e returns
		metricas.put("ALabel",0);
		metricas.put("Call",0);
		metricas.put("Ret",0);
		//Aritmeticas
		metricas.put("Add",0);
		metricas.put("Sub",0);
		metricas.put("Div",0);
		metricas.put("Mul",0);
		metricas.put("Mod",0);
		//Incrementos e decrementos
		metricas.put("Inc",0);
		metricas.put("Dec",0);
		//Relacionais
		metricas.put("Eq",0);
		metricas.put("Neq",0);
		metricas.put("Gt",0);
		metricas.put("GoEq",0);
		metricas.put("Lt",0);
		metricas.put("LoEq",0);
		metricas.put("Nott",0);
		//Condicionais
		metricas.put("Or",0);
		metricas.put("And",0);

		metricas.put("Halt",0);
		//I/O
		metricas.put("IIn",0);
		metricas.put("IOut",0);

		metricas.put("Jump",0);
		metricas.put("Jumpf",0);
		metricas.put("Push",0);
		metricas.put("PushA",0);
		metricas.put("Load",0);
		metricas.put("Store",0);
		//Declaracoes
		metricas.put("Decl",0);
	}


	public String toString(){
		StringBuilder str = new StringBuilder("Métricas\n");
		str.append("Instrução\t| Número de vezes ocorridas\n");
		for(String s : metricas.keySet()){
			str.append(s +"\t\t| "+ metricas.get(s)+"\n");
		}
		return str.toString();
	}

	public static void menu(){

		System.out.println("\n*********** Menu ************");
		System.out.println("1 ----------------- Árvore GOM ");
		System.out.println("2 ----------------- Menu métricas");
		System.out.println("3 ----------------- Correr Programa");
		System.out.println("4 ----------------- Gerar ficheiro .dot");
		System.out.println("0 ----------------- Sair do Sistema ");

		System.out.println("\nDigite um número:");
	}

	public static void menuMetricas(){

		System.out.println("\n********** Menu Métricas *********");

		System.out.println("1 ----------------- Ler métricas todas");
		System.out.println("2 ----------------- Métricas Declarações");
		System.out.println("3 ----------------- Métricas Aritméticas");
		System.out.println("4 ----------------- Métricas Condicionais");
		System.out.println("5 ----------------- Métricas Relacionais");
		System.out.println("6 ----------------- Métricas I/O");
		System.out.println("0 ----------------- Voltar atrás");
		System.out.println("\nDigite um número:");
	}

	public static void menuRun(){

		System.out.println("\n********** Menu Run *********");

		System.out.println("1 ----------------- Output no Terminal");
		System.out.println("2 ----------------- Output em ficheiro .txt ");
		System.out.println("\nDigite um número:");
	}

	public static void main(String[] args) {

		Boolean sair = false;
		Boolean metric = false;
		Boolean run = false;
		String file=null;
		String opcao =null;
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		Main main;
		Instrucoes p,original;

		try{
			mspLexer lexer = new mspLexer(new ANTLRFileStream("../exemplos/res.msp"));
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			mspParser parser = new mspParser(tokens);
			// Parse the inputexpression
			Tree b = (Tree) parser.programa().getTree();
			p = (Instrucoes) mspAdaptor.getTerm(b);
			original = (Instrucoes) mspAdaptor.getTerm(b);
			main = new Main(p, original);
			main.initMetricas();

			while(!sair){
				menu();
				opcao = teclado.readLine();

				switch(opcao){

					case "1"://GOM
						System.out.println("Árvore gerada = " + p);// name of the Gom module + Adaptor
						break;

					case "2"://Metricas
						metric = true;
						while(metric){
							menuMetricas();
							opcao = teclado.readLine();
							switch(opcao){

								case "1":
									System.out.println(main.toString());
									break;

								case "2":								
									tom_make_TopDown(tom_make_visitDecl(main.metricas,0)).visit(p);
									System.out.println("#Declarações = "+ main.metricas.get("Decl"));
									break;

								case "3":
									tom_make_TopDown(tom_make_visitAritm(main.metricas,0,0,0,0,0)).visit(p);
									System.out.println("#Adições = "+ main.metricas.get("Add"));
									System.out.println("#Subtrações = "+ main.metricas.get("Sub"));
									System.out.println("#Multiplicações = "+ main.metricas.get("Mul"));
									System.out.println("#Divisões = "+ main.metricas.get("Div"));
									System.out.println("#Resto = "+ main.metricas.get("Mod"));
									break;

								case "4":
									tom_make_TopDown(tom_make_visitConditionals(main.metricas,0,0)).visit(p);
									System.out.println("#And = "+ main.metricas.get("And"));
									System.out.println("#Or = "+ main.metricas.get("Or"));
									break;

								case "5":
									tom_make_TopDown(tom_make_visitRelationals(main.metricas,0,0,0,0,0,0,0)).visit(p);
									System.out.println("#Igualdades = "+ main.metricas.get("Eq"));
									System.out.println("#Diferentes = "+ main.metricas.get("Neq"));
									System.out.println("#Maior = "+ main.metricas.get("Gt"));
									System.out.println("#Maior ou Igual = "+ main.metricas.get("GoEq"));
									System.out.println("#Menor = "+ main.metricas.get("Lt"));
									System.out.println("#Menor ou Igual = "+ main.metricas.get("LoEq"));
									System.out.println("#Negação = "+ main.metricas.get("Nott"));
									break;

								case "6":
									tom_make_TopDown(tom_make_visitIO(main.metricas,0,0)).visit(p);
									System.out.println("#Inputs = "+ main.metricas.get("IIn"));
									System.out.println("#Outputs = "+ main.metricas.get("IOut"));
									break;

								case "0":
									metric = false;
									break;

								default:
				 					System.out.println("Opção Inválida. Tente de novo.");
				 					break;
							}
						}
						break;

					case "3"://Run
						main.initMetricas();
						main.output.replace(0,main.output.length()," ");
						main.output.trimToSize();
						main.run(p);
						run = true;
							while(run){
								menuRun();
								opcao = teclado.readLine();
								switch(opcao){
									case "1":
										System.out.println(main.getOutput());
										run = false;
										break;
									case "2":
										try {
											PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("output.txt", true)));
		        							pw.print(main.getOutput());
		        							pw.flush(); pw.close();
											run = false;
										}catch (IOException e){
											System.err.println("exception: " + e);
											return;
			    						} 
										break;
									default:
										System.out.println("Opção inválida. Tente de novo.");				
										break;
								}
							}
							break;

					case "4"://graphivz
						try{
							FileWriter out = new FileWriter("gram.dot");
							Viewer.toDot(p,out);
						}catch (IOException e){
							System.out.println("ERROR in dot file"); 
						}
						break;
					
					case "0":
				 		sair = true;
				 		break;

				 	default:
				 		System.out.println("Opção Inválida. Tente de novo.");
				 		break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static class visitDecl extends tom.library.sl.AbstractStrategyBasic {private  java.util.HashMap  metricas;private  int  n;public visitDecl( java.util.HashMap  metricas,  int  n) {super(tom_make_Identity());this.metricas=metricas;this.n=n;}public  java.util.HashMap  getmetricas() {return metricas;}public  int  getn() {return n;}public tom.library.sl.Visitable[] getChildren() {tom.library.sl.Visitable[] stratChilds = new tom.library.sl.Visitable[getChildCount()];stratChilds[0] = super.getChildAt(0);return stratChilds;}public tom.library.sl.Visitable setChildren(tom.library.sl.Visitable[] children) {super.setChildAt(0, children[0]);return this;}public int getChildCount() {return 1;}public tom.library.sl.Visitable getChildAt(int index) {switch (index) {case 0: return super.getChildAt(0);default: throw new IndexOutOfBoundsException();}}public tom.library.sl.Visitable setChildAt(int index, tom.library.sl.Visitable child) {switch (index) {case 0: return super.setChildAt(0, child);default: throw new IndexOutOfBoundsException();}}@SuppressWarnings("unchecked")public <T> T visitLight(T v, tom.library.sl.Introspector introspector) throws tom.library.sl.VisitFailure {if (tom_is_sort_Instrucao(v)) {return ((T)visit_Instrucao((( maqv.msp.types.Instrucao )v),introspector));}if (!(( null  == environment))) {return ((T)any.visit(environment,introspector));} else {return any.visitLight(v,introspector);}}@SuppressWarnings("unchecked")public  maqv.msp.types.Instrucao  _visit_Instrucao( maqv.msp.types.Instrucao  arg, tom.library.sl.Introspector introspector) throws tom.library.sl.VisitFailure {if (!(( null  == environment))) {return (( maqv.msp.types.Instrucao )any.visit(environment,introspector));} else {return any.visitLight(arg,introspector);}}@SuppressWarnings("unchecked")public  maqv.msp.types.Instrucao  visit_Instrucao( maqv.msp.types.Instrucao  tom__arg, tom.library.sl.Introspector introspector) throws tom.library.sl.VisitFailure {{{if (tom_is_sort_Instrucao(((Object)tom__arg))) {if (tom_is_sort_Instrucao((( maqv.msp.types.Instrucao )((Object)tom__arg)))) {if (tom_is_fun_sym_Decl((( maqv.msp.types.Instrucao )(( maqv.msp.types.Instrucao )((Object)tom__arg))))) {


      	  		n++;
      	  		metricas.put("Decl",n);
      	 	}}}}}return _visit_Instrucao(tom__arg,introspector);}}private static  tom.library.sl.Strategy  tom_make_visitDecl( java.util.HashMap  t0,  int  t1) { return new visitDecl(t0,t1);}public static class visitAritm extends tom.library.sl.AbstractStrategyBasic {private  java.util.HashMap  metricas;private  int  add;private  int  sub;private  int  mul;private  int  div;private  int  mod;public visitAritm( java.util.HashMap  metricas,  int  add,  int  sub,  int  mul,  int  div,  int  mod) {super(tom_make_Identity());this.metricas=metricas;this.add=add;this.sub=sub;this.mul=mul;this.div=div;this.mod=mod;}public  java.util.HashMap  getmetricas() {return metricas;}public  int  getadd() {return add;}public  int  getsub() {return sub;}public  int  getmul() {return mul;}public  int  getdiv() {return div;}public  int  getmod() {return mod;}public tom.library.sl.Visitable[] getChildren() {tom.library.sl.Visitable[] stratChilds = new tom.library.sl.Visitable[getChildCount()];stratChilds[0] = super.getChildAt(0);return stratChilds;}public tom.library.sl.Visitable setChildren(tom.library.sl.Visitable[] children) {super.setChildAt(0, children[0]);return this;}public int getChildCount() {return 1;}public tom.library.sl.Visitable getChildAt(int index) {switch (index) {case 0: return super.getChildAt(0);default: throw new IndexOutOfBoundsException();}}public tom.library.sl.Visitable setChildAt(int index, tom.library.sl.Visitable child) {switch (index) {case 0: return super.setChildAt(0, child);default: throw new IndexOutOfBoundsException();}}@SuppressWarnings("unchecked")public <T> T visitLight(T v, tom.library.sl.Introspector introspector) throws tom.library.sl.VisitFailure {if (tom_is_sort_Instrucao(v)) {return ((T)visit_Instrucao((( maqv.msp.types.Instrucao )v),introspector));}if (!(( null  == environment))) {return ((T)any.visit(environment,introspector));} else {return any.visitLight(v,introspector);}}@SuppressWarnings("unchecked")public  maqv.msp.types.Instrucao  _visit_Instrucao( maqv.msp.types.Instrucao  arg, tom.library.sl.Introspector introspector) throws tom.library.sl.VisitFailure {if (!(( null  == environment))) {return (( maqv.msp.types.Instrucao )any.visit(environment,introspector));} else {return any.visitLight(arg,introspector);}}@SuppressWarnings("unchecked")public  maqv.msp.types.Instrucao  visit_Instrucao( maqv.msp.types.Instrucao  tom__arg, tom.library.sl.Introspector introspector) throws tom.library.sl.VisitFailure {{{if (tom_is_sort_Instrucao(((Object)tom__arg))) {if (tom_is_sort_Instrucao((( maqv.msp.types.Instrucao )((Object)tom__arg)))) {if (tom_is_fun_sym_Add((( maqv.msp.types.Instrucao )(( maqv.msp.types.Instrucao )((Object)tom__arg))))) {






				add++;
      	  		metricas.put("Add",add);	
			}}}}{if (tom_is_sort_Instrucao(((Object)tom__arg))) {if (tom_is_sort_Instrucao((( maqv.msp.types.Instrucao )((Object)tom__arg)))) {if (tom_is_fun_sym_Sub((( maqv.msp.types.Instrucao )(( maqv.msp.types.Instrucao )((Object)tom__arg))))) {

				sub++;
      	  		metricas.put("Sub",sub);	
			}}}}{if (tom_is_sort_Instrucao(((Object)tom__arg))) {if (tom_is_sort_Instrucao((( maqv.msp.types.Instrucao )((Object)tom__arg)))) {if (tom_is_fun_sym_Div((( maqv.msp.types.Instrucao )(( maqv.msp.types.Instrucao )((Object)tom__arg))))) {

				div++;
      	  		metricas.put("Div",div);	
			}}}}{if (tom_is_sort_Instrucao(((Object)tom__arg))) {if (tom_is_sort_Instrucao((( maqv.msp.types.Instrucao )((Object)tom__arg)))) {if (tom_is_fun_sym_Mul((( maqv.msp.types.Instrucao )(( maqv.msp.types.Instrucao )((Object)tom__arg))))) {

				mul++;
      	  		metricas.put("Mul",mul);	
			}}}}{if (tom_is_sort_Instrucao(((Object)tom__arg))) {if (tom_is_sort_Instrucao((( maqv.msp.types.Instrucao )((Object)tom__arg)))) {if (tom_is_fun_sym_Mod((( maqv.msp.types.Instrucao )(( maqv.msp.types.Instrucao )((Object)tom__arg))))) {

				mod++;
      	  		metricas.put("Mod",mod);	
			}}}}}return _visit_Instrucao(tom__arg,introspector);}}private static  tom.library.sl.Strategy  tom_make_visitAritm( java.util.HashMap  t0,  int  t1,  int  t2,  int  t3,  int  t4,  int  t5) { return new visitAritm(t0,t1,t2,t3,t4,t5);}public static class visitRelationals extends tom.library.sl.AbstractStrategyBasic {private  java.util.HashMap  metricas;private  int  eq;private  int  neq;private  int  gt;private  int  goEq;private  int  lt;private  int  loEq;private  int  nott;public visitRelationals( java.util.HashMap  metricas,  int  eq,  int  neq,  int  gt,  int  goEq,  int  lt,  int  loEq,  int  nott) {super(tom_make_Identity());this.metricas=metricas;this.eq=eq;this.neq=neq;this.gt=gt;this.goEq=goEq;this.lt=lt;this.loEq=loEq;this.nott=nott;}public  java.util.HashMap  getmetricas() {return metricas;}public  int  geteq() {return eq;}public  int  getneq() {return neq;}public  int  getgt() {return gt;}public  int  getgoEq() {return goEq;}public  int  getlt() {return lt;}public  int  getloEq() {return loEq;}public  int  getnott() {return nott;}public tom.library.sl.Visitable[] getChildren() {tom.library.sl.Visitable[] stratChilds = new tom.library.sl.Visitable[getChildCount()];stratChilds[0] = super.getChildAt(0);return stratChilds;}public tom.library.sl.Visitable setChildren(tom.library.sl.Visitable[] children) {super.setChildAt(0, children[0]);return this;}public int getChildCount() {return 1;}public tom.library.sl.Visitable getChildAt(int index) {switch (index) {case 0: return super.getChildAt(0);default: throw new IndexOutOfBoundsException();}}public tom.library.sl.Visitable setChildAt(int index, tom.library.sl.Visitable child) {switch (index) {case 0: return super.setChildAt(0, child);default: throw new IndexOutOfBoundsException();}}@SuppressWarnings("unchecked")public <T> T visitLight(T v, tom.library.sl.Introspector introspector) throws tom.library.sl.VisitFailure {if (tom_is_sort_Instrucao(v)) {return ((T)visit_Instrucao((( maqv.msp.types.Instrucao )v),introspector));}if (!(( null  == environment))) {return ((T)any.visit(environment,introspector));} else {return any.visitLight(v,introspector);}}@SuppressWarnings("unchecked")public  maqv.msp.types.Instrucao  _visit_Instrucao( maqv.msp.types.Instrucao  arg, tom.library.sl.Introspector introspector) throws tom.library.sl.VisitFailure {if (!(( null  == environment))) {return (( maqv.msp.types.Instrucao )any.visit(environment,introspector));} else {return any.visitLight(arg,introspector);}}@SuppressWarnings("unchecked")public  maqv.msp.types.Instrucao  visit_Instrucao( maqv.msp.types.Instrucao  tom__arg, tom.library.sl.Introspector introspector) throws tom.library.sl.VisitFailure {{{if (tom_is_sort_Instrucao(((Object)tom__arg))) {if (tom_is_sort_Instrucao((( maqv.msp.types.Instrucao )((Object)tom__arg)))) {if (tom_is_fun_sym_Eq((( maqv.msp.types.Instrucao )(( maqv.msp.types.Instrucao )((Object)tom__arg))))) {






				eq++;
      	  		metricas.put("Eq",eq);	
			}}}}{if (tom_is_sort_Instrucao(((Object)tom__arg))) {if (tom_is_sort_Instrucao((( maqv.msp.types.Instrucao )((Object)tom__arg)))) {if (tom_is_fun_sym_Neq((( maqv.msp.types.Instrucao )(( maqv.msp.types.Instrucao )((Object)tom__arg))))) {

				neq++;
      	  		metricas.put("Neq",neq);	
			}}}}{if (tom_is_sort_Instrucao(((Object)tom__arg))) {if (tom_is_sort_Instrucao((( maqv.msp.types.Instrucao )((Object)tom__arg)))) {if (tom_is_fun_sym_Gt((( maqv.msp.types.Instrucao )(( maqv.msp.types.Instrucao )((Object)tom__arg))))) {

				gt++;
      	  		metricas.put("Gt",gt);	
			}}}}{if (tom_is_sort_Instrucao(((Object)tom__arg))) {if (tom_is_sort_Instrucao((( maqv.msp.types.Instrucao )((Object)tom__arg)))) {if (tom_is_fun_sym_GoEq((( maqv.msp.types.Instrucao )(( maqv.msp.types.Instrucao )((Object)tom__arg))))) {

				goEq++;
      	  		metricas.put("GoEq",goEq);	
			}}}}{if (tom_is_sort_Instrucao(((Object)tom__arg))) {if (tom_is_sort_Instrucao((( maqv.msp.types.Instrucao )((Object)tom__arg)))) {if (tom_is_fun_sym_Lt((( maqv.msp.types.Instrucao )(( maqv.msp.types.Instrucao )((Object)tom__arg))))) {

				lt++;
      	  		metricas.put("Lt",lt);	
			}}}}{if (tom_is_sort_Instrucao(((Object)tom__arg))) {if (tom_is_sort_Instrucao((( maqv.msp.types.Instrucao )((Object)tom__arg)))) {if (tom_is_fun_sym_LoEq((( maqv.msp.types.Instrucao )(( maqv.msp.types.Instrucao )((Object)tom__arg))))) {

				loEq++;
      	  		metricas.put("LoEq",loEq);	
			}}}}{if (tom_is_sort_Instrucao(((Object)tom__arg))) {if (tom_is_sort_Instrucao((( maqv.msp.types.Instrucao )((Object)tom__arg)))) {if (tom_is_fun_sym_Nott((( maqv.msp.types.Instrucao )(( maqv.msp.types.Instrucao )((Object)tom__arg))))) {

				nott++;
      	  		metricas.put("Nott",nott);	
			}}}}}return _visit_Instrucao(tom__arg,introspector);}}private static  tom.library.sl.Strategy  tom_make_visitRelationals( java.util.HashMap  t0,  int  t1,  int  t2,  int  t3,  int  t4,  int  t5,  int  t6,  int  t7) { return new visitRelationals(t0,t1,t2,t3,t4,t5,t6,t7);}public static class visitConditionals extends tom.library.sl.AbstractStrategyBasic {private  java.util.HashMap  metricas;private  int  and;private  int  or;public visitConditionals( java.util.HashMap  metricas,  int  and,  int  or) {super(tom_make_Identity());this.metricas=metricas;this.and=and;this.or=or;}public  java.util.HashMap  getmetricas() {return metricas;}public  int  getand() {return and;}public  int  getor() {return or;}public tom.library.sl.Visitable[] getChildren() {tom.library.sl.Visitable[] stratChilds = new tom.library.sl.Visitable[getChildCount()];stratChilds[0] = super.getChildAt(0);return stratChilds;}public tom.library.sl.Visitable setChildren(tom.library.sl.Visitable[] children) {super.setChildAt(0, children[0]);return this;}public int getChildCount() {return 1;}public tom.library.sl.Visitable getChildAt(int index) {switch (index) {case 0: return super.getChildAt(0);default: throw new IndexOutOfBoundsException();}}public tom.library.sl.Visitable setChildAt(int index, tom.library.sl.Visitable child) {switch (index) {case 0: return super.setChildAt(0, child);default: throw new IndexOutOfBoundsException();}}@SuppressWarnings("unchecked")public <T> T visitLight(T v, tom.library.sl.Introspector introspector) throws tom.library.sl.VisitFailure {if (tom_is_sort_Instrucao(v)) {return ((T)visit_Instrucao((( maqv.msp.types.Instrucao )v),introspector));}if (!(( null  == environment))) {return ((T)any.visit(environment,introspector));} else {return any.visitLight(v,introspector);}}@SuppressWarnings("unchecked")public  maqv.msp.types.Instrucao  _visit_Instrucao( maqv.msp.types.Instrucao  arg, tom.library.sl.Introspector introspector) throws tom.library.sl.VisitFailure {if (!(( null  == environment))) {return (( maqv.msp.types.Instrucao )any.visit(environment,introspector));} else {return any.visitLight(arg,introspector);}}@SuppressWarnings("unchecked")public  maqv.msp.types.Instrucao  visit_Instrucao( maqv.msp.types.Instrucao  tom__arg, tom.library.sl.Introspector introspector) throws tom.library.sl.VisitFailure {{{if (tom_is_sort_Instrucao(((Object)tom__arg))) {if (tom_is_sort_Instrucao((( maqv.msp.types.Instrucao )((Object)tom__arg)))) {if (tom_is_fun_sym_And((( maqv.msp.types.Instrucao )(( maqv.msp.types.Instrucao )((Object)tom__arg))))) {






				and++;
      	  		metricas.put("And",and);	
			}}}}{if (tom_is_sort_Instrucao(((Object)tom__arg))) {if (tom_is_sort_Instrucao((( maqv.msp.types.Instrucao )((Object)tom__arg)))) {if (tom_is_fun_sym_Or((( maqv.msp.types.Instrucao )(( maqv.msp.types.Instrucao )((Object)tom__arg))))) {

				or++;
      	  		metricas.put("Or",or);	
			}}}}}return _visit_Instrucao(tom__arg,introspector);}}private static  tom.library.sl.Strategy  tom_make_visitConditionals( java.util.HashMap  t0,  int  t1,  int  t2) { return new visitConditionals(t0,t1,t2);}public static class visitIO extends tom.library.sl.AbstractStrategyBasic {private  java.util.HashMap  metricas;private  int  in;private  int  out;public visitIO( java.util.HashMap  metricas,  int  in,  int  out) {super(tom_make_Identity());this.metricas=metricas;this.in=in;this.out=out;}public  java.util.HashMap  getmetricas() {return metricas;}public  int  getin() {return in;}public  int  getout() {return out;}public tom.library.sl.Visitable[] getChildren() {tom.library.sl.Visitable[] stratChilds = new tom.library.sl.Visitable[getChildCount()];stratChilds[0] = super.getChildAt(0);return stratChilds;}public tom.library.sl.Visitable setChildren(tom.library.sl.Visitable[] children) {super.setChildAt(0, children[0]);return this;}public int getChildCount() {return 1;}public tom.library.sl.Visitable getChildAt(int index) {switch (index) {case 0: return super.getChildAt(0);default: throw new IndexOutOfBoundsException();}}public tom.library.sl.Visitable setChildAt(int index, tom.library.sl.Visitable child) {switch (index) {case 0: return super.setChildAt(0, child);default: throw new IndexOutOfBoundsException();}}@SuppressWarnings("unchecked")public <T> T visitLight(T v, tom.library.sl.Introspector introspector) throws tom.library.sl.VisitFailure {if (tom_is_sort_Instrucao(v)) {return ((T)visit_Instrucao((( maqv.msp.types.Instrucao )v),introspector));}if (!(( null  == environment))) {return ((T)any.visit(environment,introspector));} else {return any.visitLight(v,introspector);}}@SuppressWarnings("unchecked")public  maqv.msp.types.Instrucao  _visit_Instrucao( maqv.msp.types.Instrucao  arg, tom.library.sl.Introspector introspector) throws tom.library.sl.VisitFailure {if (!(( null  == environment))) {return (( maqv.msp.types.Instrucao )any.visit(environment,introspector));} else {return any.visitLight(arg,introspector);}}@SuppressWarnings("unchecked")public  maqv.msp.types.Instrucao  visit_Instrucao( maqv.msp.types.Instrucao  tom__arg, tom.library.sl.Introspector introspector) throws tom.library.sl.VisitFailure {{{if (tom_is_sort_Instrucao(((Object)tom__arg))) {if (tom_is_sort_Instrucao((( maqv.msp.types.Instrucao )((Object)tom__arg)))) {if (tom_is_fun_sym_IIn((( maqv.msp.types.Instrucao )(( maqv.msp.types.Instrucao )((Object)tom__arg))))) {






				in++;
      	  		metricas.put("IIn",in);	
			}}}}{if (tom_is_sort_Instrucao(((Object)tom__arg))) {if (tom_is_sort_Instrucao((( maqv.msp.types.Instrucao )((Object)tom__arg)))) {if (tom_is_fun_sym_IOut((( maqv.msp.types.Instrucao )(( maqv.msp.types.Instrucao )((Object)tom__arg))))) {

				out++;
      	  		metricas.put("IOut",out);	
			}}}}}return _visit_Instrucao(tom__arg,introspector);}}private static  tom.library.sl.Strategy  tom_make_visitIO( java.util.HashMap  t0,  int  t1,  int  t2) { return new visitIO(t0,t1,t2);}



	public Main(Instrucoes insts, Instrucoes orig) {
		programa = insts;
		original = orig;
		actualFuncName = "";
		stack = tom_empty_list_Stackk();
		stackFuncs = tom_empty_list_Stackk();
		heap = new ArrayList<Termo>();
		symbols = new HashMap<String, Integer>();
		pc = 0;
		numProg = 0;
		output= new StringBuilder();
		metricas = new HashMap<String, Integer>();
	}
	
	public String getOutput(){
		output.insert(0,"Output");
		return output.toString();
	}

	private Instrucoes getNInstr(Instrucoes prog, int progc){
		{{if (tom_is_sort_Instrucoes(((Object)prog))) {if (tom_is_fun_sym_Instrucoes((( maqv.msp.types.Instrucoes )(( maqv.msp.types.Instrucoes )((Object)prog))))) {if (!(tom_is_empty_Instrucoes_Instrucoes((( maqv.msp.types.Instrucoes )((Object)prog))))) {
 
				if (progc == 0) {
					return (( maqv.msp.types.Instrucoes )((Object)prog));
				}
				else { return getNInstr(tom_get_tail_Instrucoes_Instrucoes((( maqv.msp.types.Instrucoes )((Object)prog))),progc-1); }
			}}}}}

		return tom_empty_list_Instrucoes();
	}

	private Instrucoes getCalledFunction(Instrucoes prog, String called){
		{{if (tom_is_sort_Instrucoes(((Object)prog))) {if (tom_is_fun_sym_Instrucoes((( maqv.msp.types.Instrucoes )(( maqv.msp.types.Instrucoes )((Object)prog))))) {if (!(tom_is_empty_Instrucoes_Instrucoes((( maqv.msp.types.Instrucoes )((Object)prog))))) { maqv.msp.types.Instrucao  tomMatch7_5=tom_get_head_Instrucoes_Instrucoes((( maqv.msp.types.Instrucoes )((Object)prog)));if (tom_is_sort_Instrucao(tomMatch7_5)) {if (tom_is_fun_sym_Call((( maqv.msp.types.Instrucao )tomMatch7_5))) { maqv.msp.types.Instrucoes  tom_insts=tom_get_tail_Instrucoes_Instrucoes((( maqv.msp.types.Instrucoes )((Object)prog)));

				if(called.equals(tom_get_slot_Call_id(tomMatch7_5))){
					return tom_insts;
				}else{
					return getCalledFunction(tom_insts,called);
				}
			}}}}}}{if (tom_is_sort_Instrucoes(((Object)prog))) {if (tom_is_fun_sym_Instrucoes((( maqv.msp.types.Instrucoes )(( maqv.msp.types.Instrucoes )((Object)prog))))) {if (!(tom_is_empty_Instrucoes_Instrucoes((( maqv.msp.types.Instrucoes )((Object)prog))))) {
 return getCalledFunction(tom_get_tail_Instrucoes_Instrucoes((( maqv.msp.types.Instrucoes )((Object)prog))),called); }}}}}

		return tom_empty_list_Instrucoes();
	}

	private Instrucoes getNInstr(Instrucoes prog, String callerF, String called){
		{{if (tom_is_sort_Instrucoes(((Object)prog))) {if (tom_is_fun_sym_Instrucoes((( maqv.msp.types.Instrucoes )(( maqv.msp.types.Instrucoes )((Object)prog))))) {if (!(tom_is_empty_Instrucoes_Instrucoes((( maqv.msp.types.Instrucoes )((Object)prog))))) { maqv.msp.types.Instrucao  tomMatch8_5=tom_get_head_Instrucoes_Instrucoes((( maqv.msp.types.Instrucoes )((Object)prog)));if (tom_is_sort_Instrucao(tomMatch8_5)) {if (tom_is_fun_sym_ALabel((( maqv.msp.types.Instrucao )tomMatch8_5))) { maqv.msp.types.Instrucoes  tom_insts=tom_get_tail_Instrucoes_Instrucoes((( maqv.msp.types.Instrucoes )((Object)prog)));

				if(callerF.equals(tom_get_slot_ALabel_id(tomMatch8_5))){
					return getCalledFunction(tom_insts, called);
				}else{
					return getNInstr(tom_insts,callerF,called);
				}
			}}}}}}{if (tom_is_sort_Instrucoes(((Object)prog))) {if (tom_is_fun_sym_Instrucoes((( maqv.msp.types.Instrucoes )(( maqv.msp.types.Instrucoes )((Object)prog))))) {if (!(tom_is_empty_Instrucoes_Instrucoes((( maqv.msp.types.Instrucoes )((Object)prog))))) {
 return getNInstr(tom_get_tail_Instrucoes_Instrucoes((( maqv.msp.types.Instrucoes )((Object)prog))),callerF,called); }}}}}

		return tom_empty_list_Instrucoes();
	}

	private Instrucoes jmp(Instrucoes prog, String label){
		{{if (tom_is_sort_Instrucoes(((Object)prog))) {if (tom_is_fun_sym_Instrucoes((( maqv.msp.types.Instrucoes )(( maqv.msp.types.Instrucoes )((Object)prog))))) {if (!(tom_is_empty_Instrucoes_Instrucoes((( maqv.msp.types.Instrucoes )((Object)prog))))) { maqv.msp.types.Instrucao  tomMatch9_5=tom_get_head_Instrucoes_Instrucoes((( maqv.msp.types.Instrucoes )((Object)prog)));if (tom_is_sort_Instrucao(tomMatch9_5)) {if (tom_is_fun_sym_ALabel((( maqv.msp.types.Instrucao )tomMatch9_5))) { String  tom_l=tom_get_slot_ALabel_id(tomMatch9_5); maqv.msp.types.Instrucoes  tom_insts=tom_get_tail_Instrucoes_Instrucoes((( maqv.msp.types.Instrucoes )((Object)prog)));

				if (label.equals(tom_l)) {
					if(tom_l.startsWith("f:")){
						actualFuncName = tom_l;
					}
					return tom_insts; 
				}else{
					return jmp(tom_insts,label);
				}
			}}}}}}{if (tom_is_sort_Instrucoes(((Object)prog))) {if (tom_is_fun_sym_Instrucoes((( maqv.msp.types.Instrucoes )(( maqv.msp.types.Instrucoes )((Object)prog))))) {if (!(tom_is_empty_Instrucoes_Instrucoes((( maqv.msp.types.Instrucoes )((Object)prog))))) {
 return jmp(tom_get_tail_Instrucoes_Instrucoes((( maqv.msp.types.Instrucoes )((Object)prog))),label); }}}}}

		return tom_empty_list_Instrucoes();
	}

	private void pushFuncs(Termo termo){
		{{if (tom_is_sort_Stackk(((Object)stackFuncs))) {if (tom_is_fun_sym_Stackk((( maqv.msp.types.Stackk )(( maqv.msp.types.Stackk )((Object)stackFuncs))))) {

				this.stackFuncs = tom_cons_list_Stackk(termo,tom_append_list_Stackk((( maqv.msp.types.Stackk )((Object)stackFuncs)),tom_empty_list_Stackk()));
			}}}}

	}

	private void pushStack(Termo termo){
		{{if (tom_is_sort_Stackk(((Object)stack))) {if (tom_is_fun_sym_Stackk((( maqv.msp.types.Stackk )(( maqv.msp.types.Stackk )((Object)stack))))) {
 this.stack = tom_cons_list_Stackk(termo,tom_append_list_Stackk((( maqv.msp.types.Stackk )((Object)stack)),tom_empty_list_Stackk())); }}}}

	}

	private void popFuncs(){
		{{if (tom_is_sort_Stackk(((Object)stackFuncs))) {if (tom_is_fun_sym_Stackk((( maqv.msp.types.Stackk )(( maqv.msp.types.Stackk )((Object)stackFuncs))))) {if (!(tom_is_empty_Stackk_Stackk((( maqv.msp.types.Stackk )((Object)stackFuncs))))) {

				this.stackFuncs = tom_append_list_Stackk(tom_get_tail_Stackk_Stackk((( maqv.msp.types.Stackk )((Object)stackFuncs))),tom_empty_list_Stackk());
			}}}}}

	}

	private void popStack(){
		{{if (tom_is_sort_Stackk(((Object)stack))) {if (tom_is_fun_sym_Stackk((( maqv.msp.types.Stackk )(( maqv.msp.types.Stackk )((Object)stack))))) {if (!(tom_is_empty_Stackk_Stackk((( maqv.msp.types.Stackk )((Object)stack))))) {
 this.stack = tom_append_list_Stackk(tom_get_tail_Stackk_Stackk((( maqv.msp.types.Stackk )((Object)stack))),tom_empty_list_Stackk()); }}}}}

	}

	private Termo topFuncs(){
		{{if (tom_is_sort_Stackk(((Object)stackFuncs))) {if (tom_is_fun_sym_Stackk((( maqv.msp.types.Stackk )(( maqv.msp.types.Stackk )((Object)stackFuncs))))) {if (!(tom_is_empty_Stackk_Stackk((( maqv.msp.types.Stackk )((Object)stackFuncs))))) {
 return tom_get_head_Stackk_Stackk((( maqv.msp.types.Stackk )((Object)stackFuncs))); }}}}}

		return tom_make_Vazio();
	}

	private Termo topStack() {
		{{if (tom_is_sort_Stackk(((Object)stack))) {if (tom_is_fun_sym_Stackk((( maqv.msp.types.Stackk )(( maqv.msp.types.Stackk )((Object)stack))))) {if (!(tom_is_empty_Stackk_Stackk((( maqv.msp.types.Stackk )((Object)stack))))) {
 return tom_get_head_Stackk_Stackk((( maqv.msp.types.Stackk )((Object)stack))); }}}}}

		return tom_make_Vazio();
	}

	private void memAlloc(String symbol, int initMemAddress, int size) {
		Integer memAddress = symbols.get(symbol);
		if (memAddress == null) {
			symbols.put(symbol, initMemAddress);
			for (int i = 0; i < size; i++){
				heap.add(initMemAddress + i,tom_make_Vazio());
			}
		}
	}

	private int getMemAddress(String symbol) {
		return symbols.get(symbol);
	}

	private Termo getMem(int memAddress) {
		return heap.get(memAddress);
	}

	private void putMem(int memAddress, Termo value) {
		heap.set(memAddress,value);
	}

	public String run(Instrucoes prog) {
		pc++;
		Instrucoes orig = this.original;
		{{if (tom_is_sort_Instrucoes(((Object)prog))) {if (tom_is_fun_sym_Instrucoes((( maqv.msp.types.Instrucoes )(( maqv.msp.types.Instrucoes )((Object)prog))))) {if (!(tom_is_empty_Instrucoes_Instrucoes((( maqv.msp.types.Instrucoes )((Object)prog))))) { maqv.msp.types.Instrucao  tom_inst=tom_get_head_Instrucoes_Instrucoes((( maqv.msp.types.Instrucoes )((Object)prog))); maqv.msp.types.Instrucoes  tom_instrs=tom_get_tail_Instrucoes_Instrucoes((( maqv.msp.types.Instrucoes )((Object)prog)));{{if (tom_is_sort_Instrucao(((Object)tom_inst))) {if (tom_is_sort_Instrucao((( maqv.msp.types.Instrucao )((Object)tom_inst)))) {if (tom_is_fun_sym_ALabel((( maqv.msp.types.Instrucao )(( maqv.msp.types.Instrucao )((Object)tom_inst))))) { String  tom_id=tom_get_slot_ALabel_id((( maqv.msp.types.Instrucao )((Object)tom_inst)));



						int n = metricas.get("ALabel");
						metricas.put("ALabel",++n);
						if(tom_id.startsWith("f:")){
							actualFuncName=tom_id;
						}
						return run(tom_instrs);
					}}}}{if (tom_is_sort_Instrucao(((Object)tom_inst))) {if (tom_is_sort_Instrucao((( maqv.msp.types.Instrucao )((Object)tom_inst)))) {if (tom_is_fun_sym_Call((( maqv.msp.types.Instrucao )(( maqv.msp.types.Instrucao )((Object)tom_inst))))) { String  tom_id=tom_get_slot_Call_id((( maqv.msp.types.Instrucao )((Object)tom_inst)));

						int n = metricas.get("Call");
						metricas.put("Call",++n);
						pushFuncs(tom_make_S(actualFuncName));
						pushFuncs(tom_make_S(tom_id));
						prog = jmp(orig,tom_id);
						return run(prog);
					}}}}{if (tom_is_sort_Instrucao(((Object)tom_inst))) {if (tom_is_sort_Instrucao((( maqv.msp.types.Instrucao )((Object)tom_inst)))) {if (tom_is_fun_sym_Ret((( maqv.msp.types.Instrucao )(( maqv.msp.types.Instrucao )((Object)tom_inst))))) {

						int n = metricas.get("Ret");
						metricas.put("Ret",++n);
						Termo calledLabel = topFuncs(); 
						popFuncs();
						Termo callerFLabel = topFuncs();
						popFuncs();
						String called = "", callerF = "";
						{{if (tom_is_sort_Termo(((Object)calledLabel))) {if (tom_is_sort_Termo((( maqv.msp.types.Termo )((Object)calledLabel)))) {if (tom_is_fun_sym_S((( maqv.msp.types.Termo )(( maqv.msp.types.Termo )((Object)calledLabel))))) {

								called = tom_get_slot_S_id((( maqv.msp.types.Termo )((Object)calledLabel)));
							}}}}{if (tom_is_sort_Termo(((Object)calledLabel))) {if (tom_is_sort_Termo((( maqv.msp.types.Termo )((Object)calledLabel)))) {if (tom_is_fun_sym_I((( maqv.msp.types.Termo )(( maqv.msp.types.Termo )((Object)calledLabel))))) { int  tom_valor=tom_get_slot_I_i((( maqv.msp.types.Termo )((Object)calledLabel)));
 
								pc = tom_valor;
								prog = getNInstr(orig,tom_valor);
							}}}}}{{if (tom_is_sort_Termo(((Object)callerFLabel))) {if (tom_is_sort_Termo((( maqv.msp.types.Termo )((Object)callerFLabel)))) {if (tom_is_fun_sym_S((( maqv.msp.types.Termo )(( maqv.msp.types.Termo )((Object)callerFLabel))))) { String  tom_id=tom_get_slot_S_id((( maqv.msp.types.Termo )((Object)callerFLabel)));


								actualFuncName = tom_id;
								callerF = tom_id;
							}}}}}

						prog = getNInstr(orig,callerF,called);
						return run(prog);
					}}}}{if (tom_is_sort_Instrucao(((Object)tom_inst))) {if (tom_is_sort_Instrucao((( maqv.msp.types.Instrucao )((Object)tom_inst)))) {if (tom_is_fun_sym_Add((( maqv.msp.types.Instrucao )(( maqv.msp.types.Instrucao )((Object)tom_inst))))) {

						int n = metricas.get("Add");
						metricas.put("Add",++n);
						{{if (tom_is_sort_Stackk(((Object)stack))) {if (tom_is_fun_sym_Stackk((( maqv.msp.types.Stackk )(( maqv.msp.types.Stackk )((Object)stack))))) {if (!(tom_is_empty_Stackk_Stackk((( maqv.msp.types.Stackk )((Object)stack))))) { maqv.msp.types.Termo  tomMatch20_6=tom_get_head_Stackk_Stackk((( maqv.msp.types.Stackk )((Object)stack)));if (tom_is_sort_Termo(tomMatch20_6)) {if (tom_is_fun_sym_I((( maqv.msp.types.Termo )tomMatch20_6))) { maqv.msp.types.Stackk  tomMatch20_2=tom_get_tail_Stackk_Stackk((( maqv.msp.types.Stackk )((Object)stack)));if (!(tom_is_empty_Stackk_Stackk(tomMatch20_2))) { maqv.msp.types.Termo  tomMatch20_9=tom_get_head_Stackk_Stackk(tomMatch20_2);if (tom_is_sort_Termo(tomMatch20_9)) {if (tom_is_fun_sym_I((( maqv.msp.types.Termo )tomMatch20_9))) {
 
								stack = tom_get_tail_Stackk_Stackk(tomMatch20_2);
								int resultado = tom_get_slot_I_i(tomMatch20_9)+tom_get_slot_I_i(tomMatch20_6);
								pushStack(tom_make_I(resultado));
								return run(tom_instrs);
							}}}}}}}}}}

					}}}}{if (tom_is_sort_Instrucao(((Object)tom_inst))) {if (tom_is_sort_Instrucao((( maqv.msp.types.Instrucao )((Object)tom_inst)))) {if (tom_is_fun_sym_Sub((( maqv.msp.types.Instrucao )(( maqv.msp.types.Instrucao )((Object)tom_inst))))) {

						int n = metricas.get("Sub");
						metricas.put("Sub",++n);
						{{if (tom_is_sort_Stackk(((Object)stack))) {if (tom_is_fun_sym_Stackk((( maqv.msp.types.Stackk )(( maqv.msp.types.Stackk )((Object)stack))))) {if (!(tom_is_empty_Stackk_Stackk((( maqv.msp.types.Stackk )((Object)stack))))) { maqv.msp.types.Termo  tomMatch21_6=tom_get_head_Stackk_Stackk((( maqv.msp.types.Stackk )((Object)stack)));if (tom_is_sort_Termo(tomMatch21_6)) {if (tom_is_fun_sym_I((( maqv.msp.types.Termo )tomMatch21_6))) { maqv.msp.types.Stackk  tomMatch21_2=tom_get_tail_Stackk_Stackk((( maqv.msp.types.Stackk )((Object)stack)));if (!(tom_is_empty_Stackk_Stackk(tomMatch21_2))) { maqv.msp.types.Termo  tomMatch21_9=tom_get_head_Stackk_Stackk(tomMatch21_2);if (tom_is_sort_Termo(tomMatch21_9)) {if (tom_is_fun_sym_I((( maqv.msp.types.Termo )tomMatch21_9))) {
 
								stack = tom_get_tail_Stackk_Stackk(tomMatch21_2);
								int resultado = tom_get_slot_I_i(tomMatch21_9)- tom_get_slot_I_i(tomMatch21_6);
								pushStack(tom_make_I(resultado));
								return run(tom_instrs);
							}}}}}}}}}}

					}}}}{if (tom_is_sort_Instrucao(((Object)tom_inst))) {if (tom_is_sort_Instrucao((( maqv.msp.types.Instrucao )((Object)tom_inst)))) {if (tom_is_fun_sym_Div((( maqv.msp.types.Instrucao )(( maqv.msp.types.Instrucao )((Object)tom_inst))))) {

						int n = metricas.get("Div");
						metricas.put("Div",++n);
						{{if (tom_is_sort_Stackk(((Object)stack))) {if (tom_is_fun_sym_Stackk((( maqv.msp.types.Stackk )(( maqv.msp.types.Stackk )((Object)stack))))) {if (!(tom_is_empty_Stackk_Stackk((( maqv.msp.types.Stackk )((Object)stack))))) { maqv.msp.types.Termo  tomMatch22_6=tom_get_head_Stackk_Stackk((( maqv.msp.types.Stackk )((Object)stack)));if (tom_is_sort_Termo(tomMatch22_6)) {if (tom_is_fun_sym_I((( maqv.msp.types.Termo )tomMatch22_6))) { maqv.msp.types.Stackk  tomMatch22_2=tom_get_tail_Stackk_Stackk((( maqv.msp.types.Stackk )((Object)stack)));if (!(tom_is_empty_Stackk_Stackk(tomMatch22_2))) { maqv.msp.types.Termo  tomMatch22_9=tom_get_head_Stackk_Stackk(tomMatch22_2);if (tom_is_sort_Termo(tomMatch22_9)) {if (tom_is_fun_sym_I((( maqv.msp.types.Termo )tomMatch22_9))) {
 
								stack = tom_get_tail_Stackk_Stackk(tomMatch22_2);
								int resultado = tom_get_slot_I_i(tomMatch22_9)/ tom_get_slot_I_i(tomMatch22_6);
								pushStack(tom_make_I(resultado));
								return run(tom_instrs);
							}}}}}}}}}}

					}}}}{if (tom_is_sort_Instrucao(((Object)tom_inst))) {if (tom_is_sort_Instrucao((( maqv.msp.types.Instrucao )((Object)tom_inst)))) {if (tom_is_fun_sym_Mul((( maqv.msp.types.Instrucao )(( maqv.msp.types.Instrucao )((Object)tom_inst))))) {

						int n = metricas.get("Mul");
						metricas.put("Mul",++n);
						{{if (tom_is_sort_Stackk(((Object)stack))) {if (tom_is_fun_sym_Stackk((( maqv.msp.types.Stackk )(( maqv.msp.types.Stackk )((Object)stack))))) {if (!(tom_is_empty_Stackk_Stackk((( maqv.msp.types.Stackk )((Object)stack))))) { maqv.msp.types.Termo  tomMatch23_6=tom_get_head_Stackk_Stackk((( maqv.msp.types.Stackk )((Object)stack)));if (tom_is_sort_Termo(tomMatch23_6)) {if (tom_is_fun_sym_I((( maqv.msp.types.Termo )tomMatch23_6))) { maqv.msp.types.Stackk  tomMatch23_2=tom_get_tail_Stackk_Stackk((( maqv.msp.types.Stackk )((Object)stack)));if (!(tom_is_empty_Stackk_Stackk(tomMatch23_2))) { maqv.msp.types.Termo  tomMatch23_9=tom_get_head_Stackk_Stackk(tomMatch23_2);if (tom_is_sort_Termo(tomMatch23_9)) {if (tom_is_fun_sym_I((( maqv.msp.types.Termo )tomMatch23_9))) {
 
								stack = tom_get_tail_Stackk_Stackk(tomMatch23_2);
								int resultado = tom_get_slot_I_i(tomMatch23_9)* tom_get_slot_I_i(tomMatch23_6);
								pushStack(tom_make_I(resultado));
								return run(tom_instrs);
							}}}}}}}}}}

					}}}}{if (tom_is_sort_Instrucao(((Object)tom_inst))) {if (tom_is_sort_Instrucao((( maqv.msp.types.Instrucao )((Object)tom_inst)))) {if (tom_is_fun_sym_Mod((( maqv.msp.types.Instrucao )(( maqv.msp.types.Instrucao )((Object)tom_inst))))) {

						int n = metricas.get("Mod");
						metricas.put("Mod",++n);
						{{if (tom_is_sort_Stackk(((Object)stack))) {if (tom_is_fun_sym_Stackk((( maqv.msp.types.Stackk )(( maqv.msp.types.Stackk )((Object)stack))))) {if (!(tom_is_empty_Stackk_Stackk((( maqv.msp.types.Stackk )((Object)stack))))) { maqv.msp.types.Termo  tomMatch24_6=tom_get_head_Stackk_Stackk((( maqv.msp.types.Stackk )((Object)stack)));if (tom_is_sort_Termo(tomMatch24_6)) {if (tom_is_fun_sym_I((( maqv.msp.types.Termo )tomMatch24_6))) { maqv.msp.types.Stackk  tomMatch24_2=tom_get_tail_Stackk_Stackk((( maqv.msp.types.Stackk )((Object)stack)));if (!(tom_is_empty_Stackk_Stackk(tomMatch24_2))) { maqv.msp.types.Termo  tomMatch24_9=tom_get_head_Stackk_Stackk(tomMatch24_2);if (tom_is_sort_Termo(tomMatch24_9)) {if (tom_is_fun_sym_I((( maqv.msp.types.Termo )tomMatch24_9))) {
 
								stack = tom_get_tail_Stackk_Stackk(tomMatch24_2);
								int resultado = tom_get_slot_I_i(tomMatch24_9)% tom_get_slot_I_i(tomMatch24_6);
								pushStack(tom_make_I(resultado));
								return run(tom_instrs);
							}}}}}}}}}}

					}}}}{if (tom_is_sort_Instrucao(((Object)tom_inst))) {if (tom_is_sort_Instrucao((( maqv.msp.types.Instrucao )((Object)tom_inst)))) {if (tom_is_fun_sym_Inc((( maqv.msp.types.Instrucao )(( maqv.msp.types.Instrucao )((Object)tom_inst))))) {

						int n = metricas.get("Inc");
						metricas.put("Inc",++n);
						Termo t = topStack();
						popStack();
						{{if (tom_is_sort_Termo(((Object)t))) {if (tom_is_sort_Termo((( maqv.msp.types.Termo )((Object)t)))) {if (tom_is_fun_sym_I((( maqv.msp.types.Termo )(( maqv.msp.types.Termo )((Object)t))))) { int  tom_memAddress=tom_get_slot_I_i((( maqv.msp.types.Termo )((Object)t)));
 
								Termo t2 = getMem(tom_memAddress);
								int valorToInc = 0;
								{{if (tom_is_sort_Termo(((Object)t2))) {if (tom_is_sort_Termo((( maqv.msp.types.Termo )((Object)t2)))) {if (tom_is_fun_sym_I((( maqv.msp.types.Termo )(( maqv.msp.types.Termo )((Object)t2))))) {
 valorToInc = tom_get_slot_I_i((( maqv.msp.types.Termo )((Object)t2)))+1; }}}}}

								putMem(tom_memAddress,tom_make_I(valorToInc));
								
								return run(tom_instrs);
							}}}}}

						return run(tom_instrs);
					}}}}{if (tom_is_sort_Instrucao(((Object)tom_inst))) {if (tom_is_sort_Instrucao((( maqv.msp.types.Instrucao )((Object)tom_inst)))) {if (tom_is_fun_sym_Dec((( maqv.msp.types.Instrucao )(( maqv.msp.types.Instrucao )((Object)tom_inst))))) {

						int n = metricas.get("Dec");
						metricas.put("Dec",++n);
						Termo t = topStack();
						popStack();
						{{if (tom_is_sort_Termo(((Object)t))) {if (tom_is_sort_Termo((( maqv.msp.types.Termo )((Object)t)))) {if (tom_is_fun_sym_I((( maqv.msp.types.Termo )(( maqv.msp.types.Termo )((Object)t))))) { int  tom_memAddress=tom_get_slot_I_i((( maqv.msp.types.Termo )((Object)t)));
 
								Termo t2 = getMem(tom_memAddress);
								int valorToDec = 0;
								{{if (tom_is_sort_Termo(((Object)t2))) {if (tom_is_sort_Termo((( maqv.msp.types.Termo )((Object)t2)))) {if (tom_is_fun_sym_I((( maqv.msp.types.Termo )(( maqv.msp.types.Termo )((Object)t2))))) {
 valorToDec = tom_get_slot_I_i((( maqv.msp.types.Termo )((Object)t2)))-1; }}}}}

								putMem(tom_memAddress,tom_make_I(valorToDec));
								
								return run(tom_instrs);
							}}}}}

						return run(tom_instrs);
					}}}}{if (tom_is_sort_Instrucao(((Object)tom_inst))) {if (tom_is_sort_Instrucao((( maqv.msp.types.Instrucao )((Object)tom_inst)))) {if (tom_is_fun_sym_Eq((( maqv.msp.types.Instrucao )(( maqv.msp.types.Instrucao )((Object)tom_inst))))) {

						int n = metricas.get("Eq");
						metricas.put("Eq",++n);
						{{if (tom_is_sort_Stackk(((Object)stack))) {if (tom_is_fun_sym_Stackk((( maqv.msp.types.Stackk )(( maqv.msp.types.Stackk )((Object)stack))))) {if (!(tom_is_empty_Stackk_Stackk((( maqv.msp.types.Stackk )((Object)stack))))) { maqv.msp.types.Termo  tomMatch29_6=tom_get_head_Stackk_Stackk((( maqv.msp.types.Stackk )((Object)stack)));if (tom_is_sort_Termo(tomMatch29_6)) {if (tom_is_fun_sym_I((( maqv.msp.types.Termo )tomMatch29_6))) { maqv.msp.types.Stackk  tomMatch29_2=tom_get_tail_Stackk_Stackk((( maqv.msp.types.Stackk )((Object)stack)));if (!(tom_is_empty_Stackk_Stackk(tomMatch29_2))) { maqv.msp.types.Termo  tomMatch29_9=tom_get_head_Stackk_Stackk(tomMatch29_2);if (tom_is_sort_Termo(tomMatch29_9)) {if (tom_is_fun_sym_I((( maqv.msp.types.Termo )tomMatch29_9))) {
 
								stack = tom_get_tail_Stackk_Stackk(tomMatch29_2);
								Boool resultado = (tom_get_slot_I_i(tomMatch29_9)== tom_get_slot_I_i(tomMatch29_6)) ? tom_make_True() : tom_make_False();
								pushStack(tom_make_B(resultado));
								return run(tom_instrs);
							}}}}}}}}}}

					}}}}{if (tom_is_sort_Instrucao(((Object)tom_inst))) {if (tom_is_sort_Instrucao((( maqv.msp.types.Instrucao )((Object)tom_inst)))) {if (tom_is_fun_sym_Neq((( maqv.msp.types.Instrucao )(( maqv.msp.types.Instrucao )((Object)tom_inst))))) {
 
						int n = metricas.get("Neq");
						metricas.put("Neq",++n);
						{{if (tom_is_sort_Stackk(((Object)stack))) {if (tom_is_fun_sym_Stackk((( maqv.msp.types.Stackk )(( maqv.msp.types.Stackk )((Object)stack))))) {if (!(tom_is_empty_Stackk_Stackk((( maqv.msp.types.Stackk )((Object)stack))))) { maqv.msp.types.Termo  tomMatch30_6=tom_get_head_Stackk_Stackk((( maqv.msp.types.Stackk )((Object)stack)));if (tom_is_sort_Termo(tomMatch30_6)) {if (tom_is_fun_sym_I((( maqv.msp.types.Termo )tomMatch30_6))) { maqv.msp.types.Stackk  tomMatch30_2=tom_get_tail_Stackk_Stackk((( maqv.msp.types.Stackk )((Object)stack)));if (!(tom_is_empty_Stackk_Stackk(tomMatch30_2))) { maqv.msp.types.Termo  tomMatch30_9=tom_get_head_Stackk_Stackk(tomMatch30_2);if (tom_is_sort_Termo(tomMatch30_9)) {if (tom_is_fun_sym_I((( maqv.msp.types.Termo )tomMatch30_9))) {
 
								stack = tom_get_tail_Stackk_Stackk(tomMatch30_2);
								Boool resultado = (tom_get_slot_I_i(tomMatch30_9)== tom_get_slot_I_i(tomMatch30_6)) ? tom_make_False() : tom_make_True();
								pushStack(tom_make_B(resultado));
								return run(tom_instrs);
							}}}}}}}}}}

					}}}}{if (tom_is_sort_Instrucao(((Object)tom_inst))) {if (tom_is_sort_Instrucao((( maqv.msp.types.Instrucao )((Object)tom_inst)))) {if (tom_is_fun_sym_Gt((( maqv.msp.types.Instrucao )(( maqv.msp.types.Instrucao )((Object)tom_inst))))) {

						int n = metricas.get("Gt");
						metricas.put("Gt",++n);
						{{if (tom_is_sort_Stackk(((Object)stack))) {if (tom_is_fun_sym_Stackk((( maqv.msp.types.Stackk )(( maqv.msp.types.Stackk )((Object)stack))))) {if (!(tom_is_empty_Stackk_Stackk((( maqv.msp.types.Stackk )((Object)stack))))) { maqv.msp.types.Termo  tomMatch31_6=tom_get_head_Stackk_Stackk((( maqv.msp.types.Stackk )((Object)stack)));if (tom_is_sort_Termo(tomMatch31_6)) {if (tom_is_fun_sym_I((( maqv.msp.types.Termo )tomMatch31_6))) { maqv.msp.types.Stackk  tomMatch31_2=tom_get_tail_Stackk_Stackk((( maqv.msp.types.Stackk )((Object)stack)));if (!(tom_is_empty_Stackk_Stackk(tomMatch31_2))) { maqv.msp.types.Termo  tomMatch31_9=tom_get_head_Stackk_Stackk(tomMatch31_2);if (tom_is_sort_Termo(tomMatch31_9)) {if (tom_is_fun_sym_I((( maqv.msp.types.Termo )tomMatch31_9))) {
 
								stack = tom_get_tail_Stackk_Stackk(tomMatch31_2);
								Boool resultado = (tom_get_slot_I_i(tomMatch31_9)> tom_get_slot_I_i(tomMatch31_6)) ? tom_make_True() : tom_make_False();
								pushStack(tom_make_B(resultado));
								return run(tom_instrs);
							}}}}}}}}}}

					}}}}{if (tom_is_sort_Instrucao(((Object)tom_inst))) {if (tom_is_sort_Instrucao((( maqv.msp.types.Instrucao )((Object)tom_inst)))) {if (tom_is_fun_sym_GoEq((( maqv.msp.types.Instrucao )(( maqv.msp.types.Instrucao )((Object)tom_inst))))) {

						int n = metricas.get("GoEq");
						metricas.put("GoEq",++n);
						{{if (tom_is_sort_Stackk(((Object)stack))) {if (tom_is_fun_sym_Stackk((( maqv.msp.types.Stackk )(( maqv.msp.types.Stackk )((Object)stack))))) {if (!(tom_is_empty_Stackk_Stackk((( maqv.msp.types.Stackk )((Object)stack))))) { maqv.msp.types.Termo  tomMatch32_6=tom_get_head_Stackk_Stackk((( maqv.msp.types.Stackk )((Object)stack)));if (tom_is_sort_Termo(tomMatch32_6)) {if (tom_is_fun_sym_I((( maqv.msp.types.Termo )tomMatch32_6))) { maqv.msp.types.Stackk  tomMatch32_2=tom_get_tail_Stackk_Stackk((( maqv.msp.types.Stackk )((Object)stack)));if (!(tom_is_empty_Stackk_Stackk(tomMatch32_2))) { maqv.msp.types.Termo  tomMatch32_9=tom_get_head_Stackk_Stackk(tomMatch32_2);if (tom_is_sort_Termo(tomMatch32_9)) {if (tom_is_fun_sym_I((( maqv.msp.types.Termo )tomMatch32_9))) {
 
								stack = tom_get_tail_Stackk_Stackk(tomMatch32_2);
								Boool resultado = (tom_get_slot_I_i(tomMatch32_9)>= tom_get_slot_I_i(tomMatch32_6)) ? tom_make_True() : tom_make_False();
								pushStack(tom_make_B(resultado));
								return run(tom_instrs);
							}}}}}}}}}}

					}}}}{if (tom_is_sort_Instrucao(((Object)tom_inst))) {if (tom_is_sort_Instrucao((( maqv.msp.types.Instrucao )((Object)tom_inst)))) {if (tom_is_fun_sym_Lt((( maqv.msp.types.Instrucao )(( maqv.msp.types.Instrucao )((Object)tom_inst))))) {

						int n = metricas.get("Lt");
						metricas.put("Lt",++n);
						{{if (tom_is_sort_Stackk(((Object)stack))) {if (tom_is_fun_sym_Stackk((( maqv.msp.types.Stackk )(( maqv.msp.types.Stackk )((Object)stack))))) {if (!(tom_is_empty_Stackk_Stackk((( maqv.msp.types.Stackk )((Object)stack))))) { maqv.msp.types.Termo  tomMatch33_6=tom_get_head_Stackk_Stackk((( maqv.msp.types.Stackk )((Object)stack)));if (tom_is_sort_Termo(tomMatch33_6)) {if (tom_is_fun_sym_I((( maqv.msp.types.Termo )tomMatch33_6))) { maqv.msp.types.Stackk  tomMatch33_2=tom_get_tail_Stackk_Stackk((( maqv.msp.types.Stackk )((Object)stack)));if (!(tom_is_empty_Stackk_Stackk(tomMatch33_2))) { maqv.msp.types.Termo  tomMatch33_9=tom_get_head_Stackk_Stackk(tomMatch33_2);if (tom_is_sort_Termo(tomMatch33_9)) {if (tom_is_fun_sym_I((( maqv.msp.types.Termo )tomMatch33_9))) {
 
								stack = tom_get_tail_Stackk_Stackk(tomMatch33_2);
								Boool resultado = (tom_get_slot_I_i(tomMatch33_9)< tom_get_slot_I_i(tomMatch33_6)) ? tom_make_True() : tom_make_False();
								pushStack(tom_make_B(resultado));
								return run(tom_instrs);
							}}}}}}}}}}

					}}}}{if (tom_is_sort_Instrucao(((Object)tom_inst))) {if (tom_is_sort_Instrucao((( maqv.msp.types.Instrucao )((Object)tom_inst)))) {if (tom_is_fun_sym_LoEq((( maqv.msp.types.Instrucao )(( maqv.msp.types.Instrucao )((Object)tom_inst))))) {

						int n = metricas.get("LoEq");
						metricas.put("LoEq",++n);
						{{if (tom_is_sort_Stackk(((Object)stack))) {if (tom_is_fun_sym_Stackk((( maqv.msp.types.Stackk )(( maqv.msp.types.Stackk )((Object)stack))))) {if (!(tom_is_empty_Stackk_Stackk((( maqv.msp.types.Stackk )((Object)stack))))) { maqv.msp.types.Termo  tomMatch34_6=tom_get_head_Stackk_Stackk((( maqv.msp.types.Stackk )((Object)stack)));if (tom_is_sort_Termo(tomMatch34_6)) {if (tom_is_fun_sym_I((( maqv.msp.types.Termo )tomMatch34_6))) { maqv.msp.types.Stackk  tomMatch34_2=tom_get_tail_Stackk_Stackk((( maqv.msp.types.Stackk )((Object)stack)));if (!(tom_is_empty_Stackk_Stackk(tomMatch34_2))) { maqv.msp.types.Termo  tomMatch34_9=tom_get_head_Stackk_Stackk(tomMatch34_2);if (tom_is_sort_Termo(tomMatch34_9)) {if (tom_is_fun_sym_I((( maqv.msp.types.Termo )tomMatch34_9))) {
 
								stack = tom_get_tail_Stackk_Stackk(tomMatch34_2);
								Boool resultado = (tom_get_slot_I_i(tomMatch34_9)<=tom_get_slot_I_i(tomMatch34_6)) ? tom_make_True() : tom_make_False();
								pushStack(tom_make_B(resultado));
								return run(tom_instrs);
							}}}}}}}}}}

					}}}}{if (tom_is_sort_Instrucao(((Object)tom_inst))) {if (tom_is_sort_Instrucao((( maqv.msp.types.Instrucao )((Object)tom_inst)))) {if (tom_is_fun_sym_Nott((( maqv.msp.types.Instrucao )(( maqv.msp.types.Instrucao )((Object)tom_inst))))) {

						int n = metricas.get("Nott");
						metricas.put("Nott",++n);
						Termo t = topStack();
						popStack();
						{{if (tom_is_sort_Termo(((Object)t))) {if (tom_is_sort_Termo((( maqv.msp.types.Termo )((Object)t)))) {if (tom_is_fun_sym_I((( maqv.msp.types.Termo )(( maqv.msp.types.Termo )((Object)t))))) {pushStack((( maqv.msp.types.Termo )((Object)t)))
; }}}}{if (tom_is_sort_Termo(((Object)t))) {if (tom_is_sort_Termo((( maqv.msp.types.Termo )((Object)t)))) {if (tom_is_fun_sym_S((( maqv.msp.types.Termo )(( maqv.msp.types.Termo )((Object)t))))) {pushStack((( maqv.msp.types.Termo )((Object)t)))
; }}}}{if (tom_is_sort_Termo(((Object)t))) {if (tom_is_sort_Termo((( maqv.msp.types.Termo )((Object)t)))) {if (tom_is_fun_sym_F((( maqv.msp.types.Termo )(( maqv.msp.types.Termo )((Object)t))))) {pushStack((( maqv.msp.types.Termo )((Object)t)))
; }}}}{if (tom_is_sort_Termo(((Object)t))) {if (tom_is_sort_Termo((( maqv.msp.types.Termo )((Object)t)))) {if (tom_is_fun_sym_B((( maqv.msp.types.Termo )(( maqv.msp.types.Termo )((Object)t))))) { maqv.msp.types.Boool  tomMatch35_13=tom_get_slot_B_b((( maqv.msp.types.Termo )((Object)t)));if (tom_is_sort_Boool(tomMatch35_13)) {if (tom_is_fun_sym_True((( maqv.msp.types.Boool )tomMatch35_13))) {pushStack(tom_make_B(tom_make_False()))
; }}}}}}{if (tom_is_sort_Termo(((Object)t))) {if (tom_is_sort_Termo((( maqv.msp.types.Termo )((Object)t)))) {if (tom_is_fun_sym_B((( maqv.msp.types.Termo )(( maqv.msp.types.Termo )((Object)t))))) { maqv.msp.types.Boool  tomMatch35_19=tom_get_slot_B_b((( maqv.msp.types.Termo )((Object)t)));if (tom_is_sort_Boool(tomMatch35_19)) {if (tom_is_fun_sym_False((( maqv.msp.types.Boool )tomMatch35_19))) {pushStack(tom_make_B(tom_make_True()))
; }}}}}}}

						return run(tom_instrs);
					}}}}{if (tom_is_sort_Instrucao(((Object)tom_inst))) {if (tom_is_sort_Instrucao((( maqv.msp.types.Instrucao )((Object)tom_inst)))) {if (tom_is_fun_sym_Or((( maqv.msp.types.Instrucao )(( maqv.msp.types.Instrucao )((Object)tom_inst))))) {

						int n = metricas.get("Or");
						metricas.put("Or",++n);
						{{if (tom_is_sort_Stackk(((Object)stack))) {if (tom_is_fun_sym_Stackk((( maqv.msp.types.Stackk )(( maqv.msp.types.Stackk )((Object)stack))))) {if (!(tom_is_empty_Stackk_Stackk((( maqv.msp.types.Stackk )((Object)stack))))) { maqv.msp.types.Termo  tomMatch36_6=tom_get_head_Stackk_Stackk((( maqv.msp.types.Stackk )((Object)stack)));if (tom_is_sort_Termo(tomMatch36_6)) {if (tom_is_fun_sym_B((( maqv.msp.types.Termo )tomMatch36_6))) { maqv.msp.types.Boool  tom_v2=tom_get_slot_B_b(tomMatch36_6); maqv.msp.types.Stackk  tomMatch36_2=tom_get_tail_Stackk_Stackk((( maqv.msp.types.Stackk )((Object)stack)));if (!(tom_is_empty_Stackk_Stackk(tomMatch36_2))) { maqv.msp.types.Termo  tomMatch36_9=tom_get_head_Stackk_Stackk(tomMatch36_2);if (tom_is_sort_Termo(tomMatch36_9)) {if (tom_is_fun_sym_B((( maqv.msp.types.Termo )tomMatch36_9))) { maqv.msp.types.Boool  tom_v1=tom_get_slot_B_b(tomMatch36_9);
 
								stack = tom_get_tail_Stackk_Stackk(tomMatch36_2);
								boolean valor1 = true, valor2 = true;
								{{if (tom_is_sort_Boool(((Object)tom_v1))) {if (tom_is_sort_Boool((( maqv.msp.types.Boool )((Object)tom_v1)))) {if (tom_is_fun_sym_True((( maqv.msp.types.Boool )(( maqv.msp.types.Boool )((Object)tom_v1))))) {valor1
= true; }}}}{if (tom_is_sort_Boool(((Object)tom_v1))) {if (tom_is_sort_Boool((( maqv.msp.types.Boool )((Object)tom_v1)))) {if (tom_is_fun_sym_False((( maqv.msp.types.Boool )(( maqv.msp.types.Boool )((Object)tom_v1))))) {valor1
= false; }}}}}{{if (tom_is_sort_Boool(((Object)tom_v2))) {if (tom_is_sort_Boool((( maqv.msp.types.Boool )((Object)tom_v2)))) {if (tom_is_fun_sym_True((( maqv.msp.types.Boool )(( maqv.msp.types.Boool )((Object)tom_v2))))) {valor2


= true; }}}}{if (tom_is_sort_Boool(((Object)tom_v2))) {if (tom_is_sort_Boool((( maqv.msp.types.Boool )((Object)tom_v2)))) {if (tom_is_fun_sym_False((( maqv.msp.types.Boool )(( maqv.msp.types.Boool )((Object)tom_v2))))) {valor2
= false; }}}}}

								Boool resultado = (valor1 || valor2) ? tom_make_True() : tom_make_False();
								pushStack(tom_make_B(resultado));
								return run(tom_instrs);
							}}}}}}}}}}

					}}}}{if (tom_is_sort_Instrucao(((Object)tom_inst))) {if (tom_is_sort_Instrucao((( maqv.msp.types.Instrucao )((Object)tom_inst)))) {if (tom_is_fun_sym_And((( maqv.msp.types.Instrucao )(( maqv.msp.types.Instrucao )((Object)tom_inst))))) {

						int n = metricas.get("And");
						metricas.put("And",++n);
						{{if (tom_is_sort_Stackk(((Object)stack))) {if (tom_is_fun_sym_Stackk((( maqv.msp.types.Stackk )(( maqv.msp.types.Stackk )((Object)stack))))) {if (!(tom_is_empty_Stackk_Stackk((( maqv.msp.types.Stackk )((Object)stack))))) { maqv.msp.types.Termo  tomMatch39_6=tom_get_head_Stackk_Stackk((( maqv.msp.types.Stackk )((Object)stack)));if (tom_is_sort_Termo(tomMatch39_6)) {if (tom_is_fun_sym_B((( maqv.msp.types.Termo )tomMatch39_6))) { maqv.msp.types.Boool  tom_v2=tom_get_slot_B_b(tomMatch39_6); maqv.msp.types.Stackk  tomMatch39_2=tom_get_tail_Stackk_Stackk((( maqv.msp.types.Stackk )((Object)stack)));if (!(tom_is_empty_Stackk_Stackk(tomMatch39_2))) { maqv.msp.types.Termo  tomMatch39_9=tom_get_head_Stackk_Stackk(tomMatch39_2);if (tom_is_sort_Termo(tomMatch39_9)) {if (tom_is_fun_sym_B((( maqv.msp.types.Termo )tomMatch39_9))) { maqv.msp.types.Boool  tom_v1=tom_get_slot_B_b(tomMatch39_9);
 
								stack = tom_get_tail_Stackk_Stackk(tomMatch39_2);
								boolean valor1 = true, valor2 = true;
								{{if (tom_is_sort_Boool(((Object)tom_v1))) {if (tom_is_sort_Boool((( maqv.msp.types.Boool )((Object)tom_v1)))) {if (tom_is_fun_sym_True((( maqv.msp.types.Boool )(( maqv.msp.types.Boool )((Object)tom_v1))))) {valor1
= true; }}}}{if (tom_is_sort_Boool(((Object)tom_v1))) {if (tom_is_sort_Boool((( maqv.msp.types.Boool )((Object)tom_v1)))) {if (tom_is_fun_sym_False((( maqv.msp.types.Boool )(( maqv.msp.types.Boool )((Object)tom_v1))))) {valor1
= false; }}}}}{{if (tom_is_sort_Boool(((Object)tom_v2))) {if (tom_is_sort_Boool((( maqv.msp.types.Boool )((Object)tom_v2)))) {if (tom_is_fun_sym_True((( maqv.msp.types.Boool )(( maqv.msp.types.Boool )((Object)tom_v2))))) {valor2


= true; }}}}{if (tom_is_sort_Boool(((Object)tom_v2))) {if (tom_is_sort_Boool((( maqv.msp.types.Boool )((Object)tom_v2)))) {if (tom_is_fun_sym_False((( maqv.msp.types.Boool )(( maqv.msp.types.Boool )((Object)tom_v2))))) {valor2
= false; }}}}}

								Boool resultado = (valor1 && valor2) ? tom_make_True() : tom_make_False();
								pushStack(tom_make_B(resultado));
								return run(tom_instrs);
							}}}}}}}}}}

					}}}}{if (tom_is_sort_Instrucao(((Object)tom_inst))) {if (tom_is_sort_Instrucao((( maqv.msp.types.Instrucao )((Object)tom_inst)))) {if (tom_is_fun_sym_Halt((( maqv.msp.types.Instrucao )(( maqv.msp.types.Instrucao )((Object)tom_inst))))) {
 
						int n = metricas.get("Halt");
						metricas.put("Halt",++n);
						return "";
						 }}}}{if (tom_is_sort_Instrucao(((Object)tom_inst))) {if (tom_is_sort_Instrucao((( maqv.msp.types.Instrucao )((Object)tom_inst)))) {if (tom_is_fun_sym_IIn((( maqv.msp.types.Instrucao )(( maqv.msp.types.Instrucao )((Object)tom_inst))))) { maqv.msp.types.DefTipo  tom_tipo=tom_get_slot_IIn_tipo((( maqv.msp.types.Instrucao )((Object)tom_inst)));

						int n = metricas.get("IIn");
						metricas.put("IIn",++n);
						BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
						try{
							String iin = br.readLine();
							{{if (tom_is_sort_DefTipo(((Object)tom_tipo))) {if (tom_is_sort_DefTipo((( maqv.msp.types.DefTipo )((Object)tom_tipo)))) {if (tom_is_fun_sym_DInt((( maqv.msp.types.DefTipo )(( maqv.msp.types.DefTipo )((Object)tom_tipo))))) {

									try{
										int v1 = Integer.parseInt(iin);
										pushStack(tom_make_I(v1));
									}catch(NumberFormatException nfe){
										System.err.println("Invalid Format!");
									}
								}}}}{if (tom_is_sort_DefTipo(((Object)tom_tipo))) {if (tom_is_sort_DefTipo((( maqv.msp.types.DefTipo )((Object)tom_tipo)))) {if (tom_is_fun_sym_DChar((( maqv.msp.types.DefTipo )(( maqv.msp.types.DefTipo )((Object)tom_tipo))))) {

									String s = ""+iin.charAt(0);
									pushStack(tom_make_S(s));
								}}}}{if (tom_is_sort_DefTipo(((Object)tom_tipo))) {if (tom_is_sort_DefTipo((( maqv.msp.types.DefTipo )((Object)tom_tipo)))) {if (tom_is_fun_sym_DBoolean((( maqv.msp.types.DefTipo )(( maqv.msp.types.DefTipo )((Object)tom_tipo))))) {

									if (iin.equalsIgnoreCase("true")) { pushStack(tom_make_B(tom_make_True())); }
									else if (iin.equalsIgnoreCase("false")) { pushStack(tom_make_B(tom_make_False())); }
									else { System.err.println("Invalid Format!"); }
								}}}}{if (tom_is_sort_DefTipo(((Object)tom_tipo))) {if (tom_is_sort_DefTipo((( maqv.msp.types.DefTipo )((Object)tom_tipo)))) {if (tom_is_fun_sym_DFloat((( maqv.msp.types.DefTipo )(( maqv.msp.types.DefTipo )((Object)tom_tipo))))) {

									try{
										int v1 = Integer.parseInt(iin);
										pushStack(tom_make_I(v1));
									}catch(NumberFormatException nfe){
										System.err.println("Invalid Format!");
									}
								}}}}}

				       }
				       catch (IOException e){
				    	   System.err.println("exception: " + e);
				       } 
				       return run(tom_instrs);
					}}}}{if (tom_is_sort_Instrucao(((Object)tom_inst))) {if (tom_is_sort_Instrucao((( maqv.msp.types.Instrucao )((Object)tom_inst)))) {if (tom_is_fun_sym_IOut((( maqv.msp.types.Instrucao )(( maqv.msp.types.Instrucao )((Object)tom_inst))))) {

						int n = metricas.get("IOut");
						metricas.put("IOut",++n);
						Termo t = topStack();
						popStack();
						{{if (tom_is_sort_Termo(((Object)t))) {if (tom_is_sort_Termo((( maqv.msp.types.Termo )((Object)t)))) {if (tom_is_fun_sym_I((( maqv.msp.types.Termo )(( maqv.msp.types.Termo )((Object)t))))) {
 output.append(tom_get_slot_I_i((( maqv.msp.types.Termo )((Object)t)))+"\n"); }}}}{if (tom_is_sort_Termo(((Object)t))) {if (tom_is_sort_Termo((( maqv.msp.types.Termo )((Object)t)))) {if (tom_is_fun_sym_S((( maqv.msp.types.Termo )(( maqv.msp.types.Termo )((Object)t))))) {
 output.append(tom_get_slot_S_id((( maqv.msp.types.Termo )((Object)t)))+"\n"); }}}}{if (tom_is_sort_Termo(((Object)t))) {if (tom_is_sort_Termo((( maqv.msp.types.Termo )((Object)t)))) {if (tom_is_fun_sym_F((( maqv.msp.types.Termo )(( maqv.msp.types.Termo )((Object)t))))) {
 output.append(tom_get_slot_F_f((( maqv.msp.types.Termo )((Object)t)))+"\n"); }}}}{if (tom_is_sort_Termo(((Object)t))) {if (tom_is_sort_Termo((( maqv.msp.types.Termo )((Object)t)))) {if (tom_is_fun_sym_B((( maqv.msp.types.Termo )(( maqv.msp.types.Termo )((Object)t))))) { maqv.msp.types.Boool  tomMatch43_13=tom_get_slot_B_b((( maqv.msp.types.Termo )((Object)t)));if (tom_is_sort_Boool(tomMatch43_13)) {if (tom_is_fun_sym_True((( maqv.msp.types.Boool )tomMatch43_13))) {
 output.append("True"+"\n"); }}}}}}{if (tom_is_sort_Termo(((Object)t))) {if (tom_is_sort_Termo((( maqv.msp.types.Termo )((Object)t)))) {if (tom_is_fun_sym_B((( maqv.msp.types.Termo )(( maqv.msp.types.Termo )((Object)t))))) { maqv.msp.types.Boool  tomMatch43_19=tom_get_slot_B_b((( maqv.msp.types.Termo )((Object)t)));if (tom_is_sort_Boool(tomMatch43_19)) {if (tom_is_fun_sym_False((( maqv.msp.types.Boool )tomMatch43_19))) {
 output.append("False"+"\n"); }}}}}}}

						return run(tom_instrs);
					}}}}{if (tom_is_sort_Instrucao(((Object)tom_inst))) {if (tom_is_sort_Instrucao((( maqv.msp.types.Instrucao )((Object)tom_inst)))) {if (tom_is_fun_sym_Jump((( maqv.msp.types.Instrucao )(( maqv.msp.types.Instrucao )((Object)tom_inst))))) {

						int n = metricas.get("Jump");
						metricas.put("Jump",++n);
						prog = jmp(orig,tom_get_slot_Jump_id((( maqv.msp.types.Instrucao )((Object)tom_inst))));
						return run(prog);
					}}}}{if (tom_is_sort_Instrucao(((Object)tom_inst))) {if (tom_is_sort_Instrucao((( maqv.msp.types.Instrucao )((Object)tom_inst)))) {if (tom_is_fun_sym_Jumpf((( maqv.msp.types.Instrucao )(( maqv.msp.types.Instrucao )((Object)tom_inst))))) {

						int n = metricas.get("Jumpf");
						metricas.put("Jumpf",++n);
						Termo t = topStack();
						popStack();
						{{if (tom_is_sort_Termo(((Object)t))) {if (tom_is_sort_Termo((( maqv.msp.types.Termo )((Object)t)))) {if (tom_is_fun_sym_B((( maqv.msp.types.Termo )(( maqv.msp.types.Termo )((Object)t))))) { maqv.msp.types.Boool  tomMatch44_1=tom_get_slot_B_b((( maqv.msp.types.Termo )((Object)t)));if (tom_is_sort_Boool(tomMatch44_1)) {if (tom_is_fun_sym_True((( maqv.msp.types.Boool )tomMatch44_1))) {
 return run(tom_instrs); }}}}}}{if (tom_is_sort_Termo(((Object)t))) {if (tom_is_sort_Termo((( maqv.msp.types.Termo )((Object)t)))) {if (tom_is_fun_sym_B((( maqv.msp.types.Termo )(( maqv.msp.types.Termo )((Object)t))))) { maqv.msp.types.Boool  tomMatch44_7=tom_get_slot_B_b((( maqv.msp.types.Termo )((Object)t)));if (tom_is_sort_Boool(tomMatch44_7)) {if (tom_is_fun_sym_False((( maqv.msp.types.Boool )tomMatch44_7))) {
 
								prog = jmp(orig,tom_get_slot_Jumpf_id((( maqv.msp.types.Instrucao )((Object)tom_inst))));
								return run(prog);
							}}}}}}}

						return run(tom_instrs);
					}}}}{if (tom_is_sort_Instrucao(((Object)tom_inst))) {if (tom_is_sort_Instrucao((( maqv.msp.types.Instrucao )((Object)tom_inst)))) {if (tom_is_fun_sym_Push((( maqv.msp.types.Instrucao )(( maqv.msp.types.Instrucao )((Object)tom_inst))))) {

						int n = metricas.get("Push");
						metricas.put("Push",++n);
						pushStack(tom_get_slot_Push_t((( maqv.msp.types.Instrucao )((Object)tom_inst))));
						return run(tom_instrs);
					}}}}{if (tom_is_sort_Instrucao(((Object)tom_inst))) {if (tom_is_sort_Instrucao((( maqv.msp.types.Instrucao )((Object)tom_inst)))) {if (tom_is_fun_sym_Pusha((( maqv.msp.types.Instrucao )(( maqv.msp.types.Instrucao )((Object)tom_inst))))) { maqv.msp.types.Termo  tom_t=tom_get_slot_Pusha_t((( maqv.msp.types.Instrucao )((Object)tom_inst)));

						int n = metricas.get("PushA");
						metricas.put("PushA",++n);
						{{if (tom_is_sort_Termo(((Object)tom_t))) {if (tom_is_sort_Termo((( maqv.msp.types.Termo )((Object)tom_t)))) {if (tom_is_fun_sym_S((( maqv.msp.types.Termo )(( maqv.msp.types.Termo )((Object)tom_t))))) {
 
								int memAddress = getMemAddress(tom_get_slot_S_id((( maqv.msp.types.Termo )((Object)tom_t))));
								pushStack(tom_make_I(memAddress));
								
								return run(tom_instrs);
							}}}}}

						return run(tom_instrs);
					}}}}{if (tom_is_sort_Instrucao(((Object)tom_inst))) {if (tom_is_sort_Instrucao((( maqv.msp.types.Instrucao )((Object)tom_inst)))) {if (tom_is_fun_sym_Load((( maqv.msp.types.Instrucao )(( maqv.msp.types.Instrucao )((Object)tom_inst))))) {

						int n = metricas.get("Load");
						metricas.put("Load",++n);
						Termo t = topStack();
						popStack();
						{{if (tom_is_sort_Termo(((Object)t))) {if (tom_is_sort_Termo((( maqv.msp.types.Termo )((Object)t)))) {if (tom_is_fun_sym_I((( maqv.msp.types.Termo )(( maqv.msp.types.Termo )((Object)t))))) {
 
								Termo t2 = getMem(tom_get_slot_I_i((( maqv.msp.types.Termo )((Object)t))));
								pushStack(t2);	
								return run(tom_instrs);
							}}}}}

						return run(tom_instrs);
					}}}}{if (tom_is_sort_Instrucao(((Object)tom_inst))) {if (tom_is_sort_Instrucao((( maqv.msp.types.Instrucao )((Object)tom_inst)))) {if (tom_is_fun_sym_Store((( maqv.msp.types.Instrucao )(( maqv.msp.types.Instrucao )((Object)tom_inst))))) {

						int n = metricas.get("Store");
						metricas.put("Store",++n);
						Termo t = topStack();
						popStack();
						Termo t2 = topStack();
						popStack();
						{{if (tom_is_sort_Termo(((Object)t2))) {if (tom_is_sort_Termo((( maqv.msp.types.Termo )((Object)t2)))) {if (tom_is_fun_sym_I((( maqv.msp.types.Termo )(( maqv.msp.types.Termo )((Object)t2))))) {
 
								putMem(tom_get_slot_I_i((( maqv.msp.types.Termo )((Object)t2))),t);
								
								return run(tom_instrs);
							}}}}}

						return run(tom_instrs);
					}}}}{if (tom_is_sort_Instrucao(((Object)tom_inst))) {if (tom_is_sort_Instrucao((( maqv.msp.types.Instrucao )((Object)tom_inst)))) {if (tom_is_fun_sym_Decl((( maqv.msp.types.Instrucao )(( maqv.msp.types.Instrucao )((Object)tom_inst))))) {

						int n = metricas.get("Decl");
						metricas.put("Decl",++n);
						memAlloc(tom_get_slot_Decl_id((( maqv.msp.types.Instrucao )((Object)tom_inst))),tom_get_slot_Decl_initMemAddress((( maqv.msp.types.Instrucao )((Object)tom_inst))),tom_get_slot_Decl_size((( maqv.msp.types.Instrucao )((Object)tom_inst))));
						return run(tom_instrs);
					}}}}}

			}}}}}

		return "";
	}
}
