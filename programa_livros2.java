package programas;

import entidades.Livros2;

import java.util.Scanner;

public class programa_livros2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String titulo, autor;
        int anoPublicacao, qtdPag;
        String status;

        System.out.print("Quantos livros deseja cadastrar? --> ");
        int qtdLivros = sc.nextInt();

        Livros2[] livros2 = new Livros2[qtdLivros];

        for (int cont = 0; cont < livros2.length; cont++) {

            System.out.println("-=-=-=-=-=-=-");
            System.out.println("Livro " + (cont + 1) + ":");
            sc.nextLine();
            System.out.print("Título --> ");
            titulo = sc.nextLine();
            System.out.print("Autor --> ");
            autor = sc.nextLine();
            System.out.print("Ano de publicação --> ");
            anoPublicacao = sc.nextInt();
            System.out.print("Quantidade de páginas --> ");
            qtdPag = sc.nextInt();

            livros2[cont] = new Livros2(titulo, autor, anoPublicacao, qtdPag);

            status = livros2[cont].verificarStatus();
        }

        for (int cont = 0; cont < livros2.length; cont++){

            System.out.println("-=-=-=-=-=-");
            System.out.println("Livro " + (cont + 1) + ":");
            System.out.println(livros2[cont].exibirDetalhes());
        }
    }
}
