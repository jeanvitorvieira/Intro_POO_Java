package application;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Student student = new Student();
        student.name = sc.nextLine();
        student.grade1 = sc.nextDouble();
        student.grade2 = sc.nextDouble();
        student.grade3 = sc.nextDouble();
        System.out.printf("\nFINAL GRADE = %.2f", student.Sum());
        if (student.Sum() < 60.0) {
            System.out.println("\nFAILED");
            System.out.printf("MISSING %.2f POINTS\n", student.MissingPoints());
        }
        else {
            System.out.println("\nPASS");
        }
        sc.close();
    }
}
