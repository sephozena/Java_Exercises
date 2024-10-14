package Practice2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OrderManagement {
	private ItemManagement itemManagement;
	private Order getLastOrder;
	
	
	public OrderManagement(ItemManagement itemManagement) {
		this.itemManagement = itemManagement;
		this.getLastOrder = null;
	}

	public void createOrder(Scanner scanner) {
		Order myOrder = new Order();
		boolean successfulOrder = false;
		while (true) {
			System.out.println("Enter the item name (or type 'done' to back on menu): ");
			String itemName = scanner.nextLine();

			// back to menu using 'done' keyword
			if (itemName.equalsIgnoreCase("done")) {
				break;
			}

			/**
			 * validate edge cases: 
			 * item not found
			 * item out of stock 
			 * back to menu
			 */
			Item item = itemManagement.getItemByName(itemName);
			if (item == null) {
				System.out.println(itemName + " not found on the list. Try again!");
				itemManagement.instockProduct();
				continue;
			}
			if (item.getItemQuantity() == 0) {
				System.out.println("Out of stock for item " + itemName);
				itemManagement.instockProduct();
				continue;
			}

			int quantity = 0;
			while (true) {
				System.out.println("Enter quantity: ");
				try {
					quantity = scanner.nextInt();
					scanner.nextLine();

					if (quantity <= 0 || quantity > item.getItemQuantity()) {
						System.out.println("Invalid quantity!");
						System.out.println(item);
					} else {
						break;
					}

				} catch (IllegalArgumentException | InputMismatchException e) {
					System.out.println("invalid input! " + item);
					scanner.nextLine();
				}
			}

			item.reduceItemQuantity(quantity);
			myOrder.addToOrderHistory(item, quantity);
			successfulOrder = true;
		}
		//outside of while-loop
		if (successfulOrder) {
			getLastOrder = myOrder;
			System.out.println("Order created successfully!");
		} else {
			System.out.println("No items were added.");
		}
	}

	public void getPreviousOrder(Order order) {
		for (Item item : order.getItemlist()) {
			System.out.print(item.getItemName() +"\n");
		}
		System.out.print("Total Price: $" + order.getTotalPrice());

	}

	public void displayOrderHistory() {

		if (getLastOrder != null) {
			System.out.println("\nYour order history:");
			getPreviousOrder(getLastOrder);
		} else {
			System.out.println("\nNo orders yet!");
		}
	}

}
