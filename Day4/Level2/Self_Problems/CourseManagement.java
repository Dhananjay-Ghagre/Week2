import java.util.ArrayList;
import java.util.Objects;

class School {//School class for the University
    private String name;//School class for the University
    private ArrayList<Student> students;//School class for the University

    public School(String name) {//School class for the University
        this.name = name;//School class for the University
        this.students = new ArrayList<>();//School class for the University
    }

    public String getName() {//School class for the University
        return this.name;
    }

    public void addStudent(Student s) {//School class for the University
        if (!students.contains(s)) {//School class for the University
            students.add(s);
            System.out.println("The student " + s.getName() + " has been added to the school " + this.name);
        } else {
            System.out.println("The student " + s.getName() + " is already in the school " + this.name);
        }
    }
}

class Course {//Course class for the University
    private String courseName;//Course class for the University
    private ArrayList<Student> enrolledStudents;//Course class for the University

    public Course(String courseName) {//Course class for the University
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

    public String getCourseName() {
        return this.courseName;
    }

    public void addStudent(Student s) {
        if (!enrolledStudents.contains(s)) {
            enrolledStudents.add(s);
            System.out.println("Student " + s.getName() + " has been enrolled in the course " + this.courseName);
        } else {
            System.out.println("Student " + s.getName() + " is already enrolled in the course " + this.courseName);
        }
    }

    public void viewStudents() {
        if (enrolledStudents.isEmpty()) {
            System.out.println("No students are enrolled in the course " + this.courseName);
        } else {
            System.out.println("Students enrolled in the course " + this.courseName + ":");
            for (Student s : enrolledStudents) {
                System.out.println("- " + s.getName());
            }
        }
    }

    
    public boolean equals(Object o) {//Course class for the University
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return Objects.equals(courseName, course.courseName);
    }

    @Override
    public int hashCode() {//   Faculty class for the University
        return Objects.hash(courseName);
    }
}

class Student {
    private String name;//Student class with name and id
    private ArrayList<Course> courses;//Student class with name and id

    public Student(String name) {//Student class with name and id
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getName() {//Student class with name and id
        return this.name;
    }

    public void addCourse(Course c) {//Student class with name and id
        if (!courses.contains(c)) {
            courses.add(c);
            c.addStudent(this);
            System.out.println("The course " + c.getCourseName() + " has been successfully added to " + this.name);
        } else {
            System.out.println("The course " + c.getCourseName() + " is already added to " + this.name);
        }
    }

    public void viewCourses() {//Student class with name and id
        if (courses.isEmpty()) {
            System.out.println("The student " + this.name + " is not enrolled in any courses.");
        } else {
            System.out.println("Courses for student " + this.name + ":");
            for (Course c : courses) {
                System.out.println("- " + c.getCourseName());
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;//Student class with name and id
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name);//Student class with name and id
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

public class CourseManagement {//CourseManagement class for the University
    public static void main(String[] args) {
        School school = new School("Technocrats Institute of Technology");

        Student s1 = new Student("Nishant");
        Student s2 = new Student("Pankaj");

        Course c1 = new Course("Physics");
        Course c2 = new Course("Chemistry");

        // Add students to the school
        school.addStudent(s1);
        school.addStudent(s2);

        // Add courses to students
        s1.addCourse(c1);//CourseManagement class for the University
        s1.addCourse(c2);//CourseManagement class for the University

        s2.addCourse(c1);
        s2.addCourse(c2);

        // View courses for students
        s1.viewCourses();//CourseManagement class for the University
        s2.viewCourses();

        // View students for courses
        c1.viewStudents();
        c2.viewStudents();//CourseManagement class for the University
    }
}
