package Practice4;

// Represents a grocery item, extending the base Item class.
public class GroceryItem extends Item {
    private String expirationDate; // Additional attribute specific to grocery items

    public GroceryItem(String itemName, double itemPrice, int itemQuantity, String expirationDate) {
        super(itemName, itemPrice, itemQuantity);
        this.expirationDate = expirationDate;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    // Override to include expiration date information
    @Override
    public String toString() {
        return super.toString() + ", Expiration Date: " + expirationDate;
    }
}
