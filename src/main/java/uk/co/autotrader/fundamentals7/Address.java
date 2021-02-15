package uk.co.autotrader.fundamentals7;

public class Address {
    String firstLineAddress;
    String secondLineAddress;
    String cityTown;
    String postalCode;

    public Address(final String firstLineAddress, 
                   final String secondLineAddress, 
                   final String cityTown, 
                   final String postalCode) {
        this.firstLineAddress = firstLineAddress;
        this.secondLineAddress = secondLineAddress;
        this.cityTown = cityTown;
        this.postalCode = postalCode;
    }

    public String toString() {
        StringBuilder output = new StringBuilder();
        output.append(firstLineAddress);
        
        if (!secondLineAddress.equals("")) {
            output.append(", ").append(secondLineAddress);
        }
                
        output.append(", ").append(cityTown);
        output.append(", ").append(postalCode);
        
        return output.toString();
    }
}
