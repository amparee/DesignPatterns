package Adapter;

public class MallarDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("QUACK");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
