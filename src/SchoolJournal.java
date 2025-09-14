package Lab1.SchoolJournal.src;

// src/SchoolJournal.java
public class SchoolJournal {
    public static void main(String[] args) {
        JournalController controller = new JournalController();
        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");
        Subject math = new Subject("Math");
        Subject eng = new Subject("English");
        s1.addGrade(new Grade(s1, math, 5));
        s1.addGrade(new Grade(s1, eng, 4));
        s2.addGrade(new Grade(s2, math, 3));
        controller.addStudent(s1);
        controller.addStudent(s2);
        controller.run();
    }
}