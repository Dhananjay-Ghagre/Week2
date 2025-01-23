import java.util.ArrayList;//importing the ArrayList class
import java.util.List;//importing the List class

class Student {//Student class
    private String name;//Student class with name and id
    private int id;
    private List<Course> enrolledCourses;

    public Student(String name, int id) {//Student class with name and id
        this.name = name;
        this.id = id;
        this.enrolledCourses = new ArrayList<>();
    }

    public String getName() {//Student class with name and id
        return name;
    }

    public int getId() {//Student class with name and id
        return id;
    }

    public void enrollCourse(Course course) {//Student class with name and id
        if (!enrolledCourses.contains(course)) {//Student class with name and id
            enrolledCourses.add(course);//Student class with name and id
            course.addStudent(this);//Student class with name and id
            System.out.println(name + " has enrolled in " + course.getName());
        }
    }

    public List<Course> getEnrolledCourses() {//Student class with name and id
        return enrolledCourses;
    }
}

class Professor {//Professor class For the University
    private String name;
    private int id;
    private List<Course> assignedCourses;

    public Professor(String name, int id) {//Professor class For the University
        this.name = name;
        this.id = id;
        this.assignedCourses = new ArrayList<>();
    }

    public String getName() {//Professor class For the University
        return name;
    }

    public int getId() {//Professor class For the University
        return id;
    }

    public void assignCourse(Course course) {//Professor class For the University
        if (!assignedCourses.contains(course)) {//  
            assignedCourses.add(course);
            course.setProfessor(this);
            System.out.println(name + " is now teaching " + course.getName());
        }
    }

    public List<Course> getAssignedCourses() {
        return assignedCourses;
    }
}

class Course {//Course class For the University
    private String name;
    private int code;
    private Professor professor;
    private List<Student> students;

    public Course(String name, int code) {
        this.name = name;
        this.code = code;
        this.students = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getCode() {
        return code;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {//Course class For the University
        if (!students.contains(student)) {
            students.add(student);
        }
    }
}

public class UniversitySystem {//University class For the University
    public static void main(String[] args) {
        Student student1 = new Student("Alice", 1);
        Student student2 = new Student("Bob", 2);

        Professor professor1 = new Professor("Dr. Smith", 101);

        Course course1 = new Course("Computer Science", 501);
        Course course2 = new Course("Mathematics", 502);

        // Assign professor to course
        professor1.assignCourse(course1);

        // Enroll students in courses
        student1.enrollCourse(course1);
        student2.enrollCourse(course1);
        student2.enrollCourse(course2);

        // Display relationships
        System.out.println("\nStudents in " + course1.getName() + ":");
        for (Student student : course1.getStudents()) {
            System.out.println(student.getName());
        }

        System.out.println("\nCourses taught by " + professor1.getName() + ":");//University class For the University
        for (Course course : professor1.getAssignedCourses()) {//University class For the University
            System.out.println(course.getName());
        }
    }
}


/*
 * 
 */