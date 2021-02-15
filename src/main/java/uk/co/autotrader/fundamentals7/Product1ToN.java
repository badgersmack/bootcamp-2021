package uk.co.autotrader.fundamentals7;

import java.math.BigInteger;

public class Product1ToN {
    public static void main(String[] args) {
        int lowerBound = 1;
        int upperBound = 4;

        BigInteger product = getProduct(lowerBound, upperBound);
        System.out.println("product = " + product);
    }

    // BigInteger can be long but long may not be large enough
    private static BigInteger getProduct(int lower, int upper) {
        BigInteger result = BigInteger.ONE;

        for (int i = lower; i <= upper; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }

        return result;
    }
}
