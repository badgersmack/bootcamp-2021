package uk.co.autotrader.fundamentals7;

public class WhileLoop {
    public static void main(String[] args) {

        int count = 10;


        while (count > 0) {
            System.out.println("count = " + count);
            count--;
        }

        int studentNumbers = 1;
        while (true) {
            System.out.println("EEEEE");



            if (studentNumbers > 10) {
                System.out.println("GET OOT");
                break;
            }



            studentNumbers++;


        }
    }
}
