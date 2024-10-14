package Practice4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Manages the creation and display of orders
public class OrderManagement {
    private ItemManagement itemManagement;
    private List<Order> orderHistory;

    public OrderManagement(ItemManagement itemManagement) {
        this.itemManagement = itemManagement;
        this.orderHistory = new ArrayList<>();
    }

    // Create a new order
    public void createOrder(Scanner scanner) {
        Order order = new Order();
        while (true) {
            System.out.println("Enter the item name (or type 'done' to finish): ");
            String itemName = scanner.nextLine();

            if (itemName.equalsIgnoreCase("done")) {
                break;
            }

            Item item = itemManagement.getItemByName(itemName);
            if (item == null) {
                System.out.println("Item not found!");
                continue;
            }

            if (item.getItemQuantity() == 0){
                System.out.println("Out of stock for item "+ itemName);
				itemManagement.instockProduct();
				continue;
            }

            System.out.println("Enter quantity: ");
            int quantity = scanner.nextInt();
            scanner.nextLine(); // Clear the newline

            try {
                item.reduceItemQuantity(quantity);
                order.addItem(item, quantity);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        orderHistory.add(order);
        System.out.println("Order created successfully!");
    }

    // Display all previous orders
    public void displayOrderHistory() {
        if (orderHistory.isEmpty()) {
            System.out.println("No orders have been placed yet.");
        } else {
            System.out.println("\nOrder History:");
            for (int i = 0; i < orderHistory.size(); i++) {
                Order order = orderHistory.get(i);
                System.out.println("Order " + (i + 1) + ":");
                
                List<Item> items = order.getOrderedItems();
                List<Integer> quantities = order.getQuantities();
                for (int j = 0; j < items.size(); j++) {
                    System.out.println("- " + items.get(j).getItemName() + " | Quantity: " + quantities.get(j));
                }
                System.out.println("Total Price: $" + order.getTotalPrice());
            }
        }
    }
}
