package week3;

enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
}

public class DayCheck {
    public static boolean isWeekend(Day day) {
        return day == Day.SATURDAY || day == Day.SUNDAY;
    }

    public static void main(String[] args) {
        System.out.println("Is Sunday a weekend? " + isWeekend(Day.SUNDAY));
    }
}
