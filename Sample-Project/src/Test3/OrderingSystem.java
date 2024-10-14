package Test3;

public class OrderingSystem {
	
	public static void main(String[] args) {
		
		Product product1 = new Product("Laptop", 23.00, 12);
		Product product2 = new Product("Samsung s24", 10.00, 15);
		Product product3 = new Product("Iphone 16", 12.00, 10);
		
		
		Customer customer = new Customer("Seph");
		
		customer.addProductToOrder(product1, 2);
		customer.addProductToOrder(product2, 12);
		customer.addProductToOrder(product3, 10);
		customer.addProductToOrder(product3, 2);
		
		customer.checkout();
	}

}
