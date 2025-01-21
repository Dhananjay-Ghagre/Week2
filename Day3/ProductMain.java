// Create a class Product with the following private attributes:
class Product {
    static double discount;
    final int productID;
    String productName;
    double price;
    int quantity;
    // Create a constructor to initialize the attributes of the Product class.
    public Product(int id, String name, double cost, int quantity) {
        this.productID = id;
        this.productName = name;
        this.price = cost;
        this.quantity = quantity;
    }
    // Create a static method updateDiscount to update the discount value.
    public static void updateDiscount(double discount) {
        Product.discount = discount;
    }
    // Create a method calculatePrice to calculate the price of the product.
    public double calculatePrice() {
        return price * quantity * (1 - discount / 100);
    }
    // Create a static method isProduct which returns true if the object is an instance of the Product class.
    public static boolean isProduct(Product product) {
        return product instanceof Product;
    }
    // Create a method toString to display the product details.
    public String toString() {
        return "Product ID: " + productID + "\nProduct Name: " + productName + "\nPrice: " + price + "\nQuantity: " + quantity;
    }
    
    
}

public class ProductMain {
    public static void main(String[] args) {
        Product.updateDiscount(10);
        Product product1 = new Product(1, "Laptop", 50000, 2);
        Product product2 = new Product(2, "Mobile", 20000, 3);
        System.out.println(product1.calculatePrice());
        System.out.println(product2.calculatePrice());
        System.out.println(Product.isProduct(product1));
        System.out.println(Product.isProduct(product2));
        System.out.println(product1);
        System.out.println(product2);
        }
}