package uk.co.autotrader.fundamentals8;

public class Alexa implements RemoteControlOperations {
    public void turnOn() {
        System.out.println("Hello Alexa - ON");
    }

    public void turnOff() {
        System.out.println("Bye Alexa - OFF");
    }

    public void increaseVolume() {
        System.out.println("volume > ALEXXXAAAAA!!!!!!!!!!! ++++++");
    }

    public void lowerVolume() {
        System.out.println("volume > alexa ---------");
    }
}
