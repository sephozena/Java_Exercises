package Test;

import java.util.HashMap;

public class Inventory {
    private HashMap<String, Item> itemList;

    public Inventory() {
        itemList = new HashMap<>();
        initializeItems();
    }

    // Initialize hardcoded items in inventory
    private void initializeItems() {
        itemList.put("Apple", new Item("Apple", 1.00, 10));
        itemList.put("Banana", new Item("Banana", 0.50, 20));
        itemList.put("Orange", new Item("Orange", 0.75, 15));
        itemList.put("Grapes", new Item("Grapes", 2.00, 5));
    }

    public Item getItem(String itemName) {
        return itemList.get(itemName);
    }

    public void displayItems() {
        System.out.println("Available items:");
        for (Item item : itemList.values()) {
            System.out.println(item.getName() + " - $" + item.getPrice() + " (Stock: " + item.getQuantity() + ")");
        }
    }
}
