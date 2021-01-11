package behavioral.command.invokers;

import behavioral.command.commands.Command;

// Invoker: Remote control with 3 buttons
public class ThreeButtonRemoteControl {
  private final Command on;
  private final Command off;
  private final Command functionalKey;

  public ThreeButtonRemoteControl(Command on, Command off, Command functionalKey) {
    this.on = on;
    this.off = off;
    this.functionalKey = functionalKey;
  }

  public void pressOn() {
    on.execute();
  }

  public void pressOff() {
    off.execute();
  }

  public void functionalKeyClick() {
    functionalKey.execute();
  }
}
