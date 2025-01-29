import java.util.ArrayList;
import java.util.List;

// Abstract class Product
abstract class Product {
    private int productId;
    private String name;
    private double price;

    // Constructor
    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    // Getters and Setters
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Abstract method to calculate discount
    public abstract double calculateDiscount();

    // Method to display product details
    public void displayDetails() {
        System.out.println("Product ID: " + productId + ", Name: " + name + ", Price: " + price);
    }
}

// Interface Taxable
interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

// Electronics class
class Electronics extends Product implements Taxable {
    private double discountRate;
    private double taxRate;

    public Electronics(int productId, String name, double price, double discountRate, double taxRate) {
        super(productId, name, price);
        this.discountRate = discountRate;
        this.taxRate = taxRate;
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * (discountRate / 100);
    }

    @Override
    public double calculateTax() {
        return getPrice() * (taxRate / 100);
    }

    @Override
    public String getTaxDetails() {
        return "Tax Rate: " + taxRate + "%";
    }
}

// Clothing class
class Clothing extends Product implements Taxable {
    private double discountAmount;
    private double taxRate;

    public Clothing(int productId, String name, double price, double discountAmount, double taxRate) {
        super(productId, name, price);
        this.discountAmount = discountAmount;
        this.taxRate = taxRate;
    }

    @Override
    public double calculateDiscount() {
        return discountAmount;
    }

    @Override
    public double calculateTax() {
        return getPrice() * (taxRate / 100);
    }

    @Override
    public String getTaxDetails() {
        return "Tax Rate: " + taxRate + "%";
    }
}

// Groceries class
class Groceries extends Product {
    private double discountRate;

    public Groceries(int productId, String name, double price, double discountRate) {
        super(productId, name, price);
        this.discountRate = discountRate;
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * (discountRate / 100);
    }
}

// Main class
public class ECommercePlatform {

    // Method to calculate and display final price
    public static void printFinalPrice(List<Product> products) {
        for (Product product : products) {
            product.displayDetails();
            double discount = product.calculateDiscount();
            double tax = 0;

            if (product instanceof Taxable) {
                tax = ((Taxable) product).calculateTax();
                System.out.println(((Taxable) product).getTaxDetails());
            }

            double finalPrice = product.getPrice() + tax - discount;
            System.out.println("Discount: " + discount);
            System.out.println("Tax: " + tax);
            System.out.println("Final Price: " + finalPrice);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        // Add Electronics
        products.add(new Electronics(101, "Laptop", 80000, 10, 18));

        // Add Clothing
        products.add(new Clothing(102, "Jacket", 3000, 500, 12));

        // Add Groceries
        products.add(new Groceries(103, "Apples", 200, 5));

        // Print final prices
        printFinalPrice(products);
    }
}
