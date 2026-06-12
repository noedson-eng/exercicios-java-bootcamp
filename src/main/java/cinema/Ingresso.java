package cinema;

public sealed abstract class Ingresso permits IngressoFamilia, MeiaEntrada {

private double valor;
private boolean dublado;
private String nomeDoFilme;

    public Ingresso(double valor, boolean dublado, String nomeDoFilme) {
        this.valor = valor;
        this.dublado = dublado;
        this.nomeDoFilme = nomeDoFilme;
    }
    public double getValor() {
        return this.valor;
    }

    public String getNomeDoFilme() {
        return this.nomeDoFilme;
    }

    public boolean isDublado() {
        return dublado;
    }
}
