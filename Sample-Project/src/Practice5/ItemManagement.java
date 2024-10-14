package Practice5;

import java.util.ArrayList;
import java.util.List;

// Class to manage the inventory of items
public class ItemManagement {
    private List<Item> itemList = new ArrayList<>();

    // Adding both general items and electronics for practice
    public ItemManagement() {
        itemList.add(new Item("Apple", 1.5, 100));
        itemList.add(new ElectronicItem("Laptop", 1000, 50, "Dell", "2 Years"));
        itemList.add(new ElectronicItem("Phone", 800, 30, "Samsung", "1 Year"));
    }

    // Display available products
    public void displayProduct() {
        System.out.println("\nAvailable Products:");
        for (Item item : itemList) {
            System.out.println(item);
        }
    }

	public void instockProduct() {
		System.out.println("\nIn-stock products are:");
		for(Item item : itemList) {
			if(item.getItemQuantity() > 0) {
				System.out.println(item.getItemName());
			}
		}
	}
    // Get an item by name
    public Item getItemByName(String itemName) {
        for (Item item : itemList) {
            if (item.getItemName().equalsIgnoreCase(itemName)) {
                return item;
            }
        }
        return null;
    }
}
