package Practice5;

// Base class for general items
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

    // Method to reduce item quantity when an order is placed
    public void reduceItemQuantity(int quantity) {
        if (quantity <= 0 || quantity > itemQuantity) {
            throw new IllegalArgumentException("Invalid quantity. Current availability: " + itemQuantity);
        }
        itemQuantity -= quantity;
    }

    @Override
    public String toString() {
        return itemName + " - Price: $" + itemPrice + ", Quantity Available: " + itemQuantity;
    }
}

// Subclass for electronic items
class ElectronicItem extends Item {
    private String brand;
    private String warranty;

    public ElectronicItem(String itemName, double itemPrice, int itemQuantity, String brand, String warranty) {
        super(itemName, itemPrice, itemQuantity);
        this.brand = brand;
        this.warranty = warranty;
    }

    public String getBrand() {
        return brand;
    }

    public String getWarranty() {
        return warranty;
    }

    @Override
    public String toString() {
        return super.toString() + ", Brand: " + brand + ", Warranty: " + warranty;
    }
}
