package uk.co.autotrader.fundamentals2.debugging;

public class Message {
    public static String getMessage(String locale) {
        if (locale.equals("ge")) {
            return "Hallo";
        }
        if (locale.equals("fr")) {
            return "Bonjour";
        }

        return "Hello";
    }
}
