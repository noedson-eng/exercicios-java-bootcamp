package org.example;

import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Car meuCarro = new Car();
        int opcao;

        do {
            System.out.println("\n=== SIMULADOR DE CARRO ===");
            System.out.println("1. Ligar o carro");
            System.out.println("2. Desligar o carro");
            System.out.println("3. Acelerar");
            System.out.println("4. Diminuit Velocidade");
            System.out.println("5. Trocar de Marcha");
            System.out.println("6. Virar para a Esquerda");
            System.out.println("7. Virar para a Direito");
            System.out.println("8. Verificar Velocidade (Painel) ");
            System.out.println("0. Sair");
            System.out.println("Digite uma opcao: ");
            opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    meuCarro.ligar();
                    break;
                case 2:
                    meuCarro.desligar();
                    break;
                case 3:
                    meuCarro.acelerar();
                    break;
                case 4:
                    meuCarro.diminuirVelocidade();
                    break;
                case 5:
                    System.out.println("Digite a marcha desejada (0 a 6)");
                    int novoMarcha = sc.nextInt();
                    meuCarro.trocarMarcha(novoMarcha);
                    break;
                case 6:
                    meuCarro.virarEsquerda();
                    break;
                case 7:
                    meuCarro.virarDireita();
                    break;
                case 8:
                    meuCarro.verificarVelocidade();
                    break;
                case 0:
                    System.out.println("Saindo do simulador. até mais");
                    break;
                default:
                    System.out.println("Opção invalida");

            }
        } while (opcao != 0);


        sc.close();

    }
}
