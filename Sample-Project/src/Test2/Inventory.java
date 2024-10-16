package Test2;

import java.util.HashMap;

public class Inventory {
    private HashMap<String, Item> items;

    public Inventory() {
        items = new HashMap<>();
        loadItems();
    }

    // Load hardcoded items
    private void loadItems() {
        items.put("Apple", new Item("Apple", 1.00, 10));
        items.put("Banana", new Item("Banana", 0.50, 20));
        items.put("Orange", new Item("Orange", 0.75, 15));
        items.put("Grapes", new Item("Grapes", 2.00, 5));
        items.put("milon", new Item("Melon", 3.00, 12));
    }

    public Item getItem(String name) {
        return items.get(name);
    }

    public void displayItems() {
        System.out.println("Available Items:");
        for (Item item : items.values()) {
            item.displayItem();
        }
    }
}
