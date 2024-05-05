package ContaBancaria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o nome da pessoa: ");
        String nome = scanner.nextLine();

        System.out.print("Informe o número da conta: ");
        String numeroConta = scanner.nextLine();

        System.out.print("Informe o saldo inicial: ");
        double saldoInicial = scanner.nextDouble();

        Pessoa pessoa = new Pessoa(nome);
        ContaBancaria conta = new ContaBancaria(numeroConta, saldoInicial, pessoa);

        System.out.println("Conta bancária criada com sucesso.");

        int opcao;
        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Ver saldo");
            System.out.println("0. Sair");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Informe o valor a depositar: ");
                    double deposito = scanner.nextDouble();
                    conta.depositar(deposito);
                    break;
                case 2:
                    System.out.print("Informe o valor a sacar: ");
                    double saque = scanner.nextDouble();
                    conta.sacar(saque);
                    break;
                case 3:
                    System.out.println("Saldo disponível: R$" + conta.getSaldo());
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (opcao != 0);

        scanner.close();
    }
}
