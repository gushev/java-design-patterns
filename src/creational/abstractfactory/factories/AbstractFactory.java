package creational.abstractfactory.factories;

import creational.abstractfactory.products.ProductA;
import creational.abstractfactory.products.ProductB;

public interface AbstractFactory {
  ProductA createProductA();
  ProductB createProductB();
}
