package tributos;

public class Cultura implements Tributavel{
    @Override
    public double calcularImposto(double valor) {
       return valor * 0.04;

    }
}
