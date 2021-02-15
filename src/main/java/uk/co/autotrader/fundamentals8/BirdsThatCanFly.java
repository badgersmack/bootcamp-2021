package uk.co.autotrader.fundamentals8;

public class BirdsThatCanFly extends Bird {
    public BirdsThatCanFly(final int age, final char gender, final int weightInLbs) {
        super(age, gender, weightInLbs);
    }

    public void fly() {
        System.out.println("Bird that can fly!");
    }
}
