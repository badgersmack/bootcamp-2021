package uk.co.autotrader.sampleapp.services;

import uk.co.autotrader.sampleapp.domain.CourierType;
import uk.co.autotrader.sampleapp.domain.Customer;

public class CourierLabelFactory {
    public static LabelCreatable getLabelGenerator(final CourierType courierType,
                                                   final Customer customer) {
        LabelCreatable labelCreatable = null;

        if (courierType == CourierType.ROYAL_MAIL) {
            labelCreatable = new RoyalMailLabelCreator(customer);
        }
        else if (courierType == CourierType.YODEL) {
            labelCreatable = new YodelLabelCreator(customer);
        }
        else {
            labelCreatable = new DPDLabelCreator(customer);
        }

        return labelCreatable;
    }
}
