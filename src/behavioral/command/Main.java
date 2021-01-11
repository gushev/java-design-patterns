package behavioral.command;

import behavioral.command.commands.AirConditionerOffCommand;
import behavioral.command.commands.AirConditionerOnWithTempCommand;
import behavioral.command.commands.LightOffCommand;
import behavioral.command.commands.LightOnCommand;
import behavioral.command.invokers.SimpleRemoteControl;
import behavioral.command.invokers.ThreeButtonRemoteControl;
import behavioral.command.receivers.AirConditioner;
import behavioral.command.receivers.Light;

public class Main {
  public static void main(String[] args) {
    SimpleRemoteControl remote = new SimpleRemoteControl();
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

    ThreeButtonRemoteControl threeButtonRemoteControl =
        new ThreeButtonRemoteControl(
            new LightOnCommand(light),
            new LightOffCommand(light),
            new AirConditionerOnWithTempCommand(ac));

    threeButtonRemoteControl.pressOn();
    threeButtonRemoteControl.pressOff();
    threeButtonRemoteControl.functionalKeyClick();
  }
}
