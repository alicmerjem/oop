package revision.tasks.metaprogramming;
import java.lang.reflect.*;

public class Dog {
    private final String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void bark() {
        System.out.println("woof");
    }

    public void say(String message) {
        System.out.println("dog says" + message); 
    }

    public void whisper() {
        System.out.println("secret bark...");
    }

    public static void info() {
        System.out.println("static info about dogs");
    }
}

class Main {
    public static void main(String[] args) throws Exception {
        Dog dog = new Dog("rex", 5);

        Class<?> clazz = dog.getClass();
        Field[] fields = clazz.getDeclaredFields();

        System.out.println("class " + clazz.getName());

        System.out.println("\nfields:");
        for(Field field : clazz.getDeclaredFields()) {
            field.setAccessible(true);
            System.out.println(field.getType().getSimpleName() + " " + field.getName());
        }

        System.out.println("\nmethods:");
        for(Method method : clazz.getDeclaredMethods()) {
            System.out.println(method.getReturnType().getSimpleName() + " " + method.getName());

            Class<?>[] params = method.getParameterTypes();
            for(int i = 0; i < params.length; i++) {
                System.out.println(params[i].getSimpleName());
                if(i < params.length - 1) System.out.println(", ");
            }
            System.out.println(")");
        } 

        Field nameField = clazz.getDeclaredField("name");
        nameField.setAccessible(true);
        nameField.set(dog, "max");
        System.out.println("modified name: " + nameField.get(dog));

        Field ageField = clazz.getDeclaredField("age");
        ageField.setAccessible(true);
        ageField.set(dog, 8);
        System.out.println("modified age: " + ageField.get(dog));

        clazz.getDeclaredMethod("bark").invoke(dog);
        clazz.getDeclaredMethod("say", String.class).invoke(dog, "lets play");

        Method privaMethod = clazz.getDeclaredMethod("whisper");
        privaMethod.setAccessible(true);
        privaMethod.invoke(dog);
        clazz.getDeclaredMethod("info").invoke(null);
    }
}
