package Practice2;

import java.util.ArrayList;
import java.util.List;

public class Order {

	private List<Item> itemlist;
	private double totalPrice;

	public Order() {
		itemlist = new ArrayList<>();
		totalPrice = 0;
	}

	public List<Item> getItemlist() {
		return itemlist;
	}

	public double getTotalPrice() {
		return totalPrice;
	}
/*
	public void clearOrder() {
		itemlist.clear();
		totalPrice = 0;
	}
*/	
	public void addToOrderHistory(Item item, int quantity) {
		itemlist.add(item);
		totalPrice += item.getItemPrice() * quantity;
	}

	public void addItem(Item item, int quantity) {
		itemlist.add(item);
		totalPrice += item.getItemPrice() * quantity;
	}

}
