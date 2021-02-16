package uk.co.autotrader.sampleapp.domain;

import java.text.MessageFormat;

public class OrderItem {
    private String name;
    private double unitPrice;
    private int quantity;

    public OrderItem(final String name, final double unitPrice, final int quantity) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getName() {
        return name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    @Override
    public String toString() {
        return MessageFormat.format("Name [{0}] Price [{1}]", name, unitPrice);
    }
}
