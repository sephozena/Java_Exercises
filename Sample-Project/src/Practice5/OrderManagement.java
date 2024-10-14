package Practice5;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

// Class to handle the ordering process
public class OrderManagement {
    private ItemManagement itemManagement;
    private List<Order> orderHistory;

    public OrderManagement(ItemManagement itemManagement) {
        this.itemManagement = itemManagement;
        this.orderHistory = new ArrayList<>();
    }

    // Create an order by selecting products
    public void createOrder(Scanner scanner) {
        Order newOrder = new Order();
        while (true) {
            System.out.println("Enter the item name (or type 'done' to finish): ");
            String itemName = scanner.nextLine();

            if (itemName.equalsIgnoreCase("done")) {
                break;
            }

            Item item = itemManagement.getItemByName(itemName);
            if (item == null) {
                System.out.println(itemName + " not found in inventory.");
                continue;
            }
            
            if (item.getItemQuantity() == 0){
                System.out.println("Out of stock for item "+ itemName);
				itemManagement.instockProduct();
				continue;
            }

            System.out.println("Enter quantity: ");
            int quantity = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            try {
                item.reduceItemQuantity(quantity); // Reduce stock
                newOrder.addItem(item, quantity); // Add to the order
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        orderHistory.add(newOrder); // Add order to history
        System.out.println("Order placed successfully!");
    }

    // Display all previous orders
    public void displayOrderHistory() {
        if (orderHistory.isEmpty()) {
            System.out.println("No orders placed yet.");
            return;
        }

        for (Order order : orderHistory) {
            System.out.println("\nOrder:");
            for (Map.Entry<Item, Integer> entry : order.getItemsOrdered().entrySet()) {
                System.out.println("- " + entry.getKey().getItemName() + " | Quantity: " + entry.getValue());
            }
            System.out.println("Total Price: $" + order.getTotalPrice());
        }
    }

    // Remove a specific item from the current order
    public void removeItemFromOrder(Scanner scanner) {
        // Logic for removing a specific item from the current order
    }

    // Clear the current order
    public void clearOrder() {
        // Logic to clear the current order
    }

    // Finalize and place the order with payment and delivery details
    public void placeOrder(Scanner scanner) {
        System.out.println("Enter delivery address: ");
        String address = scanner.nextLine();

        System.out.println("Enter payment details (e.g., card number): ");
        String paymentDetails = scanner.nextLine();

        System.out.println("Order placed! Delivery to: " + address);
        // Generate order number and finalize
    }
}
