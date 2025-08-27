package week9.tasks;
import java.util.Optional;

public class OptionalExample2 {
    public static void main(String[] args) {
        Integer age = getUserAge();

        Optional<Integer> optionalAge = Optional.ofNullable(age);
        optionalAge.ifPresentOrElse(
            a -> System.out.println("User is " + a + " years old"),
            () -> System.out.println("Age not provided")
        );        
    }

        public static Integer getUserAge() {
        // Simulate a null value
        return null;
    }
}
