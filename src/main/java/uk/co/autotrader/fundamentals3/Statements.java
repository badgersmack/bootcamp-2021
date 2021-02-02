package uk.co.autotrader.fundamentals3;

import uk.co.autotrader.fundamentals2.variables.Student;

public class Statements {
    public static void main(String[] args) {

        int numberOfTeams;

        //assignment statement:
        numberOfTeams = 4;

        //method invocation statement:
        System.out.println("Hello There");

        //Object creation statement:
        Student frenchStudent = new Student("Pierre");

        //declarative statement:
        double interestRate = 0.5d;
        int num;
        String name;


        // -- Expression statements --

        /* an expression of constructed variables,
        method invocations with evaluate to a single value
        */

        int numberOfGears = 4;

        int years = 5;
        double interestRateNow = 0.4;
        
        double interestArrcued = years * interestRateNow;
        System.out.println("interestArrcued = " + interestArrcued);

        double percent = 10 + 60 /100; //ambiguous

        double percentageProper = (10 + 60) / 100; //proper syntax

    }

}
