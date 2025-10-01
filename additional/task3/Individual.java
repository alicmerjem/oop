package additional.task3;
import java.util.*;

interface PhysicalActivity {
    String exercise();
}

interface FinancialActivity {
    void manageExpense(String date, double amount);
}

public class Individual implements PhysicalActivity, FinancialActivity {
    private String name;
    private HashMap<String, List<Double>> expenses;

    public Individual(String name) {
        this.name = name;
        this.expenses = new HashMap<>();
    }

    @Override
    public String exercise() {
        return "exercising";
    }

    @Override
    public void manageExpense(String date, double amount) {
        expenses.putIfAbsent(date, new ArrayList<>());
        expenses.get(date).add(amount);
    }

    public Optional<Double> getTotalExpense(String date) {
        if(!expenses.containsKey(date) || expenses.get(date).isEmpty()) {
            return Optional.empty();
        }

        double total = 0;

        for(Double amount : expenses.get(date)) {
            total += amount;
        }

        return Optional.of(total);
    }

    public String getName() {
        return name;
    }
}
