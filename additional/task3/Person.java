package additional.task3;
import java.util.*;

interface CreativeHobby {
    String hobby();
}

interface BudgetTracker {
    void trackExpense(String category, double amount);
}

public class Person implements CreativeHobby, BudgetTracker {
    private String name;
    private Map<String, List<Double>> expenses; 

    public Person(String name) {
        this.name = name;
        this.expenses = new HashMap<>();
    }

    @Override
    public String hobby() {
        return "practicing hobby";
    }

    @Override
    public void trackExpense(String category, double amount) {
        expenses.putIfAbsent(category, new ArrayList<>());
        expenses.get(category).add(amount);
    }

    public Optional<Double> getTotalExpense(String category) {
        if(!expenses.containsKey(category) || expenses.get(category).isEmpty()) {
            return Optional.empty();
        }

        double total = 0;

        for(Double amount : expenses.get(category)) {
            total += amount;
        }
        return Optional.of(total);
    }

    public String getName() {
        return name;
    }
}
