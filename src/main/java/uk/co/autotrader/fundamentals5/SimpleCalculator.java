package uk.co.autotrader.fundamentals5;

public class SimpleCalculator {

    public static int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public static int subtract(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public static int multiply(double firstNumber, double secondNumber) {
        return (int) (firstNumber * secondNumber);
    }

    public static double divide(double firstNumber, double secondNumber) {
        if (secondNumber == 0) {
            throw new ArithmeticException();
        }

        return firstNumber / secondNumber;
    }


    public static int modulus(int firstNumber, int secondNumber) {
        return firstNumber % secondNumber;
    }
}
