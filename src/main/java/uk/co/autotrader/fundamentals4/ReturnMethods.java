package uk.co.autotrader.fundamentals4;

public class ReturnMethods {
    public static void main(String[] args) {
        int first =1;
        int second = 2;

        int sum = add(first, second);
        System.out.println("Sum = " + sum);

        int result2 = subtract(first, second);
        System.out.println("result2 = " + result2);

        int result3 = multiply(first, second);
        int result4 = divide(first, second);
        System.out.println(result3 + result4);
    }

    public static int add(int first, int second) {
        return first + second;
    }

    public static int subtract(int first, int second) {
        return first - second;
    }

    public static int multiply(int first, int second) {
        return first * second;
    }

    public static int divide(int first, int second) {
        return second / first;
    }
}
