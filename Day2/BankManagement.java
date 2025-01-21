// Base class: BankAccount
 class BankAccount {
    // Attributes
    public String accountNumber;      // Public: Accessible everywhere
    protected String accountHolder;   // Protected: Accessible within the package and by subclasses
    private double balance;           // Private: Accessible only within this class

    // Constructor
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Public method to get the balance
    public double getBalance() {
        return balance;
    }

    // Public method to modify the balance
    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Invalid balance. Balance cannot be negative.");
        }
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: $" + balance);
    }
}

// Subclass: SavingsAccount
class SavingsAccount extends BankAccount {
    private double interestRate; // Interest rate for savings account

    // Constructor
    public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance); // Call the parent class constructor
        this.interestRate = interestRate;
    }

    // Method to calculate interest
    public double calculateInterest() {
        return getBalance() * (interestRate / 100);
    }

    // Method to display savings account details
    public void displaySavingsAccountDetails() {
        // Accessing public and protected attributes from the parent class
        System.out.println("Savings Account Details:");
        System.out.println("Account Number: " + accountNumber);       // Public attribute
        System.out.println("Account Holder: " + accountHolder);       // Protected attribute
        System.out.println("Balance: $" + getBalance());              // Private attribute accessed via method
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("Calculated Interest: $" + calculateInterest());
    }
}

// Main class to demonstrate the system
public class BankManagement {
    public static void main(String[] args) {
        // Creating a BankAccount object
        BankAccount account = new BankAccount("123456789", "John Doe", 5000.0);
        System.out.println("Bank Account Details:");
        account.displayAccountDetails();

        // Modifying balance using public methods
        account.setBalance(6000.0);
        System.out.println("\nUpdated Bank Account Balance: $" + account.getBalance());

        // Creating a SavingsAccount object
        SavingsAccount savingsAccount = new SavingsAccount("987654321", "Jane Doe", 10000.0, 2.5);
        System.out.println("\nSavings Account Details:");
        savingsAccount.displaySavingsAccountDetails();
    }
}
