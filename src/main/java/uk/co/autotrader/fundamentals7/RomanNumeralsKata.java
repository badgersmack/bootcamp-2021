package uk.co.autotrader.fundamentals7;

public class RomanNumeralsKata {
    public static String whenNumberInputtedGiveRomanNumeral(final int number) {
        String romanNumeral = "";

        int remainingNumber = number;

        if (remainingNumber >= 5) {
            romanNumeral = "V";
            remainingNumber -= 5;
        }

        if (remainingNumber == 4){
            romanNumeral = "IV";
            remainingNumber -= 4;
        }
        else {
            for (int i = 0; i < remainingNumber; i++) {
                romanNumeral += "I";
            }
        }

        return romanNumeral;
    }
}
