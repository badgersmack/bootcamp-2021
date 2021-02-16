package uk.co.autotrader.fundamentals11;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class FunctionalProgrammingDemo2 {
    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();
        people.add(new Person("John", "Doe", 34));
        people.add(new Person("Ben", "Johnson", 60));
        people.add(new Person("Lucy", "Smith", 55));
        people.add(new Person("Zoe", "Ball", 24));
        people.add(new Person("Bob", "Pope", 70));

        for (Person person : people) {
            if (person.getAge() > 30) {
                System.out.println("above 30 person = " + person);
            }
        }

        /* notice we have to implement the 'Consumer' here...
        In functional programming its not the how its the what!

        So we do not need this implementation and we can transform it to a
        Lambda and let Java do the hard work (see next example)
         */
        people.forEach(new Consumer<Person>() {
            @Override
            public void accept(final Person person) {
                if (person.getAge() > 30) {
                    System.out.println("using consumer - person = " + person);
                }
            }
        });

        // The lambda way:
        people.forEach((Person person) -> {
                if (person.getAge() > 30) {
                    System.out.println("using consumer - person = " + person);
                }
            }
        );
    }
}
