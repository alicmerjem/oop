package week11.presentation;
import java.util.*;

public class IteratorExample2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);

        Iterator<Integer> iterator = numbers.iterator();

        while(iterator.hasNext()) {
            int num = iterator.next();
            if(num % 20 == 0) {
                iterator.remove();
            }
        }
    }
}
