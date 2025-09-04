package revision.tasks.metaprogramming;
import java.lang.reflect.*;

public class Animal {
    private final String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
}

class Main {
    public static void main(String[] args) throws Exception {
        Animal animal = new Animal("leo", 3);
        Class<?> clazz = animal.getClass();

        System.out.println("\nFields:");
        for(Field field : clazz.getDeclaredFields()) {
            System.out.println(field.getType().getSimpleName() + " " + field.getName());
        }

        System.out.println("\nMethods:");
        for(Method method : clazz.getDeclaredMethods()) {
            System.out.println(method.getReturnType().getSimpleName() + method.getName());
        }

        Field nameField = Animal.class.getDeclaredField("name");
        nameField.setAccessible(true);
        nameField.set(animal, "newname");

        System.out.println("modified name: " + nameField.get(animal));
    }
}

