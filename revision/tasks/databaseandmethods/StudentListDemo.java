package revision.tasks.databaseandmethods;
import java.util.*;

public class StudentListDemo {
    public static void ManageStudents() {
        ArrayList<String> students = new ArrayList<>();
        students.add("alice");
        students.add("bob");
        students.add("charlie");

        // remove a specific name
        students.remove("charlie");

        // print using a for loop
        for(int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }

        // print using a for each loop
        for(String student : students) {
            System.out.println(student);
        }

        // print using a while loop
        int index = 0;
        while(index < students.size()) {
            System.out.println(students.get(index));
            index++;
        }
    }

    public static void main(String[] args) {
        ManageStudents();
    }
}
