package behavioral.command;

// Concrete command
class AirConditionerOnWithTempCommand implements Command {
  AirConditioner ac;

  public AirConditionerOnWithTempCommand(AirConditioner ac) {
    this.ac = ac;
  }

  public void execute() {
    ac.on();
    ac.setTemperature(24);
  }
}
