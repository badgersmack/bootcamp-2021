package uk.co.autotrader.fundamentals6;

public class IterateNumbers {

    public static void main(String[] args) {
        int total = sum();
        System.out.println("total = " + total);

    }
    public static int sum(){
        int sum = 0;

        for (int number = 1; number <= 500; number++) {
            if (number % 3 == 0 || number % 5 == 0) {
                System.out.println(number);

                sum = sum + number ;
            }
        }
        return sum;
    }

}
