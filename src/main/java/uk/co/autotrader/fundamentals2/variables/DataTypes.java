package uk.co.autotrader.fundamentals2.variables;

import java.util.Date;

public class DataTypes {
    public static void main(String[] args) {
        Date dateOfbirth = new Date();

        System.out.println("dateOfbirth = " + dateOfbirth);

        // Primitive
        boolean isItRaining = false;
        System.out.println("isItRaining = " + isItRaining);

        byte MyByte = 1; // 1 byte = 8 bits
        System.out.println("MyByte = " + MyByte);

        short MyShort = 123; //range -32768 to 32768 which equals 2 bytes
        System.out.println("MyShort = " + MyShort);

        int MyInt = 123; // numbers in the billions
        System.out.println("MyInt = " + MyInt);

        long MyLong = 99L; // lots
        System.out.println("MyLong = " + MyLong);

        float MyFloat = 17.64f; //4 bytes
        System.out.println("MyFloat = " + MyFloat);

        double myDouble = 99.99d; //preferred over floats
        System.out.println("myDouble = " + myDouble);

        char gender = 'f'; //single character  16 bit unicode value
        System.out.println("gender = " + gender);

        int million = 1000000;
        System.out.println("million = " + million);
        int easyReadMillion = 1_000_000;
        System.out.println("easyReadMillion = " + easyReadMillion);
        double easyreadfloatwer= 1_999.000_000;
        System.out.println("easyreadfloatwer = " + easyreadfloatwer);

        // Non-primitive
    }
}
