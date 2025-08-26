package week8;
import java.util.*;

abstract class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void speak();

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getInfo() {
        return name + " (" + age + " years)";
    }
}

class Lion extends Animal implements Comparable<Lion> {
    public Lion(String name, int age) {
        super(name, age);
    }

    @Override
    public void speak() {
        System.out.println("roar");
    }

    @Override
    public int compareTo(Lion other) {
        return Integer.compare(this.getAge(), other.getAge());
    }
}

class Elephant extends Animal implements Comparable<Elephant> {
    public Elephant(String name, int age) {
        super(name, age);
    }

    @Override
    public void speak() {
        System.out.println("prooooo");
    }

    @Override
    public int compareTo(Elephant other) {
        return Integer.compare(this.getAge(), other.getAge());
    }
}

class AnimalCage<T extends Animal & Comparable<T>> {
    private List<T> animals = new ArrayList<>();

    public void addAnimal(T animal) {
        animals.add(animal);
    }

    public void sortAnimals() {
        Collections.sort(animals);
    }

    public void printAnimals() {
        for(T animal : animals) {
            System.out.println(animal);
            animal.speak();
        }
    }
}

class Main {
    public static void main(String[] args) {
        AnimalCage<Lion> lionCage = new AnimalCage<>();

        lionCage.addAnimal(new Lion("Simba", 5));
        lionCage.addAnimal(new Lion("Mufasa", 9));
        lionCage.addAnimal(new Lion("Nala", 4));

        lionCage.printAnimals();

        lionCage.sortAnimals();

    }
}