package additional.task1;
import java.util.*;

interface Startable {
    void start();
}

public abstract class Vehicle implements Startable {
    
}

class Car extends Vehicle {
    private int numberOfDoors;

    public Car(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void start() {
        System.out.println("starting car");
    }
}

class Motorbike extends Vehicle {
    private boolean hasSideCar;

    public Motorbike(boolean hasSideCar) {
        this.hasSideCar = hasSideCar;
    }

    public boolean getHasSideCar() {
        return hasSideCar;
    }

    public void setHasSideCar(boolean hasSideCar) {
        this.hasSideCar = hasSideCar;
    }

    @Override
    public void start() {
        System.out.println("starting motorbike");
    }
}

class VehicleManager {
    public List<Startable> startAll(List<Startable> vehicles) {
        for(Startable vehicle : vehicles) {
            if (vehicle instanceof Car) {
                Car car = (Car) vehicle;
                car.setNumberOfDoors(4);
            } else if(vehicle instanceof Motorbike) {
                Motorbike motorbike = (Motorbike) vehicle;
                motorbike.setHasSideCar(false);
            }
            vehicle.start();
        }
        return vehicles;
    }
}