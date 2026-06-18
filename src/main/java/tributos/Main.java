package tributos;

import java.util.List;

public class Main {
    public static void main(String[] args) {



        Tributavel alimentacao = new Alimentacao();
        Tributavel cultura = new Cultura();
        Tributavel saudebemestar = new SaudeBemEstar();
        Tributavel vestuario = new Vestuario();
        List<Tributavel> imposto = List.of(alimentacao, cultura, saudebemestar , vestuario);

        for  (Tributavel item : imposto) {
            double valorCalculado = item.calcularImposto(100.00);
            System.out.println("O imposto de " + item.getClass().getSimpleName() + " é de : " + valorCalculado);
        }
    }
}
