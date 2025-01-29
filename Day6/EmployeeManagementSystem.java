import java.util.ArrayList;
import java.util.List;

// Abstract class Employee
abstract class Employee {
    private int employeeId;
    private String name;
    private double baseSalary;

    // Constructor
    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Getters and Setters
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    // Abstract method to calculate salary
    public abstract double calculateSalary();

    // Concrete method to display details
    public void displayDetails() {
        System.out.println("ID: " + employeeId + ", Name: " + name + ", Base Salary: " + baseSalary);
    }
}

// Interface Department
interface Department {
    void assignDepartment(String departmentName);
    String getDepartmentDetails();
}

// Subclass FullTimeEmployee
class FullTimeEmployee extends Employee implements Department {
    private String department;
    private double bonus;

    public FullTimeEmployee(int employeeId, String name, double baseSalary, double bonus) {
        super(employeeId, name, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + bonus;
    }

    @Override
    public void assignDepartment(String departmentName) {
        this.department = departmentName;
    }

    @Override
    public String getDepartmentDetails() {
        return "Department: " + department;
    }
}

// Subclass PartTimeEmployee
class PartTimeEmployee extends Employee implements Department {
    private String department;
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(int employeeId, String name, double baseSalary, int hoursWorked, double hourlyRate) {
        super(employeeId, name, baseSalary);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + (hoursWorked * hourlyRate);
    }

    @Override
    public void assignDepartment(String departmentName) {
        this.department = departmentName;
    }

    @Override
    public String getDepartmentDetails() {
        return "Department: " + department;
    }
}

// Main class
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        // List of employees
        List<Employee> employees = new ArrayList<>();

        // Creating FullTimeEmployee
        FullTimeEmployee fte = new FullTimeEmployee(1, "Alice", 50000, 10000);
        fte.assignDepartment("Engineering");
        employees.add(fte);

        // Creating PartTimeEmployee
        PartTimeEmployee pte = new PartTimeEmployee(2, "Bob", 20000, 20, 150);
        pte.assignDepartment("Support");
        employees.add(pte);

        // Displaying employee details
        for (Employee employee : employees) {
            employee.displayDetails();
            System.out.println("Calculated Salary: " + employee.calculateSalary());
            if (employee instanceof Department) {
                System.out.println(((Department) employee).getDepartmentDetails());
            }
            System.out.println();
        }
    }
}
