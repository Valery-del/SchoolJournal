package Lab1.SchoolJournal.src;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class JournalController {
    private List<Student> students = new ArrayList<>();
    private ConsoleView view = new ConsoleView();

    public void addStudent(Student student) { students.add(student); }
    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            view.showMenu();
            String choice = scanner.nextLine();
            if (choice.equals("1")) {
                view.showMessage("Enter student name: ");
                String name = scanner.nextLine();
                view.showGrades(findGradesByStudent(name));
            } else if (choice.equals("2")) {
                view.showMessage("Enter minimum average grade: ");
                double minAvg = scanner.nextDouble();
                scanner.nextLine();
                view.showStudents(filterStudentsByAverageGrade(minAvg));
            } else if (choice.equals("3")) {
                break;
            } else {
                view.showError("Invalid option");
            }
        }
    }

    private List<Grade> findGradesByStudent(String name) {
        return students.stream()
            .filter(s -> s.getName().equalsIgnoreCase(name))
            .flatMap(s -> s.getGrades().stream())
            .collect(Collectors.toList());
    }

    private List<Student> filterStudentsByAverageGrade(double minAvg) {
        return students.stream()
            .filter(s -> s.getAverageGrade() >= minAvg)
            .collect(Collectors.toList());
    }
}