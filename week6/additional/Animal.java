package week6.additional;

import java.util.ArrayList;

public class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound() {
        System.out.println("some generic animal sound");
    }
}

class Lion extends Animal {
    public Lion(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("roar");
    }

    public void hunt() {
        System.out.println(name + " is hunting");
    }
}

class Parrot extends Animal {
    public Parrot(String name, int age) {
        super(name, age);
    }

    public void fly() {
        System.out.println(name + " is flying");
    }
}

class Zoo {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();

        // upcasting 
        // adding a lion and a parrot
        animals.add(new Lion("Simba", 5));
        animals.add(new Parrot("Polly", 2));

        for (Animal a : animals) {
            a.makeSound();
        }

        // downcasting
        for (Animal a : animals) {
            if(a instanceof Lion) {
                Lion lion = (Lion) a;
                lion.hunt();
            } else if (a instanceof Parrot) {
                Parrot parrot = (Parrot) a;
                parrot.fly();
            }
        }
    }
}