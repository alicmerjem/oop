package revision.finalexam.additionalhashmap;
import java.util.*;

public class DefaultMap {
    public static void main(String[] args) {
        HashMap<String, Integer> scores = new HashMap<>();

        scores.put("alice", 90);

        // if key not found, return default (which is 0 in this case)
        System.out.println(scores.getOrDefault("Alice", 0));
        System.out.println(scores.getOrDefault("charlie", 0));
    }
}
