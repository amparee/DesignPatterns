package Command;

import Command.commands.GarageDoorOpenCommand;
import Command.commands.LightOnCommand;
import Command.entities.Garage;
import Command.entities.Light;

public class RemoteControlTest {

    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light("Comedor");
        Garage garage = new Garage("Casa");
        LightOnCommand lightOn = new LightOnCommand(light);
        GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garage);

        remote.setCommand(lightOn);
        remote.buttonWasPressed();
        remote.setCommand(garageOpen);
        remote.buttonWasPressed();

    }

}
