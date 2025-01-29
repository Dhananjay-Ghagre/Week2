// Superclass Vehicle
 class Vehicle {
    // Common attributes for all vehicles
    private int maxSpeed;
    private String fuelType;

    // Constructor to initialize Vehicle attributes
    public Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    // Getter methods
    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getFuelType() {
        return fuelType;
    }

    // Method to display common vehicle information (this can be overridden by subclasses)
    public void displayInfo() {
        System.out.println("Max Speed: " + maxSpeed + " km/h");
        System.out.println("Fuel Type: " + fuelType);
    }
}

// Subclass Car
 class Car extends Vehicle {
    // Unique attribute for Car
    private int seatCapacity;

    // Constructor to initialize Car attributes, including those of Vehicle
    public Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType); // Call Vehicle constructor
        this.seatCapacity = seatCapacity;
    }

    // Getter method for seatCapacity
    public int getSeatCapacity() {
        return seatCapacity;
    }

    // Overriding the displayInfo method to include seat capacity
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call the Vehicle's displayInfo method
        System.out.println("Seat Capacity: " + seatCapacity);
    }
}

// Subclass Truck
class Truck extends Vehicle {
    // Unique attribute for Truck
    private double loadCapacity;

    // Constructor to initialize Truck attributes, including those of Vehicle
    public Truck(int maxSpeed, String fuelType, double loadCapacity) {
        super(maxSpeed, fuelType); // Call Vehicle constructor
        this.loadCapacity = loadCapacity;
    }

    // Getter method for loadCapacity
    public double getLoadCapacity() {
        return loadCapacity;
    }

    // Overriding the displayInfo method to include load capacity
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call the Vehicle's displayInfo method
        System.out.println("Load Capacity: " + loadCapacity + " tons");
    }
}

// Subclass Motorcycle
 class Motorcycle extends Vehicle {
    // Unique attribute for Motorcycle
    private boolean hasSidecar;

    // Constructor to initialize Motorcycle attributes, including those of Vehicle
    public Motorcycle(int maxSpeed, String fuelType, boolean hasSidecar) {
        super(maxSpeed, fuelType); // Call Vehicle constructor
        this.hasSidecar = hasSidecar;
    }

    // Getter method for hasSidecar
    public boolean hasSidecar() {
        return hasSidecar;
    }

    // Overriding the displayInfo method to include sidecar information
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call the Vehicle's displayInfo method
        System.out.println("Has Sidecar: " + (hasSidecar ? "Yes" : "No"));
    }
}

// Main class to test the Vehicle hierarchy
 class Main3 {
    public static void main(String[] args) {
        // Create instances of each vehicle type
        Vehicle car = new Car(180, "Gasoline", 5);
        Vehicle truck = new Truck(120, "Diesel", 10);
        Vehicle motorcycle = new Motorcycle(220, "Petrol", true);

        // Store them in an array of Vehicle type (demonstrating polymorphism)
        Vehicle[] vehicles = {car, truck, motorcycle};

        // Loop through the array and call displayInfo() on each vehicle
        for (Vehicle vehicle : vehicles) {
            System.out.println("Vehicle Details:");
            vehicle.displayInfo();  // Polymorphism in action
            System.out.println();
        }
    }
}

