package Lab1.SchoolJournal.src;

// src/Student.java
import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private List<Grade> grades = new ArrayList<>();

    public Student(String name) { this.name = name; }
    public String getName() { return name; }
    public List<Grade> getGrades() { return grades; }
    public void addGrade(Grade grade) { grades.add(grade); }
    public double getAverageGrade() {
        System.out.println("Calculating average for " + name);
        if (grades.isEmpty()) return 0.0;
        return grades.stream().mapToDouble(Grade::getValue).average().orElse(0.0);
}
}