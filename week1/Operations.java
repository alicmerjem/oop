import java.util.*;

public class Operations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first integer: ");
        int num1 = scanner.nextInt();

        System.out.println("Enter the second integer: ");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        double quotient = 0;

        if (num2 != 0) {
            quotient = (double) num1 / num2;
        } else {
            System.out.println("Cannot divide by zero");
        }

        System.out.println("Sum" + sum);
        System.out.println("Difference" + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);

        scanner.close();
    }
}
