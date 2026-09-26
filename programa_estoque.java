package programas;

import entidades.Estoque;

import java.util.Scanner;

public class programa_estoque {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int qtdNovosProdutos, qtdRemovidos;

        System.out.println("Informações do produto:");
        System.out.print("Nome --------> ");
        String nome = sc.nextLine();
        System.out.print("Preço -------> ");
        double preco = sc.nextDouble();
        System.out.print("Quantidade --> ");
        int quant_estoque = sc.nextInt();

        Estoque produto = new Estoque(nome, preco, quant_estoque);

        System.out.println(produto);

        System.out.println(" ");

        System.out.print("Quantidade de produtos a serem adicionados no estoque --> ");
        qtdNovosProdutos = sc.nextInt();
        produto.AdicionarProdutos(qtdNovosProdutos);

        System.out.println(" ");

        System.out.println("Informações atualizadas:");
        System.out.println(produto);

        System.out.println(" ");

        System.out.print("Quantidade de produtos a serem removidos no estoque --> ");
        qtdRemovidos = sc.nextInt();
        produto.quant_estoque -= qtdRemovidos;

        System.out.println(" ");

        System.out.println("Informações atualizadas:");
        System.out.println(produto);
        sc.close();
    }
}
