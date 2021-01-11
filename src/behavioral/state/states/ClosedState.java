package behavioral.state.states;

public class ClosedState implements GateState {
  public GateState enter() {
    System.out.println("The gate is closed. You cannot pass through it.");
    return new ClosedState();
  }

  public GateState pay() {
    System.out.println("Payment sent. It is going to be processed soon.");
    return new ProcessingPaymentState();
  }

  public GateState payOk() {
    System.out.println("Invalid action.");
    return new ClosedState();
  }

  public GateState payFailed() {
    System.out.println("Invalid action.");
    return new ClosedState();
  }

  @Override
  public String toString() {
    return "The gate is closed";
  }
}
