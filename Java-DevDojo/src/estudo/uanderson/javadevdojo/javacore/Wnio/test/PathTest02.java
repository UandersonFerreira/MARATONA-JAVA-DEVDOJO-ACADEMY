package estudo.uanderson.javadevdojo.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest02 {
    public static void main(String[] args) throws IOException {
        Path pastaPath = Paths.get("pasta");
        Path pastaDirectory = Files.createDirectory(pastaPath);


    }
}
/*
CONTINUAR AULA 145

        Path pastaPath = Paths.get(" ");
Se deixado como vazio, o java intepreta que estamos pegando o diretorio
onde o programa está sendo executado.



 */