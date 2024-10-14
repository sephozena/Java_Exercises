package Practice3;

import java.util.ArrayList;
import java.util.List;

public class ItemManagement {
    private List<Item> itemList = new ArrayList<>();

    public ItemManagement() {
        itemList.add(new Item("Apple", 15, 20));
        itemList.add(new Item("Banana", 12, 20));
        itemList.add(new Item("Mango", 17, 20));
        itemList.add(new Item("Guava", 10, 20));
    }

    public void displayProduct() {
        System.out.println("\nAvailable Products:");
        for (Item item : itemList) {
            System.out.println(item);
        }
    }

    public Item getItemByName(String itemName) {
        for (Item item : itemList) {
            if (item.getItemName().equalsIgnoreCase(itemName)) {
                return item;
            }
        }
        return null;
    }
}
