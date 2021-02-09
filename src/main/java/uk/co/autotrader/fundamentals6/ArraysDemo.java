package uk.co.autotrader.fundamentals6;

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        int [] numbers = new int[5];
        numbers[0] = 23; //changes first element
        numbers[2] = 99;
        numbers[4] = 100;

        System.out.println("numbers" + Arrays.toString(numbers));
        
        String [] names = new String[3];
        
        names[0] = "Adam";

        System.out.println("Arrays.toString(names) = " + Arrays.toString(names)); //doesnt show null elements
        
        boolean [] isHappy = new boolean[2];
        
        isHappy[0] = true;

        System.out.println("Arrays.toString(isHappy) = " + Arrays.toString(isHappy));
        
        //Improved arrays?
        
        double [] interestRates = { 5.0d, 10.0d, 15.0d }; //creates exact array

        System.out.println("Arrays.toString(interestRates) = " + Arrays.toString(interestRates));
    }
}
