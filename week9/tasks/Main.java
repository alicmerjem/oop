package week9.tasks;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);

        int index1 = Collections.binarySearch(numbers, 30); // index found
        int index2 = Collections.binarySearch(numbers, 25); // not found, negative value

        System.out.println(index1);
        System.out.println(index2);
    }
}
