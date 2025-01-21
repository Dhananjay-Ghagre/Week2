public class HotelBooking {
    // Attributes
    private String guestName;
    private String roomType;
    private int nights;

    // Default Constructor
    public HotelBooking() {
        this.guestName = "Unknown Guest";
        this.roomType = "Standard";
        this.nights = 1;
    }

    // Parameterized Constructor
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copy Constructor
    public HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }

    // Getters and Setters
    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getNights() {
        return nights;
    }

    public void setNights(int nights) {
        this.nights = nights;
    }

    // Method to display booking details
    public void displayBookingDetails() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
    }

    // Main method to test the HotelBooking class
    public static void main(String[] args) {
        // Using the default constructor
        HotelBooking defaultBooking = new HotelBooking();
        System.out.println("Default Booking:");
        defaultBooking.displayBookingDetails();

        // Using the parameterized constructor
        HotelBooking customBooking = new HotelBooking("John Doe", "Deluxe", 3);
        System.out.println("\nCustom Booking:");
        customBooking.displayBookingDetails();

        // Using the copy constructor
        HotelBooking copiedBooking = new HotelBooking(customBooking);
        System.out.println("\nCopied Booking:");
        copiedBooking.displayBookingDetails();
    }
}
