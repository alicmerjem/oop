package revision.tasks.generics;
import java.util.*;

public class ReportService {
    public void exportAsGenericReport(List<?> data) {
        System.out.println("exporting generic report " + data);
    }
}


class Main {
    public static void main(String[] args) {
        List<String> customerNames = List.of("alice", "bob", "charlie");
        List<Double> dailyRevenue = List.of(1200.00, 750.55, 1430.00);
        List<Integer> productRatings = List.of(4, 5, 5, 3);

        ReportService rs = new ReportService();
        rs.exportAsGenericReport(customerNames);
        rs.exportAsGenericReport(dailyRevenue);
        rs.exportAsGenericReport(productRatings);
    }
}