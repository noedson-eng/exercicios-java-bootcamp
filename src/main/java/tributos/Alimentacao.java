package tributos;

public class Alimentacao implements Tributavel {
    @Override
    public double calcularImposto(double valor) {
       return valor * 0.01;

    }
}
