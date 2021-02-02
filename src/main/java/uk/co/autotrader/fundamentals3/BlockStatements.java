package uk.co.autotrader.fundamentals3;

public class BlockStatements {
    public static void main(String[] args) {
        int num1; //accessible inside these brackets

        {
            int num2;

            num2 = 200; //local assignment accessible within these brackets

            num1 = 100; //can access this too from outer brackets
        }

        System.out.println(num1);
    }
}
