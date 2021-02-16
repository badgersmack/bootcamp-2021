package uk.co.autotrader.fundamentals11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

public class FunctionalProgrammingDemo {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("John", "Doe", 34));
        people.add(new Person("Ben", "Johnson", 60));
        people.add(new Person("Lucy", "Smith", 55));
        people.add(new Person("Zoe", "Ball", 24));
        people.add(new Person("Bob", "Pope", 70));

        for (int i = 0; i < people.size(); i++) {
            System.out.println("for i => " + people.get(i));
        }

        for (Person person : people) {
            System.out.println("foreach => " + person);
        }

        Collections.sort(people, (o1, o2) ->
                o1.getLastName().compareTo(o2.getLastName())
        );

        System.out.println("people = " + people);

        // print all people whose first name begins with 'B':
        printOnlyMatchingPeople(people);

        printOnlyMatchingPeopleConditionally(people, new Conditionable() {
            @Override
            public boolean test(final Person p) {
                return p.getLastName().startsWith("B");
            }
        });

        NumericalTest adder = (int first, int second) -> first + second;
        NumericalTest subtractor = (int first, int second) -> first - second;
        NumericalTest multiplier = (int first, int second) -> first * second;

        System.out.println("adder = " + adder.compute(2, 2));
        System.out.println("subtractor = " + subtractor.compute(5, 3));
        System.out.println("multiplier = " + multiplier.compute(3, 3));

        // -----------------------------------------------

        Greetable greetable = (String message) -> { System.out.println("Hello " + message); };

        greetable.message("Bob");

        // -----------------------------------------------

        Function<String, String> convertStringToUpperCase = text -> text.toUpperCase();

        String uppercaseBingoBongo = convertStringToUpperCase.apply("bingobongo");
        System.out.println("uppercaseBingoBongo = " + uppercaseBingoBongo);

        Function<String, Integer> getTextLength = text -> text.length();

        Integer lengthOfHello = getTextLength.apply("hello");
        System.out.println("lengthOfHello = " + lengthOfHello);
    }

    private static void printOnlyMatchingPeopleConditionally(final List<Person> people,
                                                             final Conditionable cond) {
        for (Person person : people) {
            if (cond.test(person)) {
                System.out.println("Conditional person = " + person);
            }
        }
    }

    private static void printOnlyMatchingPeople(final List<Person> people) {
        for (Person person : people) {
            if (person.getFirstName().startsWith("B")) {
                System.out.println("Matched person = " + person);
            }
        }
    }
}


