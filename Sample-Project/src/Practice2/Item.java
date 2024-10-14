package Practice2;

import java.util.InputMismatchException;

public class Item {
	private String itemName;
	private double itemPrice;
	private int itemQuantity;
	
	public Item(String itemName, double itemPrice, int itemQuantity) {
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.itemQuantity = itemQuantity;
	}

	public String getItemName() {
		return itemName;
	}

	public double getItemPrice() {
		return itemPrice;
	}

	public int getItemQuantity() {
		return itemQuantity;
	}
	
	public void reduceItemQuantity(int quantity) {
		try {
			if(quantity <= 0 || quantity > itemQuantity) {
	            throw new IllegalArgumentException("Invalid quantity. Current availability: " + getItemQuantity());
			}
			itemQuantity -= quantity;
			System.out.println("Order created!");
		} catch(InputMismatchException e) {
			System.out.println("enter a valid quantity");
		}
	}

	@Override
	public String toString() {
		return itemName + " - Price: $" + itemPrice + ", itemQuantity=" + itemQuantity;
	}
}
