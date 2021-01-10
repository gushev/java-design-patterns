package creational.factorymethod.creators;

import creational.factorymethod.products.ConcreteProductA;
import creational.factorymethod.products.Product;

public class ConcreteCreatorA extends Creator {
  @Override
  public Product createProduct() {
    return new ConcreteProductA();
  }
}
