import java.util.ArrayList;
import java.util.List;

// Abstract class LibraryItem
abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;

    // Constructor
    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    // Getters and Setters
    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

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

    // Abstract method for loan duration
    public abstract int getLoanDuration();

    // Concrete method to display item details
    public void getItemDetails() {
        System.out.println("Item ID: " + itemId + ", Title: " + title + ", Author: " + author);
    }
}

// Interface Reservable
interface Reservable {
    void reserveItem(String borrowerName);

    boolean checkAvailability();
}

// Book class
class Book extends LibraryItem implements Reservable {
    private boolean isAvailable = true;

    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 14; // Loan duration of 14 days for books
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Book reserved for: " + borrowerName);
        } else {
            System.out.println("Book is not available for reservation.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }
}

// Magazine class
class Magazine extends LibraryItem {
    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 7; // Loan duration of 7 days for magazines
    }
}

// DVD class
class DVD extends LibraryItem implements Reservable {
    private boolean isAvailable = true;

    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 3; // Loan duration of 3 days for DVDs
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("DVD reserved for: " + borrowerName);
        } else {
            System.out.println("DVD is not available for reservation.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }
}

// Main class
public class LibraryManagementSystem {

    // Method to process library items
    public static void processLibraryItems(List<LibraryItem> items) {
        for (LibraryItem item : items) {
            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");

            // Check if the item is reservable
            if (item instanceof Reservable) {
                Reservable reservableItem = (Reservable) item;
                System.out.println("Available: " + reservableItem.checkAvailability());
                reservableItem.reserveItem("John Doe");
                System.out.println("Available after reservation: " + reservableItem.checkAvailability());
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        List<LibraryItem> items = new ArrayList<>();

        // Add a Book
        items.add(new Book("B101", "The Great Gatsby", "F. Scott Fitzgerald"));

        // Add a Magazine
        items.add(new Magazine("M202", "National Geographic", "Various"));

        // Add a DVD
        items.add(new DVD("D303", "Inception", "Christopher Nolan"));

        // Process library items
        processLibraryItems(items);
    }
}
