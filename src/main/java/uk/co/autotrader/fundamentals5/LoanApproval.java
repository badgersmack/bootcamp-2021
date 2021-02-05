package uk.co.autotrader.fundamentals5;

public class LoanApproval {

    public static boolean fundCheck(double downPayment, double availableFunds) {
        boolean decision = false;
        if (downPayment < availableFunds) {
            decision = true;
        }
        return decision;
    }

    public static boolean tenPercentCheck(double loanAmount, double downPayment) {
        boolean percentCheck = false;
        double tenPercent = downPayment / 10;
        if (downPayment > tenPercent) {
            percentCheck = true;
        }
        return percentCheck;
    }
}

