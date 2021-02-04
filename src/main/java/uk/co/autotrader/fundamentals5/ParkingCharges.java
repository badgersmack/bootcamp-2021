package uk.co.autotrader.fundamentals5;

public class ParkingCharges {


    public static void main(String[] args) {
        int hourOfDay = 11;
        int datPrice = calculateNCPParkingCharge(hourOfDay);
        System.out.println("The cost of parking is " + datPrice);
    }

    public static int calculateNCPParkingCharge(int hourOfDay) {
        int cost = 0;
        if (hourOfDay >= 0 && hourOfDay < 5) {
            cost = 300;
        }
        else if (hourOfDay >= 5 && hourOfDay < 10) {
            cost = 350;
        }
        else if (hourOfDay >= 10 && hourOfDay < 15) {
            cost = 500;
        }
        else if (hourOfDay >= 15 && hourOfDay < 20) {
            cost = 700;
        }
        else if (hourOfDay >= 20) {
            cost = 400;
        }

        return cost;
    }
}
