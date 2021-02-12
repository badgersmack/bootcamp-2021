package uk.co.autotrader.fundamentals7;

public class Factorial {
    public static int calculateFactorial() {
        int product = 1;
        int lower =1;
        int upper =10;

        for(int i = lower; i <= upper ;i++) {
            product = product * i;
        }
        return product;
    }
}
