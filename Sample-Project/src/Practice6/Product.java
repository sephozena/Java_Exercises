package Practice6;

import java.util.InputMismatchException;

public class Product {
	private String productName;
	private double productPrice;
	private int productQuantity;

	public Product(String productName, double productPrice, int productQuantity) {
		this.productName = productName;
		this.productQuantity = productQuantity;
		this.productPrice = productPrice;
	}
		
	public String getProductName() {
		return productName;
	}
	
	public double getProductPrice() {
		return productPrice;
	}

	public int getProductQuantity() {
		return productQuantity;
	}
	
	public String getProductType() {
		return "Generic";
	}
	
	
	public void decreaseProductQuantity(int quantity) {
		try {
			if(quantity <= 0 || quantity > productQuantity) {
				System.out.println("Invalid amount. the availability of " +productName+ " is " +productQuantity);
			}
			productQuantity -= quantity;
			System.out.println("product added!");
		} catch (InputMismatchException e) {
			System.out.println("Enter a valid amount!");
		}
	}
	
	public void increaseProductQuantity(int quantity) {
	    if (quantity > 0) {
	        productQuantity += quantity;
	    }
	}

	@Override
	public String toString() {
		return  "\n**"+getProductName()  + "\nPrice: $" + productPrice +"," +" - Availability: " + productQuantity;
	}

}
