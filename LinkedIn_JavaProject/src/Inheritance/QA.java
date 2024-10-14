package Inheritance;

public class QA extends Employee{

	public QA (String name, int empID, double salary){
		super(name, empID, salary);
	}
	
	public double getAnnualBonus() {
		return super.salary * 05;
	}

	@Override
	public String toString() {
		return "\nQA Name: " + getName() + "\nQA EmployeeID: " + getEmpID()+ "\nQA Salary: "+ getSalary() +"\nQA Annual Bonus: "+ getAnnualBonus() + "\nLocation: " + getLocation();
	}

	
}
