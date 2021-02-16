package uk.co.autotrader.sampleapp.services;

import uk.co.autotrader.sampleapp.domain.Customer;

public class YodelLabelCreator implements LabelCreatable {
    private final Customer customer;

    public YodelLabelCreator(final Customer customer) {
        this.customer = customer;
    }

    @Override
    public void createLabel() {
        System.out.println("CREATE YODEL LABEL");
    }
}
