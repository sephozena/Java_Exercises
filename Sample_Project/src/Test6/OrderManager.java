package Test6;
import java.util.InputMismatchException;
import java.util.Scanner;

public class OrderManager {
    private ProductManager productManager;
    private Order lastOrder;

    public OrderManager(ProductManager productManager) {
        this.productManager = productManager;
        this.lastOrder = null;
    }

    public void createOrder(Scanner scanner) {
        Order order = new Order();
        while (true) {
            System.out.print("Enter product name to add to order (or type 'done' to finish): ");
            String productName = scanner.nextLine();

            if (productName.equalsIgnoreCase("done")) {
                break;
            }

            Product product = productManager.getProductByName(productName);
            if (product == null) {
                System.out.println("Product not found. Please try again.");
                continue;
            }

            System.out.print("Enter quantity: ");
            int quantity = 0;
            try {
                quantity = scanner.nextInt();
                scanner.nextLine(); // Clear the newline
                product.reduceQuantity(quantity);
                order.addProduct(product, quantity);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.nextLine(); // Clear invalid input
            }
        }

        lastOrder = order;
        System.out.println("Order created successfully!");
        displayOrder(order);
    }

    public void viewLastOrder() {
        if (lastOrder != null) {
            System.out.println("\nLast Order Summary:");
            displayOrder(lastOrder);
        } else {
            System.out.println("No orders have been placed yet.");
        }
    }

    private void displayOrder(Order order) {
        System.out.println("Products in Order:");
        for (Product product : order.getProducts()) {
            System.out.println(product);
        }
        System.out.println("Total Price: $" + order.getTotalPrice());
    }
}
