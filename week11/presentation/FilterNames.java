package week11.presentation;
import java.util.*;

public class FilterNames {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("alice");
        names.add("bob");
        names.add("charlie");
        names.add("diana");
        names.add("tom");

        Iterator<String> iterator = names.iterator();

        while(iterator.hasNext()) {
            String name = iterator.next();

            while(name.length() < 5) {
                iterator.remove();
            }
        }
    }
}
