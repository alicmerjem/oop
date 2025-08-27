package week9.tasks;
import java.util.Optional;

public class OptionalExample1 {
    public static void main(String[] args) {
        String userName = getUserName(); // might return null

        Optional<String> optionalName = Optional.ofNullable(userName);
        String nameToPrint = optionalName.orElse("Anonymous");

        System.out.println("User: " + nameToPrint);
    }

    public static String getUserName() {
        // Simulate a null value
        return null;
    }
}

