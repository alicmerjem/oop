package revision.tasks.databaseandmethods;

public class OverloadDemo {
    public static void printDetails(String name) {
        System.out.println("hi, my name is " + name);
    }

    public static void printDetails(String name, int age) {
        System.out.println("hi, my name is " + name + " and i am " + age + " years old.");
    }

    public static void printDetails(String name, int age, String city) {
        System.out.println("hi, my name is " + name + " and i am " + age + " years old. I live in " + city);
    }

    public static void main(String[] args) {
        printDetails("alice");
        printDetails("bob", 20);
        printDetails("charlie", 10, "new york");
    }
}
