package uk.co.autotrader.fundamentals4;

public class LoneSum {
    public static int main(int first, int second, int third) {
        int result;
        if (first == second && first == third) {
            result = 0;
        }
        else if (second == third) {
            result = first;
        }
        else if (first == third) {
            result = second;
        }
        else if (first == second) {
            result = third;
        }
        else {
            result = first + second + third;
        }
        return result;
    }
}
