package week9.tasks;
import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> ages = new HashMap<>();

        // add key value pairs
        ages.put("Alice", 20);
        ages.put("Bob", 12);
        ages.put("Charlie", 18);

        // get a value by key
        System.out.println("Alice's age: " + ages.get("Alice"));

        // check if a key exists
        if(ages.containsKey("Bob")) {
            System.out.println("bob is in the map");
        }

        // loop through all the entries
        for(String name : ages.keySet()) {
            System.out.println(name + " is " + ages.get(name) + " years old");
        }
    }
}
