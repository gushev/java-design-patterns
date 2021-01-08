package behavioral.command.commands;

import behavioral.command.receivers.Light;

// This is a Command implementation
public class LightOffCommand implements Command {
  Light light;

  public LightOffCommand(Light light) {
    this.light = light;
  }

  public void execute() {
    light.off();
  }
}
