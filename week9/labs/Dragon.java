package week9.labs;
import java.util.*;

record Dragon(String name, int firePower) {}

class DragonRegistry {
    private List<Dragon> dragons = new ArrayList<>();

    public DragonRegistry() {
        dragons.add(new Dragon("smaug", 900));
        dragons.add(new Dragon("drogon", 750));
        dragons.add(new Dragon("toothless", 500));
    }

    public Optional<Dragon> findDragonByName(String name) {
        for(Dragon d : dragons) {
            if(d.name().equalsIgnoreCase(name)) {
                return Optional.of(d); 
            }
        }
        return Optional.empty();
    }
}

class Main {
    public static void main(String[] args) {
        DragonRegistry registry = new DragonRegistry();

        // using ifPresent for found
        registry.findDragonByName("smaug").ifPresent(d -> System.out.println("dragon found" + d));

        // using orelse for not found, replace 
        Dragon fallback = registry.findDragonByName("viserion").orElse(new Dragon("defaultdragon", 100));
        System.out.println(fallback);

        // dragon not found, throwing exception
        try {
            Dragon mustExist = registry.findDragonByName("balerion").orElseThrow(() -> new NoSuchElementException("dragon not found"));
            System.out.println(mustExist);
        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());
        }
    }
}