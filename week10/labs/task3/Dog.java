package week10.labs.task3;

public class Dog {
    private final String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void bark() {
        System.out.println("bark");
    }

    public void say(String message) {
        System.out.println("Dog says " + message);
    }

    private void whisper() {
        System.out.println("secret bark");
    }

    public static void info() {
        System.out.println("static info about dogs");
    }
}
