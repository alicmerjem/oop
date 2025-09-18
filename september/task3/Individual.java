package september.task3;
import java.util.*;

interface PhyisicalActivity {
    String exercise();
}

interface FinancialActivity {
    void manageExpense(String date, double amount);
}

class Individual implements PhyisicalActivity, FinancialActivity {
    private String name;
    private HashMap<String, List<Double>> expenses;

    public Individual(String name) {
        this.name = name;
        this.expenses = expenses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String exercise() {
        return "exercising";
    }

    @Override
    public void manageExpense(String date, double amount) {
        if(!expenses.containsKey(date)) {
            expenses.put(date, new ArrayList<>());
        }
        expenses.get(date).add(amount);
    }

    public Optional<Double> getTotalExpense(String date) {
        if(expenses.containsKey(date)) {
            double total = 0;

            for(Double val : expenses.get(date)) {
                total += val;
            }
            return Optional.of(total);
        } else {
            return Optional.empty();
        }
    }
}


