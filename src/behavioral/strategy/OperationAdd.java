package behavioral.strategy;

public class OperationAdd implements Strategy {
  @Override
  public int doOperation() {
    System.out.println("Adding 3 + 3");
    return 3 + 3;
  }
}
