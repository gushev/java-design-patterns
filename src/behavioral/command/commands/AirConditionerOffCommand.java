package behavioral.command.commands;

import behavioral.command.receivers.AirConditioner;

// Concrete command
public class AirConditionerOffCommand implements Command {
  AirConditioner ac;

  public AirConditionerOffCommand(AirConditioner ac) {
    this.ac = ac;
  }

  public void execute() {
    ac.off();
  }
}
