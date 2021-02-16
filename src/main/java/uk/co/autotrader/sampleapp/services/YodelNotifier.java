package uk.co.autotrader.sampleapp.services;

import uk.co.autotrader.sampleapp.domain.DispatchNotice;

public class YodelNotifier implements CourierNotifiable {

    private final DispatchNotice dispatchNotice;

    public YodelNotifier(final DispatchNotice dispatchNotice) {
        this.dispatchNotice = dispatchNotice;
    }

    @Override
    public void notifyCourier() {
        System.out.println("YODEL-EHI order = " + dispatchNotice);
    }
}
