package OrderProcessing;

public class Product {
    private String name;
    private int stock;

    public Product(String name, int stock) {
        if (stock < 0) {
            throw new IllegalArgumentException("Stock cannot be negative.");
        }
        this.name = name;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public int getStock() {
        return stock;
    }

    public void addStock(int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Stock to add must be positive.");
        }
        stock += amount;
    }

    public void deductStock(int amount) {
        if (amount <= 0 || amount > stock) {
            throw new IllegalArgumentException("Invalid amount to deduct.");
        }
        stock -= amount;
    }
}