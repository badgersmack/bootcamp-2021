package uk.co.autotrader.fundamentals4;

public class DogExample {
    public static void main(String[] args) {
        int size = 60;

        String dogBark = dogBark(size);

        System.out.println("Dog Bark = " + dogBark);
    }

    private static String dogBark(final int dogSize) {
        String wofMessage = "Dot a dog";
        if (dogSize > 60) {
            wofMessage = "WOOF";
        }
        else if (dogSize > 15) {
            wofMessage = "Arf";
        }

        return wofMessage;
    }
}
