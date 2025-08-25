package week8.additional;
import java.util.*;

public interface Comparable<T> {
    int compareTo(T o);
}

// compareTo returns:
// 1 - negative, this is smaller than o
// 2 - zero, equal
// 3 - positive, this is greater than o

// comparable is generic, you can implement it for any type you want to sort


class Student implements Comparable<Student> {
    private String name;
    private int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    @Override
    public int compareTo(Student other) {
        return this.grade - other.grade;
    }

    @Override
    public String toString() {
        return name + " (" + grade + ")";
    }
}

class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Alice", 90));
        students.add(new Student("Bob", 75));
        students.add(new Student("Charlie", 90));

        // Collections.sort(students); // uses compareTo

        System.out.println(students);
    }
}