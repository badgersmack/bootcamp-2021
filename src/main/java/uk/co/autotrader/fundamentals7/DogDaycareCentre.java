package uk.co.autotrader.fundamentals7;

public class DogDaycareCentre {

    public static void main(String[] args) {
        //new instance of Dog class
        Dog poodle = new Dog();

        poodle.age = 12;
        poodle.breed= "poodle";
        poodle.colour = "white";

        poodle.bark("Arf");

        Dog bulldog = new Dog();

        bulldog.age = 5;
        bulldog.breed = "bulldog";
        bulldog.colour = "brown";

        bulldog.bark( "WOOF");

        bulldog.hungry();

        bulldog.eating();

        bulldog.hungry();
    }
}
