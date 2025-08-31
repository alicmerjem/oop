package week11.presentation;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteExample {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("output.txt");
            writer.write("hello world");
            writer.write("this is file writing in java");
            writer.close();
            System.out.println("file written successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
