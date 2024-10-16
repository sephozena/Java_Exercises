package SumOfEvenArrayNumbers;

public class EvenArrayNumbers {

	public Integer getSumOfEvenArrayNumbers(int[] arrayNumber) {
		
		int[] arrayNumbers = { 2, 23, 11, 8, 16, 32, 29, 4 };
		int container = 0;
		
		/**
		 * I used for-each loop to iterate the declared arraynumber from this class which is 
		 * @param arrayNumbers
		 */
		for (int x : arrayNumbers) {
			if (x % 2 == 0) {
				container += x;
				System.err.println(x + " is even number");
			}
		}
		
		
		/**
		 * I used for loop  on the arraynumber using the parameter 
		 * which is passed from main class
		 * @param arrayNumber
		 */
		for(int i=0; i<arrayNumber.length; i++){
			if(arrayNumber[i] % 2 == 0) {
				container += arrayNumber[i];
				System.out.println(arrayNumber[i] + " is even number");
			}
		}
		System.out.println("combined even numbers from EvenArrayNumbers class and Main method is:");
		return container;
	}
}
