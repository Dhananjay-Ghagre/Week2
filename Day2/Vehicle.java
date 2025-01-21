public class Vehicle {
    // Instance Variables
    private String ownerName;
    private String vehicleType;

    // Class Variable (fixed for all vehicles)
    private static double registrationFee = 150.0; // Fixed registration fee for all vehicles

    // Constructor
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance Method: Display vehicle details
    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: $" + registrationFee);
    }

    // Class Method: Update the registration fee for all vehicles
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Updated Registration Fee: $" + registrationFee);
    }

    // Main method to test the Vehicle class
    public static void main(String[] args) {
        // Creating vehicle objects
        Vehicle vehicle1 = new Vehicle("John Doe", "Car");
        Vehicle vehicle2 = new Vehicle("Jane Smith", "Motorcycle");

        // Displaying vehicle details
        System.out.println("Vehicle 1 Details:");
        vehicle1.displayVehicleDetails();

        System.out.println("\nVehicle 2 Details:");
        vehicle2.displayVehicleDetails();

        // Updating the registration fee
        Vehicle.updateRegistrationFee(200.0);

        // Displaying updated vehicle details
        System.out.println("\nUpdated Vehicle Details:");
        vehicle1.displayVehicleDetails();
        vehicle2.displayVehicleDetails();
    }
}

