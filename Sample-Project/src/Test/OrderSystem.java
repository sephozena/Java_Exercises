package Test;

public class OrderSystem {
    private Inventory inventory;

    public OrderSystem(Inventory inventory) {
        this.inventory = inventory;
    }

    public void placeOrder(String itemName, int quantity) {
        Item item = inventory.getItem(itemName);
        if (item == null) {
            System.out.println("Item not found.");
            return;
        }

        try {
            item.reduceStock(quantity);
            System.out.println("Successfully ordered " + quantity + " " + item.getName() + "(s) for $" + (item.getPrice() * quantity));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
