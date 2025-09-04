package revision.tasks.designpatterns;

public interface PaymentStrategy {
    void pay(int amount);
}

class CreditCardPayment implements PaymentStrategy {
    public void pay(int amount) {
        System.out.println("paid " + amount + " using credit card");
    }
}

class PayPalPayment implements PaymentStrategy {
    public void pay(int amount) {
        System.out.println("paid " + amount + " using paypal");
    }
}

class ShoppingCart {
    private PaymentStrategy strategy;

    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void checkout(int amount) {
        if(strategy == null) {
            System.out.println("please select a payment method");
        } else {
            strategy.pay(amount);
        }
    }
}

class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.setPaymentStrategy(new CreditCardPayment());
        cart.checkout(200);

        cart.setPaymentStrategy(new PayPalPayment());
        cart.checkout(50);
    }
}