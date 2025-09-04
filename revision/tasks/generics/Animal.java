package revision.tasks.generics;
import java.util.*;

public abstract class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void speak();

    public int getAge() { return age; }
    public String getName() { return name; }

    public String getInfo() {
        return name + " -> " + age;
    }
}


class Lion extends Animal implements Comparable<Lion> {
    public Lion(String name, int age) {
        super(name, age);
    }

    @Override
    public void speak() {
        System.out.println(getName() + " roars.");
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
        System.out.println(getName() + " says toot.");
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
            System.out.println(animal.getInfo());
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

        System.out.println("Lions before sorting:");
        lionCage.printAnimals();

        lionCage.sortAnimals();
        System.out.println("\nLions after sorting by age:");
        lionCage.printAnimals();

        AnimalCage<Elephant> elephantCage = new AnimalCage<>();
        elephantCage.addAnimal(new Elephant("Dumbo", 6));
        elephantCage.addAnimal(new Elephant("Ella", 3));

        System.out.println("\nElephants before sorting:");
        elephantCage.printAnimals();

        elephantCage.sortAnimals();
        System.out.println("\nElephants after sorting by age:");
        elephantCage.printAnimals();        
    }
}