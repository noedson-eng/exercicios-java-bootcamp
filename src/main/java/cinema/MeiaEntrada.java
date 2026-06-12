package cinema;

public  final  class  MeiaEntrada extends Ingresso {


    public MeiaEntrada(double valor, boolean dublado, String nomeDoFilme) {
        super(valor, dublado, nomeDoFilme);

    }

    @Override
    public double getValor() {
        return super.getValor() / 2;

    }


}

