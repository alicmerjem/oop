import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Ask the user for a score
        System.out.print("Enter your score: ");
        int score = scanner.nextInt();

        // Step 2: Determine grade based on score
        if (score >= 90 && score <= 100) {
            System.out.println("Grade: A");
        } else if (score >= 80 && score <= 89) {
            System.out.println("Grade: B");
        } else if (score >= 70 && score <= 79) {
            System.out.println("Grade: C");
        } else if (score >= 60 && score <= 69) {
            System.out.println("Grade: D");
        } else if (score < 60 && score >= 0) {
            System.out.println("Grade: F");
        } else {
            System.out.println("Invalid score. Please enter a number between 0 and 100.");
        }

        scanner.close();
    }
}
