package uk.co.autotrader.fundamentals12;

public class ZooKeeper {

    public static void main(String[] args) {
        Animal animal = new Hippo("Hippo!!!!");
        animal.makeSound();

        Hippo hippo = new Hippo("Hippo2!!!!");
        hippo.makeSound();
    }
}
