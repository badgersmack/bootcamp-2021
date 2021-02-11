package uk.co.autotrader.fundamentals6;

import java.util.ArrayList;
import java.util.Arrays;

public class RefresherForLoops {
    public static void main(String[] args) {

        // for loop - for i ...
        for (int count = 0; count <= 10; count++) {
            String name = "King Henry " + count;

            System.out.println("name = " + name);
        }

        // nested for loop
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                int multiplication = i * j;
                System.out.println(i + " * " + j + " = " + multiplication);
            }
        }

        // for each:

        /*
        for (datatype variableName : _collection_or_array_) {

        }
         */

        int [] populations = { 12, 34, 78 }; // pre defined - explicitly setting elements

        String [] deckOfCards = new String[45];
        deckOfCards[0] = "Queen of Hearts";

        System.out.println("Arrays.toString(deckOfCards) = " + Arrays.toString(deckOfCards));
        System.out.println("populations = " + Arrays.toString(populations));

        for (int population : populations) {
            System.out.println("population = " + population);
        }

        for (String card : deckOfCards) {
            System.out.println("card = " + card);
        }

        ArrayList<Double> rateOfInflations = new ArrayList<>();

        rateOfInflations.add(12.9d);
        //rateOfInflations.add(new Double(23.0d));

        for (Double rate : rateOfInflations) {
            System.out.println("rate = " + rate);
        }

        for (double rate : rateOfInflations) {
            System.out.println("rate = " + rate);
        }

        if (rateOfInflations.size() > 0) {
            System.out.println("Not empty");
        }

        if (!rateOfInflations.isEmpty()) {
            System.out.println("Not empty");
        }
    }
}
