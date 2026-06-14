package sistemadegestao;

public class MainUsuario {
    public static void main(String[] args) {


        System.out.println("=== SISTEMA DE GESTÃO DE USUÁRIOS ===\n");


        Gerente gerente = new Gerente("Alice Silva", "alice@empresa.com", "senha123");
        Vendedor vendedor = new Vendedor("Bruno Costa", "bruno@empresa.com", "venda456");
        Atendente atendente = new Atendente("Carla Souza", "carla@empresa.com", "caixa789");


        System.out.println("--- Testando Gerente ---");
        System.out.println("Nome: " + gerente.getNome());
        gerente.gerarRelatorioFinanceiro();
        gerente.consultarVendas();

        System.out.println("\n--------------------------------------\n");

        System.out.println("--- Testando Vendedor ---");
        System.out.println("Nome: " + vendedor.getNome());
        vendedor.realizarVendas();
        vendedor.realizarVendas();

        vendedor.consultarVendas();

        System.out.println("\n-------------------------------------------\n");

        System.out.println("--- Testando Atendente ---");
        System.out.println("Nome: " + atendente.getNome());

        atendente.receberPagamento(50.0);
        atendente.receberPagamento(120.50);
        System.out.println("Valor atual em caixa: R$ " + atendente.getValorEmCaixa());
        atendente.fecharCaixa();
        System.out.println("Caixa após fechamento: R$ " + atendente.getValorEmCaixa());


    }
}
