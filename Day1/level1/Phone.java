import java.util.Scanner;

class MobilePhone{
    private
    String brand;
    int model;
    int price;

    MobilePhone(String brand, int model, int price){
        this.brand = brand;
        this.model = model;
        this.price = price;

        display( brand,  model,  price);
    }


    public
    void display(String brand, int model, int price){
        System.out.println("The brand of mobile phone is " + brand);
        System.out.println("The model of phone is " + model);
        System.out.println("Price of the phone is " + price);
    }

}

public class Phone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String brand = sc.nextLine();
        int model = sc.nextInt();
        int price = sc.nextInt();

        MobilePhone phone1 = new MobilePhone(brand, model, price);
    }
}
