package week8.practice;
import java.util.*;

public class DashboardExporter {
    public void exportReport(List<?> data) {
        for(Object item : data) {
            System.out.println(item);
        }
    }
}
