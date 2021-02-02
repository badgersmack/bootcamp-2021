package uk.co.autotrader.fundamentals3;

public class DailyRoutine {
    public static void main(String[] args) {
        int day = 7;

        if (day < 6) {
            System.out.println("It is a weekday.");
        }
        else {
            System.out.println("It's the weekend! WOOP!");
        }

        if (day == 2 || day == 4) {
            System.out.println("Let's go to the gym.");
        }

        if (day == 7) {
            System.out.println("Let's do some gardening.");
        }
    }
}
