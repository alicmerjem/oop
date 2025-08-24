package week7.additional;

interface Animal {
    void makeSound();
    void eat();
}

class Dog implements Animal {
    public void makeSound() {
        System.out.println("woof");
    }

    public void eat() {
        System.out.println("nom nom");
    }
}

class Cat implements Animal {
    public void makeSound() {
        System.out.println("meow");
    }

    public void eat() {
        System.out.println("nom nom nom");
    }
}
