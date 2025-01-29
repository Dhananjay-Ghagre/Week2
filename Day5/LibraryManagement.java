// Superclass Book
class Book {
    // Attributes of the Book class
    String title;
    int publicationYear;

    // Constructor to initialize Book attributes
    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    // Method to display Book information (to be overridden in subclass)
    public void displayInfo() {
        System.out.println("Book Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
    }
}

// Subclass Author inherits from Book
class Author extends Book {
    // Additional attributes for Author class
    String name;
    String bio;

    // Constructor to initialize Author attributes and call the superclass constructor
    public Author(String title, int publicationYear, String name, String bio) {
        // Call the superclass (Book) constructor
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }

    // Override the displayInfo() method to display both Book and Author information
    @Override
    public void displayInfo() {
        // Call the superclass method to display book details
        super.displayInfo();
        // Display author-specific details
        System.out.println("Author Name: " + name);
        System.out.println("Author Bio: " + bio);
    }
}

// Main class to test the Book and Author system
public class LibraryManagement {
    public static void main(String[] args) {
        // Creating an Author object, which is also a Book
        Author author = new Author("To Kill a Mockingbird", 1960, "Harper Lee", "American novelist best known for To Kill a Mockingbird.");
        
        // Displaying information about the book and its author
        author.displayInfo();
    }
}

