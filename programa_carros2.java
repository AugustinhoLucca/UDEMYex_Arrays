package programas;

import entidades.Carros2;

import java.util.Scanner;

public class programa_carros2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Declaração de variáveis
        String marca, modelo, cor, exibirDetalhes;
        int anoFabricacao, qtdCarros;

        // Quantidade de carros cadastrados
        System.out.print("Quantos carros serão cadastrados? --> ");
        qtdCarros = sc.nextInt();
        sc.nextLine();

        // Declaração do Vetor/Array de carros
        Carros2[] carros = new Carros2[qtdCarros];

        // ‘Loop’ para atribuição de dados
        for (int cont = 0; cont < qtdCarros; cont++) {
            System.out.println("-=-=-=-=-=-");
            System.out.println("Carro " + (cont + 1) + ":");
            System.out.print("Marca --> ");
            marca = sc.nextLine();
            System.out.print("Modelo --> ");
            modelo = sc.nextLine();
            System.out.print("Cor --> ");
            cor = sc.nextLine();
            System.out.print("Ano de Fabricação --> ");
            anoFabricacao = sc.nextInt();
            sc.nextLine();

            carros[cont] = new Carros2(marca, modelo, cor, anoFabricacao);
        }

        // 'Loop' para exibição na tela
        for (int cont = 0; cont < qtdCarros; cont++) {
            System.out.println(" ");
            System.out.println("Carro " + (cont + 1) + ":");
            System.out.println(carros[cont].exibirDetalhes());
        }

    }
}
