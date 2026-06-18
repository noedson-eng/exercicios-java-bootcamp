package tributos;

public class Vestuario implements Tributavel{
    @Override
    public double calcularImposto(double valor) {
        return valor * 0.025;

    }
}
