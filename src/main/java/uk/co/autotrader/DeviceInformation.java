package uk.co.autotrader;

public class DeviceInformation {
    private double price;
    private String manufacturer;
    private boolean highEndDevice;
    private boolean isInsuranceActive;
    private boolean activeInsurance;

    public DeviceInformation() {
    }

    public DeviceInformation(final String manufacturer, final double price, final boolean isHighEndDevice,
                             final boolean isInsuranceActive) {

        this.manufacturer = manufacturer;
        this.price = price;
        this.highEndDevice = isHighEndDevice;
        this.isInsuranceActive = isInsuranceActive;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(final double price) {
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(final String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public boolean isHighEndDevice() {
        return highEndDevice;
    }

    public void setHighEndDevice(final boolean highEndDevice) {
        this.highEndDevice = highEndDevice;
    }

    public boolean isActiveInsurance() {
        return activeInsurance;
    }

    public void setActiveInsurance(final boolean activeInsurance) {
        this.activeInsurance = activeInsurance;
    }
}
