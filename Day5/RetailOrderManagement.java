// Base class Order
class Order {
    // Attributes of the Order class
    String orderId;
    String orderDate;

    // Constructor to initialize Order attributes
    public Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    // Method to get the order status (to be overridden in subclasses)
    public String getOrderStatus() {
        return "Order placed on " + orderDate;
    }
}

// Subclass ShippedOrder inherits from Order
class ShippedOrder extends Order {
    // Additional attribute for ShippedOrder class
    String trackingNumber;

    // Constructor to initialize ShippedOrder attributes and call the superclass constructor
    public ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        // Call the superclass (Order) constructor
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    // Override the getOrderStatus() method to return shipped status
    @Override
    public String getOrderStatus() {
        return "Order shipped on " + orderDate + ". Tracking number: " + trackingNumber;
    }
}

// Subclass DeliveredOrder inherits from ShippedOrder
class DeliveredOrder extends ShippedOrder {
    // Additional attribute for DeliveredOrder class
    String deliveryDate;

    // Constructor to initialize DeliveredOrder attributes and call the superclass constructor
    public DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
        // Call the superclass (ShippedOrder) constructor
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    // Override the getOrderStatus() method to return delivered status
    @Override
    public String getOrderStatus() {
        return "Order delivered on " + deliveryDate + ". Tracking number: " + trackingNumber;
    }
}

// Main class to test the order management hierarchy
public class RetailOrderManagement {
    public static void main(String[] args) {
        // Creating an Order object
        Order order = new Order("ORD123", "2025-01-20");
        
        // Creating a ShippedOrder object
        ShippedOrder shippedOrder = new ShippedOrder("ORD124", "2025-01-21", "TRACK123");
        
        // Creating a DeliveredOrder object
        DeliveredOrder deliveredOrder = new DeliveredOrder("ORD125", "2025-01-22", "TRACK124", "2025-01-23");
        
        // Displaying the status of all orders
        System.out.println("Order Status: " + order.getOrderStatus());
        System.out.println("Shipped Order Status: " + shippedOrder.getOrderStatus());
        System.out.println("Delivered Order Status: " + deliveredOrder.getOrderStatus());
    }
}
