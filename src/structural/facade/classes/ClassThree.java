package structural.facade.classes;

public class ClassThree {
  private final String property;

  public ClassThree(String property) {
    this.property = property;
  }

  public String getProperty() {
    return property;
  }

  @Override
  public String toString() {
    return "ClassThree{" +
      "property='" + property + '\'' +
      '}';
  }
}
