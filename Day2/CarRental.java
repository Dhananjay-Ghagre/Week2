class CarRental {
    // Attributes
    private String customerName;
    private String carModel;
    private int rentalDays;
    private static final double DAILY_RENTAL_RATE = 50.0; // Example daily rental rate

    // Default Constructor
    public CarRental() {
        this.customerName = "Unknown Customer";
        this.carModel = "Unknown Model";
        this.rentalDays = 0;
    }

    // Parameterized Constructor
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    // Getters and Setters
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public int getRentalDays() {
        return rentalDays;
    }

    public void setRentalDays(int rentalDays) {
        this.rentalDays = rentalDays;
    }

    // Method to calculate total cost
    public double calculateTotalCost() {
        return rentalDays * DAILY_RENTAL_RATE;
    }

    // Method to display rental details
    public void displayRentalDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: $" + calculateTotalCost());
    }

    // Main method to test the CarRental class
    public static void main(String[] args) {
        // Using the default constructor
        CarRental defaultRental = new CarRental();
        System.out.println("Default Rental:");
        defaultRental.displayRentalDetails();

        // Using the parameterized constructor
        CarRental customRental = new CarRental("John Doe", "Toyota Camry", 5);
        System.out.println("\nCustom Rental:");
        customRental.displayRentalDetails();
    }
}