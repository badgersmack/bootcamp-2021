package uk.co.autotrader.fundamentals6;

public class FizzBuzz {
    public static String fizzCheck(int number) {
        StringBuilder result = new StringBuilder();

        if (number % 3 == 0){
                result.append("fizz");
            }
            if (number % 5 == 0){
                result.append("buzz");
            }
            if (result.toString().equals("")) { // result == ""
                result.append(number);
            }

        return result.toString();
    }

    public static String fizzCheckRange(final int startValue, final int endValue) {
        if (startValue <= 0 || endValue <= 0) {
            throw new IllegalArgumentException("Received invalid number");
        }

        StringBuilder result = new StringBuilder();

        for (int number = startValue; number <= endValue; number++ ){
            result.append(fizzCheck(number));

            if (number != endValue) {
                result.append(" ");
            }
        }

        return result.toString().trim();
    }
}
