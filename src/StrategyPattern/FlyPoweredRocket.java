package StrategyPattern;

public class FlyPoweredRocket implements FlyBehavior {


    @Override
    public void fly() {
        System.out.println("Fly with rockets");
    }
}
