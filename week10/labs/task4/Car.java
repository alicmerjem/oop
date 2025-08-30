package week10.labs.task4;

public class Car {
    private final String model;
    private int year;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public void start() {
        System.out.println("car is starting...");
    }

    public void drive(String destination) {
        System.out.println("driving to " + destination);
    }

    public void honk() {
        System.out.println("beep beep");
    }

    public static void info() {
        System.out.println("getting static info about cars.");
    }
}
