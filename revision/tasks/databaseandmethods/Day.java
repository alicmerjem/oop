package revision.tasks.databaseandmethods;

enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY    
}

class DayDemo {
    public static boolean isWeekend(Day day) {
        return day == Day.SATURDAY || day == Day.SUNDAY;
    }

    public static void main(String[] args) {
        for(Day day : Day.values()) {
            System.out.println(day + " is weekend? " + isWeekend(day));
        }
    }
}