package application;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaSemOrientacao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite as 3 medidas de um triângulo X:");
        double xA = sc.nextDouble();
        double xB = sc.nextDouble();
        double xC = sc.nextDouble();
        System.out.println("\nDigite as 3 medidas de um triângulo Y:");
        double yA = sc.nextDouble();
        double yB = sc.nextDouble();
        double yC = sc.nextDouble();
        double p = (xA + xB + xC) / 2;
        double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));
        p = (yA + yB + yC) / 2;
        double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));
        System.out.printf("\nÁrea do triângulo X: %.4f", areaX);
        System.out.printf("\nÁrea do triângulo Y: %.4f", areaY);
        if (areaX > areaY) {
            System.out.println("\nMaior área: X");
        } else {
            System.out.println("\nMaior área: Y");
        }
    }
}