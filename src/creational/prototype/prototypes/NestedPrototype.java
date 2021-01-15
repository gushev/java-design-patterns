package creational.prototype.prototypes;

public class NestedPrototype implements Prototype {
  private String propertyOne;
  private Integer propertyTwo;

  public NestedPrototype() {}

  public NestedPrototype(NestedPrototype copyFrom) {
    this.propertyOne = copyFrom.propertyOne;
    this.propertyTwo = copyFrom.propertyTwo;
  }

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
  public Prototype clone() {
    return new NestedPrototype(this);
  }
}
