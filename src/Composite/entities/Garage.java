package Composite.entities;

public class Garage {

    private String name;

    public Garage(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void up() {

        System.out.println("Garage " + name + " up");

    }

    public void down() {
        System.out.println("Garage " + name + " down");
    }

    public void stop() {
        System.out.println("Garage " + name + " stop");
    }

    public void lightOn() {
        System.out.println("Garage " + name + " light on");
    }

    public void lightOff() {
        System.out.println("Garage " + name + " light off");
    }


}
