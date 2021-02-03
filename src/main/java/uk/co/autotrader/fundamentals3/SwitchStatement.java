package uk.co.autotrader.fundamentals3;

public class SwitchStatement {
    public static void main(String[] args) {
        int coinInserted = 50;

        switch (coinInserted) {
            case 50: //if coinInserted = 50
                System.out.println("You inserted 50 pence");
                break;
            case 100: //if coinInserted = 50
                System.out.println("You inserted a quid");
                break;
            default:
                System.out.println("Not enough money");
        }


        int dayOfWeek =2;

        switch (dayOfWeek) {
            case 2:
            case 3:
                System.out.println("Have cereal");
                break;
            case 4:
                System.out.println("Have toast");
                break;
            default:
                System.out.println("Be hungry");
        }

    }
}
