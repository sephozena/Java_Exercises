package Practice6;

import java.util.ArrayList;
import java.util.List;

public class Order {
	
	private List<Product> orderedProduct;
	private List<Integer> orderedQuantity;
	private double totalPrice;
	
	public Order() {
		orderedProduct = new ArrayList<Product>();
		orderedQuantity= new ArrayList<Integer>();
		totalPrice = 0.0;
	}
	
	// get the list of Ordered Products
	public List<Product> getOrderedProductList() {
		return orderedProduct;
	}
	
	// get the list of Ordered Products' quantity
	public List<Integer> getOrderedQuantityList() {
		return orderedQuantity;
	}
	
	// get the total price of orders
	public double getTotalPrice() {
		return totalPrice;
	}
	
	// add the product and it's quantity to the orders
	public void addToOrders(Product product, int quantity) {
		orderedProduct.add(product);
		orderedQuantity.add(quantity);
		totalPrice += product.getProductPrice() * quantity; 
	}
	
	// clear the Orders list
	public void clearOrders() {
		orderedProduct.clear();
		orderedQuantity.clear();
		totalPrice = 0;
	}

	@Override
	public String toString() {
		return "Order [productOrderList=" + orderedProduct + ", totalPrice=" + totalPrice + "]";
	}
}
