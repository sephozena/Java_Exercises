package Inheritance;

public class Employee extends Person{


	// we made the access modifier of 'salary' as protected so it is accessible by Employee's subclass (dev/qa class)
	protected double salary; 
	protected int empID;
	
	public Employee (String name, String gender, int age, String location, int empID, double salary) {		
		super(name, gender, age, location);
		
		this.empID = empID;
		this.salary = salary;
	}
	
	public Employee (String name, int empID, double salary) {		
		super(name);
		
		this.empID = empID;
		this.salary = salary;
	}
	
	
	public int getEmpID() {
		return this.empID;
	}
	
	public double getSalary() {
		return this.salary;
	}
	
	public void raiseSalary() {
		this.salary = salary * 1.2;
	}
	


}

