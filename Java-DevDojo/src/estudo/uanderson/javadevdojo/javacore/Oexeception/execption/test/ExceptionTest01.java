package estudo.uanderson.javadevdojo.javacore.Oexeception.execption.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) {
        criarNovoArquivo();

    }//main

    private static void criarNovoArquivo(){
        File file = new File("arquivo\\teste.txt");

        try {
            boolean isCreate = file.createNewFile();
            System.out.println("Arquivo criado: "+isCreate);
        } catch (IOException e) {
            e.printStackTrace();
            //AVISO DE ERRO-NUNCA DEIXAR EM BRANCO
        }
    }//method

    /*
    -NO TRATAMENTO DE EXCEÇÕES RECOMENDA-SE
    O TRATAMENTO DAS EXCEÇÕES MAIS ESPECIFÍCAS(FILHAS/SUBCLASSE)
     AO CONTRÁRIO DAS MAIS GENERICAS(SUPERCLASSE/PAI)
     */

}//class
