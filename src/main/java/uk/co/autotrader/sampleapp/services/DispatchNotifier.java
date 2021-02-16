package uk.co.autotrader.sampleapp.services;

import uk.co.autotrader.sampleapp.domain.CourierType;
import uk.co.autotrader.sampleapp.domain.DispatchNotice;
import uk.co.autotrader.sampleapp.domain.Order;

public class DispatchNotifier {
    private Order order;

    public DispatchNotifier(final Order order) {
        this.order = order;
    }

    public void sendNotification() {
        final DispatchNotice dispatchNotice = new DispatchNotice(order.getOrderNumber(),
                order.getItems(),
                order.getOrderDispatchDate(),
                order.getCustomer());

        CourierNotifiable courierNotifier = order.getCourierType() == CourierType.ROYAL_MAIL ?
                new RoyalMailNotifier(dispatchNotice) : new YodelNotifier(dispatchNotice);

        courierNotifier.notifyCourier();

        System.out.println("dispatchNotice = " + dispatchNotice);
    }
}
