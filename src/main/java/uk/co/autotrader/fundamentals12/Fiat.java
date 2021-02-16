package uk.co.autotrader.fundamentals12;

public class Fiat implements VehicleOperations {
    @Override
    public void accelerate() {
        System.out.println("Fiat ...... Vroom");
    }

    @Override
    public void stop() {
        System.out.println("Fiat ...... Stop");
    }
}
