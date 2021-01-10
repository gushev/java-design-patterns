package creational.factorymethod.creators;

import creational.factorymethod.products.Product;

public abstract class Creator {

  public void someOperation() {
    Product product = createProduct();
    product.doStuff();
  }

  public abstract Product createProduct();
}
