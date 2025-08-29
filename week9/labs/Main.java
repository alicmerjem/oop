package week9.labs;
import java.util.*;

record Wolf(String name, int age) {}

class WolfRegistry {
    private List<Wolf> wolves = new ArrayList<>();

    public WolfRegistry() {
        // Add some sample wolves
        wolves.add(new Wolf("Ghost", 4));
        wolves.add(new Wolf("Nymeria", 6));
        wolves.add(new Wolf("Shadow", 3));
    }

    // 2️⃣ Method that may or may not return a Wolf
    public Optional<Wolf> findWolfByName(String name) {
        for (Wolf w : wolves) {
            if (w.name().equalsIgnoreCase(name)) {
                return Optional.of(w);
            }
        }
        return Optional.empty(); // No wolf found
    }
}

public class Main {
    public static void main(String[] args) {
        WolfRegistry registry = new WolfRegistry();

        // Case 1: Wolf is found
        Optional<Wolf> found = registry.findWolfByName("Ghost");
        found.ifPresent(w -> System.out.println("Found wolf: " + w));

        // Case 2: Wolf not found -> use orElse
        Wolf result = registry.findWolfByName("Unknown").orElse(new Wolf("Default", 0));
        System.out.println("Result with orElse: " + result);

        // Case 3: Wolf not found -> throw exception
        try {
            Wolf mustExist = registry.findWolfByName("Alpha").orElseThrow(
                () -> new NoSuchElementException("Wolf not found!")
            );
            System.out.println(mustExist);
        } catch (NoSuchElementException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}

