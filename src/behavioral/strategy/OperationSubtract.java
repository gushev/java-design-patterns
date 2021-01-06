package behavioral.strategy;

public class OperationSubtract implements Strategy {
  @Override
  public int doOperation() {
    System.out.println("Subtracting 3 - 3");
    return 3 - 3;
  }
}
