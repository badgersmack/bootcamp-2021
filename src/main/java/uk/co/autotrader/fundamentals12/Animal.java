package uk.co.autotrader.fundamentals12;

public abstract class Animal {
    private String name;

    public Animal(final String name) {
        this.name = name;
    }

    /*  Making this abstract is the same as defining a method in an interface!
        Any class that extends Animal, MUST implement 'makeSound'
     */
    public abstract void makeSound();
}
