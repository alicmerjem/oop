package revision.tasks.metaprogramming;
import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface VeryImportant {}

record Lion(String name) {}

class Main {
    public static void main(String[] args) {
        Lion lion = new Lion("Lav");

        if(lion.getClass().isAnnotationPresent(VeryImportant.class)) {
            System.out.println("lion class is marked as very important");
        } else {
            System.out.println("lion class is not marked important");
        }
    }
}
