package week3.additional;

enum Month {
    JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC
}

public class MonthCheck {
    public static boolean isSummer(Month m) {
        return (m == Month.JUN || m == Month.JUL || m == Month.AUG);
    }

    public static void main(String[] args) {
        System.out.println("Is july summer? " + isSummer(Month.JUL));
        System.out.println("Is December summer? " + isSummer(Month.DEC));
    }
}
