package creational.factorymethod;

import creational.factorymethod.creators.ConcreteCreatorA;
import creational.factorymethod.creators.ConcreteCreatorB;
import creational.factorymethod.creators.Creator;

public class Main {
  public static void main(String[] args) {
    Creator creatorA = getCreator("type A");
    Creator creatorB = getCreator("type B");

    creatorA.someOperation();
    creatorB.someOperation();
  }

  static Creator getCreator(String type) {
    return switch (type) {
      case "type A" -> new ConcreteCreatorA();
      case "type B" -> new ConcreteCreatorB();
      default -> throw new IllegalStateException("Unexpected value: " + type);
    };
  }
}
