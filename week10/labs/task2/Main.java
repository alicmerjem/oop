package week10.labs.task2;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        BugReports reports = new BugReports();

        for(Method method : reports.getClass().getDeclaredMethods()) {
            if(method.isAnnotationPresent(ReportBug.class)) {
                ReportBug annotation = method.getAnnotation(ReportBug.class);

                String severityText = switch(annotation.severity()) {
                    case 1 -> "low";
                    case 2 -> "medium";
                    case 3 -> "high";
                    default -> "unknown";
                };
            }
        }
    }
}
