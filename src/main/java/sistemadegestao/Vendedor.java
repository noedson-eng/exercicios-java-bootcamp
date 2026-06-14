package sistemadegestao;

public final class Vendedor extends Usuario {

    private int quantidadeVendas;

    public Vendedor(String nome, String email, String senha) {
        super(nome, email, senha, false);
    }

    public int getQuantidadeVendas() {
        return quantidadeVendas;
    }

    public void consultarVendas() {
        System.out.println("O vendedor " + this.getNome() + " possui um total de " + this.getQuantidadeVendas() + " vendas.");
    }

    public void realizarVendas() {
        this.quantidadeVendas++;
        System.out.println("Venda realizada com sucesso!" + this.quantidadeVendas);
    }




}
