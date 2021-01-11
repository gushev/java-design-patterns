package creational.abstractfactory.factories;

import creational.abstractfactory.products.ConcreteProductA1;
import creational.abstractfactory.products.ConcreteProductB1;
import creational.abstractfactory.products.ProductA;
import creational.abstractfactory.products.ProductB;

public class ConcreteFactory1 implements AbstractFactory {
  @Override
  public ProductA createProductA() {
    return new ConcreteProductA1();
  }

  @Override
  public ProductB createProductB() {
    return new ConcreteProductB1();
  }
}
