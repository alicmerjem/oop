package revision.tasks.databaseandmethods;

public class Utility {
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
        printMessage("hello java");

        int result = multiply(6, 7);
        System.out.println(result);

        int number = 10;
        System.out.println(isEven(number));
    }
}
