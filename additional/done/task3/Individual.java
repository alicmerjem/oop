package additional.done.task3;
import java.util.*;

interface PhysicalActivity {
    String exercise();
}

interface FinancialActivity {
    void manageExpense(String date, double amount);
}

public class Individual implements PhysicalActivity, FinancialActivity {
    private String name;
    private Map<String, List<Double>> expenses;

    public Individual(String name) {
        this.name = name;
        this.expenses = new HashMap<>();
    }

    public String getName() { return name; }
    
    @Override
    public String exercise() {
        return "exercising";
    }

    @Override
    public void manageExpense(String date, double amount) {
        expenses.putIfAbsent(date, new ArrayList<>());
        expenses.get(date).add(amount);
    }

    // get total expenses for a given date
    public Optional<Double> getTotalExpense(String date) {
        List<Double> dailyExpenses = expenses.get(date);

        if (dailyExpenses == null || dailyExpenses.isEmpty()) {
            return Optional.empty();
        }

        double total = 0;

        for(Double expense : dailyExpenses) {
            total += expense;
        }
        return Optional.of(total);
    }
}
