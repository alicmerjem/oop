package week11.labs;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class NoteManager {

    public void saveNote(String note) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("notes.txt", true))) {
            writer.write(note + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void saveAllNotes(String[] notes) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("notes.txt"))) {
            for (String note : notes) {
                writer.write(note + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void printAllNotes() {
        try (BufferedReader reader = new BufferedReader(new FileReader("notes.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        NoteManager manager = new NoteManager();
        
        // Save single note
        manager.saveNote("This is my first note.");
        
        // Save array of notes
        String[] notes = {"Note 1", "Note 2", "Note 3"};
        manager.saveAllNotes(notes);
        
        // Print all notes
        manager.printAllNotes();
    }
}
