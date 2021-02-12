package uk.co.autotrader.fundamentals7;

public class AccruedInterestCalculator {

    public static void main(String [] args) {
        double amount = 100.0d;


        for (int i = 1; i <= 50; i++) {
            double interest = calculateInterestAccrued(amount, i);

            System.out.println("Year " + i + " interest is " + interest);
        }
    }

    public static double calculateInterestAccrued(double amount, double rate) {
        return amount * (rate / 100);
    }
}
//where is rate defined???