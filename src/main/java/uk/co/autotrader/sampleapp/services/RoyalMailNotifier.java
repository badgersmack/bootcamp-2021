package uk.co.autotrader.sampleapp.services;

import uk.co.autotrader.sampleapp.domain.DispatchNotice;

public class RoyalMailNotifier implements CourierNotifiable {

    private final DispatchNotice dispatchNotice;

    public RoyalMailNotifier(final DispatchNotice dispatchNotice) {
        this.dispatchNotice = dispatchNotice;
    }

    @Override
    public void notifyCourier() {
        System.out.println("ROYAL MAIL order = " + dispatchNotice);
    }
}
