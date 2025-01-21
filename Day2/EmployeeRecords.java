
 class Employee {
    // Attributes
    public String employeeID;       // Public: Accessible everywhere
    protected String department;    // Protected: Accessible within the package and by subclasses
    private double salary;          // Private: Accessible only within this class

    // Constructor
    public Employee(String employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Public method to get the salary
    public double getSalary() {
        return salary;
    }

    // Public method to modify the salary
    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary. Salary cannot be negative.");
        }
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: $" + salary);
    }
}

// Subclass: Manager
class Manager extends Employee {
    private String team; // Additional attribute for Manager class

    // Constructor
    public Manager(String employeeID, String department, double salary, String team) {
        super(employeeID, department, salary); // Call the constructor of the parent class
        this.team = team;
    }

    // Method to display manager details
    public void displayManagerDetails() {
        // Accessing public and protected attributes from the parent class
        System.out.println("Manager Details:");
        System.out.println("Employee ID: " + employeeID);       // Public attribute
        System.out.println("Department: " + department);       // Protected attribute
        System.out.println("Salary: $" + getSalary());         // Private attribute accessed via method
        System.out.println("Team: " + team);
    }
}

// Main class to demonstrate the system
public class EmployeeRecords {
    public static void main(String[] args) {
        // Creating an Employee object
        Employee employee = new Employee("E001", "IT", 50000.0);
        System.out.println("Employee Details:");
        employee.displayEmployeeDetails();

        // Modifying salary using public method
        employee.setSalary(55000.0);
        System.out.println("\nUpdated Employee Salary: $" + employee.getSalary());

        // Creating a Manager object
        Manager manager = new Manager("M001", "HR", 70000.0, "Recruitment Team");
        System.out.println("\nManager Details:");
        manager.displayManagerDetails();
    }
}