package uk.co.autotrader.fundamentals8;

import java.util.ArrayList;
import java.util.List;

public class CurrysShowRoom {
    public static void main(String[] args) {
        SkyRemote skyRemote = new SkyRemote();
        //skyRemote.turnOn();

        Alexa alexa = new Alexa();
        //alexa.turnOn();

        List<RemoteControlOperations> allDevices = new ArrayList<>();

        allDevices.add(skyRemote);
        allDevices.add(alexa);

        turnOnAllDevices(allDevices);
    }

    private static void turnOnAllDevices(List<RemoteControlOperations> remoteApplications) {
        for (RemoteControlOperations application : remoteApplications) {
            application.turnOn();
        }
    }
}
