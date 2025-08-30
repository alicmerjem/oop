package week10.labs.task2;
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD) 

@interface ReportBug {
    String reportedBy();
    int severity() default 1;
}
