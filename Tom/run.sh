#/bin/bash
EXAMPLE_DIR=exemplos/
EXAMPLE_FILE=maiorDeDoisNumeros.i
RES_FILE=res.msp



#
  cd /usr/local/lib
  export CLASSPATH=".:/usr/local/lib/antlr-4.5.1-complete.jar:$CLASSPATH"
  alias antlr4='java -jar /usr/local/lib/antlr-4.5.1-complete.jar'
  alias grun='java org.antlr.v4.gui.TestRig'

   export TOM_HOME="/home/mario/Modelos/TOM_HOME/"
   export PATH=${PATH}:${TOM_HOME}/bin
   export CLASSPATH=${TOM_HOME}/lib/tom-runtime-full.jar:${CLASSPATH}
#

make all #para executar isto, estar na directoria tom
cp $EXAMPLE_DIR$EXAMPLE_FILE genI
cd genI
javac gram/Main.java
java gram/Main < $EXAMPLE_FILE > $RES_FILE

cp $RES_FILE ../genMaqV
cd ../genMaqV
javac maqv/Main.java
java maqv/Main $RES_FILE
tr , '\n' < res.msp > res.txt #resultado para txt para que seja possivel perceber o que gera em assembly