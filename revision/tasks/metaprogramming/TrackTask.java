package revision.tasks.metaprogramming;
import java.lang.annotation.*;
import java.lang.reflect.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)

public @interface TrackTask {
    String assignedTo();
    int priority() default 1;
}

class ProjectTask {
    @TrackTask(assignedTo = "bob", priority = 2) 
    public void optimizeMemory() {
        System.out.println("optimizing memory...");
    }

    @TrackTask(assignedTo = "alice", priority = 3)
    public void fixCriticalBug() {
        System.out.println("fixing a critical bug");
    }

    @TrackTask(assignedTo = "charlie") 
    public void documentCode() {
        System.out.println("documenting code");
    }
} 

class Main {
    public static void main(String[] args) {
        ProjectTask tasks = new ProjectTask();
        Method[] methods = tasks.getClass().getDeclaredMethods();


        for(Method method : methods) {
            if(method.isAnnotationPresent(TrackTask.class)); // ovdje treba {}, ne ;   ali me mrzi da mijenjam
            TrackTask annotation = method.getAnnotation(TrackTask.class);
            String assignedTo = annotation.assignedTo();
            int priority = annotation.priority();

            String priorityStr = switch (priority) {
                case 3 -> "HIGH";
                case 2 -> "MEDIUM";
                default -> "LOW";
            };

            System.out.println("method: " + method.getName());
            System.out.println("assigned to: " + assignedTo);
            System.out.println("priority: " + priorityStr);
            System.out.println();

            if (priority == 3 && 
                !(method.getName().toLowerCase().contains("critical") ||
                    method.getName().toLowerCase().contains("important"))) {
                        System.out.println("warning: method " + method.getName() + " has high priority but is not labeled as critical or important");
                        System.out.println();
                    }
        }
    }
}