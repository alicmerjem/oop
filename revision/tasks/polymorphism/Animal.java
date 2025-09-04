package revision.tasks.polymorphism;
import java.util.*;

class Animal {
    protected String name;
    
    public Animal(String name) {
        this.name = name;
    }

    public void speak() {
        System.out.println("your animal makes a sound");
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
        System.out.println(name + " is fetching the ball");
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
        System.out.println(name + " is scratching the sofa");
    }
}

class Parrot extends Animal {
    public Parrot(String name) {
        super(name);
    }
    
    @Override
    public void speak() {
        System.out.println("polly wants a cracker");
    }

    public void flyAround() {
        System.out.println(name + " is flying around");
    }
}

class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();

        animals.add(new Dog("Rex"));
        animals.add(new Dog("Buddy"));
        animals.add(new Cat("Whiskers"));
        animals.add(new Cat("Mittens"));
        animals.add(new Parrot("Polly"));
        animals.add(new Parrot("Kiwi"));

        // loop through animals and call speak and other specific methods
        for(Animal a : animals) {
            a.speak();

            // downcast
            if(a instanceof Dog dog) {
                dog.fetchBall();
            } else if (a instanceof Cat cat) {
                cat.scratchSofa();
            } else if (a instanceof Parrot parrot) {
                parrot.flyAround();
            }
        }
    }
}