package Inventory;

public class InventoryItem {
    private String name;
    private int quantity;
    private double price;

    public InventoryItem(String name, double price, int quantity) {
        if (quantity < 0) {
            throw new IllegalArgumentException("Quantity cannot be negative.");
        }
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void addStock(int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Stock to add must be positive.");
        }
        quantity += amount;
        System.out.println(amount + " units added to " + name + ". New quantity: " + quantity);
    }

    public void removeStock(int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Stock to remove must be positive.");
        }
        if (amount > quantity) {
            throw new IllegalStateException("Insufficient stock. Current stock: " + quantity);
            
        }
        quantity -= amount;
        System.out.println(amount + " units removed from " + name + ". New quantity: " + quantity);
    }
}