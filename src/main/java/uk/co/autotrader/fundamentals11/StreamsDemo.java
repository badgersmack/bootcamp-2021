package uk.co.autotrader.fundamentals11;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsDemo {
    public static void main(String[] args) {
        List<Artist> artistList = new ArrayList<>();
        artistList.add(new Artist("Adele", "Adele", "London"));
        artistList.add(new Artist("Ariana Grande", "Ariana Grande", "California"));
        artistList.add(new Artist("The Beatles", "Paul McCartney", "Liverpool"));

        List<Artist> filteredArtistsStartingWithLetterA = artistList
                .stream()
                .filter((Artist artist) -> artist.getName().startsWith("A"))
                .filter((Artist artist) -> artist.getCityOfArtist().equals("London"))
                .collect(Collectors.toList());

        System.out.println("Filtered by letter A and lives in London = " + filteredArtistsStartingWithLetterA);

    }
}
