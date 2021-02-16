package uk.co.autotrader.sampleapp.services;

import uk.co.autotrader.sampleapp.domain.Order;
import uk.co.autotrader.sampleapp.domain.OrderItem;

public class PdfReportGenerator implements Reportable {
    final Order order;

    public PdfReportGenerator(final Order order) {
        this.order = order;
    }

    @Override
    public void generateReport() {
        System.out.println("Generating PDF REPORT for order = " + order.getOrderNumber());

        for (OrderItem item : order.getItems()) {
            System.out.println("PDF REPORT: item = " + item);
        }
    }
}
