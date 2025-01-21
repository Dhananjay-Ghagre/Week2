public class Book2 {
    // Attributes
    private String title;
    private String author;
    private double price;

    // Default Constructor
    public Book2() {
        this.title = "Unknown Title";
        this.author = "Unknown Author";
        this.price = 0.0;
    }

    // Parameterized Constructor
    public Book2(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }

    // Main method to test the Book class
    public static void main(String[] args) {
        // Using the default constructor
        Book2 defaultBook = new Book2();
        System.out.println("Default Book:");
        defaultBook.displayBookDetails();

        // Using the parameterized constructor
        Book2 customBook = new Book2("1984", "George Orwell", 9.99);
        System.out.println("\nCustom Book:");
        customBook.displayBookDetails();
    }
}
