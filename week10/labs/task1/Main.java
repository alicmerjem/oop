package week10.labs.task1;
import java.lang.reflect.*;

public class Main {
    public static void main(String[] args) {
        ProjectTask tasks = new ProjectTask();

        // Get all methods of ProjectTasks
        Method[] methods = ProjectTask.class.getDeclaredMethods();

        for (Method method : methods) {
            if (method.isAnnotationPresent(TrackTask.class)) {
                TrackTask annotation = method.getAnnotation(TrackTask.class);

                // Convert numeric priority to word
                String priorityWord;
                switch (annotation.priority()) {
                    case 2: priorityWord = "Medium"; break;
                    case 3: priorityWord = "High"; break;
                    default: priorityWord = "Low";
                }

                System.out.println("Method: " + method.getName());
                System.out.println("Assigned to: " + annotation.assignedTo());
                System.out.println("Priority: " + priorityWord);
                System.out.println("---------------------------");
            }
        }
    }
}
