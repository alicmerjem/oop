package week7.additional;

abstract class Animal2 {
    protected String name;

    public Animal2(String name) {
        this.name = name;
    }

    // abstract method, no body
    public abstract void makeSound();

    // concrete method, has a body
    public void eat() {
        System.out.println(name + " is eating.");
    }
}

// subclass must implement abstract method
class Dog extends Animal2 {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("woof");
    }
}

class Main {
    public static void main(String[] args) {
        Animal2 myDog = new Dog("buddy");
        
        myDog.makeSound();
        myDog.eat();
    }
} 