package week7.additional;

interface Drivable {
    void drive();
}

class Car implements Drivable {
    public void drive() {
        System.out.println("car is driving");
    }
}

class Truck implements Drivable {
    public void drive() {
        System.out.println("truck is driving");
    }
}

class Main {
    public static void main(String[] args) {
        Drivable vehicle1 = new Car();
        Drivable vehicle2 = new Truck();

        vehicle1.drive();
        vehicle2.drive();
    }
}