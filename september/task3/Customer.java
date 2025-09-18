package september.task3;
import java.util.*;

interface Depositable {
    void deposit(String date, double amount);
    Optional<Double> getTotalDeposits(String date);
}

interface Withdrawable {
    void withdraw(String date, double amount);
    Optional<Double> getTotalWithdrawals(String date);
}

class Customer implements Depositable, Withdrawable {
    private String name;
    private Map<String, List<Double>> deposits;
    private Map<String, List<Double>> withdrawals;

    public Customer(String name) {
        this.name = name;
        this.deposits = new HashMap<>();
        this.withdrawals = new HashMap<>();
    }

    @Override 
    public void deposit(String date, double amount) {}

    @Override
    public Optional<Double> getTotalDeposits(String date) {
        if(deposits.containsKey(date)) {
            double total = 0;
            for(double val : deposits.get(date)) {
                total += val;
            }
            return Optional.of(total);
        }
        return Optional.empty();
    }

    @Override
    public void withdraw(String date, double amount) {
        if(withdrawals.containsKey(date)) {
            withdrawals.put(date, new ArrayList<>());
        }
        withdrawals.get(date).add(amount);
    }

    @Override
    public Optional<Double> getTotalWithdrawals(String date) {
        if(withdrawals.containsKey(date)) {
            double total = 0;

            for(double val : withdrawals.get(date)) {
                total += val;
            }
            return Optional.of(total);
        }
        return Optional.empty();
    }
}
