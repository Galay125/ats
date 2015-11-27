
package gram.i.types.instrucao;



public final class Funcao extends gram.i.types.Instrucao implements tom.library.sl.Visitable  {
  
  private static String symbolName = "Funcao";


  private Funcao() {}
  private int hashCode;
  private static Funcao gomProto = new Funcao();
    private gram.i.types.DefTipo _DefTipo;
  private String _Nome;
  private gram.i.types.Argumentos _Argumentos;
  private gram.i.types.Instrucao _Instrucao;

  /**
   * Constructor that builds a term rooted by Funcao
   *
   * @return a term rooted by Funcao
   */

  public static Funcao make(gram.i.types.DefTipo _DefTipo, String _Nome, gram.i.types.Argumentos _Argumentos, gram.i.types.Instrucao _Instrucao) {

    // use the proto as a model
    gomProto.initHashCode( _DefTipo,  _Nome,  _Argumentos,  _Instrucao);
    return (Funcao) factory.build(gomProto);

  }

  /**
   * Initializes attributes and hashcode of the class
   *
   * @param  _DefTipo
   * @param _Nome
   * @param _Argumentos
   * @param _Instrucao
   * @param hashCode hashCode of Funcao
   */
  private void init(gram.i.types.DefTipo _DefTipo, String _Nome, gram.i.types.Argumentos _Argumentos, gram.i.types.Instrucao _Instrucao, int hashCode) {
    this._DefTipo = _DefTipo;
    this._Nome = _Nome.intern();
    this._Argumentos = _Argumentos;
    this._Instrucao = _Instrucao;

    this.hashCode = hashCode;
  }

  /**
   * Initializes attributes and hashcode of the class
   *
   * @param  _DefTipo
   * @param _Nome
   * @param _Argumentos
   * @param _Instrucao
   */
  private void initHashCode(gram.i.types.DefTipo _DefTipo, String _Nome, gram.i.types.Argumentos _Argumentos, gram.i.types.Instrucao _Instrucao) {
    this._DefTipo = _DefTipo;
    this._Nome = _Nome.intern();
    this._Argumentos = _Argumentos;
    this._Instrucao = _Instrucao;

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
    return "Funcao";
  }

  /**
   * Returns the arity of the symbol
   *
   * @return the arity of the symbol
   */
  private int getArity() {
    return 4;
  }

  /**
   * Copy the object and returns the copy
   *
   * @return a clone of the SharedObject
   */
  public shared.SharedObject duplicate() {
    Funcao clone = new Funcao();
    clone.init( _DefTipo,  _Nome,  _Argumentos,  _Instrucao, hashCode);
    return clone;
  }
  
