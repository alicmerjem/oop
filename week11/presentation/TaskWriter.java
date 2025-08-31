package week11.presentation;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class TaskWriter {
    public static void main(String[] args) {
        String[] tasks = {"do homework", "go to the gym", "buy groceries", "call mom"};


        try {
            saveTasks(tasks);
            System.out.println("saved to the file");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

        public static void saveTasks(String[] tasks) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("tasks.txt"));
        for (String task : tasks) {
            bufferedWriter.write(task + "\n"); // write each task on a new line
        }
        bufferedWriter.close(); // flush and close
    }
}
