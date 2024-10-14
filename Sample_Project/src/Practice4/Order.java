package Practice4;

import java.util.ArrayList;
import java.util.List;

// Stores the items ordered by a customer
public class Order {
    private List<Item> orderedItems;
    private List<Integer> quantities;
    private double totalPrice;

    public Order() {
        orderedItems = new ArrayList<>();
        quantities = new ArrayList<>();
        totalPrice = 0;
    }

    // Add item to the order
    public void addItem(Item item, int quantity) {
        orderedItems.add(item);
        quantities.add(quantity);
        totalPrice += item.getItemPrice() * quantity;
    }

    // Get the list of ordered items
    public List<Item> getOrderedItems() {
        return orderedItems;
    }

    // Get the list of quantities corresponding to ordered items
    public List<Integer> getQuantities() {
        return quantities;
    }

    // Get the total price of the order
    public double getTotalPrice() {
        return totalPrice;
    }

    // Clear the current order
    public void clearOrder() {
        orderedItems.clear();
        quantities.clear();
        totalPrice = 0;
    }
}

