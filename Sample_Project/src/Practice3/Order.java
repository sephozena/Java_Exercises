package Practice3;

import java.util.HashMap;
import java.util.Map;

public class Order {
    private Map<Item, Integer> itemsOrdered; // Item and quantity
    private double totalPrice;

    public Order() {
        itemsOrdered = new HashMap<>();
        totalPrice = 0;
    }

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

    public void clearOrder() {
        itemsOrdered.clear();
        totalPrice = 0;
    }
}
