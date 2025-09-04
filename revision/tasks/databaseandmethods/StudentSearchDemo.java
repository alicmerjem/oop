package revision.tasks.databaseandmethods;
import java.util.*;

public class StudentSearchDemo {
    public static boolean searchStudent(ArrayList<String> list, String name) {
        return list.contains(name);
    }

    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();

        students.add("alice");
        students.add("bob");
        students.add("charlie");

        // test search
        String nameToSearch = "charlie";
        if(searchStudent(students, nameToSearch)) {
            System.out.println("student is in the list");
        } else {
            System.out.println("name is not in the list");
        }
    }
}
