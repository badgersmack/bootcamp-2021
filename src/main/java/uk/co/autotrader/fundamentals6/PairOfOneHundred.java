package uk.co.autotrader.fundamentals6;

import java.lang.reflect.Array;

public class PairOfOneHundred {
    public static void main(String[] args) {
        int [] scores1 = {1, 100, 100};
        int [] scores2 = {1, 100, 99, 100};
        int [] scores3 = {100, 1, 100, 100};

        int[] demoArray = scores3;
        for (int i = 0; i < demoArray.length -1; i++) {
            if (demoArray[i] == demoArray[i + 1]) {
                System.out.println("True");
            }
            else {
                System.out.println("False");
            }
        }
    }
}
