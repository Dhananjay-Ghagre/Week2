// Base class Employee
 class Employee {
    // Common attributes for all employees
    private String name;
    private int id;
    private double salary;

    // Constructor to initialize Employee attributes
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    // Method to display details (this can be overridden by subclasses if needed)
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: $" + salary);
    }
}
// Subclass Manager
 class Manager extends Employee {
    // Unique attribute for Manager
    private int teamSize;

    // Constructor to initialize Manager attributes, including those of Employee
    public Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary); // Call Employee constructor
        this.teamSize = teamSize;
    }

    // Getter method for teamSize
    public int getTeamSize() {
        return teamSize;
    }

    // Overriding the displayDetails method to include team size
    @Override
    public void displayDetails() {
        super.displayDetails(); // Call the Employee's displayDetails method
        System.out.println("Team Size: " + teamSize);
    }
}
// Subclass Developer
 class Developer extends Employee {
    // Unique attribute for Developer
    private String programmingLanguage;

    // Constructor to initialize Developer attributes, including those of Employee
    public Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary); // Call Employee constructor
        this.programmingLanguage = programmingLanguage;
    }

    // Getter method for programmingLanguage
    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    // Overriding the displayDetails method to include programming language
    @Override
    public void displayDetails() {
        super.displayDetails(); // Call the Employee's displayDetails method
        System.out.println("Programming Language: " + programmingLanguage);
    }
}
// Subclass Intern
 class Intern extends Employee {
    // Unique attribute for Intern
    private String schoolName;

    // Constructor to initialize Intern attributes, including those of Employee
    public Intern(String name, int id, double salary, String schoolName) {
        super(name, id, salary); // Call Employee constructor
        this.schoolName = schoolName;
    }

    // Getter method for schoolName
    public String getSchoolName() {
        return schoolName;
    }

    // Overriding the displayDetails method to include school name
    @Override
    public void displayDetails() {
        super.displayDetails(); // Call the Employee's displayDetails method
        System.out.println("School Name: " + schoolName);
    }
}
// Main class to test the Employee hierarchy
 class Main2 {
    public static void main(String[] args) {
        // Create instances of each employee type
        Employee manager = new Manager("Alice", 101, 80000, 10);
        Employee developer = new Developer("Bob", 102, 60000, "Java");
        Employee intern = new Intern("Charlie", 103, 30000, "MIT");

        // Display details for each employee
        System.out.println("Manager Details:");
        manager.displayDetails();
        System.out.println();

        System.out.println("Developer Details:");
        developer.displayDetails();
        System.out.println();

        System.out.println("Intern Details:");
        intern.displayDetails();
    }
}

