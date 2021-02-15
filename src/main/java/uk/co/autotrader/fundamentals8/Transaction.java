package uk.co.autotrader.fundamentals8;

import java.util.Date;

public class Transaction {
    private Date dateOfTransaction;
    private double amountTransferred;
    private String description;

    public Transaction(final Date dateOfTransaction, final double amountTransferred, final String description) {
        this.dateOfTransaction = dateOfTransaction;
        this.amountTransferred = amountTransferred;
        this.description = description;
    }
}
