package september.task3;
import java.util.*;

// ---------------- Interfaces ----------------
interface AcademicActivity {
    void addGrade(String course, double grade);
    Optional<Double> getAverageGrade(String course);
}

interface ClubActivity {
    void joinClub(String clubName);
    Optional<List<String>> getClubs();
}

// ---------------- Student Class ----------------
class Student implements AcademicActivity, ClubActivity {
    private String name;
    private Map<String, List<Double>> grades;
    private List<String> clubs;

    public Student(String name) {
        this.name = name;
        this.grades = new HashMap<>();
        this.clubs = new ArrayList<>();
    }

    // ---- AcademicActivity implementation ----
    @Override
    public void addGrade(String course, double grade) {
        if (!grades.containsKey(course)) {
            grades.put(course, new ArrayList<>());
        }
        grades.get(course).add(grade);
    }

    @Override
    public Optional<Double> getAverageGrade(String course) {
        if (grades.containsKey(course)) {
            List<Double> courseGrades = grades.get(course);
            double sum = 0;
            for (double g : courseGrades) {
                sum += g;
            }
            return Optional.of(sum / courseGrades.size());
        }
        return Optional.empty();
    }

    // ---- ClubActivity implementation ----
    @Override
    public void joinClub(String clubName) {
        if (!clubs.contains(clubName)) {
            clubs.add(clubName);
        }
    }

    @Override
    public Optional<List<String>> getClubs() {
        if (clubs.isEmpty()) {
            return Optional.empty();
        }
        return Optional.of(clubs);
    }
}

// ---------------- Main (Testing) ----------------
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Alice");

        // Academic activities
        s1.addGrade("Math", 90);
        s1.addGrade("Math", 85);
        s1.addGrade("History", 78);

        System.out.println("Math average: " + s1.getAverageGrade("Math")); // Optional[87.5]
        System.out.println("Physics average: " + s1.getAverageGrade("Physics")); // Optional.empty

        // Club activities
        s1.joinClub("Drama Club");
        s1.joinClub("Basketball");
        s1.joinClub("Drama Club"); // duplicate ignored

        System.out.println("Clubs: " + s1.getClubs()); // Optional[[Drama Club, Basketball]]
    }
}
