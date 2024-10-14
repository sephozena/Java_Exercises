package OrderProcessing;

public class OrderSystem {
    private Product[] products;

    public OrderSystem(Product[] products) {
        this.products = products;
    }

    public void processOrder(String productName, int quantity) {
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(productName)) {
                product.deductStock(quantity);
                System.out.println("Order processed for " + productName + ". Remaining stock: " + product.getStock());
                return;
            }
        }
        throw new IllegalArgumentException("Product not found: " + productName);
    }

    public void restockProduct(String productName, int quantity) {
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(productName)) {
                product.addStock(quantity);
                System.out.println("Restocked " + productName + ". New stock: " + product.getStock());
                return;
            }
        }
        throw new IllegalArgumentException("Product not found: " + productName);
    }
}