package week11.presentation;

public class UncheckedExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int result = a / b; // throws ArithmeticExcpetion
        System.out.println(result);
    }
}
