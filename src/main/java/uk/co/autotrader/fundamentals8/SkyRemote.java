package uk.co.autotrader.fundamentals8;

public class SkyRemote implements RemoteControlOperations {

    public void turnOn() {
        System.out.println("Sky ON");
    }

    public void turnOff() {
        System.out.println("Sky Off");
    }

    public void increaseVolume() {
        System.out.println("Sky Volume Up");
    }

    public void lowerVolume() {
        System.out.println("Sky Volume Down");
    }
}
