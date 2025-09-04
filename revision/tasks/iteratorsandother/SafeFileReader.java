package revision.tasks.iteratorsandother;
import java.io.*;

public class SafeFileReader {
    public void printFirstLine(String filePath) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            System.out.println(reader.readLine());
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("file not found" + filePath);
        } catch (IOException e) {
            System.out.println("an error occured while reading the file");
        }
    }

    public void printLength(String input) {
        try {
            System.out.println("length: " + input.length());
        } catch (NullPointerException e) {
            System.out.println("input string is null");
        }
    }
}

class Main {
    public static void main(String[] args) {
        SafeFileReader reader = new SafeFileReader();
        reader.printFirstLine("notes.txt");
        reader.printLength(null);
    }
}
