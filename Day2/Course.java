public class Course {
    // Instance Variables
    private String courseName;
    private int duration; // Duration in weeks
    private double fee;

    // Class Variable
    private static String instituteName = "Global Learning Academy";

    // Constructor
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance Method: Display course details
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
        System.out.println("Fee: $" + fee);
        System.out.println("Institute: " + instituteName);
    }

    // Class Method: Update institute name
    public static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
    }

    // Main method to test the Course class
    public static void main(String[] args) {
        // Creating course objects
        Course course1 = new Course("Java Programming", 10, 300.0);
        Course course2 = new Course("Web Development", 12, 400.0);

        // Displaying course details
        System.out.println("Course 1 Details:");
        course1.displayCourseDetails();

        System.out.println("\nCourse 2 Details:");
        course2.displayCourseDetails();

        // Updating the institute name
        Course.updateInstituteName("Advanced Tech Institute");

        // Displaying updated course details
        System.out.println("\nUpdated Course Details:");
        course1.displayCourseDetails();
        course2.displayCourseDetails();
    }
}
