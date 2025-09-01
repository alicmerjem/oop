package week12.presentation.adapter;

// Target interface - what your application expects
interface PaymentProcessor {
    void pay(int amount);
}

// Adaptee - an existing old system
class OldPaymentProcessor {
    public void payAmount(int amount) {
        System.out.println("Paying " + amount + " using OldPaymentProcessor.");
    }
}

// New system that you want to integrate
class NewPaymentProcessor {
    public void processPayment(double amountInDollars) {
        System.out.println("Processing payment of $" + amountInDollars + " with NewPaymentProcessor.");
    }
}

// Adapter class - makes NewPaymentProcessor compatible with PaymentProcessor
class PaymentAdapter implements PaymentProcessor {
    private NewPaymentProcessor newProcessor;

    public PaymentAdapter(NewPaymentProcessor newProcessor) {
        this.newProcessor = newProcessor;
    }

    @Override
    public void pay(int amount) {
        // Convert int to double if necessary
        double amountInDollars = amount;
        newProcessor.processPayment(amountInDollars);
    }
}