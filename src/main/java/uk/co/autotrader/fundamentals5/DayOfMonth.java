package uk.co.autotrader.fundamentals5;

public class DayOfMonth {

    public static String getMonthTestByDigit(int monthDigit) {
        String monthText = "";

        switch (monthDigit) {
            case 1:
                monthText = "JANUARY";
                break;
            case 2:
                monthText = "FEBRUARY";
                break;
            case 3:
                monthText = "MARCH";
                break;
            case 4:
                monthText = "APRIL";
                break;
            case 5:
                monthText = "MAY";
                break;
            case 6:
                monthText = "JUNE";
                break;
            case 7:
                monthText = "JULY";
                break;
            case 8:
                monthText = "AUGUST";
                break;
            case 9:
                monthText = "SEPTEMBER";
                break;
            case 10:
                monthText = "OCTOBER";
                break;
            case 11:
                monthText = "NOVEMBER";
                break;
            case 12:
                monthText = "DECEMBER";
                break;
            default: monthText ="Not a month";
        }

        return monthText;
    }
}
