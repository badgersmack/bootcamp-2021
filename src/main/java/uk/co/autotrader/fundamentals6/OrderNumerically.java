package uk.co.autotrader.fundamentals6;

import java.util.Arrays;

public class OrderNumerically {
    public static void main(String[] args) {
        int [] ages = { 12, 45, 23, 19, 8 };

        for (int i = 0; i < ages.length; i++) {
            System.out.println("Unordered age: " + i + " " + ages[i]);
        }

// We can sort this using the Arrays:

        Arrays.sort(ages);

        for (int i = 0; i < ages.length; i++) {
            System.out.println("Ordered age: " + i + " " + ages[i]);
        }

        String [] numbers = { "10", "9", "100" };

        //doesn't;t work as intended - sorts alphabetically
        Arrays.sort(numbers);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(i + " " + numbers[i]);
        }
    }
}
