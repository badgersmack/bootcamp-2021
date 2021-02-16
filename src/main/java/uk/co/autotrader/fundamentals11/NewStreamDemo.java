package uk.co.autotrader.fundamentals11;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NewStreamDemo {
    public static void main(String[] args) {
        List<Students> studentList = List.of(
        new Students("Dave", "German", 10),
        new Students("Andy", "English", 60),
        new Students("Alice", "French", 70),
        new Students("Barry", "German", 40)
        );


        List<Students> streamGerman = studentList.stream()
                .filter(student -> student.getSubject().equals("English"))
                .collect(Collectors.toList());
    }

}
