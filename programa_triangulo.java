package programas;

import entidades.Triangulo;

import java.util.Locale;
import java.util.Scanner;

public class programa_triangulo {
    static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        double areaX, areaY;

        Triangulo x, y;
        x = new Triangulo();
        y = new Triangulo();

        System.out.println("Medidas do Triângulo X em m²:");
        System.out.print("Lado A --> ");
        x.a = sc.nextDouble();
        System.out.print("Lado B --> ");
        x.b = sc.nextDouble();
        System.out.print("Lado C --> ");
        x.c = sc.nextDouble();

        areaX = x.area();

        System.out.println("Medidas do Triângulo Y em m²:");
        System.out.print("Lado A --> ");
        y.a = sc.nextDouble();
        System.out.print("Lado B --> ");
        y.b = sc.nextDouble();
        System.out.print("Lado C --> ");
        y.c = sc.nextDouble();

        areaY = y.area();

        System.out.printf("A área do Triângulo X é %.2fm²" , areaX);
        System.out.println(" ");
        System.out.printf("A área do Triângulo Y é %.2fm²" , areaY);
    }
}
