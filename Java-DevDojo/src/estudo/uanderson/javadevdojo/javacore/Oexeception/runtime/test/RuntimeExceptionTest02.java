package estudo.uanderson.javadevdojo.javacore.Oexeception.runtime.test;

import java.io.IOException;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
        System.out.println(divisao(5, 3));
        /*
        Irá gerar a seguinte Exception:
        Exception in thread "main" java.lang.ArithmeticException: / by zero
	at estudo.uanderson.javadevdojo.javacore.Oexeception.runtime.test.RuntimeExceptionTest02.divisao(RuntimeExceptionTest02.java:9)
	at estudo.uanderson.javadevdojo.javacore.Oexeception.runtime.test.RuntimeExceptionTest02.main(RuntimeExceptionTest02.java:5)

   -PARA O JAVA NÃO É OBRIGATÓRIO TRATAR, MAS É RECOMENDADO!
         */
    }//main

    private static double divisao(double n1, double n2){
      if (n2 == 0 || n1 ==0){
          throw new IllegalArgumentException("Argumento ilegal, não pode ser 0");
      }
      return n1/n2;
    }
    /*
    E POSSÍVEL DELEGAR A RESPONSABILIDADE DE TRATAMENTO DAS EXCEÇÕES
    DE UM METODO POR EXEMPLO PARA QUEM FOR CHAMAR O MÉTODO, BASTA COLOCAR:
    throws + NOME DA EXCEÇÃO APÓS OS PARAMETROS DO METODO. VALE RESSALTAR QUE SE CASO FOR LANÇADAS AS EXCEÇÕES PRA
    MAIN O TRATAMENTO DEVE SER FEITO, POIS SE LANÇADA PARA FRENTE A JVM IRÁ PARAR.
    E EXCEPTION RUNTIMEEXCEPTION NÃO OBRIGA QUEM CHAMA A TRATAR, JA IOEXCEPTION OBRIGA IMPLEMENTAR O TRATAMENTO
    QUANDO LANÇADAS PRA FRENTE.
    EX:
     private static double divisao(double n1, double n2) throws IllegalArgumentException{//NÃO IRÁ OBRIGAR A TRATAR
     private static double divisao(double n1, double n2) throws IOException {//OBRIGA A REALIZAR O TRATAMENTO
     */



}//class
