package uk.co.autotrader.fundamentals11;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class LingoList {
    public static void main(String[] args) {
        List<Student> allStudents = List.of(
                new Student("Pierre", "French", 40),
                new Student("Aaron", "French", 60),
                new Student("Steve", "English", 70),
                new Student("Frank", "English", 40),
                new Student("Bart", "German", 30),
                new Student("Aaron", "German", 30)
        );

        // only English:
        List<Student> englishStudents = allStudents.stream()
                .filter(student -> student.getSubject().equals("English"))
                .collect(Collectors.toList());

        System.out.println("englishStudents = " + englishStudents);

        List<Student> frenchStudents = allStudents.stream()
                .filter(student -> student.getSubject().equals("French"))
                .collect(Collectors.toList());

        System.out.println("frenchStudents = " + frenchStudents);

        List<Student> germanStudents = allStudents.stream()
                .filter(student -> student.getSubject().equals("German"))
                .collect(Collectors.toList());

        System.out.println("germanStudents = " + germanStudents);

        List<Student> scoredMoreThan50 = allStudents.stream()
                .filter(student -> student.getScore() > 50)
                .collect(Collectors.toList());

        System.out.println("scoredMoreThan50 = " + scoredMoreThan50);

        Set<Student> studentsNameStartsWithA = allStudents.stream()
                .filter(student -> student.getStudentName().startsWith("A"))
                .collect(Collectors.toSet());

        System.out.println("studentsNameStartsWithA = " + studentsNameStartsWithA);
    }
}
