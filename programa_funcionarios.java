package programas;

import entidades.Funcionarios;
import java.util.Scanner;

public class programa_funcionarios {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Funcionarios a, b;

        a = new Funcionarios();
        b = new Funcionarios();


        System.out.println("Funcionário 1:");
        System.out.print("Nome --> ");
        a.nome = sc.nextLine();
        System.out.print("Idade --> ");
        a.idade = sc.nextInt();
        sc.nextLine();
        System.out.print("CPF --> ");
        a.cpf = sc.nextLine();
        System.out.print("Departamento --> ");
        a.departamento = sc.nextLine();

        System.out.println(" ");
        System.out.println("Funcionário 2:");
        System.out.print("Nome --> ");
        b.nome = sc.nextLine();
        System.out.print("Idade --> ");
        b.idade = sc.nextInt();
        sc.nextLine();
        System.out.print("CPF --> ");
        b.cpf = sc.nextLine();
        System.out.print("Departamento --> ");
        b.departamento = sc.nextLine();
        System.out.println(" ");

        System.out.println(a);
        System.out.println(" ");
        System.out.println(b);

        sc.close();

    }
}
