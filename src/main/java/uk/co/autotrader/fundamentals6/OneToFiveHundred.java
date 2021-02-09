package uk.co.autotrader.fundamentals6;

public class OneToFiveHundred {

    public static void main(String[] args) {
        String theList = printNumbers();

        System.out.println("theList = " + theList);

        int accumulator = printTotal();

        System.out.println("accumulator = " + accumulator);
    }

    public static String printNumbers() {
        String numberlist = "";

        for (int number = 1; number <=500 ; number++) {
            if (number % 3 == 0) {
                numberlist += number;
            }
            if (number % 5 == 0) {
                numberlist += number;
            }

        }
        return numberlist;
    }

    public static int printTotal() {
        int numberTotal = 0;

        for (int number = 1; number <=500 ; number++) {
            if (number % 3 == 0) {
                numberTotal += number;
            }
            if (number % 5 == 0) {
                numberTotal += number;
            }

        }
        return numberTotal;
    }

}
