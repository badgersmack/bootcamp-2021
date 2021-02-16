package uk.co.autotrader.sampleapp.services;

import uk.co.autotrader.sampleapp.domain.Order;
import uk.co.autotrader.sampleapp.domain.OrderItem;

public class HTMLReportGenerator implements Reportable {
    final Order order;

    public HTMLReportGenerator(final Order order) {
        this.order = order;
    }

    @Override
    public void generateReport() {
        System.out.println("Generating HTML REPORT for order = " + order.getOrderNumber());

        for (OrderItem item : order.getItems()) {
            System.out.println("HTML REPORT: item = " + item);
        }
    }
}