  /**
   * Appends a string representation of this term to the buffer given as argument.
   *
   * @param buffer the buffer to which a string represention of this term is appended.
   */
  @Override
  public void toStringBuilder(java.lang.StringBuilder buffer) {
    buffer.append("Funcao(");
    _DefTipo.toStringBuilder(buffer);
buffer.append(",");
    buffer.append('"');
            for (int i = 0; i < _Nome.length(); i++) {
              char c = _Nome.charAt(i);
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
    _Argumentos.toStringBuilder(buffer);
buffer.append(",");
    _Instrucao.toStringBuilder(buffer);

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
    Funcao tco = (Funcao) ao;
    int _DefTipoCmp = (this._DefTipo).compareToLPO(tco._DefTipo);
    if(_DefTipoCmp != 0) {
      return _DefTipoCmp;
    }

    int _NomeCmp = (this._Nome).compareTo(tco._Nome);
    if(_NomeCmp != 0) {
      return _NomeCmp;
    }


    int _ArgumentosCmp = (this._Argumentos).compareToLPO(tco._Argumentos);
    if(_ArgumentosCmp != 0) {
      return _ArgumentosCmp;
    }

    int _InstrucaoCmp = (this._Instrucao).compareToLPO(tco._Instrucao);
    if(_InstrucaoCmp != 0) {
      return _InstrucaoCmp;
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
    Funcao tco = (Funcao) ao;
    int _DefTipoCmp = (this._DefTipo).compareTo(tco._DefTipo);
    if(_DefTipoCmp != 0) {
      return _DefTipoCmp;
    }

    int _NomeCmp = (this._Nome).compareTo(tco._Nome);
    if(_NomeCmp != 0) {
      return _NomeCmp;
    }


    int _ArgumentosCmp = (this._Argumentos).compareTo(tco._Argumentos);
    if(_ArgumentosCmp != 0) {
      return _ArgumentosCmp;
    }

    int _InstrucaoCmp = (this._Instrucao).compareTo(tco._Instrucao);
    if(_InstrucaoCmp != 0) {
      return _InstrucaoCmp;
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
   * @return true if obj is a Funcao and its members are equal, else false
   */
  public final boolean equivalent(shared.SharedObject obj) {
    if(obj instanceof Funcao) {

      Funcao peer = (Funcao) obj;
      return _DefTipo==peer._DefTipo && _Nome==peer._Nome && _Argumentos==peer._Argumentos && _Instrucao==peer._Instrucao && true;
    }
    return false;
  }


   //Instrucao interface
  /**
   * Returns true if the term is rooted by the symbol Funcao
   *
   * @return true, because this is rooted by Funcao
   */
  @Override
  public boolean isFuncao() {
    return true;
  }
  
  /**
   * Returns the attribute gram.i.types.DefTipo
   *
   * @return the attribute gram.i.types.DefTipo
   */
  @Override
  public gram.i.types.DefTipo getDefTipo() {
    return _DefTipo;
  }

  /**
   * Sets and returns the attribute gram.i.types.Instrucao
   *
   * @param set_arg the argument to set
   * @return the attribute gram.i.types.DefTipo which just has been set
   */
  @Override
  public gram.i.types.Instrucao setDefTipo(gram.i.types.DefTipo set_arg) {
    return make(set_arg, _Nome, _Argumentos, _Instrucao);
  }
  
  /**
   * Returns the attribute String
   *
   * @return the attribute String
   */
  @Override
  public String getNome() {
    return _Nome;
  }

  /**
   * Sets and returns the attribute gram.i.types.Instrucao
   *
   * @param set_arg the argument to set
   * @return the attribute String which just has been set
   */
  @Override
  public gram.i.types.Instrucao setNome(String set_arg) {
    return make(_DefTipo, set_arg, _Argumentos, _Instrucao);
  }
  
  /**
   * Returns the attribute gram.i.types.Argumentos
   *
   * @return the attribute gram.i.types.Argumentos
   */
  @Override
  public gram.i.types.Argumentos getArgumentos() {
    return _Argumentos;
  }

  /**
   * Sets and returns the attribute gram.i.types.Instrucao
   *
   * @param set_arg the argument to set
   * @return the attribute gram.i.types.Argumentos which just has been set
   */
  @Override
  public gram.i.types.Instrucao setArgumentos(gram.i.types.Argumentos set_arg) {
    return make(_DefTipo, _Nome, set_arg, _Instrucao);
  }
  
  /**
   * Returns the attribute gram.i.types.Instrucao
   *
   * @return the attribute gram.i.types.Instrucao
   */
  @Override
  public gram.i.types.Instrucao getInstrucao() {
    return _Instrucao;
  }

  /**
   * Sets and returns the attribute gram.i.types.Instrucao
   *
   * @param set_arg the argument to set
   * @return the attribute gram.i.types.Instrucao which just has been set
   */
  @Override
  public gram.i.types.Instrucao setInstrucao(gram.i.types.Instrucao set_arg) {
    return make(_DefTipo, _Nome, _Argumentos, set_arg);
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
      new aterm.ATerm[] {getDefTipo().toATerm(), (aterm.ATerm) atermFactory.makeAppl(atermFactory.makeAFun(getNome() ,0 , true)), getArgumentos().toATerm(), getInstrucao().toATerm()});
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
gram.i.types.DefTipo.fromTerm(appl.getArgument(0),atConv), convertATermToString(appl.getArgument(1), atConv), gram.i.types.Argumentos.fromTerm(appl.getArgument(2),atConv), gram.i.types.Instrucao.fromTerm(appl.getArgument(3),atConv)
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
    return 4;
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
      case 0: return _DefTipo;
      case 1: return new tom.library.sl.VisitableBuiltin<String>(_Nome);
      case 2: return _Argumentos;
      case 3: return _Instrucao;

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
      case 0: return make((gram.i.types.DefTipo) v, getNome(), _Argumentos, _Instrucao);
      case 1: return make(_DefTipo, getNome(), _Argumentos, _Instrucao);
      case 2: return make(_DefTipo, getNome(), (gram.i.types.Argumentos) v, _Instrucao);
      case 3: return make(_DefTipo, getNome(), _Argumentos, (gram.i.types.Instrucao) v);

      default: throw new IndexOutOfBoundsException();
    }
  }

  /**
   * Set children to the term
   *
   * @param childs array of children to set
   * @return an array of children which just were set
   * @throws IndexOutOfBoundsException if length of "childs" is different than 4
   */
  @SuppressWarnings("unchecked")
  public tom.library.sl.Visitable setChildren(tom.library.sl.Visitable[] childs) {
    if (childs.length == 4  && childs[0] instanceof gram.i.types.DefTipo && childs[1] instanceof tom.library.sl.VisitableBuiltin && childs[2] instanceof gram.i.types.Argumentos && childs[3] instanceof gram.i.types.Instrucao) {
      return make((gram.i.types.DefTipo) childs[0], ((tom.library.sl.VisitableBuiltin<String>)childs[1]).getBuiltin(), (gram.i.types.Argumentos) childs[2], (gram.i.types.Instrucao) childs[3]);
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
    return new tom.library.sl.Visitable[] {  _DefTipo,  new tom.library.sl.VisitableBuiltin<String>(_Nome),  _Argumentos,  _Instrucao };
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
    b = (386156994<<8);
    c = getArity();
    /* -------------------------------------- handle most of the key */
    /* ------------------------------------ handle the last 11 bytes */
    a += (_DefTipo.hashCode() << 24);
    a += (shared.HashFunctions.stringHashFunction(_Nome, 2) << 16);
    a += (_Argumentos.hashCode() << 8);
    a += (_Instrucao.hashCode());

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
