package behavioral.command.invokers;

import behavioral.command.commands.Command;

// Invoker: A Simple remote control with one button
public class SimpleRemoteControl {
  Command slot; // only one button

  public SimpleRemoteControl() {}

  public void setCommand(Command command) {
    slot = command;
  }

  public void buttonWasPressed() {
    slot.execute();
  }
}
