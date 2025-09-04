package revision.tasks.abstraction;
import java.util.*;

abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void makeSound();

    public String getName() {
        return name;
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("woof");
    }

    public void fetch() {
        System.out.println(getName() + " is fetching the ball");
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    } 

    @Override
    public void makeSound() {
        System.out.println("meow");
    }

    public void purr() {
        System.out.println(getName() + " is purring");
    }
}