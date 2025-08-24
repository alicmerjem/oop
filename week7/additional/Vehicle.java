package week7.additional;

interface Vehicle {
    void start();
}

class Car implements Vehicle {
    public void start() {
        System.out.println("a ca is starting with a roar");
    }
}

class Motorcycle implements Vehicle {
    public void start() {
        System.out.println("motorcycle roars to life");
    }
}

class Main {
    public static void testDrive(Vehicle v) {
        v.start();
    }

    public static void main(String[] args) {
        Car car = new Car();
        Motorcycle moto = new Motorcycle();

        testDrive(car);
        testDrive(moto);
    }
}