package Practice4;

import java.util.Scanner;

// Main class to run the ordering system
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
                    itemManagement.displayProducts();
                    break;
                case 2:
                    orderManagement.createOrder(scanner);
                    break;
                case 3:
                    orderManagement.displayOrderHistory();
                    break;
                case 4:
                    System.out.println("Program terminated.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
    }

    private static void displayMenu() {
        System.out.println("\n************ Menu ************");
        System.out.println("1. View Products");
        System.out.println("2. Create Order");
        System.out.println("3. View Order History");
        System.out.println("4. Exit");
        System.out.print("Choose an option: ");
    }

    private static int getUserInput(Scanner scanner) {
        int userInput = 0;
        while (true) {
            try {
                userInput = scanner.nextInt();
                scanner.nextLine(); // Clear newline
                break;
            } catch (Exception e) {
                System.out.println("Please input a valid number.");
                scanner.nextLine();
            }
        }
        return userInput;
    }
}
