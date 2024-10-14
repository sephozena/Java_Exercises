package Test6;

public class Product {
    private String productName;
    private double productPrice;
    private int productQuantity;

    public Product(String productName, double productPrice, int productQuantity) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productQuantity = productQuantity;
    }

    public String getProductName() {
        return productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void reduceQuantity(int quantity) {
        if (quantity <= productQuantity) {
            productQuantity -= quantity;
        } else {
            throw new IllegalArgumentException("Insufficient stock for " + productName);
        }
    }

    @Override
    public String toString() {
        return productName + " - Price: $" + productPrice + ", Quantity: " + productQuantity;
    }
}
