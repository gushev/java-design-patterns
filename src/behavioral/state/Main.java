package behavioral.state;

public class Main {
  public static void main(String[] args) {
      Gate gate = new Gate();
      gate.printState();
      gate.enter();
      gate.pay();
      gate.printState();
      gate.payFailed();
      gate.printState();
      gate.pay();
      gate.payOk();
      gate.pay();
      gate.printState();
      gate.enter();
  }
}
