package week10.labs.task4;
import java.lang.reflect.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Car car = new Car("tesla", 2020);

        Class<?> clazz = car.getClass();
        Field[] fields = clazz.getDeclaredFields();

        System.out.println("class" + clazz.getName());

        System.out.println("fields");
        for(Field field : fields) {
            field.setAccessible(true);
            System.out.println(field.getType().getSimpleName() + field.getName());
        }

        System.out.println("methods");
        for(Method method : clazz.getDeclaredMethods()) {
            System.out.println(method.getReturnType().getSimpleName() + method.getName());

            Class<?>[] params = method.getParameterTypes();

            for(int i = 0; i < params.length; i++) {
                System.out.println(params[i].getSimpleName());
                if(i < params.length - 1) System.out.println(", ");
            } System.out.println(")");
        }

        // modify fields
        Field modelField = clazz.getDeclaredField("model");
        modelField.setAccessible(true);
        modelField.set(car, "BMW");
        System.out.println(modelField.get(car));

        Field yearField = clazz.getDeclaredField("year");
        yearField.setAccessible(true);
        yearField.set(car, "2023");
        System.out.println(yearField.get(car));

        // invoke methods
        clazz.getDeclaredMethod("start").invoke(car);
        clazz.getDeclaredMethod("drive", String.class).invoke(car, "new york");

        Method privateMethod = clazz.getDeclaredMethod("honk");
        privateMethod.setAccessible(true);
        privateMethod.invoke(car);

        clazz.getDeclaredMethod("info").invoke(null);

    }
}
