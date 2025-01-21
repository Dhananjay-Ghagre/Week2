public class Circle {
    // Attribute
    private double radius;

    // Default Constructor
    public Circle() {
        this(1.0); // Default radius is 1.0
    }

    // Parameterized Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Getter and Setter
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Method to calculate the area of the circle
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate the circumference of the circle
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    // Method to display circle details
    public void displayCircleDetails() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + calculateArea());
        System.out.println("Circumference: " + calculateCircumference());
    }

    // Main method to test the Circle class
    public static void main(String[] args) {
        // Using the default constructor
        Circle defaultCircle = new Circle();
        System.out.println("Default Circle:");
        defaultCircle.displayCircleDetails();

        // Using the parameterized constructor
        Circle customCircle = new Circle(5.0);
        System.out.println("\nCustom Circle:");
        customCircle.displayCircleDetails();
    }
}
