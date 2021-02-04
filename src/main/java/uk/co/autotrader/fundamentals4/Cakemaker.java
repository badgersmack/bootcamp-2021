package uk.co.autotrader.fundamentals4;

public class Cakemaker {
    // <modifier> <optional static> <returnValue> methodName(parameters) [aka method signature]
    // <<throws exception e.e. error>> {
    // }

    public static void main(String[] args) {
        //cake thing
        getIngredients();
        mixIngredients();
    }

    public static void mixIngredients() {
        System.out.println("Mixing ingredients");
    }

    public static void getIngredients() {
        System.out.println("Fetching ingredients");
    }

}
