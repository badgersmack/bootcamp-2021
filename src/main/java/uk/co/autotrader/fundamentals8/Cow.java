package uk.co.autotrader.fundamentals8;

public class Cow extends Animal implements Herbivore {
    public Cow(final int age, final char gender, final int weightInLbs) {
        super(age, gender, weightInLbs);
    }

    public void eatGreens() {
        System.out.println("I love my greens!");
    }
}
