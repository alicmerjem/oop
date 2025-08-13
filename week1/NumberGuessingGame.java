import java.util.*;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int numberToGuess = random.nextInt(100) + 1;
        int userGuess = 0;

        System.out.println("Guess the number between 1 and 100");

        // loop until the user guesses correctly
        while(userGuess != numberToGuess) {
            System.out.println("Enter your guess: ");
            userGuess = scanner.nextInt();

            if (userGuess < numberToGuess) {
                System.out.println("too low");
            } else if (userGuess > numberToGuess) {
                System.out.println("too high");
            } else {
                System.out.println("you guessed right");
            }
        }

        scanner.close();
    }
}
