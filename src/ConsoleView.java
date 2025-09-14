package Lab1.SchoolJournal.src;

import java.util.List;

public class ConsoleView {
    public void showMenu() {
        System.out.println("1. Find grades by student");
        System.out.println("2. Filter students by average grade");
        System.out.println("3. Exit");
        System.out.print("Choose an option: ");
    }

    public void showMessage(String msg) { System.out.print(msg); }
    public void showError(String err) { System.out.println("Error: " + err); }

    public void showGrades(List<Grade> grades) {
        if (grades.isEmpty()) {
            System.out.println("No grades found.");
            return;
        }
        for (Grade g : grades) {
            System.out.println(g.getSubject().getName() + ": " + g.getValue());
        }
    }

    public void showStudents(List<Student> students) {
        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }
        for (Student s : students) {
            System.out.println(s.getName() + ": Avg " + s.getAverageGrade());
        }
    }
}