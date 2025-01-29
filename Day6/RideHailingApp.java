import java.util.ArrayList;
import java.util.List;

// Abstract class Vehicle
abstract class Vehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    // Constructor
    public Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    // Getters and Setters
    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }

    public void setRatePerKm(double ratePerKm) {
        this.ratePerKm = ratePerKm;
    }

    // Abstract method to calculate fare
    public abstract double calculateFare(double distance);

    // Concrete method to get vehicle details
    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId + ", Driver Name: " + driverName + ", Rate per Km: " + ratePerKm);
    }
}

// Interface GPS
interface GPS {
    String getCurrentLocation();

    void updateLocation(String location);
}

// Car class
class Car extends Vehicle implements GPS {
    private String currentLocation;

    public Car(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm();
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String location) {
        this.currentLocation = location;
    }
}

// Bike class
class Bike extends Vehicle implements GPS {
    private String currentLocation;

    public Bike(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm();
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String location) {
        this.currentLocation = location;
    }
}

// Auto class
class Auto extends Vehicle implements GPS {
    private String currentLocation;

    public Auto(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm();
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String location) {
        this.currentLocation = location;
    }
}

// Main class
public class RideHailingApp {

    // Method to process rides
    public static void processRides(List<Vehicle> rides, double distance) {
        for (Vehicle ride : rides) {
            ride.getVehicleDetails();
            System.out.println("Fare for " + distance + " km: " + ride.calculateFare(distance));

            if (ride instanceof GPS) {
                GPS gps = (GPS) ride;
                gps.updateLocation("New Pickup Location");
                System.out.println("Updated Location: " + gps.getCurrentLocation());
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        List<Vehicle> rides = new ArrayList<>();

        // Add a Car ride
        Car car = new Car("CAR001", "Alice", 15.0);
        car.updateLocation("Downtown");
        rides.add(car);

        // Add a Bike ride
        Bike bike = new Bike("BIKE001", "Bob", 10.0);
        bike.updateLocation("Central Park");
        rides.add(bike);

        // Add an Auto ride
        Auto auto = new Auto("AUTO001", "Charlie", 12.0);
        auto.updateLocation("Station");
        rides.add(auto);

        // Process rides for a given distance
        processRides(rides, 10.0); // Calculate fare for 10 km rides
    }
}

