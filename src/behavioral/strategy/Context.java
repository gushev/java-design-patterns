package behavioral.strategy;

public class Context {
  private Strategy strategy;

  public Context(Strategy strategy) {
    this.strategy = strategy;
  }

  public int executeStrategy() {
    return strategy.doOperation();
  }
}
