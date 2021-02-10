package uk.co.autotrader.fundamentals7;

public class Car {
    String manufacturer;
    float engineSize;


    public Car(String manufacturer, float anEngineSize) {
        this.manufacturer = manufacturer;
        this.engineSize = anEngineSize;
    }

    public String toString() {
        StringBuilder output = new StringBuilder();
        output.append("Manufacturer: ");
        output.append(manufacturer);
        output.append(" Car engine ").append(engineSize);
        return output.toString();
    }
}
