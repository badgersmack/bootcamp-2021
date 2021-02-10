package uk.co.autotrader.fundamentals7;
//public means anyone can use this class if they know where it is
public class Dog {
    //fields/member variables go at the top so they can be found and are available in sub classes

    String breed;
    int age;
    String colour;
    boolean hasEaten;

    void bark(String dogMessage) {
        System.out.println(breed + " " + dogMessage);
    }

     void hungry() {
        if (!hasEaten) {
            System.out.println("I'm hungry");
            bark("Give me food");
        }
     }

     void eating() {
        hasEaten = true;
         System.out.println("Am eating mayte");
     }
}
