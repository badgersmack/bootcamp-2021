package uk.co.autotrader.fundamentals8;

public class Chicken extends Bird implements WalksOnTwoFeet {
    public Chicken(int age, char gender, int weightInLbs) {
        super(age, gender, weightInLbs);
    }

    @Override
    public void walking() {
        System.out.println("Having a waddle");
    }
}
