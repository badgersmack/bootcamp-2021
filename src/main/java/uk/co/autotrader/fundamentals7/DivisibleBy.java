package uk.co.autotrader.fundamentals7;

public class DivisibleBy {
    public static void main(String[] args) {
        int sumDivisible = 0;

        for (int i = 1; i <= 500; i++) {
            if ((i % 3 == 0) || (i % 5 == 0)) {
                sumDivisible += i;
                System.out.println("Matched = " + i);
            }
        }

        System.out.println("Total = " + sumDivisible);
    }
}
