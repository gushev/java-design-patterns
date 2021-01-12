package creational.builder.umlexample.builders;

import creational.builder.umlexample.products.Product;

public class ConcreteBuilder implements Builder {
  private String propertyOne;
  private Integer propertyTwo;

  @Override
  public void setPropertyOne(String propertyOne) {
    this.propertyOne = propertyOne;
  }

  @Override
  public void setPropertyTwo(Integer propertyTwo) {
    this.propertyTwo = propertyTwo;
  }

  public Product getResult() {
    return new Product(propertyOne, propertyTwo);
  }
}
