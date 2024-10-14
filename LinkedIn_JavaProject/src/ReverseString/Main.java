package ReverseString;

public class Main {

	public static void main(String[] args) {
		
		/**
		 * this block execute code from class @Reverseword
		 */
		String reversed = ReverseWord.stringToReverse("test");
		System.out.println(reversed);
	
	
		/*
		 * this block is another way of execution - on main class
		 */
	    String original = "Hello, World!";
	    StringBuilder reversedString = new StringBuilder(original).reverse();
	    System.out.println("Original: " + original);
	    System.out.println("Reversed: " + reversedString);
		
	    
	    ReverseWord.stringToReverse2(original);
	
	
	}

}