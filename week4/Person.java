package week4;

public class Person {
    private String name;
    private int age;

    public Person(String name) {
        this.name = name;
        this.age = 0;
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

    public void increaseAge() {
        this.age++;
    }

    public boolean isAdult() {
        return age >= 18;
    }

    @Override
    public String toString() {
        return "some string goes here";
    }

    public static void main(String[] args) {
        Person p1 = new Person("Alice");
        Person p2 = new Person("Bob");

        System.out.println(p1);
        System.out.println(p2);

        p1.setAge(21);
        p2.setAge(22);

        System.out.println("age of person 1: " + p1.getAge());
        System.out.println("age of person 2: " + p2.getAge());

        p1.increaseAge();
        p2.increaseAge();
        System.out.println("after bdays: " + p1 + p2);
    }
}

