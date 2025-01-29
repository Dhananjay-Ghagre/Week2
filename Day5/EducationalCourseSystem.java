// Base class Course
class Course {
    // Attributes of the Course class
    String courseName;
    int duration; // Duration in hours

    // Constructor to initialize Course attributes
    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    // Method to display course details (to be overridden in subclasses)
    public void getCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " hours");
    }
}

// Subclass OnlineCourse inherits from Course
class OnlineCourse extends Course {
    // Additional attributes for OnlineCourse class
    String platform; // Platform hosting the course (e.g., Coursera, Udemy)
    boolean isRecorded; // Whether the course is recorded or live

    // Constructor to initialize OnlineCourse attributes and call the superclass constructor
    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        // Call the superclass (Course) constructor
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    // Override the getCourseDetails() method to include online course-specific details
    @Override
    public void getCourseDetails() {
        super.getCourseDetails(); // Display basic course details
        System.out.println("Platform: " + platform);
        System.out.println("Recorded: " + (isRecorded ? "Yes" : "No"));
    }
}

// Subclass PaidOnlineCourse inherits from OnlineCourse
class PaidOnlineCourse extends OnlineCourse {
    // Additional attributes for PaidOnlineCourse class
    double fee; // Fee for the course
    double discount; // Discount on the course fee

    // Constructor to initialize PaidOnlineCourse attributes and call the superclass constructor
    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        // Call the superclass (OnlineCourse) constructor
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    // Override the getCourseDetails() method to include fee and discount details
    @Override
    public void getCourseDetails() {
        super.getCourseDetails(); // Display basic course details and online course-specific details
        System.out.println("Course Fee: $" + fee);
        System.out.println("Discount: " + discount + "%");
        double finalFee = fee - (fee * discount / 100);
        System.out.println("Final Fee after Discount: $" + finalFee);
    }
}

// Main class to test the course hierarchy
public class EducationalCourseSystem {
    public static void main(String[] args) {
        // Creating a basic course object
        Course course = new Course("Java Programming", 40);
        
        // Creating an OnlineCourse object
        OnlineCourse onlineCourse = new OnlineCourse("Web Development", 60, "Udemy", true);
        
        // Creating a PaidOnlineCourse object
        PaidOnlineCourse paidOnlineCourse = new PaidOnlineCourse("Data Science", 80, "Coursera", false, 200, 15);

        // Displaying course details
        System.out.println("Basic Course Details:");
        course.getCourseDetails();
        System.out.println();

        System.out.println("Online Course Details:");
        onlineCourse.getCourseDetails();
        System.out.println();

        System.out.println("Paid Online Course Details:");
        paidOnlineCourse.getCourseDetails();
    }
}

