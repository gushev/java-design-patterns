package structural.bridge;

import structural.bridge.abstractions.Circle;
import structural.bridge.abstractions.Shape;
import structural.bridge.abstractions.Square;
import structural.bridge.implemenations.Blue;
import structural.bridge.implemenations.Color;
import structural.bridge.implemenations.Green;
import structural.bridge.implemenations.Red;

public class Main {
  public static void main(String[] args) {
    Color blue = new Blue();
    Shape square = new Square(blue);

    Color red = new Red();
    Shape circle = new Circle(red);

    square.applyColor();
    circle.applyColor();

    Color green = new Green();
    Shape greenCircle = new Circle(green);
    greenCircle.applyColor();
  }
}
