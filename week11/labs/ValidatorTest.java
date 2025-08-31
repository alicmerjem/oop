package week11.labs;

// Custom exception
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

// Validator class
class Validator {
    public void validateAge(int age) throws InvalidAgeException {
        if (age < 0) {
            throw new InvalidAgeException("Age cannot be negative!");
        }
        System.out.println("Age is valid: " + age);
    }
}

// Main
public class ValidatorTest {
    public static void main(String[] args) {
        Validator validator = new Validator();
        
        try {
            validator.validateAge(25); // valid
            validator.validateAge(-5); // invalid
        } catch (InvalidAgeException e) {
            System.out.println("Validation error: " + e.getMessage());
        }
    }
}
