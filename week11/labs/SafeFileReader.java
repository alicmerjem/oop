package week11.labs;
import java.io.*;

public class SafeFileReader {
    public void printFirstLine(String filePath) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line = reader.readLine();

            if(line != null) {
                System.out.println("first line " + line);
            } else {
                System.out.println("file is empty");
            }
        } catch (FileNotFoundException e) {
            System.out.println("file not found " + filePath);
        } catch (IOException e) {
            System.out.println("error reading the file " + filePath);
        }
    }

    public void printLength(String input) {
        try {
            System.out.println("length: " + input.length());
        } catch (NullPointerException e) {
            System.out.println("input string is null");
        }
    }

    public static void main(String[] args) {
        SafeFileReader sfr = new SafeFileReader();

        // test file reading
        sfr.printFirstLine("existing_file.txt");
        sfr.printFirstLine("missing_file.txt");

        // test string length
        sfr.printLength("hello");
        sfr.printLength(null);
    }
}
