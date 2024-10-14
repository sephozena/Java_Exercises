package Test6;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Product> products;
    private double totalPrice;

    public Order() {
        products = new ArrayList<>();
        totalPrice = 0;
    }

    public void addProduct(Product product, int quantity) {
        products.add(product);
        totalPrice += product.getProductPrice() * quantity;
    }

    public List<Product> getProducts() {
        return products;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void clearOrder() {
        products.clear();
        totalPrice = 0;
    }
}
