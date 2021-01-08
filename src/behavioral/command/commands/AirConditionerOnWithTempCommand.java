package behavioral.command.commands;

import behavioral.command.receivers.AirConditioner;

// Concrete command
public class AirConditionerOnWithTempCommand implements Command {
  AirConditioner ac;

  public AirConditionerOnWithTempCommand(AirConditioner ac) {
    this.ac = ac;
  }

  public void execute() {
    ac.on();
    ac.setTemperature(24);
  }
}
