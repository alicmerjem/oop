import java.util.*;

interface Startable {
    void start();
}

abstract class Vehicle implements Startable{
    private String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}

class Car extends Vehicle {
    private int doors;

    public Car(String brand, int doors) {
        super(brand);
        this.doors = doors;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    @Override
    public void start() {
        System.out.println("starting the car");
    }
}

class Bike extends Vehicle {
    private boolean hasHelmet;

    public Bike(String brand, boolean hasHelmet) {
        super(brand);
        this.hasHelmet = hasHelmet;
    }

    public boolean isHasHelmet() {
        return hasHelmet;
    }

    public void setHasHelmet(boolean hasHelmet) {
        this.hasHelmet = hasHelmet;
    }    

    @Override
    public void start() {
        System.out.println("starting bike");
    }
}

class VehicleManager {
    public List<Startable> prepareAll(List<Startable> vehicles) {
        for(Startable v : vehicles) {
            if (v instanceof Car) {
                Car c = (Car) v;
                c.setDoors(4);
            } else if(v instanceof Bike) {
                Bike b = (Bike) v;
                b.setHasHelmet(true);
            }
            v.start();
        }
        return vehicles;
    }
}

