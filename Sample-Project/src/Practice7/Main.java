package Practice7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		
		while(true) {
			displayMenu();
			int userInput = getUserInput(scanner);

			switch(userInput) {
			case 1: {
				System.out.println("1.");
				break;
			}
			case 2: {
				System.out.println("1.");
				break;
			}
			case 3: {
				System.out.println("1.");
				break;
			}
			case 4: {
				System.out.println("1.");
				scanner.close();
				break;
			}
			default :{
				System.out.println("1.");
				return;
			}
			
			}
		}
	}
	
	public static void displayMenu() {
		System.out.println("Menu");
		System.out.println("1. view products");
		System.out.println("2. create order");
		System.out.println("3. view order");
		System.out.println("4. terminate program");
		System.out.println("Choose option:");
	}
	
	public static int getUserInput(Scanner scanner) {
		int userInput = 0;
		while(true) {
			try {	
				userInput = scanner.nextInt();
				scanner.nextLine();
				break;
			}catch (InputMismatchException e) {
				System.out.println("invalid input");
				scanner.nextLine();
			}
		}
		return userInput;
	}
}
