package uk.co.autotrader.fundamentals3;

public class NestedIfStatement {
    public static void main(String[] args) {
        int firstNumber = 8;
        int secondNumber = 5;

        if (firstNumber < 10) {
            System.out.println("firstNumber < 10");
            if (secondNumber  > 1) {
                System.out.println("secondNumber  > 1");
            }
        }

        int remoteControlOption = 1;

        if (remoteControlOption == 1)  {
            System.out.println("play");
        }
        else if (remoteControlOption == 2)  {
            System.out.println("stop");
        }
        else if (remoteControlOption == 3)  {
            System.out.println("fastforward");
        }
        //etc - not recommended practice - KISS - keep it simple stupid


    }
}
