package uk.co.autotrader.sampleapp.domain;

import java.text.MessageFormat;

public class Customer {
    private String title;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private Address address;

    public Customer(final String title, final String firstName, final String lastName,
                    final String emailAddress, final Address address) {
        this.title = title;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.address = address;
    }

    public String getTitle() {
        return title;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return MessageFormat.format("Title [{0}] First Name [{1}] Last Name [{2}] Email [{3}]\nAddress [{4}]",
                title, firstName, lastName, emailAddress, address);
    }
}
