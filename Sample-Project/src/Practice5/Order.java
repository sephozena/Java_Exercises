package Practice5;

import java.util.HashMap;
import java.util.Map;

// Class representing a customer order
public class Order {
    private Map<Item, Integer> itemsOrdered;
    private double totalPrice;

    public Order() {
        itemsOrdered = new HashMap<>();
        totalPrice = 0;
    }

    // Add an item to the order with the quantity
    public void addItem(Item item, int quantity) {
        itemsOrdered.put(item, quantity);
        totalPrice += item.getItemPrice() * quantity;
    }

    public Map<Item, Integer> getItemsOrdered() {
        return itemsOrdered;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    // Clear the order when needed
    public void clearOrder() {
        itemsOrdered.clear();
        totalPrice = 0;
    }
}
