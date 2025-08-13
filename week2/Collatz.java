package week2;

public class Collatz {
    public static void main(String[] args) {
        collatz(6);
    }

    public static void collatz(int n) {
        // keep going until n becomes one
        while (n != 1) {
            System.out.println(n); // print the current number
        }

        if (n % 2 == 0) {
            n = n / 2;
        } else {
            n = 3 * n + 1;
        }

        System.out.println(n);
    }
}
