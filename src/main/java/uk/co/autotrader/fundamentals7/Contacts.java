package uk.co.autotrader.fundamentals7;

public class Contacts {
    public static void main(String[] args) {
        Person barry = new Person();
        barry.firstName = "Barry";
        barry.lastName = "Barrington";
        barry.age = 50;
        barry.fullAddress = "24 Big Street,Bigtown, B1 1G";

        System.out.println(barry.toString());
    }
}
