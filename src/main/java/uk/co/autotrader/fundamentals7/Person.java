package uk.co.autotrader.fundamentals7;

public class Person {
    String firstName;
    String lastName;
    int age;
    String fullAddress;

    public String toString() {
        StringBuilder output = new StringBuilder();
        output.append("Name: ");
        output.append(firstName).append(" ");
        output.append(lastName).append(" Age: ");
        output.append(age).append(" Address: ");
        output.append(fullAddress);
        return output.toString();
    }
}
