package Test4;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Product> products = new ArrayList<>();
    private double totalPrice;

    public void addProduct(Product product, int quantity) {
        product.reduceQuantity(quantity);
        products.add(product);
        totalPrice += product.getProductPrice() * quantity;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void displayOrderDetails() {
        System.out.println("Order Details:");
        for (Product product : products) {
            System.out.println(product);
        }
        System.out.println("Total Price: $" + totalPrice);
    }
}