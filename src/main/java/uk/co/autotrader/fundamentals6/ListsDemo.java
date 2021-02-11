package uk.co.autotrader.fundamentals6;

import java.util.ArrayList;

public class ListsDemo {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("John");
        names.add("Susan");

        names.add(1, "Adam");

        for (String name : names) {
            System.out.println("name = " + name);
        }

        names.add("Jacob");

        for (String name : names) {
            System.out.println("enhanced name = " + name);
        }

        // check if something exists in a list:
        boolean isAdamPresent = names.contains("Adam");
        System.out.println("isAdamPresent = " + isAdamPresent);

        /*
        // Array example:

        String [] otherNames = { "Bob", "Tom" };

        for (String otherName : otherNames) {
            System.out.println("otherName = " + otherName);
        }
        */

        // int, double, long, char, boolean, float, short, byte
        Integer number = 5; // autoboxing

        int numberOfStudents = 5;

        ArrayList<Integer> lotteryNumbers = new ArrayList<>();
        lotteryNumbers.add(4);
        lotteryNumbers.add(99);

        // retrieve:
        System.out.println("lottery number 2 = " + lotteryNumbers.get(1));

        lotteryNumbers.remove(0);

        for (Integer lotteryNumber : lotteryNumbers) {
            System.out.println("number = " + lotteryNumber);
        }

    }
}
