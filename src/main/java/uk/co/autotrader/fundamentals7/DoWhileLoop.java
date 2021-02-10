package uk.co.autotrader.fundamentals7;

public class DoWhileLoop {
    public static void main(String[] args) {
        int count = 5;

        do {
            System.out.println("count = " + count);

            count++;
        } while (count <= 10);
    }
}
//will always run at least once