package week11.presentation;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExample {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("nonexistent.txt"));
            String line = reader.readLine();
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
