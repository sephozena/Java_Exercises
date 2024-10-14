package Test4;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

public class OrderManager {
    private List<Product> productCatalog = new ArrayList<>();
    private Order currentOrder = new Order();

    public void addProductToCatalog(Product product) {
        productCatalog.add(product);
    }

    public void viewProducts() {
        System.out.println("Available Products:");
        for (Product product : productCatalog) {
            System.out.println(product);
        }
    }

    public boolean createOrder(String productName, int quantity) {
        for (Product product : productCatalog) {
            if (product.getProductName().equalsIgnoreCase(productName)) {
            	try {
                    if (product.getProductQuantity() >= quantity) {
                        currentOrder.addProduct(product, quantity);
                        System.out.println("Added " + quantity + " of " + productName + " to the order.");
                        return true;
                    } else {
                        System.out.println("Insufficient quantity for " + productName + ". Available: " + product.getProductQuantity());
                        return false;
                    }
				} catch (InputMismatchException e) {
					e.getMessage();
					// TODO: handle exception
				} catch (IllegalArgumentException e) {
					e.getMessage();
				}
            }
        }
        System.out.println("Product " + productName + " not found.");
        return false;
    }

    public void viewOrder() {
        currentOrder.displayOrderDetails();
    }
}