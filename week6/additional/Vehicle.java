package week6.additional;
import java.util.*;

public class Vehicle {
    protected String brand;
    protected int year;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public void start() {
        System.out.println("the vehicle starts");
    }
}

class Car extends Vehicle {
    public Car(String brand, int year) {
        super(brand, year);
    }

    @Override
    public void start() {
        System.out.println("the car strats with a roar");
    }

    public void openTrunk() {
        System.out.println("the trunk is open");
    }
}

class Motorcycle extends Vehicle {
    public Motorcycle(String brand, int year) {
        super(brand, year);
    }

    @Override
    public void start() {
        System.out.println("the motorcycle roars to life");
    }

    public void popWheelie() {
        System.out.println("popping a wheelie");
    }
}

class Truck extends Vehicle {
    public Truck(String brand, int year) {
        super(brand, year);
    }

    @Override
    public void start() {
        System.out.println("the truck rumbles as it starts");
    }

    public void loadCargo() {
        System.out.println("loading cargo...");
    }
}

class Main {
    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Car("Toyota", 2020));
        vehicles.add(new Car("BMW", 2022));

        vehicles.add(new Motorcycle("Harley", 2018));
        vehicles.add(new Motorcycle("Ducati", 2021));

        vehicles.add(new Truck("Volvo", 2019));
        vehicles.add(new Truck("Mercedes", 2023));  
        
        for (Vehicle v : vehicles) {
            v.start();

            if (v instanceof Car) {
                Car c = (Car) v;
                c.openTrunk();
            } else if (v instanceof Motorcycle) {
                Motorcycle mc = (Motorcycle) v;
                mc.popWheelie();
            } else if (v instanceof Truck) {
                Truck t = (Truck) v;
                t.loadCargo();
            }

            System.out.println();
        }
    }
}