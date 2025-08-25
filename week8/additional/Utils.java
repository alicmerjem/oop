package week8.additional;

public class Utils {
    public static <T> void printArray(T[] array) {
        for(T element : array) {
            System.out.println(element);
        }
    }
}
