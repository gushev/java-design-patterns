package behavioral.strategy;

import behavioral.strategy.strategies.Strategy;

public class Context {
  private final Strategy strategy;

  public Context(Strategy strategy) {
    this.strategy = strategy;
  }

  public int executeStrategy() {
    return strategy.doOperation();
  }
}
