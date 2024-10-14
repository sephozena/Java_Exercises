package Test7;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Product> productList = new ArrayList<>();
    private double totalPrice = 0;

    public void addProduct(Product product) {
        productList.add(product);
        totalPrice += product.getPrice();
    }

    public void removeProduct(Product product) {
        productList.remove(product);
        totalPrice -= product.getPrice();
    }

    public void clearOrder() {
        productList.clear();
        totalPrice = 0;
    }

    public void reviewOrder() {
        System.out.println("Your current order:");
        for (Product product : productList) {
            System.out.println(product);
        }
        System.out.println("Total Price: $" + totalPrice);
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}
