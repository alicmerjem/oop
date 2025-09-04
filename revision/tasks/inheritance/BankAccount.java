package revision.tasks.inheritance;

// Base BankAccount class
class BankAccount {
    private String accountNumber;
    private String ownerName;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, String ownerName, double balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    // Getters
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public double getBalance() {
        return balance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited. New balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn. New balance: " + balance);
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }

    @Override
    public String toString() {
        return "BankAccount [Account Number: " + accountNumber + ", Owner: " + ownerName + ", Balance: " + balance + "]";
    }
}

// SavingsAccount class
class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, String ownerName, double balance, double interestRate) {
        super(accountNumber, ownerName, balance);
        this.interestRate = interestRate;
    }

    public void applyInterest() {
        double interest = getBalance() * interestRate;
        deposit(interest);
        System.out.println("Interest applied: " + interest);
    }

    @Override
    public String toString() {
        return "SavingsAccount [Account Number: " + getAccountNumber() +
               ", Owner: " + getOwnerName() +
               ", Balance: " + getBalance() +
               ", Interest Rate: " + interestRate + "]";
    }
}

// CheckingAccount class
class CheckingAccount extends BankAccount {
    private double overdraftLimit;

    public CheckingAccount(String accountNumber, String ownerName, double balance, double overdraftLimit) {
        super(accountNumber, ownerName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && getBalance() - amount >= -overdraftLimit) {
            // Allow withdrawal within overdraft limit
            double newBalance = getBalance() - amount;
            // Using reflection to update private balance (simpler approach is via protected or setter, but keeping balance private)
            try {
                java.lang.reflect.Field field = BankAccount.class.getDeclaredField("balance");
                field.setAccessible(true);
                field.set(this, newBalance);
                System.out.println(amount + " withdrawn. New balance: " + newBalance);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Withdrawal denied. Overdraft limit exceeded or invalid amount.");
        }
    }

    @Override
    public String toString() {
        return "CheckingAccount [Account Number: " + getAccountNumber() +
               ", Owner: " + getOwnerName() +
               ", Balance: " + getBalance() +
               ", Overdraft Limit: " + overdraftLimit + "]";
    }
}
