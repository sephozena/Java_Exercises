package Exercise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int userInput = getUserInput(scanner);
		while(true) {
			displayMenu();
			switch(userInput) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			default:
				System.out.println("test");
			}
		}
	}
	
	public static void displayMenu() {
		System.out.println("Menu:\n");
		System.out.println("1. test");
		System.out.println("2. test");
		System.out.println("3. test");
		System.out.println("4. test");
		System.out.println("Choose option:");
	}
	
	public static int getUserInput(Scanner scanner) {
		int userInput = 0;
		
		while(true) {
			try {
				userInput = scanner.nextInt();
				scanner.nextLine();
				break;
			}catch(InputMismatchException e) {
				System.out.println("Invalid input");
				displayMenu();
				scanner.nextLine();
			}
			
		}
		return userInput;
	}
}
