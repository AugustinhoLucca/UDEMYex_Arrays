package programas;

import entidades.Deposito;

import java.util.Scanner;

public class progarma_deposito {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String numeroConta, nomeTitular, verifDepInicial, verifDepFinal;
        double depositoInicial, depositoFinal, saldo = 0;

        System.out.println("Deseja realizar um depósito inicial? [S/N]");
        verifDepInicial = sc.nextLine();

        if (verifDepInicial.equalsIgnoreCase("S")) {

            System.out.println("Número da Conta: ");
            numeroConta = sc.nextLine();
            System.out.println("Nome do titular: ");
            nomeTitular = sc.nextLine();
            System.out.println("Valor do depósito inicial em R$: ");
            depositoInicial = sc.nextInt();
            sc.nextLine();
            saldo += depositoInicial;

            Deposito conta = new Deposito(numeroConta, nomeTitular, depositoInicial, saldo);
            

            System.out.println("-=-=-=-=-CONTA ATUALIZADA-=-=-=-=-");
            System.out.println(conta.exibirDetalhes());

            System.out.println("Deseja encerrar ou depositar/sacar algum valor? [Depositar/Sacar/Encerrar]");
            verifDepFinal = sc.nextLine();
            
            if (verifDepFinal.equalsIgnoreCase("Depositar")) {
                System.out.println("Valor a ser depositado: ");
                depositoFinal = sc.nextDouble();
                
                conta.setSaldo(saldo + depositoFinal);

                System.out.println("-=-=-=-=-CONTA ATUALIZADA-=-=-=-=-");
                System.out.println(conta.exibirDetalhes());
            }
            else if (verifDepFinal.equalsIgnoreCase("Sacar")) {
                System.out.println("Valor a ser sacado: ");
                depositoFinal = sc.nextDouble();

                conta.setSaldo(saldo - depositoFinal);

                System.out.println("-=-=-=-=-CONTA ATUALIZADA-=-=-=-=-");
                System.out.println(conta.exibirDetalhes());
            }
            else if (verifDepFinal.equalsIgnoreCase("Encerrar")) {

                System.out.println("-=-=-=-=-CONTA ATUALIZADA-=-=-=-=-");
                System.out.println(conta.exibirDetalhes());
            }
            
        }
        else {
            System.out.println("Número da Conta: ");
            numeroConta = sc.nextLine();
            System.out.println("Nome do titular: ");
            nomeTitular = sc.nextLine();

            Deposito conta = new Deposito(numeroConta, nomeTitular);

            conta.setSaldo(0.0);

            System.out.println("-=-=-=-=-CONTA ATUALIZADA-=-=-=-=-");
            System.out.println(conta.exibirDetalhes()); 
            
            
            System.out.println("Deseja encerrar ou depositar/sacar algum valor? [Depositar/Sacar/Encerrar]");
            verifDepFinal = sc.nextLine();

            if (verifDepFinal.equalsIgnoreCase("Depositar")) {
                System.out.println("Valor a ser depositado: ");
                depositoFinal = sc.nextDouble();

                conta.setSaldo(saldo + depositoFinal);

                System.out.println("-=-=-=-=-CONTA ATUALIZADA-=-=-=-=-");
                System.out.println(conta.exibirDetalhes());
            }
            else if (verifDepFinal.equalsIgnoreCase("Sacar")) {
                System.out.println("Valor a ser sacado: ");
                depositoFinal = sc.nextDouble();

                conta.setSaldo(saldo - depositoFinal);

                System.out.println("-=-=-=-=-CONTA ATUALIZADA-=-=-=-=-");
                System.out.println(conta.exibirDetalhes());
            }
            else if (verifDepFinal.equalsIgnoreCase("Encerrar")) {

                System.out.println("-=-=-=-=-CONTA ATUALIZADA-=-=-=-=-");
                System.out.println(conta.exibirDetalhes());
            }

        }
        sc.close();
        System.out.println("-=-=-=-=-VOLTE SEMPRE!-=-=-=-=-");

    }
}
