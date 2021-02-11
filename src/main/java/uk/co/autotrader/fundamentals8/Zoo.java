package uk.co.autotrader.fundamentals8;

public class Zoo {
    public static void main(String[] args) {
        Animal animal = new Animal(12, 'M', 100);
        animal.speak();
        animal.eat();

        Sparrow sparrow = new Sparrow(5, 'F', 50);
        sparrow.speak();
        sparrow.fly();
        sparrow.walking();

        Fish nemo = new Fish(60, 'M', 10);
        nemo.speak();
        nemo.swim();

        Chicken rooster = new Chicken(30, 'M', 56);
        rooster.eat();
        rooster.speak();
        rooster.walking();
    }
}
