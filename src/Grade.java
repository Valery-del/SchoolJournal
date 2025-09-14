package Lab1.SchoolJournal.src;

// src/Grade.java
public class Grade {
    private Student student;
    private Subject subject;
    private int value;

    public Grade(Student student, Subject subject, int value) {
        this.student = student;
        this.subject = subject;
        this.value = value;
    }
    public int getValue() { return value; }
    public Subject getSubject() { return subject; }
}