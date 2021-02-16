package uk.co.autotrader.fundamentals12;

public class Fruit {
    private String colour;
    private Integer weight;
    private String shape;

    @Deprecated
    public Fruit(final String colour, final Integer weight) {
        this.colour = colour;
        this.weight = weight;
    }

    public Fruit(final String colour, final int weight, final String shape) {
        this.colour = colour;
        this.weight = weight;
        this.shape = shape;
    }
}
