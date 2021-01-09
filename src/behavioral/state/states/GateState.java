package behavioral.state.states;

public interface GateState {
  GateState enter();
  GateState pay();
  GateState payOk();
  GateState payFailed();
}
