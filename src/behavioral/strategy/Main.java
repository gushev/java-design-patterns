package behavioral.strategy;

public class Main {
  public static void main(String[] args) {
    Strategy operationAdd = new OperationAdd();
    Strategy operationSubtract = new OperationSubtract();
    Strategy operationMultiply = new OperationMultiply();

    Context contextWithAdd = new Context(operationAdd);
    Context contextWithSub = new Context(operationSubtract);
    Context contextWithMul = new Context(operationMultiply);

    System.out.println(contextWithAdd.executeStrategy());
    System.out.println(contextWithSub.executeStrategy());
    System.out.println(contextWithMul.executeStrategy());
  }
}
