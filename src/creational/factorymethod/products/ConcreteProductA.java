package creational.factorymethod.products;

public class ConcreteProductA implements Product {
  @Override
  public void doStuff() {
    System.out.println("Doing stuff in A");
  }
}
