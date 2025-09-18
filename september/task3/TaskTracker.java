package september.task3;
import java.util.*;

public class TaskTracker {
    private Map<String, List<String>> tasks = new HashMap<>();

    // add a new task to the given date
    public void addTask(String date, String task) {
        if(!tasks.containsKey(date)) {
            tasks.put(date, new ArrayList<>());
        }
        tasks.get(date).add(task);
    }

    // get all tasks for a given date
    public Optional<List<String>> getTasks(String date) {
        if(tasks.containsKey(date)) {
            return Optional.of(tasks.get(date));
        } else {
            return Optional.empty();
        }
    }
}
