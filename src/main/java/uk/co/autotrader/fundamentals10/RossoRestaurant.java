package uk.co.autotrader.fundamentals10;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class RossoRestaurant {
    public static void main(String[] args) {
        Map<String, String> rossoMenu = new HashMap<>();

        rossoMenu.put("Taco", "Mexican");
        rossoMenu.put("Burrito", "Mexican");
        rossoMenu.put("Tandoori Chicken", "Indian");
        rossoMenu.put("Bhuna Ghosht", "Indian");
        rossoMenu.put("Stir Fry Noodles", "Pan Asian");
        rossoMenu.put("Dimsum", "Pan Asian");
        rossoMenu.put("Beef Wellington", "English");
        rossoMenu.put("Fish and Chips", "English");

        if (rossoMenu.containsValue("Mexican")) {
            System.out.println(rossoMenu.containsValue("Mexican"));

        }

        Stream<String> keys = rossoMenu.entrySet().stream()
                .filter(x -> "Mexican".equals(x.getValue()))
                .map(Map.Entry::getKey);
        System.out.println(keys);
    }
}
