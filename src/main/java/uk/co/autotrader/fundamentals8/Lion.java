package uk.co.autotrader.fundamentals8;

public class Lion extends Animal implements Carnivore {
    private String name;

    public Lion(final String name, final int age, final char gender, final int weightInLbs) {
        super(age, gender, weightInLbs);

        this.name = name;
    }

    public void eatMeat() {
        System.out.println("Lovely meat! Says " + name);
    }
}
