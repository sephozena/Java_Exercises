package Test4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OrderManager orderManager = new OrderManager();

        // Sample Products
        orderManager.addProductToCatalog(new GroceryItem("Apple", 0.5, 100, "2024-12-31"));
        orderManager.addProductToCatalog(new ElectronicsItem("Laptop", 999.99, 20, "2 years"));

        while (true) {
            System.out.println("\nOrdering System Menu:");
            System.out.println("1. View Products");
            System.out.println("2. Create Order");
            System.out.println("3. View Order");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            try {
				switch (choice) {
				    case 1:
				        orderManager.viewProducts();
				        break;
				    case 2:
				    	
					try {
						System.out.print("Enter product name: ");
				        String productName = scanner.nextLine();
				        System.out.print("Enter quantity: ");
				        int quantity = scanner.nextInt();
				        orderManager.createOrder(productName, quantity);
					} catch (InputMismatchException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				        break;
				    case 3:
				        orderManager.viewOrder();
				        break;
				    case 4:
				        System.out.println("Exiting the system.");
				        scanner.close();
				        System.exit(0);
				        return;
				    default:
				        System.out.println("Invalid option. Please try again.");
				}
			} catch (InputMismatchException | IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
        }
    }
}
