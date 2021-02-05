package uk.co.autotrader.fundamentals3;

public class ExcludeThirteen {
    public static int main(int first, int second, int third) {
        int result;
        if (first == 13) {
            result = 0;
        }
        else if (second == 13) {
            result = first;
        }
        else if (third == 13) {
            result = first + second;
        }
        else {
            result = first + second + third;
        }
        return result;
    }
}
