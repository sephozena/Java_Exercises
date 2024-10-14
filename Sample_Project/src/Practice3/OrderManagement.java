package Practice3;

import java.util.ArrayList;
import java.util.List;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class OrderManagement {
    private ItemManagement itemManagement;
    private List<Order> orderHistory; // List to store all orders

    public OrderManagement(ItemManagement itemManagement) {
        this.itemManagement = itemManagement;
        this.orderHistory = new ArrayList<>();
    }

    public void createOrder(Scanner scanner) {
        Order newOrder = new Order();
        while (true) {
            System.out.println("Enter the item name (or type 'done' to complete the order): ");
            String itemName = scanner.nextLine();

            if (itemName.equalsIgnoreCase("done")) {
                orderHistory.add(newOrder); // Add the completed order to history
                System.out.println("Order created!");
                break;
            }

            Item item = itemManagement.getItemByName(itemName);
            if (item == null) {
                System.out.println(itemName + " not found. Try again.");
                continue;
            }

            System.out.println("Enter quantity: ");
            int quantity;
            try {
                quantity = scanner.nextInt();
                scanner.nextLine(); // Consume the leftover newline
                item.reduceItemQuantity(quantity);
                newOrder.addItem(item, quantity);
            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid number for quantity.");
                scanner.nextLine(); // Clear the buffer
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public void displayOrderHistory() {
        if (orderHistory.isEmpty()) {
            System.out.println("No orders yet!");
            return;
        }

        System.out.println("\nOrder History:");
        for (int i = 0; i < orderHistory.size(); i++) {
            Order order = orderHistory.get(i);
            System.out.println("Order " + (i + 1) + ":");
            for (Map.Entry<Item, Integer> entry : order.getItemsOrdered().entrySet()) {
                System.out.println("- " + entry.getKey().getItemName() + " | Quantity: " + entry.getValue());
            }
            System.out.println("Total Price: $" + order.getTotalPrice() + "\n");
        }
    }
}
