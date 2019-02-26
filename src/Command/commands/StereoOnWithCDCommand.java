package Command.commands;

import Command.entities.Stereo;
import Command.interfaces.Command;

public class StereoOnWithCDCommand implements Command {

    Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume();
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
