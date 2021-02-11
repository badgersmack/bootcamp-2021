package uk.co.autotrader.fundamentals8;

public class CoffeeMachine {
    int temperature;
    String coffeeBeanType;

    public void makeCoffee() {
        System.out.println("Making coffee!!!!");

        increaseTemperature();
        grindBeans();
    }

    public void addMilk() {
        System.out.println("Add frapuccino milk ...");
    }

    protected void grindBeans() {
        System.out.println("Grinding beans!!!");
    }

    private void increaseTemperature() {
        temperature++;

        System.out.println("Increased temperature");
    }
}
