package uk.co.autotrader.fundamentals7;

public class WhileFactorial {
    public static int main(String[] args) {
        int product = 1;
        int lower = 1;
        int upper = 2;
        int limit = upper + 1;


        while (upper < limit) {
            product = product * lower;
            lower++;
        }
        return product;
    }
}
