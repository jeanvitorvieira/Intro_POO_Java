package application;

import util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class ExFinal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double price = sc.nextDouble();
        System.out.print("How many dollars will be bought? ");
        double dollar = sc.nextDouble();

        double amount = CurrencyConverter.Converter(price, dollar);
        System.out.printf("\nAmount to be paid in reais = R$%.2f", amount);
    }
}