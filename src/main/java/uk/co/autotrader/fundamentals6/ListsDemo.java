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
            System.out.println("bonus name = " + name);
        }
        
        boolean lol = names.contains("Adam");
        System.out.println("lol = " + lol);

        //Integer class exists

        Integer number = 5;

        ArrayList<Integer> lotteryNumbers = new ArrayList<>();

        lotteryNumbers.add(4);
        lotteryNumbers.add(5);
        lotteryNumbers.add(6);

        System.out.println("lotteryNumbers 1 = " + lotteryNumbers.get(0)); //gets first array number

        lotteryNumbers.remove(0);
        System.out.println("lotteryNumbers = " + lotteryNumbers);

        

    }
}
