package creational.builder.umlexample.products;

public class Product {
  private final String propertyOne;
  private final Integer propertyTwo;

  public Product (String propertyOne, Integer propertyTwo) {
    this.propertyOne = propertyOne;
    this.propertyTwo = propertyTwo;
  }

  @Override
  public String toString() {
    return "Product{" +
      "propertyOne='" + propertyOne + '\'' +
      ", propertyTwo=" + propertyTwo +
      '}';
  }
}
