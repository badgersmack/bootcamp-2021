package uk.co.autotrader.fundamentals12;

import java.text.MessageFormat;

public class StringUtils {

    public static String formatDetails(String firstName, String lastName) {
        return MessageFormat.format("{0} {1}", firstName.toUpperCase(),
                lastName.toUpperCase());
    }

    public static String formatDetails(String firstName, String middleName, String lastName) {
        return MessageFormat.format("{0} {1} {2}", firstName.toUpperCase(),
                middleName.toUpperCase(), lastName.toUpperCase());
    }

    public static Integer formatDetailsSpecial(String text) {
        return Integer.parseInt(text);
    }

}
