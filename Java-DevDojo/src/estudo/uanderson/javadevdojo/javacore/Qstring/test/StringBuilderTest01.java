package estudo.uanderson.javadevdojo.javacore.Qstring.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "Uanderson Ferreira";
        nome.concat(" de Oliveira");
        System.out.println(nome);

        StringBuilder sb = new StringBuilder(16);//por padrão a capacidade de armazrnamento é 16, mas vai se adequando conforme a necessidade.

    }//main
}//class
