
package gram.i.types.instrucao;



public final class Atribuicao extends gram.i.types.Instrucao implements tom.library.sl.Visitable  {
  
  private static String symbolName = "Atribuicao";


  private Atribuicao() {}
  private int hashCode;
  private static Atribuicao gomProto = new Atribuicao();
    private String _Id;
  private gram.i.types.OpAtribuicao _op;
  private gram.i.types.Expressao _Expressao;

  /**
   * Constructor that builds a term rooted by Atribuicao
   *
   * @return a term rooted by Atribuicao
   */

  public static Atribuicao make(String _Id, gram.i.types.OpAtribuicao _op, gram.i.types.Expressao _Expressao) {

    // use the proto as a model
    gomProto.initHashCode( _Id,  _op,  _Expressao);
    return (Atribuicao) factory.build(gomProto);

  }

  /**
   * Initializes attributes and hashcode of the class
   *
   * @param  _Id
   * @param _op
   * @param _Expressao
   * @param hashCode hashCode of Atribuicao
   */
  private void init(String _Id, gram.i.types.OpAtribuicao _op, gram.i.types.Expressao _Expressao, int hashCode) {
    this._Id = _Id.intern();
    this._op = _op;
    this._Expressao = _Expressao;

    this.hashCode = hashCode;
  }

  /**
   * Initializes attributes and hashcode of the class
   *
   * @param  _Id
   * @param _op
   * @param _Expressao
   */
  private void initHashCode(String _Id, gram.i.types.OpAtribuicao _op, gram.i.types.Expressao _Expressao) {
    this._Id = _Id.intern();
    this._op = _op;
    this._Expressao = _Expressao;

    this.hashCode = hashFunction();
  }

  /* name and arity */

  /**
   * Returns the name of the symbol
   *
   * @return the name of the symbol
   */
  @Override
  public String symbolName() {
    return "Atribuicao";
  }

  /**
   * Returns the arity of the symbol
   *
   * @return the arity of the symbol
   */
  private int getArity() {
    return 3;
  }

  /**
   * Copy the object and returns the copy
   *
   * @return a clone of the SharedObject
   */
  public shared.SharedObject duplicate() {
    Atribuicao clone = new Atribuicao();
    clone.init( _Id,  _op,  _Expressao, hashCode);
    return clone;
  }
  
  /**
   * Appends a string representation of this term to the buffer given as argument.
   *
   * @param buffer the buffer to which a string represention of this term is appended.
   */
  @Override
  public void toStringBuilder(java.lang.StringBuilder buffer) {
    buffer.append("Atribuicao(");
    buffer.append('"');
            for (int i = 0; i < _Id.length(); i++) {
              char c = _Id.charAt(i);
              switch (c) {
                case '\n':
                  buffer.append('\\');
                  buffer.append('n');
                  break;
                case '\t':
                  buffer.append('\\');
                  buffer.append('t');
                  break;
                case '\b':
                  buffer.append('\\');
                  buffer.append('b');
                  break;
                case '\r':
                  buffer.append('\\');
                  buffer.append('r');
                  break;
                case '\f':
                  buffer.append('\\');
                  buffer.append('f');
                  break;
                case '\\':
                  buffer.append('\\');
                  buffer.append('\\');
                  break;
                case '\'':
                  buffer.append('\\');
                  buffer.append('\'');
                  break;
                case '\"':
                  buffer.append('\\');
                  buffer.append('\"');
                  break;
                case '!':
                case '@':
                case '#':
                case '$':
                case '%':
                case '^':
                case '&':
                case '*':
                case '(':
                case ')':
                case '-':
                case '_':
                case '+':
                case '=':
                case '|':
                case '~':
                case '{':
                case '}':
                case '[':
                case ']':
                case ';':
                case ':':
                case '<':
                case '>':
                case ',':
                case '.':
                case '?':
                case ' ':
                case '/':
                  buffer.append(c);
                  break;

                default:
                  if (java.lang.Character.isLetterOrDigit(c)) {
                    buffer.append(c);
                  } else {
                    buffer.append('\\');
                    buffer.append((char) ('0' + c / 64));
                    c = (char) (c % 64);
                    buffer.append((char) ('0' + c / 8));
                    c = (char) (c % 8);
                    buffer.append((char) ('0' + c));
                  }
              }
            }
            buffer.append('"');
buffer.append(",");
    _op.toStringBuilder(buffer);
buffer.append(",");
    _Expressao.toStringBuilder(buffer);

    buffer.append(")");
  }


