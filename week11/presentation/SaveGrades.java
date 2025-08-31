package week11.presentation;
import java.io.FileWriter;
import java.io.IOException;

public class SaveGrades {
    public static void main(String[] args) {
        String[] students = {"Alice", "Bob", "Charlie", "Diana"};
        int[] grades = {85, 92, 78, 90};

        try {
            FileWriter writer = new FileWriter("grades.txt"); 
            for(int i = 0; i < students.length; i++) {
                writer.write(students[i] + " - " + grades[i] + "\n");
            }
            System.out.println("student grades saved to the file");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
