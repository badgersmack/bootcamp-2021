package uk.co.autotrader.fundamentals4;

public class ExceptionsExample {
    public static void main(String[] args) {

        double firstNumber = 12;
        double secondNumber = 0;

        try {
        double dividedValue = safeDivide(firstNumber, secondNumber);
        System.out.println("dividedValue = " + dividedValue);
    } catch (ArithmeticException ex) {
            ex.printStackTrace();

            //handle error
            //TODO:
            System.out.println("Comment about fixing things");
        }
    }

    private static double safeDivide(double firstNumber, double secondNumber) {
        if (secondNumber == 0) {
            throw new ArithmeticException("You divided by zero 0_0 ");
        }
        return firstNumber / secondNumber;

    }


}
