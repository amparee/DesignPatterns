package Composite.entities;

public class Stereo {

    String name;

    public Stereo(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void on() {
        System.out.println("Stereo on");
    }

    public void off() {
        System.out.println("Stereo off");
    }

    public void setCD() {
        System.out.println("Stereo Set CD");
    }

    public void setVolume() {

        System.out.println("Set volume on Stereo");

    }


}