  /**
   * Compares two terms. This functions implements a total lexicographic path ordering.
   *
   * @param o object to which this term is compared
   * @return a negative integer, zero, or a positive integer as this
   *         term is less than, equal to, or greater than the argument
   * @throws ClassCastException in case of invalid arguments
   * @throws RuntimeException if unable to compare childs
   */
  @Override
  public int compareToLPO(Object o) {
    /*
     * We do not want to compare with any object, only members of the module
     * In case of invalid argument, throw a ClassCastException, as the java api
     * asks for it
     */
    gram.i.iAbstractType ao = (gram.i.iAbstractType) o;
    /* return 0 for equality */
    if (ao == this) { return 0; }
    /* compare the symbols */
    int symbCmp = this.symbolName().compareTo(ao.symbolName());
    if (symbCmp != 0) { return symbCmp; }
    /* compare the childs */
    Atribuicao tco = (Atribuicao) ao;
    int _IdCmp = (this._Id).compareTo(tco._Id);
    if(_IdCmp != 0) {
      return _IdCmp;
    }


    int _opCmp = (this._op).compareToLPO(tco._op);
    if(_opCmp != 0) {
      return _opCmp;
    }

    int _ExpressaoCmp = (this._Expressao).compareToLPO(tco._Expressao);
    if(_ExpressaoCmp != 0) {
      return _ExpressaoCmp;
    }

    throw new RuntimeException("Unable to compare");
  }

 /**
   * Compares two terms. This functions implements a total order.
   *
   * @param o object to which this term is compared
   * @return a negative integer, zero, or a positive integer as this
   *         term is less than, equal to, or greater than the argument
   * @throws ClassCastException in case of invalid arguments
   * @throws RuntimeException if unable to compare childs
   */
  @Override
  public int compareTo(Object o) {
    /*
     * We do not want to compare with any object, only members of the module
     * In case of invalid argument, throw a ClassCastException, as the java api
     * asks for it
     */
    gram.i.iAbstractType ao = (gram.i.iAbstractType) o;
    /* return 0 for equality */
    if (ao == this) { return 0; }
    /* use the hash values to discriminate */

    if(hashCode != ao.hashCode()) { return (hashCode < ao.hashCode())?-1:1; }

    /* If not, compare the symbols : back to the normal order */
    int symbCmp = this.symbolName().compareTo(ao.symbolName());
    if (symbCmp != 0) { return symbCmp; }
    /* last resort: compare the childs */
    Atribuicao tco = (Atribuicao) ao;
    int _IdCmp = (this._Id).compareTo(tco._Id);
    if(_IdCmp != 0) {
      return _IdCmp;
    }


    int _opCmp = (this._op).compareTo(tco._op);
    if(_opCmp != 0) {
      return _opCmp;
    }

    int _ExpressaoCmp = (this._Expressao).compareTo(tco._Expressao);
    if(_ExpressaoCmp != 0) {
      return _ExpressaoCmp;
    }

    throw new RuntimeException("Unable to compare");
  }

 //shared.SharedObject
  /**
   * Returns hashCode
   *
   * @return hashCode
   */
  @Override
  public final int hashCode() {
    return hashCode;
  }

  /**
   * Checks if a SharedObject is equivalent to the current object
   *
   * @param obj SharedObject to test
   * @return true if obj is a Atribuicao and its members are equal, else false
   */
  public final boolean equivalent(shared.SharedObject obj) {
    if(obj instanceof Atribuicao) {

      Atribuicao peer = (Atribuicao) obj;
      return _Id==peer._Id && _op==peer._op && _Expressao==peer._Expressao && true;
    }
    return false;
  }


   //Instrucao interface
  /**
   * Returns true if the term is rooted by the symbol Atribuicao
   *
   * @return true, because this is rooted by Atribuicao
   */
  @Override
  public boolean isAtribuicao() {
    return true;
  }
  
  /**
   * Returns the attribute String
   *
   * @return the attribute String
   */
  @Override
  public String getId() {
    return _Id;
  }

  /**
   * Sets and returns the attribute gram.i.types.Instrucao
   *
   * @param set_arg the argument to set
   * @return the attribute String which just has been set
   */
  @Override
  public gram.i.types.Instrucao setId(String set_arg) {
    return make(set_arg, _op, _Expressao);
  }
  
  /**
   * Returns the attribute gram.i.types.OpAtribuicao
   *
   * @return the attribute gram.i.types.OpAtribuicao
   */
  @Override
  public gram.i.types.OpAtribuicao getop() {
    return _op;
  }

  /**
   * Sets and returns the attribute gram.i.types.Instrucao
   *
   * @param set_arg the argument to set
   * @return the attribute gram.i.types.OpAtribuicao which just has been set
   */
  @Override
  public gram.i.types.Instrucao setop(gram.i.types.OpAtribuicao set_arg) {
    return make(_Id, set_arg, _Expressao);
  }
  
  /**
   * Returns the attribute gram.i.types.Expressao
   *
   * @return the attribute gram.i.types.Expressao
   */
  @Override
  public gram.i.types.Expressao getExpressao() {
    return _Expressao;
  }

  /**
   * Sets and returns the attribute gram.i.types.Instrucao
   *
   * @param set_arg the argument to set
   * @return the attribute gram.i.types.Expressao which just has been set
   */
  @Override
  public gram.i.types.Instrucao setExpressao(gram.i.types.Expressao set_arg) {
    return make(_Id, _op, set_arg);
  }
  
