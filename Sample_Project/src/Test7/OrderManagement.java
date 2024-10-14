package Test7;

import java.util.Scanner;

public class OrderManagement {
    private Inventory inventory = new Inventory();
    private Order currentOrder = new Order();

    public void createOrder(Scanner scanner) {
        inventory.displayProducts();
        
        System.out.println("Enter the product name to add to your order: ");
        String productName = scanner.nextLine();
        Product product = inventory.getProductByName(productName);
        
        if (product != null) {
            System.out.println("Customization options: " + product.getCustomizationOptions());
            System.out.println("Enter customization options (if any): ");
            String customization = scanner.nextLine();
            product.setCustomizationOptions(customization);
            
            currentOrder.addProduct(product);
            System.out.println("Product added to the order.");
        } else {
            System.out.println("Product not found.");
        }
    }

    public void reviewCurrentOrder() {
        currentOrder.reviewOrder();
    }

    public void removeProductFromOrder(Product product) {
        currentOrder.removeProduct(product);
    }

    public void placeOrder(Customer customer) {
        if (currentOrder.getTotalPrice() > 0) {
            System.out.println("Order placed successfully for customer: " + customer.getUsername());
            System.out.println("Total Amount: $" + currentOrder.getTotalPrice());
            System.out.println("Order will be delivered to: " + customer.getAddress());
            System.out.println("Payment details: " + customer.getPaymentDetails());
            currentOrder.clearOrder();
            System.out.println("Order cleared.");
        } else {
            System.out.println("Your order is empty. Please add products to the order before placing.");
        }
    }
}
