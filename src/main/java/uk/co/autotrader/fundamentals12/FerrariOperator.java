package uk.co.autotrader.fundamentals12;

public class FerrariOperator implements VehicleOperations, IsFastable {

    @Override
    public void accelerate() {
        System.out.println("Ferrari .....Vroom");
    }

    @Override
    public void stop() {
        System.out.println("Ferrari .....stop");
    }

    @Override
    public void goesLikeUsainBolt() {
        System.out.println("I am a fast car!!!!!");
    }
}
