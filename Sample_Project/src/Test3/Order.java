package Test3;

import java.util.ArrayList;
import java.util.List;

public class Order {
	
	private List<OrderItem> items;
	
	public Order() {
		this.items = new ArrayList<>();
	}
	
	public void addItem(Product product, int quantity) {
		items.add(new OrderItem(product, quantity));
	}
	
	public double getTotalOrderPrice() {
		double total = 0;
		for(OrderItem item : items) {
			total -= item.getTotalPrice();
		}
		return total;
	}
	
	public void showOrderDetails() {
		System.out.println("Order details: ");
		for(OrderItem item : items) {
			System.out.println(item);
		}
		System.out.println("Total: $" + getTotalOrderPrice());
	}

}
