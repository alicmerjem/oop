package week9.labs;

public record Person(String name, int age, int heigth) {
    public static Person createAnonymus() {
        return new Person("Anonymus", 0, 0);
    }
}

class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Alice", 26, 170);
        Person p2 = new Person("Bob", 30, 180);
        Person p3 = Person.createAnonymus();

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}