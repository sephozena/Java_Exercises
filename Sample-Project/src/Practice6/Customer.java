package Practice6;

public class Customer {
	
	private String customerName;
	private double customerBalance;
	
	public Customer(String customerName, double customerBalance){
		this.customerName = customerName;
		this.customerBalance = customerBalance;
	}

	public String getCustomerName() {
		return customerName;
	}

	public double getCustomerBalance() {
		return customerBalance;
	}
	
	public void deductCustomerBalance(double amount) {
		if (amount <= customerBalance) {
			customerBalance -= amount;
			System.out.println("Your new balance is: $" + customerBalance);
		}else {
			System.out.println("Insufficient balance!");
		}
	}
}
