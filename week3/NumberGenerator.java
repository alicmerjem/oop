package week3;
import java.util.*;

public class NumberGenerator {
    public static ArrayList<Integer> generateNumbers(int n) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 1; i <= n; i++) {
            list.add(i);
        }

        return list;
    }

    public static void main(String[] args) {
        System.out.println(generateNumbers(10));
    }
}
