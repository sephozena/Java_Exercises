package Inventory;

public class InventoryManagement {
    private InventoryItem[] items;

    public InventoryManagement(InventoryItem[] items) {
        this.items = items;
    }
    
    public boolean itemExists(String itemName) {
        for (InventoryItem item : items) {
            if (item.getName().equalsIgnoreCase(itemName)) {
                return true;
            }
        }
        return false;
    }
    
    public void addStock(String itemName, int quantity) {
        for (InventoryItem item : items) {
            if (item.getName().equalsIgnoreCase(itemName)) {
                item.addStock(quantity);
                return;
            }
        }
        throw new IllegalArgumentException("Item not found: " + itemName);
    }

    public void removeStock(String itemName, int quantity) {
        for (InventoryItem item : items) {
            if (item.getName().equalsIgnoreCase(itemName)) {
                item.removeStock(quantity);
                return;
            }
        }
        throw new IllegalArgumentException("Item not found: " + itemName);
    }

    public void displayInventory() {
        System.out.println("\nCurrent Inventory:");
        for (InventoryItem item : items) {
            System.out.println(item.getName() + ": " + item.getQuantity() + " units available");
        }
    }
}