package Test2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        OrderSystem orderSystem = new OrderSystem(inventory);
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("\nOrder System Menu:");
            System.out.println("1. Display Items");
            System.out.println("2. Place an Order");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    inventory.displayItems();
                    break;
                    
                case 2:
                    System.out.print("Enter item name: ");
                    String itemName = scanner.nextLine();
                    System.out.print("Enter quantity: ");
                    int quantity = scanner.nextInt();
                    
                    try {
                        orderSystem.placeOrder(itemName, quantity);
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                    
                case 3:
                    System.out.println("Exiting...");
                    break;
                    
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 3);

        scanner.close();
    }
}
