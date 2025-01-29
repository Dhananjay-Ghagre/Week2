// Base class BankAccount
class BankAccount {
    // Common attributes for all account types
    String accountNumber;
    double balance;

    // Constructor to initialize common attributes
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to display account type (to be overridden in subclasses)
    public void displayAccountType() {
        System.out.println("Account Type: General Bank Account");
    }
}

// Subclass SavingsAccount inherits from BankAccount
class SavingsAccount extends BankAccount {
    // Additional attribute for SavingsAccount
    double interestRate;

    // Constructor to initialize SavingsAccount attributes and call the superclass constructor
    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance); // Call the superclass (BankAccount) constructor
        this.interestRate = interestRate;
    }

    // Override displayAccountType to specify SavingsAccount
    @Override
    public void displayAccountType() {
        System.out.println("Account Type: Savings Account");
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

// Subclass CheckingAccount inherits from BankAccount
class CheckingAccount extends BankAccount {
    // Additional attribute for CheckingAccount
    double withdrawalLimit;

    // Constructor to initialize CheckingAccount attributes and call the superclass constructor
    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance); // Call the superclass (BankAccount) constructor
        this.withdrawalLimit = withdrawalLimit;
    }

    // Override displayAccountType to specify CheckingAccount
    @Override
    public void displayAccountType() {
        System.out.println("Account Type: Checking Account");
        System.out.println("Withdrawal Limit: $" + withdrawalLimit);
    }
}

// Subclass FixedDepositAccount inherits from BankAccount
class FixedDepositAccount extends BankAccount {
    // Additional attributes for FixedDepositAccount
    double depositAmount;
    int maturityPeriod; // in months

    // Constructor to initialize FixedDepositAccount attributes and call the superclass constructor
    public FixedDepositAccount(String accountNumber, double balance, double depositAmount, int maturityPeriod) {
        super(accountNumber, balance); // Call the superclass (BankAccount) constructor
        this.depositAmount = depositAmount;
        this.maturityPeriod = maturityPeriod;
    }

    // Override displayAccountType to specify FixedDepositAccount
    @Override
    public void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
        System.out.println("Deposit Amount: $" + depositAmount);
        System.out.println("Maturity Period: " + maturityPeriod + " months");
    }
}

// Main class to test the banking system
public class BankAccountSystem {
    public static void main(String[] args) {
        // Creating different account objects
        BankAccount savingsAccount = new SavingsAccount("SA12345", 5000, 3.5);
        BankAccount checkingAccount = new CheckingAccount("CA12345", 1000, 2000);
        BankAccount fixedDepositAccount = new FixedDepositAccount("FDA12345", 10000, 5000, 12);

        // Displaying account details
        System.out.println("Savings Account Details:");
        savingsAccount.displayAccountType();
        System.out.println();

        System.out.println("Checking Account Details:");
        checkingAccount.displayAccountType();
        System.out.println();

        System.out.println("Fixed Deposit Account Details:");
        fixedDepositAccount.displayAccountType();
    }
}

