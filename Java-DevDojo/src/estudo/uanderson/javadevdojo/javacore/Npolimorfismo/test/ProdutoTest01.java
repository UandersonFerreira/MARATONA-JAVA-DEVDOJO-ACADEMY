package estudo.uanderson.javadevdojo.javacore.Npolimorfismo.test;

import estudo.uanderson.javadevdojo.javacore.Npolimorfismo.dominio.Computador;
import estudo.uanderson.javadevdojo.javacore.Npolimorfismo.dominio.Tomate;
import estudo.uanderson.javadevdojo.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC10i7", 5000);
        Tomate tomate = new Tomate("TomateX", 9);

        CalculadoraImposto.calcularImpostoComputador(computador);
        System.out.println("---------------------------");
        CalculadoraImposto.calcularImpostoTomate(tomate);


    }//main
}//class
