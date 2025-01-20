import java.util.Scanner;

class Book{

    private
    String title;
    String author;
    int price;

    Book(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
        display();
    }

    void display(){
        System.out.println(title);
        System.out.println(author);
        System.out.println(price);
    }  
}



public class BookMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();
        String author = sc.nextLine();
        int price = sc.nextInt();

        Book obj1 = new Book(title, author, price);
    }
}
