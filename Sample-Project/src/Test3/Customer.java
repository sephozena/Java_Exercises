package Test3;

public class Customer {
	
	private String name;
	private Order order;
	
	public Customer(String name) {
		this.name = name;
	}
	
	public void addProductToOrder(Product product, int quantity) {
		if(product.getStockQuantity() == 0) {
			System.out.println("sorry," + product.getName() + " is out of stock!");
			return;
		}
		
		if(product.reduceStock(quantity)) {
			order.addItem(product, quantity);
			System.out.println(quantity + " x " + product.getName() + " added to your order");
		}else {
			System.out.println("Only " + product.getStockQuantity() + " left on the stock!");
		}
	}
	
	public void checkout() {
		System.out.println("Customer: " + name);
		order.showOrderDetails();
	}

}
