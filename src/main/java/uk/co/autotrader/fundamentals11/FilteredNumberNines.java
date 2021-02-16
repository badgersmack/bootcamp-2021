package uk.co.autotrader.fundamentals11;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FilteredNumberNines {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(2, 8, 9, 99, 33);

        Function<List<Integer>, List<Integer>> no9 = initialList -> {
            List<Integer> filtered = new ArrayList<>();

            initialList.forEach(i -> {
                if (i % 10 != 9) {
                    filtered.add(i);
                }
            });

            return filtered;
        };

        System.out.println("no9 = " + no9.apply(numbers));
    }
}
