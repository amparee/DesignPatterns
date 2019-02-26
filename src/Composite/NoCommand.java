package Composite;

import Composite.interfaces.Command;

public class NoCommand implements Command {

    public NoCommand() {}

    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}
