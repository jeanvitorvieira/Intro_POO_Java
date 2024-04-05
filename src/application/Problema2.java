package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Problema2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int quantity, bigOp, shortOp;
        String name;
        double price;
        Product product = new Product();

        System.out.println("Enter product data:");
        System.out.print("Name: ");
        product.name = sc.nextLine();
        System.out.print("Price: ");
        while (!sc.hasNextDouble()) {
            System.out.println("\nInvalid input! Please enter a real number.");
            System.out.print("Price: ");
            sc.next();
        }
        product.price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        while (!sc.hasNextInt()) {
            System.out.println("\nInvalid input! Please enter a number.");
            System.out.print("Quantity in stock: ");
            sc.next();
        }
        product.quantity = sc.nextInt();
        sc.nextLine();

        System.out.println("\nProduct data: " + product);

        while (true) {
            System.out.println("\nDo you wanna change any information? ");
            System.out.println("1 - Yes \n2 - No");
            while (!sc.hasNextInt()) {
                System.out.println("\nInvalid input! Please enter a number.");
                System.out.println("\nDo you wanna change any information? ");
                System.out.println("\n1 - Yes \n2 - No");
                sc.next();
            }
            bigOp = sc.nextInt();
            sc.nextLine();

            if (bigOp == 1) {
                int op = 1;

                while (op == 1) {
                    System.out.println("\nWhat do you wanna do? ");
                    System.out.println("1 - Change the name \n2 - Change the price \n3 - Change the quantity");
                    while (!sc.hasNextInt()) {
                        System.out.println("\nInvalid input! Please enter a number.");
                        System.out.println("\nWhat do you wanna do? ");
                        System.out.println("1 - Change the name \n2 - Change the price \n3 - Change the quantity");
                        sc.next();
                    }
                    shortOp = sc.nextInt();
                    sc.nextLine();

                    if (shortOp == 1) {
                        System.out.println("\nEnter the new name of the product: ");
                        name = sc.nextLine();
                        product.changeName(name);
                        System.out.println("\nUpdated data: " + product);
                    } else if (shortOp == 2) {
                        System.out.println("\nEnter the new price of the product: ");
                        while (!sc.hasNextDouble()) {
                            System.out.println("\nInvalid input! Please enter a real number.");
                            System.out.println("\nEnter the new price of the product: ");
                            sc.next();
                        }
                        price = sc.nextDouble();
                        product.changePrice(price);
                        System.out.println("\nUpdated data: " + product);
                    } else if (shortOp == 3) {
                        System.out.println("\nWhat do you wanna do with the stock?");
                        System.out.println("1 - Add \n2 - Remove");
                        while (!sc.hasNextInt()) {
                            System.out.println("\nInvalid input! Please enter a number.");
                            System.out.println("\nWhat do you wanna do with the stock?");
                            System.out.println("1 - Add \n2 - Remove");
                            sc.next();
                        }
                        int stockOp = sc.nextInt();
                        sc.nextLine();

                        if (stockOp == 1) {
                            System.out.print("\nEnter the number of products to be added in stock: ");
                            while (!sc.hasNextInt()) {
                                System.out.println("\nInvalid input! Please enter a number.");
                                System.out.println("\nEnter the number of products to be added in stock: ");
                                sc.next();
                            }
                            quantity = sc.nextInt();
                            sc.nextLine();
                            product.addProducts(quantity);
                            System.out.println("\nUpdated data: " + product);
                        } else if (stockOp == 2) {
                            System.out.print("\nEnter the number of products to be removed from stock: ");
                            while (!sc.hasNextInt()) {
                                System.out.println("\nInvalid input! Please enter a number.");
                                System.out.println("\nEnter the number of products to be removed from stock: ");
                                sc.next();
                            }
                            quantity = sc.nextInt();
                            sc.nextLine();
                            product.removeProducts(quantity);
                            System.out.println("\nUpdated data: " + product);
                        } else {
                            System.out.println("\nInvalid Option!");
                        }
                    } else {
                        System.out.println("\nInvalid Option!");
                    }
                    op = 2;
                }
            } else if (bigOp == 2) {
                System.out.println("\nThank you for using our services!");
                break;
            } else {
                System.out.println("\nInvalid Option!");
            }
        }
        sc.close();
    }
}
