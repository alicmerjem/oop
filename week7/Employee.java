package week7;

import java.util.ArrayList;

abstract class Employee {
    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public abstract double calculateBonus();
    
    public String getDetails() {
        return "name: " + name + " salary: " + salary;
    }
}

interface Reportable {
    String generateReport();
}

class Developer extends Employee implements Reportable {
    private String programmingLanguage;

    public Developer(String name, double salary, String programmingLanguage) {
        super(name, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public double calculateBonus() {
        return salary * 0.2;
    }

    @Override
    public String generateReport() {
        return getDetails() + ", Role: Developer, Language: " + programmingLanguage + 
        ", Bonus: " + calculateBonus();        
    }
}

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
        return getDetails() + ", Role: Manager, Team Size: " + teamSize +
               ", Bonus: " + calculateBonus();
    }
}

class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Developer("Alice", 5000, "Java"));
        employees.add(new Manager("Bob", 7000, 5));

        for (Employee emp : employees) {
            if (emp instanceof Reportable) {
                Reportable r = (Reportable) emp;
                r.generateReport();
            }
            emp.calculateBonus();
        }
    }
}