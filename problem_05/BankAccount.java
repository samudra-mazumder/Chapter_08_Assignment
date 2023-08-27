package problem_05;

public class BankAccount {
    private final String accountNumber;
    private final String accountHolder;
    private final double balance;

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public BankAccount deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be positive");
        }
        return new BankAccount(accountNumber, accountHolder, balance + amount);
    }

    public BankAccount withdraw(double amount) {
        if (amount <= 0 || amount > balance) {
            throw new IllegalArgumentException("Invalid withdrawal amount");
        }
        return new BankAccount(accountNumber, accountHolder, balance - amount);
    }
}