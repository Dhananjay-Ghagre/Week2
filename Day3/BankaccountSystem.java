class BankaccountSystem{
   public static  String bankName="Bank of America"; 
  final int accountNumber; 
   private String accountHolderName;  
   private static int totalNumberofAccount=0;
   BankaccountSystem(String bankName, int accountNumber, String accountHolderName){
      this.accountNumber=accountNumber;
      this.accountHolderName=accountHolderName;
        totalNumberofAccount++;

   }
   public int gettotalnumberofAccount(){
    return totalNumberofAccount;
   }
    public void displayAccountDetails(){
        if(this instanceof BankaccountSystem){
            System.out.println("Bank Name: "+bankName);
            System.out.println("Account Number: "+accountNumber);
            System.out.println("Account Holder Name: "+accountHolderName);
        }
    }
    public static void main(String[] args) {
        BankaccountSystem account1 = new BankaccountSystem("Bank of America", 123456, "Arun Yadav");
        BankaccountSystem account2 = new BankaccountSystem("Bank of America", 123457, "Mishra Pan Bhandar");
        BankaccountSystem account3 = new BankaccountSystem("Bank of America", 123458, "Nischal Kausal");
        System.out.println("Total number of accounts: "+account1.gettotalnumberofAccount());
        account1.displayAccountDetails();
        account2.displayAccountDetails();
        account3.displayAccountDetails();
    }
   
}