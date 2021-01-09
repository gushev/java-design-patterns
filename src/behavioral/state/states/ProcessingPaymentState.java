package behavioral.state.states;

public class ProcessingPaymentState implements GateState {
  public GateState enter() {
    System.out.println("Your payment is currently being processed.");
    return new ProcessingPaymentState();
  };

  public GateState pay() {
    System.out.println("Payment attempt rejected. Your payment is currently being processed.");
    return new ProcessingPaymentState();
  }

  public GateState payOk() {
    System.out.println("Payment confirmed. The gate is about to open.");
    return new OpenedState();
  };

  public GateState payFailed() {
    System.out.println("Payment declined. Please try again.");
    return new ClosedState();
  }

  @Override
  public String toString() {
    return "Waiting for payment to be processed";
  }
}
