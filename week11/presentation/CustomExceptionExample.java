package week11.presentation;

// Custom Exception
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

// Main Class
public class CustomExceptionExample {
    public static void main(String[] args) {
        try {
            registerUser(16);
        } catch (InvalidAgeException e) {
            System.out.println("Registration failed: " + e.getMessage());
        }

        try {
            registerUser(21);
        } catch (InvalidAgeException e) {
            System.out.println("Registration failed: " + e.getMessage());
        }
    }

    public static void registerUser(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be at least 18!");
        }
        System.out.println("User registered successfully.");
    }
}

