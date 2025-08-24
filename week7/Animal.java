package week7;
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

    public void makeSound() {
        System.out.println("woof");
    }

    public void fetch() {
        System.out.println(getName() + " is fetching a ball");
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    public void makeSound() {
        System.out.println("meow");
    }

    public void purr() {
        System.out.println(getName() + " is purring");
    }
}

class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();

        animals.add(new Dog("Buddy"));
        animals.add(new Cat("Whiskers"));

        for (Animal a : animals) {
            a.makeSound();
            System.out.println("name: " + a.getName());

            if(a instanceof Dog) {
                Dog d = (Dog) a;
                d.fetch();
            } else if(a instanceof Cat) {
                Cat c = (Cat) a;
                c.purr();
            }
        }
    }
}