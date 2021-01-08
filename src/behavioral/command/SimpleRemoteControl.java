package behavioral.command;

// Invoker: A Simple remote control with one button
class SimpleRemoteControl {
  Command slot;  // only one button

  public SimpleRemoteControl() {
  }

  public void setCommand(Command command) {
    slot = command;
  }

  public void buttonWasPressed() {
    slot.execute();
  }
}
