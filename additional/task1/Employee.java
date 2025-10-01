package additional.task1;
import java.util.*;

interface Workable {
    void work();
}

public abstract class Employee implements Workable {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }
}

class Manager extends Employee {
    private int teamSize;

    public Manager(String name, int teamSize) {
        super(name);
        this.teamSize = teamSize;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    @Override
    public void work() {
        System.out.println("managing team");
    }
}

class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String name, String programmingLanguage) {
        super(name);
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void work() {
        System.out.println("writing code");
    }
}

class DepartmentManager {
    public List<Workable> assignWork(List<Workable> employees) {
        for(Workable employee : employees) {
            if(employee instanceof Manager) {
                Manager manager = (Manager) employee;
                manager.setTeamSize(10);
            } else if(employee instanceof Developer) {
                Developer dev = (Developer) employee;
                dev.setProgrammingLanguage("java");
            }
            employee.work();
        }
        return employees;
    }

    // bonus: print details
    public void printAllDetails(List<Workable> employees) {
        for(Workable employee : employees) {
            if(employee instanceof Manager) {
                Manager manager = (Manager) employee;
                System.out.println("Manager: " + manager.getName() + ", team size: " + manager.getTeamSize());
            } else if (employee instanceof Developer) {
                Developer dev = (Developer) employee;
                System.out.println("Developer: " + dev.getName() + ", programming language: " + dev.getProgrammingLanguage());
            }
        }
    }
}