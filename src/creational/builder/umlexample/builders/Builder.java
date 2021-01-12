package creational.builder.umlexample.builders;

import creational.builder.umlexample.products.Product;

public interface Builder {
  void setPropertyOne(String propertyOne);
  void setPropertyTwo(Integer propertyTwo);
  Product getResult();
}
