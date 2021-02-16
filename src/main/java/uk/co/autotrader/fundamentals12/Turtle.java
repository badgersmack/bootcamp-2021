package uk.co.autotrader.fundamentals12;

public class Turtle extends Animal {

    public Turtle(final String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("I dont make a noise");
    }
}
