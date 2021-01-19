package structural.bridge.abstractions;

import structural.bridge.implemenations.Color;

public abstract class Shape {
  protected Color color;

  public Shape(Color color) {
    this.color = color;
  }

  public abstract void applyColor();
}
