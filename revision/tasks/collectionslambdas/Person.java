package revision.tasks.collectionslambdas;

public record Person(String name, int age, int height) {
    public static Person createAnonymus() {
        return new Person("Anonymus", 0, 0);
    }
}

class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Alice", 30, 160);
        Person p2 = Person.createAnonymus();

        System.out.println(p1);
        System.out.println(p2);
    }
}
