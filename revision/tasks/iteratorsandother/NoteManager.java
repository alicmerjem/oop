package revision.tasks.iteratorsandother;
import java.io.*;

public class NoteManager {
    public void saveNote(String note) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("notes.txt"));
        writer.write(note);
        writer.newLine();
        writer.close();
    }

    public void saveAllNotes(String[] notes) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("notes.txt"));
        for(String note : notes) {
            writer.write(note);
            writer.newLine();
        }
        writer.close();
    }

    public void printAllNotes() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("notes.txt"));
        String line;

        while((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        
        reader.close();
    }
}

class Main {
    public static void main(String[] args) throws IOException {
        NoteManager manager = new NoteManager();

        manager.saveNote("this is a single note");
        
        String[] notes = {"note one", "note two", "note three"};
        manager.saveAllNotes(notes);

        manager.printAllNotes();
    }
}
