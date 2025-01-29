import java.util.ArrayList;
import java.util.List;

// Abstract class Vehicle
abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    // Constructor
    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    // Getters and Setters
    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(double rentalRate) {
        this.rentalRate = rentalRate;
    }

    // Abstract method to calculate rental cost
    public abstract double calculateRentalCost(int days);

    // Method to display vehicle details
    public void displayDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber + ", Type: " + type + ", Rental Rate: " + rentalRate);
    }
}

// Interface Insurable
interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

// Car class
class Car extends Vehicle implements Insurable {
    private double insuranceRate;
    private String policyNumber;

    public Car(String vehicleNumber, double rentalRate, double insuranceRate, String policyNumber) {
        super(vehicleNumber, "Car", rentalRate);
        this.insuranceRate = insuranceRate;
        this.policyNumber = policyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return insuranceRate;
    }

    @Override
    public String getInsuranceDetails() {
        return "Policy Number: [Restricted]";
    }
}

// Bike class
class Bike extends Vehicle {
    private double discountRate;

    public Bike(String vehicleNumber, double rentalRate, double discountRate) {
        super(vehicleNumber, "Bike", rentalRate);
        this.discountRate = discountRate;
    }

    @Override
    public double calculateRentalCost(int days) {
        double cost = getRentalRate() * days;
        return cost - (cost * discountRate / 100);
    }
}

// Truck class
class Truck extends Vehicle implements Insurable {
    private double insuranceRate;
    private String policyNumber;

    public Truck(String vehicleNumber, double rentalRate, double insuranceRate, String policyNumber) {
        super(vehicleNumber, "Truck", rentalRate);
        this.insuranceRate = insuranceRate;
        this.policyNumber = policyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days + 500; // Additional fixed cost for trucks
    }

    @Override
    public double calculateInsurance() {
        return insuranceRate;
    }

    @Override
    public String getInsuranceDetails() {
        return "Policy Number: [Restricted]";
    }
}

// Main class
public class VehicleRentalSystem {

    // Method to process and display details of all vehicles
    public static void processVehicles(List<Vehicle> vehicles, int rentalDays) {
        for (Vehicle vehicle : vehicles) {
            vehicle.displayDetails();
            System.out.println("Rental Cost for " + rentalDays + " days: " + vehicle.calculateRentalCost(rentalDays));
            if (vehicle instanceof Insurable) {
                Insurable insurable = (Insurable) vehicle;
                System.out.println(insurable.getInsuranceDetails());
                System.out.println("Insurance Cost: " + insurable.calculateInsurance());
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();

        // Add a Car
        vehicles.add(new Car("CAR123", 2000, 500, "CARPOL123"));

        // Add a Bike
        vehicles.add(new Bike("BIKE456", 500, 10));

        // Add a Truck
        vehicles.add(new Truck("TRUCK789", 5000, 1500, "TRUCKPOL789"));

        // Process vehicles
        int rentalDays = 5; // Example: 5 rental days
        processVehicles(vehicles, rentalDays);
    }
}
