package uk.co.autotrader.sampleapp.domain;

import java.text.MessageFormat;
import java.util.Date;
import java.util.List;

public class Order {
    private String orderNumber;
    private Date orderCreatedDate;
    private Date orderDispatchDate;
    private List<OrderItem> items;
    private OrderStatus orderStatus;
    private Customer customer;
    private CourierType courierType;

    public Order(final String orderNumber, final Date orderCreatedDate,
                 List<OrderItem> items, final Customer customer,
                 final CourierType courierType) {
        this.orderNumber = orderNumber;
        this.orderCreatedDate = orderCreatedDate;
        this.items = items;
        this.customer = customer;
        this.courierType = courierType;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setOrderDispatchDate(final Date orderDispatchDate) {
        this.orderDispatchDate = orderDispatchDate;
    }

    public void setOrderStatus(final OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public Date getOrderCreatedDate() {
        return orderCreatedDate;
    }

    public Date getOrderDispatchDate() {
        return orderDispatchDate;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public CourierType getCourierType() {
        return courierType;
    }

    @Override
    public String toString() {
        return MessageFormat.format("Order Number [{0}]\nCreated Date [{1}]\n" +
                        "Dispatch Date [{2}]\nItems {3}\nStatus [{4}]\nCustomer [{5}]\nCourier [{6}]",
                orderNumber, orderCreatedDate, orderDispatchDate, items, orderStatus, customer, courierType);
    }
}
