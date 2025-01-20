import java.util.ArrayList;

public class Cartitem {
    public String itemName; 
    public int price; 
    public int quantity;  
    private static ArrayList<Cartitem>cartItems=new ArrayList<>(); 


     Cartitem(String itemName,int price,int quantity) {
        this.itemName=itemName;
        this.price=price; 
        this.quantity=quantity;

     } 
     public static void addItemtoCart(Cartitem item){
        cartItems.add(item); 
        System.out.println("The item "+item.itemName+" is added to the cart");
     } 
     public static void removefromCart(String itemName){ 
        boolean itemAvilable=false; 
        for(int i=0;i<cartItems.size();i++){
            if(cartItems.get(i).itemName.equals(itemName)) 
            cartItems.remove(i); 
            System.out.println("Item Removed Sucsessfully"); 
            itemAvilable=true; 
            break;
        }
     
     if(!itemAvilable){
        System.out.println("Item not found in the List");
     }
    }
    public static int totalcostofCart(){
        int sum=0; 
        for(Cartitem item:cartItems){
            sum+=item.price*item.quantity;
        }
        return sum;

        }
        public static void main(String[] args) {
            Cartitem it=new Cartitem("Shirt",1000 ,1); 
            Cartitem i2=new Cartitem("Pant", 200, 2);
            // it.addItemtoCart("Pant");
            // it.addItemtoCart("Tie");
            // it.removefromCart("Pant"); 
            // it.totalcostofCart();

            //addItemtoCart("Tie");
            addItemtoCart(it); 
            addItemtoCart(i2); 
            removefromCart("Shirt");
            System.out.println("The total Cost of the Item is "+totalcostofCart());



        }

    }

/*
 * Problem Statement: Create a CartItem class with attributes itemName, price, and quantity. Add methods to:
Add an item to the cart.
Remove an item from the cart.
Display the total cost.
Explanation: The CartItem class models a shopping cart item. The methods handle cart operations like adding or removing items and calculating the total cost.

 */
