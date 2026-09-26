package programas;

import java.util.Arrays;
import java.util.Scanner;
import entidades.Livros;

public class programa_livros {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String titulo, autor;
        int ano, pag, num;


        System.out.print("Quantos Livros serão cadastrados --> ");
        num = sc.nextInt();
        sc.nextLine();
        Livros[] livros = new Livros[num];

        for (int cont = 0; cont < livros.length; cont++) {

            System.out.println("-=-=-=-=-=-=-=-");
            System.out.print("Titulo do livro  --> ");
            titulo = sc.nextLine();
            System.out.print("Nome do Autor --> ");
            autor = sc.nextLine();
            System.out.print("Ano de lançamento --> ");
            ano = sc.nextInt();
            System.out.print("Quantidade de paginas --> ");
            pag = sc.nextInt();
            sc.nextLine();

            livros[cont] = new Livros(titulo, autor, ano, pag);
        }

        System.out.println(" ");
        System.out.println(Arrays.toString(livros));
    }
}
