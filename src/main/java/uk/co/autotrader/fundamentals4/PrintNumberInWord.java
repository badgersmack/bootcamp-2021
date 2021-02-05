package uk.co.autotrader.fundamentals4;

public class PrintNumberInWord {
    public static String main(String[] args) {
        int theNumber = 1;

        String numberWang = "WORD";
        switch (theNumber) {
            case 1:
                numberWang = "ONE";
                break;
            case 2:
                numberWang = "TWO";
                break;
            case 3:
                numberWang = "THREE";
                break;
            case 4:
                numberWang = "FOUR";
                break;
            case 5:
                numberWang = "FIVE";
                break;
            case 6:
                numberWang = "SIX";
                break;
            case 7:
                numberWang = "SEVEN";
                break;
            case 8:
                numberWang = "EIGHT";
                break;
            case 9:
                numberWang = "NINE";
                break;
            default:
                numberWang = "SOMETHING ELSE";
        }
        return numberWang;
    }
}
