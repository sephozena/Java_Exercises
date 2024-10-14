package PayrollSystem;

import java.util.Scanner;

public class PayrollSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Employee[] employees = {
            new Employee("John", 5000),
            new Employee("Sarah", 6000),
            new Employee("Alice", 4500)
        };

        Payroll payroll = new Payroll(employees);

        while (true) {
            System.out.println("\nPayroll System Menu:");
            System.out.println("1. Process Payroll");
            System.out.println("2. Give Raise to Employee");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (choice == 1) {
                payroll.processPayroll();
            } else if (choice == 2) {
                System.out.print("Enter employee name: ");
                String name = scanner.nextLine();
                System.out.print("Enter raise percentage: ");
                double percentage = scanner.nextDouble();

                try {
                    payroll.giveRaise(name, percentage);
                } catch (IllegalArgumentException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            } else if (choice == 3) {
                System.out.println("Exiting the payroll system.");
                scanner.close();
                return;
            } else {
                System.out.println("Invalid option, please try again.");
            }
        }
    }
}