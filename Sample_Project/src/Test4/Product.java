package Test4;

public class Product {
    protected String productName;
    protected double productPrice;
    protected int productQuantity;

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

    public void reduceQuantity(int amount) {
        this.productQuantity -= amount;
    }

    @Override
    public String toString() {
        return productName + " - Price: $" + productPrice + ", Quantity: " + productQuantity;
    }
}