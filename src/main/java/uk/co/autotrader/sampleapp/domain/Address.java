package uk.co.autotrader.sampleapp.domain;

import java.text.MessageFormat;

public class Address {
    private String addressLine1;
    private String cityTown;
    private String postalCode;

    public Address(final String addressLine1, final String cityTown, final String postalCode) {
        this.addressLine1 = addressLine1;
        this.cityTown = cityTown;
        this.postalCode = postalCode;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public String getCityTown() {
        return cityTown;
    }

    public String getPostalCode() {
        return postalCode;
    }

    @Override
    public String toString() {
        return MessageFormat.format("Address Line 1 [{0}] City [{1}] Postal Code [{2}]",
                addressLine1, cityTown, postalCode);
    }
}
