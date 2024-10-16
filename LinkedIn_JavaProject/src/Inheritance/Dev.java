package Inheritance;

public class Dev extends Employee{
	private double commissionPercentage;
	
	
	public Dev (String name, int empID, double salary, double commissionPercentage){
		
		/*
		 * @super is use to access the constructor of Employee (name, age, salary)
		 */
		super(name, empID, salary);
		this.commissionPercentage = commissionPercentage;
	}
	

	public double getCommissionPercentage() {
		return this.commissionPercentage;
	}
	
	public void raiseCommission() {
		if(this.commissionPercentage < 0.30) {
			this.commissionPercentage = this.commissionPercentage * 1.2;
		}
	}


	@Override
	public String toString() {
		return "Dev Name: " + getName() + "\nDev EmployeeID: " + getEmpID() + "\nDev Salary: " + getSalary() + "\nDev Commission: "+ getCommissionPercentage();
	}
	
	
	
}
