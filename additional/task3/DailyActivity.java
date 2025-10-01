package additional.task3;
import java.util.*;

interface DailyActivity {
    String performActivity(String activity);
}

interface SavingsAccount {
    void saveMoney(double amount);
}

class Person implements DailyActivity, SavingsAccount{
    private String name;
    private List<Double> savings;
    private List<String> activities;

    public Person(String name) {
        this.name = name;
        this.savings = new ArrayList<>();
        this.activities = new ArrayList<>();
    }

    @Override
    public String performActivity(String activity) {
        activities.add(activity);
        return "performed" + activity;
    }

    @Override
    public void saveMoney(double amount) {
        savings.add(amount);
    }

    // get total savings
    public Optional<Double> getTotalSavings() {
        if(savings.isEmpty()) {
            return Optional.empty();
        }

        double total = 0;

        for(double amount : savings) {
            total += amount;
        }

        return Optional.of(total);
    }

    public String getName() {
        return name;
    }
}
