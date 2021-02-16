package uk.co.autotrader.sampleapp.services;

import uk.co.autotrader.sampleapp.domain.Order;
import uk.co.autotrader.sampleapp.domain.OrderItem;

public class CsvReportGenerator implements Reportable {
    final Order order;

    public CsvReportGenerator(final Order order) {
        this.order = order;
    }

    @Override
    public void generateReport() {
        System.out.println("Generating CSV REPORT for order = " + order.getOrderNumber());

        for (OrderItem item : order.getItems()) {
            System.out.println("CSV REPORT: item = " + item);
        }
    }
}
