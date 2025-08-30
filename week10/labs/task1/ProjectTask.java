package week10.labs.task1;

public class ProjectTask {
    @TrackTask(assignedTo = "Bob", priority = 3)
    public void optimizeMemory() {
        System.out.println("optimizing memory usage");
    }    

    @TrackTask(assignedTo = "Alice", priority = 3)
    public void fixCriticalBug() {
        System.out.println("fixing a critical bug");
    }

    @TrackTask(assignedTo = "Charlie") 
    public void documentCode() {
        System.out.println("documenting code");
    }
}
