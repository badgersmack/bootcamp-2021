package uk.co.autotrader.fundamentals8;

public class Human {
    String name;
    int age;
    int weightInLbs;
    char gender;
    Address address;

    public Human() {
        System.out.println("I am alive!!!");
    }

    public Human(final int age, final char gender, final String name, final int weightInLbs) {
        this.age = age;
        this.gender = gender;
        this.name = name;
        this.weightInLbs = weightInLbs;

        System.out.println("I am alive!!!");
    }

    public Human(final int age, final char gender, final String name, final int weightInLbs,
                 Address address) {
        this.age = age;
        this.gender = gender;
        this.name = name;
        this.weightInLbs = weightInLbs;
        this.address = address;

        System.out.println("I am alive - with an address!!!");
    }

    void speak() {
        System.out.println("My name is " + name + " and I am " + age + " years old!");

        if (address != null) {
            System.out.println("I also live in " + address.cityTown);
        }
    }

    void eat() {
        System.out.println("Eating...");
    }
}
