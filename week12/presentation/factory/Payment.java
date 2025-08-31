package week12.presentation.factory;

interface Payment {
    void pay(int amount);
}

class CreditCardPayment implements Payment {
    public void pay(int amount) {
        System.out.println("paid " + amount + "with credit card.");
    }
}

class PayPalPayment implements Payment {
    public void pay(int amount) {
        System.out.println("paid " + amount + " with paypal.");
    }
}

class PaymentFactory {
    public Payment getPayment(String type) {
        if(type.equalsIgnoreCase("creditcard")) {
            return new CreditCardPayment();
        } else if(type.equalsIgnoreCase("paypal")) {
            return new PayPalPayment();
        }
        return null;
    }
}

class Main {
    public static void main(String[] args) {
        PaymentFactory factory = new PaymentFactory();

        Payment p1 = factory.getPayment("creditcard");
        p1.pay(100);

        Payment p2 = factory.getPayment("paypal");
        p2.pay(80);
    }
}