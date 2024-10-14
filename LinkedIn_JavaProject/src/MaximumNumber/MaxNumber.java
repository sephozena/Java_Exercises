package MaximumNumber;

import java.util.ArrayList;
import java.util.List;

public class MaxNumber {
	
	public void getMaxNumber() {
		int[] listOfNumbers = {3,14,25,10,26,52,53};
		
		
		
		int max = 0;
        List<Integer> evenNumbers = new ArrayList<>();
        
		for (int x : listOfNumbers) {
			System.out.print(x);
			System.out.print(", ");
			if (x > max) max = x;
			if (x % 2 == 0) {
				evenNumbers.add(x);
			}
		}
		System.out.println("\nmax number is " + max);
		System.out.println("even numbers are: " + evenNumbers);
	}
}
