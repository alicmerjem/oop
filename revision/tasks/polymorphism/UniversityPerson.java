package revision.tasks.polymorphism;

public class UniversityPerson {
    private String name;
    private int birthYear;

    public UniversityPerson(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public String getName() { return name; }
    public int getBirthYear() { return birthYear; }

    public String getRole() {
        return "University person";
    }

    public int getAge(int currentYear) {
        return currentYear - birthYear;
    }

    @Override
    public String toString() {
        return "some string to be returned";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if(!(obj instanceof UniversityPerson)) return false;

        UniversityPerson other = (UniversityPerson) obj;

        return this.name.equals(other.name) && this.birthYear == other.birthYear;
    }
}

class Student extends UniversityPerson {
    private String studentId;
    private String major;

    public Student(String name, int birthYear, String studentId, String major) {
        super(name, birthYear);
        this.studentId = studentId;
        this.major = major;
    }

    @Override
    public String getRole() {
        return "Student";
    }

    public String getStudentInfo() {
        return getName() + " studies " + major;
    }
}

class Professor extends UniversityPerson {
    private String employeeId;
    private String department;

    public Professor(String name, int birthYear, String employeeId, String department) {
        super(name, birthYear);
        this.employeeId = employeeId;
        this.department = department;
    }

    @Override
    public String getRole() {
        return "Professor";
    }

    public String getProfessorInfo() {
        return "professor " + getName() + " teaches in " + department;
    }
}

class Staff extends UniversityPerson {
    private String staffId;
    private String role;

    public Staff(String name, int birthYear, String staffId, String role) {
        super(name, birthYear);
        this.staffId = staffId;
        this.role = role;
    }

    @Override
    public String getRole() {
        return "Staff";
    }

    public String getStaffInfo() {
        return getName() + " works as " + role;
    }
}

class UniversityPrinter {
    public void printPersonDetails(UniversityPerson person, int currentYear) {
        System.out.println(person.toString());

        System.out.println(person.getRole());
        System.out.println(person.getAge(currentYear));

        if (person instanceof Student student) {
            System.out.println(student.getStudentInfo());
        } else if (person instanceof Professor professor) {
            System.out.println(professor.getProfessorInfo());
        } else if (person instanceof Staff staff) {
            System.out.println(staff.getStaffInfo());
        }
    }
}

class Main {
    public static void main(String[] args) {
        UniversityPerson s = new Student("Alice", 2000, "S123", "Computer Science");
        UniversityPerson p = new Professor("Dr. Bob", 1975, "P456", "Mathematics");
        UniversityPerson st = new Staff("Charlie", 1985, "ST789", "Librarian");

        UniversityPrinter printer = new UniversityPrinter();
        printer.printPersonDetails(s, 2025);
        printer.printPersonDetails(p, 2025);
        printer.printPersonDetails(st, 2025);
    }    
}