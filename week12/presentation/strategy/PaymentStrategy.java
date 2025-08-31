package week12.presentation.strategy;

interface PaymentStrategy {
    void pay(int amount);
}

class CreditCardPayment implements PaymentStrategy {
    public void pay(int amount) {
        System.out.println("paid" + amount + " with a credit card");
    }
}

class PayPalPayment implements PaymentStrategy {
    public void pay(int amount) {
        System.out.println("paid " + amount + " with paypal");
    }
}

class ShoppingCart {
    private PaymentStrategy payment;

    public ShoppingCart(PaymentStrategy payment) {
        this.payment = payment;
    }

    public void checkout(int amount) {
        payment.pay(amount);
    }
}

class Main {
    public static void main(String[] args) {
        ShoppingCart c1 = new ShoppingCart(new CreditCardPayment());
        c1.checkout(200);

        ShoppingCart c2 = new ShoppingCart(new PayPalPayment());
        c2.checkout(200);
    }
}