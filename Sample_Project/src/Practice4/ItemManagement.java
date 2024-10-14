package Practice4;

import java.util.ArrayList;
import java.util.List;

// Manages the list of items (both electronic and grocery)
public class ItemManagement {
    private List<Item> itemList = new ArrayList<>();

    public ItemManagement() {
        // Adding some electronic and grocery items to the inventory
        itemList.add(new ElectronicItem("Laptop", 1000, 5, 24)); // 24 months warranty
        itemList.add(new ElectronicItem("Smartphone", 700, 10, 12)); // 12 months warranty
        itemList.add(new GroceryItem("Milk", 2.5, 50, "2024-12-01"));
        itemList.add(new GroceryItem("Bread", 1.5, 100, "2024-10-15"));
    }

    // Display all products in the inventory
    public void displayProducts() {
        System.out.println("\nAvailable Products:");
        for (Item item : itemList) {
            System.out.println(item);
        }
    }
    // Display in-stock products
	public void instockProduct() {
		System.out.println("\nIn-stock products are:");
		for(Item item : itemList) {
			if(item.getItemQuantity() > 0) {
				System.out.println(item.getItemName());
			}
		}
	}
    // Get an item by its name
    public Item getItemByName(String itemName) {
        for (Item item : itemList) {
            if (item.getItemName().equalsIgnoreCase(itemName)) {
                return item;
            }
        }
        return null;
    }
}
