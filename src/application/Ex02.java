package application;

import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Employee employee = new Employee();
        System.out.print("Name: ");
        employee.Name = sc.nextLine();
        System.out.print("Gross Salary: ");
        employee.GrossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        employee.Tax = sc.nextDouble();
        System.out.println("\nEmployee: " + employee);
        System.out.print("\nWhich percentage to increase salary? ");
        double percentage = sc.nextDouble();
        employee.IncreaseSalary(percentage);
        System.out.println("\nUpdated Data: " + employee);
        sc.close();
    }
}