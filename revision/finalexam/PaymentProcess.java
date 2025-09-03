package revision.finalexam;

abstract class PaymentProcess {
    abstract void makePayment(double amount);    
}

class CreditCardPayment extends PaymentProcess {
    private double balance;
    private String processor;

    public CreditCardPayment(double balance, String processor) {
        this.balance = balance;
        this.processor = processor;
    }

    @Override
    public void makePayment(double amount) {
        balance += amount;
        System.out.println("payment of $ " + amount + " processed" + processor);
    }

    public double currentBalance() {
        return balance;
    }
}
