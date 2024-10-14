package Practice2;

import java.util.ArrayList;
import java.util.List;

public class ItemManagement {
	private List<Item> itemlist = new ArrayList<Item>();

	public ItemManagement() {
		itemlist.add(new Item("Apple", 15, 20));
		itemlist.add(new Item("Banana", 12, 20));
		itemlist.add(new Item("Mango", 17, 20));
		itemlist.add(new Item("Guava", 10, 20));
	}
	
	public void displayProduct() {
		System.out.println("\nAvailale Products:");
		for(Item item : itemlist) {
			System.out.println(item);
		}
	}
	
	public void instockProduct() {
		System.out.println("\nIn-stock products are:");
		for(Item item : itemlist) {
			if(item.getItemQuantity() > 0) {
				System.out.println(item.getItemName());
			}
		}
	}
	
	public Item getItemByName(String itemName) {
		for(Item item : itemlist) {
			if(item.getItemName().equalsIgnoreCase(itemName)) {
				return item;
			}
		}
		return null;
	}
	
}
