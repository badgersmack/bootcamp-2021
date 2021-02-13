package uk.co.autotrader.fundamentals7;

public class WhileAverage {
    public static double calculateAverage() {
        double average = 0;
        int i = 0;
        while (i < 101) {
            average += i;
            i++;
        }
        average = average / 100;
        return average;
    }

    public static double calculateSum() {
        double sum = 0;
        int i= 0;
        while (i < 101) {
            sum += i;
            i++;
        }
        return sum;
    }
}
