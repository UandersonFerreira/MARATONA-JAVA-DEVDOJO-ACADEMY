package estudo.uanderson.javadevdojo.javacore.Sformatacao.test;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest01 {
    public static void main(String[] args) {

        Locale localeBR = new Locale("pt","BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;

        NumberFormat[] nfa = new NumberFormat[4];
         nfa[0] = NumberFormat.getInstance();
         nfa[1] = NumberFormat.getInstance(localeBR);
         nfa[2] = NumberFormat.getInstance(localeJP);
         nfa[3] = NumberFormat.getInstance(localeIT);

         double valor = 100_000.25;

        for (NumberFormat numberFormat : nfa) {
            System.out.println(numberFormat.format(valor));
        }


    }//main
}//class
/*
  parou -> Aula 117
NumberFormat é uma classe abstrata portanto assim, como as demais
não se pode instancia-la. seu acesso ocorre por meio do:
        NumberFormat n = NumberFormat.getInstance();

 */
