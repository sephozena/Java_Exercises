package PayrollSystem;

public class Payroll {
    private Employee[] employees;

    public Payroll(Employee[] employees) {
        this.employees = employees;
    }

    public void processPayroll() {
        for (Employee employee : employees) {
            System.out.println("Processing payroll for " + employee.getName() + ": Salary $" + employee.getSalary());
        }
    }

    public void giveRaise(String name, double percentage) {
        for (Employee employee : employees) {
            if (employee.getName().equalsIgnoreCase(name)) {
                employee.raiseSalary(percentage);
                return;
            }
        }
        throw new IllegalArgumentException("Employee not found: " + name);
    }
}
