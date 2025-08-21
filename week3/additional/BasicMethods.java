package week3.additional;

public class BasicMethods {
    public static int square(int n) {
        return n * n;
    }

    public static boolean isOdd(int num) {
        return num % 2 != 0;
    }

    public static void greet(String name) {
        System.out.println("Hello " + name);
    }

    public static void main(String[] args) {
        System.out.println(square(5));
        System.out.println(isOdd(7));
        greet("Alice");
    }
}
