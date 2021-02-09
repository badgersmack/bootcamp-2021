package uk.co.autotrader.fundamentals6;

public class ForLoopsDemo {
    public static void main(String[] args) {

        for (int count = 0; count < 10; count++) {
            String message = "Hello " + count;

            System.out.println("count = " + message);

        } //end of loop
        
        int number; //declared variable before loop

        for (number = 1; number <= 5; number++) {
            System.out.println("number = " + number);
        }
    }
}
