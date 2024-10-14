package Test6;

import java.util.ArrayList;
import java.util.List;

public class ProductManager{
	
    private List<Product> products;

    public ProductManager() {
        products = new ArrayList<>();
        products.add(new Product("Laptop", 999.99, 10));
        products.add(new Product("Smartphone", 499.99, 20));
        products.add(new Product("Headphones", 79.99, 30));
        products.add(new Product("Monitor", 199.99, 15));
    }

    public void displayProducts() {
        System.out.println("\nAvailable Products:");
        for (Product product : products) {
            System.out.println(product);
        }
    }

    public Product getProductByName(String productName) {
        for (Product product : products) {
            if (product.getProductName().equalsIgnoreCase(productName)) {
                return product;
            }
        }
        return null; // Product not found
    }
}
