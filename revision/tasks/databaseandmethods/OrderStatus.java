package revision.tasks.databaseandmethods;

enum OrderStatus {
    PENDING, SHIPPED, DELIVERED, CANCELLED
}

class OrderDemo {
    public static void printStatusMessage(OrderStatus status) {
        switch (status) {
            case PENDING:
                System.out.println("your order is pending. please wait for confirmation");
                break;
            
            case SHIPPED:
                System.out.println("your order has been shipped. track your package");
                break;

            case DELIVERED:
                System.out.println("your order has been delivered. enjoy");
                break;
            
            case CANCELLED:
                System.out.println("your order has been cancelled. contact customer support for more information.");
                break;
        }
    }

    public static void main(String[] args) {
        for(OrderStatus status : OrderStatus.values()) {
            System.out.println(status);
            printStatusMessage(status);
        }
    }
}