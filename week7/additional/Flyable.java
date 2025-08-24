package week7.additional;

interface Flyable {
    void fly();
}

class Bird implements Flyable {
    public void fly() {
        System.out.println("the bird flaps its wings and flies");
    }
}

class Airplane implements Flyable {
    public void fly() {
        System.out.println("the airplane takes off");
    }
}

class Main {
    public static void main(String[] args) {
        Flyable thing1 = new Bird();
        Flyable thing2 = new Airplane();

        thing1.fly();
        thing2.fly();
    }
}