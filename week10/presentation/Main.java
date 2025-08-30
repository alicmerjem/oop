package week10.presentation;
import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface RunImmediatelyNTimes {
    int times();
}

class Lion {
    @RunImmediatelyNTimes(times = 3)
    public void roar() {
        System.out.println("lion is roaring");
    }

    public void sleep() {
        System.out.println("lion is sleeping...");
    }
}

public class Main {
    public static void main(String[] args) {
        Lion lion = new Lion();

        try {
                    for(Method method : lion.getClass().getDeclaredMethods()) {
            if(method.isAnnotationPresent(RunImmediatelyNTimes.class)) {
                RunImmediatelyNTimes annotation = method.getAnnotation(RunImmediatelyNTimes.class);
                for(int i = 0; i < annotation.times(); i++) {
                    method.invoke(lion);
                }
            }
        }
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
} 
