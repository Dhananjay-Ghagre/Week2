// Superclass: Person
class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Method to display common details
    public void displayDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Subclass: Teacher
class Teacher extends Person {
    private String subject;

    // Constructor
    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    // Getter for subject
    public String getSubject() {
        return subject;
    }

    // Overriding displayRole method
    public void displayRole() {
        displayDetails();
        System.out.println("Role: Teacher, Subject: " + subject);
    }
}

// Subclass: Student
class Student extends Person {
    private String grade;

    // Constructor
    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    // Getter for grade
    public String getGrade() {
        return grade;
    }

    // Overriding displayRole method
    public void displayRole() {
        displayDetails();
        System.out.println("Role: Student, Grade: " + grade);
    }
}

// Subclass: Staff
class Staff extends Person {
    private String department;

    // Constructor
    public Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    // Getter for department
    public String getDepartment() {
        return department;
    }

    // Overriding displayRole method
    public void displayRole() {
        displayDetails();
        System.out.println("Role: Staff, Department: " + department);
    }
}

// Main class to test the hierarchy
public class SchoolSystem {
    public static void main(String[] args) {
        // Create instances
        Teacher teacher = new Teacher("Alice", 35, "Mathematics");
        Student student = new Student("Bob", 16, "10th Grade");
        Staff staff = new Staff("Charlie", 40, "Administration");

        // Display roles
        System.out.println("School System Roles:");
        teacher.displayRole();
        System.out.println();
        student.displayRole();
        System.out.println();
        staff.displayRole();
    }
}

