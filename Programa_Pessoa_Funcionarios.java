package programas;

import entidades.Pessoa_Funcionarios;

import java.util.Scanner;

public class Programa_Pessoa_Funcionarios {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String nome, cpf, departamento, exibirDetalhes;
        int idade;

        System.out.print("Quantos funcionários serão cadastrados? --> ");
        int qtdFuncionarios = sc.nextInt();
        sc.nextLine();

        Pessoa_Funcionarios[] pessoas = new Pessoa_Funcionarios[qtdFuncionarios];

        for (int cont = 0; cont < qtdFuncionarios; cont++) {

            System.out.println("-=-=-=-=-=-");
            System.out.print("Nome --> ");
            nome = sc.nextLine();
            System.out.print("Idade --> ");
            idade = sc.nextInt();
            sc.nextLine();
            System.out.print("CPF --> ");
            cpf = sc.nextLine();
            System.out.print("Departamento --> ");
            departamento = sc.nextLine();


            pessoas[cont] = new Pessoa_Funcionarios(nome, idade, cpf, departamento);

        }

        for (int cont = 0; cont < qtdFuncionarios; cont++){
            exibirDetalhes = pessoas[cont].exibir_detalhes();
            System.out.println(" ");
            System.out.println("Funcionário " + (cont + 1) + ":");
            System.out.println(pessoas[cont].exibir_detalhes());
        }

        sc.close();
    }
}
