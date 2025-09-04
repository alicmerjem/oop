package revision.tasks.databaseandmethods;
import java.util.*;

public class StudentSortDemo {
    public static void sortAndPrintStudents(ArrayList<String> students) {
        // sort alphabetically
        Collections.sort(students);

        // print all student names
        for(String student : students) {
            System.out.println(student);
        }
    }

    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add("alice");
        students.add("bob");
        students.add("charlie");
        students.add("diana");

        sortAndPrintStudents(students);

    }
}
