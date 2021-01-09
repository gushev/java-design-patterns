package behavioral.state;

import behavioral.state.states.ClosedState;
import behavioral.state.states.GateState;

public class Gate {

  private GateState state = new ClosedState();

  public void enter() {
    state = state.enter();
  }

  public void pay() {
    state = state.pay();
  }

  public void payOk() {
    state = state.payOk();
  }

  public void payFailed() {
    state = state.payFailed();
  }

  public void printState() {
    System.out.println(this.state);
  }
}
