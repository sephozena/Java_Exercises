package Test6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OrderingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductManager productManager = new ProductManager();
        OrderManager orderManager = new OrderManager(productManager);

        while (true) {
            displayMenu();
            int choice = getUserChoice(scanner);

            switch (choice) {
                case 1:
                    productManager.displayProducts();
                    break;
                case 2:
                    orderManager.createOrder(scanner);
                    break;
                case 3:
                    orderManager.viewLastOrder();
                    break;
                case 4:
                    System.out.println("Exiting the system.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private static void displayMenu() {
        System.out.println("\n********** Ordering System Menu **********");
        System.out.println("1. View Products");
        System.out.println("2. Create Order");
        System.out.println("3. View Last Order");
        System.out.println("4. Exit");
        System.out.print("Choose an option: ");
    }

    private static int getUserChoice(Scanner scanner) {
        int choice = 0;
        while (true) {
            try {
                choice = scanner.nextInt();
                scanner.nextLine(); // Clear the newline
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.nextLine(); // Clear invalid input
            }
        }
        return choice;
    }
}
