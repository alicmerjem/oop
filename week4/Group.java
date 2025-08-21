package week4;
import java.util.*;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "some type of string to be returned";
    }
}

public class Group {
    private ArrayList<Person> members;

    public Group() {
        members = new ArrayList<>();
    }

    public void addPerson(Person person) {
        members.add(person);
        System.out.println(person.getName());
    }

    public void listPeople() {
        if (members.isEmpty()) {
            System.out.println("the group is empty");
        } else {
            System.out.println("group members: ");

            for (Person p : members) {
                System.out.println(p);
            }
        }
    }

    public void removePerson(String name) {
        boolean removed = members.removeIf(p -> p.getName().equalsIgnoreCase(name));

        if (removed) {
            System.out.println("the person was removed from the group");
        } else {
            System.out.println("the person was not found in the group");
        }
    }
}
