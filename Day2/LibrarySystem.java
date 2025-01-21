 class Book {
    // Attributes
    public String ISBN;           // Public: Accessible everywhere
    protected String title;       // Protected: Accessible within the package and by subclasses
    private String author;        // Private: Accessible only within this class

    // Constructor
    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Method to set the author name
    public void setAuthor(String author) {
        this.author = author;
    }

    // Method to get the author name
    public String getAuthor() {
        return author;
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

// Subclass: EBook
class EBook extends Book {
    private double fileSize; // File size in MB

    // Constructor
    public EBook(String ISBN, String title, String author, double fileSize) {
        super(ISBN, title, author); // Call the constructor of the parent class
        this.fileSize = fileSize;
    }

    // Method to display ebook details
    public void displayEBookDetails() {
        // Accessing public and protected attributes of the parent class
        System.out.println("E-Book Details:");
        System.out.println("ISBN: " + ISBN);          // Public attribute
        System.out.println("Title: " + title);        // Protected attribute
        System.out.println("File Size: " + fileSize + " MB");
        System.out.println("Author (via getter): " + getAuthor()); // Private accessed via method
    }
}

// Main class to demonstrate the system
public class LibrarySystem {
    public static void main(String[] args) {
        // Creating a Book object
        Book physicalBook = new Book("978-0451524935", "1984", "George Orwell");
        System.out.println("Physical Book Details:");
        physicalBook.displayDetails();

        // Creating an EBook object
        EBook ebook = new EBook("978-0061120084", "To Kill a Mockingbird", "Harper Lee", 1.5);
        System.out.println("\nEBook Details:");
        ebook.displayEBookDetails();

        // Demonstrating access modifiers
        System.out.println("\nAccess Modifiers Demonstration:");
        System.out.println("Accessing ISBN directly (public): " + ebook.ISBN);
        // System.out.println("Accessing title directly (protected): " + ebook.title); // Accessible only within subclass or same package
        // System.out.println("Accessing author directly (private): " + ebook.author); // Not accessible directly
    }
}
