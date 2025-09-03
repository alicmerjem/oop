package revision.finalexam.additionalhashmap;
import java.util.HashMap;

// Notable interface
interface Notable {
    void addNote(String date, String note);
}

// Student class implementing Notable
class Student implements Notable {
    private HashMap<String, String> notesByDate;

    // Constructor
    public Student() {
        this.notesByDate = new HashMap<>();
    }

    // Implement addNote
    @Override
    public void addNote(String date, String note) {
        // If notes already exist, append; else add new
        if (notesByDate.containsKey(date)) {
            String existingNotes = notesByDate.get(date);
            notesByDate.put(date, existingNotes + ", " + note);
        } else {
            notesByDate.put(date, note);
        }
    }

    // Get notes for a date
    public String getNotes(String date) {
        return notesByDate.getOrDefault(date, "No notes");
    }

    // For testing
    public static void main(String[] args) {
        Student student = new Student();

        student.addNote("2025-09-01", "Math homework");
        student.addNote("2025-09-01", "Read history chapter");
        student.addNote("2025-09-02", "Science project");

        System.out.println("Notes on 2025-09-01: " + student.getNotes("2025-09-01"));
        System.out.println("Notes on 2025-09-02: " + student.getNotes("2025-09-02"));
        System.out.println("Notes on 2025-09-03: " + student.getNotes("2025-09-03")); // No notes
    }
}

