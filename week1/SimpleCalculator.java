import java.util.*;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double result = 0;

        System.out.println("Simple calculator. Type quit to exit.");

        while(true) {
            System.out.println("Current result: " + result);

            System.out.println("Enter operation: ");
            String input = scanner.nextLine();

            if(input.equalsIgnoreCase("quit")) {
                System.out.println("Exiting. Final result: " + result);
                break;
            }

            char operator = input.charAt(0);
            double number = Double.parseDouble(input.substring(1));

            if(operator == '+') {
                result += number;
            } else if (operator == '-') {
                result -= number;
            } else {
                System.out.println("Invalid input");
            }
        }

        scanner.close();
    }
}