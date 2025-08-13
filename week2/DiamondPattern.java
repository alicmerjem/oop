package week2;

public class DiamondPattern {
    public static void main(String[] args) {
        printDiamond(5);
    }

    public static void printDiamond(int n) {
        if (n % 2 == 0) {
            System.out.println("Please enter an odd number");
            return;
        }

        int mid = n / 2;

        // top half
        for (int i = 0; i <= mid; i++) {
            int spaces = mid - i;
            int stars = 2 * i + 1;

            for (int s = 0; s < spaces; s++) {
                System.out.println(" ");
            }

            for (int st = 0; st < stars; st++) {
                System.out.println("*");
            }

            System.out.println();
        }
        
        // bottom half
        for (int i = mid - 1; i >= 0; i--) {
            int spaces = mid - i;
            int stars = 2 * i + 1;

            for (int s = 0; s < spaces; s++) {
                System.out.println(" ");
            }

            for (int st = 0; st < stars; st++) {
                System.out.println("*");
            }

            System.out.println();
        }
    }
}
