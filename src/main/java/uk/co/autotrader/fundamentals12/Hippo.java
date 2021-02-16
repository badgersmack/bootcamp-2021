package uk.co.autotrader.fundamentals12;

public class Hippo extends Animal {

    public Hippo(final String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Hippo sounds!!!");
    }
}
