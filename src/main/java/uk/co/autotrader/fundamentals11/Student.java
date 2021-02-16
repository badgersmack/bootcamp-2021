package uk.co.autotrader.fundamentals11;

import java.text.MessageFormat;

public class Student {
    private final String studentName;
    private final String subject;
    private final int score;

    public Student(final String studentName, final String subject, final int score) {
        this.studentName = studentName;
        this.subject = subject;
        this.score = score;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getSubject() {
        return subject;
    }

    public int getScore() {
        return score;
    }

    public String toString() {
        return MessageFormat.format("Name [{0}] Subject [{1}] Score [{2}]", studentName, subject, score);
    }
}
