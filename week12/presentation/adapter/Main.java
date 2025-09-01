package week12.presentation.adapter;

interface PaymentProcessor {
    void pay(double amount);    
}

// existing paypal implementation
class PayPalPayment implements PaymentProcessor {
    @Override
    public void pay(double amount) {
        System.out.println("paid " + amount + " using paypal");
    }
}

// a third party stripe class, incompatible interface
class StripeAPI {
    public void makePayment(int cents) {
        System.out.println("paid" + (cents / 100.0) + " using Stripe");
    }
}


// adapter that makes stripe compatible
class StripeAdapter implements PaymentProcessor {
    private StripeAPI stripe;

    public StripeAdapter(StripeAPI stripe) {
        this.stripe = stripe;
    }

    @Override
    public void pay(double amount) {
        // stripe accepts cents (integer), so we adapt
        int cents = (int) (amount * 100);
        stripe.makePayment(cents);
    }
}

// client code
class Main {
    public static void main(String[] args) {
        // Using PayPal directly
        PaymentProcessor paypal = new PayPalPayment();
        paypal.pay(50.0);

        // Using Stripe through the adapter
        StripeAPI stripe = new StripeAPI();
        PaymentProcessor stripeAdapter = new StripeAdapter(stripe);
        stripeAdapter.pay(75.5);
    }
}