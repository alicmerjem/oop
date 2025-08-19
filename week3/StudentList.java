package week3;
import java.util.*;

public class StudentList {
    public static void manageStudents() {
        ArrayList<String> students = new ArrayList<>();

        students.add("alice");
        students.add("bob");
        students.add("charlie");
        students.add("diana");
        students.add("eve");

        // removing a name
        students.remove("diana");

        // print using for loop
        for(int i = 0; i < students.size(); i++) {
            System.out.println(students);
        }

        // print using for each
        for (String s : students) {
            System.out.println(s);
        }

        // print using while
        int index = 0;
        while (index < students.size()) {
            System.out.println(students.get(index));
            index++;
        }
    }

    public static void sortStudents(ArrayList<String> students) {
        Collections.sort(students);
        for(String s : students ) {
            System.out.println(s);
        }
    }

    public static String getRandomStudent(ArrayList<String> list) {
        Random rand = new Random();
        int index = rand.nextInt(list.size());
        return list.get(index);
    }

    public static void main(String[] args) {
        manageStudents();
    }
}
