package OrderProcessing;

import java.util.Scanner;

public class OrderProcessingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Product[] products = {
            new Product("Laptop", 10),
            new Product("Phone", 20),
            new Product("Tablet", 15)
        };

        OrderSystem orderSystem = new OrderSystem(products);
        
        while (true) {
            System.out.println("\nOrder System Menu:");
            System.out.println("1. Process Order");
            System.out.println("2. Restock Product");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            if (choice == 1) {
                System.out.print("Enter product name: ");
                String productName = scanner.nextLine();
                System.out.print("Enter quantity to order: ");
                int quantity = scanner.nextInt();

                try {
                    orderSystem.processOrder(productName, quantity);
                } catch (IllegalArgumentException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            } else if (choice == 2) {
                System.out.print("Enter product name to restock: ");
                String productName = scanner.nextLine();
                System.out.print("Enter quantity to restock: ");
                int quantity = scanner.nextInt();

                try {
                    orderSystem.restockProduct(productName, quantity);
                } catch (IllegalArgumentException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            } else if (choice == 3) {
                System.out.println("Exiting the order system.");
                scanner.close();
                return;
            } else {
                System.out.println("Invalid option, please try again.");
            }
        }
    }
}