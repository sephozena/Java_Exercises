package Inheritance;

public class Main {

	public static void main(String[] args) {
	    // Create Dev object
        Dev dev = new Dev("Alice", 101, 80000.00, 0.15);
        
        System.out.println(dev + "\n****");
        
        
        System.out.println("Dev Name: " + dev.getName());
        System.out.println("Dev EmpID: " + dev.getEmpID());
        System.out.println("Dev Salary: " + dev.getSalary());
        System.out.println("Dev Commission Percentage: " + dev.getCommissionPercentage());

        // Create QA object
        QA qa1 = new QA("Bob", 102, 75000.00);
        QA qa2 = new QA("Mary", 032, 69000.00);
        
        System.out.println(qa1 + "\n****" + qa2);
        
    }

}
