package additional.done.task2;
import java.util.*;

enum Gender {
    MALE, FEMALE
}

public class Person {
    private String firstName;
    private int age;
    private Gender gender;

    public Person(String firstName, int age, Gender gender) {
        this.firstName = firstName;
        this.age = age;
        this.gender = gender;
    } 

    public String getFirstName() { return firstName; }
    public int getAge() { return age; }
    public Gender getGender() { return gender; }

    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setAge(int age) { this.age = age; }
    public void setGender(Gender gender) { this.gender = gender; }

    @Override
    public String toString() {
        return "Person [firstName=" + firstName + ", age=" + age + ", gender=" + gender + "]";
    }
}

class Assistant extends Person {
    public Assistant(String firstName, int age, Gender gender) {
        super(firstName, age, gender);
    }
}

class Professor extends Person {
    public Professor(String firstName, int age, Gender gender) {
        super(firstName, age, gender);
    }
}

class Company<T extends Person> {
    private List<T> employees;

    public Company(List<T> employees) {
        this.employees = employees;
    }

    public List<T> getEmployees() { return employees; }
    public void setEmployees(List<T> employees) { this.employees = employees; }

    // filter by gender
    public Optional<List<T>> filterByGender(Gender gender) {
        List<T> result = new ArrayList<>();

        for(T e : employees) {
            if(e.getGender() == gender) {
                result.add(e);
            }
        }

        if(result.isEmpty()) {
            return Optional.empty();
        } else {
            return Optional.of(result);
        }
    }

    // get employees by first name
    public Optional<List<T>> getByFirstName(String firstName) {
        List<T> result = new ArrayList<>();

        for(T e : employees) {
            if(e.getFirstName().equalsIgnoreCase(firstName)) {
                result.add(e);
            }
        }

        if(result.isEmpty()) {
            return Optional.empty();
        } else {
            return Optional.of(result);
        }
    }
}
