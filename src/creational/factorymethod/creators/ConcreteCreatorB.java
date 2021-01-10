package creational.factorymethod.creators;

import creational.factorymethod.products.ConcreteProductB;
import creational.factorymethod.products.Product;

public class ConcreteCreatorB extends Creator {
  @Override
  public Product createProduct() {
    return new ConcreteProductB();
  }
}
