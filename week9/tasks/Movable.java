package week9.tasks;

interface Movable {
    void move();
}

class Car implements Movable {
    @Override
    public void move() {
        System.out.println("vroom");
    }
}

class Bike implements Movable {
    @Override
    public void move() {
        System.out.println("zoom zoom");
    }
}

class Main {
    public static void main(String[] args) {
        Movable myCar = new Car();
        Movable myBike = new Bike();

        myCar.move();
        myBike.move();
    }
}