package Practice6;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class OrderManagement {
	private ProductManagement productManagement;
	private List<Order> orderHistory;
	
	public OrderManagement(ProductManagement productManagement) {
		this.productManagement = productManagement;
		this.orderHistory = new ArrayList<>();
	}
	
	public void createOrder(Scanner scanner) {
		Order newOrder = new Order();
		boolean successfulOrder = false;
		
		while(true) {
			System.out.println("Enter your order (or type done to finish)");
			String productName = scanner.nextLine();
			
			// back to menu using 'done' keyword
			if(productName.equalsIgnoreCase("done")) {
				break;
			}
			
			Product product = productManagement.getProductByName(productName);
			if(product == null) {
				System.out.println("You are trying to order '"+productName.toUpperCase()+"' which is not in the list.\nTry again!");
				productManagement.displayInstockProduct();
				continue;
			}
			
			if(product.getProductQuantity() == 0) {
				System.out.println("'"+product.getProductName()+"' is currently out of stock!");
				productManagement.displayInstockProduct();
				continue;
			}
			
			int quantity = 0;
			while(true) {
				System.out.println("Enter quantity for " + "'" +productName+ "'");
				try {
					quantity = scanner.nextInt();
					scanner.nextLine();
					if(quantity <= 0 || quantity > product.getProductQuantity()) {
						System.out.println("\nYou entered invalid amount for '"+product.getProductName()+ "'");
						System.out.println("Current availability: " + product.getProductQuantity() +"\n");
					}else {
						break;
					}
							
				} catch(InputMismatchException e) {
					System.out.println("Invalid input!");
					e.printStackTrace();
					scanner.nextLine();
				}
			}
			product.decreaseProductQuantity(quantity);
			newOrder.addToOrders(product, quantity);
			successfulOrder = true;
		}
		if(successfulOrder) {
			orderHistory.add(newOrder);
			System.out.println("Order created successfully!");
		}else {
			System.out.println("No order was created!");
		}
	}
	
	public void viewOrder() {
		if(orderHistory.isEmpty()) {
			System.out.println("no order has been placed yet!");
		}else {
			System.out.println("\n~~~~Order History~~~~\n");
			double grandTotal = 0;
			for(int i = 0; i< orderHistory.size(); i++) {
				Order order = orderHistory.get(i);
				System.out.println("Order " + (i+1) + ":");
				
				List<Product> product = order.getOrderedProductList();
				List<Integer> quantity = order.getOrderedQuantityList();
				
				for (int j = 0; j < product.size(); j++) {
					System.out.println("- " +product.get(j).getProductName() + " | " + quantity.get(j));
				}
				System.out.println("Total Price: $"+order.getTotalPrice() +"\n");	
				grandTotal += order.getTotalPrice();
			}
			System.out.println("\nTotal amount to pay: $" + grandTotal);
		}			
	}
	
	public void placeOrder(Customer customer) {
		if(orderHistory.isEmpty()) {
			System.out.println(" No order/s to place");
			return;
		}
		
		Order lastOrder = orderHistory.get(orderHistory.size()-1);
		double orderTotal = lastOrder.getTotalPrice();
		
		if(customer.getCustomerBalance() >= orderTotal) {
			customer.deductCustomerBalance(orderTotal);
			System.out.println("Order placed successfully!");
			lastOrder.clearOrders();
		}else {
			System.out.println("Insufficient balance to place an order!");
		}
	}
	
	public void cancelOrder() {
		if(orderHistory.isEmpty()){
			System.out.println(" No order/s to cancel");
			return;
		}
		Order lastOrder = orderHistory.get(orderHistory.size()-1);
		
		List<Product> orderedProducts = lastOrder.getOrderedProductList();
		List<Integer> orderedQuantities = lastOrder.getOrderedQuantityList();
		
		// restore each product's quantity
		for(int i = 0; i < orderedProducts.size(); i++) {
			Product product = orderedProducts.get(i);
			int quantityToRestore = orderedQuantities.get(i);
			
			product.increaseProductQuantity(quantityToRestore);
			System.out.println("Restored " + quantityToRestore + " of " +product.getProductName());
		}
		
		//remove the canceled order from order history
		orderHistory.remove(orderHistory.size() -1);
		System.out.println("Last order has been canceled");
	}
}
