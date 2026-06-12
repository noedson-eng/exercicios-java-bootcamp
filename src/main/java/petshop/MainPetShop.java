package petshop;

import java.util.Locale;
import java.util.Scanner;

public class MainPetShop {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        MaquinaBanho maquina = new MaquinaBanho();

        System.out.print("Bem-vindo ao PetShop! Digite o nome do pet que vai entrar hoje: ");
        String nomePet = sc.nextLine();
        Pet meuPet = new Pet(nomePet);

        int opcao;

        do {
            System.out.println("\n=== PAINEL DE CONTROLE DA MÀQUINA ===");
            System.out.println("1. Colocar pet na máquina");
            System.out.println("2. Dar banho no pet");
            System.out.println("3. Retirar pet da máquina");
            System.out.println("4. Abastecer com água (+2L)");
            System.out.println("5. Abastecer com shampoo (+2L)");
            System.out.println("6. Verificar nível de água");
            System.out.println("7. Verificar nível de shampoo");
            System.out.println("8. Limpar máquina");
            System.out.println("0. Sair");
            System.out.println("Digite uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1 -> maquina.colocarPet(meuPet);
                case 2 -> maquina.darBanho();
                case 3 -> maquina.retirarPet();
                case 4 -> maquina.abastecerAgua();
                case 5 -> maquina.abastecerShampoo();
                case 6 -> maquina.verificarNivelAgua();
                case 7 -> maquina.verificarShampoo();
                case 8 -> maquina.limparMaquina();
                case 0 -> System.out.println("Encerrando o sistema do PetShop. até mais!");
                default -> System.out.println("Opção invalida");
            }
        } while (opcao != 0);


        sc.close();
    }

}
