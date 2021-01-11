package creational.abstractfactory;

import creational.abstractfactory.factories.AbstractFactory;
import creational.abstractfactory.products.ProductA;
import creational.abstractfactory.products.ProductB;

public class Client {
  private final ProductA productA;
  private final ProductB productB;

  public Client (AbstractFactory factory) {
    productA = factory.createProductA();
    productB = factory.createProductB();
  }

  public void callAllProductOperations() {
    productA.operationA();
    productB.operationB();
  }
}
