package PayrollSystem;

public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        if (salary < 0) {
            throw new IllegalArgumentException("Salary cannot be negative.");
        }
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double percentage) {
        if (percentage <= 0) {
            throw new IllegalArgumentException("Raise percentage must be positive.");
        }
        salary += salary * (percentage / 100);
        System.out.println(name + "'s salary raised by " + percentage + "%. New salary: $" + salary);
    }
}