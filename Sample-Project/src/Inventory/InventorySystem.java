package Inventory;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InventorySystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initializing products
        InventoryItem[] items = {
            new InventoryItem("Monitor", 1300.00, 50),
            new InventoryItem("Keyboard", 150.00, 150),
            new InventoryItem("Mouse", 100.00, 100)
        };
        

        // Inventory Management object
        InventoryManagement inventory = new InventoryManagement(items);

        // Main loop to process user inputs
        while (true) {
            System.out.println("\nInventory Management Menu:");
            System.out.println("1. Add Stock");
            System.out.println("2. Remove Stock");
            System.out.println("3. Display Inventory");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            
            int choice = 0;
            
            try {
                choice = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character

                switch (choice) {
                    case 1:
                        // Adding stock
                        System.out.print("Enter item name: ");
                        String itemNameAdd = scanner.nextLine();
                        if (!inventory.itemExists(itemNameAdd)) {
                            System.out.println("Error: Item not found.");
                            inventory.displayInventory();
                            continue;
                        }
                        System.out.print("Enter quantity to add: ");
                        int quantityAdd = scanner.nextInt();
                        inventory.addStock(itemNameAdd, quantityAdd);
                        break;
                    
                    case 2:
                        // Removing stock
                        System.out.print("Enter item name: ");
                        String itemNameRemove = scanner.nextLine();
                        if (!inventory.itemExists(itemNameRemove)) {
                            System.out.println("Error: Item not found.");
                            inventory.displayInventory();
                            continue;
                        }
                        System.out.print("Enter quantity to remove: ");
                        int quantityRemove = scanner.nextInt();
                        inventory.removeStock(itemNameRemove, quantityRemove);
                        break;

                    case 3:
                        // Displaying inventory
                        inventory.displayInventory();
                        break;

                    case 4:
                        // Exiting the system
                        System.out.println("Exiting the inventory system.");
                        scanner.close();
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Invalid option, please try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.nextLine(); // Clear invalid input
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            } 
        }
    }
}
