package Practice6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		ProductFood food1 = new ProductFood("Apple", 3, "Fruit", "03-10-24");
//		System.out.println(food1);
		
		
		Scanner scanner = new Scanner(System.in);
		ProductManagement productManagement = new ProductManagement();
		OrderManagement orderManagement = new OrderManagement(productManagement);
		

//		System.out.println("Enter your name: ");
//		String customerName = scanner.nextLine();
//		System.out.println("Enter your initial balance: ");
//		double customerBalance = scanner.nextDouble();
//		scanner.nextLine();
//		Customer customer = new Customer(customerName, customerBalance);
		
		while(true) {
			displayMenu();
			int userInput = getUserInput(scanner);
			switch(userInput){
				case 1:
					System.out.println("test1 - view products");
//					productManagement.displayDistinctProductType();

//					System.out.println("Enter product to search:");
//					String productTypeScanner = scanner.nextLine();
//					productManagement.displayAllProduct(productTypeScanner);
					productManagement.displayAllProduct();
					break;

				case 2:
					System.out.println("test2 - create order");
					productManagement.displayInstockProduct();	
					orderManagement.createOrder(scanner);
					break;
				case 3:
					System.out.println("test3 - view order");
//					System.out.println("Enter product to search:");
//					String productScanner = scanner.nextLine();
//					System.out.println(productScanner);
//					productManagement.getProductByName(productScanner);
					orderManagement.viewOrder();
					break;
				case 4:
					System.out.println("test4 - Place Order");
//					orderManagement.placeOrder(customer);
					
					break;
				case 5:
					System.out.println("test5 - cancel order");
					orderManagement.cancelOrder();
					break;
				case 99:
					System.out.println("##Program terminated!##");
					scanner.close();
					return;
				default:
					System.out.println("‼Invalid user input. Please try again‼");
					break;
			}
		}
	} 
	
	public static void displayMenu() {
		System.out.println("\n******** Secret Shop *********");
		System.out.println("\t1. View Products");
		System.out.println("\t2. Create order");
		System.out.println("\t3. View order");
		System.out.println("\t4. Place order");
		System.out.println("\t5. Cancel order");
		System.out.println("\t6. Terminate program");
		System.out.print("Choose option:");
	}
	
	public static int getUserInput(Scanner scanner) {
		int userInput = 0;
		while(true) {
			try {
				userInput = scanner.nextInt();
				scanner.nextLine();
				break;
			} catch (InputMismatchException e) {
				System.out.println("Please input valid number:");
				displayMenu();
				scanner.nextLine();
			}
		}
		return userInput;
	}
}
