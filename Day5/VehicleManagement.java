// Superclass: Vehicle
class Vehicle {
    private String model;
    private int maxSpeed;

    // Constructor
    public Vehicle(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    // Getter methods
    public String getModel() {
        return model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    // Method to display vehicle details
    public void displayDetails() {
        System.out.println("Model: " + model + ", Max Speed: " + maxSpeed + " km/h");
    }
}

// Interface: Refuelable
interface Refuelable {
    void refuel(); // Abstract method to be implemented by PetrolVehicle
}

// Subclass: ElectricVehicle
class ElectricVehicle extends Vehicle {
    private int batteryCapacity;

    // Constructor
    public ElectricVehicle(String model, int maxSpeed, int batteryCapacity) {
        super(model, maxSpeed);
        this.batteryCapacity = batteryCapacity;
    }

    // Getter for batteryCapacity
    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    // Method to charge the vehicle
    public void charge() {
        displayDetails();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
        System.out.println("Charging the electric vehicle...");
    }
}

// Subclass: PetrolVehicle
class PetrolVehicle extends Vehicle implements Refuelable {
    private int fuelCapacity;

    // Constructor
    public PetrolVehicle(String model, int maxSpeed, int fuelCapacity) {
        super(model, maxSpeed);
        this.fuelCapacity = fuelCapacity;
    }

    // Getter for fuelCapacity
    public int getFuelCapacity() {
        return fuelCapacity;
    }

    // Implementation of refuel method
    @Override
    public void refuel() {
        displayDetails();
        System.out.println("Fuel Capacity: " + fuelCapacity + " liters");
        System.out.println("Refueling the petrol vehicle...");
    }
}

// Main class to test the Vehicle Management System
public class VehicleManagement {
    public static void main(String[] args) {
        // Create instances
        ElectricVehicle ev = new ElectricVehicle("Tesla Model 3", 200, 75);
        PetrolVehicle pv = new PetrolVehicle("Toyota Corolla", 180, 50);

        // Display details and actions
        System.out.println("Vehicle Management System:");
        System.out.println("\nElectric Vehicle:");
        ev.charge();

        System.out.println("\nPetrol Vehicle:");
        pv.refuel();
    }
}

