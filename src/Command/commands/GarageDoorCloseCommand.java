package Command.commands;

import Command.entities.Garage;
import Command.interfaces.Command;

public class GarageDoorCloseCommand implements Command {

    Garage garage;

    public GarageDoorCloseCommand(Garage garage) {
        this.garage = garage;
    }

    public Garage getGarage() {
        return garage;
    }

    public void setGarage(Garage garage) {
        this.garage = garage;
    }

    @Override
    public void execute() {
        garage.down();
    }

    @Override
    public void undo() {
        garage.up();
    }
}
