package Test3;

public class Product {
	
	private String name;
	private double price;
	private int stockQuantity;
	
	public Product(String name, double price, int stockQuantity) {
		
		this.name = name;
		this.price = price;
		this.stockQuantity = stockQuantity;
		
	}
	
	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public int getStockQuantity() {
		return stockQuantity;
	}
	
	public boolean reduceStock(int quantity) {
		if (quantity > stockQuantity) {
			return false;
		}
		stockQuantity -= quantity;
		return true;
	}
	
	
	@Override
	public String toString() {
		return name + " - $" + price + " (Available: " + stockQuantity + ")";
	}
}
