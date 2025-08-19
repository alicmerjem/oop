package week3;

enum OrderStatus {
    PENDING, SHIPPED, DELIVERED, CANCELLED;
}

public class OrderManager {
    public static void printStatusMessage(OrderStatus status) {
        switch (status) {
            case PENDING -> System.out.println("Your order is pending.");
            case SHIPPED -> System.out.println("Your order has been shipped.");
            case DELIVERED -> System.out.println("Your order was delivered. Enjoy!");
            case CANCELLED -> System.out.println("Your order was cancelled.");
        }
    }

    public static void main(String[] args) {
        printStatusMessage(OrderStatus.SHIPPED);
    }
}
