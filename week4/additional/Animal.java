package week4.additional;
import java.util.*;

public class Animal {
    private String name;
    private String species;
    private int age;

    public Animal(String name, String species, int age) {
        this.name = name;
        this.species = species;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "some string to be returned";
    }
}

class Shelter {
    private ArrayList<Animal> animals;
    
    public Shelter() {
        animals = new ArrayList<>();
    }

    // add animal
    public void addAnimal(Animal animal) {
        animals.add(animal);
        System.out.println("an animal has been added");
    }

    // list all animals
    public void listAnimals() {
        if(animals.isEmpty()) {
            System.out.println("no animal in the shelter");
        } else {
            System.out.println("animals in the shelter: ");
                for(Animal a : animals) {
                    System.out.println(a);
                }
        }
    }

    // remove animal by name 
    public void removeAnimal(String name) {
        boolean removed = false;

        for(int i = 0; i < animals.size(); i++) {
            if(animals.get(i).getName().equalsIgnoreCase(name)) {
                System.out.println("animal has been removed from the system");
                animals.remove(i);
                removed = true;
                break;
            } 

            if(!removed) {
                System.out.println("no animal found");
            }
        }
    }
}
