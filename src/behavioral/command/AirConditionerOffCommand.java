package behavioral.command;

// Concrete command
class AirConditionerOffCommand implements Command {
  AirConditioner ac;

  public AirConditionerOffCommand(AirConditioner ac) {
    this.ac = ac;
  }

  public void execute() {
    ac.off();
  }
}
