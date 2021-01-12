package creational.builder.umlexample;

import creational.builder.umlexample.builders.Builder;

public class Director {
  public static void constructProductTypeA(Builder builder) {
    builder.setPropertyOne("Value A");
    builder.setPropertyTwo(123);
  }

  public static void constructProductTypeB(Builder builder) {
    builder.setPropertyOne("Value B");
    builder.setPropertyTwo(321);
  }
}
