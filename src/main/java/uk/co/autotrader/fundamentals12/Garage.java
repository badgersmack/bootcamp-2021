package uk.co.autotrader.fundamentals12;

public class Garage {
    public static void main(String[] args) {

        /*  Variable 'ferrari' is of type VehicleOperations. The right hand side implements
            the VehicleOperations interface so it can be set as the implementation as
            it provides the capabilities of VehicleOperations ('has the ability').
         */
        VehicleOperations ferrari = new FerrariOperator();
        ferrari.accelerate();
        ferrari.stop();

        /*  can do same as 'ferrari' as it implements the same interface and variable 'fiat'
            is of type VehicleOperations.
         */
        VehicleOperations fiat = new Fiat();
        fiat.accelerate();
        fiat.stop();


        // can only be a FerrariOperator as that is the data type of the variable!
        FerrariOperator ferrariOperator = new FerrariOperator();



        /* can only be a IsFastable as that is the data type of the variable
           and only Ferrari can be as it implements IsFastable
         */
        IsFastable ferrariSuperFastCar = new FerrariOperator();
        ferrariSuperFastCar.goesLikeUsainBolt();
    }
}
