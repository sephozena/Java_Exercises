package Test2;

public class OrderSystem {
    private Inventory inventory;

    public OrderSystem(Inventory inventory) {
        this.inventory = inventory;
    }

    public void placeOrder(String itemName, int quantity) {
        Item item = inventory.getItem(itemName);

        if (item == null) {
            throw new IllegalArgumentException("Invalid order: " + itemName + " is not available.");
        }

        if (quantity <= 0) {
            throw new IllegalArgumentException("Invalid quantity: Quantity must be greater than 0.");
        }

        try {
            item.reduceQuantity(quantity);
            System.out.println("Successfully ordered " + quantity + " " + item.getName() + "(s) for $" + (item.getPrice() * quantity));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
