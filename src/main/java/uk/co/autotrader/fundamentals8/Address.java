package uk.co.autotrader.fundamentals8;

public class Address {
    String firstLineAddress;
    String cityTown;
    String postalCode;

    public Address(final String firstLineAddress, final String cityTown, final String postalCode) {
        this.firstLineAddress = firstLineAddress;
        this.cityTown = cityTown;
        this.postalCode = postalCode;
    }
}
