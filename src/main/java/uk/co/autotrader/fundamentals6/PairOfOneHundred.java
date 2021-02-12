package uk.co.autotrader.fundamentals6;

import java.lang.reflect.Array;

public class PairOfOneHundred {
    public static void main(String[] args) {
        int [] scores1 = {1, 100, 100};
        int [] scores2 = {1, 100, 99, 100};
        int [] scores3 = {100, 1, 100, 100};
        int [] scores4 = {20, 20, 20}; //want this to fail but it passes because there's not check for 100

        int[] demoArray = scores1;
        boolean pairOfHundreds = false;
        for (int i = 0; i < demoArray.length -1; i++) {
            if (demoArray[i] == demoArray[i + 1] && demoArray[i] == 100) {
                pairOfHundreds = true;
            }
            System.out.println(pairOfHundreds);
        }
    }
}
