package Practice3;

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

    public void reduceItemQuantity(int quantity) {
        if (quantity <= 0 || quantity > itemQuantity) {
            throw new IllegalArgumentException("Invalid quantity. Current availability: " + getItemQuantity());
        }
        itemQuantity -= quantity;
    }

    @Override
    public String toString() {
        return itemName + " - Price: $" + itemPrice + ", Remaining Quantity: " + itemQuantity;
    }
}
