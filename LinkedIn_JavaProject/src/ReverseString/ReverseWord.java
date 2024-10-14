package ReverseString;

public class ReverseWord {
	
	public static String stringToReverse(String word) {
		
	    StringBuilder reverseWord = new StringBuilder();
	    
		for (int i = word.length() - 1; i >= 0; i--) {
	        reverseWord.append(word.charAt(i));
	    }
	    return reverseWord.toString();
		
	}
	
	public static void stringToReverse2(String word) {
		StringBuilder reverseWord = new StringBuilder(word).reverse();
		System.out.println("Reversed: " + reverseWord);
	}
}
