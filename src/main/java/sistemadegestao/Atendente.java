package sistemadegestao;

public final class Atendente extends Usuario {

    private double valorEmCaixa;

    public Atendente(String nome, String email, String senha) {
        super(nome, email, senha, false);
    }

    public double getValorEmCaixa() {
        return valorEmCaixa;
    }

    public void receberPagamento(double valor) {
        this.valorEmCaixa += valor;
        System.out.println("Pagamento de R$ " + valor + " recebido.");
  }

  public void fecharCaixa() {
    this.valorEmCaixa = 0;
  }


}
