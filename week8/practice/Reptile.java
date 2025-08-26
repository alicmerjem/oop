package week8.practice;
import java.util.*;

public abstract class Reptile {
    private String species;
    private int age;

    public Reptile(String species, int age) {
        this.species = species;
        this.age = age;
    }

    public abstract void makeSound();

    public String getSpecies() {
        return species;
    }

    public int getAge() {
        return age;
    }

    public String getInfo() {
        return species + " (" + age + ")";
    }
}

class Snake extends Reptile implements Comparable<Snake> {
    public Snake(String species, int age) {
        super(species, age);
    }

    @Override
    public void makeSound() {
        System.out.println("hiss");
    }

    @Override
    public int compareTo(Snake other) {
        return Integer.compare(this.getAge(), other.getAge());
    }
}

class Turtle extends Reptile implements Comparable<Turtle> {
    public Turtle(String species, int age) {
        super(species, age);
    }

    @Override
    public void makeSound() {
        System.out.println("makes a grunting noise");
    }

    @Override
    public int compareTo(Turtle other) {
        return Integer.compare(this.getAge(), other.getAge());
    }
}

class ReptileCage<T extends Reptile & Comparable<T>> {
    private List<T> reptiles = new ArrayList<>();

    public void addReptile(T reptile) {
        reptiles.add(reptile);
    }

    public void sortReptiles() {
        Collections.sort(reptiles);
    }

    public void printReptiles() {
        for(T reptile : reptiles) {
            System.out.println(reptile);

            reptile.makeSound();
        }
    }

}

class Main {
    public static void main(String[] args) {
        ReptileCage<Snake> snakecage = new ReptileCage<>();
        snakecage.addReptile(new Snake("Cobra", 2));
        snakecage.addReptile(new Snake("Python", 5));

        snakecage.sortReptiles();

        snakecage.printReptiles();
    }
}