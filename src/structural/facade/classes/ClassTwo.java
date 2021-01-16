package structural.facade.classes;

public class ClassTwo {
  private ClassThree classThree;

  public ClassThree getClassThree() {
    return classThree;
  }

  public void setClassThree(ClassThree classThree) {
    this.classThree = classThree;
  }

  @Override
  public String toString() {
    return "ClassTwo{" +
      "classThree=" + classThree +
      '}';
  }
}
