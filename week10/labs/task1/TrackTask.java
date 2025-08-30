package week10.labs.task1;
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)

public @interface TrackTask {
    String assignedTo();
    int priority() default 1;
}
