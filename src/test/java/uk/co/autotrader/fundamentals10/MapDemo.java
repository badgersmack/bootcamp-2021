package uk.co.autotrader.fundamentals10;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        //mutable version

        Map<String, String> personToNINumber = new HashMap<>();

        personToNINumber.put("JOHN", "ABC123");
        personToNINumber.put("JILL", "ABC999");

        //gets value
        String johnValue = personToNINumber.get("JOHN");
        System.out.println("johnValue = " + johnValue);

        //null as not set
        String johnValue2 = personToNINumber.get("JOHN2");
        System.out.println("johnValue = " + johnValue2);

    }
}
