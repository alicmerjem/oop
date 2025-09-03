package revision.finalexam.additionalhashmap;
import java.util.*;

public class AddingValues {
    public static void main(String[] args) {
        HashMap<String, Double> payments = new HashMap<>();

        payments.put("2025 - 09 - 01", 100.0);

        payments.put("2025 - 09 - 01", payments.getOrDefault("2025 - 09 - 01", 0.0) + 50.0);

System.out.println("Total on 2025-09-01: " + payments.get("2025-09-01")); // 150.0        
    }
}
