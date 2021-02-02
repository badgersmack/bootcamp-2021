package uk.co.autotrader.fundamentals3;

public class Operators {
    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println("result = " + result);

        String name1 = "Luke";
        String name2 = "Chant";
        String fullName = name1 + name2;
        System.out.println("fullName = " + fullName);

        int number = 1;
        System.out.println("number = " + fullName + number);

        int previousResult = result;

        result = result - 1;
        System.out.println("subtract previousResult = " + previousResult);

        previousResult = result;

        previousResult = previousResult * 10;
        System.out.println("mult previousResult = " + previousResult);

        previousResult = previousResult / 2;
        System.out.println("div previousResult = " + previousResult);

        previousResult = result;

        previousResult = previousResult % 3;
        System.out.println("modelo previousResult = " + previousResult);

        //increment
        result = result + 1;
        System.out.println("inc result = " + result);

        //postincrement

        result++;
        System.out.println("postinc result = " + result);

        ++result;
        System.out.println("preinc previousResult = " + result);

        //decrement
        result = result - 1;
        System.out.println("dec previousResult = " + result);

        // pre dec --result postdec result--

        int anotherResult = 1;

        anotherResult += 2;
        System.out.println("anotherResult = " + anotherResult);
        //etc

        // plus all the < > = != >= <= && || == and that are same as javascript

        int someValue = 1;

        if (someValue == 1)
            System.out.println(" YO ");

        //ternery operator

        boolean isanimal = true;

        boolean wasanimal = isanimal ? true : false;
    }
}
