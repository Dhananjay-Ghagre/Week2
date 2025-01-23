 class Bank { 
    public void openAccount(customer c){
    // open class is a method which is taking the object of the customer class as an argument
        System.out.println("Welcome "+c.getname()+" to Fedral Bank");
    }

    
}
class customer{// customer class is created
    private String name; 
   private int balance; 
    customer(String name,int balance){
        this.name=name; 
        this.balance=balance;
    }
    public void showBalance(){// showBalance method is created
        System.out.println("The name of the customer is "+this.name+" and the balance is "+this.balance);
    } 
    public  String getname(){// getname method is created
        return name;// getname method is created
    }


}
public class BankaccountHolder{// BankaccountHolder class is created
    public static void main(String[] args) { 
        customer c=new customer("Nishant", 10000); 
        Bank b=new Bank();// object of the Bank class is created
        b.openAccount(c); // openAccount method is called
        c.showBalance();// showBalance method is called

        
    }
}
