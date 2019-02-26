package Composite.commands;

import Composite.entities.Garage;
import Composite.interfaces.Command;

public class GarageDoorOpenCommand implements Command {

    Garage garage;

    public GarageDoorOpenCommand(Garage garage) {
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
        garage.up();
    }

    @Override
    public void undo() {
        garage.down();
    }
}
