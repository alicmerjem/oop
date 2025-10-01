package additional.task2;
import java.util.*;

enum Role {
    ASSISTANT, PROFESSOR
}

enum ProjectType {
    RESEARCH, DEVELOPMENT, SUPPORT
}

public class Employee {
    private String name;
    private int age;
    private Role role;

    public Employee(String name, int age, Role role) {
        this.name = name;
        this.age = age;
        this.role = role;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public Role getRole() { return role; }

    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setRole(Role role) { this.role = role; }

    public String getDescription() {
        return "Employee: " + name + ", " + age + ", " + role;
    }
}

class Assistant extends Employee {
    private String assignedTask;

    public Assistant(String name, int age, Role role, String assignedTask) {
        super(name, age, role);
        this.assignedTask = assignedTask;
    }

    public String getAssignedTask() {
        return assignedTask;
    }

    public void setAssignedTask(String assignedTask) {
        this.assignedTask = assignedTask;
    }

    @Override
    public String getDescription() {
        return "Assistant: " + getName() + ", " + getAge() + ", " + getRole() + ", " + getAssignedTask();
    }
}

class Professor extends Employee {
    private ProjectType currentProject;

    public Professor(String name, int age, Role role) {
        super(name, age, role);
        this.currentProject = null; // default
    }

    public ProjectType getCurrentProject() {
        return currentProject;
    }

    public void setCurrentProject(ProjectType currentProject) {
        this.currentProject = currentProject;
    }

    @Override
    public String getDescription() {
        return "Professor: " + getName() + ", " + getAge() + ", " + getRole() +
               ", Project: " + currentProject;
    }
}

class Company<T extends Employee> {
    private List<T> employees;

    public Company(List<T> employees) {
        this.employees = employees;
    }

    public List<T> getEmployees() {
        return employees;
    }

    public void setEmployees(List<T> employees) {
        this.employees = employees;
    }

    // filter by role
    public Optional<List<T>> filterByRole(Role role) {
        List<T> filtered = new ArrayList<>();
        
        for(T employee : employees) {
            if(employee.getRole() == role) {
                filtered.add(employee);
            }
        }

        if(filtered.isEmpty()) {
            return Optional.empty();
        } else {
            return Optional.of(filtered);
        }
    }

    // get by name
    public Optional<List<T>> getByName(String name) {
        List<T> filtered = new ArrayList<>();
        for (T e : employees) {
            if (e.getName().equalsIgnoreCase(name)) {
                filtered.add(e);
            }
        }
        return filtered.isEmpty() ? Optional.empty() : Optional.of(filtered);
    }

    // assign projects / tasks
    public void assignProjects() {
        for(T employee : employees) {
            if(employee instanceof Assistant) {
                Assistant a = (Assistant) employee;
                a.setAssignedTask("support");
            } else if(employee instanceof Professor) {
                Professor p = (Professor) employee;
                p.setCurrentProject(ProjectType.RESEARCH);
            }
        } 
    }
}

