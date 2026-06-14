package sistemadegestao;

public final class Gerente extends Usuario {

    public Gerente(String nome, String email, String senha) {
        super(nome, email, senha, true);
    }

    public void gerarRelatorioFinanceiro() {
        System.out.println("Gerando Relatórios...");
    }
    public void consultarVendas() {
        System.out.println("Consultando vendas...");
    }





}


