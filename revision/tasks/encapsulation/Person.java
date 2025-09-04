package revision.tasks.encapsulation;

public class Person {
    private String name;
    private int age;

    public Person(String name) {
        this.name = name;
        this.age = 0;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public int getAge() { return age ;}

    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }

    public void increaseAge() {
        age++;
    }
    
    public boolean isAdult() {
        return age >= 18;
    }

    @Override
    public String toString() {
        return "some string to be returned";
    }
}
