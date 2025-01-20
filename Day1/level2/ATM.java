public class ATM {
    String accountHolder;//instance variable
    private int accountNuber; 
    private int balance; 
    ATM(String accountHolder,int accountNumber,int balance){//constructor
        this.accountHolder = accountHolder;
        this.accountNuber = accountNuber;
        this.balance = balance;
    } 
    public void depositeMoney(int Money){//instance method
        balance+=Money;
        System.out.println("The amount"+Money+"is deposited to the account");
    } 
    public void WithdrawMoney(int Money){//instance method
        if(balance<0||balance<Money){
            System.out.println("Insufficient Balance");
        } 
        else{
            balance-=Money;
            System.out.println("The amount "+Money+" is withdrawn from the account");
        }
    } 
    public void ShowBalance(){//instance method
        System.out.println("The total Balance in the account is : "+balance);
    }
    public static void main(String[] args) {//main method
        ATM at=new ATM("Nishant", 46725, 1000);
        at.depositeMoney(2000); 
        at.WithdrawMoney(200);
        at.ShowBalance();
       // System.out.println("The total amount is the bank is +"at.ShowBalance());

    }

    

    
}
