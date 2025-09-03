package revision.finalexam.additionalhashmap;
import java.util.*;

public class SimpleMap {
    public static void main(String[] args) {
        HashMap<String, Integer> scores = new HashMap<>();

        // put some values inside
        scores.put("Alice", 90);
        scores.put("Bob", 75);

        // get the values back
        System.out.println(scores.get("Alice"));
        System.out.println(scores.get("Bob"));

        // if key does not exist, return null
        System.out.println(scores.get("charlie"));
    }
}
