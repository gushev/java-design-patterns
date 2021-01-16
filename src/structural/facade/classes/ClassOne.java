package structural.facade.classes;

public class ClassOne {
  private final ClassTwo classTwo;

  public ClassOne(ClassTwo classTwo) {
    this.classTwo = classTwo;
  }

  public ClassTwo getClassTwo() {
    return classTwo;
  }

  @Override
  public String toString() {
    return "ClassOne{" +
      "classTwo=" + classTwo +
      '}';
  }
}
