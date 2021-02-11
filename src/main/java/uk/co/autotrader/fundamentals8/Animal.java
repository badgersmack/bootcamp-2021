package uk.co.autotrader.fundamentals8;

public class Animal {
    int age;
    char gender;
    int weightInLbs;


    public Animal(int age, char gender, int weightInLbs) {
        this.age = age;
        this.gender = gender;
        this.weightInLbs = weightInLbs;
        System.out.println("I'm an animal");
    }

    void eat() {
        System.out.println("om nom");
    }

    void speak() {
        System.out.println("noises");
    }
}
