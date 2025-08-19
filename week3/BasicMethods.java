package week3;

public class BasicMethods {
    public static void printMessage(String message) {
        System.out.println(message);
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static void main(String[] args) {
        printMessage("Hello");
        System.out.println(multiply(3, 4));
        System.out.println(isEven(5));
    }
}
