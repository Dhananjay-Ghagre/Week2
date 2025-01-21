public class Product {
    // Instance Variables
    private String productName;
    private double price;

    // Class Variable
    private static int totalProducts = 0;

    // Constructor
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++; // Increment totalProducts whenever a new product is created
    }

    // Instance Method: Display product details
    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: $" + price);
    }

    // Class Method: Display total products
    public static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }

    // Main Method to test the Product class
    public static void main(String[] args) {
        // Creating products
        Product product1 = new Product("Laptop", 999.99);
        Product product2 = new Product("Smartphone", 499.99);
        Product product3 = new Product("Headphones", 199.99);

        // Displaying product details
        System.out.println("Product 1 Details:");
        product1.displayProductDetails();

        System.out.println("\nProduct 2 Details:");
        product2.displayProductDetails();

        System.out.println("\nProduct 3 Details:");
        product3.displayProductDetails();

        // Displaying total products created
        System.out.println("\nTotal Products:");
        Product.displayTotalProducts();
    }
}
