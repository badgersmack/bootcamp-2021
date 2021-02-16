package uk.co.autotrader.fundamentals11;

public class Artist {
    private String name;
    private String members;
    private String cityOfArtist;

    public Artist(final String name, final String members, final String cityOfArtist) {
        this.name = name;
        this.members = members;
        this.cityOfArtist = cityOfArtist;
    }

    public String getName() {
        return name;
    }

    public String getMembers() {
        return members;
    }

    public String getCityOfArtist() {
        return cityOfArtist;
    }
}
