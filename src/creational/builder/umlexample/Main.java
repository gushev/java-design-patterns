package creational.builder.umlexample;

import creational.builder.umlexample.builders.Builder;
import creational.builder.umlexample.builders.ConcreteBuilder;
import creational.builder.umlexample.products.Product;

public class Main {
  public static void main(String[] args) {
    Builder builder = new ConcreteBuilder();

    Director.constructProductTypeA(builder);
    Product productA = builder.getResult();
    System.out.println(productA);

    Director.constructProductTypeB(builder);
    Product productB = builder.getResult();
    System.out.println(productB);
  }
}
