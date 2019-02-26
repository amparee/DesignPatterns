package Command.entities;

public class Light {

    String name;

    public Light(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println("Light " + name + " on");
    }

    public void off() {
        System.out.println("Light " + name + " off");
    }
}
