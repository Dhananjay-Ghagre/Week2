import java.util.ArrayList;
import java.util.List;

// Abstract class FoodItem
abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    // Constructor
    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters and Setters
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Abstract method to calculate total price
    public abstract double calculateTotalPrice();

    // Concrete method to get item details
    public void getItemDetails() {
        System.out.println("Item Name: " + itemName + ", Price: " + price + ", Quantity: " + quantity);
    }
}

// Interface Discountable
interface Discountable {
    void applyDiscount(double discountRate);

    double getDiscountDetails();
}

// VegItem class
class VegItem extends FoodItem implements Discountable {
    private double discount;

    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity() - discount;
    }

    @Override
    public void applyDiscount(double discountRate) {
        discount = (getPrice() * getQuantity()) * discountRate / 100;
    }

    @Override
    public double getDiscountDetails() {
        return discount;
    }
}

// NonVegItem class
class NonVegItem extends FoodItem implements Discountable {
    private double discount;
    private static final double NON_VEG_EXTRA_CHARGE = 50.0; // Fixed additional charge for non-veg items

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return (getPrice() * getQuantity() + NON_VEG_EXTRA_CHARGE) - discount;
    }

    @Override
    public void applyDiscount(double discountRate) {
        discount = (getPrice() * getQuantity() + NON_VEG_EXTRA_CHARGE) * discountRate / 100;
    }

    @Override
    public double getDiscountDetails() {
        return discount;
    }
}

// Main class
public class FoodDeliverySystem {

    // Method to process food items
    public static void processOrder(List<FoodItem> order) {
        for (FoodItem item : order) {
            item.getItemDetails();

            if (item instanceof Discountable) {
                Discountable discountable = (Discountable) item;
                discountable.applyDiscount(10.0); // Apply a 10% discount
                System.out.println("Discount Applied: " + discountable.getDiscountDetails());
            }

            System.out.println("Total Price: " + item.calculateTotalPrice());
            System.out.println();
        }
    }

    public static void main(String[] args) {
        List<FoodItem> order = new ArrayList<>();

        // Add VegItem to the order
        order.add(new VegItem("Paneer Butter Masala", 200.0, 2));

        // Add NonVegItem to the order
        order.add(new NonVegItem("Chicken Biryani", 300.0, 1));

        // Process the order
        processOrder(order);
    }
}
