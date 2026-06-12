package org.example.banco;

import java.util.Locale;
import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ContaMain {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o depósito para criar a conta: R$ ");
        double depositoInicial = sc.nextDouble();

        ContaBancaria conta = new ContaBancaria(depositoInicial);

        int opcao;

        do {
            System.out.println("\n=== MENU CONTA BANCÀRIA ===");
            System.out.println("1. Consultar Saldo");
            System.out.println("2. Consultar Cheque Especial");
            System.out.println("3. Depositar Dinheiro");
            System.out.println("4. Sacar Dinheiro");
            System.out.println("5. Pagar Boleto");
            System.out.println("6. Verificar Uso do cheque Especial");
            System.out.println("0. Sair");
            System.out.println("Escolha uma opção");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    conta.consultarSaldo();
                    break;
                case 2:
                    conta.consultarChequeEspecial();
                    break;
                case 3:
                    System.out.print("Digite o valor do deposito: R$ ");
                    double valorDep = sc.nextDouble();
                    conta.depositar(valorDep);
                    break;
                case 4:
                    System.out.println("Digite o valor do saque: R$ ");
                    double valorSaque = sc.nextDouble();
                    conta.sacar(valorSaque);
                    break;
                case 5:
                    System.out.print("Digite o valor do boleto: R$ ");
                    double valorBoleto = sc.nextDouble();
                    conta.pagarBoleto(valorBoleto);
                    break;
                case 6:
                    if (conta.isUsandoChequeEspecial()) {
                        System.out.println("Atenção: Você está utilizando o cheque especial.");
                    } else {
                        System.out.println("Você não está utilizando o cheque especial.");
                    }
                    break;
                case 0:
                    System.out.println("Encerrando o sistema. Obrigado!");
                    break;
                default:
                    System.out.println("Opção invalida! Tente novamente.");
            }
        } while (opcao != 0);
        sc.close();
    }
}
