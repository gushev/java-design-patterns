package behavioral.command.commands;

import behavioral.command.receivers.Light;

// This is a Command implementation
public class LightOnCommand implements Command {
  Light light;

  public LightOnCommand(Light light) {
    this.light = light;
  }

  public void execute() {
    light.on();
  }
}
