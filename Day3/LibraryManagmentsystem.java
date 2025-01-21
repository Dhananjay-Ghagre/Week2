public class LibraryManagmentsystem {
    private static String libraryName; 
    private static String title; 
    private static String author; 
     final int isbn;

    public LibraryManagmentsystem(String libraryName,String title,String author,int isbn) {
        this.libraryName=libraryName; 
        this.title=title;
        this.author=author; 
        this.isbn=isbn;
    }
    public  void displayDetail(){
        if(this instanceof LibraryManagmentsystem){

        System.out.println("The libraryName is "+libraryName);
        System.out.println("The title of the Book is "+title);
        System.out.println("THe author of the book is "+author);
        System.out.println("The isbn of the Book is "+isbn);

    }



    

    
}
public static void main(String[] args) {
    LibraryManagmentsystem ls=new LibraryManagmentsystem("TIT Library","Java","James Gosling",1234);
    LibraryManagmentsystem ls2=new LibraryManagmentsystem("LNCT", "C++", "Bjarne Strstraup", 2345);
    ls.displayDetail();
    ls2.displayDetail();
    
}
}
/*
 * Create a Book class to manage library books with the following features:
Static:
A static variable libraryName shared across all books.
A static method displayLibraryName() to print the library name.
This:
Use this to initialize title, author, and isbn in the constructor.
Final:
Use a final variable isbn to ensure the unique identifier of a book cannot be changed.
Instanceof:
Verify if an object is an instance of the Book class before displaying its details.

 *
 */
