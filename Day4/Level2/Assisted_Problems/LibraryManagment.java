
import java.util.ArrayList;

class Book{
    private String title; 
   private  String author; 
    Book(String title,String authtor){
        this.author=authtor; 
        this.title=title;
    } 
    public String gettitle(){
        return title;
    }
    public String getauthor(){
        return author;
    }


}
class Library{
    private String name; 
    private ArrayList<Book>books; 
    Library(String name){
        this.name=name; 
        this.books=new ArrayList<>();
    } 
    public void addBook(Book book){
        books.add(book);
    } 
    public void showbookDetail(){
        System.out.println("The name of the Library is "+name);
        if(books.isEmpty()){
            System.out.println("The Library is Empty");
        } 
        else{
            for(Book book:books){
                System.out.println("The name of the book is "+book.gettitle());
                System.out.println("The detail of the book is "+book.getauthor()+ " ");
            }
        }
    }
}
public class LibraryManagment{ 
    public static void main(String[] args) {
        
    
    Book b1=new Book("Introduction to Java", "James Gosling"); 
    Book b2=new Book("The almanack of naval Ravikant", "Eric Jorgenson");
    Library l1=new Library("Wisdom"); 
    l1.addBook(b1); 
    l1.addBook(b2);
    l1.showbookDetail();
    }




}

/*
 * Description: Create a Library class that contains multiple Book objects. Model the relationship such that a library can have many books, but a book can exist independently (outside of a specific library).
Tasks:
Define a Library class with an ArrayList of Book objects.
Define a Book class with attributes such as title and author.
Demonstrate the aggregation relationship by creating books and adding them to different libraries.
Goal: Understand aggregation by modeling a real-world relationship where the Library aggregates Book objects.

 */