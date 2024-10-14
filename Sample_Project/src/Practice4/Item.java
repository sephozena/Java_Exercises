package Practice4;

// The base class representing a generic item.
public class Item {
    private String itemName;
    private double itemPrice;
    private int itemQuantity;

    public Item(String itemName, double itemPrice, int itemQuantity) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemQuantity = itemQuantity;
    }

    public String getItemName() {
        return itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    // Reduce the quantity of the item when ordered
    public void reduceItemQuantity(int quantity) {
        if (quantity <= 0 || quantity > itemQuantity) {
            throw new IllegalArgumentException("Invalid quantity. Current availability: " + itemQuantity);
        }
        itemQuantity -= quantity;
        System.out.println(quantity + " units of " + itemName + " ordered.");
    }

    // Override toString method to display item details
    @Override
    public String toString() {
        return itemName + " - Price: $" + itemPrice + ", Available Quantity: " + itemQuantity;
    }
}
