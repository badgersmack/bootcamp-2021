package uk.co.autotrader.sampleapp.exceptions;

public class PaymentDeclinedException extends RuntimeException {
    public PaymentDeclinedException(final String message) {
        super(message);
    }
}
