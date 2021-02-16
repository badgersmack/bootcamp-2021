package uk.co.autotrader.sampleapp.domain;

import java.text.MessageFormat;
import java.util.Date;
import java.util.List;

public class DispatchNotice {
    private final String orderNumber;
    private final List<OrderItem> itemsOnOrder;
    private final Date orderDispatchDate;
    private final Customer customer;

    public DispatchNotice(final String orderNumber, final List<OrderItem> itemsOnOrder,
                          final Date orderDispatchDate, final Customer customer) {

        this.orderNumber = orderNumber;
        this.itemsOnOrder = itemsOnOrder;
        this.orderDispatchDate = orderDispatchDate;
        this.customer = customer;
    }



    @Override
    public String toString() {
        return MessageFormat.format("Order Number [{0}] Items [{1}] Dispatch Date [{2}] Customer [{3}]",
                orderNumber, itemsOnOrder, orderDispatchDate, customer);
    }
}
