package Practice5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ItemManagement itemManagement = new ItemManagement();
        OrderManagement orderManagement = new OrderManagement(itemManagement);

        while (true) {
            displayMenu();
            int userInput = getUserInput(scanner);
            switch (userInput) {
                case 1:
                    itemManagement.displayProduct(); // View available products
                    break;
                case 2:
                    orderManagement.createOrder(scanner); // Create an order
                    break;
                case 3:
                    orderManagement.displayOrderHistory(); // View order history
                    break;
                case 4:
                    orderManagement.removeItemFromOrder(scanner); // Remove a specific item from the order
                    break;
                case 5:
                    orderManagement.clearOrder(); // Clear the entire order
                    break;
                case 6:
                    orderManagement.placeOrder(scanner); // Place the current order with payment and delivery details
                    break;
                case 7:
                    System.out.println("Program terminated.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    // Display the menu for the user
    private static void displayMenu() {
        System.out.println("\n\t************ Menu ************");
        System.out.println("\t1. View Products");
        System.out.println("\t2. Create Order");
        System.out.println("\t3. View Order History");
        System.out.println("\t4. Remove an Item from Order");
        System.out.println("\t5. Clear Order");
        System.out.println("\t6. Place Order");
        System.out.println("\t7. Exit");
        System.out.print("\tChoose an option: ");
    }

    // Get user input safely with error handling
    private static int getUserInput(Scanner scanner) {
        int userInput = 0;
        while (true) {
            try {
                userInput = scanner.nextInt();
                scanner.nextLine(); // Consume newline
                break;
            } catch (InputMismatchException e) {
                System.out.println("Please input a valid number.");
                scanner.nextLine(); // Clear invalid input
            }
        }
        return userInput;
    }
}
