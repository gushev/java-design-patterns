package behavioral.strategy;

import behavioral.strategy.strategies.OperationAdd;
import behavioral.strategy.strategies.OperationMultiply;
import behavioral.strategy.strategies.OperationSubtract;

public class Main {
  public static void main(String[] args) {
    Context contextWithAdd = new Context(new OperationAdd());
    Context contextWithSub = new Context(new OperationSubtract());
    Context contextWithMul = new Context(new OperationMultiply());

    System.out.println(contextWithAdd.executeStrategy());
    System.out.println(contextWithSub.executeStrategy());
    System.out.println(contextWithMul.executeStrategy());
  }
}