  /* AbstractType */
  /**
   * Returns an ATerm representation of this term.
   *
   * @return an ATerm representation of this term.
   */
  @Override
  public aterm.ATerm toATerm() {
    aterm.ATerm res = super.toATerm();
    if(res != null) {
      // the super class has produced an ATerm (may be a variadic operator)
      return res;
    }
    return atermFactory.makeAppl(
      atermFactory.makeAFun(symbolName(),getArity(),false),
      new aterm.ATerm[] {(aterm.ATerm) atermFactory.makeAppl(atermFactory.makeAFun(getId() ,0 , true)), getop().toATerm(), getExpressao().toATerm()});
  }

  /**
   * Apply a conversion on the ATerm contained in the String and returns a gram.i.types.Instrucao from it
   *
   * @param trm ATerm to convert into a Gom term
   * @param atConv ATerm Converter used to convert the ATerm
   * @return the Gom term
   */
  public static gram.i.types.Instrucao fromTerm(aterm.ATerm trm, tom.library.utils.ATermConverter atConv) {
    trm = atConv.convert(trm);
    if(trm instanceof aterm.ATermAppl) {
      aterm.ATermAppl appl = (aterm.ATermAppl) trm;
      if(symbolName.equals(appl.getName()) && !appl.getAFun().isQuoted()) {
        return make(
convertATermToString(appl.getArgument(0), atConv), gram.i.types.OpAtribuicao.fromTerm(appl.getArgument(1),atConv), gram.i.types.Expressao.fromTerm(appl.getArgument(2),atConv)
        );
      }
    }
    return null;
  }

  /* Visitable */
  /**
   * Returns the number of childs of the term
   *
   * @return the number of childs of the term
   */
  public int getChildCount() {
    return 3;
  }

  /**
   * Returns the child at the specified index
   *
   * @param index index of the child to return; must be
             nonnegative and less than the childCount
   * @return the child at the specified index
   * @throws IndexOutOfBoundsException if the index out of range
   */
  public tom.library.sl.Visitable getChildAt(int index) {
    switch(index) {
      case 0: return new tom.library.sl.VisitableBuiltin<String>(_Id);
      case 1: return _op;
      case 2: return _Expressao;

      default: throw new IndexOutOfBoundsException();
    }
  }

  /**
   * Set the child at the specified index
   *
   * @param index index of the child to set; must be
             nonnegative and less than the childCount
   * @param v child to set at the specified index
   * @return the child which was just set
   * @throws IndexOutOfBoundsException if the index out of range
   */
  public tom.library.sl.Visitable setChildAt(int index, tom.library.sl.Visitable v) {
    switch(index) {
      case 0: return make(getId(), _op, _Expressao);
      case 1: return make(getId(), (gram.i.types.OpAtribuicao) v, _Expressao);
      case 2: return make(getId(), _op, (gram.i.types.Expressao) v);

      default: throw new IndexOutOfBoundsException();
    }
  }

  /**
   * Set children to the term
   *
   * @param childs array of children to set
   * @return an array of children which just were set
   * @throws IndexOutOfBoundsException if length of "childs" is different than 3
   */
  @SuppressWarnings("unchecked")
  public tom.library.sl.Visitable setChildren(tom.library.sl.Visitable[] childs) {
    if (childs.length == 3  && childs[0] instanceof tom.library.sl.VisitableBuiltin && childs[1] instanceof gram.i.types.OpAtribuicao && childs[2] instanceof gram.i.types.Expressao) {
      return make(((tom.library.sl.VisitableBuiltin<String>)childs[0]).getBuiltin(), (gram.i.types.OpAtribuicao) childs[1], (gram.i.types.Expressao) childs[2]);
    } else {
      throw new IndexOutOfBoundsException();
    }
  }

  /**
   * Returns the whole children of the term
   *
   * @return the children of the term
   */
  public tom.library.sl.Visitable[] getChildren() {
    return new tom.library.sl.Visitable[] {  new tom.library.sl.VisitableBuiltin<String>(_Id),  _op,  _Expressao };
  }

    /**
     * Compute a hashcode for this term.
     * (for internal use)
     *
     * @return a hash value
     */
  protected int hashFunction() {
    int a, b, c;
    /* Set up the internal state */
    a = 0x9e3779b9; /* the golden ratio; an arbitrary value */
    b = (1747884415<<8);
    c = getArity();
    /* -------------------------------------- handle most of the key */
    /* ------------------------------------ handle the last 11 bytes */
    a += (shared.HashFunctions.stringHashFunction(_Id, 2) << 16);
    a += (_op.hashCode() << 8);
    a += (_Expressao.hashCode());

    a -= b; a -= c; a ^= (c >> 13);
    b -= c; b -= a; b ^= (a << 8);
    c -= a; c -= b; c ^= (b >> 13);
    a -= b; a -= c; a ^= (c >> 12);
    b -= c; b -= a; b ^= (a << 16);
    c -= a; c -= b; c ^= (b >> 5);
    a -= b; a -= c; a ^= (c >> 3);
    b -= c; b -= a; b ^= (a << 10);
    c -= a; c -= b; c ^= (b >> 15);
    /* ------------------------------------------- report the result */
    return c;
  }

}
