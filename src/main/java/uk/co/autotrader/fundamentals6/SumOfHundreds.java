package uk.co.autotrader.fundamentals6;

public class SumOfHundreds {
    public static int main(String[] args) {

        int total = 0;
        int[] scores1 = {1, 100, 100};
        int[] scores2 = {1, 100, 99, 100};
        int[] scores3 = {100, 1, 100, 100};

        int[] demoArray = scores1;
        for (int i = 0; i < demoArray.length; i++) {

            if (demoArray[i] == 100) {
                total++;
            }
        }
        return total;
    }
}