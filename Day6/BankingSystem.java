import java.util.ArrayList;
import java.util.List;

// Abstract class BankAccount
abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    // Getters and Setters
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + ", New Balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount + ", Remaining Balance: " + balance);
        } else {
            System.out.println("Invalid withdraw amount or insufficient balance.");
        }
    }

    // Abstract method to calculate interest
    public abstract double calculateInterest();

    // Method to display account details
    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber + ", Holder Name: " + holderName + ", Balance: " + balance);
    }
}

// Interface Loanable
interface Loanable {
    void applyForLoan(double amount);

    double calculateLoanEligibility();
}

// SavingsAccount class
class SavingsAccount extends BankAccount implements Loanable {
    private double interestRate;

    public SavingsAccount(String accountNumber, String holderName, double balance, double interestRate) {
        super(accountNumber, holderName, balance);
        this.interestRate = interestRate;
    }

    @Override
    public double calculateInterest() {
        return getBalance() * (interestRate / 100);
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Loan applied for amount: " + amount);
    }

    @Override
    public double calculateLoanEligibility() {
        return getBalance() * 5; // Loan eligibility is 5 times the balance
    }
}

// CurrentAccount class
class CurrentAccount extends BankAccount implements Loanable {
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, String holderName, double balance, double overdraftLimit) {
        super(accountNumber, holderName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public double calculateInterest() {
        return 0; // No interest for current accounts
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Loan applied for amount: " + amount);
    }

    @Override
    public double calculateLoanEligibility() {
        return getBalance() + overdraftLimit; // Loan eligibility is balance plus overdraft limit
    }
}

// Main class
public class BankingSystem {

    // Method to process and display account details
    public static void processAccounts(List<BankAccount> accounts) {
        for (BankAccount account : accounts) {
            account.displayDetails();
            System.out.println("Calculated Interest: " + account.calculateInterest());
            if (account instanceof Loanable) {
                Loanable loanable = (Loanable) account;
                System.out.println("Loan Eligibility: " + loanable.calculateLoanEligibility());
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        List<BankAccount> accounts = new ArrayList<>();

        // Add a SavingsAccount
        accounts.add(new SavingsAccount("SA123", "Alice", 10000, 4));

        // Add a CurrentAccount
        accounts.add(new CurrentAccount("CA456", "Bob", 5000, 2000));

        // Process accounts
        processAccounts(accounts);
    }
}
