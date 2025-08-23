package week6;
import java.util.*;

public class Animal {
    protected String name;

    // Constructor
    public Animal(String name) {
        this.name = name;
    }

    // General speak method
    public void speak() {
        System.out.println("The animal makes a sound");
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println("woof");
    }

    public void fetchBall() {
        System.out.println(name + " fetches the ball!");
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println("meow");
    }

    public void scratchSofa() {
        System.out.println(name + " scratches the sofa");
    }
}

class Parrot extends Animal {
    public Parrot(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println("Polly wants a cracker");
    }

    public void flyAround() {
        System.out.println(name + " is flying around");
    }
}

class AnimalDemo {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();

        animals.add(new Dog("Rex"));
        animals.add(new Dog("Buddy"));
        animals.add(new Cat("Whiskers"));
        animals.add(new Cat("Mittens"));
        animals.add(new Parrot("Polly"));
        animals.add(new Parrot("Rio"));
        
        for(Animal a : animals) {
            a.speak();

            // downcast
            if (a instanceof Dog) {
                Dog d = (Dog) a;
                d.fetchBall();

            } else if (a instanceof Cat) {
                Cat c = (Cat) a;
                c.scratchSofa();

            } else if (a instanceof Parrot) {
                Parrot p = (Parrot) a;
                p.flyAround();   
            }
        }
    }
}