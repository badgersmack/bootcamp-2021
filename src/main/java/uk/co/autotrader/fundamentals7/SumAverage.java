package uk.co.autotrader.fundamentals7;

public class SumAverage {
    public static double calculateAverage() {
        double average = 0;
        for (int i = 0; i <= 100; i++) {
            average += i;
        }
        average = average / 100;
        return average;
    }

    public static double calculateSum() {
        double sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum += i;
        }
        return sum;
    }
}
//easy enough to refactor into one, but would need to delete at least one test
