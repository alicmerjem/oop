package week4.additional;
import java.util.*;

public class Student {
    private String name;
    private int grade;
    
    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public boolean isPassing() {
        return grade >= 60;
    }

    @Override
    public String toString() {
        return "some string to be returned";
    }
}

class Classroom {
    private ArrayList<Student> students;

    public Classroom() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
        System.out.println(student.getName());
    }

    public void removeStudent(String name) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getName().equals(name)) {
                students.remove(i);
                System.out.println("this student was removed from the list");
                return;
            }
        }
        System.out.println("not found in the classroom");
    }

    public void listStudents() {
        System.out.println("all students in the classroom: ");

        for(Student s : students) {
            System.out.println(s);
        }
    }

    public void listPassingStudents() {
        System.out.println("passing students");

        for(Student s : students) {
            if (s.isPassing()) {
                System.out.println(s);
            }
        }
    }

    public static void main(String[] args) {
        Classroom myClass = new Classroom();

        Student s1 = new Student("Alice", 75);
        Student s2 = new Student("Bob", 55);
        Student s3 = new Student("Charlie", 99);

        myClass.addStudent(s1);
        myClass.addStudent(s2);
        myClass.addStudent(s3);

        myClass.listStudents();

        myClass.listPassingStudents();

        myClass.removeStudent("Bob");

        myClass.listStudents();
    }
}
