package application;

import entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();
        System.out.println("Enter rectangle width and height: ");
        rectangle.width = sc.nextDouble();
        rectangle.heigth = sc.nextDouble();
        System.out.printf("\nAREA = %.2f", rectangle.Area());
        System.out.printf("\nPERIMETER = %.2f", rectangle.Perimeter());
        System.out.printf("\nDIAGONAL = %.2f", rectangle.Diagonal());
        sc.close();
    }
}