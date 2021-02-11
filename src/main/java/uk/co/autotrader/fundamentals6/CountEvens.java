package uk.co.autotrader.fundamentals6;

import javax.swing.*;

public class CountEvens {
    public static void main(String[] args) {
        int total = 0;

        int [] someNumbers = { 1, 2, 3, 4, 5, 6 };

        for (int i = 0; i < someNumbers.length; i++) {
            if (someNumbers[i] % 2 == 0) {
                total += someNumbers[i];
                System.out.println(total);
            }
        }
    }
    }
