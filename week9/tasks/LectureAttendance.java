package week9.tasks;
import java.util.*;

public class LectureAttendance {
    public static void main(String[] args) {
        HashSet<String> students = new HashSet<>();

        // adding names
        students.add("Alice");
        students.add("Bob");
        students.add("Charlie");
        students.add("Alice"); // since this is a duplicate, it will be ignored

        // print out all unique students
        System.out.println("Students who attended: " + students);

        // check if a specific student attended
        String checkStudent = "Bob";
        if(students.contains(checkStudent)) {
            System.out.println("bob attended the lecture");
        } else {
            System.out.println("bob did not attend the lecture");
        }
    }
}
