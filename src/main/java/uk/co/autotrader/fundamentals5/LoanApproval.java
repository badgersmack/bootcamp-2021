package uk.co.autotrader.fundamentals5;

public class LoanApproval {
    boolean percentCheck = false;
    boolean decision = false;



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

    public static boolean finalCheck(boolean fundCheck, boolean tenPercentCheck) {
        boolean finalCheck = true;

        if ((fundCheck == false) || (tenPercentCheck == false)) {
            finalCheck = false;
        }
        return finalCheck;
    }
}

