// Superclass Device
class Device {
    // Attributes of the Device class
    String deviceId;
    String status;

    // Constructor to initialize Device attributes
    public Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    // Method to display device status (to be overridden in subclass)
    public void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + status);
    }
}

// Subclass Thermostat inherits from Device
class Thermostat extends Device {
    // Additional attribute for Thermostat class
    int temperatureSetting;

    // Constructor to initialize Thermostat attributes and call the superclass constructor
    public Thermostat(String deviceId, String status, int temperatureSetting) {
        // Call the superclass (Device) constructor
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    // Override the displayStatus() method to display both Device and Thermostat information
    @Override
    public void displayStatus() {
        // Call the superclass method to display general device details
        super.displayStatus();
        // Display thermostat-specific details
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
    }
}

// Main class to test the Device and Thermostat system
public class SmartHomeSystem {
    public static void main(String[] args) {
        // Creating a Thermostat object (which is a type of Device)
        Thermostat thermostat = new Thermostat("T123", "On", 22);
        
        // Displaying information about the thermostat
        thermostat.displayStatus();
    }
}
