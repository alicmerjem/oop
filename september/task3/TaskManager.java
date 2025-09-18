package september.task3;
import java.util.*;

interface TaskManager {
    void addTask(String date, String task);
    Optional<List<String>> getTasks(String date);
}

class TaskTracker implements TaskManager {
    private Map<String, List<String>> tasks = new HashMap<>();

    @Override
    public void addTask(String date, String task) {
        if(!tasks.containsKey(date)) {
            tasks.put(date, new ArrayList<>());
        }
        tasks.get(date).add(task);
    }

    @Override
    public Optional<List<String>> getTasks(String date) {
        if(tasks.containsKey(date)) {
            return Optional.of(tasks.get(date));
        } else {
            return Optional.empty();
        }
    }
}
