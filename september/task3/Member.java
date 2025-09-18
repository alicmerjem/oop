package september.task3;
import java.util.*;

interface WorkoutTracker {
    void addWorkout(String date, String workoutType);
    Optional<List<String>> getWorkoutsByDate(String date);
}

interface SubscriptionManager {
    void renewSubscription(String newEndDate);
    Optional<String> getSubscriptionEndDate();
}

public class Member implements WorkoutTracker, SubscriptionManager {
    private String name;
    private Map<String, List<String>> workouts;
    private String subscriptionEndDate;

    public Member(String name) {
        this.name = name;
        this.workouts = new HashMap<>();
        this.subscriptionEndDate = null;
    }

    @Override
    public void addWorkout(String date, String workoutType) {
        if(!workouts.containsKey(date)) {
            workouts.put(date, new ArrayList<>());
        }
        workouts.get(date).add(workoutType);
    }

    @Override
    public Optional<List<String>> getWorkoutsByDate(String date) {
        if(workouts.containsKey(date)) {
            return Optional.of(workouts.get(date));
        } else {
            return Optional.empty();
        }
    }

    @Override
    public void renewSubscription(String newEndDate) {
        this.subscriptionEndDate = newEndDate;
    }

    @Override
    public Optional<String> getSubscriptionEndDate() {
        if(subscriptionEndDate == null) {
            return Optional.empty();
        } else {
            return Optional.of(subscriptionEndDate);
        }
    }
}
