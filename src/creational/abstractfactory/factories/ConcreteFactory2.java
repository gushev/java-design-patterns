package creational.abstractfactory.factories;

import creational.abstractfactory.products.ConcreteProductA2;
import creational.abstractfactory.products.ConcreteProductB2;
import creational.abstractfactory.products.ProductA;
import creational.abstractfactory.products.ProductB;

public class ConcreteFactory2 implements AbstractFactory {
  @Override
  public ProductA createProductA() {
    return new ConcreteProductA2();
  }

  @Override
  public ProductB createProductB() {
    return new ConcreteProductB2();
  }
}
