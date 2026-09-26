package programas;

import entidades.Carros;

import java.util.Arrays;
import java.util.Scanner;

public class programa_carros {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String marca, modelo, cor;
        int ano, qtd;

        System.out.print("Quantos carros serão cadastrados --> ");
        qtd = sc.nextInt();

        Carros[] carro = new Carros[qtd];

        for (int cont = 0; cont < qtd; cont++) {

            sc.nextLine();
            System.out.println("-=-=-=-=-=-=-=-");
            System.out.println("Carro " + (cont + 1) + ":");
            System.out.print("Marca --> ");
            marca = sc.nextLine();
            System.out.print("Modelo --> ");
            modelo = sc.nextLine();
            System.out.print("Cor --> ");
            cor = sc.nextLine();
            System.out.print("Ano --> ");
            ano = sc.nextInt();


            carro[cont] = new Carros(marca, modelo, cor, ano);
        }

        System.out.println(Arrays.toString(carro));



        sc.close();
    }
}
