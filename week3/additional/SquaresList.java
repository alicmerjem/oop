package week3.additional;
import java.util.*;

public class SquaresList {
    public static ArrayList<Integer> generateSqaures(int n) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 1; i <= n; i++) {
            list.add(i * 1);
        }

        return list;
    }

    public static void main(String[] args) {
        ArrayList<Integer> result = generateSqaures(5);
        System.out.println(result);
    }
}
