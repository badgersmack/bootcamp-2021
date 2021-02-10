package uk.co.autotrader.fundamentals7;

public class DivideTwoChallenge {


    public static int main(String[] args) {

        return twoDivide(54);

}


    public static int twoDivide(int number) {
        int sum = number;
        int count = 0;
        while(sum> 1) {
            sum = sum / 2;
            count++;
        }
        return count;
    }
}
