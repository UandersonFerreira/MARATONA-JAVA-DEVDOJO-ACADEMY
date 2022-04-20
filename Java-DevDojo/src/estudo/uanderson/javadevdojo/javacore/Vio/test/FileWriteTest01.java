package estudo.uanderson.javadevdojo.javacore.Vio.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteTest01 {
    public static void main(String[] args) {

        File file = new File("file.txt");
// (file,append:true) foi utilizado para pode acrescentar contéudo ao arquivo sem sobrescrevr o que já existe
        try(FileWriter fw = new FileWriter(file,true)) {//o próprio try se encarrega de fechar o arquivo

            fw.write("Escrevendo dentro do arquivo file!!\nEscrevendo novamente, mas sem apagar o que já existia:)");
          // fw.close(); fecharia o arquivo após terminar a escrita.
           fw.flush();// esvazia o que está dentro do buffer

        } catch (IOException e) {
            e.printStackTrace();
        }

    }//main
}//class
