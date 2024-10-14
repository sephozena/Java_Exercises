package Practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
	
	ProductManagement productManagement = new ProductManagement();
	
	public void displayMenu() {
        System.out.println("\nOrder Processing System Menu:");
        System.out.println("1. View Products");
        System.out.println("2. Create Order");
        System.out.println("3. Exit");
	}
	
	
    public void userInput(Scanner scanner) {
        while (true) {
            displayMenu();
            System.out.print("Choose an option: ");
            try {
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline
                switch (choice) {
                    case 1:
                        // placeOrder(scanner);
                    	productManagement.viewAvailableProduct();
                    	break;
                    case 2:
                        // increaseStock(scanner);
                    	System.out.println("test2");

                        break;
                    case 3:
                        // decreaseStock(scanner);
                        System.out.println("test3.");
                        break;
                        
                    case 4:
                        // exit system
                      System.out.println("Exiting the system.");
                      System.exit(0);
                      break;


                    default:
                        System.out.println("Invalid option, please try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.nextLine(); // Clear invalid input
            } catch (IllegalArgumentException e) {
            	System.out.println(e.getMessage());
            }
        }
    }

}
