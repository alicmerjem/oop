package week12.presentation.factory;

interface Vehicle {
    void drive();
}

class Car implements Vehicle {
    public void drive() {
        System.out.println("driving a car");
    }
}

class Bike implements Vehicle {
    public void drive() {
        System.out.println("riding a bike");
    }
}

class VehicleFactory {
    public Vehicle getVehicle(String type) {
        if(type.equalsIgnoreCase("car")) {
            return new Car();
        } else if (type.equalsIgnoreCase("bike")) {
            return new Bike();
        }
        return null;
    }
}

class Main {
    public static void main(String[] args) {
        VehicleFactory factory = new VehicleFactory();

        Vehicle v1 = factory.getVehicle("car");
        v1.drive();

        Vehicle v2 = factory.getVehicle("bike");
        v2.drive();
    }
}