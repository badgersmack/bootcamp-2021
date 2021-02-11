package uk.co.autotrader.fundamentals8;

public class Sparrow extends Bird implements Flyable, WalksOnTwoFeet{
    public Sparrow(int age, char gender, int weightInLbs) {
        super(age, gender, weightInLbs);
    }

    @Override
    public void fly() {
        System.out.println("Flying");
    }

    @Override
    public void walking() {
        System.out.println("I'm walking here");
    }
}
