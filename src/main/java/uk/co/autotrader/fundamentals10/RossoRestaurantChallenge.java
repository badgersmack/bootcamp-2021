package uk.co.autotrader.fundamentals10;

import java.util.List;
import java.util.Map;

public class RossoRestaurantChallenge {
    private static final Map<String, List<String>> MENUS = Map.of(
            "ENGLISH", List.of("Beef Wellington", "Fish and Chips"),
            "PAN ASIAN", List.of("Stir Fry"),
            "MEXICAN", List.of("Tacos")
    );

    public static void main(String[] args) {
        String menuWanted = "ENGLISH";

        List<String> menuForCountry = getMenuForCountry(menuWanted);
        System.out.println("menuForCountry = " + menuForCountry);
    }

    private static List<String> getMenuForCountry(final String menuWanted) {
        if (!MENUS.containsKey(menuWanted)) {
            throw new IllegalArgumentException("Menu not found");
        }

        return MENUS.get(menuWanted);
    }
}
