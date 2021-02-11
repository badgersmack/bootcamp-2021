package uk.co.autotrader.fundamentals8;

public class Earth {
    public static void main(String[] args) {
        Human adam = new Human();
        adam.age = 20;
        adam.gender = 'M';
        adam.name = "Adam";
        adam.weightInLbs = 100;

        adam.speak();

        adam.eat();

        Human sofiya = new Human(20, 'F', "Sofiya", 50);

        sofiya.speak();

        Address address = new Address("1st Street", "Manchester", "M10");

        Human luke = new Human(20, 'F', "Luke", 50, address);
        luke.speak();

    }
}
