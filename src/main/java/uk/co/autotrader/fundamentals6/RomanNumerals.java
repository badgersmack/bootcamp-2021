package uk.co.autotrader.fundamentals6;

public class RomanNumerals {
    public static String convertNumber(int number) {
        String output;

        switch (number) {
            case 1:
                output = "I";
                break;
            case 2:
                output = "II";
                break;
            case 3:
                output = "III";
                break;
            case 4:
                output = "IV";
                break;
            case 5:
                output = "V";
                break;
            case 6:
                output = "VI";
                break;
            case 7:
                output = "VII";
                break;
            case 8:
                output = "VIII";
                break;
            case 9:
                output = "IX";
                break;
            case 10:
                output = "X";
                break;
            default:
                output = "out of range";
        }

        return output;
    }
}
