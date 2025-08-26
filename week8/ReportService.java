package week8;
import java.util.*;

public class ReportService {
    public void exportAsGenericReport(List<?> reportData) {
        for (Object item : reportData) {
            System.out.println(item);
        }
    }
}

class Main {
    public static void main(String[] args) {
        ReportService reportService = new ReportService();

        List<String> customerNames = List.of("Alice", "Bob", "Charlie");
        List<Double> dailyRevenue = List.of(1250.75, 980.25, 1430.60);
        List<Integer> productRatings = List.of(4, 5, 3, 5);

        System.out.println("Customer Names Report:");
        reportService.exportAsGenericReport(customerNames);

        System.out.println("\nDaily Revenue Report:");
        reportService.exportAsGenericReport(dailyRevenue);

        System.out.println("\nProduct Ratings Report:");
        reportService.exportAsGenericReport(productRatings);
    }
}
