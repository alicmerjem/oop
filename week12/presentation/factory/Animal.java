package week12.presentation.factory;

interface Animal {
    void makeSound();
}

class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("woof");
    }
}

class Cat implements Animal {
    @Override
    public void makeSound() {
        System.out.println("meow");
    }
}

class AnimalFactory {
    public Animal getAnimal(String type) {
        if(type.equalsIgnoreCase("dog")) {
            return new Dog();
        } else if (type.equalsIgnoreCase("cat")) {
            return new Cat();
        }
        return null;
    }
}

class Main {
    public static void main(String[] args) {
        AnimalFactory factory = new AnimalFactory();

        Animal a1 = factory.getAnimal("cat");
        a1.makeSound();

        Animal a2 = factory.getAnimal("dog");
        a2.makeSound();
    }
}