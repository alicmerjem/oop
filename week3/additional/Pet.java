package week3.additional;

public class Pet {
    public static void describePet(String name) {
        System.out.println("My pet's name is " + name);
    }

    public static void describePet(String name, String type) {
        System.out.println("My pet's name is " + name + " and it is a " + type);
    }

    public static void describePet(String name, String type, int age) {
        System.out.println("My pet's name is " + name + ", it is a " + type + " and it is " + age + " years old.");
    }

    public static void main(String[] args) {
        describePet("Buddy");
        describePet("Whiskers", "Cat");
        describePet("Rex", "Dog", 5);
    }
}

