package org.example;

public final class IngressoFamilia extends Ingresso {

    private int pessoas;


    public IngressoFamilia(double valor, boolean dublado, int pessoas, String nomeDoFilme) {
        super(valor, dublado, nomeDoFilme);
        this.pessoas = pessoas;
    }

    @Override
    public double getValor() {
        if (pessoas > 3) {
            return super.getValor() * 0.95 * pessoas;
        }
        return super.getValor() * pessoas;
    }


}
