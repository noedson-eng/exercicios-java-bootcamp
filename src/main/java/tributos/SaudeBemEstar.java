package tributos;

public class SaudeBemEstar implements Tributavel {
    @Override
    public double calcularImposto(double valor) {
        return valor * 0.015;

    }
}
