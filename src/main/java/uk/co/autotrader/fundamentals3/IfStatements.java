package uk.co.autotrader.fundamentals3;

public class IfStatements {
    public static void main(String[] args) {

        int age = 30;

        //bad practice
        if (age < 50)
            System.out.println("You are still young");

        //good practice
        if (age < 50) {
            System.out.println("You are not old");
            sayAgeMessage();
        }


        if (age < 50) {
            System.out.println("You are not old");
        }
        else if (age < 70) {
            System.out.println("not young");
        }
        else {
            System.out.println("yer old");
        }



    }

    public static void sayAgeMessage() {

        System.out.println("YEAH!");
    }

    public static void otherIf() {
        long mileage = 100000L;

        if (mileage < 200000L) {
            System.out.println("not that far");
        }

        String firstName = "Luke";

        if (firstName.startsWith("L")) {
            System.out.println("Bonus time");
        }
    }
}
