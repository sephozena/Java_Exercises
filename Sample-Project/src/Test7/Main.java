package Test7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Customer customer = new Customer("john_doe", "password123", "123 Main St", "Credit Card");
        OrderManagement orderManagement = new OrderManagement();
        
        while (true) {
            System.out.println("1. Browse Products\n2. Add Product to Order\n3. Review Order\n4. Place Order\n5. Exit");
            try {
            	
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear input buffer

            switch (choice) {
                case 1:
                    orderManagement.createOrder(scanner);
                    break;
                case 2:
                    orderManagement.reviewCurrentOrder();
                    break;
                case 3:
                    orderManagement.placeOrder(customer);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option, please try again.");
            }
        }catch(InputMismatchException e) {
        	System.out.println(e.getMessage() + "invalid input");
        	scanner.nextLine();
        }
        }     
    }
}
