package uk.co.autotrader.sampleapp.services;

import uk.co.autotrader.sampleapp.domain.Customer;

public class DPDLabelCreator implements LabelCreatable {
    private Customer customer;

    public DPDLabelCreator(final Customer customer) {
        this.customer = customer;
    }

    @Override
    public void createLabel() {
        System.out.println("DPD Label = " + customer);
    }
}
