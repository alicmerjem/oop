package week6;

public class UniversityPerson {
    protected String name;
    protected int birthYear;

    // Constructor
    public UniversityPerson(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    // Method returning role
    public String getRole() {
        return "University Person";
    }

    // Method returning age
    public int getAge(int currentYear) {
        return currentYear - birthYear;
    }

    // Override toString
    @Override
    public String toString() {
        return name + " (born " + birthYear + ")";
    }

    // Override equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // same object
        if (obj == null || getClass() != obj.getClass()) return false; // different class
        UniversityPerson other = (UniversityPerson) obj;
        return birthYear == other.birthYear && name.equals(other.name);
    }
}


class Student extends UniversityPerson {
    private String studentId;
    private String major;

    // Constructor
    public Student(String name, int birthYear, String studentId, String major) {
        super(name, birthYear); // call parent constructor
        this.studentId = studentId;
        this.major = major;
    }

    // Override getRole
    @Override
    public String getRole() {
        return "Student";
    }

    // Student-specific method
    public String getStudentInfo() {
        return name + " studies " + major;
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
        return "Prof. " + name + " teaches in " + department;
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
        return name + " works as " + role;
    }
}

class UniversityPrinter {
    public void printPersonDetials(UniversityPerson person, int currentYear) {

        System.out.println(person.toString() + " role " + person.getRole());
        System.out.println("age " + person.getAge(currentYear));

        if (person instanceof Student) {
            Student s = (Student) person;
            System.out.println(s.getStudentInfo());
        } else if (person instanceof Professor) {
            Professor p = (Professor) person;
            System.out.println(p.getProfessorInfo());
        } else if (person instanceof Staff) {
            Staff st = (Staff) person;
            System.out.println(st.getStaffInfo());
        }
    }
}

