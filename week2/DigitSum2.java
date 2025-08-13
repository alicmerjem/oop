package week2;
import java.util.*;

public class DigitSum2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter a number");
        int number = scanner.nextInt();

        int result;

        if (number == 0) {
            result = 0;
        } else {
            result = 1 + ((number - 1) % 9);
        }

        System.out.println("Single digit result " + result);

        scanner.close();
    }
}
