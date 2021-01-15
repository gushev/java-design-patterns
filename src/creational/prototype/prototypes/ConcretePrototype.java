package creational.prototype.prototypes;

public class ConcretePrototype implements Prototype {

  private String propertyOne;
  private Integer propertyTwo;
  private NestedPrototype nestedPrototype;

  public ConcretePrototype() {}

  public ConcretePrototype(ConcretePrototype copyFrom) {
    this.propertyOne = copyFrom.propertyOne;
    this.propertyTwo = copyFrom.propertyTwo;
    this.nestedPrototype = copyFrom.nestedPrototype;
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

  public NestedPrototype getNestedPrototype() {
    return nestedPrototype;
  }

  public void setNestedPrototype(NestedPrototype nestedPrototype) {
    this.nestedPrototype = nestedPrototype;
  }

  @Override
  public Prototype clone() {
    return new ConcretePrototype(this);
  }
}
