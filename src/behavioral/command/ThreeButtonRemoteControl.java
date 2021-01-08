package behavioral.command;

// Invoker: Remote control with 3 buttons
class ThreeButtonRemoteControl {
  private Command on;
  private Command off;
  private Command functionalKey;

  public ThreeButtonRemoteControl(Command on,
                                  Command off,
                                  Command functionalKey) {
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
