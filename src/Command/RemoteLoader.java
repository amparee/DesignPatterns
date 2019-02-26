package Command;

import Command.commands.*;
import Command.entities.Garage;
import Command.entities.Light;
import Command.entities.Stereo;

public class RemoteLoader {

    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        Light kitchenLight = new Light("Kitchen");
        Light bedroomLight = new Light("Bedroom");
        Garage garageDoor = new Garage("Garage Door");
        Stereo stereo = new Stereo("Stereo Car");

        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
        LightOnCommand bedroomLightOn = new LightOnCommand(bedroomLight);
        LightOffCommand bedroomLightOff = new LightOffCommand(bedroomLight);

        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
        GarageDoorOpenCommand garageDoorCloseCommand = new GarageDoorOpenCommand(garageDoor);

        StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);
        StereoOffWithCDCommand stereoOffWithCDCommand = new StereoOffWithCDCommand(stereo);

        remoteControl.setCommand(0, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(1, bedroomLightOn, bedroomLightOff);
        remoteControl.setCommand(2, garageDoorOpenCommand, garageDoorCloseCommand);
        remoteControl.setCommand(3, stereoOnWithCDCommand, stereoOffWithCDCommand);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        System.out.println("-------------UNDO---------");
        remoteControl.undoButtonWasPushed();
        System.out.println("-------------UNDO---------");
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);

        remoteControl.onButtonWasPushed(2);
        System.out.println("-------------UNDO---------");
        remoteControl.undoButtonWasPushed();
        System.out.println("-------------UNDO---------");

        remoteControl.offButtonWasPushed(2);

        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);
    }

}
