package revision.tasks.abstraction;
import java.util.*;

abstract class Employee {
    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public abstract double calculateBonus(); // Abstract method

    public String getDetails() { // Concrete method
        return "Name: " + name + ", Salary: " + salary;
    }
}

// Interface
interface Reportable {
    String generateReport();
}

// Developer class
class Developer extends Employee implements Reportable {
    private String programmingLanguage;

    public Developer(String name, double salary, String programmingLanguage) {
        super(name, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public double calculateBonus() {
        return salary * 0.2; // 20% bonus
    }

    @Override
    public String generateReport() {
        return getDetails() + ", Role: Developer, Language: " + programmingLanguage
                + ", Bonus: " + calculateBonus();
    }
}

// Manager class
class Manager extends Employee implements Reportable {
    private int teamSize;

    public Manager(String name, double salary, int teamSize) {
        super(name, salary);
        this.teamSize = teamSize;
    }

    @Override
    public double calculateBonus() {
        return salary * 0.3; // 30% bonus
    }

    @Override
    public String generateReport() {
        return getDetails() + ", Role: Manager, Team Size: " + teamSize
                + ", Bonus: " + calculateBonus();
    }
}

class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Developer("Alice", 5000, "Java"));
        employees.add(new Manager("Bob", 8000, 5));

        for (Employee e : employees) {
            System.out.println(((Reportable) e).generateReport());
            System.out.println("Calculated Bonus: " + e.calculateBonus());
            System.out.println(); // spacing
        }
    }    
}
