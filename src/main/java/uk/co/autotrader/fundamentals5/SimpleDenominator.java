package uk.co.autotrader.fundamentals5;

import java.text.DecimalFormat;

public class SimpleDenominator {
    public static void main(String[] args) {
        double firstNumber = 2.00d;
        double secondNumber = 2.00d;
        DecimalFormat df = new DecimalFormat("#.00");


        double result = firstNumber / secondNumber;
        String finalResult = df.format(result);

        System.out.println("result = " + finalResult);
    }
}
