package additional.task2;
import java.util.*;

enum GradeLevel {
    FRESHMAN, SOPHOMORE, JUNIOR, SENIOR
}

public class Student {
    private String name;
    private int age;
    private GradeLevel grade;

    public Student(String name, int age, GradeLevel grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public GradeLevel getGrade() { return grade; }

    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setGrade(GradeLevel grade) { this.grade = grade; }
}

class Undergraduate extends Student {
    public Undergraduate(String name, int age, GradeLevel grade) {
        super(name, age, grade);
    }
}

class Graduate extends Student {
    public Graduate(String name, int age, GradeLevel grade) {
        super(name, age, grade);
    }
}


class School<T extends Student> {
    private List<T> students;

    public School() {
        this.students = new ArrayList<>();
    }

    public List<T> getStudents() {
        return students;
    }

    public void setStudents(List<T> students) {
        this.students = students;
    }

    public Optional<List<T>> filterByGrade(GradeLevel grade) {
        List<T> filtered = new ArrayList<>();

        for(T student : students) {
            if(student.getGrade() == grade) {
                filtered.add(student);
            }
        }

        if(filtered.isEmpty()) {
            return Optional.empty();
        } else {
            return Optional.of(filtered);
        }
    }

    public Optional<List<T>> getByName(String name) {
        List<T> filtered = new ArrayList<>();
        for(T student : students) {
            if(student.getName().equalsIgnoreCase(name)) {
                filtered.add(student);
            }
        }
        if(filtered.isEmpty()) {
            return Optional.empty();
        } else {
            return Optional.of(filtered);
        }
    }
}
