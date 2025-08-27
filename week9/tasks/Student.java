package week9.tasks;
import java.util.*;

public class Student implements Comparable<Student>{
    private String name;
    private int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public int compareTo(Student other) {
        return this.id - other.id;
    }

    public String toString() {
        return name + " " + id;
    }
}

class Main {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
            new Student("Ana", 1),
            new Student("Marko", 2),
            new Student("Ivana", 3)
        );

        // first we must sort the list
        Collections.sort(students);

        int index = Collections.binarySearch(students, new Student("x", 2));
        System.out.println("Index of student with id = 2" + index);
    }
}