package revision.tasks.inheritance;

import java.time.Year;

// Base class: Person
class Person {
    // Private fields
    private String name;
    private String email;
    private int birthYear;

    // Constructor
    public Person(String name, String email, int birthYear) {
        this.name = name;
        this.email = email;
        this.birthYear = birthYear;
    }

    // Getters and setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public int getBirthYear() { return birthYear; }
    public void setBirthYear(int birthYear) { this.birthYear = birthYear; }

    // Method to calculate age
    public int getAge(int currentYear) {
        return currentYear - birthYear;
    }

    // Polymorphic info printing
    public String getInfo() {
        return "Name: " + name + ", Email: " + email + ", Age: " + getAge(Year.now().getValue());
    }
}

// Student class extends Person
class Student extends Person {
    private String studentId;
    private String major;

    public Student(String name, String email, int birthYear, String studentId, String major) {
        super(name, email, birthYear);
        this.studentId = studentId;
        this.major = major;
    }

    // Getters and setters
    public String getStudentId() { return studentId; }
    public void setStudentId(String studentId) { this.studentId = studentId; }

    public String getMajor() { return major; }
    public void setMajor(String major) { this.major = major; }

    // Override getInfo
    @Override
    public String getInfo() {
        return super.getInfo() + ", Student ID: " + studentId + ", Major: " + major;
    }
}

// Professor class extends Person
class Professor extends Person {
    private String employeeId;
    private String department;

    public Professor(String name, String email, int birthYear, String employeeId, String department) {
        super(name, email, birthYear);
        this.employeeId = employeeId;
        this.department = department;
    }

    // Getters and setters
    public String getEmployeeId() { return employeeId; }
    public void setEmployeeId(String employeeId) { this.employeeId = employeeId; }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    // Override getInfo
    @Override
    public String getInfo() {
        return super.getInfo() + ", Employee ID: " + employeeId + ", Department: " + department;
    }
}
