package structural.bridge.abstractions;

import structural.bridge.implemenations.Color;

public class Circle extends Shape {

  public Circle(Color color) {
    super(color);
  }

  @Override
  public  void applyColor() {
    color.applyColor();
  }
}
