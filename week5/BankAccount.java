package week5;

public class BankAccount {
    private String accountNumber;
    private String ownerName;
    private double balance;

    public BankAccount(String accountNumber, String ownerName, double balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("insufficient funds");
        }
    }

    @Override
    public String toString() {
        return "some string to be returned";
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, String ownerName, double balance, double interestRate) {
        super(accountNumber, ownerName, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void applyInterest() {
        // Using reflection of parent balance (no setter) – we can hack via deposit
        deposit(getBalance() * interestRate);
    }

    @Override
    public String toString() {
        return "SavingsAccount [Account Number: " + getAccountNumber() + ", Owner: " + getOwnerName() +
               ", Balance: " + getBalance() + ", Interest Rate: " + interestRate + "]";
    }
}

class CheckingAccount extends BankAccount {
    private double overdraftLimit;

    public CheckingAccount(String accountNumber, String ownerName, double balance, double overdraftLimit) {
        super(accountNumber, ownerName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && getBalance() - amount >= -overdraftLimit) {
            deposit(-amount); // reduce balance
        } else {
            System.out.println("Overdraft limit exceeded!");
        }
    }

    @Override
    public String toString() {
        return "CheckingAccount [Account Number: " + getAccountNumber() + ", Owner: " + getOwnerName() +
               ", Balance: " + getBalance() + ", Overdraft Limit: " + overdraftLimit + "]";
    }
}

