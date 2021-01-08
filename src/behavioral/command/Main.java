package behavioral.command;

public class Main {
  public static void main(String[] args) {
    SimpleRemoteControl remote =
      new SimpleRemoteControl();
    Light light = new Light();
    AirConditioner ac = new AirConditioner();


    System.out.println("Example one:");

    remote.setCommand(new LightOnCommand(light));
    remote.buttonWasPressed();
    remote.setCommand(new AirConditionerOnWithTempCommand(ac));
    remote.buttonWasPressed();
    remote.setCommand(new AirConditionerOffCommand(ac));
    remote.buttonWasPressed();

    System.out.println("\nExample two: ");

    ThreeButtonRemoteControl threeButtonRemoteControl = new ThreeButtonRemoteControl(
      new LightOnCommand(light),
      new LightOffCommand(light),
      new AirConditionerOnWithTempCommand(ac)
    );

    threeButtonRemoteControl.pressOn();
    threeButtonRemoteControl.pressOff();
    threeButtonRemoteControl.functionalKeyClick();
  }
}
