package week9.tasks;
import java.util.*;

public class FruitStore {
    public static void main(String[] args) {
        HashMap<String, Integer> fruitPrices = new HashMap<>();

        // add the k v pairs
        fruitPrices.put("apple", 2);
        fruitPrices.put("banana", 1);
        fruitPrices.put("orange", 3);

        // print all fruit names
        Set<String> fruitNames = fruitPrices.keySet();
        System.out.println(fruitNames);

        // print the price of bananay
        System.out.println("price of a bananay:" + fruitPrices.get("banana"));

        // check if pear exists
        if(fruitPrices.containsKey("pear")) {
            System.out.println("found");
        } else {
            System.out.println("not found");
        }
    }
}
