package programas;

import entidades.Filme2;

import java.util.Scanner;

public class programa_filme2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos filmes serão cadastrados?");
        int qtdFilmes = sc.nextInt();
        sc.nextLine();

        Filme2[] filme2 = new Filme2[qtdFilmes];

        for (int cont = 0; cont < filme2.length; cont++) {

            System.out.println("Quais dados serão cadastrados no filme " + (cont + 1) + "?" +
                    " [1] APENAS TÍTULO + GÊNERO | [2] TODOS OS DADOS");
            int verifDados = sc.nextInt();
            sc.nextLine();

            if (verifDados == 1) {

                System.out.println("-=-=-=-=-=-=-");
                System.out.println("Título: ");
                String titulo = sc.nextLine();
                System.out.println("Gênero: ");
                String genero = sc.nextLine();

                filme2[cont] = new Filme2(titulo, genero);

            }

            else if (verifDados == 2) {

                System.out.println("-=-=-=-=-=-=-");
                System.out.println("Título: ");
                String titulo = sc.nextLine();
                System.out.println("Gênero: ");
                String genero = sc.nextLine();
                System.out.println("Classificação Indicativa: ");
                int classificacaoIndicativa = sc.nextInt();
                sc.nextLine();
                System.out.println("Ano de Lançamento: ");
                int anoDeLancamento = sc.nextInt();
                sc.nextLine();
                System.out.println("Nota: ");
                double nota = sc.nextDouble();
                sc.nextLine();

                filme2[cont] = new Filme2(titulo, genero, classificacaoIndicativa, anoDeLancamento, nota);

                System.out.println("Deseja corrigir algum dado? [0] NÃO - " +
                        "[1] TÍTULO - [2] GÊNERO - [3] CLASS. INDICATIVA " +
                        "[4] ANO DE LANÇAMENTO [5] NOTA");
                int corrigirDados = sc.nextInt();
                sc.nextLine();

                if (corrigirDados == 1) {
                    System.out.println("Título Atualizado: ");
                    filme2[cont].setTitulo(sc.nextLine());
                }
                else if (corrigirDados == 2) {
                    System.out.println("Gênero Atualizado: ");
                    filme2[cont].setGenero(sc.nextLine());
                }
                else if (corrigirDados == 3) {
                    System.out.println("Classificação Indicativa Atualizada:");
                    filme2[cont].setClassificacaoIndicativa(sc.nextInt());
                }
                else if (corrigirDados == 4) {
                    System.out.println("Ano de Lançamento Atualizado: ");
                    filme2[cont].setAnodeLancamento(sc.nextInt());
                }
                else if (corrigirDados == 5) {
                    System.out.println("Nota Atualizada: ");
                    filme2[cont].setNota(sc.nextDouble());
                }
                else {
                    continue;
                }
            }
            else {
                return;
            }
        }

        for (int cont = 0; cont < filme2.length; cont++) {

            if (filme2[cont].getAnodeLancamento() > 0) {

                System.out.println("-=-=-=- FILME " + (cont + 1) + " -=-=-=-");
                System.out.println("Título: " + filme2[cont].getTitulo());
                System.out.println("Gênero: " + filme2[cont].getGenero());
                System.out.println("Classificação Indicativa: " + filme2[cont].verifClassificacaoIndicativa());
                System.out.println("Ano de Lançamento: " + filme2[cont].getAnodeLancamento());
                System.out.println("Época: " + filme2[cont].verificarEpoca());
                System.out.println("Nota do Filme: " + filme2[cont].getNota());
                System.out.println("Avaliação da Nota: " + filme2[cont].verificarNota());
                System.out.println(" ");

            }

            else {
                System.out.println("-=-=-=- FILME " + (cont + 1) + " -=-=-=-");
                System.out.println("Título: " + filme2[cont].getTitulo());
                System.out.println("Gênero: " + filme2[cont].getGenero());
                System.out.println("Classificação Indicativa: Desconhecida");
                System.out.println("Ano de Lançamento: Desconhecido");
                System.out.println("Época: Desconhecida");
                System.out.println("Nota do Filme: Desconhecida");
                System.out.println("Avaliação da Nota: Desconhecida");
                System.out.println(" ");
            }
        }
    }
}
