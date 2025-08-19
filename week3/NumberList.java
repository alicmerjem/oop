package week3;
import java.util.*;

public class NumberList {
    public static ArrayList<Integer> processList(ArrayList<Integer> numbers) {

        Collections.sort(numbers);

        numbers.removeIf(n -> n % 2 == 0); 

        return numbers;
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(5);
        nums.add(4);
        nums.add(3);
        nums.add(2);
        nums.add(1);
        System.out.println(processList(nums));
    }
}
