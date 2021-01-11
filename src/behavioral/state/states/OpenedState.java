package behavioral.state.states;

public class OpenedState implements GateState {

  public GateState enter() {
    System.out.println("Going through an open gate. Gate is going to close now.");
    return new ClosedState();
  }

  public GateState pay() {
    System.out.println("Payment attempt rejected. The gate is already open.");
    return new OpenedState();
  }

  public GateState payOk() {
    System.out.println("Payment attempt rejected. The gate is already open.");
    return new OpenedState();
  }

  public GateState payFailed() {
    System.out.println("Payment attempt rejected. The gate is already open.");
    return new OpenedState();
  }

  @Override
  public String toString() {
    return "The gate is open";
  }
}
