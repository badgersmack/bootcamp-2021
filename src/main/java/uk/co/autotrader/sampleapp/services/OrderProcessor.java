package uk.co.autotrader.sampleapp.services;

import uk.co.autotrader.sampleapp.domain.CourierType;
import uk.co.autotrader.sampleapp.domain.Customer;
import uk.co.autotrader.sampleapp.domain.Order;
import uk.co.autotrader.sampleapp.domain.OrderItem;
import uk.co.autotrader.sampleapp.domain.OrderStatus;
import uk.co.autotrader.sampleapp.exceptions.PaymentDeclinedException;

import java.text.MessageFormat;
import java.util.Date;

public class OrderProcessor {

    public void processOrder(Order order) {
        System.out.println("Received order = " + order);

        order.setOrderStatus(OrderStatus.RECEIVED);

        checkPayment(order);

        packOrderItems(order);

        prepareOrderForDispatch(order);

        dispatchOrder(order);
    }

    private void packOrderItems(final Order order) {
        System.out.println("PACK ORDER ITEM(S) = " + order.getOrderNumber());

        order.setOrderStatus(OrderStatus.PROCESSING);

        for (OrderItem item : order.getItems()) {
            System.out.println(
                    MessageFormat.format("Located {0} {1} in warehouse.\n+ Adding to order [{2}] package",
                            item.getQuantity(), item.getName(), order.getOrderNumber()));
        }

        order.setOrderStatus(OrderStatus.PROCESSED);

        System.out.println("PACKED ORDER ITEM(S) = " + order.getOrderNumber());
    }

    private void prepareOrderForDispatch(final Order order) {
        System.out.println("PREPARING ORDER FOR DISPATCH = " + order.getOrderNumber());

        printDeliveryLabel(order.getCourierType(), order.getCustomer());

        generateReportsForOrder(order);

        System.out.println("PREPARED ORDER FOR DISPATCH = " + order.getOrderNumber());
    }

    private void dispatchOrder(final Order order) {
        System.out.println("DISPATCHING order = " + order.getOrderNumber());

        order.setOrderDispatchDate(new Date());
        order.setOrderStatus(OrderStatus.DISPATCHED);

        sendDispatchInformationToCourier(order);

        System.out.println("COMPLETED order = " + order);
    }

    private void sendDispatchInformationToCourier(final Order order) {
        System.out.println("NOTIFYING COURIER = " + order.getOrderNumber());

        final DispatchNotifier dispatchNotifier = new DispatchNotifier(order);

        dispatchNotifier.sendNotification();

        System.out.println("NOTIFIED COURIER = " + order.getOrderNumber());
    }

    private void generateReportsForOrder(final Order order) {
        ReportGenerator reportGenerator = new ReportGenerator();

        // MARKETING:
        reportGenerator.createReport(new PdfReportGenerator(order));

        // SOCIAL TEAM:
        reportGenerator.createReport(new HTMLReportGenerator(order));

        // FINANCE:
        reportGenerator.createReport(new CsvReportGenerator(order));
    }

    private void printDeliveryLabel(final CourierType courierType, final Customer customer) {
        System.out.println(MessageFormat.format(
                "Creating dispatch label for {0} {1} {2} ...\n", customer.getTitle(),
                customer.getFirstName(),
                customer.getLastName()));

        LabelCreatable labelCreatable = CourierLabelFactory.getLabelGenerator(courierType, customer);

        labelCreatable.createLabel();

        System.out.println(MessageFormat.format("LABEL customer: {0}\n", customer));
    }

    private void checkPayment(final Order order) {
        System.out.println("VERIFYING PAYMENT = " + order.getOrderNumber());

        if (order.getOrderStatus() == OrderStatus.PAYMENT_DECLINED) {
            throw new PaymentDeclinedException(
                    MessageFormat.format("Payment on order {0} declined", order.getOrderNumber()));
        }

        System.out.println("PAYMENT VERIFIED = " + order.getOrderNumber());
    }

}
