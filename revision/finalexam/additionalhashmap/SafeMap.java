package revision.finalexam.additionalhashmap;
import java.util.*;

public class SafeMap {
    public static void main(String[] args) {
        HashMap<String, Integer> scores = new HashMap<>();

        scores.put("alice", 90);

        String name = "charlie";

        if(scores.containsKey(name)) {
            System.out.println(scores.get(name));
        } else {
            System.out.println("no scores recorder for " + name);
        }
    }
}
