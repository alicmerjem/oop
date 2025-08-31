package week11.presentation;
import java.io.FileWriter;
import java.io.IOException;

public class SaveStudents {
    public static void main(String[] args) {
        String[] students = {"Alice", "Bob", "Charlie", "Diana"};

        try {
            FileWriter writer = new FileWriter("students.txt");
            for(String name : students) {
                writer.write(name + "\n");
            }
            System.out.println("student names saved to the file");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
