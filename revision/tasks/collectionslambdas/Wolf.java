package revision.tasks.collectionslambdas;
import java.util.Optional;

public record Wolf(String name, int age) {}

class WolfRegistry {
        // simulated search
    public Optional<Wolf> findWolfByName(String name) {
        if(name.equalsIgnoreCase("alpha")) {
            return Optional.of(new Wolf("alpha", 5));
        } else if (name.equalsIgnoreCase("luna")) {
            return Optional.of(new Wolf("luna", 3));
        }
        return Optional.empty();
    }
}

class Main {
    public static void main(String[] args) {
        WolfRegistry registry = new WolfRegistry();

        // case 1: found wolf
        Optional<Wolf> wolf = registry.findWolfByName("alpha");
        wolf.ifPresent(w -> System.out.println("found wolf " + w));

        // case 2: not found, use orelse
        Wolf wolf2 = registry.findWolfByName("ghost")
            .orElse(new Wolf("unknown", 2));
        System.out.println("fallback wolf " + wolf2);

        // case 3: not found, throw exception
        try {
            Wolf wolf3 = registry.findWolfByName("shadow")
                .orElseThrow(() -> new RuntimeException("wolf not found"));
            System.out.println(wolf3);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
