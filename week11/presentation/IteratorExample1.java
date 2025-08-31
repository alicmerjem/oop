package week11.presentation;
import java.util.*;

public class IteratorExample1 {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");

        Iterator<String> iterator = fruits.iterator();

        while(iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println(fruit);
        }
    }
}
