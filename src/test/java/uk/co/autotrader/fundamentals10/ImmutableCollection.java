package uk.co.autotrader.fundamentals10;

import java.util.List;
import java.util.Set;

public class ImmutableCollection {
    public static void main(String[] args) {
        List<String> names= List.of("Jill", "Jack");

        Set<String> cars = Set.of("Golf", "Micra", "Fiesta");

        for (String car : cars) {
            System.out.println("car = " + car);
        }
    }
}
