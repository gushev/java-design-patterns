package structural.facade;

import structural.facade.classes.ClassOne;
import structural.facade.classes.ClassThree;
import structural.facade.classes.ClassTwo;

public class Facade {
  public static String doSomething() {
    ClassThree classThree = new ClassThree("Some string");

    ClassTwo classTwo = new ClassTwo();
    classTwo.setClassThree(classThree);

    ClassOne classOne = new ClassOne(classTwo);

    return classOne.toString();
  }
}
