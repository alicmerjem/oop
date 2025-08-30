package week10.labs.task5;
import java.lang.reflect.*;

public class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Main {
    public static void main(String[] args) {
        try {
            Animal animal = new Animal("leo", 3);
            Class<?> clazz = animal.getClass();

            // list all fields
            Field[] fields = clazz.getDeclaredFields();
            for(Field field : fields) {
                System.out.println(field.getName());
            }

            // list all method names
            Method[] methods = clazz.getDeclaredMethods();
            for(Method method : clazz.getDeclaredMethods()) {
                System.out.println(method.getName());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}