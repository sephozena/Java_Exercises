package Test3;

public class OrderItem {
	
	private Product product;
	private int quantity;
	
	public OrderItem (Product product, int quantity) {
		this.product = product;
		this.quantity = quantity;
	}
	
	public double getTotalPrice() {
		return product.getPrice() * quantity;
	}
	
	@Override
	public String toString() {
		return product.getName() + " (X" + quantity + ") -$" + getTotalPrice(); 
	}

}
