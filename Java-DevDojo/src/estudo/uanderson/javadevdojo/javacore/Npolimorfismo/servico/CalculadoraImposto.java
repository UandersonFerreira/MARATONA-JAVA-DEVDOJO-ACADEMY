package estudo.uanderson.javadevdojo.javacore.Npolimorfismo.servico;

import estudo.uanderson.javadevdojo.javacore.Npolimorfismo.dominio.Computador;
import estudo.uanderson.javadevdojo.javacore.Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {

    public static void calcularImpostoComputador(Computador computador){
        System.out.println("Relatório de imposto do computador");
        double imposto = computador.calcularImposto();
        System.out.println("Computador: "+ computador.getNome());
        System.out.println("Valor: "+ computador.getValor());
        System.out.println("Imposto a ser pago: "+imposto);
    }

    public static void  calcularImpostoTomate(Tomate tomate){
        System.out.println("Relatório de imposto do Tomate");
        double imposto = tomate.calcularImposto();
        System.out.println("Tomate: "+ tomate.getNome());
        System.out.println("Valor: "+ tomate.getValor());
        System.out.println("Imposto a ser pago: "+imposto);
    }

    /*
    QUANDO NÃO  ESTAMOS ACESSANDO NENHUM ATRIBUTO DE CLASSE
    PODEMOS TRANFORMAR OS EM ESTATICOS (STATIC). PORTANDO NÃO É
    NECESSÁRIO CRIAR UM OBJETO DA CLASSE PARA ACESSAR OS MÉTODOS
    NA MAIN.
     */
}//class
