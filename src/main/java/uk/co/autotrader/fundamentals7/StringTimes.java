package uk.co.autotrader.fundamentals7;

public class StringTimes {
    public static StringBuilder multiplyString(String words, int times) {

        StringBuilder result = new StringBuilder();

        if (times < 0) {
            throw new IllegalArgumentException("Negative Number Exception");
        }
        else {
            for (int i = 1; i <= times; i++) {
            result.append(words);
        }
        }

        return result;
    }
}
