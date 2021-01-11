package behavioral.command.receivers;

// Another Receiver
public class AirConditioner {
  public void on() {
    System.out.println("AC is on");
  }

  public void off() {
    System.out.println("AC is off");
  }

  public void setTemperature(int volume) {
    System.out.println("Setting the temperature to: " + volume);
  }
}
