package BankingSystem;

import java.util.Scanner;

public class BankingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Account savings = new SavingsAccount("SA123", 5000);
        Account checking = new CheckingAccount("CA456", 2000);
        
        while (true) {
            System.out.println("\nBanking Menu:");
            System.out.println("1. Deposit to Savings Account");
            System.out.println("2. Withdraw from Savings Account");
            System.out.println("3. Deposit to Checking Account");
            System.out.println("4. Withdraw from Checking Account");
            System.out.println("5. View Account Balances");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            System.out.print("Enter amount: ");
            double amount = scanner.nextDouble();
            
            switch (choice) {
                case 1:
                    try {
                        savings.deposit(amount);
                    } catch (IllegalArgumentException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 2:
                    try {
                        savings.withdraw(amount);
                    } catch (IllegalArgumentException | IllegalStateException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 3:
                    try {
                        checking.deposit(amount);
                    } catch (IllegalArgumentException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 4:
                    try {
                        checking.withdraw(amount);
                    } catch (IllegalArgumentException | IllegalStateException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 5:
                    System.out.println("Savings Account Balance: " + savings.getBalance());
                    System.out.println("Checking Account Balance: " + checking.getBalance());
                    break;

                case 6:
                    System.out.println("Exiting the banking system.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option, please try again.");
            }
        }
    }
}