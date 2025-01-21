// Base class: Student
 class Student {
    // Instance Variables
    public int rollNumber;      // Public: Accessible everywhere
    protected String name;      // Protected: Accessible within the package and by subclasses
    private double CGPA;        // Private: Accessible only within this class

    // Constructor
    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    // Public method to access CGPA
    public double getCGPA() {
        return CGPA;
    }

    // Public method to modify CGPA
    public void setCGPA(double CGPA) {
        if (CGPA >= 0 && CGPA <= 4.0) {
            this.CGPA = CGPA;
        } else {
            System.out.println("Invalid CGPA. CGPA must be between 0.0 and 4.0.");
        }
    }

    // Method to display student details
    public void displayStudentDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
    }
}

// Subclass: PostgraduateStudent
class PostgraduateStudent extends Student {
    private String thesisTopic;  // Additional attribute for PostgraduateStudent

    // Constructor
    public PostgraduateStudent(int rollNumber, String name, double CGPA, String thesisTopic) {
        super(rollNumber, name, CGPA);  // Call the constructor of the parent class
        this.thesisTopic = thesisTopic;
    }

    // Method to display postgraduate student details
    public void displayPostgraduateStudentDetails() {
        // Accessing protected attribute 'name' from the parent class
        System.out.println("Postgraduate Student Details:");
        System.out.println("Roll Number: " + rollNumber);    // Public attribute
        System.out.println("Name: " + name);                // Protected attribute
        System.out.println("CGPA: " + getCGPA());           // Private attribute accessed via method
        System.out.println("Thesis Topic: " + thesisTopic);
    }
}

// Main class to demonstrate the system
public class UniversityManagementSystem {
    public static void main(String[] args) {
        // Creating a Student object
        Student student1 = new Student(101, "Alice", 3.8);
        System.out.println("Student 1 Details:");
        student1.displayStudentDetails();

        // Modifying CGPA using public methods
        student1.setCGPA(3.9);
        System.out.println("\nUpdated Student 1 CGPA: " + student1.getCGPA());

        // Creating a PostgraduateStudent object
        PostgraduateStudent pgStudent = new PostgraduateStudent(102, "Bob", 3.7, "Artificial Intelligence");
        System.out.println("\nPostgraduate Student Details:");
        pgStudent.displayPostgraduateStudentDetails();
    }
}

