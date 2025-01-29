// Superclass: Person
class Person {
    private String name;
    private int id;

    // Constructor
    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    // Method to display basic details
    public void displayDetails() {
        System.out.println("Name: " + name + ", ID: " + id);
    }
}

// Interface: Worker
interface Worker {
    void performDuties(); // Abstract method to be implemented by subclasses
}

// Subclass: Chef
class Chef extends Person implements Worker {
    private String specialty;

    // Constructor
    public Chef(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }

    // Getter for specialty
    public String getSpecialty() {
        return specialty;
    }

    // Implementation of performDuties
    @Override
    public void performDuties() {
        displayDetails();
        System.out.println("Role: Chef");
        System.out.println("Duties: Preparing meals, especially " + specialty + ".");
    }
}

// Subclass: Waiter
class Waiter extends Person implements Worker {
    private String section;

    // Constructor
    public Waiter(String name, int id, String section) {
        super(name, id);
        this.section = section;
    }

    // Getter for section
    public String getSection() {
        return section;
    }

    // Implementation of performDuties
    @Override
    public void performDuties() {
        displayDetails();
        System.out.println("Role: Waiter");
        System.out.println("Duties: Serving customers in the " + section + " section.");
    }
}

// Main class to test the Restaurant Management System
public class RestaurantManagement {
    public static void main(String[] args) {
        // Create instances
        Chef chef = new Chef("Gordon", 101, "Italian Cuisine");
        Waiter waiter = new Waiter("James", 201, "Outdoor");

        // Display duties
        System.out.println("Restaurant Workers' Duties:");
        chef.performDuties();
        System.out.println();
        waiter.performDuties();
    }
}

