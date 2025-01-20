import java.util.Scanner;

class Item{
    private
    int noOfItem;
    String itemName;
    int price;

    public
    void displayDetails(int noOfItem,String itemName, int price){
        System.out.println("The name of the item is " + itemName);
        System.out.println("Total quantity of item is " + noOfItem);
        System.out.println("The price per item is " + price);
    }

    public
    void calculateCost(int noOfItem,String itemName, int price){
        System.out.println("The total cost of item " + itemName+"is"+noOfItem*price);
    }

    Item(int noOfItem,String itemName, int price){
        this.noOfItem = noOfItem;
        this.itemName = itemName;
        this.price = price;

        displayDetails(noOfItem, itemName, price);
        calculateCost(noOfItem, itemName, price);
    }
}
public class TrackInventory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
        String itemName = sc.nextLine();
        int noOfItem = sc.nextInt();
        int price = sc.nextInt();

        Item item1 = new Item(noOfItem, itemName, price);
    }
}
