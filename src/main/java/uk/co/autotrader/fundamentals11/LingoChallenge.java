package uk.co.autotrader.fundamentals11;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Given a list of students, for English, German and French collect students into
 * individual lists that
 * - are english students
 * - are german students
 * - are french students
 * - students who have scored more than 50
 * - students whose names begin with 'A'
 */
public class LingoChallenge {
    public static void main(String[] args) {
        
        List<Students> students = new ArrayList<>();

        students.add(new Students("Megan", "English", 80));
        students.add(new Students("Luke", "French", 60));
        students.add(new Students("Sofiya", "German", 50));
        students.add(new Students("Audrey", "English", 80));
        students.add(new Students("Lucy", "French", 60));
        students.add(new Students("Jacob", "German", 40));
        students.add(new Students("Adam", "English", 100));
        students.add(new Students("Ben", "French", 30));
        students.add(new Students("Assad", "German", 55));


        List<Students> listOfEnglishStudents = students
                .stream()
                .filter((Students student) -> student.getSubject().equals("English"))
                .collect(Collectors.toList());

        List<Students> listOfFrenchStudents = students
                .stream()
                .filter((Students student) -> student.getSubject().equals("French"))
                .collect(Collectors.toList());

        List<Students> listOfGermanStudents = students
                .stream()
                .filter((Students student) -> student.getSubject().equals("German"))
                .collect(Collectors.toList());

        List<Students> listOfStudentsWithNamesStartingWithA = students
                .stream()
                .filter((Students student) -> student.getName().startsWith("A"))
                .collect(Collectors.toList());

        List<Students> listOfStudentsWithScoresAbove50 = students.stream()
                .filter((Students student) -> student.scoreOver50(student.getScore()))
                .collect(Collectors.toList());

        System.out.println("English Students = " + listOfEnglishStudents);
        System.out.println("French Students = " + listOfFrenchStudents);
        System.out.println("German Students = " + listOfGermanStudents);
        System.out.println("Students with score over 50 = " + listOfStudentsWithScoresAbove50);
        System.out.println("Students with names starting with A = " + listOfStudentsWithNamesStartingWithA);
        
    }
}
