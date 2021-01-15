package creational.prototype.prototypes;

public class JavaPrototype implements Cloneable {
  private String propertyOne;
  private Integer propertyTwo;

  public String getPropertyOne() {
    return propertyOne;
  }

  public void setPropertyOne(String propertyOne) {
    this.propertyOne = propertyOne;
  }

  public Integer getPropertyTwo() {
    return propertyTwo;
  }

  public void setPropertyTwo(Integer propertyTwo) {
    this.propertyTwo = propertyTwo;
  }

  @Override
  protected Object clone() {
    try {
      return super.clone();
    } catch (CloneNotSupportedException e) {
      throw new RuntimeException("Clone not supported");
    }
  }
}
