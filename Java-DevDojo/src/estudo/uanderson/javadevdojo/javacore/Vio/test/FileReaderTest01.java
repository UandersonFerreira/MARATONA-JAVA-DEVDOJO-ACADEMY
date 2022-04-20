package estudo.uanderson.javadevdojo.javacore.Vio.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");

        try( FileReader fr = new FileReader(file)) {
//           char[] vetorChar = new char[50];
//            fr.read(vetorChar);
//
//            for (char c: vetorChar) {
//                System.out.println(c);
//            }

            System.out.println("Imprimindo todo o conteúdo do arquivo:");
            int i;
            while ((i = fr.read()) != -1){
                System.out.print((char)i);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }//main
}//class
