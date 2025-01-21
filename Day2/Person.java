public class Person {
    // Attributes
    private String name;
    private int age;
    private String address;

    // Default Constructor
    public Person() {
        this.name = "Unknown";
        this.age = 0;
        this.address = "Unknown Address";
    }

    // Parameterized Constructor
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Copy Constructor
    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
        this.address = other.address;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Method to display person details
    public void displayPersonDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }

    // Main method to test the Person class
    public static void main(String[] args) {
        // Using the parameterized constructor
        Person originalPerson = new Person("Alice", 30, "123 Main Street");
        System.out.println("Original Person:");
        originalPerson.displayPersonDetails();

        // Using the copy constructor
        Person clonedPerson = new Person(originalPerson);
        System.out.println("\nCloned Person:");
        clonedPerson.displayPersonDetails();
    }
}
