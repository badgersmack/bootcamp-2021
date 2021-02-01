package uk.co.autotrader.fundamentals2.debugging;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentAverageGradeCalculator {
    public static void main(String [] args) {
        ArrayList<String> students = new ArrayList<>();
        ArrayList<Double> grades = new ArrayList<>();

        Scanner in = new Scanner(System.in);
        String newStudent;

        System.out.println("Enter student names: ");

        do {
            newStudent = in.nextLine();

            if (!newStudent.equals("")) {
                students.add(newStudent);
            }
        } while (!newStudent.equals(""));

        for (String student : students) {
            System.out.println("Grade for " + student + ": ");
            Double grade = in.nextDouble();
            grades.add(grade);
        }

        System.out.println("\nClass: ");
        double sum = 0.0;

        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i) + " ( "+ grades.get(i) + " )");
            sum = sum + grades.get(i);
        }

        double avg = sum / students.size();
        System.out.println("Average grade: " + avg);
    }
}
