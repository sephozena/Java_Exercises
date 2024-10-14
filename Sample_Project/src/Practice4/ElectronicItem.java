package Practice4;


// Represents an electronic item, extending the base Item class.
public class ElectronicItem extends Item {
    private int warrantyMonths; // Additional attribute specific to electronic items

    public ElectronicItem(String itemName, double itemPrice, int itemQuantity, int warrantyMonths) {
        super(itemName, itemPrice, itemQuantity);
        this.warrantyMonths = warrantyMonths;
    }

    public int getWarrantyMonths() {
        return warrantyMonths;
    }

    // Override to include warranty information
    @Override
    public String toString() {
        return super.toString() + ", Warranty: " + warrantyMonths + " months";
    }
}
