package uk.co.autotrader.sampleapp.services;

import uk.co.autotrader.sampleapp.domain.Customer;

public class RoyalMailLabelCreator implements LabelCreatable {
    private final Customer customer;

    public RoyalMailLabelCreator(final Customer customer) {
        this.customer = customer;
    }

    @Override
    public void createLabel() {
        System.out.println("CREATE ROYAL MAIL LABEL");
    }
}
