package behavioral.strategy;

public class OperationMultiply implements Strategy {
  @Override
  public int doOperation() {
    System.out.println("Multiplying 3 * 3");
    return 3 * 3;
  }
}
