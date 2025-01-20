



public class PalindromeChecker {//class
    String text; //instance variable
    PalindromeChecker(String text){//constructor
        this.text=text;
    }
   static boolean isPalindromeorNot(String value){//static method
        String reverse="";
        for(int i=value.length()-1;i>=0;i--){//for loop
            reverse+=value.charAt(i);
        }
        return reverse.equals(value);//return statement

    } 
    public static void main(String[] args) {//main method
        PalindromeChecker pp=new PalindromeChecker("MADAM"); //object creation
        boolean value=isPalindromeorNot("MADAM"); //method calling
        if(value){
            System.out.println("String is Palindrome");
        }
        else{
            System.out.println("String is not Palindrome");//output
        }
    }
    
}
