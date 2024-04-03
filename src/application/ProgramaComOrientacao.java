package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Triangle;

public class ProgramaComOrientacao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        //x e y são objetos/instâncias da classe Triangle
        Triangle x,y;
        //dinamicos/heaps
        x = new Triangle();
        y = new Triangle();

        System.out.println("Digite as 3 medidas de um triângulo X:");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("\nDigite as 3 medidas de um triângulo Y:");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("\nÁrea do triângulo X: %.4f", areaX);
        System.out.printf("\nÁrea do triângulo Y: %.4f", areaY);

        if (areaX > areaY) {
            System.out.println("\nMaior área: X");
        } else {
            System.out.println("\nMaior área: Y");
        }
    }
}