package SwapOfTwoNumbers;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 7;
		int b = 3;
		System.out.println("a: "+a +"\n"+"b: "+ b);

		a = a+b;
		b = a-b;
		a = a-b;
		System.err.println("*****");
		System.out.println("a: "+a +"\n"+"b: "+ b);

	}

}
