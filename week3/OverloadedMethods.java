package week3;

public class OverloadedMethods {
    public static void printDetails(String name) {
        System.out.println("Hi, my name is " + name);
    }

    public static void printDetails(String name, int age) {
        System.out.println("Hi, my name is " + name + " and I am " + age + " years old");
    }

    public static void printDetails(String name, int age, String city) {
        System.out.println("Hi, my name is " + name + " and I am " + age + " years old. I live in" + city);
    }

    public static void main(String[] args) {
        printDetails("Alice");
        printDetails("Bob", 20);
        printDetails("Charlie", 22, "Sarajevo");
    }
}
