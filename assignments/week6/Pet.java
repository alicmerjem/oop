package assignments.week6;

enum PetType {
    PET, 
    DOG, 
    CAT
}

public class Pet {
    private String name;
    private int birthYear;

    public Pet(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public Pet(String name) {
        this.name = name;
        this.birthYear = 2019;
    }

    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public PetType getType() {
        return PetType.PET;
    }

    public int getYearsActive(int currentYear) {
        return currentYear - birthYear;
    }

    public int getYearsActive() {
        return 5;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Pet)) return false;
        Pet other = (Pet) obj;
        return this.name.equals(other.name) && this.birthYear == other.birthYear;
    } 
}

class Dog extends Pet {
    private String breed;

    public Dog(String name, int birthYear, String breed) {
        super(name, birthYear);
        this.breed = breed;
    }

    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public PetType getType() {
        return PetType.DOG;
    }

    public String getInfo() {
        return getName() + " is a dog od breed " + breed;
    }
}

class Cat extends Pet {
    private String color;

    public Cat(String name, String color) {
        super(name);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public PetType getType() {
        return PetType.CAT;
    }

    public String getInfo() {
        return getName() + " is a cat of color " + color;
    }
}

class PetPrinter { 
    public static void printDetails(Pet obj) {
        System.out.println("Type: " + obj.getType());

        if (obj instanceof Dog) {
            Dog dog = (Dog) obj;
            System.out.println(dog.getInfo());
        } else if (obj instanceof Cat) {
            Cat cat = (Cat) obj;
            System.out.println(cat.getInfo());
        }
    }
}