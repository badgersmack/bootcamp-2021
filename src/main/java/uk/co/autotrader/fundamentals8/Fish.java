package uk.co.autotrader.fundamentals8;

public class Fish extends Animal {

    public Fish(int age, char gender, int weightInLbs) {
        super(age, gender, weightInLbs);

        System.out.println("I'm a fish");
    }

    public void swim() {
        System.out.println("Just keep swimming");
    }
}
