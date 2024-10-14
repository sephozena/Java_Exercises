package BankingSystem;

public class Account {
    protected String accountNumber;
    protected double balance;

    public Account(String accountNumber, double balance) {
        if (balance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative.");
        }
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive.");
        }
        balance += amount;
        System.out.println("Deposited " + amount + ". New balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive.");
        }
        if (amount > balance) {
            throw new IllegalStateException("Insufficient balance.");
        }
        balance -= amount;
        System.out.println("Withdrew " + amount + ". New balance: " + balance);
    }

    public double getBalance() {
        return balance;
    }
}