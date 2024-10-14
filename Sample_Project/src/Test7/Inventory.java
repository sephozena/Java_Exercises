package Test7;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<Product> productList = new ArrayList<>();

    public Inventory() {
        // Sample products
        productList.add(new Product("Laptop", 1000, "Color: Black"));
        productList.add(new Product("Phone", 700, "Storage: 128GB"));
    }

    public void displayProducts() {
        System.out.println("Available Products:");
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    public Product getProductByName(String name) {
        for (Product product : productList) {
            if (product.getName().equalsIgnoreCase(name)) {
                return product;
            }
        }
        return null;
    }
}
