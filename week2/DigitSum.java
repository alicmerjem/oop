package week2;
import java.util.*;

public class DigitSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        // continue while the numbr has only one digit
        while (number >= 10) {
            int sum = 0;
            int temp = number;

            while (temp > 0) {
                sum += temp % 10; // get the last digit
                temp /= 10; // remove the last digit
            }

            number = sum;
        }

        System.out.println("Single digit result: " + number);

        scanner.close();
    }
}
