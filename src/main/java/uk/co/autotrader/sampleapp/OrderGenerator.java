package uk.co.autotrader.sampleapp;

import uk.co.autotrader.sampleapp.domain.Address;
import uk.co.autotrader.sampleapp.domain.CourierType;
import uk.co.autotrader.sampleapp.domain.Customer;
import uk.co.autotrader.sampleapp.domain.Order;
import uk.co.autotrader.sampleapp.domain.OrderItem;
import uk.co.autotrader.sampleapp.services.OrderProcessor;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class OrderGenerator {
    public static void main(String[] args) {
        Order order = createNewOrder();
        System.out.println(MessageFormat.format("Created new order:\n{0}\n", order));

        submitOrder(order);
    }

    private static void submitOrder(final Order order) {
        OrderProcessor processor = new OrderProcessor();
        processor.processOrder(order);
    }

    private static Order createNewOrder() {
        final String orderNumber = UUID.randomUUID().toString();
        final Date orderCreatedDate = new Date();
        final List<OrderItem> orderItems = createOrderItems();
        final Customer customer = retrieveCustomer();
        final CourierType courierType = CourierType.ROYAL_MAIL;

        return new Order(orderNumber, orderCreatedDate, orderItems, customer, courierType);
    }

    private static Customer retrieveCustomer() {
        Address address = new Address("1st Street", "London", "L23 5TG");
        return new Customer("Mr.", "John", "Doe", "test@test.com", address);
    }

    private static List<OrderItem> createOrderItems() {
        List<OrderItem> orderItems = new ArrayList<>();

        orderItems.add(new OrderItem("Nike Trainers", 100.0d, 1));
        orderItems.add(new OrderItem("Adidas T-Shirt", 20.0d, 1));

        return orderItems;
    }
}
