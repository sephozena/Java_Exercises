package SumOfEvenArrayNumbers;

public class Main {

	public static void main(String[] args) {
		
		EvenArrayNumbers en = new EvenArrayNumbers();
		int[] arrayNums = {2,4,6,12,33,3,27};
		
		int sumOfEven = en.getSumOfEvenArrayNumbers(arrayNums);
		System.out.println(sumOfEven);
	}

}
